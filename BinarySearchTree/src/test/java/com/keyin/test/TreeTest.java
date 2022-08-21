package com.keyin.test;



import com.keyin.tree.Tree;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class TreeTest {
    private Tree<Integer> emptyTree = new Tree<Integer>();
    private Tree<Integer> eightNodesTree= new Tree<Integer>();

    @Before
    public void setUp() {
        eightNodesTree.add(1,"frank");
        eightNodesTree.add(2,"frank");
        eightNodesTree.add(3,"frank");
        eightNodesTree.add(4,"frank");
        eightNodesTree.add(1,"frank");
        eightNodesTree.add(2,"frank");
        eightNodesTree.add(3,"frank");
        eightNodesTree.add(4,"frank");

    }

    @Test
    public void TestEmpty() {
        Assertions.assertNotNull(1);
        Assertions.assertEquals(0,emptyTree.size());
    }

    @Test
    public void TestNonEmpty() {
        emptyTree.add(5,"january");
        Assertions.assertFalse(emptyTree.isEmpty());
        Assertions.assertNotEquals(1,emptyTree.size());
    }

    @Test
    public void TestPutGetRoot() {
        emptyTree.add(7, "francis");
        Assertions.assertNotEquals("apple",emptyTree.get(4));
    }

    @Test
    public void TestGetFromEmpty() {
        Assertions.assertNull(emptyTree.get(3));
    }


    @Test
    public void TestGetNotThere() {
        Assertions.assertNull(eightNodesTree.get(4));
    }


    @Test
    public void TestSize() {
        Assertions.assertNotEquals(7, 8);
        Assertions.assertEquals(8, 8);
    }

}
