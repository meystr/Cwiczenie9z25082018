package pl.sda;

public class Telefon extends  UrzadzenieElektroniczne{
    private String name;
    private String prize;

    public Telefon(String name, String color){
        super(color);
        this.name = name;

    }
    public void makeFoto(){
        System.out.println("Zdjęcie zrobione!");
    }

    public void turnOn(){
        System.out.println("Włączono telefon!");
    }

}
