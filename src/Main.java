import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите одну из операций: 1. Добавить, 2. Показать, 3. Удалить, 4. Поиск");
            int operationNumber = 0;
            String input = scanner.nextLine();
            operationNumber = Integer.parseInt(input);
            if ("end".equals(input)) {
                break;
            }
            if (operationNumber == 1) {
                System.out.println("Какую покупку хотите добавить?");
                String products = scanner.nextLine();
                list.add(products);
                System.out.println("Итого в списке покупок " + list.size());
                continue;

            } else if (operationNumber == 2) {
                System.out.println("Список покупок:");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + " " + list.get(i));
                }

            } else if (operationNumber == 3) {
                System.out.println("Список покупок");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + " " + list.get(i));
                }
                System.out.println("Какую хотите удалить? Введите номер или название");
                String deletingPosition = scanner.nextLine();
                try {
                    int index = Integer.parseInt(deletingPosition);
                    for (int i = 0; i < list.size(); i++) {
                        if (i == (index - 1)) {
                            list.remove(i);
                            System.out.println("Покупка " + list.get(index - 1) + " удалена");
                        }
                    }
                } catch (NumberFormatException e) {
                    Iterator<String> listIterator = list.iterator();
                    while (listIterator.hasNext()) {
                        if (listIterator.next().equals(deletingPosition)) {
                            listIterator.remove();
                        }
                    }
                }

            } else if (operationNumber == 4) {
                System.out.println("Введите текст для поиска: ");
                String searchShopping = scanner.nextLine();
                String queryLower = searchShopping.toLowerCase();
                for (int i = 0; i < list.size(); i++) {
                    String listLower = list.get(i).toLowerCase();
                    if (listLower.contains(queryLower)) {
                        System.out.println("Найдено " + (i + 1) + " " + list.get(i));
                    }
                }
            }
        }
    }
}
