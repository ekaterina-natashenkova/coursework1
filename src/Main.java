public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Есенин Сергей Александрович", 1, 140_000);
        employees[1] = new Employee("Пушкин Александр Сергеевич", 1, 150_000);
        employees[2] = new Employee("Лермонтов Михаил Юрьевич", 1, 130_000);
        employees[3] = new Employee("Чехов Антон Павлович", 2, 140_000);
        employees[4] = new Employee("Куприн Александр Иванович", 2, 130_000);
        employees[5] = new Employee("Толстой Лев Николаевич", 3, 120_000);
        employees[6] = new Employee("Толстой Алексей Константинович", 3, 110_000);
        employees[7] = new Employee("Ахматова Анна Андреевна", 4, 145_000);
        employees[8] = new Employee("Цветаева Марина Ивановна", 4, 145_000);
        employees[9] = new Employee("Достоевский Федор Михайлович", 5, 100_000);

        System.out.println();

        printEmployees();

        System.out.println("\nСумма затрат на ЗП в месяц составила " + getSumSalaryMonth() + " рублей");

        System.out.println("\nСотрудник с минимальной ЗП - " + getEmployeeMinSalary());

        System.out.println("\nСотрудник с максимальной ЗП - " + getEmployeeMaxSalary());

        System.out.println("\nСреднее значение зарплаты в месяц составляет " + getPerMediumSalary() + " рублей\n");

        printFullNameEmployees();
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double getSumSalaryMonth() {
        double sumSalaryMonth = 0;
        for (Employee employee : employees) {
            sumSalaryMonth += employee.getSalary();
        }
        return sumSalaryMonth;
    }

    public static Employee getEmployeeMinSalary() {
        Employee employeeMinSalary = null;
        for (Employee employee : employees) {
            if (employeeMinSalary == null || employee.getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }

    public static Employee getEmployeeMaxSalary() {
        Employee employeeMaxSalary = null;
        for (Employee employee : employees) {
            if (employeeMaxSalary == null || employee.getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }

    public static double getPerMediumSalary(){
        return getSumSalaryMonth() / employees.length;
    }

    public static void printFullNameEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

}