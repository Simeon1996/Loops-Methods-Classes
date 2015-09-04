import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Simeon on 9/3/2015.
 */
public class ListOfProducts {
    public static void main(String[] args) throws IOException{

        FileReader fileReader = new FileReader("productsInput.txt");
        BufferedReader reader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter("productsOutput.txt");
        BufferedWriter writer = new BufferedWriter(fileWriter);

       ArrayList<Product> products = new ArrayList<Product>();

        String line = reader.readLine();

        while(line != null){

            String[] input = line.split(" ");

            String productName = input[0];
            Float productPrice = Float.parseFloat(input[1]);

            Product product = new Product(productName,productPrice);

            products.add(product);

            line = reader.readLine();
        }

        fileReader.close();

        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product firstProduct, Product secondProduct) {
                if(firstProduct.getNumber() < secondProduct.getNumber()){
                    return -1;
                } else if(firstProduct.getNumber() > secondProduct.getNumber()){
                    return 1;
                }

                return 0;
            }
        });

        for(Product product : products){
            writer.write(product.toString());
            writer.write("\n");
        }

        writer.close();

    }
}
