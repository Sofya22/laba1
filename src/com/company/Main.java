package com.company;

import java.util.Scanner;
public class Main {

    public static void main (String[]args)
    {
        Container el = new Container();
        System.out.println("Создать 10ти элементный контейнер: ");
        for(int i=0; i<10; i++)
        {
            el.push_back(i);
            System.out.println("Размер контейнера:" + el.getSize()+ "  Элемент:" + el.getElem());
        }

        System.out.println("Удалить 4 элемента: ");
        for(int i=0; i<4; i++)
        {
            el.pop_back();
        }
        System.out.println("Текущий элмент: №" + el.getCounter()+ "  Элемент:" +el.get_i_Elem(el.getCounter())+", Размер контейнера:" +el.getSize());
    }
}
