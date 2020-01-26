module labK;

reg a, b; // reg without size means 1-bit

//wire tmp, z;
//not my_not(tmp, b);
//and my_and(z, a, tmp);

wire notOutput, lowerInput, tmp, z;
not my_not(notOutput, b); //Saves the not of b into notOuput
and my_and(z, a, lowerInput); //Gets the and of a and b and places it in z
assign lowerInput = notOutput; //Since notOutput is equal to lowInput (since it is the only thing there)

initial
begin
	a = 1; b = 1; //Sets a to 1 and b to 1
	#1 $display("a=%b b=%b z=%b", a, b, z); //Add #1 so z has time to compute
	$finish;
end
endmodule