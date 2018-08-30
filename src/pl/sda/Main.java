//9. Tak jak robiliśmy na zajęciach zaprojektuj i opisz klasy dla bytów:
// UrządzenieElektroniczne, AparatFoto, Telefon

package pl.sda;

public class Main {

    public static void main(String[] args) {
        UrzadzenieElektroniczne urzadzenieElektroniczne = new UrzadzenieElektroniczne("samsung");
        AparatFoto aparatFoto = new AparatFoto("CosTam");
        Telefon telefon = new Telefon("Sony","red");

        aparatFoto.zrobZdjecie();
        telefon.makeFoto();
	    }
}
