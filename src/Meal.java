public class Meal {
    private String name;
    private String nationalCuiine;

    public Meal(String name, String nationalCuiine) {
        this.name = name;
        this.nationalCuiine = nationalCuiine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalCuiine() {
        return nationalCuiine;
    }

    public void setNationalCuiine(String nationalCuiine) {
        this.nationalCuiine = nationalCuiine;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", nationalCuiine='" + nationalCuiine + '\'' +
                '}';
    }
}
