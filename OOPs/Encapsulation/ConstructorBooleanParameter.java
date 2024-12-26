class Light{
    boolean isOn;
    Light(boolean isOn){
        this.isOn = isOn;
    }
}
public class ConstructorBooleanParameter {
    public static void main(String[] args) {
        Light light=new Light(true);
        System.out.println("Is light On? " +light.isOn);
    }
}
