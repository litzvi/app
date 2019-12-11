/**
 * 
 */
package dataobjects;

/**
 * @author Zvi
 *
 */
public class SupplyCategory {
	private int id;
	private String name;
	
	
	public SupplyCategory() {
		super();
	}

	public SupplyCategory(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public SupplyCategory[] getAll() {
		SupplyCategory[] temp = new SupplyCategory[2];
		temp[0] = new SupplyCategory(1, "tan");
		temp[1] = new SupplyCategory(2, "zvi");
		return temp;
	}
	
	
	@Override
	public String toString() {
		return "SupplyCategory [id=" + id + ", name=" + name + "]";
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return
	 */
	public int getId() {
		return id;
	}
	
}
