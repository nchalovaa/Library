package product.comparator;

import java.util.Arrays;

public class ComparatorRunner {
    public static void main(String[] args) {
        Product[] products = {new Product(1113, "name1", 111.11), new Product(3234, "name2", 758.49), new Product(5422, "name3", 543.41), new Product(4211, "name4", 132.41), new Product(5435, "name5", 176.71), new Product(7567, "name6", 142.11), new Product(3456, "name7", 121.14), new Product(5325, "name8", 876.45), new Product(2675, "name9", 543.23),};


        Arrays.sort(products, new ProductIDComparator());
        System.out.println("Sort products array by ID");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);

        }
        System.out.println();

        Arrays.sort(products, new ProductNameComparator());
        System.out.println("Sort products array by Name");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);

        }
        System.out.println();

        Arrays.sort(products, new ProductPriceComparator());
        System.out.println("Sort products array by Price");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);

        }
        System.out.println();


    }
}
