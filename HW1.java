package hw1;

//TASK1
/*	Посмотрите на схему, сопоставьте номер с его обозначением
1C 2B 3A

Выберите описание,
которое характеризует Сортировку пузырьком (Bubble sorting):
	True - Последовательно сравниваются значения соседних элементов и меняются местами элементы,
если предыдущий больше последующего. Таким образом элементы с большим значением оказываются в конце списка,
а с меньшим в начале.

Алгоритмизация – это…
⦁	True - процесс разработки алгоритма для решения какой-либо задачи

Выберите то, что НЕ является характеристикой алгоритма:
⦁	False - Может быть двусмысленным
⦁	Какого алгоритма НЕ существует?
⦁	True - Наглый алгоритм

Посмотрите на картинку и выберите определение
 для каждого элемента блок-схемы:
1 - начало (конец) алгоритма
2 - операционный блок
3 - цикл с параметром
4 - логический (условный) блок
5 - блок ввода/вывода

⦁	Дан алгоритм покупки продуктов в текстовом виде, расставьте операции,
написанные на псевдокоде в правильном порядке.
1 Начало-START	⦁
2 Получить список продуктов-READ list of products	⦁
3 Покупать пока всё не купим-WHILE (NOT bought all) buy products	⦁
4 Конец-END	⦁
 */
//TASK2
/*Написать псевдокод для алгоритма: сложить три числа и вывести сумму.
⦁	Реализовать алгоритм в коде.
⦁	START
⦁	READ int a = 1;
        int b = 2;
        int c = 3;
⦁	WRITE return a+b+c;
⦁	END
*/

/*Написать псевдокод для алгоритма линейного поиска
Реализовать алгоритм в коде
START
READ int key, int [] array
DO for(int i = 0: i<array.length; i++);
if (array[i] == key) {
return true;
}
return false;
END
 */
public class HW1 {

    public static int getSummeOfThreeNumbers(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(getSummeOfThreeNumbers(a, b, c));

        int key = 3;
        int[] array = {1, 2, 3, 4, 3};
        boolean contains = false;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {

                count++;
                contains = true;
            }
        }

        if (!contains) {
            System.out.println("Key is not found ");
            System.out.println("Количество заданных значений ключа: " + count);
        } else {
            System.out.println("Key is found");
            System.out.println("Количество заданных значений ключа: " + count);
        }
    }
}




