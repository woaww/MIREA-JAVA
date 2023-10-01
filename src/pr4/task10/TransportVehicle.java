package pr4.task10;

abstract class TransportVehicle {
    private String name;
    private int passengerCapacity;
    private double cargoCapacity;

    public TransportVehicle(String name, int passengerCapacity, double cargoCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.cargoCapacity = cargoCapacity;
    }

    public String getName() {
        return name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    // Метод для подсчета времени перевозки пассажиров
    public abstract double calculatePassengerTransportTime(int distance);

    // Метод для подсчета стоимости перевозки пассажиров
    public abstract double calculatePassengerTransportCost(int distance);

    // Метод для подсчета времени перевозки грузов
    public abstract double calculateCargoTransportTime(int distance, double cargoWeight);

    // Метод для подсчета стоимости перевозки грузов
    public abstract double calculateCargoTransportCost(int distance, double cargoWeight);
}

class Car extends TransportVehicle {
    private double fuelConsumptionRate;
    private double ticketPrice;

    public Car(String name, int passengerCapacity, double cargoCapacity, double fuelConsumptionRate, double ticketPrice) {
        super(name, passengerCapacity, cargoCapacity);
        this.fuelConsumptionRate = fuelConsumptionRate;
        this.ticketPrice = ticketPrice;
    }

    @Override
    public double calculatePassengerTransportTime(int distance) {
        return distance / 100.0; // Пример: 100 км/час
    }

    @Override
    public double calculatePassengerTransportCost(int distance) {
        return distance * (ticketPrice / 100.0);
    }

    @Override
    public double calculateCargoTransportTime(int distance, double cargoWeight) {
        return distance / 80.0; // Пример: 80 км/час для грузового транспорта
    }

    @Override
    public double calculateCargoTransportCost(int distance, double cargoWeight) {
        return (distance * fuelConsumptionRate * 2) + (cargoWeight * 0.1); // Пример расчета стоимости
    }
}

class Airplane extends TransportVehicle {
    private double ticketPrice;

    public Airplane(String name, int passengerCapacity, double cargoCapacity, double ticketPrice) {
        super(name, passengerCapacity, cargoCapacity);
        this.ticketPrice = ticketPrice;
    }

    @Override
    public double calculatePassengerTransportTime(int distance) {
        return distance / 800.0; // Пример: 800 км/час
    }

    @Override
    public double calculatePassengerTransportCost(int distance) {
        return distance * (ticketPrice / 100.0);
    }

    @Override
    public double calculateCargoTransportTime(int distance, double cargoWeight) {
        return distance / 600.0; // Пример: 600 км/час для грузового транспорта
    }

    @Override
    public double calculateCargoTransportCost(int distance, double cargoWeight) {
        return (distance * 0.2) + (cargoWeight * 1.5); // Пример расчета стоимости
    }
}

class Train extends TransportVehicle {
    private double ticketPrice;

    public Train(String name, int passengerCapacity, double cargoCapacity, double ticketPrice) {
        super(name, passengerCapacity, cargoCapacity);
        this.ticketPrice = ticketPrice;
    }

    @Override
    public double calculatePassengerTransportTime(int distance) {
        return distance / 120.0; // Пример: 120 км/час
    }

    @Override
    public double calculatePassengerTransportCost(int distance) {
        return distance * (ticketPrice / 100.0);
    }

    @Override
    public double calculateCargoTransportTime(int distance, double cargoWeight) {
        return distance / 100.0; // Пример: 100 км/час для грузового транспорта
    }

    @Override
    public double calculateCargoTransportCost(int distance, double cargoWeight) {
        return (distance * 0.15) + (cargoWeight * 0.5); // Пример расчета стоимости
    }
}

class Ship extends TransportVehicle {
    private double ticketPrice;

    public Ship(String name, int passengerCapacity, double cargoCapacity, double ticketPrice) {
        super(name, passengerCapacity, cargoCapacity);
        this.ticketPrice = ticketPrice;
    }

    @Override
    public double calculatePassengerTransportTime(int distance) {
        return distance / 40.0; // Пример: 40 км/час
    }

    @Override
    public double calculatePassengerTransportCost(int distance) {
        return distance * (ticketPrice / 100.0);
    }

    @Override
    public double calculateCargoTransportTime(int distance, double cargoWeight) {
        return distance / 30.0; // Пример: 30 км/час для грузового транспорта
    }

    @Override
    public double calculateCargoTransportCost(int distance, double cargoWeight) {
        return (distance * 0.25) + (cargoWeight * 0.3); // Пример расчета стоимости
    }
}



