package org.adpushup.com.Model;

public class Ad {

	private String AdvertiserID;
	private long Revenue;
	public Ad(String advertiserID, long revenue) {
		super();
		AdvertiserID = advertiserID;
		this.Revenue = revenue;
	}
	public Ad() {
		super();
	}
	public String getAdvertiserID() {
		return AdvertiserID;
	}
	public void setAdvertiserID(String advertiserID) {
		AdvertiserID = advertiserID;
	}
	public long getRevenue() {
		return Revenue;
	}
	public void setRevenue(long revenue) {
		this.Revenue = revenue;
	}
	@Override
	public String toString() {
		return "Ad [AdvertiserID=" + AdvertiserID + ", Revenue=" + Revenue + "]";
	}

}
