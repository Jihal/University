module labK;

reg a, b, c;
wire z;
integer i, j;

not my_not(aLower, c);
and and_a(and_1, a, aLower);
and	and_b(and_2, b, c);
or	my_z(z, lower_1, lower_2);
assign lower_1 = and_1, lower_2 = and_2;

initial
begin
	a = 1; b = 0; c = 0;
   #1 $display("a=%b b=%b c=%b z=%b", a, b, c, z);
   $finish;
end
endmodule