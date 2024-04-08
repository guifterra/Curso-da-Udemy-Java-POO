package entities;

public class Person {
	
	private String name;
	private int    age;
	private double height;
	
	public Person() {
		
		setPerson( "Default" , 18 , 1.70 );
	}
	
	public Person( String name, int age , double height ) {
		
		setPerson( "Default" , 18 , 1.70 );
		setPerson( name , age , height );
	}
	
	public void setPerson( String name, int age , double height ) {
		
		setName(name);
		setAge(age);
		setHeight(height);
	}
	
	public void setName( String name ) {
		
		if( name != null && name.length() > 0)
			this.name = name;
	}
	
	public void setAge( int age ) {
		
		if( age >= 0 )
			this.age = age;
	}
	
	public void setHeight( double height ) {
		
		if( height > 0.0 && height <= 3.0 )
			this.height = height;
	}
	
	public String getName() {
		
		return name;
	}
	
	public int getAge() {
		
		return age;
	}
	
	public double getHeight() {
		
		return height;
	}
}
