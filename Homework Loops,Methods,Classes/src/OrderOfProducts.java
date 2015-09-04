import java.io.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by Simeon on 9/3/2015.
 */
public class OrderOfProducts {
    public static void main(String[] args) throws IOException {

        ArrayList<Product> products = new ArrayList<Product>();
        ArrayList<Product> orders = new ArrayList<Product>();

        Double totalPrice = 0d;

        FileReader productsFileReader = new FileReader("Products.txt");
        BufferedReader productsReader = new BufferedReader(productsFileReader);

        String productsFileLine = productsReader.readLine();

        while (productsFileLine != null) {
            String[] productParams = productsFileLine.split(" ");

            String productName = productParams[0];
            Float productPrice = Float.parseFloat(productParams[1]);

            Product product = new Product(productName, productPrice);

            products.add(product);

            productsFileLine = productsReader.readLine();
        }

        productsReader.close();

        FileReader ordersFileReader = new FileReader("Order.txt");
        BufferedReader ordersReader = new BufferedReader(ordersFileReader);

        String ordersFileLine = ordersReader.readLine();

        while (ordersFileLine != null) {
            String[] ordersParams = ordersFileLine.split(" ");

            Float orderPrice = Float.parseFloat(ordersParams[0]);
            String orderName = ordersParams[1];

            Product order = new Product(orderName, orderPrice);

            orders.add(order);

            ordersFileLine = ordersReader.readLine();
        }

        ordersReader.close();

        for(Product product : products){
            for(Product order : orders){
                if(product.getName().equals(order.getName())){
                    totalPrice += product.getNumber() * order.getNumber();
                }
            }
        }

        FileWriter totalPriceWriter = new FileWriter("Output.txt");
        BufferedWriter writer = new BufferedWriter(totalPriceWriter);

        DecimalFormat df = new DecimalFormat("#.#");
        df.setRoundingMode(RoundingMode.DOWN);

        writer.write("Total price: " + df.format(totalPrice));
        writer.close();

    }
}
