package ru.stqa.pft.addressbook.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {

  public ApplicationManager app = new ApplicationManager(BrowserType.IE);
  private WebDriver driver;

  @Before
  public void setUp() throws Exception {
    app.init();
  }

  @After
  public void tearDown() throws Exception {
    app.stop();
  }

  public ApplicationManager getApp() {
    return app;
  }

}
