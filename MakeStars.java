import java.util.*;
public class MakeStars{
  public static void main(String[] args)
  {
    Scanner n = new Scanner (System.in);
    while (n.hasNextLine())
    {
      Scanner n1 = new Scanner (n.nextLine());
      String Big_Word = "";
      while(n1.hasNext())
      {
        String word = n1.next() + " ";
        Big_Word += word;
      }
      System.out.println(WordtoStars(Big_Word));
    }
  }

  public static String WordtoStars(String Word){
    int Length = Word.length();
    String Return_String = "";
    for(int i = 0 ; i < Length; i++)
    {
      if(Word.charAt(i) == ' ')
      {
        Return_String += " ";
      }
      else{Return_String += "*";}

    }

    return Return_String;
  }
}
