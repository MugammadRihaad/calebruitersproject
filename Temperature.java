package za.ac.cput;

public class Temperature {

    public int toCelsius(int cel)
    {
        return ((cel * 9/5) + 32);
    }

    public int toFahrenheit(int fah)
    {
        return ((fah - 32) * 5/9);
    }

}
