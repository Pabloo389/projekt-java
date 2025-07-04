# Changelog

## [v2.2.0] - MINOR

### Dodano
- Pipeline CI na GitHub Actions:
  - Kompilacja projektu przy każdym push i pull request
  - Kompilacja testów jednostkowych
  - Uruchamianie testów jednostkowych JUnit
- Pipeline CD:
  - Automatyczne "wdrożenie" po przejściu testów na `main`
  - Symulacja uruchomienia aplikacji i health check

### Zmiany
- Zaktualizowano README.md o szczegółowy opis pipeline CI/CD
- Projekt przygotowany do konfiguracji `secrets`, zmiennych środowiskowych i monitoringu w kolejnym etapie

## [v2.1.0] - MINOR
- Dodano metodę `power(int base, int exponent)` do klasy `Calculator`.
- Zaimplementowano testy jednostkowe metody `power` pokrywające różne przypadki.
- Przeprowadzono implementację zgodnie z TDD.
- Zaktualizowano dokumentację w README.

## [v2.0.0] - MAJOR
- BREAKING CHANGE: zmieniono menu — usunięto opcję Pomoc

## [v1.1.0] - MINOR
- dodano opcję 'O programie' do menu

## [v1.0.1] - PATCH
- poprawiono komunikat w sekcji Pomoc
