import transport.Car;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    private static Flower[] bouquet;

    public static void main(String[] args) {

        //ДЗ часть 2.

        Human maksim = new Human("Максим", 1988, "Ижевск", "бренд-менеджером");
        Human anna = new Human("Аня", 1993, "Москва", "методистом образовательных программ");
        Human katya = new Human("Катя", -1992, "Калининград", "продакт-менеджером");
        Human artem = new Human("Артем", -1995, "Москв", "Диретором по развитию бизнеса");
        Human vladimir = new Human("Владимир", 2001, "Казань", " ");

        vladimir.setYearOfBirth(LocalDate.now().getYear() - vladimir.getYearOfBirth());
        maksim.setTown("Подольск");
        katya.setTown(null);
        anna.setYearOfBirth(-29);
        System.out.println(maksim);
        System.out.println(anna);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println(vladimir);
        System.out.println("\n Задание №3 \n");
    }
}