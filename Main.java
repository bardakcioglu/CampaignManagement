import java.rmi.RemoteException;

import Abstract.BasePlayerManager;
import Abstract.PlayerCheckService;
import Adapter.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CampaignSaleManager;
import Concrete.GameManager;
import Concrete.PlayerCheckManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		Player player1 = new Player(1,"Abdulaziz","Bardakçýoðlu",1996,"12345678910");
		Player player2 = new Player(2,"Abdulaziz","Bardakçýoðlu",1996,"12345678910");

		
		Game game1 = new Game(1,"Cs",299);
		Game game2 = new Game(1,"Cs",350);
		
		Campaign campaign1 = new Campaign(1,"Holiday",22);
		Campaign campaign2 = new Campaign(1,"Holiday",25);

		
		
		BasePlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.Save(player1);
		System.out.println();
		playerManager.Update(player2);
		System.out.println();
		playerManager.Delete(player2);
		System.out.println();
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.Add(campaign1);
		System.out.println();
		campaignManager.Update(campaign2);
		System.out.println();
		campaignManager.Delete(campaign2);
		System.out.println();
		
		GameManager gameManager = new GameManager();
		gameManager.Add(game1);
		System.out.println();
		gameManager.Update(game2);
		System.out.println();
		gameManager.Delete(game2);
		System.out.println();

		PlayerCheckService playerCheckService = new MernisServiceAdapter();
		
		CampaignSaleManager campaignSale1 = new CampaignSaleManager();
		if( playerCheckService.checkIfRealPlayer(player1) == true) {
			campaignSale1.sell(player1,game1,campaign1);
			System.out.println();
		}else {
			System.out.println("Wrong Entry");
		}
		
	}

}
