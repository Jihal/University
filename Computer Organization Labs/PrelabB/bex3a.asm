s1:	DC "What is your name?"
c1: 	DC "Hello "
c2:	DC "!" 

addi x30, x0, s1
ecall x0, x30, 4
ecall x5, x0, 8

addi x31, x0, c1
ecall x5, x31, 4
ecall x5, x5, 3

addi x6, x0, c2
ecall x0, x6, 4
