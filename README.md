Это **финальный проект 8 спринта** курса обучения **Автоматизатор тестирования на Java**, который я прохожу на [Яндекс.Практикуме](https://practicum.yandex.ru/)

## Технологии

- Java 11
- JUnit 4.13.2
- Maven 4.0.0

Сборка проекта в Jenkins, развёрнутом в Docker в Яндекс.Облаке

Проверка тестового покрытия: Jacoco
Отчёт о тестовых прогонах: Allure Report

## Задание
На банковской карте можно напечатать данные владельца. Чтобы это сделать, принтеру передают строку с именем и фамилией — например, «Тимоти Шаламе». Её получится напечатать, если соблюдены требования: 
- в строке не меньше 3 и не больше 19 символов,
- в строке есть только один пробел,
- пробел стоит не в начале и не в конце строки.

#### Что нужно сделать

1. Напиши код программы в IDEA.
2. Напиши проверки: полностью покрой класс Account тестами.
3. Выложи код программы и тесты на GitHub.
4. Подними Jenkins локально. Нужно прикрутить репозиторий и запустить сборку.
5. Настрой прогон проверок в Jenkins, чтобы тесты не падали.
6. Добавь Allure к коду тестов и проследи, чтобы отчёт появился в Jenkins.
