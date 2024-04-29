package remote;

import vendors.Lights;

/**
 * Command object to add a new light to the Lights receiver.
 * 
 * @author Grant Noble
 * @version 4/29/2024
 */
public class AddLights implements LightCommand {
    
    /**
     * Receiver for command.
     */
    private Lights lights;

    /**
     * The name of the light to add.
     */
    private String lightName;

    /**
     * Creates new AddLights with the specified lights receiver and light name.
     * 
     * @param lights the lights receiver
     * @param lightName the name of the light to add
     */
    public AddLights(Lights lights, String lightName) {
        this.lights = lights;
        this.lightName = lightName;
    }

    /**
     * Executes command by adding the specified light.
     */
    @Override
    public void execute() {
        lights.addLight(lightName);
    }
}
