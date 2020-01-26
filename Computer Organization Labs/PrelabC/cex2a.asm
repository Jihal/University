src1:	DF 1.21, 5.85, -7.3, 23.1, -5.55
src2:	DF 3.14, -2.1, 44.2, 11.0, -7.77

addi x6, x0, 0

loop:	fld f1, src1(x6)
	fld f2, src2(x6)
	fmul.d f3, f1, f2
	fadd.d f4, f4, f3
	fsd f4, dst(x6)
	addi x6, x6, 8
	beq x0, x0, loop

dst: 	DM 1


