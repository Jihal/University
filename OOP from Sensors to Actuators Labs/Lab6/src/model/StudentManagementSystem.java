package model;

public class StudentManagementSystem {

	public Student [] students= new Student[100];
	int nos=0; //# of students
	
	public StudentManagementSystem() {
		
	}
	
	// Getter (gets studennts) 
public Student [] getStudents() { // Creating method 
	
	Student[] returnS = new Student[nos];
	for(int i=0; i < nos; i++) {
		returnS[i]= students[i];
	}
	return returnS;
}

public String getDescription() {
	
	String desc= "";
	
	if(nos==0) {
		desc= "Student management system currently stores no students.";
	}
	else {
		desc+= "Student management system currently stores " + nos + " students:\n";
	
	    for(int i=0; i < this.nos; i++) {
	    	desc+= "\n"+students[i].getDescription()+ "\n";
	    }
	}
	return desc;
}

 


public void addStudent(Student s) {
	this.students[nos]=s;
	nos++;
	
}
	
public int getMarks(String name, String title) {
	
	for(int i=0; i < nos; i++) {
		if(this.students[i].name == name) {
			return this.students[i].getMarks(title);
		}
		
	}

	return -1;
}


public void addStudent(String name) {
	
	this.students[nos]= new Student(name);
	nos++;
}


public void addCourse(String name, CourseRecord cr) {
	for(int i=0; i < nos; i++) {
		if(this.students[i].name==name) {
			this.students[i].addCourse(cr);
			
		}
		
	}
	
}


public double getGPA(String name) {
	for(int i=0; i < nos; i++) {
		if(this.students[i].name==name) {
			
			return this.students[i].getGPA();
			
		}
	}
	return 0;
}




public void setMarks(String name, String title, int marks) {
	
	for(int i=0; i < nos; i++) {
		if(this.students[i].name==name) {
			students[i].setMarks(title, marks);
		}
		
	}
	
}







	

	
	
}
