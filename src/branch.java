import App.Culc;
import java.util.Arrays;

public class branch {
public static void main(String[] args) {

int a = 10; int b = 2; 
int total = Culc.tasu(a, b);
int delta = Culc.hiku(a, b);

System.out.println("tasu="+total+"hiku="+delta);

int[] ar = {55,44,33,22,11};
Arrays.sort(ar);

for(int s : ar) {
    System.out.println(s);
}

}

}
