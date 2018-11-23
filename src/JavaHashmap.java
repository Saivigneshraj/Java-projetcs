import java.util.HashMap;
import java.util.Map;


public class JavaHashmap {


    public static void main(String args[]) {

        Map<Integer, String> idToName = new HashMap<Integer, String>() {{
            put(101, "John");
            put(102, "John");
            put(103, "John");
        }};

        System.out.println(idToName);

    }

}