public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Андрей", "Иванов", "Романович", 1, 20000.00);
        employees[1] = new Employee("Анна", "Петрова", "Афанасьевна", 4, 25000.00);
        employees[2] = new Employee("Инна", "Сидорова", "Александровна", 2, 27000.00);
        employees[3] = new Employee("Петр", "Алексеев", "Павлович", 5, 24000.00);
        employees[4] = new Employee("Анатолий", "Клементьев", "Петрович", 3, 28000.00);
        employees[5] = new Employee("Степан", "Максимов", "Дмитриевич", 4, 23000.00);
        employees[6] = new Employee("Татьяна", "Ульянова", "Сергеевна", 1, 30000.00);
        employees[7] = new Employee("Кристина", "Нестерова", "Захаровна", 2, 32000.00);
        employees[8] = new Employee("Михаил", "ПОтапов", "Анатольевич", 5, 31000.00);
        employees[9] = new Employee("Александр", "Шишкин", "Афанасьевич", 3, 30000.00);

        getAllEmployees();
        getSumSalaryPerMonth();
        getMinSalary();
        getMaxSalary();
        //Посчитать среднее значение зарплат
        System.out.println("Средняя зарплата" + getSumSalaryPerMonth() / employees.length);
        getFullName();

    }

    // Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
    public static void getAllEmployees() {
        if (employees != null) {
            for (Employee employee : employees) {

                System.out.println(employee);
            }
        }
    }

    // Посчитать сумму затрат на зарплаты в месяц
    public static double getSumSalaryPerMonth() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee == null) continue;
            sum += employee.getSalary();
        }
        System.out.println("Сумма зарплат всех работников: " + sum);
        return sum;
    }

    // Найти сотрудника с минимальной зарплатой.
    public static Employee getMinSalary() {
        double min = 0;
        int index = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                min = employees[i].getSalary();
                index = i;
                break;
            }

        }
        Employee minSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                minSalary = employees[i];
            }
        }
        System.out.println("Минимальная зарплата: " + minSalary);
        return minSalary;
    }

    // Найти сотрудника с максимальной зарплатой.
    public static Employee getMaxSalary() {
        double max = 0;
        int index = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                max = employees[i].getSalary();
                index = i;
                break;
            }

        }
        Employee maxSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                maxSalary = employees[i];
            }
        }
        System.out.println("Максимальная зарплата: " + maxSalary);
        return maxSalary;

    }

    // Получить Ф. И. О. всех сотрудников (вывести в консоль).
    public static void getFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}