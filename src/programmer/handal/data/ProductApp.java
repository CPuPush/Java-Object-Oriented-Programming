package programmer.handal.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Mac book", 23333);
        System.out.println(product.name);
        System.out.println(product.price);
        // System.out.println(product.toStrings());
        System.out.println(product);
    }
}
