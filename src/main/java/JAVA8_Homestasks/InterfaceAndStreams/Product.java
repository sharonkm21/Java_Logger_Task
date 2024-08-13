package JAVA8_Homestasks.InterfaceAndStreams;

public class Product
{
    private String name;
    private double price;
    private String category;
    private String grade;

    public Product(String name, double price, String category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade=grade;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", category='" + category + "', grade='" + grade + "'}";
    }
}
