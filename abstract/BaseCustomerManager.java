

public abstract class BaseCustomerManager implements CustomerService {
	@Override
	public void Save(Customer customer) {
		System.out.println("Veri taban�na Kaydedildi : " + customer.getFirstName());
		
	}
		
}
