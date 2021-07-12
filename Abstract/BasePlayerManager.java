package Abstract;

import java.rmi.RemoteException;

import Entities.Player;

public abstract class BasePlayerManager implements PlayerService{
	
	@Override
	public void Save(Player player) throws NumberFormatException, RemoteException {
		System.out.println("Save to db : " + player.firstName + " " + player.lastName);
	}
	@Override
	public void Update(Player player) throws NumberFormatException, RemoteException {
		System.out.println("Update : " + player.firstName + " " + player.lastName);
	}
	@Override
	public void Delete(Player player) {
		System.out.println("Delete from db : " + player.firstName + " " + player.lastName);
	}
}
