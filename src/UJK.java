public class UJK extends Uczelnia{
    private String Dziekan;
    public UJK (){};
    public UJK (String Dziekan){
        this.Dziekan = Dziekan;
    }

    public String getDziekan() {
        return Dziekan;
    }

    public void setDziekan(String dziekan) {
        Dziekan = dziekan;
    }

    @Override
    public String toString() {
        return "UJK{" +
                "Dziekan='" + Dziekan + '\'' +
                '}';
    }
}
