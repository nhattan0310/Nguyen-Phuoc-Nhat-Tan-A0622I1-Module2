package ss17_binary_file.bai_tap;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("TV22", "Tivi", "Sony", 200, "Black Color"));
        productList.add(new Product("DL16", "Display", "ASUS", 50, "FHD/16 Inch"));
        productList.add(new Product("WM22", "Wash Machine", "Panasonic", 100, "Vertical"));
        productList.add(new Product("LS22", "Loudspeaker", "JBL", 50, "Water Resistance"));
        FileUtil.writeToFile("product.txt",productList);
        FileUtil.readDataFromFile("product.txt");
        for (Product product:productList) {
            System.out.println(product);
        }
    }
}
