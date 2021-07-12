package Abstract;

import java.rmi.RemoteException;

import Entities.Player;

public interface PlayerCheckService {
	boolean checkIfRealPlayer(Player player) throws NumberFormatException, RemoteException;
}
