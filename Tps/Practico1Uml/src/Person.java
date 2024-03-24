public abstract class Person {
    private String name;
    private int age;
    private int nid;
    public Person(String name, int age, int nid){
        this.name = name;
        this.age = age;
        this.nid = nid;
    }
    public Person(){}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDni() {
        return nid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDni(int dni) {
        this.nid = nid;
    }

    public void info(){
        System.out.println("Nombre: "+(getName()));
        System.out.println("Edad: "+(getAge()));
        System.out.println("Dni: "+(getDni()));
    }
}
