package com.demoqa.steps;


import com.demoqa.pageObject.ElementsCheckboxPageObject;
import com.demoqa.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class ElementsCheckboxStep {

    ElementsCheckboxPageObject elementsCheckboxPageObject = new ElementsCheckboxPageObject();
    EsperaImplicita esperaImplicita = new EsperaImplicita();

    @Step
    public void ingresarOpcionCheckBox(){
        elementsCheckboxPageObject.getDriver().findElement(elementsCheckboxPageObject.getBtnCheckBox()).click();
    }
    @Step
    public void llenarChecks(){
        elementsCheckboxPageObject.getDriver().findElement(elementsCheckboxPageObject.getBtnCheckBox()).click();
        elementsCheckboxPageObject.getDriver().findElement(elementsCheckboxPageObject.getChkCheckBox()).click();
        ((JavascriptExecutor) elementsCheckboxPageObject.getDriver()).executeScript("arguments[0].scrollIntoView(true);", elementsCheckboxPageObject.getDriver().findElement(elementsCheckboxPageObject.getLblBajar()));
        elementsCheckboxPageObject.getDriver().findElement(elementsCheckboxPageObject.getLblNote()).click();
        elementsCheckboxPageObject.getDriver().findElement(elementsCheckboxPageObject.getLblWorkSpace()).click();
        elementsCheckboxPageObject.getDriver().findElement(elementsCheckboxPageObject.getLblOffice()).click();
        elementsCheckboxPageObject.getDriver().findElement(elementsCheckboxPageObject.getLblWord()).click();
    }
    @Step
    public void validarChecks(){
        Assert.assertThat(elementsCheckboxPageObject.getDriver().findElement(elementsCheckboxPageObject.getChkNotes()).isSelected(), Matchers.is(true));
        Assert.assertThat(elementsCheckboxPageObject.getDriver().findElement(elementsCheckboxPageObject.getChkWorkspace()).isSelected(), Matchers.is(true));
        Assert.assertThat(elementsCheckboxPageObject.getDriver().findElement(elementsCheckboxPageObject.getChkwordFile()).isSelected(), Matchers.is(true));
        Assert.assertThat(elementsCheckboxPageObject.getDriver().findElement(elementsCheckboxPageObject.getChkoffice()).isSelected(), Matchers.is(true));
    }
}
