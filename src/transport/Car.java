package transport;
import java.util.regex.Pattern;
public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean tiresSummer;


    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int numberOfSeats) {
        if (brand == null) {
            this.brand = "default";
        } else
            this.brand = brand;
        if (model == null) {
            this.model = "default";
        } else
            this.model = model;
        if (engineVolume <= 0.0) {
            this.engineVolume = 1.5;
        } else
            this.engineVolume = engineVolume;

        if (color == null) {
            this.color = "Белый";
        } else
            this.color = color;

        if (year <= 0) {
            this.year = 2000;
        } else
            this.year = year;
        if (country == null) {
            this.country = "default";
        } else
            this.country = country;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = validateCarNumber(registrationNumber);
        this.numberOfSeats = numberOfSeats;
        this.tiresSummer = validateBoolean(tiresSummer);


    }

    public void switchRubber() {
        setTiresSummer(this.tiresSummer);
    }

    public static Boolean validateBoolean(Boolean value) {
        return value != null && value;
    }

    public String validateCarNumber(String number) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}", number)) {
            return number;
        } else {
            System.out.println("номер некорректный");
            return "неверный номер";
        }
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public double getEngineVolume() {
        return this.engineVolume;
    }

    public String getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

    public String getCountry() {
        return this.country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = "не указана";
        }
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "нет номера";
        }
    }

    public String getBodyType() {
        return this.bodyType;
    }

    public void setBodyType(String bodyType) {
        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "нет данных";
        }
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        if (numberOfSeats > 0) {
            this.numberOfSeats = numberOfSeats;
        } else {
            this.numberOfSeats = Math.abs(numberOfSeats);
        }
    }

    public boolean getTiresSummer() {
        return tiresSummer;
    }

    public void setTiresSummer(boolean tiresSummer) {
        this.tiresSummer = tiresSummer;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getYear() + " год выпуска, " + "сборка в " + getCountry() + ", " + getColor() + " цвета, объем двигателя: " + getEngineVolume() + "л."
                + " коробка передач " + getTransmission() + "; тип кузова: " + getBodyType() + "; регистрационный номер: " + getRegistrationNumber()
                + "; количество мест: " + getNumberOfSeats() + "; резина - " + getTiresSummer();
    }
}
