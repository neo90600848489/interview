package CommonModel;

public class Employee {
    String firstName;
    int age;

    public Employee(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static Employee withUpperCaseFirstName(Employee employee) {
        employee.setFirstName(employee.getFirstName().toUpperCase());
        return employee;
    }
}