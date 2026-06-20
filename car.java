public class car extends vehicle {
     

    private int doors;

    public car(int id, String brand, int year, int doors) {
        super(id, brand, year);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doors);
        System.out.println("----------------");
    }
}