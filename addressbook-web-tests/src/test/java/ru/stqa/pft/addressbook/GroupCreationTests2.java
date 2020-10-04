package ru.stqa.pft.addressbook;

import org.junit.Test;

public class GroupCreationTests2 extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
