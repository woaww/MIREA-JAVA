package pr4.task10;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Автомобиль", 4, 500.0, 10.0, 10.0);
        Airplane airplane = new Airplane("Самолет", 150, 5000.0, 200.0);
        Train train = new Train("Поезд", 300, 10000.0, 5.0);
        Ship ship = new Ship("Корабль", 1000, 20000.0, 50.0);

        int distance = 500; // Расстояние в километрах
        double cargoWeight = 1000.0; // Вес груза в килограммах

        System.out.println("Перевозка пассажиров:");
        System.out.println(car.getName() + ": Время - " + car.calculatePassengerTransportTime(distance) + " часов, Стоимость - $" + car.calculatePassengerTransportCost(distance));
        System.out.println(airplane.getName() + ": Время - " + airplane.calculatePassengerTransportTime(distance) + " часов, Стоимость - $" + airplane.calculatePassengerTransportCost(distance));
        System.out.println(train.getName() + ": Время - " + train.calculatePassengerTransportTime(distance) + " часов, Стоимость - $" + train.calculatePassengerTransportCost(distance));
        System.out.println(ship.getName() + ": Время - " + ship.calculatePassengerTransportTime(distance) + " часов, Стоимость - $" + ship.calculatePassengerTransportCost(distance));

        System.out.println("Перевозка грузов:");
        System.out.println(car.getName() + ": Время - " + car.calculateCargoTransportTime(distance, cargoWeight) + " часов, Стоимость - $" + car.calculateCargoTransportCost(distance, cargoWeight));
        System.out.println(airplane.getName() + ": Время - " + airplane.calculateCargoTransportTime(distance, cargoWeight) + " часов, Стоимость - $" + airplane.calculateCargoTransportCost(distance, cargoWeight));
        System.out.println(train.getName() + ": Время - " + train.calculateCargoTransportTime(distance, cargoWeight) + " часов, Стоимость - $" + train.calculateCargoTransportCost(distance, cargoWeight));
        System.out.println(ship.getName() + ": Время - " + ship.calculateCargoTransportTime(distance, cargoWeight) + " часов, Стоимость - $" + ship.calculateCargoTransportCost(distance, cargoWeight));
    }
}