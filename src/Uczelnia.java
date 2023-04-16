public class Uczelnia {
    private String Id;
    private String Nazwa;
    private String Miejscowosc;
    private String Opis;

    public Uczelnia(){};

    public Uczelnia(String Id, String Nazwa, String Miejscowosc, String Opis){
        this.Id = Id;
        this.Nazwa = Nazwa;
        this.Miejscowosc = Miejscowosc;
        this.Opis = Opis;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public String getMiejscowosc() {
        return Miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        Miejscowosc = miejscowosc;
    }

    public String getOpis() {
        return Opis;
    }

    public void setOpis(String opis) {
        Opis = opis;
    }

    @Override
    public String toString() {
        return "Uczelnia{" +
                "Id='" + Id + '\'' +
                ", Nazwa='" + Nazwa + '\'' +
                ", Miejscowosc='" + Miejscowosc + '\'' +
                ", Opis='" + Opis + '\'' +
                '}';
    }
}
