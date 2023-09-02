public class Main {
    public static void main(String[] args) {
        Thermometer pt100 = new ThermometerDecoratorTypeG("100", "WWTR", "23e", new PT100());
        pt100.metering();

        Thermometer pt500 = new ThermometerDecoratorTypeK("500", "UA5", "23e", new PT500());

        pt500.metering();
    }
}
