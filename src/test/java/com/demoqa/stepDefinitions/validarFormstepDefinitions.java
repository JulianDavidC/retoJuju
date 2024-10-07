package com.demoqa.stepDefinitions;

import com.demoqa.steps.FormStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class validarFormstepDefinitions {
    @Steps
    FormStep formStep;
    @Dado("que ingrese a la opcion de forms")
    public void queIngreseALaOpcionDeForms() {
        formStep.ingresarForm();
    }
    @Cuando("seleccione la opcion Practice Form")
    public void seleccioneLaOpcionPracticeForm() {
        formStep.ingresarPracticeForm();
    }
    @Cuando("se llene de forma correcta")
    public void seLleneDeFormaCorrecta() {
        formStep.llenarFormulario();
    }
    @Entonces("se debe validar que la informacion ingresada sea correcta")
    public void seDebeValidarQueLaInformacionIngresadaSeaCorrecta() {
        formStep.validaInfo("Julian Chica","Pruebas@pruebas.com","Male","1234567890","Social Studies","Sports","Cra 6a este");
    }
}
