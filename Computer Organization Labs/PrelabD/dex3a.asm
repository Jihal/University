num1: DD 69
num2: DD 3

ld x5, num1(x0)
ld x6, num2(x0)
add x28, x28, x5
add x29, x29, x6
jal x1, gcd


ebreak x0,x0, 0

gcd: beq x29, x0, base
	
	add x30, x0, x28
	add x28, x0, x29
	rem x29, x30, x28
	beq x0, x0, gcd 
	

base: ecall x28, x28, 0
	jalr x0, 0(x1)