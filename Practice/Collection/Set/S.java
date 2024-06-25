package Collection.Set;


/*

List can contain duplicate values to have unique values we can use set
Set will not give values in sorted format
Set dosen't have Index Value

*/

import java.util.HashSet;
import java.util.Set;

public class S {
    public static void main(String[] args) {

        Set<Integer> numbs = new HashSet<Integer>();
        numbs.add(2);
        numbs.add(9);
        numbs.add(6);
        numbs.add(5);

        for(int n : numbs){
            System.out.println(n);
        }

    }
}
