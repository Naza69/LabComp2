public class Passenger extends Person{
    private String seat;
    private String classGrade;
    public Passenger(String name, int age, int nid, String seat, String classGrade){
        super(name, age, nid);
        this.seat = seat;
        this.classGrade = classGrade;
    }
    public Passenger(){}

    public String getSeat() {
        return seat;
    }

    public String getClassGrade() {
        return classGrade;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }
    public void scanLuggage(){
        System.out.println("Escaneando equipaje...");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Esta persona es un pasajero.");
        System.out.println("Butaca: "+getSeat());
        System.out.println("Clase de boleto: "+getClassGrade());
    }
}
