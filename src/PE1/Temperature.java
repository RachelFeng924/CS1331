package PE1;
public class Temperature {
    public static void main(String[] args) {
        float farenheit = 450.0f;

        double celsius = (farenheit - 32)/1.8;

        double kelvin = celsius;

        kelvin += 273.15;

        System.out.println(farenheit);
        System.out.println(celsius);
        System.out.println(kelvin);

    }
}
