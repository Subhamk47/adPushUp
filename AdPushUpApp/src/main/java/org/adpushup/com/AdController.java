package org.adpushup.com;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.adpushup.com.Model.Ad;
import org.adpushup.com.Utility.RevenewCalculator;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
/*
 * Author @Subham Kumar
 */
public class AdController {
	// Please, add the file path in run arguments (Command Line)
	public static void main(String[] args) throws CsvValidationException, IOException {
		RevenewCalculator calculator = new RevenewCalculator();
		CSVReader  reader = new CSVReader(new FileReader(args[0]));
		ArrayList<Ad> revernueCollector = new ArrayList<Ad>();
		String [] data;
		int k = 0;
		while((data = reader.readNext()) != null) {
			Ad ad = new Ad();
			for(int i  = 0;i<data.length;i++) {
				if(k==0) continue;
				if(i==0) ad.setAdvertiserID(data[i]);
				if(i==1) ad.setRevenue(Long.parseLong(data[i]) );
			}
			if(k!=0) revernueCollector.add(ad);
			k++;
		}
		calculator.revenewCalculator(revernueCollector);
	}

}
