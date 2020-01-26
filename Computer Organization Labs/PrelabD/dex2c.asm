string1: DC "sample text "
DM 2
string2: DC "appended text"


addi x12, x0, string1

jal x1, lench
addi x13, x0, string2
jal x1, append

addi x5, x5, string1
ecall x5, x5, 4


ebreak x0, x0, 0
append: lb x5, 0(x13)
	addi x12, x12, -1
appender: beq x5, x0, return
	lb x5, 0(x13)
	sb x5, 0(x12)
	addi x12, x12, 1
	addi x13, x13, 1
	beq x0, x0, appender

lench: lb x5, 0(x12)

lenFinder:beq x5, x0, return
	  lb x5, 0(x12)
	  addi x6, x6, 1
	  addi x12, x12, 1		
	beq x0, x0, lenFinder
return: jalr x0, 0(x1)

