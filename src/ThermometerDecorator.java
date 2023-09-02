public abstract class ThermometerDecorator implements Thermometer{
    String characteristicOne;
    String characteristicTwo;
    String characteristicThree;

    protected Thermometer decorTerm;


    public ThermometerDecorator(String characteristicOne, String characteristicTwo, String characteristicThree, Thermometer decorTerm) {
        this.characteristicOne = characteristicOne;
        this.characteristicTwo = characteristicTwo;
        this.characteristicThree = characteristicThree;
        this.decorTerm = decorTerm;
    }

    public void metering() {
        decorTerm.metering();
        System.out.println("Характеристика термопары: \n"
        + characteristicOne +"\n"
        + characteristicTwo +"\n"
        + characteristicThree
        );
    }
}
