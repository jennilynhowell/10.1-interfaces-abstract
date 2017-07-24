/**
 * Created by jennilynhowell on 7/24/17.
 */
public abstract class Stereo implements IPluggable {

    private boolean power = false;

    public void plugIn() {
        System.out.println("Stereo plugged in!");
        this.power = true;
    }

    @Override
    public void unplug() {
        System.out.println("Stereo unplugged.");
        this.power = false;
    }
}
