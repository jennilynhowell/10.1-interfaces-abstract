/**
 * Created by jennilynhowell on 7/24/17.
 */
public class Vacuum implements IPluggable {

    private boolean power = false;

    public void plugIn() {
        System.out.println("Vacuum plugged in!");
        this.power = true;
    }

    @Override
    public void plugIn(Outlet outlet) {

    }

    @Override
    public void unplug() {
        System.out.println("Vacuum unplugged.");
        this.power = false;
    }
}
