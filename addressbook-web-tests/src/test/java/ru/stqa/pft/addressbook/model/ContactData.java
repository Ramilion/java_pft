package ru.stqa.pft.addressbook.model;

public class ContactData {
  private String firstname;
  private String lastname;
  private String address;
  private String phone;
  private String email;
  private String address2;

  public ContactData(String firstname, String lastname, String address, String phone, String email, String address2) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.address = address;
    this.phone = phone;
    this.email = email;
    this.address2 = address2;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAddress() {
    return address;
  }

  public String getPhone() {
    return phone;
  }

  public String getEmail() {
    return email;
  }

  public String getAddress2() {
    return address2;
  }
}
