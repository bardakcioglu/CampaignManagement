package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface CampaignSaleService {
	void sell(Player player,Game game, Campaign campaign);
}
