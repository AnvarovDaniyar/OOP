package org.example.HomeWork.hw2;

import java.util.*;

public class OperationWithNotebook {
    Set<Laptops> laptops = new HashSet<>();
    private List<Criterion> criterionList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void printList() {
        for (Laptops notebook : laptops) {
            if (notebookIsCorrect(notebook)) {
                System.out.println(notebook);
            }
        }
    }

    public boolean notebookIsCorrect(Laptops notebook) {

        for (Criterion criterion : criterionList) {
            Object valueLaptops = null;

            if (criterion.property.equals("Название")) {
                valueLaptops = notebook.getНазвание();
            } else if (criterion.property.equals("ОЗУ")) {
                valueLaptops = notebook.getОЗУ();
            } else if (criterion.property.equals("ОбъемЖД")) {
                valueLaptops = notebook.getОбъемЖД();
            } else if (criterion.property.equals("ОперационнаяСистема")) {
                valueLaptops = notebook.getОперационнаяСистема();
            } else if (criterion.property.equals("Цвет")) {
                valueLaptops = notebook.getЦвет();
            } else {
                continue;
            }

            if (criterion.value != null && !criterion.value.equals(valueLaptops)) {
                return false;
            }

            if (criterion.maxValue != null && criterion.maxValue < Double.parseDouble(Objects.toString(valueLaptops))) {
                return false;
            }

            if (criterion.minValue != null && criterion.minValue > Double.parseDouble(Objects.toString(valueLaptops))) {
                return false;
            }
        }

        return true;
    }

    public OperationWithNotebook(Set<Laptops> notebooks) {
        this.scanner = new Scanner(System.in);
        this.laptops = notebooks;
    }

    public OperationWithNotebook(Set<Laptops> notebooks, List<Criterion> criterionList) {
        this.scanner = new Scanner(System.in);
        this.laptops = notebooks;
        this.criterionList = criterionList;
    }

    public int getCriteria() {
        String text = "Введите цифру, соответствующую необходимому критерию: ";

        List<String> properties = propertiesForFilter();

        for (int i = 0; i < properties.size(); i++) {
            text += "\n" + (i + 1) + ". " + getPropertyDescription(properties.get(i));
        }

        System.out.println(text);

        int value = scanner.nextInt();

        return value;
    }

    public String getPropertyDescription(String property) {

        Map<String, String> descriptionsProperties = descriptionsProperties();

        return descriptionsProperties.get(property);

    }

    public Map<String, String> descriptionsProperties() {
        Map<String, String> map = new HashMap<>();

        map.put("Название", "Наименование");
        map.put("Озу", "Объем оперативной памяти");
        map.put("РазмерЖД", "РазмерЖД");
        map.put("Операционнаясистема", "Операционная система");
        map.put("Цвет", "Цвет");

        return map;

    }

    public List<String> propertiesForFilter() {
        List<String> list = new ArrayList<>();
        list.add("Название");
        list.add("ОЗУ");
        list.add("РазмерЖД");
        list.add("Операционнаясистема");
        list.add("Цвет");

        return list;
    }

    public String getOperations() {

        String text = "Выберите опрерацию: \n " +
                "1. Добавить критерий \n " +
                "2. Вывести список \n " +
                "3. Завершить";

        System.out.println(text);

        String answer = scanner.next();

        return answer;
    }

    public Set<String> quantitativeSelection() {
        Set<String> set = new HashSet<>();
        set.add("ОЗУ");
        set.add("Цвет");

        return set;
    }

    public Set<String> stringSelection() {
        Set<String> set = new HashSet<>();

        set.add("Название");
        set.add("РазмерЖД");
        set.add("Цвет");

        return set;
    }

    public void start() {

        boolean flag = true;
        while (flag) {

            String operation = getOperations();
            if (operation.equals("3")) {
                flag = false;
                scanner.close();

            } else if (operation.equals("1")) {

                int criterion = getCriteria();
                List<String> properties = propertiesForFilter();
                if (criterion - 1 < 0 || criterion - 1 > properties.size() - 1) {
                    System.out.println("Введено некорректное значение");
                    continue;
                }
                String property = properties.get(criterion - 1);
                Criterion criterionObject = null;
                try {
                    if (quantitativeSelection().contains(property)) {
                        criterionObject = Criterion.startGetting(scanner, property, true);
                    } else {
                        criterionObject = Criterion.startGetting(scanner, property, false);
                    }
                } catch (Exception e) {
                    System.out.println("Ошибка при выборе критерия");
                    continue;
                }
                if (criterionObject != null) {
                    System.out.println("Критерий добавлен");
                    criterionList.add(criterionObject);
                }
            } else if (operation.equals("2")) {
                printList();
            }
        }
    }
}


class Criterion {

    Object value;
    Double minValue;
    Double maxValue;
    boolean isQuantitative;
    String property;

    public Criterion(String property, boolean isQuantitative, Object value, Double minValue, Double maxValue) {
        this.property = property;
        this.isQuantitative = isQuantitative;
        this.value = value;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public static Criterion startGetting(Scanner scanner, String property, boolean isQuantitative) {

        if (isQuantitative) {

            String quest = "Выберите тип криетрия: " +
                    "\n 1. Значение" +
                    "\n 2. Меньше" +
                    "\n 3. Больше" +
                    "\n 4. Интервал";
            System.out.println(quest);

            String text = scanner.next();

            Criterion criterion = null;

            if (text.equals("1")) {
                System.out.println("Введите значение поиска: ");
                int getValue = scanner.nextInt();
                criterion = new Criterion(property, isQuantitative, getValue, null, null);
            } else if (text.equals("2")) {
                System.out.println("Введите максимальное предельное значение: ");
                double getValue = scanner.nextDouble();
                criterion = new Criterion(property, isQuantitative, null, null, getValue);
            } else if (text.equals("3")) {
                System.out.println("Введите минимальное предельное значение: ");
                double getValue = scanner.nextDouble();
                criterion = new Criterion(property, isQuantitative, null, getValue, null);
            } else if (text.equals("4")) {
                System.out.println("Введите минимальное предельное значение: ");
                double getMin = scanner.nextDouble();
                System.out.println("Введите максимальное предельное значение: ");
                double getMax = scanner.nextDouble();
                criterion = new Criterion(property, isQuantitative, null, getMin, getMax);
            }

            return criterion;
        }

        System.out.println("Введите значение поиска: ");
        String getValue = scanner.next();
        return new Criterion(property, isQuantitative, getValue, null, null);
    }

}
