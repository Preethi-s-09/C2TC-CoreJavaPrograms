package dayfive.Practice;

public class Student extends Person{
	private int uid;
	private String sname;
	private String coursename;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int pid,String name,String city,int uid,String coursename) {
		super(pid,name,city);
		this.uid = uid;
		this.coursename = coursename;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	@Override
	public String toString() {
		return "Student [Student id:"+super.getPid()+" Student name "+super.getName()+" Student city "+super.getCity()+" uid=" + uid + ", coursename= " + coursename + "]";
	}

}
