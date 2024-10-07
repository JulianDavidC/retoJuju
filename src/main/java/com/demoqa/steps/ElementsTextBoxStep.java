package com.demoqa.steps;

import com.demoqa.pageObject.ElementsTextBoxlPageObject;
import com.demoqa.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ElementsTextBoxStep {
  EsperaImplicita esperaImplicita = new EsperaImplicita();
  ElementsTextBoxlPageObject elementsTextBoxlPageObject = new ElementsTextBoxlPageObject();

  @Step
  public void seleccionarBotonTextBox(){
    elementsTextBoxlPageObject.getDriver().findElement(elementsTextBoxlPageObject.getBtnTextBox()).click();
  }
  @Step
  public void llenarCampos(){
    ((JavascriptExecutor) elementsTextBoxlPageObject.getDriver()).executeScript("arguments[0].scrollIntoView(true);", elementsTextBoxlPageObject.getDriver().findElement(elementsTextBoxlPageObject.getBtnSubmit()));
    elementsTextBoxlPageObject.getDriver().findElement(elementsTextBoxlPageObject.getTxtFullName()).sendKeys("Julian Chica");
    elementsTextBoxlPageObject.getDriver().findElement(elementsTextBoxlPageObject.getTxtEmail()).sendKeys("pruebas@pruebas.co");
    elementsTextBoxlPageObject.getDriver().findElement(elementsTextBoxlPageObject.getTxtCurrentAddress()).sendKeys("Calle 13 # 1 - 2");
    elementsTextBoxlPageObject.getDriver().findElement(elementsTextBoxlPageObject.getTxtPermanentAddress()).sendKeys("Cra 6a este");
  }
  @Step
  public void presionarBotonSubmit(){
    esperaImplicita.esperaImplicita(2);
    ((JavascriptExecutor) elementsTextBoxlPageObject.getDriver()).executeScript("arguments[0].scrollIntoView(true);", elementsTextBoxlPageObject.getDriver().findElement(elementsTextBoxlPageObject.getLblBajar()));

    elementsTextBoxlPageObject.getDriver().findElement(elementsTextBoxlPageObject.getBtnSubmit()).click();


  }

  @Step
  public void validarDatos(String nombreEsperado, String correoEsperado, String currentAddressEsperado,String permanentAddressEsperado){

    String nombreVisible = elementsTextBoxlPageObject.getDriver().findElement(elementsTextBoxlPageObject.getLblFullName()).getText();
    String correoVisible = elementsTextBoxlPageObject.getDriver().findElement(elementsTextBoxlPageObject.getLblEmail()).getText();
    String currentAddressVisible = elementsTextBoxlPageObject.getDriver().findElement(elementsTextBoxlPageObject.getLblCurrentAddress()).getText();
    String permanentAddressVisible = elementsTextBoxlPageObject.getDriver().findElement(elementsTextBoxlPageObject.getLblPermanentAddress()).getText();

    assertEquals("El Nombre en la caja de texto no es el esperado", nombreEsperado, nombreVisible);
    assertEquals("El correo en la caja de texto no es el esperado", correoEsperado, correoVisible);
    assertEquals("El campo currentAddress  en la caja de texto no es el esperado", currentAddressEsperado, currentAddressVisible);
    assertEquals("El campo permanentAddress en la caja de texto no es el esperado", permanentAddressEsperado, permanentAddressVisible);

  }
}
