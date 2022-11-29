
import java.util.Arrays;
import java.util.Objects;

    public class Flower {
        Flower[] bouquet;
        private String flowerName;
        private String flowerColor;
        private String country;
        private double cost;
        public int lifeSpan;
        private static int counter = 0;

        private int id;

        public Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
            this.flowerName = flowerName;
            this.flowerColor = flowerColor;
            this.country = country;
            this.cost = cost;
            if (lifeSpan > 0) {
                this.lifeSpan = lifeSpan;
            } else {
                this.lifeSpan = 3;
            }
            counter++;
            this.id = counter;
        }


        public  int getCounter() {
            return counter;
        }
        public int getId() {
            return id;
        }

        public String getFlowerName() {
            return this.flowerName;
        }

        public void setFlowerName(String flowerName) {
            this.flowerName = flowerName;
        }

        public String getFlowerColor() {
            return this.flowerColor;
        }

        public void setFlowerColor(String flowerColor) {
            if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
                this.flowerColor = flowerColor;
            } else {
                this.flowerColor = "белый";
            }
        }

        public String getCountry() {
            return this.country;
        }

        public void setCountry(String country) {
            if (country != null && !country.isEmpty() && !country.isBlank()) {
                this.country = country;
            } else {
                this.country = "Россия";
            }
        }

        public double getCost() {
            return this.cost;
        }

        public void setCost(double cost) {
            if (cost > 0) {
                this.cost = cost;

            } else {
                this.cost = 1.00;
            }
        }

        public int getLifeSpan() {
            return this.lifeSpan;
        }


        public void setLifeSpan(int lifeSpan) {
            if (lifeSpan > 0) {
                this.lifeSpan = lifeSpan;
            } else {
                this.lifeSpan = 3;
            }
        }

        Flower[] getBouquet() {
            if (bouquet == null) {
                bouquet = new Flower[0];
            }
            return this.bouquet;
        }

        public void addBouquet(Flower bouquets) {
            Flower[] bouquet = new Flower[getBouquet().length + 1];
            this.bouquet = Arrays.copyOf(getBouquet(), getBouquet().length + 1);
            this.bouquet[this.bouquet.length - 1] = bouquets;
        }



        @Override
        public String toString() {
            return ("Название цветка: " + getFlowerName() + ", из " + getCountry() + ", цвет " + getFlowerColor() + " , стоимость штуки -  " + getCost() + " рублей, " + " срок состояния - " + (int) lifeSpan) + " д." + " id " + getId();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Flower flower = (Flower) o;
            return Double.compare(flower.cost, cost) == 0 && Objects.equals(flowerName, flower.flowerName) && Objects.equals(flowerColor, flower.flowerColor) && Objects.equals(country, flower.country) && Objects.equals(lifeSpan, flower.lifeSpan);
        }

        @Override
        public int hashCode() {
            return Objects.hash(flowerName, flowerColor, country, cost, lifeSpan);
        }
}
