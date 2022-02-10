public class task5 {
    /*1.Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст
    *2. Конструктор класса должен заполнять эти поля при создании объекта.
    *3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    *4. Создать массив из 5 сотрудников.
    *5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет. */
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Name1", "Manager", "Name1@mail.com", "80001110000",350000,45);
        empCorp[1] = new Employee("Name2", "Engineer", "Name2@mail.com", "80001110001",300000,36);
        empCorp[2] = new Employee("Name3", "Analyst", "Name3@mail.com", "80001110002",230000,41);
        empCorp[3] = new Employee("Name4", "Designer", "Name4@mail.com", "80001110003",110000,32);
        empCorp[4] = new Employee("Name5", "QA", "Name5@mail.com", "80001110004",120000,28);
        for (Employee employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);
    }

}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}