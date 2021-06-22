package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class KoalaStepDefinitions {

    KoalaResortPage koalaResortPage=new KoalaResortPage();

    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
        koalaResortPage.login.click();
    }
    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        koalaResortPage.username.sendKeys(ConfigReader.getProperty("kr_valid_username"));
    }
    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        koalaResortPage.password.sendKeys(ConfigReader.getProperty("kr_valid_password"));
    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        koalaResortPage.loginButton.click();
    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertEquals(ConfigReader.getProperty("kr_basarili_giris_url"), Driver.getDriver().getCurrentUrl());
    }

    @Then("sayfaya giris yapmadigini kontrol eder")
    public void sayfaya_giris_yapmadigini_kontrol_eder() {

    }


    @And("kullanici isim olarak {string} girer")
    public void kullaniciIsimOlarakGirer(String hataliIsim) {
        koalaResortPage.username.sendKeys(ConfigReader.getProperty(hataliIsim));
    }

    @And("kullanici sifre olarak {string} girer")
    public void kullaniciSifreOlarakGirer(String hataliSifre) {
        koalaResortPage.password.sendKeys(ConfigReader.getProperty(hataliSifre));
    }
}
