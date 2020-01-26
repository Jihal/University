module labL;

reg signed [31:0] a, b, expect; 
reg cin, ok;
wire [31:0] z; 
wire cout;

yAdder adder(z, cout, a, b, cin);

initial
  begin
    repeat(10)
    begin
        a = $random;
        b = $random;
        cin = 0;
        expect = a + b + cin;
        ok = 0;
        #1;
        if (expect === z) ok = 1;
        else
            $display("FAIL: a=%b \n b=%b \n cin=%b \n z=%b \n expect=%b", a, b, cin, z, expect);
    end
    $finish;
  end
endmodule