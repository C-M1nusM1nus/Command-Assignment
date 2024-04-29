package remote;

import vendors.Lights;

/**
 * Command object to remove a light from the Lights receiver.
 * 
 * @author Grant Noble
 * @version 4/29/2024
 */
public class RemoveLights implements LightCommand {
    
    /**
     * Receiver for command.
     */
    private Lights lights;

    /**
     * The name of the light to remove.
     */
    private String lightName;

    /**
     * Creates new RemoveLights with the specified lights receiver and light name.
     * 
     * @param lights the lights receiver
     * @param lightName the name of the light to remove
     */
    public RemoveLights(Lights lights, String lightName) {
        this.lights = lights;
        this.lightName = lightName;
    }

    /**
     * Executes command by removing the specified light.
     */
    @Override
    public void execute() {
        lights.removeLight(lightName);
    }
}
