package entities;

public class Person {
	
	private String name;
	private int    age;
	
	public Person() {
		
		setPerson( "Default" , 0 );
	}
	
	public Person( String name , int age ) {
		
		setPerson( "Default" , 0 );
		setPerson( name , age );
	}
	
	public void setPerson( String name , int age ) {
		
		setName(name);
		setAge(age);
	}
	
	public void setName( String name ) {
		
		if(name != null && name.length() > 0 )
			this.name = name;
	}
	
	public void setAge( int age ) {
		
		if(age >= 0)
			this.age = age;
	}
	
	public String getName() {
		
		return name;
	}
	
	public int getAge() {
		
		return age;
	}
}
