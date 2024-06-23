# Домашнее задание к занятию «Testability. Введение в ООП»

## Цель задания

1. Написать свои сервисные классы.
2. Научиться писать многофайловую программу.

------

## Инструкция к заданию

1. Скачайте и установите профессиональный редактор кода [Intellij Idea Community Version](https://www.jetbrains.com/idea/download/).
1. Откройте IDEA и [создайте новый Java-проект](QA_Java_Idea_Create.md). Под каждую задачу следует создавать отдельный проект, если обратное не сказано в условии.
2. Создайте пустой репозиторий на GitHub и свяжите его с папкой вашего проекта, а не с какой-либо другой.
3. Правильно настройте репозиторий в плане `.gitignore`. Проигнорируйте папки `.idea` и `out` и `.iml`-файл — их в репозитории быть не должно.
4. Выполните в IDEA требуемую задачу согласно условию.
5. Проверьте соблюдение [правил форматирования кода](QA_Java_Idea_Format.md).
6. Закоммитьте и отправьте в репозиторий содержимое папки проекта.

------

## Материалы, которые пригодятся для выполнения задания

1. [Как создать Java-проект в IDEA?](QA_Java_Idea_Create.md)
1. [Как отформатировать код в Java?](QA_Java_Idea_Format.md)

------

## Задание 1 — обязательное

В этой задаче мы считаем, что пользователь вводит корректные значения входных данных.

Вы уже научились создавать классы и методы. Поэтому вам необходимо модернизировать [приложение для расчёта миль](./HW_PRIMITIVES.md). Напомним, мили начисляются как 1 миля за каждые 20 рублей в стоимости билета, дробные мили не допускаются. 

Теперь сама логика расчёта будет находиться в специально выделенном классе сервиса, а в `Main` мы будем лишь создавать объект этого сервиса и вызывать его метод, передавая аргументами все необходимые данные для расчёта. Получив от вызова метода рассчитанный результат, мы выведем его на экран.

Создайте класс `BonusMilesService`: `File -> New -> Java Class`, вводите название и нажимаете `Enter`.

Определите в нём метод `calculate`, который:
* принимает на вход один параметр: цену билета, типа `int`;
* анализируя значение переданного параметра, возвращает рассчитанное количество миль.

Разместите следующий код в классе `Main`:

```java
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
    }
}
```

Убедитесь, что выводимое в консоль значение соответствует логике расчёта бонуса. Проверьте на разных примерах.

------

## Задание 2 — обязательное

В этой задаче мы считаем, что пользователь вводит корректные значения входных данных.

Вы решили написать сервис, который рассчитывает индекс массы тела (body mass index).

Формулу расчёта bmi-индекса вам предстоит найти самостоятельно.
Сервисный метод должен возвращать целое число. Чтобы дробное превратить в целое, можете использовать приведение типов: `(int) index`, где `index` имеет дробный тип.
Пример для самопроверки: для роста 1.87 метра и веса 98 кг он будет 28.

Создайте класс `BmiService` с методом `calculate`:
* который принимает все нужные данные в параметрах;
* в названии параметров указаны единицы измерения, например, в метрах ли вы принимаете рост;
* метод возвращает посчитанный bmi-индекс в виде целого числа.

Продемонстрировать в `Main` по аналогии с первой задачей:
* создание объекта;
* вызов метода `calculate`;
* печать в консоль результата, проверьте, что ваша программа считает правильно, сравнив его со своими примерами.

------

## Задание 3 — необязательное

В этой задаче мы считаем, что пользователь вводит корректные значения входных данных.

Вам поручили написать кредитный калькулятор, который считает как на сайте. Но формулы, естественно, не дали.

Вам нужно провести небольшой анализ и написать свой `CreditPaymentService`, который умеет рассчитывать ежемесячный платёж (см. аннуитетный платёж).

Параметры, их количество, типы, а также формулу вам необходимо определить самим.

Обратите внимание: на тех же данных ваш сервис должен считать так же.

Чтобы это продемонстрировать, в `Main` создайте объект и три раза вызовите его метод `calculate`. Результаты каждого вызова выводите в консоль.

Скриншоты для решения задачи. Важно: это не реальный сервис.

![image](https://user-images.githubusercontent.com/53707586/212545840-11c9918b-832a-4f19-9ade-29e5c259ecf8.png)

![image](https://user-images.githubusercontent.com/53707586/212545847-3b72640a-3c13-49dd-bacd-0020c8d4966a.png)

![image](https://user-images.githubusercontent.com/53707586/212545851-949d5826-82dc-47f7-b18a-e476819633af.png)

Подсказка: для возведения чисел в степень в Java изучите и используйте команду `Math.pow`.

------

## Правила приёма работы

Для каждой задачи прикреплена ссылка на публичный репозиторий GitHub с решением.


------

## Критерии оценки

1. В каждом репозитории размещено содержимое папки проекта IDEA. Корнем репозитория должна быть именно папка проекта — не папка `src`, не папка внутри которой лежит папка проекта. Таким образом, в корне репозитория должна лежать сразу папка `src`.
1. Есть файл `.gitignore`, игнорирующий ненужные файлы и папки, которые должны отсутствовать в репозитории. Если они присутствуют, их нужно оттуда удалить.
1. Программа соответствует всем требованиям из условия задачи.
1. Программа использует только те инструменты языка, которые мы проходили или которые прямо разрешены условием задачи.
1. Программа работает правильно на всех примерах из условия.
1. Программный код отформатирован и соответствует пройденным требованиям к качеству кода.
1. Программа спроектирована достаточно логично и правильно, не противоречит общепринятым в производстве практикам и традициям.
1. При наличии недочётов, в зависимости от их серьёзности и количества, работа может быть отправлена на доработку или принята — решение принимается на основе экспертной оценки работы.