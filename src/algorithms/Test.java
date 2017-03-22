/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Comparator;

/**
 *
 * @author Tobias
 */
public class Test
{
    public static void main(String[] args)
    {
        Interface<Integer, String> map = new MyTree<>(); 
        assert(map.size() == 0);
        map.put(0, "Q");
        assert(map.size() == 1);
        map.put(1, "D");
        map.put(2, "C");
        map.put(3, "G");
        map.put(4, "T");
        assert(map.size() == 5);
        assert(map.get(666) == null);
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(4));
         
    }
}