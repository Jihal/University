s0: 	DC "sum(1..n-1) Enter n:\0"
s1: 	DC "sum(1..\0"
s2:	DC ")=\0"
s3:	DC "(n*(n-1))/2=\0"

	addi x5, x0, s0
	ecall x1, x5, 4
	ecall x6, x0, 5
	addi x28, x6, -1

loop:	addi x29, x29, 1
	add x7, x7, x29
	bne x28, x29, loop

	addi x5, x0, s1
	ecall x1, x5, 4
	ecall x1, x28, 0
	addi x5, x0, s2
	ecall x1, x5, 4
	ecall x0, x7, 0
	addi x5, x0, 2
	mul x31, x6, x28
	div x31, x31, x5
	addi x5, x0, s3
	ecall x1, x5, 4
	ecall x0, x31, 0
	

