package Abstract;

import java.rmi.RemoteException;

import Entities.Player;

public interface PlayerService{
	void Save(Player player) throws NumberFormatException, RemoteException ;
	void Update(Player player) throws NumberFormatException, RemoteException;
	void Delete(Player player);
}
