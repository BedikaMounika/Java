package Check;
import java.time.LocalDate;



public class Employee {

	public int emptype;
	public int empno;
	public String name;
	public String designation;
	public LocalDate dob;
	public LocalDate joiningDate;
	public String Email;
	Address Address;
	
	public Employee(int emptype,int empno, String name, String designation, LocalDate dob1, LocalDate joiningDate1, String email, Address Address) {
		super();
		this.emptype = emptype;
		this.empno = empno;
		this.name = name;
		this.designation = designation;
		this.dob = dob1;
		this.joiningDate = joiningDate1;
		this.Email = email;
		this.Address = Address;
	}
	
	public int getEmpType() {
		return emptype;
	}
	
	public void setEmpType(int emptype) {
		this.emptype = emptype;
	}
	public int getEmpno() {
		return empno;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public LocalDate getJoiningDate() {
		return joiningDate;
	}


	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		this.Email = email;
	}
	
	public Address getAdress() {
		return Address;
	}
	
	
	public void setAddress(Address Address) {
		this.Address = Address;
	}
}
