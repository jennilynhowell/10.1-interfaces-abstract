public class Main {

    public static void main(String[] args) {
        Stereo boombox = new BoomBox();
        Vacuum hoover = new Vacuum();
        PowerSupply apple = new PowerSupply();

//        boombox.plugIn();
//        hoover.plugIn();
//        apple.plugIn();

        plugInElectronic(boombox);
        plugInElectronic(hoover);
        plugInElectronic(apple);


    }
    //this guarantees the "contract"; these methods have used the implementation properly
    public static void plugInElectronic(IPluggable electronic) {
        electronic.plugIn();
    }

    public static void unplugElectronic(IPluggable electronic) {
        electronic.unplug();
    }
}
