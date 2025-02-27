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

        printSeparator(); // разделитель заданий из 1ого и 2ого этапа

        System.out.println();
        indexingSelary(10);
        printEmployees();

        System.out.println("\nСотрудник с минимальной ЗП - " + getEmployeeMinSalaryDepartment(1));
        System.out.println("\nСотрудник с минимальной ЗП - " + getEmployeeMinSalaryDepartment(2));
        System.out.println("\nСотрудник с минимальной ЗП - " + getEmployeeMinSalaryDepartment(3));
        System.out.println("\nСотрудник с минимальной ЗП - " + getEmployeeMinSalaryDepartment(4));
        System.out.println("\nСотрудник с минимальной ЗП - " + getEmployeeMinSalaryDepartment(5));

        System.out.println("\nСотрудник с максимальной ЗП - " + getEmployeeMaxSalaryDepartment(1));
        System.out.println("\nСотрудник с максимальной ЗП - " + getEmployeeMaxSalaryDepartment(2));
        System.out.println("\nСотрудник с максимальной ЗП - " + getEmployeeMaxSalaryDepartment(3));
        System.out.println("\nСотрудник с максимальной ЗП - " + getEmployeeMaxSalaryDepartment(4));
        System.out.println("\nСотрудник с максимальной ЗП - " + getEmployeeMaxSalaryDepartment(5));

        System.out.println("\nСумма затрат на ЗП в месяц по отделу составила " + getSumSalaryMonthDepartment(1));
        System.out.println("\nСумма затрат на ЗП в месяц по отделу составила " + getSumSalaryMonthDepartment(2));
        System.out.println("\nСумма затрат на ЗП в месяц по отделу составила " + getSumSalaryMonthDepartment(3));
        System.out.println("\nСумма затрат на ЗП в месяц по отделу составила " + getSumSalaryMonthDepartment(4));
        System.out.println("\nСумма затрат на ЗП в месяц по отделу составила " + getSumSalaryMonthDepartment(5));

        System.out.println("\nСреднее значение зарплаты по отделу в месяц составляет " + getPerMediumSalaryDepartment(1));
        System.out.println("\nСреднее значение зарплаты по отделу в месяц составляет " + getPerMediumSalaryDepartment(2));
        System.out.println("\nСреднее значение зарплаты по отделу в месяц составляет " + getPerMediumSalaryDepartment(3));
        System.out.println("\nСреднее значение зарплаты по отделу в месяц составляет " + getPerMediumSalaryDepartment(4));
        System.out.println("\nСреднее значение зарплаты по отделу в месяц составляет " + getPerMediumSalaryDepartment(5));

        indexingSelaryDepartment(5, 1);
        indexingSelaryDepartment(10, 2);
        indexingSelaryDepartment(15, 3);
        indexingSelaryDepartment(20, 4);
        indexingSelaryDepartment(25, 5);

        System.out.println();
        printFullNameSalaryEmployees();

        System.out.println();
        printEmployeeSalaryLessBase(150_000);

        System.out.println();
        printEmployeeSalaryMoreBase(190_000);

    }

    // методы "Базовая сложность"

    //Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString));
    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    // Посчитать сумму затрат на ЗП в месяц;
    public static double getSumSalaryMonth() {
        double sumSalaryMonth = 0;
        for (Employee employee : employees) {
            sumSalaryMonth += employee.getSalary();
        }
        return sumSalaryMonth;
    }
    //Найти сотрудника с минимальной ЗП;
    public static Employee getEmployeeMinSalary() {
        Employee employeeMinSalary = null;
        for (Employee employee : employees) {
            if (employeeMinSalary == null || employee.getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }
    // Найти сотрудника с максимальной ЗП;
    public static Employee getEmployeeMaxSalary() {
        Employee employeeMaxSalary = null;
        for (Employee employee : employees) {
            if (employeeMaxSalary == null || employee.getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }
    // Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b);
    public static double getPerMediumSalary() {
        return getSumSalaryMonth() / employees.length;
    }
    // Распечатать ФИО всех сотрудников (метод void).
    public static void printFullNameEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    // методы "Повышенная сложность"

    //Проиндексировать зарплату (вызвать изменение зп у всех сотрудников на величину аргумента в %)
    public static Employee[] indexingSelary(double percentIndexSalaru) {
        double percentIndexingSalaru;
        for (int i = 0; i < employees.length; i++) {
            percentIndexingSalaru = employees[i].getSalary() + employees[i].getSalary() * percentIndexSalaru / 100;
            employees[i].setSalary(percentIndexingSalaru);
        }
        return employees;
    }

    //минимум в отделе
    public static Employee getEmployeeMinSalaryDepartment(int department) {
        Employee employeeMinSalaryDepartment = null;
        for (int i = 0; i < employees.length; i++) {
            department = employees[i].getDepartment();
            if (employeeMinSalaryDepartment == null || employees[i].getSalary() < employeeMinSalaryDepartment.getSalary()) {
                employeeMinSalaryDepartment = employees[i];
            }
        }
        return employeeMinSalaryDepartment;
    }

    //максимум в отделе
    public static Employee getEmployeeMaxSalaryDepartment(int department) {
        Employee getEmployeeMaxSalaryDepartment = null;
        for (Employee employee : employees) {
            if (getEmployeeMaxSalaryDepartment == null || employee.getSalary() > getEmployeeMaxSalaryDepartment.getSalary() && department >= 1 || department <= 5) {
                getEmployeeMaxSalaryDepartment = employee;
            }
        }
        return getEmployeeMaxSalaryDepartment;
    }

    //сумма по отделу
    public static double getSumSalaryMonthDepartment(int department) {
        double sumSalaryMonthDepartment = 0;
        for (Employee employee : employees) {
            department = employee.getDepartment();
            sumSalaryMonthDepartment += employee.getSalary();
        }
        return sumSalaryMonthDepartment;
    }

    //средняя по отделу
    public static double getPerMediumSalaryDepartment(int department) {
        int d = 0;
        for (int i = 0; i < employees.length; i++) {
            if (department == employees[i].getDepartment()) {
                d++;
            }
        }
        return getSumSalaryMonthDepartment(department) / d;
    }

    //индексация по отделу
    public static Employee[] indexingSelaryDepartment(double percentIndexSalary, int department) {
        double percentIndexingSalaryDepartment;
        for (int i = 0; i < employees.length; i++) {
            if (department == employees[i].getDepartment()) {
                percentIndexingSalaryDepartment = employees[i].getSalary() + employees[i].getSalary() * percentIndexSalary / 100;
                employees[i].setSalary(percentIndexingSalaryDepartment);
            }
        }
        return employees;
    }

    //Напечатать всех сотрудников отдела (все данные, кроме отдела)
    public static void printFullNameSalaryEmployees() {
        for (Employee employee : employees) {
            System.out.println("ФИО - " + employee.getFullName() + " , ЗП - " + employee.getSalary());
        }
    }

    //Получить в качестве параметра число и вывести - Всех сотрудников с зп меньше числа (распечатать id, фио и зп в консоль)
    public static Employee printEmployeeSalaryLessBase(int base) {
        Employee employeeSalaryLessBase = null;
        for (Employee employee : employees) {
            if (employeeSalaryLessBase == null || employee.getSalary() < base) {
                employeeSalaryLessBase = employee;
            }
        }
        return employeeSalaryLessBase;
    }

    //Получить в качестве параметра число и вывести - Всех сотрудников с зп больше (или равно) числа (распечатать id, фио и зп в консоль)
    public static Employee printEmployeeSalaryMoreBase(int base) {
        Employee employeeSalaryMoreBase = null;
        for (Employee employee : employees) {
            if (employeeSalaryMoreBase == null || employee.getSalary() > base) {
                employeeSalaryMoreBase = employee;
            }
        }
        return employeeSalaryMoreBase;
    }
    public static void printSeparator() {
        System.out.println("\n========================================================================================");
    }

}