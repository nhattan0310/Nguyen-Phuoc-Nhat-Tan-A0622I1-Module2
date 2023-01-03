package ss16_read_write_file.bai_tap;

import java.util.ArrayList;
import java.util.List;


public class Test {
    public static final String FILE_NAME ="ss16_read_write_file\\bai_tap\\country.csv";
    public static final String COMMA = ",";

    public static void main(String[] args) {
        Country country1 = new Country(1,"AU","Australia");
        Country country2 = new Country(2,"CN","China");
        Country country3 = new Country(3,"JP","Japan");
        List<Country> countryList =new ArrayList<>();
        countryList.add(country1);
        countryList.add(country2);
        countryList.add(country3);

        String line;
        for (Country country :countryList) {
            line = country.getId() + COMMA + country.getCode() + COMMA +country.getName();
            FileUtils.writeFile(FILE_NAME,line);
            System.out.println(line);
        }
    }
}
