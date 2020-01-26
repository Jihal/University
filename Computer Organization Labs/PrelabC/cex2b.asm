fc1:	DF 1.0

	fld f1, fc1(x0)
	addi x6, x0, 9 //Enter n here
	addi x7, x0, 1
	fld f2, fc1(x0)

loop:	blt x6, x7, end
	addi x5, x0, 1
	addi x28, x0, 1

loop1:	blt x7, x5, skip
	mul x28, x28, x5
	addi x5, x5, 1
	beq x0, x0, loop1

skip:	fcvt.d.l f3, x28
	fdiv.d f4, f1, f3
	fadd.d f2, f2, f4
	addi x7, x7, 1
	beq x0, x0, loop

end:	ebreak x0, x0, 0
