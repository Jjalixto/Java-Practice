package telefonos;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // tu código aquí
        return "iPhone is ringing with "+ getRingTone();
    }
    @Override
    public String unlock() {
        // tu código aquí
        return "Unlocking iPhone...";
    }
    @Override
    public void displayInfo() {
        // tu código aquí
        System.out.println("iPhone "+ getVersionNumber()+ " from "+ getCarrier());
        System.out.println("Battery Percentage: "+ getBatteryPercentage());
        System.out.println("Ringtone: " + getRingTone());
    }
}

