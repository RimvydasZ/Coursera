# Coursera
Code from courses that I've learned. Links/Examples/Comments


https://www.coursera.org/learn/java-programming/home/welcome

http://www.dukelearntoprogram.com/course2/doc/ //documentation


**Overcommenting below is deliberate :)**
```
import edu.duke.*;
import org.apache.commons.csv.*;                                     //imports required libraries for the code to work.                                                                      

public class testeris { //class name
    public void countryInfo(CSVParser parser, String country) {      //method countryInfo (searches for country in the given .csv file)
       for (CSVRecord record : parser) {                             //loops through and records data from parser)
           String countryName = record.get("Country");               //declare&initialise variable countryName
            if (countryName.contains(country)) {                     //checks if recorded "Country"(countryName) matches/contains String country.
                System.out.print(record.get("Country")+": ");        //prints "Country column value: " 
                System.out.print(record.get("Exports")+": ");        //prints "Exports column value: "
                System.out.println(record.get("Value (dollars)"));   //prints line "Value (dollars) column value"
                                                                     //if countryName matches/contains String country - prints out a line Country: list of Exports: Value in dollars
            } else {
                System.out.println("NOT FOUND");                     //if "Country" does NOT match/contain String country - prints "NOT FOUND" line
            }
     }
     
    }

    public void tester() {                                           //method for testing 
        FileResource fr = new FileResource();                        //declare&initialise variable fr -> opens a window where you select a file (in this case .csv)
        CSVParser parser = fr.getCSVParser();                        //reads selected .csv
        countryInfo(parser, "United States");                        //calls method which searches for "United States" in the parsed file. 
    }
}
```
