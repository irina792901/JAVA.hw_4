import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Пусть дан LinkedList с несколькими элементами.
 * Реализуйте метод, который вернет “перевернутый” список.
 */
public class Revers_linked_list {
    public static void main(String[] args) {
        String[] array = {"шла", "Саша", "по шоссе", "и", "сосала", "сушку"};
        LinkedList<String> lili = new LinkedList<>(Arrays.asList(array));
        System.out.println(lili);
        lili = reverse(lili);
        System.out.println(lili);
    }

    private static LinkedList<String> reverse(LinkedList<String> lolo) {
        String temp;
        for (int i = 0; i < lolo.size() / 2; i++) {
            lolo.add(i+1, lolo.get(lolo.size() - 1 - i));
            lolo.add(lolo.size() - 1 - i, lolo.get(i));
            lolo.remove(lolo.size() - 1 - i);
            lolo.remove(i);
        }
        return lolo;
    }
}
/*
как вариант в методе создать new linkedList и записать через
 new.addFirst(old.removeFirst()), но в задании сказано изменить исходный
 */