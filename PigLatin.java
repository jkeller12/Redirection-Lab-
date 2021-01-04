import java.util.Arrays;
public class PigLatin{
  public static String pigLatinSimple(String s)
  {
    // given a word of a least 1 charAt
    // if word starts in {a, e, i, o, u}
    // --> add "hay" to the end of the word
    // else
    // --> move first letter to the end
    // --> then add "ay" to the end
    String Vowels = "aeiou";
    s = s.toLowerCase();
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
  public static void main(String[] args)
  {
    System.out.println(pigLatinSimple("ThE"));
  }
}
