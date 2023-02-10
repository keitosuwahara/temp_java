import java.util.HashMap;
import java.util.Map;

public class main {
public static void main(String[] args) {

Map<String, String> map = new HashMap<>();
map.put("国語", "30");
map.put("社会", "70");
map.put("英語", "56");

for(Map.Entry<String, String> entry:map.entrySet()) {
    System.out.println(entry.getKey()+":"+entry.getValue());
    }

int[] ars = {11,22,33,44,55};

for (int i = 0 ; i < ars.length ; i++) {
    System.out.println(ars[i]);

}
}
}



