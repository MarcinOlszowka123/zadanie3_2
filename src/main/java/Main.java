import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Wpisz tekst:");
    String text = sc.nextLine();

    StringBuilder sb = new StringBuilder(text);
    for (char ch : text.toCharArray()) {
      if (Character.isUpperCase(ch))
        sb.append(Character.toLowerCase(ch));
      else if (Character.isLowerCase(ch))
        sb.append(Character.toUpperCase(ch));
      else
        sb.append(ch);

    }
    System.out.println("Tekst po zamianie:  ");
    System.out.println(sb.toString());
    sc.close();
  }
}