import java.util.HashMap;
import java.util.Map;

@FunctionalInterface
interface LightAction {
    void activate();
}

public class SmartLightingSystem {
    public static void main(String[] args) {
        Map<String, LightAction> lightTriggers = new HashMap<>();

        lightTriggers.put("motion", () -> System.out.println("Motion detected: Lights ON at full brightness"));
        lightTriggers.put("night", () -> System.out.println("Night mode: Lights dimmed"));
        lightTriggers.put("voice", () -> System.out.println("Voice command: Setting mood lighting"));
        lightTriggers.put("morning", () -> System.out.println("Morning mode: Warm soft lighting"));

        executeTrigger(lightTriggers, "motion");
        executeTrigger(lightTriggers, "night");
        executeTrigger(lightTriggers, "voice");
        executeTrigger(lightTriggers, "morning");
    }

    public static void executeTrigger(Map<String, LightAction> map, String trigger) {
        LightAction action = map.get(trigger);
        if (action != null) {
            action.activate();
        } else {
            System.out.println("Unknown trigger");
        }
    }
}