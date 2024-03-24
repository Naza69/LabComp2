public class Pilot extends Person{
    private int licence;
    private int experience;
    public Pilot(String name, int age, int nid, int licence, int experience){
        super(name, age, nid);
        this.licence = licence;
        this.experience = experience;
    }
    public Pilot(){}

    public int getLicence() {
        return licence;
    }

    public int getExperience() {
        return experience;
    }

    public void setLicence(int licence) {
        this.licence = licence;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public void timeToRetire(){
        System.out.println("La edad de retiro es a los 65, un piloto comercial no puede superarla.");
        System.out.println(getName()+" se retirara dentro de "+((-65)-getAge())+" año/s.");
    }
    @Override
    public void info() {
        super.info();
        System.out.println("Esta persona es un piloto.");
        System.out.println("Licencia: "+getLicence());
        System.out.println("Experiencia: "+getExperience());
    }

}
