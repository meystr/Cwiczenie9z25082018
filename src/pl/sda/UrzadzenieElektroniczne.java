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
    public void setColor(String color) {
        color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}
