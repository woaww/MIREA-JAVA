package pr4.task2;

public class Phone {
    private String number;
    private String model;
    private double weight;

    // Конструктор с тремя параметрами
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор с двумя параметрами
    public Phone(String number, String model) {
        this(number, model, 0.0); // Вызываем конструктор с тремя параметрами, передавая weight по умолчанию
    }

    // Конструктор без параметров
    public Phone() {
        this("", "", 0.0); // Вызываем конструктор с тремя параметрами, передавая все значения по умолчанию
    }

    // Метод для получения номера телефона
    public String getNumber() {
        return number;
    }

    // Метод для принятия звонка
    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    // Перегруженный метод для принятия звонка с указанием номера
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + " (" + callerNumber + ")");
    }

    // Метод для отправки сообщения с переменным числом аргументов
    public void sendMessage(String... numbers) {
        System.out.println("Отправить сообщение на следующие номера:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        // Создаем три экземпляра класса Phone с разными параметрами
        Phone phone1 = new Phone("123456789", "iPhone 12", 0.2);
        Phone phone2 = new Phone("987654321", "Samsung Galaxy S21");
        Phone phone3 = new Phone();

        // Выводим информацию о каждом из объектов
        System.out.println("Телефон 1: Номер - " + phone1.getNumber() + ", Модель - " + phone1.model + ", Вес - " + phone1.weight);
        System.out.println("Телефон 2: Номер - " + phone2.getNumber() + ", Модель - " + phone2.model + ", Вес - " + phone2.weight);
        System.out.println("Телефон 3: Номер - " + phone3.getNumber() + ", Модель - " + phone3.model + ", Вес - " + phone3.weight);

        // Принимаем звонки и отправляем сообщения
        phone1.receiveCall("Алиса");
        phone2.receiveCall("Боб", "555-1234");
        phone3.sendMessage("111-222-333", "444-555-666");
    }
}

