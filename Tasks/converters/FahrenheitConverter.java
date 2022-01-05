package converters;

public class FahrenheitConverter implements Converter {

    @Override
    public double convert(Double baseValue) {
       return baseValue * 1.8 + 32;
    }
}
