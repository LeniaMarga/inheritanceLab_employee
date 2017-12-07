package Management;

public class Director extends Manager {

    Double budget;

    public Director(String name, String ni, Double salary, String deptName, Double budget) {
        super (name, ni, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    public double payBonus() {
        return this.salary*0.02;
    }
}
