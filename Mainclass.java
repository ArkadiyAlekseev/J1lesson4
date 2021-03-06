package ru.geekbrains.J1Homework4;

public class Mainclass {
    public static void main(String[] args) {
        Employee Arkadiy = new Employee("Алексеев", "Аркадий", "Николаевич", "200000", "1986");
        // Задание 4. Вывести в консоль при помощи методов из пункта 3 ФИО и возраст.
        Arkadiy.consoleOutput();
        //Задание 5 Создать массив из 5 сотрудников. */
        String[][] workers = {
                {"Павленко", "Варвара", "Григоровна", "40000", "1988"},
                {"Мандроян", "Вера", "Юрьевна", "80000", "1955"},
                {"Макурина", "Марина", "Алексеевна", "50000", "1991"},
                {"Швечикова", "Светлана", "Аркадьевна", "100000", "1965"},
                {"Алексеев", "Аркадий", "Николаевич", "200000", "1986"}};
        Employee Employees = new Employee(workers);
        // проверка
        System.out.println(" \n Задание 5.");
        Employees.consolePrint(workers);
        // С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        Employees.over40(workers);
        //задание 6. Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
        Employees.salaryOver45(workers);
        // проверка
        System.out.println("\n Задание 6.");
        Employees.consolePrint(workers);
        //** Задание 7. Написать методы (принимающие на вход массив сотрудников), вычисляющие средний возраст и среднюю зарплату сотрудников, вывести результаты работы в консоль.
        System.out.printf("Задание 7. \n Средний возраст сотрудников %s лет, а средняя зарплата сотрудников %s рублей \n", Employees.averageAge(workers), Employees.averagesalary(workers));
        // *** Задание 8. Продумать конструктор таким образом, чтобы при создании каждому сотруднику
        // присваивался личный уникальный идентификационный порядковый номер
        System.out.println("\n Задание 8.");
        Employee EmployeesNumber = new Employee(Employees.numberOfWorker (workers));//используем два конструктора - первый, создает объект из массива, второй создает объект из объекта, еще был вариант изначально сделать массив со столбцом для идентификационного номера.
    }
}



