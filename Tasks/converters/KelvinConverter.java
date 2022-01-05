package converters;

public class KelvinConverter implements Converter {

    @Override
    public double convert(Double baseValue) {
        return baseValue + 273.15;
    }
}
