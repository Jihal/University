package model;

/*
 * Each student may be registered in up to 5 courses.
 */
public class Student {
public	String name;
public	final int MAX_NUM_COURSES = 5;
	// each element (e.g., courses[0], courses[1], ..., courses[courses.length -1]) in the array stores
	// the address of some CourseRecord object.
	public CourseRecord[] courses;
	// 1. value of noc represents the number of CourseRecord objects stored in the courses array.
	// 2. value of noc denotes where in the array 'courses' is the next CourseRecord object to be stored.
	public int noc;
	
	public Student(String name) {
		this.name = name;
		this.courses= new CourseRecord[MAX_NUM_COURSES];
		this.noc=0; // so far zero courses registered; the next course is to be stored at index 0
		
	}
// Version 1: Given a CourseRecord to be stored directly into the courses array.
	public void addCourse(CourseRecord c) {
		this.courses[this.noc] = c;
		this.noc ++;
	}
	// Version 2: Given a title which is sufficient to create a new CourseRecord object.
	public void addCourse(String title) {
		CourseRecord c= new CourseRecord(title);
		this.addCourse(c);
//		this.courses[this.noc] = c;
//		this.noc ++;
	}
	/*
	 * Given the title of course, return the marks of that course.
	 * If the course does not exist, return -1
	 */
	
	public int getMarks(String title) {
		int marks=-1;
		
		int index= this.indexOf(title);
		if(index >= 0) {
			
			CourseRecord c = this.courses[index];
			marks= c.getMarks();
			
			marks= this.courses[index].getMarks();
	}
		// boolean found = false; // it is not the case we found the course
		// for(int i =0; i < this.noc; i++){
		//   if(this.courses[i]/getTitle().equals(title)){
		// found =true;
		// marks= this.courses[i].getMarks();
		// }
		// }
		//if(!found){
		// marks= -1;
		//}	
	
		return marks;
}

		
	

	/*
	 * Given the title of course, set the marks of that course.
	 * If the course does not exist, do nothing.
	 */
	public void setMarks(String title, int marks) {
	int index= this.indexOf(title);
	if(index >=0) {
		// CourseRecord c= this.courses[index];
		//c.setMarks(marks);
		this.courses[index].setMarks(marks);
	}
	// boolean found = false;
	// for (int i=0; i < this.noc && !found; i++){
	// if(int i=0; i < this.noc && ! found; i++){
	// if(this.courses[i].getTitle().equals(title)){
	// found =true;
	//this.courses[i].setMarks(marks);
	//}
	//}
	//}

	
	}
			 

// Helper method reused by getMarks and setMarks
// Given the title of course, return the index of the corresponding course object. 
// If the title does not exists, return -1.
	int indexOf(String title) {
		int index= -1;
		
		boolean found = false;
		for(int i =0; i < this.noc && !found; i++) {
			if(this.courses[i].getTitle().contentEquals(title)) {
				found = true;
				index = i;
			}
			
		}
			
			return index;
	}
	
	public double getGPA() {
		double gpa= 0.0;
		double gp= 0.0;
		for(int i=0; i < this.noc; i++) {
			// CourseRecord c= this.courses[i];
			// String lg= c.getLetterGrade();
			String lg= this.courses[i].getLetterGrade();
			if(lg.equals("A+")) {
				gp +=9;
			}
			else if(lg.equals("A")) {
				gp += 8;
			}
			else if(lg.equals("B")) {
				gp += 7;
			}
			else if(lg.equals("C")) {
				gp += 6;
			}
			else if(lg.equals("D")) {
				gp += 5;
			}
			else { // F
				gp += 0;
			}
		}
		if(noc!=0) {
			gpa = gp/this.noc;
		}
		else {
			gpa = 0;
		}
		return gpa;
	}
	
	
	
	
	public String getDescription() {
		String result= "";
		// Version 1: print out the addresses of courses array elements (which might be null)
//		result += "Student "+this.name + " has registered " + this.noc + " courses:";
//		for(int i =0; i <this.courses.length; i++) {
//			result += this.courses[i] + "\n";
//		}
		
		// Version 2: print out the description of courses array elements (by calling getDescription from CourseRecord)
		// This version may cause NullPointerException,
		// because the value of noc may not refer to 
//		result += "Student "+this.name + " has registered " + this.noc + " courses:\n";
//		for(int i =0; i <this.courses.length; i++) {
//			result += this.courses[i].getDescription() + "\n";
//		}
	
		// Version 3: 
	    result += "Student "+ this.name + " has registered "+ this.noc + " courses (with GPA " +this.getGPA()+ "):\n";
	    for(int i =0; i <this.noc; i++) {
			result += this.courses[i].getDescription() + "\n";
		}
	
		return result;
	  
	}
	
}
