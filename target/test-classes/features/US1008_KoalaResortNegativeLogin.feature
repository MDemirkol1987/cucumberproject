Feature: US1008_Koala Resort Negative Login

@koala
  Scenario: TC11 kullanici gecerli bilgilerle giris yapar

    Given kullanici "kr_url" sayfasina gider
    Then Log in yazisina tiklar
    And kullanici isim olarak "kr_wrong_username" girer
    And kullanici sifre olarak "kr_wrong_password" girer
    And Login butonuna basar
    Then sayfaya giris yapmadigini kontrol eder
    And sayfayi kapatir

