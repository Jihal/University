src:	DD -1, 55, -3, 7, 0
	add x6, x0, x0

ld x5, src(x0)

loop:	ld x7, src(x6)
	beq x7, x0, end
	blt x7, x5, else
	ld x5, src(x6)

else:  addi x6, x6, 8
	beq x0, x0, loop

end: 	ebreak x0, x0, 0

