public class Reservation {
    private String date;
    private String destination;
    public Reservation(String date, String destination){
        this.date = date;
        this.destination = destination;
    }
    public Reservation(){}

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void infoReservation(){
        System.out.println("Fecha de reserva: "+getDate());
        System.out.println("Destino de vuelo: "+getDestination());
    }
}
