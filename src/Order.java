public class Order {
    private String name;
    private String nationality;

    public Order(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
