public class StarbucksCustomerManager extends BaseCustomerManager {
	CustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if (_customerCheckService.checkIfRealPerson(customer)) {
			super.Save(customer);	
		}else {
			System.out.println("G�nderilen bilgilere ait T.C. vatanda�� bulunamad�");
		}
	}
}
