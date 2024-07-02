import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> div3 = new ArrayList<>();
        ArrayList<Integer> div5 = new ArrayList<>();
        ArrayList<Integer> divBoth = new ArrayList<>();
        ArrayList<Integer> full = new ArrayList<>();

        for (int i=1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                divBoth.add(i);
            } else if (i % 5 == 0) {
                div5.add(i);
            } else if (i % 3 == 0)  {
                div3.add(i);
            }
        }

        System.out.println("Numbers divisible by 3: " + div3);
        System.out.println("Numbers divisible by 5: " + div5);
        System.out.println("Numbers divisible by 3 & 5: " + divBoth);

        full.addAll(div3);
        full.addAll(div5);
        full.addAll(divBoth);
        Collections.sort(full);

        System.out.println("Full list of divisible numbers: " + full);
    }
}
