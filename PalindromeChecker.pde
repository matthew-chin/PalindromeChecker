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

