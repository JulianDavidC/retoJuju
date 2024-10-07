package com.demoqa.steps;

import com.demoqa.pageObject.FormPageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertEquals;

public class FormStep {
    FormPageObject formPageObject = new FormPageObject();
    @Step
    public void ingresarForm(){
        formPageObject.getDriver().findElement(formPageObject.getBtnElement()).click();
    }
    @Step
    public void ingresarPracticeForm(){
        formPageObject.getDriver().findElement(formPageObject.getBtnTextBox()).click();
    }
    @Step
    public void llenarFormulario(){
        ((JavascriptExecutor) formPageObject.getDriver()).executeScript("arguments[0].scrollIntoView(true);", formPageObject.getDriver().findElement(formPageObject.getBtnEnviar()));

        formPageObject.getDriver().findElement(formPageObject.getTxtNombre()).sendKeys("Julian");
        formPageObject.getDriver().findElement(formPageObject.getTxtApellido()).sendKeys("Chica");
        formPageObject.getDriver().findElement(formPageObject.getTxtCorreo()).sendKeys("Pruebas@pruebas.com");
        formPageObject.getDriver().findElement(formPageObject.getRtbGenero()).click();
        formPageObject.getDriver().findElement(formPageObject.getTxtTelefono()).sendKeys("1234567890");
        formPageObject.getDriver().findElement(formPageObject.getTxtSubjects()).sendKeys("Social Studies");
        formPageObject.getDriver().findElement(formPageObject.getTxtSubjects()).sendKeys(Keys.ENTER);
        formPageObject.getDriver().findElement(formPageObject.getRtHobbies()).click();
        formPageObject.getDriver().findElement(formPageObject.getTxtDireccion()).sendKeys("Cra 6a este");
        ((JavascriptExecutor) formPageObject.getDriver()).executeScript("arguments[0].scrollIntoView(true);", formPageObject.getDriver().findElement(formPageObject.getLblBajar()));
        formPageObject.getDriver().findElement(formPageObject.getBtnEnviar()).click();
    }
    @Step
    public void validaInfo(String nombreEsperado,String coreooEsperado,String GeneroEsperado,String celularEsperado,String SubjectsEsperado,String HobbiesEsperado,String direccionEsperado){
        String nombreVisible = formPageObject.getDriver().findElement(formPageObject.getLblNombreCompleto()).getText();
        String coreooVisible = formPageObject.getDriver().findElement(formPageObject.getLblCorreo()).getText();
        String GeneroVisible = formPageObject.getDriver().findElement(formPageObject.getLblGenero()).getText();
        String celularVisible = formPageObject.getDriver().findElement(formPageObject.getLblCelular()).getText();
        String SubjectsVisible = formPageObject.getDriver().findElement(formPageObject.getLblSubjects()).getText();
        String HobbiesVisible = formPageObject.getDriver().findElement(formPageObject.getLblHobbies()).getText();
        String direccionVisible = formPageObject.getDriver().findElement(formPageObject.getLblAddress()).getText();


        assertEquals("El Nombre en la caja de texto no es el esperado", nombreEsperado, nombreVisible);
        assertEquals("El Nombre en la caja de texto no es el esperado", coreooEsperado, coreooVisible);
        assertEquals("El Nombre en la caja de texto no es el esperado", GeneroEsperado, GeneroVisible);
        assertEquals("El Nombre en la caja de texto no es el esperado", celularEsperado, celularVisible);
        assertEquals("El Nombre en la caja de texto no es el esperado", SubjectsEsperado, SubjectsVisible);
        assertEquals("El Nombre en la caja de texto no es el esperado", HobbiesEsperado, HobbiesVisible);
        assertEquals("El Nombre en la caja de texto no es el esperado", direccionEsperado, direccionVisible);


    }
}
