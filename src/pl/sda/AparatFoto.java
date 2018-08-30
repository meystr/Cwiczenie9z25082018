package pl.sda;

public class AparatFoto extends UrzadzenieElektroniczne{
    private String typeMatrix ;
    private int rozdzielczoscAparatu;

    public void AparatFoto(){
    this.typeMatrix = typeMatrix;
    }

    public AparatFoto(String name) {
        super(name);
    }
    public AparatFoto(int rozdzielczoscAparatu, String color){
        super (color);
        super.setHeight(123);
        super.setLenght(432);
        super.setWidth(744);
        System.out.println("bla bla");
    }
}
