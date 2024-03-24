public class Airport {
    private int hangars;
    private String location;
    public Airport(int hangars, String location){
        this.hangars = hangars;
        this.location = location;
    }

    public int getHangars() {
        return hangars;
    }

    public String getLocation() {
        return location;
    }

    public void setHangars(int hangars) {
        this.hangars = hangars;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void concurrence(){
        System.out.println("La concurrencia de vuelos en este aeropuerto por semana es de "+getHangars()*8);
    }
}
