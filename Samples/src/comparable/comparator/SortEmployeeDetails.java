package comparable.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

	class Employee{
		
		int empId;
		String empName;
		double empSal;
		int empAge;
		
		Employee(){
			
		}
		
		Employee(int empId, String empName, double d, int empAge){
			this.empId = empId;
			this.empName = empName;
			this.empSal = d;
			this.empAge = empAge;
		}

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public double getEmpSal() {
			return empSal;
		}

		public void setEmpSal(float empSal) {
			this.empSal = empSal;
		}

		public int getEmpAge() {
			return empAge;
		}

		public void setEmpAge(int empAge) {
			this.empAge = empAge;
		}
	
		
		public String toString(){
			return "id = " +this.empId + ", Name = "+ this.empName + ",Sal = "+ this.empSal;
		}
		
	
		void sortEmployee(Employee[] emp){
			Arrays.sort(emp);
		}
	
	public static void main(String args[]){
		
		Employee[] empArr = new Employee[3];
		Employee e1 = new Employee(1, "nnn", 6234.88, 88);
		Employee e2 = new Employee(1, "xxx", 6234.44, 29);
		Employee e3 = new Employee(4, "aaa", 3454.44, 26);
		
		
		
	}
}
