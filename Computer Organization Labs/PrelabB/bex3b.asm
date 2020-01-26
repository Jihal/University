s1:	DC	"Enter an integer value: \n\0"
s2: 	DC 	"Enter a memory address: \n\0"
	
loop:	addi 	x28, x0, s1
	ecall 	x30, x28, 4
	ecall 	x6, x0, 5
	addi 	x29, x0, s2
	ecall 	x31, x29, 4
	ecall 	x7, x0, 5
	sd 	x6, 0(x7)
	beq	x0, x0, loop


