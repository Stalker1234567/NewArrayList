/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newarraylist;

import java.util.Iterator;

/**
 *
 * @author Bogdan
 */
public class ArrayIterator<T> implements Iterator<T> {

    private int index = 0;
    private T[] values;
    
    ArrayIterator(T[] values) {
        this.values = values;
    }
    
    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public T next() {
        return values[index++];
    }
    
}
