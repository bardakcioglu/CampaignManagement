package Entities;

public class Campaign {
	public int id;
	public String campaignName;
	public int campaignSale;
	
	public Campaign(int id, String campaignName, int campaignSale) {
		this.id = id;
		this.campaignName = campaignName;
		this.campaignSale = campaignSale;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getCampaignSale() {
		return campaignSale;
	}

	public void setCampaignSale(int campaignSale) {
		this.campaignSale = campaignSale;
	}
}