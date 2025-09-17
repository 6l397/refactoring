# Refactoring

## Зауваження до початкового коду
1. Клас `humanIMB` перейменувала на `HumanBmi`, бо назви класів мають писатися з великої літери (UpperCamelCase).
2. Змінні `W`, `H`, `imb` зробила більш зрозумілими: `weight`, `height`, `bmi` (у стилі lowerCamelCase).
3. Поля зробила `private`, бо вони не мають бути доступними напряму.
4. Методи перейменувала: замість `takeW`, `putW`, `takeH`, `putH` → тепер `getWeight`, `setWeight`, `getHeight`, `setHeight`.
5. Метод `Result` перейменувала на `getResult`, логіку залишила через `if-else`.
6. Тепер `bmi` не зберігається як змінна, а обчислюється у методі `getBmi()`.
7. У класі `Main` створюю об’єкт вже як `HumanBmi`.
8. Коментарі замінила на Javadoc.  