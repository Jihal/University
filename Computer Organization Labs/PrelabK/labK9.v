module labK;

reg a, b, c;
reg [1:0] expect;
wire z, cOut, lastA, b_xor_a, b_and_a;
integer i, j, k;

xor b_a_xor(b_xor_a, b, a);
and b_a_and(b_and_a, b, a);
xor my_z(z, c, b_xor_a);
and last_and(lastA, b_xor_a, c);
or	c_out(cOut, lastA, b_and_a);
 
initial
begin
	for (i = 0; i < 2; i = i + 1)
	begin
		for (j = 0; j < 2; j = j + 1)
		begin
			for (k = 0; k < 2; k = k + 1)
			begin
				a = i; b = j; c = k;
				expect = i + j + k;
				#1; 
				if (expect[0] === z && expect[1] === cOut)
					#1 $display("PASS: a=%b b=%b c=%b z=%b cOut=%b", a, b, c, cOut, z);
				else
					#1 $display("FAIL: a=%b b=%b c=%b z=%b cOut=%b", a, b, c, cOut, z);
			end
		end
	end

   $finish;
end
endmodule