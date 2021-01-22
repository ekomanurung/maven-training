package future.training.maven;

import com.google.gson.Gson;

public class TestStudent {

  public void testStudent(){
    Student eko = new Student(1, "eko januardy");

    Gson gson = new Gson();
    System.out.println(gson.toJson(eko));
  }
}
