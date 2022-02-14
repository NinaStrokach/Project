public class task6 {

public static void main(String[] args) {

    Cat catLeo = new Cat();
    catLeo.run(201);
    catLeo.swim(1);


    Dog dogBars = new Dog();
    dogBars.run(500);
    dogBars.swim(10);

        System.out.println("Всего животных создано: " + Animal.getCount());
        System.out.println();
        System.out.println("Кот Лео пробежал"+ catLeo.run()+"m"); //не знаю как передать значения  catLeo.run
        System.out.println("Собака Барс пробежал"+dogBars.run()+"m";
        System.out.println("Собака Барс проплыл"+dogBars.swim()+"м";

        }}


    abstract class Animal {


        abstract void run(int length);
        abstract void swim(int length);
        private static int count;

        public Animal() {
            count++;
        }

        public static int getCount() {
            return count;
        }

    }

    class Cat extends Animal {
        private final int MAX_RUN_LENGTH = 200;


        @Override
        void run(int length) {
            if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Кот пробежал:"+MAX_RUN_LENGTH+"m");
            else System.out.println("Кот не может бегать больше: " + MAX_RUN_LENGTH+ "м");
        }

        @Override
        void swim(int length) {
            System.out.println("Кот не умеет плавать");
        }


    }

    class Dog extends Animal {
        private final int MAX_RUN_LENGTH = 500;
        private final int MAX_SWIM_LENGTH = 10;


        @Override
        void run(int length) {
            if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Собака пробежала меньше: "+MAX_RUN_LENGTH+"m");
            else System.out.println("Собака не может бегать больше: " + MAX_RUN_LENGTH+"м");
        }

        @Override
        void swim(int length) {
            if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) System.out.println("Собака проплыла меньше: "+MAX_SWIM_LENGTH+"m");
            else System.out.println("Собака не может плыть больше:" + MAX_SWIM_LENGTH+"м");
        }

    }

