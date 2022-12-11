/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newarraylist;

import java.util.Iterator;
import newarraylist.interfaces.NewArray;

/**
 *
 * @author Bogdan
 * 
 */

public class NewArrayList<T> implements NewArray<T> {
    
    public static void main(String[] args) {
        NewArray<String> strings = new NewArrayList<>();
        strings.add("test");
        strings.add("test2");
        strings.add("test3");
//        System.out.println(strings.get(1));
//        System.out.println(strings.size());
//        for(Object o : strings) {
//            System.out.println(o);
//        }
//        strings.update(1, "hui");
//                for(Object o : strings) {
//            System.out.println(o);
//        }
                strings.remove(1);
                                for(Object o : strings) {
            System.out.println(o);
        }
    }
    
    private T[] values;
    
    NewArrayList() {
        values = (T[]) new Object[0];
    }

    @Override
    public boolean add(T t) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = t;
            return true;
        } catch(ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;

    }

    @Override
    public void remove(int index) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElemAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountElemAfterIndex);
               
        } catch(ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, T t) {
        values[index] = t;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(values);
    }
    
}
