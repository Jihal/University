s1:	DC 	"Enter an unsigned integer: \0"
s2:	DC 	"Binary representation: \0"

STACK: 	EQU 	0x100000
	lui 	sp, STACK>>12
	addi	x5, x0, s1
	ecall 	x1, x5, 4 
	ecall 	x5, x0, 5 
	addi 	x30, x0, 2
	addi 	x28, x0, s2
	ecall 	x1, x28, 4
	addi 	x7, x0, 0

loop:	rem	x6, x5, x30
	sd 	x6, 0(sp)
	addi	sp, sp, -8
	addi 	x7, x7, 1
	div	x5, x5, x30 
	beq	x5, x0, end
	beq	x0, x0, loop

end:	addi	sp, sp, 8
	ld 	x6, 0(sp) 
	ecall 	x1, x6, 0
	addi 	x7, x7, -1
	bne	x0, x7, end
	ebreak 	x0, x0, 0
