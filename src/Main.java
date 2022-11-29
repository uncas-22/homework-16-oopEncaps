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
        Car lada = new Car("Lada", "Granta", 1.7, "желтого", 2015, "России", "МКПП", "седан", "и878аа", 5);
        Car audi = new Car("Audi", "A8 50L TDI quattro", 3.0, "черного", 2020, "Германии", "АКПП", "внедорожник", "а888аа", 7);
        Car bmw = new Car("BMW", "Z8", 3.0, "черного", 2021, "Германии", "АКПП", "кроссовер", "в777мв", 7);
        Car kia = new Car("Kia", "Sportage", 2.4, "красного", 2018, "Южной Корее", "МКПП", "универсал", "л545би", 5);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевого", 2016, "Южной Корее", "АКПП", "универсал", "к22222иа", 5);
        lada.setTiresSummer(true);
        hyundai.setTiresSummer(true);
        lada.switchRubber();
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println("\n");

        Flower roseFlower = new Flower("Роза обыкновенная", " ", "Голландии", 35.59, 0);
        Flower bouquetFlowers = new Flower("", "", "", 0.00, 0);
        Flower chrysanthemumFlower = new Flower("Хризантема", " ", " ", 15.00, 5);
        Flower pionFlower = new Flower("Пион", "", "Англия", 69.9, 1);
        Flower gypsophilaFlower = new Flower("Гипсофила", "", "Турция", 19.5, 10);

        System.out.println(roseFlower);
        System.out.println(pionFlower);
        roseFlower.setFlowerColor("  ");
        roseFlower.setCost(36.59);
        System.out.println(roseFlower);
        //собираем букет
        System.out.println();
        bouquetFlowers.addBouquet(pionFlower);
        bouquetFlowers.addBouquet(roseFlower);
        bouquetFlowers.addBouquet(gypsophilaFlower);
        bouquetFlowers.addBouquet(pionFlower);
        bouquetFlowers.addBouquet(pionFlower);
        bouquetFlowers.addBouquet(pionFlower);
        bouquetFlowers.addBouquet(chrysanthemumFlower);
        System.out.println("В букете " + bouquetFlowers.getBouquet().length + " шт.");

        Stack bouquet1 = new Stack();
        for (int i = 0; i < 10; i++) {
            bouquet1.push(i);
        }
        System.out.println("Содержимое букета: " + Arrays.toString(bouquet1.stck));

        bouquet = new Flower[10];
        bouquet[0] = roseFlower;
        bouquet[1] = roseFlower;
        bouquet[2] = pionFlower;
        bouquet[3] = pionFlower;
        bouquet[4] = pionFlower;
        bouquet[5] = gypsophilaFlower;
        bouquet[6] = chrysanthemumFlower;
        bouquet[7] = chrysanthemumFlower;
        bouquet[8] = chrysanthemumFlower;
        bouquet[9] = chrysanthemumFlower;

        System.out.println("Состав букета: " + Arrays.toString(bouquet));

        System.out.println("Цена за букет: " + calculateSumCost() + " рублей ");
        System.out.println("Срок стояния букета: " + getMInLifeSpan(bouquet));
        System.out.println(pionFlower.getCounter());

    }

    public static double calculateSumCost() {
        double sum = 0;
        for (int i = 0; i < bouquet.length; i++) {
            if (bouquet[i] != null) {
                sum = sum + bouquet[i].getCost();
            }
        }
        sum = sum + sum * 0.1;
        return sum;
    }

    public static int getMInLifeSpan (Flower [] flowers) {
        int min = flowers[0].getLifeSpan();
        for (Flower flower : flowers) {
            if (flower.getLifeSpan() < min) {
                min = flower.getLifeSpan();
            }
        }
        return min;
    }
}