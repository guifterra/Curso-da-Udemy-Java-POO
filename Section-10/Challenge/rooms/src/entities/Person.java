package entities;

public class Person {
	
	private String name;
	private String email;
	
	public Person() {
		
		setPerson( "" , "" );
	}
	
	public Person( String name , String email ) {
		
		setPerson( "" , "" );
		setPerson( name , email );
	}
	
	public void setPerson( String name , String email ) {
		
		setName( name );
		setEmail( email );
	}
	
	public void setName( String name ) {
		
		this.name = name;
	}
	
	public void setEmail( String email ) {
		
		this.email = email;
	}
	
	public String getName() {
		
		return name;
	}
	
	public String getEmail() {
		
		return email;
	}
}
