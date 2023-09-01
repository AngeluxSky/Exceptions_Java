# Урок 2. Исключения и их обработка.

*Задача 1:*

Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным. Если число отрицательное или равно нулю,
программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".

*Задача 2:*

Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. Если второе число равно нулю, 
программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.



!!!
**Обратите внимание, что в обоих задачах используются собственные исключения, которые наследуются от класса Exception.
Это позволяет нам определить специфическую причину ошибки и передать информацию об ошибке для последующей обработки.**
