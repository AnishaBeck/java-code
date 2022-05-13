public class morsecode {
  public static void EnglishToMorse(String[] code,String englishLang, char[] letter)
  {
      System.out.println("Morse code of " + englishLang +" is :");
      for(int i =0; i< englishLang.length(); i++)
      {
          for(int j=0; j< letter.length;j++)
          {
              if (englishLang.charAt(i)== letter[j])
              {
                  System.out.println(code[j]+" ");
                  break;
              }
          }
      }
  }

  public static void MorseToEnglish(String[] code,String morsecode)
  {
      String[] array = morsecode.split(" ");
      System.out.print("Morse code "+ morsecode + " to English is : ");

      for(int i=0; i < array.length; i++)
      {
          for(int j=0; j< code.length; j++)
          {
              if (array[i].compareTo(code[j])==0) {
                  System.out.print((char)(j+'a')+ " ");
                  break;
              }
          }
      }
  }


public static void main(String[] args) {

    //store alphabet in an array
    char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
    'g', 'h', 'i', 'j', 'k', 'l',
    'm', 'n', 'o', 'p', 'q', 'r',
    's', 't', 'u', 'v', 'w', 'x',
    'y', 'z', '1', '2', '3', '4',
    '5', '6', '7', '8', '9', '0' };

    //morese code by indexing
    String[] code = { ".-",   "-...", "-.-.", "-..",  ".",
    "..-.", "--.",  "....", "..",   ".---",
    "-.-",  ".-..", "--",   "-.",   "---",
    ".--.", "--.-", ".-.",  "...",  "-",
    "..-",  "...-", ".--",  "-..-", "-.--",
    "--..", "|" };

    // Given Strings
    String morsecode = "... -.-. .... --- --- .-..";
    String englishLang = "alice";

    // English to morse code
    EnglishToMorse(code, englishLang, letter);

    MorseToEnglish(code, morsecode);
    
}

}
