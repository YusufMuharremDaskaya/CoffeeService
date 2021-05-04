
public class Customer implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private String NationalIdentity;

	
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalIdentity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		NationalIdentity = nationalIdentity;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalIdentity() {
		return NationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		NationalIdentity = nationalIdentity;
	}
	
	
}
