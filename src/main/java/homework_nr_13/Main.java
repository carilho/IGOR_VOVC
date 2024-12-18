package homework_nr_13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(new Product("Ноутбук", 20500.0, Category.ELECTRONICS));
        listOfProducts.add(new Product("Телефон", 8299.0, Category.ELECTRONICS));
        listOfProducts.add(new Product("Футболка", 199.0, Category.CLOTHING));
        listOfProducts.add(new Product("Джинсики", 459.0, Category.CLOTHING));
        listOfProducts.add(new Product("Хлеб", 12.0, Category.FOOD));
        listOfProducts.add(new Product("Молочко", 28.0, Category.FOOD));
        listOfProducts.add(new Product("Наушники", 3299.0, Category.ELECTRONICS));
        listOfProducts.add(new Product("Кофта", 340.0, Category.CLOTHING));
        listOfProducts.add(new Product("Яблоко", 4.0, Category.FOOD));
        listOfProducts.add(new Product("TV", 5699.0, Category.ELECTRONICS));

        System.out.println("Products with price more than 50 MDL:");
        listOfProducts.stream()
                .filter(product -> product.getPrice() > 50)
                .map(Product::getName)
                .forEach(System.out::println);

        listOfProducts.stream()
                .filter(product -> product.getCategory() == Category.ELECTRONICS)
                .max(Comparator.comparingDouble(Product::getPrice))
                .ifPresent(product -> System.out.println("Cel mai scump product din categoria ELECTRONICS: " + product.getName()));

        long foodCount = listOfProducts.stream()
                .filter(product -> product.getCategory() == Category.FOOD)
                .count();
        System.out.println("How many products are in category FOOD: " + foodCount);

        boolean cheapestProduct = listOfProducts.stream()
                .anyMatch(product -> product.getPrice() < 20);
        System.out.println("Are there any products cheaper than 20 MDL: " + cheapestProduct);
    }
}
