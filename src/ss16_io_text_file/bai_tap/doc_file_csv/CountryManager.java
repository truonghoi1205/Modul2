package ss16_io_text_file.bai_tap.doc_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CountryManager {
    private final List<Country> countries;

    public CountryManager() {
        this.countries = new ArrayList<Country>();
    }
    public void init() {
        File myFile = new File("src/ss16_io_text_file/bai_tap/doc_file_csv/file_country.csv");
        try {
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] txt = line.split(",");
                Country country = new Country(Integer.parseInt(txt[0]), txt[1],txt[2]);
                countries.add(country);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void showAll() {
         for (Country country : countries) {
             System.out.println(country);
         }
    }

}
