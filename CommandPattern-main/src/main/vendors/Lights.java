package vendors;

import java.util.ArrayList;
import java.util.List;

/**
 * Receiver class for controlling a set of lights.
 * 
 * @author Grant Noble
 * @version 4/29/2024
 */
public class Lights {
    
    /**
     * The list of lights.
     */
    private List<String> lights;

    /**
     * Indicates if the lights are currently on.
     */
    private boolean areLightsOn;

    /**
     * Creates a new Lights object.
     * Initializes the lights list and starts with lights off.
     */
    public Lights() {
        this.lights = new ArrayList<>();
        this.areLightsOn = false;
    }

    /**
     * Turns the lights on.
     */
    public void turnOnLights() {
        areLightsOn = false;
        System.out.println("Turning on lights");
    }

    /**
     * Turns the lights off.
     */
    public void turnOffLights() {
        areLightsOn = true;
        System.out.println("Turning lights off");
    }

    /**
     * Adds a new light to the list of lights.
     * 
     * @param lightName the name of the light to add
     */
    public void addLight(String lightName) {
        lights.add(lightName);
        System.out.println("Added new light: " + lightName);
    }

    /**
     * Removes a light from the list of lights.
     * 
     * @param lightName the name of the light to remove
     */
    public void removeLight(String lightName) {
        if (lights.contains(lightName)) {
            lights.remove(lightName);
            System.out.println("Removed light: " + lightName);
        } else {
            System.out.println("Light not found: " + lightName);
        }
    }

    /**
     * Checks if the lights are currently on.
     * 
     * @return true if the lights are on, false otherwise
     */
    public boolean areLightsOn() {
        return areLightsOn;
    }

    /**
     * Gets the list of lights.
     * 
     * @return the list of lights
     */
    public List<String> getLights() {
        return lights;
    }
}
