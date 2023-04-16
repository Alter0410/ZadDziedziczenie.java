public class Politechnika_SW extends Uczelnia{
    private String Kierunek;
    public Politechnika_SW(){};
    public Politechnika_SW(String Kierunek){
        this.Kierunek = Kierunek;
    }

    public String getKierunek() {
        return Kierunek;
    }

    public void setKierunek(String kierunek) {
        Kierunek = kierunek;
    }

    @Override
    public String toString() {
        return "Politechnika_SW{" +
                "Kierunek='" + Kierunek + '\'' +
                '}';
    }
}
