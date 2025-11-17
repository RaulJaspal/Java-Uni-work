import java.util.HashSet;

public class Challenge {

  public static String[] uniques(String[] arr) {
    HashSet<String> dupes = new HashSet<>();

    for (String s : arr) {
      dupes.add(s);
    }

    String[] result = new String[dupes.size()];
    int i = 0;
    for (String s : dupes) {
      result[i++] = s;
    }

    return result;
  }
}
