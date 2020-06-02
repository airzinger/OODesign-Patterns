package domain;

public class Employee {

	private String name;
	private int age;
	private int employeeID;
	private boolean isWorking = true;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}

	public String toString() {
		return "Employee: "
				+ " Name: "+name
				+ " Age: "+age
				+ " EmployeeID: "+employeeID
				+ " Working: "+isWorking;			
	}
	
	private Employee(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.employeeID = builder.employeeID;
	}
	
	public static class Builder{
		
		private String name;
		private int age;
		private int employeeID;
		
		private static int COUNTER=0;
		
		public Builder setName(String name) {
			this.name=name;
			return this;
		}
		public Builder setAge(int age) {
			this.age=age;
			return this;
		}
		public Builder setEmployeeID() {
			this.employeeID = ++COUNTER;
			return this;
		}
		
		public Employee build() {
			return new Employee(this);
		}
	}
}
