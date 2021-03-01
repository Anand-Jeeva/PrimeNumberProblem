class Employee{
	public void process(String name,int year,String sal,String address){
		System.out.print(" "+name);
		System.out.print(" "+year);
		System.out.print(" "+sal);
		System.out.print(" "+address);
		System.out.println();
		
	
	}
	public static void main(String ars[]){
		Employee obj1=new Employee();
		obj1.process("Robert",1994,"64C","WallsStreet");
		Employee obj2=new Employee();
		obj2.process("Sam",2000,"68D","WallsStreet");
		Employee obj3=new Employee();
		obj3.process("John",1999,"26B","WallsStreet");
	}
}