import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Wybierz operację:");
    System.out.println("1 – suma");
    System.out.println("2 – różnica");
    System.out.println("3 – iloczyn");
    System.out.println("4 – iloraz");
    System.out.print("Twój wybór: ");
    int wybor = scanner.nextInt();

    System.out.print("Podaj pierwszą liczbę: ");
    double a = scanner.nextDouble();

    System.out.print("Podaj drugą liczbę: ");
    double b = scanner.nextDouble();

    switch (wybor) {
      case 1:
        System.out.println("Wynik (suma): " + (a + b));
        break;
      case 2:
        System.out.println("Wynik (różnica): " + (a - b));
        break;
      case 3:
        System.out.println("Wynik (iloczyn): " + (a * b));
        break;
      case 4:
        if (b == 0) {
          System.out.println("Błąd: Nie można dzielić przez zero!");
        } else {
          System.out.println("Wynik (iloraz): " + (a / b));
        }
        break;
      default:
        System.out.println("Błąd: Nieprawidłowy wybór operacji.");
        break;
    }

    scanner.close();
  }
}