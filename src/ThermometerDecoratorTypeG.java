public class ThermometerDecoratorTypeG extends ThermometerDecorator implements Connect{
    String characteristicTypeGOne;
    String characteristicTypeGTwo;

    public ThermometerDecoratorTypeG(String characteristicOne, String characteristicTwo, String characteristicThree, Thermometer decorTerm) {
        super(characteristicOne, characteristicTwo, characteristicThree, decorTerm);
    }


    @Override
    public void metering() {
        super.metering();
        typeConnect();
    }


    @Override
    public void typeConnect() {
        characteristicTypeGOne = "G";
        characteristicTypeGTwo = "КЕ";
        System.out.println("тип подключения " + characteristicTypeGOne);
        System.out.println("тип сигнала " + characteristicTypeGTwo);
    }
}
