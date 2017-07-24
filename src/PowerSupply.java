/**
 * Created by jennilynhowell on 7/24/17.
 */
public class PowerSupply implements IPluggable {

    public void plugIn() {
        System.out.println("Power supply plugged in!");

    }

    @Override
    public void unplug() {
        System.out.println("Power supply unplugged");
    }

    @Override
    public void plugIn(Outlet outlet) {

    }
}
