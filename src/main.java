import java.io.FileWriter;
import java.io.IOException;

public class main {
public static void main(String[] args) {

    /* 
    Date now = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(now);
    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH);
    int day = c.get(Calendar.DATE);
    int hour = c.get(Calendar.HOUR);
    int min = c.get(Calendar.MINUTE);
    int sec =  c.get(Calendar.SECOND);
    
    month+=1;


    //System.out.println("現在は"+year+"年"+month+"月"+day+"日"+hour+"時"+min+"分"+sec+"秒");

SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
String s = f.format(now);
System.out.println(s);
*/

/*tryの後()で囲むとclose()を書かなくてもいい => ファイル処理やDB処理など*/
try (FileWriter file = new FileWriter("../txt/test.txt");){ 
    file.write("okokokok");

}catch(IOException e) {
    System.out.println("[INFO]  "+e.getMessage());

}catch(NullPointerException e) {//fileがnullだった場合
    System.out.println("[INFO]  "+e.getMessage());

}finally {
    System.out.println("finallyは何があろうと最後に必ず実行される");

}
}
}

