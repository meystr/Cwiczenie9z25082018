package pl.sda;

public class Telefon extends  UrzadzenieElektroniczne{
    private String name;
    private String prize;

    public  Telefon(){
        super(weight);

    }
    public void makeFoto(){
        System.out.println("Zdjęcie zrobione!");
    }
    public String Telefon(String name,String prize){
        String this.name = name;
    }

    public void turnOn(){
        System.out.println("Włączono telefon!");
    }

}
