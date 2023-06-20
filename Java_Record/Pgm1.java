class Product {
    String pcode, pname;
    double price;

    public void readData(String pc, String pn, double pr) {
        pcode = pc;
        pname = pn;
        price = pr;
    }
}

public class Pgm1 {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        p1.readData("A1", "P1", 550.0);
        p2.readData("B1", "P2", 450.0);
        p3.readData("C1", "P3", 600.0);

        if (p1.price < p2.price) {
            if (p1.price < p3.price) {
                System.out.println("Product 1 is least expensive");
            } else {
                System.out.println("Product 3 is least expensive");
            }
        } else {
            if (p2.price < p3.price) {
                System.out.println("Product 2 is least expensive");
            } else {
                System.out.println("Product 3 is least expensive");
            }
        }
    }
}
