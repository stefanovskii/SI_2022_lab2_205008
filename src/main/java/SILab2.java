import java.util.ArrayList;
import java.util.List;

public class SILab2 {

    public static List<String> function(List<String> list) { //A
        if (list.size() <= 0) { //A
            throw new IllegalArgumentException("List length should be greater than 0"); //B
        }
        int n = list.size(); //C
        int rootOfN = (int) Math.sqrt(n); //C
        if (rootOfN * rootOfN  != n) { //D
            throw new IllegalArgumentException("List length should be a perfect square"); //E
        }
        List<String> numMines = new ArrayList<>(); //F
        for (int i = 0; i < n; i++) { //G
            if (!list.get(i).equals("#")) { //H
                int num = 0; //I
                if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ) { //I
                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ){ //J
                        num += 2; //K
                    }
                    else { //L
                        num  += 1; //M
                    }
                }
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")){ //N
                    num++; //O
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")){ //P
                    num++; //Q
                }
                numMines.add(String.valueOf(num)); //R
            }
            else { //S
                numMines.add(list.get(i)); //T
            }
        } //W
        return numMines; //U
    } //V


}