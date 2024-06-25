package Collection.Map;

import java.util.HashMap;
import java.util.Map;
public class M {
    public static void main(String[] args) {

        Map<String,Integer> students = new HashMap<>();

        students.put("Sanket",36);
        students.put("Sahil",89);
        students.put("Sneha",98);
        students.put("Teju",56);

        System.out.println(students);
    }
}
