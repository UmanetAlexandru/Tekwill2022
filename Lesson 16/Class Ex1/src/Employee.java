public class Employee implements Measurable{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //constructor, getters and setters...

    @Override
    public double getMeasure() {
        return salary;
    }
}
