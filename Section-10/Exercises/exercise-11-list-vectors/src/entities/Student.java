package entities;

public class Student {
	
	private String name;
	private double[] grades = new double[2];
	
	public Student() {
		
		double[] g = { 0.0 , 0.0 };
		setStudent( "Default" ,  g);
	}
	
	public Student( String name , double[] grades ) {
		
		double[] g = { 0.0 , 0.0 };
		setStudent( "Default" ,  g);
		setStudent( name ,  grades);
		
	}
	
	public void setStudent( String name , double[] grades ) {
		
		setName(name);
		setGrades(grades);
	}
	
	public void setName( String name ) {
		
		this.name = name;
	}
	
	public void setGrades( double[] grades ) {
		
		this.grades = grades;
	}
	
	public String getName() {
		
		return name;
	}
	
	public double[] getGrades() {
		
		return grades;
	}
}
