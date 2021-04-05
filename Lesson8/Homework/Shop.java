package Lesson8.Homework;

import java.util.*;

public class Shop {
    private List<Product> listOfProducts = new ArrayList<>();

    public void addProduct(Product product) {
        for (Product product1 : listOfProducts) {
            if (product1.getId() == product.getId()) {
                System.out.println("Товар с id = " + product.getId() + " уже существует." + "\n");
                return;
            }
        }
        this.listOfProducts.add(product);
        System.out.println("Товар " + product.getName() + " добавлен в список." + "\n");
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void printListOfProducts() {
        System.out.println("Список товаров в магазине:");
        for (int i = 0; i < listOfProducts.size(); i++) {
            System.out.println(listOfProducts.get(i).getName());
        }
        System.out.print("\n");
    }

    public void deleteProductFromList(int id) {
        for (Product product : listOfProducts) {
            if (product.getId() == id) {
                this.listOfProducts.remove(product);
            }
        }
    }

    public void editProduct(Product editedProduct) {
        for (Product product : listOfProducts) {
            if (product.getId() == editedProduct.getId()) {
                product.setName(editedProduct.getName());
                product.setPrice(editedProduct.getPrice());
            }
        }
    }

    public void sortByPriceDescending() {
        Map<String,Integer> prices = new HashMap<>();
        for (Product product : listOfProducts) {
            prices.put(product.getName(),product.getPrice());
        }
        System.out.println("Список товаров по убыванию цены:");
        prices.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue()).reversed())
                .forEach(System.out::println);
        System.out.print("\n");
    }

    public void sortByPriceAscending() {
        Map<String,Integer> prices = new HashMap<>();
        for (Product product : listOfProducts) {
            prices.put(product.getName(),product.getPrice());
        }
        System.out.println("Список товаров по возрастанию цены:");
        prices.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
        System.out.print("\n");
    }

    public void sortByAddingTime() {
        System.out.println("Список товаров по порядку добавления:");
        for (int i = listOfProducts.size() - 1; i >= 0; i--) {
            System.out.println(listOfProducts.get(i).getName());
        }
    }
}
