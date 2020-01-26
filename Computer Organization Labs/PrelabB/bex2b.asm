src:	DD 121, 33, -5, 242, -45, -12, 0
	add x6, x0, x0

ld x5, src(x0)

loop:	ld x7, src(x6)
	beq x7, x0, end
	bge x7, x5, else
	ld x5, src(x6)
	add x28, x0, x6 

else:  addi x6, x6, 8
	beq x0, x0, loop

end: 	ld x29, src(x0)
	ld x30, src(x28)
	sd x30, 0(x0)
	sd x29, 0(x28)
	ebreak x0, x0, 0


