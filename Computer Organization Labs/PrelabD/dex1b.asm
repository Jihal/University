prompt1: DC "Please enter a word: "
prompt2: DC "Is Palindrome? "
prompt3: DC "true"
prompt4: DC "false"


addi x5, x0, prompt1 
ecall x5, x5, 4 //Calls p1
ecall x6, x6, 8 //Input string
add x28, x0, x6 //Add string to x28
addi sp, x0, stack //Creates stack in x2 (Defines memory 1 in x2)

push: 	beq x6, x0, end //Checks if all letters have been passed
	andi x7, x6, 0x0ff // Masks out everything except last 2 and stores it in x7 (one character)
	andi x6, x6, 0xf00 // Changes last 2 to 0 
	srli x6, x6, 8 //Shifts x6 by 8 (reduces last character)
	sd x7, 0(sp) //Stores letter in x7 (right) 
	addi x2, x2, 8 //Increments Stack (Increments because defined memory)
	beq x0, x0, push //Reruns loop
	
//From this point x6 is 0 and empty	 
end:
	add x29, x0, x2 // adds stack into x29
	addi x2, x0, stack //Defines memory 1 (equi to sp sp -8) adds slot to stack? 

pop: 	beq x2, x29, end1 //if both stacks are equal move to end1
	ld x5, 0(sp) //Loads top letter into x5 (sp is x2) top should be empty? 
	add x6, x6, x5 //Adds letter to x6 adds 
	slli x6, x6, 8 //Shifts x6 to left (<----) That way
	addi x2, x2, 8 //Increments stack 
	beq x0, x0, pop //Goes back to pop

end1:
	srli x6, x6, 8 //Shifts x6 by 2 to the right
	
	//Calls 2nd one
	addi x5, x0, prompt2
	ecall x5, x5, 4
	
	bne x6, x28, else	//If x6 and x28 are not equal goes to else to print false
		ld x5, prompt3(x0) //Prints true 
		ecall x5, x5, 3
		ebreak x0, x0, 0
	else:
		ld x5, prompt4(x0)
		ecall x5, x5, 3


stack: DM 1
