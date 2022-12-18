package org.adpushup.com.Utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.adpushup.com.Model.Ad;

public class RevenewCalculator {
	
	private static final Logger LOGGER  = Logger.getLogger(RevenewCalculator.class.getName());
	
	public void revenewCalculator(ArrayList<Ad> revernueCollector ) {
		Map<String, Long> map = new HashMap<String, Long>();
		long totalRevenew = 0;
		for(Ad ad: revernueCollector) {
			totalRevenew += ad.getRevenue();
			if(!map.containsKey(ad.getAdvertiserID())) {
				map.put(ad.getAdvertiserID(), ad.getRevenue());
			}else {
				map.put(ad.getAdvertiserID(), map.get(ad.getAdvertiserID()  ) + ad.getRevenue() );
			}
		}
		LOGGER.log(Level.INFO, "The total revenue in INR across all Websites. : {0}", totalRevenew);
		for(String key : map.keySet()) {
			LOGGER.log(Level.INFO, "The total revenue in INR across AdvertiserId. : {0}  is : {1}", new Object[] {key , map.get(key)} );
		}
	}
}
