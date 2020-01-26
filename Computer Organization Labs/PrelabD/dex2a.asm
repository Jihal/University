str1: DC  "sampled text\0"  
STACK: EQU 0x100000 ;stack  
lui sp, STACK>>12  
addi a2, x0, str1+6 ;chaddr  
addi a3, x0, 6 ;#ch  
jal x1, delch  
addi x6, x0, str1 ;output  
ecall x0, x6, 4  
ebreak x0, x0, 0 ;finish

delch1: lb x5, 0(a2)  ; actuaaly removes the char
loop1: beq x5, x0, end1  
lb x5, 1(a2)  
sb x5, 0(a2)   ; saves zero in chara adress
addi a2, a2, 1 
jal x0, loop1 
end1: jalr x0, 0(x1) ;return  

delch: addi x7,x1,0 ;push   ; calles deltch 1 for a2 and a3
addi x8,s0,0 ;push  
addi x9,s1,0 ;push  
addi sp, sp, -24 ;push 
addi s0, a2, 0  
addi s1, a3, 0  
bge x0, s1, end2 
loop2: jal x1, delch1  
addi a2, s0, 0  
addi s1, s1, -1  
bne s1, x0, loop2 
end2: addi sp, sp, 24 ;pop  
addi  x1, x7,0 ;pop 
addi  s0, x8,0 ;pop 
addi s1, x9,0 ;pop 
jalr x0, 0(x1) ;return