//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Clase avion, con agregacion de reserva, e interfaz de volador
        Plane boeing747 = new Plane(215, 25000, new Reservation("29/03/2024", "Paris"));
        //Clase piloto y pasajero con herencia de clase abracta persona
        Pilot theFirst = new Pilot("Juan Cortez", 32, 34567876, 23443123, 6);
        Passenger theSubFirst = new Passenger("Hernan Rodriguez", 28, 44038328, "A33", "Comercial");
        //Clase aeropuerto
        Airport theFirstPlace = new Airport(8, "Ezeiza BS");
        //Metodos
        theFirst.timeToRetire();
        theFirst.info();
        theSubFirst.scanLuggage();
        theSubFirst.info();
        boeing747.getReservation().infoReservation();
        theFirstPlace.concurrence();
    }
}