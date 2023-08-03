import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Product> products = addDummyData();

        // Exercise 1
        List<Product> productsOfCategoryBook = listByCategory(products,"Books");
        System.out.println("Products Of Category Books that have : "+ productsOfCategoryBook.size() + " Books");
        productsOfCategoryBook.forEach(System.out::println);
        System.out.println("----------------------------------------");

        // Exercise 2
        List<Product> productsOfCategoryBookAndPriceGreaterThan100 = listByCategoryAndGreaterThanPrice(products, "Books",100);
        System.out.println("Products Of Category Book And Price greater Than 100 that have : "+ productsOfCategoryBook.size() + " Books");
        productsOfCategoryBookAndPriceGreaterThan100.forEach(System.out::println);
        System.out.println("----------------------------------------");


        // Exercise 3
        List<Product> productsOfCategoryAndAddDiscount = addDiscountToCategory(products,"Toys",10);
        System.out.println("Toys products with discount that have : "+ productsOfCategoryBook.size() + " Books");
        productsOfCategoryAndAddDiscount.forEach(System.out::println);
        System.out.println("----------------------------------------");

        // Exercise 4
        Product cheapestProduct = getCheapestProduct(products,"Books");
        System.out.println("Cheapest Book product");
        System.out.println(cheapestProduct);
        System.out.println("----------------------------------------");


    }
    public static List<Product> addDummyData() {
        List<Product> products = new ArrayList<>();
        Collections.addAll(products,
                new Product(1, "omnis quod consequatur", "Games", 184.83),
                new Product(2, "vel libero suscipit", "Toys", 12.66),
                new Product(3, "non nemo iure", "Grocery", 498.02),
                new Product(4, "voluptatem voluptas aspernatur", "Toys", 536.80),
                new Product(5, "animi cum rem", "Games", 458.20),
                new Product(6, "dolorem porro debitis", "Toys", 146.52),
                new Product(7, "aspernatur rerum qui", "Books", 656.42),
                new Product(8, "deleniti earum et", "Baby", 41.46),
                new Product(9, "voluptas ut quidem", "Books", 697.57),
                new Product(10, "eos sed debitis", "Baby", 366.90),
                new Product(11, "laudantium sit nihil", "Toys", 95.50),
                new Product(12, "ut perferendis corporis", "Grocery", 302.19),
                new Product(13, "sint voluptatem ut", "Toys", 295.37),
                new Product(14, "quos sunt ipsam", "Grocery", 534.64),
                new Product(15, "qui illo error", "Baby", 623.58),
                new Product(16, "aut ex ducimus", "Books", 551.39),
                new Product(17, "accusamus repellendus minus", "Books", 240.58),
                new Product(18, "aut accusamus quia", "Baby", 881.38),
                new Product(19, "doloremque incidunt sed", "Games", 988.49),
                new Product(20, "libero omnis velit", "Baby", 177.61),
                new Product(21, "consectetur cupiditate sunt", "Toys", 95.46),
                new Product(22, "itaque ea qui", "Baby", 677.78),
                new Product(23, "non et nulla", "Grocery", 70.49),
                new Product(24, "veniam consequatur et", "Books", 893.44),
                new Product(25, "magnam adipisci voluptate", "Grocery", 366.13),
                new Product(26, "reiciendis consequuntur placeat", "Toys", 359.27),
                new Product(27, "dolores ipsum sit", "Toys", 786.99),
                new Product(28, "ut hic tempore", "Toys", 316.09),
                new Product(29, "quas quis deserunt", "Toys", 772.78),
                new Product(30, "excepturi nesciunt accusantium", "Toys", 911.46)
        );
        return products;

    }

    /***
     * This Method used to list products by categories
     * @param products
     * @param categoryName
     * @return
     */
    public static List<Product> listByCategory(List<Product> products , String categoryName){
        return products.stream().filter(product -> product.getCategory().equalsIgnoreCase(categoryName)).collect(Collectors.toList());
    }

    /***
     * This method used to return products by category and price but in where greaterThan (>)
     * @param products
     * @param categoryName
     * @param price
     * @return
     */
    public static List<Product> listByCategoryAndGreaterThanPrice(List<Product> products, String categoryName ,int price){
        return products.stream()
                .filter(product -> (product.getCategory().equalsIgnoreCase(categoryName) && product.getPrice() > price))
                .collect(Collectors.toList());
    }

    /***
     * This method to list Products by category and add discount
     * @param products
     * @param categoryName
     * @param discount
     * @return
     */
    public static List<Product> addDiscountToCategory (List<Product> products, String categoryName, float discount){
        return listByCategory(products, categoryName).stream().map(product -> product.withPrice(product.getPrice() * discount)).collect(Collectors.toList());
    }

    /***
     * Get Cheapest Product By Category
     * @param products
     * @param categoryName
     * @return
     */
    public static Product getCheapestProduct (List<Product> products, String categoryName){
        return listByCategory(products,categoryName).stream().min((product1, product2) -> Double.compare(product1.getPrice(),product2.getPrice())).orElse(null);
    }
}