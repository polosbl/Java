package Lesson8.Homework;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1,"first",11);
        Product product2 = new Product(2,"second",22);
        Product product3 = new Product(1,"third",33);
        Product product4 = new Product(2,"newSecond",222);
        Product product5 = new Product(5,"fifth",141);
        Product product6 = new Product(6,"sixth", 158);

        Shop shop = new Shop();

        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.printListOfProducts();

        shop.deleteProductFromList(1);
        shop.printListOfProducts();

        shop.editProduct(product4);
        shop.printListOfProducts();

        shop.addProduct(product5);
        shop.addProduct(product6);
        shop.sortByPriceDescending();
        shop.sortByPriceAscending();

        shop.sortByAddingTime();
    }
}
