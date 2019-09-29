package br.com.waldson.aula11;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArvoreBinariaBuscaTest {
    private ArvoreBinariaBusca tree;
    @Before
    public void setUp() throws Exception {
        tree = new ArvoreBinariaBusca();
    }

    @Test
    public void isEmpty() {
        tree.insert(10);
        boolean empty;

        empty = tree.isEmpty();

        assertEquals(false, empty);
    }

    @Test
    public void getRoot() {
        Node root = new Node(10);
        Node result;

        tree.insert(root);
        result = tree.getRoot();

        assertEquals(root, result);
    }

    @Test
    public void insert() {
        tree.insert(20);
        assertEquals(false,tree.isEmpty());
    }

    @Test
    public void searchAndFind() {
        Node node = new Node(5);
        tree.insert(10);
        tree.insert(20);
        tree.insert(node);
        Node result;

        result = tree.search(5);

        assertEquals(node, result);
    }

    @Test
    public void searchAndNotFind() {
        Node node = new Node(5);
        tree.insert(10);
        tree.insert(20);
        tree.insert(node);
        Node result;

        result = tree.search(30);

        assertEquals(null, result);
    }

    @Test
    public void removeIfNodeIsLeaf() {
        tree.insert(10);
        tree.insert(20);
        tree.insert(5);
        Node result;

        tree.remove(5);
        result = tree.search(5);

        assertEquals(null, result);

    }

    @Test
    public void removeIfNodeHasOneChild() {
        tree.insert(6);
        tree.insert(4);
        tree.insert(5);
        tree.insert(2);
        tree.insert(1);
        int result;

        tree.remove(2);
        result = tree.search(4).getLeft().getValue();

        assertEquals(1,result);
    }

    @Test
    public void removeIfNodeHasTwoChildren() {
        tree.insert(6);
        tree.insert(4);
        tree.insert(5);
        tree.insert(2);
        tree.insert(1);
        int result;

        tree.remove(4);
        result = tree.search(6).getLeft().getValue();

        assertEquals(5, result);
    }

    @Test
    public void TestBalanceIfTreeIsBalanced() {
        //Arrange
        tree.insert(6);
        tree.insert(3);
        tree.insert(2);
        tree.insert(4);
        tree.insert(9);
        tree.insert(10);
        tree.insert(8);
        boolean balanced;
        //Act
        balanced = tree.isBalanced();
        //Assert
        assertTrue(balanced);
    }

    @Test
    public void TestBalanceIfTreeIsntBalanced() {
        //Arrange
        tree.insert(6);
        tree.insert(3);
        tree.insert(2);
        tree.insert(4);
        tree.insert(9);
        tree.insert(10);
        tree.insert(8);
        tree.insert(1);
        tree.insert(0);
        boolean balanced;
        //Act
        balanced = tree.isBalanced();
        //Assert
        assertFalse(balanced);
    }
}