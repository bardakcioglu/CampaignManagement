package Concrete;

import java.rmi.RemoteException;

import Abstract.BasePlayerManager;
import Abstract.PlayerCheckService;
import Entities.Player;

public class PlayerManager extends BasePlayerManager{
	PlayerCheckService playerCheckService;
	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}
	
	@Override
	public void Save(Player player) throws NumberFormatException, RemoteException {
		if(playerCheckService.checkIfRealPlayer(player)) {
			super.Save(player);
		}else {
			System.out.println("Wrong entry");
		}
	}
	@Override
	public void Update(Player player) throws NumberFormatException, RemoteException {
		if(playerCheckService.checkIfRealPlayer(player)) {
			super.Update(player);
		}else {
			System.out.println("Wrong entry");
		}
	}
	@Override
	public void Delete(Player player) {
			super.Delete(player);
	}

}
