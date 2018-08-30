package pl.sda;

public class UrzadzenieElektroniczne {
    private String name;
    private String color;
    private String mark;
    private int width;
    private int height;
    private int lenght;


    public  UrzadzenieElektroniczne(String name){
        this.name = name;
    }
    public UrzadzenieElektroniczne(String name,String Color){
        this.name = name;
        this.color = Color;
    }
    public UrzadzenieElektroniczne(int width, int height, int lenght){
     this.width = width;
     this.height = height;
     this.lenght = lenght;
    }
    public void turnOn(){
        System.out.println("włączono...");
    }
}
