package entities;

import entities.Person;

public class Room {
	
	private int    roomNumber;
	private Person person;
	
	public Room( int roomNumber , Person person ) {
		
		setRoomNumber(roomNumber);
		setPerson(person);
	}
	
	public void setRoomNumber( int roomNumber ) {
		
		if( roomNumber >= 1 && roomNumber <= 10 )
			this.roomNumber = roomNumber;
	}
	
	public void setPerson( Person person ) {
		
		this.person = person;
	}
	
	public int getRoomNumber() {
		
		return roomNumber;
	}
	
	public Person getPerson() {
		
		return person;
	}
	
	@Override
	public String toString() {
		
		return " " + getRoomNumber() + ": " 
			 + person.getName() 
			 + ", "
			 + person.getEmail();
	}
}
