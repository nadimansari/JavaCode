class Student{
	int id;
	String name;
	
	void printDetail(){
		System.out.println("Roll Number : "+this.id+" | Name : "+this.name);
		
	}
	
	void setDetail(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	// Default Constructer - it will be always availbe if write or not
	Student(){
		System.out.println("Created...");
	}
	
	Student(int id,String name){
		
		this.id=id;
		this.name=name;
	}
	
}

class TestStudent2{
	
	public static void main(String args[]){
		
		// Creating object-1
		Student s1=new Student(5,"Raju");
		s1.printDetail();
		
		System.out.println("===================================");
		
		// Creating object-2
		Student s2=new Student(6,"Ram");
		s2.printDetail();
		
	}
}