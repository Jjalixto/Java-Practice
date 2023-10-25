package HashMap;

import java.util.HashMap;
import java.util.Set;

public class map {
    public static void main(String[] args) {

            HashMap<String, String> userMap = new HashMap<String, String>();
            userMap.put("Let me love you","Something beautiful");
            userMap.put("Perfect","I found a love, for me");
            userMap.put("Shape of You","So the bar is where I go");
            userMap.put("Photograph","We made these memories for ourselves");

            Set<String> keys = userMap.keySet();
            for(String key : keys){
                System.out.println(userMap.get(key));
                System.out.println(key);
            }
    }
}
