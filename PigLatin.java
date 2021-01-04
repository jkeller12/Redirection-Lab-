import java.util.Arrays;
import java.util.*;
public class PigLatin{
  public static String pigLatinSimple(String s)
  {
    s = s.toLowerCase();
    String Vowels = "aeiou";
    if(-1 != Vowels.indexOf(s.charAt(0)))
    {
      s += "hay";
    }
    else
    {
      s += s.charAt(0);
      s += "ay";
      s = s.substring(1,s.length());
    }
    return s;

  }






  public static String pigLatin(String s)
  {
    s = s.toLowerCase();
    String Vowels = "aeiou";
    String[] Diagraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};

    String C01 = s.substring(0,2);

    if(-1 != Vowels.indexOf(s.charAt(0)))
    {
      s += "hay";
    }
    else if(Arrays.asList(Diagraphs).contains(C01))
    {
      s = s.substring(2,s.length());
      s += C01;
      s += "ay";
    }
    else
    {
      s += s.charAt(0);
      s += "ay";
      s = s.substring(1,s.length());
    }
    return s;

  }

  public static String pigLatinBest(String s)
  {
    if(!Character.isLetter(s.charAt(0)))
    {
      return s;
    }

    char Last_Value = s.charAt(s.length()-1);
    boolean A = Character.isDigit(Last_Value);
    boolean B = Character.isLetter(Last_Value);

    if(!(A || B))
    {
      char Punctuation = Last_Value;
      s = s.substring(0, s.length()-1);
      s = pigLatin(s);
      return s + Punctuation;
    }
    else
    {
      return pigLatin(s);
    }

  }



  public static void main(String[] args)
  {
    Scanner n = new Scanner (System.in);
    while (n.hasNextLine())
    {
      Scanner n1 = new Scanner (n.nextLine());
      String Big_Word = "";
      while(n1.hasNext())
      {
        String word = n1.next();
        Big_Word += pigLatinBest(word) + " ";
      }
      System.out.println((Big_Word));
    }

  }
}
