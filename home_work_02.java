// 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта. 
// Получить наименования товаров заданного сорта с наименьшей ценой.

import java.util.ArrayList;
import java.util.List;

public class home_work_02 {
    public static void main(String[] args) {
        // Создаем список товаров
        List<Product> products = new ArrayList<>();
        products.add(new Product("Товар 1", "Страна 1", 0.5, 10.0, "Сорт A"));
        products.add(new Product("Товар 2", "Страна 2", 0.7, 8.0, "Сорт B"));
        products.add(new Product("Товар 3", "Страна 1", 0.9, 8.0, "Сорт A"));
        products.add(new Product("Товар 4", "Страна 3", 0.6, 9.0, "Сорт B"));
        products.add(new Product("Товар 5", "Страна 2", 0.8, 11.0, "Сорт A"));

        String targetGrade = "Сорт A";

        // Находим товары заданного сорта с наименьшей ценой
        String minPriceProduct = null;
        double minPrice = Double.MAX_VALUE;

        for (Product product : products) {
            if (product.getGrade().equals(targetGrade) && product.getPrice() < minPrice) {
                minPriceProduct = product.getName();
                minPrice = product.getPrice();
            }
        }

        if (minPriceProduct != null) {
            System.out.println(
                    "Наименование товара с наименьшей ценой для сорта " + targetGrade + ": " + minPriceProduct);
        } else {
            System.out.println("Товары сорта " + targetGrade + " не найдены.");
        }
    }
}
