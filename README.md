# Pràctica: Patrons de Construcció de Programari en Java
##  Carlos — Backend Developer & Explorador de IA Full-Stack Developer.
 
   ## Hi there 👋
 
---

<p align="center">
  <b>Crafted with "LOVE" by Carlos and approved by 🦆</b>
</p>

---



## Introducció

En aquesta pràctica aprofundirem en l'ús de patrons de disseny per construir software extensible, modular i reutilitzable. Cada nivell presenta un repte diferent que posa en pràctica un patró específic. Es recomana pensar bé l'estructura abans de començar a programar.

---

## Nivell 1 — Builder

### Objectiu

Desenvolupar un sistema de gestió de comandes de pizzes utilitzant el patró Builder.

### Requisits

- Crear un projecte Gradle amb una classe `Main` que demostri l'ús del patró.
- Definir la classe `Pizza` amb els atributs següents:
  - `size` (mida)
  - `dough` (tipus de massa)
  - `toppings` (ingredients)
- Crear una interfície `PizzaBuilder` amb mètodes per configurar cada atribut.
- Implementar constructors concrets com:
  - `HawaiianPizzaBuilder`
  - `VegetarianPizzaBuilder`
- Crear la classe `MestrePizzer` que rebi un `PizzaBuilder` i construeixi la pizza.
- Utilitzar `Main` per instanciar els builders i construir pizzes amb diferents configuracions.

### Estructura de Classes

| Classe                  | Descripció                                               |
|-------------------------|-----------------------------------------------------------|
| `Pizza`                 | Model de pizza amb mida, massa i ingredients              |
| `PizzaBuilder`          | Interfície per configurar els atributs de la pizza        |
| `HawaiianPizzaBuilder`  | Constructor concret per pizza hawaiana                    |
| `VegetarianPizzaBuilder`| Constructor concret per pizza vegetariana                 |
| `MestrePizzer`          | Classe que utilitza el builder per construir la pizza     |
| `Main`                  | Classe principal que demostra l'ús del patró              |

---

## Nivell 2 — Observer

### Objectiu

Dissenyar un sistema de notificació de canvis en la Borsa utilitzant el patró Observer.

### Requisits

- Crear una classe `StockAgent` que actui com a Observable.
- Crear una interfície `StockObserver` amb el mètode `update()`.
- Implementar diverses agències de borsa com a Observers.
- Quan el valor de la borsa canviï, el `StockAgent` ha de notificar tots els observadors.

### Estructura de Classes

| Classe           | Descripció                                           |
|------------------|-------------------------------------------------------|
| `StockAgent`     | Observable que gestiona el valor de la borsa         |
| `StockObserver`  | Interfície amb el mètode `update()`                  |
| `StockAgency`    | Implementació concreta de l'observador               |
| `Main`           | Classe principal que simula els canvis de la borsa   |

---

## Nivell 3 — Callback

### Objectiu

Simular una passarel·la de pagament que utilitza el patró Callback per executar diferents mètodes de pagament.

### Requisits

- Crear una interfície `PaymentMethod` amb el mètode `pay()`.
- Implementar diferents mètodes de pagament:
  - `CreditCardPayment`
  - `PaypalPayment`
  - `BankDebitPayment`
- Crear una classe `PaymentGateway` que rebi un `PaymentMethod` i executi el pagament.
- Crear una classe `ShoeStore` que invoqui la passarel·la de pagament i rebi el control després del pagament.

### Estructura de Classes

| Classe              | Descripció                                           |
|---------------------|-------------------------------------------------------|
| `PaymentMethod`     | Interfície amb el mètode `pay()`                      |
| `CreditCardPayment` | Implementació de pagament amb targeta de crèdit       |
| `PaypalPayment`     | Implementació de pagament amb Paypal                  |
| `BankDebitPayment`  | Implementació de pagament amb deute bancari           |
| `PaymentGateway`    | Classe que executa el pagament i retorna el control   |
| `ShoeStore`         | Classe que invoca la passarel·la de pagament          |
| `Main`              | Classe principal que simula una compra                |

---

## Recomanacions

- Utilitza Gradle per gestionar les dependències i compilar el projecte.
- Organitza les classes per nivell en paquets separats.
- Escriu proves unitàries per validar el comportament de cada patró.
- Documenta el codi amb comentaris clars i concisos.

---

## Estructura Recomanada del Repositori
