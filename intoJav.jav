import java.lang.Math;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    int totalD=0;
    int time = 0;
    System.out.print("    Runner\n");
    while (totalD<100){
      time+=1;
      int distance = rand.nextInt(2,8);
      totalD += distance;
      if (totalD>100){
        totalD=100;}
      if (time<10){
      System.out.print("t = " + time  +"     " + totalD+"m\n");}
      if (time>10){
        System.out.print("t ="+ time+"     " + totalD+"m\n" );
      }
      
      
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}