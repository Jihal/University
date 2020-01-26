module labL;
reg [31:0] a, b;
reg [31:0] expect;
reg [2:0] op;
wire ex;
wire [31:0] z;
reg ok, flag;
yAlu mine(z, ex, a, b, op);

initial
begin
    repeat (10)
    begin
        a = $random;
        b = $random;
        flag = $value$plusargs("op=%d", op);
        if (op === 3'b000) 
                expect = a & b;
             else if (op === 3'b001) 
                expect = a | b;
             else if (op === 3'b010) 
                expect = a + b;
             else if (op === 3'b110) 
                expect = a - b;

             #1;
            ok = (expect === z) ? 1 : 0;

             if (ok)
               $display("PASS:\n  a=%b\n b=%b\n op=%d\n z=%b\n expect=%b ok%d", a, b, op, z, expect, ok);
             else
               $display("FAIL:\n  a=%b\n b=%b\n op=%d\n z=%b\n expect=%b ok%d", a, b, op, z, expect, ok);
        end
        $finish;
end
endmodule