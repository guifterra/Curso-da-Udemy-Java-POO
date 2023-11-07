package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double sumGrade() {
		
		return grade1 + grade2 + grade3;
	}
	
	public String situation() {
		
		if((sumGrade() >= 60.0)) {
			return "PASS";
		}else {
			return "FAIL \n MISSING " + String.format("%.1f", (60.0 - sumGrade())) + " POINTS";
		}
	}
}
