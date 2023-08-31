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
	
}

class TestStudent1{
	
	public static void main(String args[]){
		
		// Creating object-1
		Student s1=new Student();
		
		// After assigning value to instance variables
		s1.setDetail(5,"Raju");
		s1.printDetail();
		
		System.out.println("=====================*==============");
		
		// Creating object-2
		Student s2=new Student();
		// After assigning value to instance variables
		s2.setDetail(6,"Ram");
		s2.printDetail();
		
	}
}