public class Plane implements Flyer{
    private int capacity;
    private int fuel;
    private Reservation reservation;
    public Plane(int capacity, int fuel, Reservation reservation){
        this.capacity = capacity;
        this.fuel = fuel;
        this.reservation = new Reservation();
    }
    public Plane(){}

    public int getCapacity() {
        return capacity;
    }

    public int getFuel() {
        return fuel;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
