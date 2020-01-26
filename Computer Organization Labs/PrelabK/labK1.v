module labK;
reg [31:0] x; // a 32-bit register
reg one, two, three;
initial
begin
	$display("time = %5d, x = %b", $time, x);
	x = 32'hffff0000;
	$display("time = %5d, x = %b", $time, x);
	x = x + 2;
	$display("time = %5d, x = %b", $time, x);
	one = &x; // and reduction
	two = x[1:0]; // part-select
	three = {one, two}; // concatenate
	$display("one = %b, two = %b, three = %b", one, two, three);
	$finish;
end
endmodule