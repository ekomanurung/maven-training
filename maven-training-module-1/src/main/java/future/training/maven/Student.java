package future.training.maven;


public class Student {
  private int nim;
  private String nama;

  public Student(int nim, String nama){
    this.nim = nim;
    this.nama = nama;
  }

  public int getNim() {
    return nim;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setNim(int nim) {
    this.nim = nim;
  }
}
