public class ThermometerDecoratorTypeK extends  ThermometerDecorator implements Connect{
    String characteristicTypeK;

    public ThermometerDecoratorTypeK(String characteristicOne, String characteristicTwo, String characteristicThree, Thermometer decorTerm) {
        super(characteristicOne, characteristicTwo, characteristicThree, decorTerm);
    }


    @Override
    public void metering() {
        super.metering();
        typeConnect();
    }


    @Override
    public void typeConnect() {
        characteristicTypeK = "K";
        System.out.println("тип подключения " + characteristicTypeK);
    }
}
