# Projekt Java - Kalkulator

Prosty projekt kalkulatora w Javie z testami jednostkowymi i integracyjnymi.

## Spis treści

- [Opis projektu](#opis-projektu)
- [Struktura katalogów](#struktura-katalogów)
- [Wymagania](#wymagania)
- [Instrukcje](#instrukcje)
  - [Uruchomienie testów jednostkowych](#uruchomienie-testów-jednostkowych)
  - [Uruchomienie testów integracyjnych](#uruchomienie-testów-integracyjnych)
- [Nowe funkcje](#nowe-funkcje)
- [Autor](#autor)

## Opis projektu

Jest to prosty kalkulator napisany w Javie, który obsługuje podstawowe działania matematyczne, takie jak dodawanie, odejmowanie, mnożenie, dzielenie i modulo. Projekt zawiera testy jednostkowe i integracyjne napisane z użyciem JUnit 4.

## CI / GitHub Actions

Repozytorium posiada **automatyczny pipeline CI (GitHub Actions)** uruchamiający:
✅ Kompilację projektu  
✅ Kompilację testów jednostkowych  
✅ Uruchomienie testów jednostkowych JUnit

Pipeline uruchamia się automatycznie przy każdym **push i pull request** na gałęzie `main` oraz `ci-setup`.

## Struktura katalogów

- `src/` - kod źródłowy kalkulatora
- `tests/` - testy jednostkowe i integracyjne
- `lib/` - biblioteki (np. JUnit)

## Wymagania

- Java 11 lub nowsza
- JUnit 4 (umieszczony w katalogu `lib/`)

## Instrukcje

### Uruchomienie testów jednostkowych

1. Skompiluj kod źródłowy:

```sh
javac -d . src/*.java
```

2. Skompiluj testy:

```sh
javac -cp ".;lib/*" -d . tests/CalculatorTest.java
```

3. Uruchom testy:

```sh
java -cp ".;lib/*" org.junit.runner.JUnitCore CalculatorTest
```

### Uruchomienie testów integracyjnych

1. Skompiluj testy integracyjne:

```sh
javac -cp ".;lib/*" -d . tests/CalculatorIntegrationTest.java
```

2. Uruchom testy integracyjne:

```sh
java -cp ".;lib/*" org.junit.runner.JUnitCore CalculatorIntegrationTest
```

## Nowe funkcje

W projekcie zostały dodane metody:
- `subtract(int a, int b)` - odejmowanie
- `multiply(int a, int b)` - mnożenie
- `divide(int a, int b)` - dzielenie (z obsługą dzielenia przez zero)
- `modulus(int a, int b)` - modulo (z obsługą dzielenia przez zero)
- `power(int base, int exponent)` - potęgowanie liczby całkowitej (np. power(2, 3) zwraca 8)

Wszystkie metody mają pełne pokrycie testami jednostkowymi.

## Autor

Paweł Berg