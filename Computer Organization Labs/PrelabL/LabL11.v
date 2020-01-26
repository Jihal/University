module labL;
reg signed [31:0] a, b, tmp, zero;
reg [31:0] expect;
reg [2:0] op;
wire ex;
wire [31:0] z;
reg ok, flag;

yAlu alu(z, ex, a, b, op);

initial
begin
   repeat (10)
     begin
	a = $random;
	b = $random;
	tmp = $random % 2;
	flag = $value$plusargs("op=%d", op);
	
	if (tmp === 0)
            b = a;
	
	// The oracle: compute "expect" based on "op"
	if (op === 3'b000)
            expect = a & b;
        else if (op === 3'b001)
            expect = a | b;
        else if (op === 3'b010)
            expect = a + b;
        else if (op === 3'b110)
            expect = a - b;
        else if (op === 3'b111)
            expect = (a < b) ? 1 : 0;
	
	#1; // wait for z

	// Compare the circuit's output with "expect"
	// and set "ok" accordingly

	// Display ok and the various signals
	
        ok = (expect === z) ? 1 : 0;
	zero = (expect === 0) ? 1 : 0;

        /* if (expect === z)
            ok = 1;
        else 
            ok = 0; */

        if (ok)
            $display("PASS: a=%b b=%b op=%d z=%b expect=%b ok=%d zero=%b", a, b, op, z, expect, ok, zero);
        else 
            $display("FAIL: a=%b b=%b op=%d z=%b expect=%b ok=%d zero=%b", a, b, op, z, expect, ok, zero);
     end   
   $finish;
end
endmodule