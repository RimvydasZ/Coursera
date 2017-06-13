
/**
 * Write a description of testeris here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import org.apache.commons.csv.*;

public class testeris { //name of the method
    public void countryInfo(CSVParser parser, String country) {
       for (CSVRecord record : parser) {
           String countryName = record.get("Country");
            if (countryName.contains(country)) {
                System.out.print(record.get("Country")+": ");
                System.out.print(record.get("Exports")+": ");
                System.out.println(record.get("Value (dollars)"));
            } else {
                System.out.println("NOT FOUND");
            }
     }
     
    }

    public void tester() {
        FileResource fr;// = new FileResource();
        CSVParser parser = fr.getCSVParser();
        countryInfo(parser, "United States");
    }
}
