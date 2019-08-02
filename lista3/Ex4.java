public class Ex4
{
  public static void main(String[] args) {
    int lin, col;
    String msg = "";
    lin = 10;
    while (lin >= 1)
    {
      col = 1;
      while (col <= 10)
      {
        if (lin % 2 == 1)
        {
          msg += "<";
          //System.out.println(msg);
        }
        else
        {
          msg += ">";
          //System.out.println(msg);
        }
        col++;
      }
      //System.out.println(msg);
      lin --;
    //  msg += "\n";
    }
    System.out.println(msg);
  }
}
