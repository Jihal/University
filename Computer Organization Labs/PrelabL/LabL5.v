module labL;

reg a, b, cin;
wire z, cOut;
reg [1:0] expect;
yAdder1 adder(z, cOut, a, b, cin);
integer i, j, k;

initial
begin
	for (i = 0; i < 2; i = i + 1)
	begin
		for (j = 0; j < 2; j = j + 1)
		begin
			for (k = 0; k < 2; k = k + 1)
			begin
				a = i; b = j; cin = k;
				expect = a + b + cin;
				#1; 
				if (expect[1] !== cOut || expect[0] !== z)
                   $display("FAIL: a=%b b=%b cin=%b z=%b (expected %b) cOut=%b (expected %b)", a, b, cin, z, expect[0], cOut, expect[1]);
			end
		end
	end

   $finish;
end
endmodule