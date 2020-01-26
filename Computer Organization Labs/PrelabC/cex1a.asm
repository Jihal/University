s0: 	DC "n! Enter n:\0"
s1: 	DC "!=\0"

	addi x5, x0, s0
	ecall x1, x5, 4
	ecall x6, x0, 5
	add x8, x6, x0
	add x7, x6, x0

loop:	beq x7, x0, end
	addi x7, x7, -1
	beq x7, x0, end
	mul x6, x6, x7
	beq x0, x0, loop

end:	addi x5, x0, s1
	ecall x1, x8, 0
	ecall x1, x5, 4
	ecall x0, x6, 0

