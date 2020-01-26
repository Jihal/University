src1:	DD 1, 5, -7, 23, -5
src2:	DD 3, -2, 4, 11, -7

addi x6, x0, 0
addi x7, x0, 0

loop:	ld x28, src1(x6)
	ld x29, src2(x7)
	add x5, x28, x29
	sd x5, dst(x6)
	addi x6, x6, 8
	addi x7, x7, 8 
	beq x0, x0, loop

dst: 	DM 1


