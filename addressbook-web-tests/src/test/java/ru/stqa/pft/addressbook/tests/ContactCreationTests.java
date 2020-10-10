package ru.stqa.pft.addressbook.tests;

import org.junit.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testCreateContactTests() throws Exception {
    app.getGroupHelper().createNewClass();
    app.getGroupHelper().fillContactForm(new ContactData("Ramil", "Khamitov", "34", "+79234027077", "ramilkhamitoff@gmail.com", "Mezhdurechensk", "test1"), true);
    app.getGroupHelper().submitContactCreation();
  }


}
