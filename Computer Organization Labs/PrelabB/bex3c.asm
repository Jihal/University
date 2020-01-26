dir:	DC	"John"
	DC 	"11111"
	DC 	"Nick"
	DC 	"22222"
	DC 	"Sara"
	DC 	"11111"
	DC 	"Nick"
	DC 	"33333"
	DD 	0

s1: DC "Enter a phone or a name\nto search for:"	;required text
s2: DC " " ;makes a space

addi x30, x0, s1 ;adds the string to x30
ld x31, s2(x0) ;laods the space in x31 (less then string) 

loop1:	ecall 	x0, x30, 4 ;Displays the required text to prompt user
	ecall 	x7, x0, 8 ;Prompt to enter name or number
	add 	x6, x0, x0 ;Counter to increment loop

loop2:	ld 	x5, dir(x6) ;Loads the directory into x5 start with the counter x6 at 0
	beq 	x0, x5, end ;Checks if the directory is at 0 (last #) in which case move to end
	bne 	x5, x7, skip ;If the current directory location does not equal the user's input skip to move on
	andi 	x29, x6, 0xff0 ;Masks out up till last bit
	ld 	x28, dir(x29) ;Loads name or number in directory at the masked bit
	ecall 	x28, x28, 3 ;Reads the string in the directory
	ecall 	x31, x31, 3 ;Adds the space to the string
	addi 	x29, x29, 8 ;Increments the directory location in order to get the number
	ld 	x28, dir(x29) ;Loads the number into x28
	ecall	x0, x28, 3	;Prints the number

skip:	addi x6, x6, 8 ;Increments overall directory counter 
	beq x0, x0, loop2 ;Reruns loop2 to go through the directory

end:	beq x0, x0, loop1 ;Reruns loop1 to countinue the program

	