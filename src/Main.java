public class Main {
    public static void main(String[] args) {

        /*1. Stwórz klasę Uczelnia z polami: id, nazwa, miejscowość, opis. Stwórz dwie klasy:
        UJK (zawiera pole, gdzie jest przechowywana informacja o dziekaznie) oraz Politechnika_Sw –
        gdzie przechowywana jest informacja o kierunkach. Obie te klasy powinny dziedziczyć po klasie Uczelnia.
        W main stwórz obiekty klas i wyświetl podstawowe informację.
         */

        Uczelnia uczelnia = new Uczelnia("357", "Politechnika", "Warszawa", "Najlepsza uczelnia w mieście :)");
        UJK ujk = new UJK("Tadeusz Żak");
        Politechnika_SW politechnika_sw = new Politechnika_SW("Stomatolog");

        System.out.println(uczelnia.toString() + ujk.toString());
        System.out.println("\n");
        System.out.println(politechnika_sw.toString());


    }
}