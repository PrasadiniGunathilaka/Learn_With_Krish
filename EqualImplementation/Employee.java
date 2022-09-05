public class Employee{

	private int empId;
	private String empCode;
	private String name;
	private int age;
	private String nic;
	private String phone;
	private String address;


	public Employee(int empId, String empCode, String name, int age, String nic, String phone, String address){


		this.empId = empId;
		this.empCode = empCode;
		this.name = name;
		this.age = age;
		this.nic = nic;
		this.phone = phone;
		this.address = address;


}

public void setEmpId(int empId){
	this.empId = empId;
}

public int getEmpId(){
	return empId;
}

public void setEmpCode(String empCode){
	this.empCode = empCode;
}

public String getEmpCode(){
	return empCode;
}
public void setName(String name){
	this.name = name;
}
public String geName(){
	return name;
}

public void setAge(int age){
	this.age = age;
}

public int getAge(){
	return age;
}

public void setNic(String nic){
	this.nic = nic;
}

public String getNic(){
	return nic;
}

public void setPhone(String phone){
	this.phone = phone;
}
public String getPhone(){
	return phone;
}
public void setAddress(String address){
	this.address = address;
}

public String getAddress(){
	return address;
}

public boolean equals(Object obj){

Employee emp = (Employee) obj;

if(emp.getEmpId() == this.empId && emp.getEmpCode() == this.empCode){

	return true;
}else 

	return false;


}


}

class  Application {


	public static void main (String args[]){


		Employee emp1 = new Employee(001, "E001", "Ruvini", 25, "965439677V", "0776565912", "Negombo");

		Employee emp2 = new Employee(002, "E002", "Prasadini", 26, "965439677V", "0776565956", "Colombo");

		Employee emp3 = new Employee(001, "E001", "Ruvi", 26, "965439688V", "0776565765", "Kurunegala");




		boolean result1 = emp1.equals(emp2);
		System.out.println("emp1 equals emp2  :  " +result1);


		emp2.setEmpId(001);
		emp2.setEmpCode("E001");


		boolean result2 = emp1.equals(emp2);
		System.out.println("emp1 equals emp2  :  "+result2);

		
		boolean result3 = emp1.equals(emp3);
		System.out.println("emp1 equals emp3  :  "+result3);


	}


}










