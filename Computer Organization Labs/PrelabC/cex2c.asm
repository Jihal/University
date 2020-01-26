//Precision of code is dependant on how long the code runs (stop to see answer)
//Check answer in FLP Regs (F5)
fc1: 	DF 1.0	//Define 1
fc2: 	DF 2.0	//Define 2
fc3: 	DF 64	//Define number you want the square root of 
	
	//Below loads defined numbers
	fld f1, fc1(x0)	
	fld f2, fc3(x0)
	fld f3, fc2(x0)

	fadd.d f4, f31, f1 //Add 1 to f4
	fadd.d f5, f31, f2	//Add number to f5
	flt.d x1, f2, f1	//Check if number is less then 1
	bne x1, x0, loop2	//If the number is less then 1 go to loop2

//loop1 runs if number defined is greater then 1
loop1:	fsub.d	f6, f5, f4 //Store sub of number and 1 in f6
	fdiv.d  f6, f6, f3	//Store div of f6 and num 
	fadd.d 	f6, f6, f4	//Adds 1 to f6
	fmul.d 	f7, f6, f6	//stores f6^2 in f7
	flt.d  	x1, f7, f2 //If f7 is less then num
	beq	x1, x0, g1 //go to g1 
	fadd.d	f4, f6, f31 
	beq	x0, x0, loop1

g1:	fadd.d	f5, f6, f31
	beq	x0, x0, loop1

loop2:	fsub.d	f6, f5, f4
	fdiv.d	f6, f6, f3
	fmul.d 	f7, f6, f6
	flt.d	x1, f7, f2
	beq	x1, x0, g2
	fadd.d 	f5, f6, f31
	beq	x0, x0, loop2

g2:	fadd.d	f4, f6, f31
	beq	x0, x0, loop2
