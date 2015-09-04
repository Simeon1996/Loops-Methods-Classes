/**
 * Created by Simeon on 9/3/2015.
 */
public class Product {

    private String name;
    private Float number;

    public Product(String name, Float number) {
        this.name = name;
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(Float number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append(String.format("%.2f %s",this.number,this.name));

        return output.toString();
    }
}
