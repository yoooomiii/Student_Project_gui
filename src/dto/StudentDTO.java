package dto;

public class StudentDTO {

	private String name = null;
	private String grade = null;
	private String classnum = null;
	private String address = null;
	private int point = 0;
	private int penalty = 0;
	
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getPenalty() {
		return penalty;
	}
	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getClassnum() {
		return classnum;
	}
	public void setClassnum(String classnum) {
		this.classnum = classnum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}