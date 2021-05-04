

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
	KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	@Override
	public Boolean checkIfRealPerson(Customer customer) {
		
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth());
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
