lesson1
Задание 1 урока

Разобраться с имеющимся кодом;
Добавить класс Team, который будет содержать: название команды, массив из 4-х участников (т.е. в конструкторе можно сразу всех участников указывать), метод для вывода информации о членах команды прошедших дистанцию, метод вывода информации обо всех членах команды.
Добавить класс Course (полоса препятствий), в котором будут находиться: массив препятствий, метод который будет просить команду пройти всю полосу; То есть в итоге должно быть:
public static void main(String[] args) {

  Course c = new Course(...); // Создаем полосу препятствий

  Team team = new Team(...); // Создаем команду

  c.doIt(team); // Просим команду пройти полосу

  team.showResults(); // Показываем результаты
  
}
