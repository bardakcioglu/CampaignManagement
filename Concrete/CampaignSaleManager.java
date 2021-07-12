package Concrete;

import Abstract.CampaignSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class CampaignSaleManager implements CampaignSaleService{

	@Override
	public void sell(Player player, Game game, Campaign campaign) {
		int salePrice = game.gamePrice - (game.gamePrice * campaign.campaignSale) / 100;
		System.out.println( "Cart Description : ");
		System.out.println( "Player : " + player.firstName + " " + player.lastName);
		System.out.println( "Game : " + game.gameName);
		System.out.println( "Game Price: " + game.gamePrice + " TL");
		System.out.println( "Campaign : " + campaign.campaignName);
		System.out.println( "Discount : %" + campaign.campaignSale);
		System.out.println( "Game Sale Price : " + salePrice + " TL");
	}

}
