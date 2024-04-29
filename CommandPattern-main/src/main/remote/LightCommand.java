package remote;

/**
 * Interface for light commands.
 * 
 * @author Grant Noble
 * @version 4/29/2024
 */
public interface LightCommand {
    
    /**
     * Executes the command to control/add/remove lights.
     */
    void execute();
}
