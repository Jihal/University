s0: 	DC "Find all divisors.\0"
s1: 	DC "Enter i:\0"
s2:	DC "Divisors:\0"

	addi x5, x0, s0
	ecall x0, x5, 4
	addi x5, x0, s1
	ecall x1, x5, 4
	ecall x6, x0, 5
	addi x5, x0, s2
	ecall x0, x5, 4
	addi x7, x0, 1
	addi x29, x6, 1

loop:	rem x28, x6, x7
	bne x28, x0, end 
	ecall x0, x7, 0

end:	addi x7, x7, 1
	bne x7, x29, loop

