module labL;

reg a, b, c, expect;
wire z;
yMux1 mux(z, a, b, c);
integer i, j, k;

initial
begin
	for (i = 0; i < 2; i = i + 1)
	begin
		for (j = 0; j < 2; j = j + 1)
		begin
			for (k = 0; k < 2; k = k + 1)
			begin
				a = i; b = j; c = k;
				expect = c ? b : a; //If c then b else a 
				#1; 
				if (expect === z)
					#1 $display("PASS: a=%b b=%b c=%b z=%b", a, b, c, z);
				else
					#1 $display("FAIL: a=%b b=%b c=%b z=%b", a, b, c, z);
			end
		end
	end

   $finish;
end
endmodule