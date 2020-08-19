package ru.geekbrains.j_one.lesson_b.onlain;

//Создать класс "Сотрудник" с полями: ФИО, зарплата, возраст;
//Конструктор класса должен заполнять эти поля при создании объекта;
//Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
//Вывести при помощи методов из пункта 3 ФИО и возраст.
//Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

public class employee {

    public static void employee (String [] args ) {
        String name;
        int salary;
        int age;


    public employee(String name, int salary, int age)
        this.name = name;
        this.salary = salary;
        this.age = age;

        public String getInfo();
        System.out.printf("Имя: %s, Зарплата: %d, Возраст: %d \n",
                name(), salary(), age());

        public void print(){
            System.out.println(this);
        }
        employee[] persArray = new employee[5];
        persArray[0] = new employee("Киану Ривз;", 55000, 33);
        persArray[1] = new employee("Лоренс Фишбёрн",50000, 42);
        persArray[2] = new employee("Кэрри-Энн Мосс", 50000, 35);
        persArray[3] = new employee("Хьюго Уивинг", 70000, 45);
        persArray[4] = new employee("Глория Фостер", 48000, 55);

        for (int i=0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].print();
    }
}
