package future.training.maven;

public class Driver {
  public static void main(String[] args) {
    Student eko = new Student(1,"eko");

    Capitalize capitalize = new Capitalize();
    System.out.println();capitalize.capitalizeWithLib();
    System.out.println(eko.getNama());
  }
}
