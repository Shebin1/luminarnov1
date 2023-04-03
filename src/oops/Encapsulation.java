package oops;
class Encap{
	private int empid;
	private String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
	Encap en=new Encap();
	en.setEmpid(101);//set values in set method time
	en.setEmpname("sarath");//set values in set method time
	System.out.println(en.getEmpid());
	System.out.println(en.getEmpname());
	}

}
