class Product {
    private String name;
    private String country;
    private double weight;
    private double price;
    private String grade;

    public Product(String name, String country, double weight, double price, String grade) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public double getPrice() {
        return price;
    }
}