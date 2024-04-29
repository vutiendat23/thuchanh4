package LapTrinhHuongDoiTuong;

public class Student {
	private String name;
	private String id;
	private String birth;
	private String gender;
	private String address;
	
	public Student(String id, String name, String birth, 
			String address, String gender) {
		this.name = name;
		this.id = id;
		this.birth = birth;
		this.address = address;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return "Student[ID = " + this.id + " , Name = " + this.name + ", Birth = " + this.birth + " , Gender = " + this.gender + " , Address = " + this.address;
	}
	
}
