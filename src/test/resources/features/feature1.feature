Feature: Probando login en la website Sauce Demo

  Scenario: Iniciar Sesión en la web saucealabs
    Given   Un usuario con credenciales validas en el home page de sauce demo
    When    Ingreso usuario y contresena
    Then    Visualizo el cambio de pagina al inventario