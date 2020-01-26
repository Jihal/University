module labM ;
reg [31:0] address, memIn;
reg clk, read, write;
wire [31:0]  memOut;
mem data(memOut, address, memIn, clk, read, write);

initial 
begin
   address = 16'h28; write = 0; read = 1;

   repeat(11)
   begin 
        #1;
        //R Type
        if(memOut[6:0] == 7'h33)
            $display("%0d %0d %0d %0d %0d %0d", memOut[31:25], memOut[24:20], memOut[19:15], memOut[14:12], memOut[11:7], memOut[6:0]);
        //UJ Type 
        else if(memOut[6:0] == 7'h6F)
            $display("%0d %0d %0d", memOut[31:12], memOut[11:7], memOut[6:0]);
        //I Type 
        else if (memOut[6:0] == 7'h3 || memOut[6:0] == 7'h13)
            $display("%0d %0d %0d %0d %0d", memOut[31:20], memOut[19:15], memOut[14:12], memOut[11:7], memOut[6:0]);
        //S Type
        else if (memOut[6:0] == 7'h23)
            $display("%0d %0d %0d %0d %0d %0d", memOut[31:25], memOut[24:20], memOut[19:15], memOut[14:12], memOut[11:7], memOut[6:0]);
        //SB Type
        else if (memOut[6:0] == 7'h63)
            $display("%0d %0d %0d %0d %0d %0d", memOut[31:25], memOut[24:20], memOut[19:15], memOut[14:12], memOut[11:7], memOut[6:0]);
        address = address + 4;
    end
 $finish;
end
endmodule