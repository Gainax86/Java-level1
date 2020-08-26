public class animals {
    /*Создать классы Собака и Кот с наследованием от класса Животное.

    Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
    В качестве параметра каждому методу передается величина, означающая или длину
    препятствия (для бега и плавания), или высоту (для прыжков).

    У каждого животного есть ограничения на действия
    (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).

    При попытке животного выполнить одно из этих действий, оно должно сообщить результат.
    (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')*/
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Черныш");

        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Тузик");

        cat1.info();
        cat2.info();

        System.out.println();

        dog1.info();
        dog2.info();

        System.out.println();

        dog1.run(400);
        dog1.swim(5);
        dog1.jump(0.3);

        System.out.println();

        cat1.run(1700);
        cat1.swim(5);
        cat1.jump(1.7);
    }
    public static class Animals {
        protected String name;
        protected String type;
        protected int maxRun;
        protected int maxSwim;
        protected double maxJump;
        public Random random = new Random();

        public Animals(String name){
            this.name = name;
        }

        public void run(int dist) {
            if (this.maxRun >= dist) System.out.println(this.type + " " + this.name + " run " + dist + " m.");
            else System.out.println(this.type + " " + this.name + " can't run so far.");
        }

        public void swim(int dist) {
            if (this.maxSwim >= dist) System.out.println(this.type + " " + this.name + " swim " + dist + " m.");
            else System.out.println(this.type + " " + this.name + " can't swim so far.");
        }

        public void jump(double height) {
            if (this.maxJump >= height)
                System.out.println(this.type + " " + this.name + " jump " + height + " m.");
            else System.out.println(this.type + " " + this.name + " can't jump so hi.");
        }

        public void info() {
            System.out.println(this.type + " " + this.name + " Run: " + this.maxRun + " m., Swim: " + this.maxSwim + " m., Jump: " + this.maxJump + " m.");
        }
    }

    public static class Cat extends Animals {
        public Cat(String name) {
            super(name);
            this.maxJump = 2.0;
            this.maxRun = random.nextInt(45) + 155;
            this.type = "Cat";
        }

        @Override
        public void swim(int dist) {
            System.out.println("Cat's no swim!");
        }
    }

    public static class Dog extends Animals {
        public Dog(String name) {
            super(name);
            this.type = "Dog";
            this.maxRun = random.nextInt(300) + 300;
            this.maxSwim = random.nextInt(6) + 5;
            this.maxJump = Math.random() * 0.7 + 0.1;
        }
    }
}
