public class bike extends vehicle {

    private boolean sportsBike;

    public bike(int id, String brand, int year, boolean sportsBike) {
        super(id, brand, year);
        this.sportsBike = sportsBike;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();

        if(sportsBike) {
            System.out.println("Sports Bike");
        } else {
            System.out.println("Normal Bike");
        }

        System.out.println("----------------");
    }
}

