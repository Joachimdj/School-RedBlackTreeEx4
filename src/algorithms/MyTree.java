/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;
import java.util.Comparator;
/**
 *
 * @author joachimdittman
 */
public class MyTree<Key, Value> implements Interface<Key, Value> {

    private RedBlackBST<Key, Value> tree;
    
    public MyTree() {
        tree = new RedBlackBST(Comparator.naturalOrder());
    }

    @Override
    public Value get(Key k) {
        return tree.get(k);
    }

    @Override
    public void put(Key key, Value value) {
        tree.insert(key, value);
    }

    @Override
    public int size() {
        return tree.getSize();
    }
    
    
    
}
