Feature: US1005_Amazon_Scenario_Outline

  @meyve
  Scenario Outline: TC10_Amazon Çoklu Arama
    Given kullanici amazon sayfasina gider
    Then "<Meyve>" icin arama yapar
    And sonuclarin "<Meyve>" icerdigini test eder

    Examples:
    |Meyve|
    |elma|
    |armut|
    |kavun|
    |karpuz|
    |kiraz|
    |visne|
    |erik|
    |avakado|
