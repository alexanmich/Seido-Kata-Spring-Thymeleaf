package seido.kata;

public class Kata {
	
	private String name;
	
	private String grade;
	
	public Kata(String name, String grade){
		this.name = name;
		this.grade = grade;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGrade() {
		return this.grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
