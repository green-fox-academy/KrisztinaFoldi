package CountLetters;

import java.util.HashMap;

public class CountLetters {
  public String alma = "alma";

  public HashMap<Character, Integer> makeADictionaryFromLettersOfAWord(String string){
    char[] caraterArray = string.toCharArray();
    HashMap<Character, Integer> dictionary = new HashMap<>();
    for (int i = 0; i < caraterArray.length; i++) {
      if (dictionary.containsKey(caraterArray[i])){
        dictionary.put(caraterArray[i],dictionary.get(caraterArray[i]) + 1);
      } else {
        dictionary.put(caraterArray[i], 1);
      }
    }
    return dictionary;
  }


}
