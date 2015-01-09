import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class PalindromeChecker extends PApplet {

public void setup()
{
  String lines[] = loadStrings("palindromes.txt");
  println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(extract(lines[i])))
    {
      println(lines[i] + " IS a palidrome.");
    }
    else
    {
      println(lines[i] + " is NOT a palidrome.");
    }
  }
}

public String extract(String stg)
{
  String blank = "";
  for(int i = 0; i < stg.length(); i++)
  {
    if(Character.isLetter(stg.charAt(i)))
    {
      blank = blank + stg.substring(i, i+1);
    }
  }
  return blank.toLowerCase();
}
public boolean palindrome(String word)
{
  for(int i = 0; i < word.length()/2; i++)
  {
    if(word.charAt(i) != word.charAt(word.length()-1-i))
    {
      return false;
    }
  }
  return true;
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "PalindromeChecker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
