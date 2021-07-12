package Adapter;

import java.rmi.RemoteException;

import Abstract.PlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService{

	@Override
	public boolean checkIfRealPlayer(Player player) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(player.nationalityId), player.firstName, player.lastName , player.dateOfBirth);
		if(result) {
			System.out.println("Mernis Check Successful");
			return true;
		}else {
			System.out.println("Mernis Check Unsuccessful");
			return false;
		}
	}
	
}
