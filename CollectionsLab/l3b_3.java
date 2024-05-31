import java.util.HashSet;

class Employee {
    int employeeID;
    String employeeName;

    public Employee(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return employeeID == employee.employeeID;
    }
}
public class l3b_3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Akanksha");
        Employee emp2 = new Employee(2, "Apurva");
        Employee emp3 = new Employee(3, "Sakshi");
        Employee emp4 = new Employee(1, "XYZ");
        HashSet<Employee> employeeSet = new HashSet<>();
        employeeSet.add(emp1);
        employeeSet.add(emp2);
        employeeSet.add(emp3);
        employeeSet.add(emp4); 
      for (Employee emp : employeeSet) {
            System.out.println("Employee ID: " + emp.employeeID + ", Name: " + emp.employeeName);
        }
    }
}
