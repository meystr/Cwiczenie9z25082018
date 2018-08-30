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
    public void zrobZdjecie(){
        System.out.println("Zrobiono zdjęcie...");
    }
}
