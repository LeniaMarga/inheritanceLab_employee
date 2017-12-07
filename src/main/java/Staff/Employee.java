package Staff;

public class Employee {

    private String name;
    private String ni;
    protected Double salary;

    public Employee(String name, String ni, Double salary ){
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNi() {
        return ni;
    }

    public Double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty ()){
            throw new RuntimeException ("Cannot take in an empty String or null value");
            }
        else this.name = name;
    }

    public void setNi(String ni) {
        this.ni = ni;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void raiseSalary(Double raise){
        if (raise > 0) this.salary += raise;
    }

    public double payBonus() {
        return this.salary*0.01;
    }
}
