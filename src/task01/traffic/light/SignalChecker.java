package task01.traffic.light;

/**
 * Class SignalChecker checks what signal shows us traffic light on
 * current minute.
 *
 * @author Selin Roman
 * @version 0.1.3
 */
class SignalChecker {
    private int redDuration = 2;
    private int yellowDuration = 3;
    private int greenDuration = 5;
    private int cycleDuration = redDuration + yellowDuration + greenDuration;
    
    /**
     * First this method finds out what minute of current cycle is now.
     * Then it calculates what signal is being shown on this minute.
     * @param time current minute.
     * @return signal which is being shown now.
     * @throws IllegalArgumentException when time < 0.
     */
    String getTrafficLightSignal(int time) {
        time %= cycleDuration;
        if (time < 0) {
            throw new IllegalArgumentException("Wrong value!");
        } else if (time <= redDuration) {
            return "Red";
        } else if (time <= redDuration + yellowDuration) {
            return "Yellow";
        } else if (time <= cycleDuration) {
            return "Green";
        } else {
            return null;
        }
    }
}
