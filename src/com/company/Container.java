package com.company;

public class Container {
    private int [] mass;
    private int counter;
    private int size;
    private int Increase_in_size;

    Container()
    {
        size = 5;
        counter = 0;
        Increase_in_size = 5;
        mass = new int[size];
    }

    private void increment ()
    {
        size += Increase_in_size;
        int [] new_mass = new int[size];
        for (int i = 0; i < size - Increase_in_size; i++)
        {
            new_mass[i]=mass[i];
        }
        mass = new_mass;
    }
    private void decrease ()
    {
        size -= Increase_in_size;
        int [] new_mass = new int[size];
        for (int i = 0; i < size; i++)
        {
            new_mass[i]=mass[i];
        }
        mass = new_mass;
    }
    public void push_back (int el)
    {
        if(counter == size) increment();
        mass[counter]=el;
        counter++;
    }
    public void pop_back ()
    {
        if(counter!=0)
        {
            counter--;
            if(counter<=size-Increase_in_size) decrease();
        }
        else System.out.println("Невозмежно удалить. контейнер пустой");
    }
    public int getElem ()
    {
        int elem = 0;
        if(counter>0)
        {
            int temp = counter-1;
            elem = mass[temp];
        }
        else System.out.println("контейнер пустой!");
        return elem;
    }
    public int get_i_Elem (int i)
    {
        int elem =0;
        --i;
        if(i<0||i>=counter)
            System.out.println("Элемент не существует!");
        elem = mass[i];
        return elem;
    }
    public int getCounter ()
    {
        return counter;
    }
    public int getSize ()
    {
        return size;
    }
}