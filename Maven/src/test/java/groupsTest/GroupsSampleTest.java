package groupsTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class GroupsSampleTest {
  @Test(groups = "name")
  public void f() {
	  System.out.println("I am Sharvani");
  }
  @Test(groups = "name")
  public void g() {
	  System.out.println("I am Soni");
  }
  @Test(groups = "Behaviour")
  public void h() {
	  System.out.println("We are genius");
  }
  @BeforeTest
  public void beforeTest() {
  }

}
