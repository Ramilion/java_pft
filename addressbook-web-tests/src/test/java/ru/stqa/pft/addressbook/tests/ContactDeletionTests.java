package ru.stqa.pft.addressbook.tests;

import org.junit.Test;

public class ContactDeletionTests extends TestBase {
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Test
  public void testContactDeletion() throws Exception {
    app.getGroupHelper().selectContact();
    app.getGroupHelper().deleteSelectedContact();
    app.getGroupHelper().confirmDelete();
  }
}
