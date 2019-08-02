public class Ex8
{
  public static void main(String[] args)
  {
    int s = 0;
    int t = 1;

    /*for(int i = 0; i < 10; i++){
      s = s + i;
      for(int j = i; j > 0; j--){
        t = t * (j - i);
      }
      s = s * t;
      System.out.println("T vale: " + t);
    }
    System.out.println("S vale: " + s);
    */

    int i = 0;
    int j = i;
    while (i < 10)
    {
      s = s + i;
      while(j > 0)
      {
        t = t * (j - i);
        j--;
      }
      s = s * t;
      System.out.println("T vale: " + t);
      i++;
    }
    System.out.println("S vale: " + s);
  }
}
