package converters;

public class Program {

    public static void main(String[] args) {
        Converter c = Converter.getInstance();
        CelsiusConverter converter = null;
        if (c instanceof CelsiusConverter) {
            converter = (converters.CelsiusConverter) c;
        }
        System.out.println(converter);
    }
}
