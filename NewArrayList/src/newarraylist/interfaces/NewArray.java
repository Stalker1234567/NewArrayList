/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package newarraylist.interfaces;

/**
 *
 * @author Bogdan
 */
public interface NewArray<T> extends Iterable<T> {
    boolean add(T t);
    void remove(int index);
    T get(int index);
    int size();
    void update(int index, T t);
}
