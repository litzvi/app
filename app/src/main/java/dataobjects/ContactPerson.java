/**
 * 
 */
package dataobjects;

/**
 * @author Zvi
 *
 */
public class ContactPerson {
	private Person person;
	private CompanyPosition position;
	private boolean isActive;
	public ContactPerson(Person person, CompanyPosition position, boolean isActive) {
		super();
		this.person = person;
		this.position = position;
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "ContactPerson [person=" + person + ", position=" + position + ", isActive=" + isActive + "]";
	}
	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
	/**
	 * @return the position
	 */
	public CompanyPosition getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(CompanyPosition position) {
		this.position = position;
	}
	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}
	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
}
