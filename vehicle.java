public class vehicle {

    private int id;
    private String brand;
    private int year;

    public vehicle(int id, String brand, int year) {
        this.id = id;
        this.brand = brand;
        this.year = year;
    }

    public int getId() {
        return id;
    }
    public void setbrand(String brand) {
    this.brand = brand;
}
    public void setyear(int year) {
    this.year = year;
}
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}