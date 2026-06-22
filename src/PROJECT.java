class Employee{
    private String fio;
    private double salary;
    private int department;
    private int id;

    static int idCounter = 0;

    public Employee(String fio, double salary, int department) {
        this.fio = fio;
        this.salary = salary;
        this.department = department;
        this.id = idCounter;
        idCounter++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                ", id=" + id +
                '}';
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Employee.idCounter = idCounter;
    }
}

class BookEmployees{
    Employee[] employees = {
            new Employee("Смирнов Александр Петрович", 320000, 1),
            new Employee("Кузнецов Дмитрий Сергеевич", 210000, 2),
            new Employee("Попов Иван Алексеевич", 195000, 2),
            new Employee("Соколов Михаил Иванович", 145000, 3),
            new Employee("Лебедев Андрей Николаевич", 88000, 3),
            new Employee("Козлов Сергей Владимирович", 75000, 4),
            new Employee("Новиков Алексей Дмитриевич", 68000, 4),
            new Employee("Морозов Петр Александрович", 120000, 3),
            new Employee("Волков Роман Евгеньевич", 72000, 4),
            new Employee("Алексеев Олег Константинович", 230000, 2),
            new Employee("Михайлов Евгений Андреевич", 45000, 5),
            new Employee("Егоров Владимир Сергеевич", 38000, 5)
    };

    public void PrintAllEmployees(){
        for(Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }
    public void CalculateSalary(){
        double AllSalary = 0;
        for (Employee emp: employees){
            AllSalary+=emp.getSalary();

        }
        System.out.println(AllSalary);
    }
    public void EmpWithLowestSalary(){
        String Bednyak = "";
        double least = 10000000;
        for (Employee emp: employees){
            if (emp.getSalary()<least){
                least=emp.getSalary();
                Bednyak = emp.getFio();
            }
        }
        System.out.println(Bednyak);
    }
    public void EmpWithLowestSalary(double Salary){
        for (Employee emp:employees){
            if (emp.getSalary()<Salary){
                System.out.println(emp.getId() +" "+ emp.getSalary()+" " + emp.getFio());
            }
        }
    }

    public void EmpWithHighestSalary(){
        String Rich ="";
        double high = 0;
        for (Employee emp: employees) {
            if (emp.getSalary() > high) {
                high = emp.getSalary();
                Rich = emp.getFio();
            }
        }
        System.out.println(Rich);
    }
    public void EmpWithHighestSalary(double Salary){
        for (Employee emp: employees){
            if (emp.getSalary()>=Salary){
                System.out.println(emp.getId() +" "+ emp.getSalary()+" " + emp.getFio());
            }
        }
    }
    public void CalculateAverageSalary(){
        double itog = 0;
        double AllSalary = 0;
        for (Employee emp: employees){
            AllSalary+=emp.getSalary();
        }
        itog=AllSalary/employees.length;
        System.out.println(String.format("%.2f", itog));



    }
    public void IndexingSalary(){
        double index = 0.09;
        for(Employee emp:employees){
            emp.setSalary(emp.getSalary()*index+emp.getSalary());
            System.out.println("Сотрудник " + emp.getFio() + " "+ emp.getSalary());
        }

    }




}

public class PROJECT {
    public static void section1() {
        BookEmployees be = new BookEmployees();
        be.PrintAllEmployees();
        be.CalculateSalary();
        be.EmpWithLowestSalary();
        be.EmpWithHighestSalary();
        be.CalculateAverageSalary();
        be.IndexingSalary();
        be.EmpWithLowestSalary(60000);
        be.EmpWithHighestSalary(60000);

    }
}
