package com.demoqa.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class FormPageObject extends PageObject {
    By btnElement = By.xpath("//h5[text()='Forms']");
    By btnTextBox = By.xpath("//li/span[text()='Practice Form']");
    By txtNombre = By.id("firstName");
    By txtApellido = By.id("lastName");
    By txtCorreo = By.id("userEmail");
    By rtbGenero = By.xpath("//*[@for='gender-radio-1']");
    By txtTelefono = By.id("userNumber");
    By txtSubjects = By.id("subjectsInput");
    By rtHobbies = By.xpath("//*[@for='hobbies-checkbox-1']");
    By txtDireccion = By.id("currentAddress");
    By btnEnviar = By.id("submit");
    By lblBajar = By.xpath("//*[@id='app']/div/div/div/div[2]/div[3]");

    By lblNombreCompleto = By.xpath("//tbody/tr[1]/td[2]");
    By lblCorreo = By.xpath("//tbody/tr[2]/td[2]");
    By lblGenero = By.xpath("//tbody/tr[3]/td[2]");
    By lblCelular = By.xpath("//tbody/tr[4]/td[2]");
    By lblSubjects = By.xpath("//tbody/tr[6]/td[2]");
    By lblHobbies = By.xpath("//tbody/tr[7]/td[2]");
    By lblAddress = By.xpath("//tbody/tr[9]/td[2]");

    public By getBtnElement() {
        return btnElement;
    }

    public By getBtnTextBox() {
        return btnTextBox;
    }

    public By getTxtNombre() {
        return txtNombre;
    }

    public By getTxtApellido() {
        return txtApellido;
    }

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getRtbGenero() {
        return rtbGenero;
    }

    public By getTxtTelefono() {
        return txtTelefono;
    }

    public By getTxtSubjects() {
        return txtSubjects;
    }

    public By getRtHobbies() {
        return rtHobbies;
    }

    public By getTxtDireccion() {
        return txtDireccion;
    }

    public By getBtnEnviar() {
        return btnEnviar;
    }

    public By getLblNombreCompleto() {
        return lblNombreCompleto;
    }

    public By getLblCorreo() {
        return lblCorreo;
    }

    public By getLblGenero() {
        return lblGenero;
    }

    public By getLblCelular() {
        return lblCelular;
    }

    public By getLblSubjects() {
        return lblSubjects;
    }

    public By getLblHobbies() {
        return lblHobbies;
    }

    public By getLblAddress() {
        return lblAddress;
    }

    public By getLblBajar() {
        return lblBajar;
    }

}
