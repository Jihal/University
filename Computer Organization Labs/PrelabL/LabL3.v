module labL;

reg [31:0] a, b, expect;
reg c;
wire [31:0] z;
yMux #(.SIZE(32)) mux(z, a, b, c);
integer i, j, k;

initial
begin
	repeat (500)
        begin
          a = $random;
          b = $random;
          c = $random % 2;
          #1
		expect = c ? b : a; //If c then b else a 
		#1; 
		if (z !== expect)
            $display("FAIL: a=%b \n      b=%b \n      c=%b \n      z=%b \n      expect=%b", a, b, c, z, expect);
		end

   $finish;
end
endmodule