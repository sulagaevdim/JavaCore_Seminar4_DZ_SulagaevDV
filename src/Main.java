/* 1. В класс покупателя добавить перечисление с гендерами, добавить в сотрудника свойство
«пол» со значением созданного перечисления. Добавить геттеры, сеттеры.

2. Добавить в основную программу перечисление с праздниками
(нет праздника, Новый Год, 8 марта, 23 февраля), написать метод, принимающий массив сотрудников,
 поздравляющий всех сотрудников с Новым Годом, женщин с 8 марта,
 а мужчин с 23 февраля, если сегодня соответствующий день.
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Customer.Employee> employees = new ArrayList();
        employees.add(new Customer.Employee("Андрей", "Петров", "+79276543214", Gender.MALE));
        employees.add(new Customer.Employee("Алена", "Сидорова", "+79276587245", Gender.FEMALE));
        employees.add(new Customer.Employee("Василий", "Иванов", "+79041928516", Gender.MALE));
        congratulateOnHoliday(employees);
    }

    /**
     * Метод поздравляющий сотрудников по праздникам, если Новый год - поздравляет всех,
     * если 23 февраля - мужчин, если 8 марта - женщин, если обычный день - поздравлений нет
     * @param employees
     */
    public static void congratulateOnHoliday(ArrayList<Customer.Employee> employees){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd");
        String text = dtf.format(LocalDateTime.now());
        Holiday now = Holiday.NO_HOLIDAY;
        if (text == "01-01") now = Holiday.NEW_YEAR;
        if (text == "02-23") now = Holiday.FEBRUARY_23;
        if (text == "03-08") now = Holiday.MARCH_8;
        for (int i = 0; i < employees.size(); i++) {
            switch (now){
                case MARCH_8:
                    if (employees.get(i).getGender() == Gender.FEMALE)
                        System.out.println(employees.get(i).getFirstName() + ", с Международным Женским днем!");
                    break;
                case FEBRUARY_23:
                    if (employees.get(i).getGender() == Gender.MALE)
                        System.out.println(employees.get(i).getFirstName() + ", с Днем Защитников Отечества!");
                    break;
                case NEW_YEAR:
                    System.out.println(employees.get(i).getFirstName() + ", с Новым годом!");
                    break;
                default:
                    System.out.println(employees.get(i).getFirstName() + ", сегодня праздников нет - работать!");

            }
        }

    }
}