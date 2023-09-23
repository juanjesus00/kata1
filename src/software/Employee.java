package software;

public class Employee {
    private String Name;
    private int Salary;
    private int NetSalary;
    public Employee(String name, int salary){
        this.Name = name;
        this.Salary = salary;
        this.SetNetSalary();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    private void SetNetSalary() {
        this.NetSalary = (int)(this.Salary * 0.85);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Salary=" + Salary +
                ", NetSalary=" + NetSalary +
                '}';
    }
}
