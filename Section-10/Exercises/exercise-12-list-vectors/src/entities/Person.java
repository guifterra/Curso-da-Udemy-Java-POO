package entities;

public class Person {
	
	private double height;
	private char   gender;
	
	public Person() {
		
		setPerson( 1.70 , 'M');
	}
	
	public Person( double height , char gender ) {
		
		setPerson( 1.70 , 'M' );
		setPerson( height , gender );
	}
	
	public void setPerson( double height , char gender ) {
		
		setHeight(height);
		setGender(gender);
	}
	
	public void setHeight( double height ) {
		
		this.height = height;
	}
	
	public void setGender( char gender ) {
		
		this.gender = gender;
	}
	
	public double getHeight() {
		
		return height;
	}
	
	public char getGender() {
		
		return gender;
	}
}
