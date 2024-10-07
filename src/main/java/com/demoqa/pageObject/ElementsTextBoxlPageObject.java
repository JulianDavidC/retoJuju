package com.demoqa.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ElementsTextBoxlPageObject extends PageObject {
  By btnTextBox = By.xpath("//li/span[text()='Text Box']");
  By txtFullName = By.id("userName");
  By txtEmail = By.id("userEmail");
  By txtCurrentAddress = By.id("currentAddress");
  By txtPermanentAddress = By.id("permanentAddress");
  By btnSubmit = By.id("submit");
  By lblFullName = By.xpath("//p[@id='name']");
  By lblEmail = By.xpath("//p[@id='email']");
  By lblCurrentAddress = By.xpath("//p[@id='currentAddress']");
  By lblPermanentAddress = By.xpath("//p[@id='permanentAddress']");
  By lblBajar = By.xpath("//*[@id='app']/div/div/div/div[2]/div[3]");


  public By getBtnTextBox() {
    return btnTextBox;
  }

  public By getTxtFullName() {
    return txtFullName;
  }

  public By getTxtEmail() {
    return txtEmail;
  }

  public By getTxtCurrentAddress() {
    return txtCurrentAddress;
  }

  public By getTxtPermanentAddress() {
    return txtPermanentAddress;
  }

  public By getBtnSubmit() {
    return btnSubmit;
  }
  public By getLblFullName() {
    return lblFullName;
  }

  public By getLblEmail() {
    return lblEmail;
  }

  public By getLblCurrentAddress() {
    return lblCurrentAddress;
  }

  public By getLblPermanentAddress() {
    return lblPermanentAddress;
  }
  public By getLblBajar() {
    return lblBajar;
  }
}
