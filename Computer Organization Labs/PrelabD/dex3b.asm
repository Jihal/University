a: DC 	"input n: "
b: DC	"output: " 
addi sp,sp,0
ld x31,a(x0)
ld x30,b(x0)
ecall x1,x31,3
ecall x5,x0,5				// n = x5
addi x6,x0,0				// a = 0
addi x7,x0,1				// b = 1
addi x11,x0,1
fib: 	beq x5,x11,returnb
	beq x5,x0,returna
	add x8,x0,x7
	add x7,x6,x7
	add x6,x0,x8
	addi x5,x5,-1
	jal x0,fib
	
returnb: 		ecall x0,x7,0
ebreak x0,x0,0
returna: 		ecall x0,x6,0
ebreak x0,x0,0
