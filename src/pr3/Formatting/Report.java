package pr3.Formatting;

public class Report{
    public static void generateReport(Employee[] employees){
        System.out.println("Отчет о зарплате сотрудников");
        System.out.println("===============================================================");
        System.out.printf("%-30s %15s%n", "ФИО сотрудника", "Зарплата");
        System.out.println("---------------------------------------------------------------");

        for(Employee employee : employees) {
            String fullname = employee.getFullname();
            double salary = employee.getSalary();
            String formattedSalary = String.format("%,10.2f", salary);
            System.out.printf("%-30s %15s%n", fullname, formattedSalary);
        }

        System.out.println("===============================================================");
    }

    public static void main(String[] args){
        Employee[] employees = {
                new Employee("Иван Иванович Иванов", 57600.00),
                new Employee("Петр Петровчи Петров", 84250.00),
                new Employee("Виктор Викторович Викторов", 36800.50)
        };

        generateReport(employees);
    }
}