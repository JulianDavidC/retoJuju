package com.demoqa.steps;


import com.demoqa.pageObject.ElementsRadioButtonPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class ElementsRadioButtonSteps {
    ElementsRadioButtonPageObject elementsRadioButtonPageObject = new ElementsRadioButtonPageObject();
    @Step
    public void ingresarOpcionRadioButton(){
        elementsRadioButtonPageObject.getDriver().findElement(elementsRadioButtonPageObject.getBtnCheckBox()).click();
    }
    public void seleccionarRadioButton(){
        elementsRadioButtonPageObject.getDriver().findElement(elementsRadioButtonPageObject.getRtbYes()).click();
    }
    public void validarRadioButtonSelecionado(){
        Assert.assertThat(elementsRadioButtonPageObject.getDriver().findElement(elementsRadioButtonPageObject.getLblSucces()).isDisplayed(), Matchers.is(true));
    }
}
