s0:	DC	"Evaluates expressions in post-fix notation.\0"
s1:	DC	"Expression:\0"
s2:	DC	"Answer:\0"
a:	DC	"+"
s:	DC	"-"
m:	DC	"*"
d:	DC	"/"

STACK: 	EQU 	0x100000
	lui	sp, STACK>>12
	addi	x5, x0, s0
	ecall	x0, x5, 4
	addi 	x5, x0, s1
	ecall	x1, x5, 4
	ecall 	x6, x0, 8
	ld	x10, a(x0)
	ld	x11, s(x0)
	ld 	x12, m(x0)
	ld	x13, d(x0)

loop:	beq 	x6, x0, end
	andi	x7, x6, 0x0ff
	beq	x7, x10, ad
	beq	x7, x11, su
	beq	x7, x12, mu	
	beq	x7, x13, di
	andi 	x6, x6, 0xf00
	srli	x6, x6, 8
	addi	x7, x7, -48
	sd 	x7, 0(sp)
	addi	sp, sp, -8	
	beq 	x0, x0, loop

ad:	addi	sp, sp, 8
	ld	x28, 0(sp)
	addi	sp, sp, 8
	ld	x29, 0(sp)
	add	x30, x28, x29
	sd	x30, 0(sp)
	addi	sp, sp, -8
	andi 	x6, x6, 0xf00
	srli	x6, x6, 8
	beq 	x0, x0, loop
	
su:	addi	sp, sp, 8
	ld	x28, 0(sp)
	addi	sp, sp, 8
	ld	x29, 0(sp)
	sub	x30, x29, x28
	sd	x30, 0(sp)
	addi	sp, sp, -8
	andi 	x6, x6, 0xf00
	srli	x6, x6, 8
	beq 	x0, x0, loop

mu:	addi	sp, sp, 8
	ld	x28, 0(sp)
	addi	sp, sp, 8
	ld	x29, 0(sp)
	mul	x30, x28, x29
	sd	x30, 0(sp)
	addi	sp, sp, -8
	andi 	x6, x6, 0xf00
	srli	x6, x6, 8
	beq 	x0, x0, loop

di:	addi	sp, sp, 8
	ld	x28, 0(sp)
	addi	sp, sp, 8
	ld	x29, 0(sp)
	div	x30, x29, x28
	sd	x30, 0(sp)
	addi	sp, sp, -8
	andi 	x6, x6, 0xf00
	srli	x6, x6, 8
	beq 	x0, x0, loop

end:	addi 	sp, sp, 8
	ld	x31, 0(sp)
	addi	x5, x0, s2
	ecall 	x1, x5, 4
	ecall	x0, x31, 0
	ebreak 	x0, x0, 0