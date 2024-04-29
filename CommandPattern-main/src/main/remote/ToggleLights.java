package remote;

import vendors.Lights;

/**
 * Command object to toggle the lights on and off.
 * 
 * @author Grant Noble
 * @version 4/29/2024
 */
public class ToggleLights implements LightCommand {
    
    /**
     * Receiver for command.
     */
    private Lights lights;

    /**
     * Creates new ToggleLights with the specified lights receiver.
     * 
     * @param lights the lights receiver
     */
    public ToggleLights(Lights lights) {
        this.lights = lights;
    }

    /**
     * Executes command by toggling the lights on and off.
     */
    @Override
    public void execute() {
        if (lights.areLightsOn()) {
            lights.turnOff();
        } else {
            lights.turnOn();
        }
    }
}
