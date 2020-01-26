s0: 	DC "Find if prime.\0"
s1: 	DC "Enter i:\0"
s2:	DC "not prime\0"
s3:	DC "prime\0"

	addi x5, x0, s0
	ecall x0, x5, 4
	addi x5, x0, s1
	ecall x1, x5, 4
	ecall x6, x0, 5
	addi x7, x0, 1
	addi x29, x6, 1
	addi x30, x0, 0
	addi x31, x0, 16

loop:	rem x28, x6, x7
	bne x28, x0, end 
	sd x7, dst(x30)
	addi x30, x30, 8

end:	addi x7, x7, 1
	bne x7, x29, loop
	addi x5, x0, s3
	beq x30, x31, print
	addi x5, x0, s2
	bne x30, x31, print

print:	ecall x0, x5, 4
	ebreak x0, x0, 0

dst:	DM 1


