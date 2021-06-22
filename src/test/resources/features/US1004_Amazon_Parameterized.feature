Feature: US1004_Amazon_Parameterized

  Background: Amazon sayfasina git
    Given kullanici amazon sayfasina gider

    Scenario: TC07_Amazon iPhone arama parametreli
      When "iPhone" icin arama yapar
      Then sonuclarin "iPhone" icerdigini test eder

    Scenario: TC08_Amazon tea pot arama parametreli
      When "tea pot" icin arama yapar
      Then sonuclarin "tea pot" icerdigini test eder

    Scenario: TC09_Amazon flower arama parametreli
      When "flover" icin arama yapar
      Then sonuclarin "flover" icerdigini test eder

      And sayfayi kapatir