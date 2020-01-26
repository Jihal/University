A:	DD	0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 //set up array with 4 elements

addi t2, x0, A //Initialize t2 to A
add t1, x0, x0 //Sum of t2s at individual indexes
ld t0, 0(t2) // t0 = A[0]
add t1, t1, t0 //Adds sum = sum + t0
ld t0, 8(t2) // loads A[1]
add t1, t1, t0 //adds A[1] to t1
ld t0, 16(t2) //loads A[2]
add t1, t1, t0 
ld t0, 24(t2) 
add t1, t1, t0 