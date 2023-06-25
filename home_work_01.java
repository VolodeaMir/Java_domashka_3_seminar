// 1. Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 
// 1го или 2-го сорта среди товаров, название которых содержит «высший».

public class home_work_01 {
    public static void main(String[] args) {
        // Заданный массив записей товаров
        String[][] товары = {
                { "Товар 1", "100", "1-й сорт" },
                { "Товар 2", "200", "2-й сорт" },
                { "Товар 3 высший", "300", "1-й сорт" },
                { "Товар 4 высший", "400", "2-й сорт" },
                { "Товар 5", "500", "1-й сорт" },
                { "Товар 6", "600", "2-й сорт" }
        };

        double максимальнаяЦена = 0;

        // Проходим по каждой записи товара
        for (String[] товар : товары) {
            String наименование = товар[0];
            double цена = Double.parseDouble(товар[1]);
            String сорт = товар[2];

            // Проверяем условие, что название товара содержит "высший" и сорт - 1-й или 2-й
            if (наименование.contains("высший") && (сорт.equals("1-й сорт") || сорт.equals("2-й сорт"))) {
                if (цена > максимальнаяЦена) {
                    максимальнаяЦена = цена;
                }
            }
        }

        System.out.println(
                "Наибольшая цена товаров 1-го или 2-го сорта среди товаров, название которых содержит 'высший': "
                        + максимальнаяЦена);
    }
}
