import java.util.*;
public class ListImpl {
  public static void main(String[] args) {
    List<String> list = new LinkedList<>();
    list.add("ash");
    list.add("ashi");
    list.add("ashir");
    // for (String item : list) {
    //   System.out.println(item);
    // }
    // list.remove("ashir");
    // System.out.println("After removal");
    // for (String item : list) {
    //   System.out.println(item);
    // }
    System.out.println(list.get(0));

  }
}