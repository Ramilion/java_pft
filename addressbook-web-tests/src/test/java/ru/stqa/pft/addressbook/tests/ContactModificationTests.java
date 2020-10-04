package ru.stqa.pft.addressbook.tests;

import org.junit.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() throws Exception {
    app.getGroupHelper().initContactModification();
    app.getGroupHelper().fillContactForm(new ContactData("Ramil", "Khamitov", "34", "+79234027077", "ramilkhamitoff@gmail.com", "Mezhdurechensk"));
    app.getGroupHelper().submitContactModification();
  }
}

