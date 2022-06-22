public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Aelx", 2213.42),
                new Employee("Ion", 2343.23),
                new Employee("Oleg", 1323.23)
        };
        double average = average(employees);
        System.out.printf("Average employee salary is %.2f USD", average);
    }

    static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable object : objects) {
            sum += object.getMeasure();
        }
        return sum / objects.length;
    }
}
