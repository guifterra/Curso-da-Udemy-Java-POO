package entities;

public class Product {
	
	private String name;
	private double value;
	
	public Product() {
		
		setName( "Product name" );
		setValue( 0.0 );
	}
	
	public Product(String name, double value) {
		
		setName( name );
		setValue( value );
	}
	
	public void setName(String name) {
		
		if( name != null )
			this.name = name;
	}
	
	public void setValue(double value) {
		
		if( value >= 0.0 )
			this.value = value;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public double getValue() {
		
		return this.value;
	}
}
