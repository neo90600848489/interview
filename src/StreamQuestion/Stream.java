package StreamQuestion;

import CommonModel.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;




public class Stream {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        // Adding 50 employees to the list
        employeeList.add(new Employee("Emily", 32));
        employeeList.add(new Employee("Michael", 45));
        employeeList.add(new Employee("Sarah", 28));
        employeeList.add(new Employee("David", 36));
        employeeList.add(new Employee("Jessica", 39));
        employeeList.add(new Employee("Kevin", 33));
        employeeList.add(new Employee("Amanda", 41));
        employeeList.add(new Employee("Jason", 27));
        employeeList.add(new Employee("Melissa", 34));
        employeeList.add(new Employee("Christopher", 50));
        employeeList.add(new Employee("Samantha", 31));
        employeeList.add(new Employee("Matthew", 37));
        employeeList.add(new Employee("Jennifer", 43));
        employeeList.add(new Employee("Daniel", 29));
        employeeList.add(new Employee("Ashley", 38));
        employeeList.add(new Employee("Joshua", 26));
        employeeList.add(new Employee("Elizabeth", 42));
        employeeList.add(new Employee("Ryan", 35));
        employeeList.add(new Employee("Kimberly", 44));
        employeeList.add(new Employee("Andrew", 30));
        employeeList.add(new Employee("Nicole", 49));
        employeeList.add(new Employee("Justin", 25));
        employeeList.add(new Employee("Megan", 40));
        employeeList.add(new Employee("Brian", 48));
        employeeList.add(new Employee("Rachel", 24));
        employeeList.add(new Employee("Timothy", 47));
        employeeList.add(new Employee("Lauren", 23));
        employeeList.add(new Employee("Joseph", 46));
        employeeList.add(new Employee("Stephanie", 22));
        employeeList.add(new Employee("Brandon", 55));
        employeeList.add(new Employee("Michelle", 21));
        employeeList.add(new Employee("Alexander", 54));
        employeeList.add(new Employee("Tiffany", 20));
        employeeList.add(new Employee("Patrick", 53));
        employeeList.add(new Employee("Brittany", 19));
        employeeList.add(new Employee("Nathan", 52));
        employeeList.add(new Employee("Victoria", 18));
        employeeList.add(new Employee("Eric", 51));
        employeeList.add(new Employee("Kelly", 17));
        employeeList.add(new Employee("Zachary", 56));
        employeeList.add(new Employee("Christina", 16));
        employeeList.add(new Employee("Gregory", 57));
        employeeList.add(new Employee("Amber", 15));
        employeeList.add(new Employee("Kyle", 58));
        employeeList.add(new Employee("Jamie", 14));
        employeeList.add(new Employee("Tyler", 59));
        employeeList.add(new Employee("Heather", 13));
        employeeList.add(new Employee("Samuel", 60));
        employeeList.add(new Employee("Maria", 12));
        employeeList.add(new Employee("Jeffrey", 61));

        // all stream function
        // map
        List<Employee> employeesWithUpperCaseNames1 = employeeList.stream()
                .map(employee -> {
                    employee.setFirstName(employee.getFirstName().toUpperCase());
                   return  employee;
                })
                .collect(Collectors.toList());



        List<Employee> employeesWithUpperCaseNames2 = employeeList.stream()
                .map(Employee::withUpperCaseFirstName)
                .collect(Collectors.toList());



        System.out.println(employeesWithUpperCaseNames1.equals(employeesWithUpperCaseNames2));

    //    System.out.println(employeesWithUpperCaseNames1.equals(employeesWithUpperCaseNames2));
    }

}
