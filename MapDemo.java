import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, Integer> champs = new HashMap<>();
        champs.put("LeBron", 4);
        champs.put("Kawhi", 2);
        champs.put("Steph", 4);
        champs.put("KD", 2);
        champs.put("Giannis", 1);
        champs.put("Nikola", 1);

        System.out.println("champs: " + champs);
        
        System.out.println("champs keySet: " + champs.keySet());
        System.out.println("champs entrySet: " + champs.entrySet());
        System.out.println();

        System.out.println("Is LeBron a champion? " + champs.containsKey("LeBron"));
        System.out.println("# of championships Lebron has: " + champs.get("LeBron"));
        System.out.println("Is Nikola a champion? " + champs.containsKey("Nikola"));
        System.out.println("# of championships Nikola has: " + champs.get("Nikola"));
        System.out.println("Is Luka a champion? " + champs.containsKey("Luka"));
        System.out.println("# of championships Luka has: " + champs.get("Luka"));

        System.out.println();

        TreeMap<String, Integer> champs_tmap = new TreeMap<>();
        champs_tmap.put("LeBron", 4);
        champs_tmap.put("Kawhi", 2);
        champs_tmap.put("Steph", 4);
        champs_tmap.put("KD", 2);
        champs_tmap.put("Giannis", 1);
        champs_tmap.put("Nikola", 1);

        System.out.println("champs_tmap: " + champs_tmap);
        System.out.println("champs_tmap keySet: " + champs_tmap.keySet());
        System.out.println("champs_tmap entrySet: " + champs_tmap.entrySet());
        System.out.println("champs_tmap firstKey: " + champs_tmap.firstKey());
        System.out.println("champs_tmap firstEntry: " + champs_tmap.firstEntry());
        System.out.println("champs_tmap lastKey: " + champs_tmap.lastKey());
        System.out.println("champs_tmap lastEntry: " + champs_tmap.lastEntry());
        System.out.println();

        System.out.println("champs_tmap descending keySet: " + champs_tmap.descendingKeySet());
        System.out.println("champs_tmap descending entrySet: " + champs_tmap.descendingMap().entrySet());

    }
}
