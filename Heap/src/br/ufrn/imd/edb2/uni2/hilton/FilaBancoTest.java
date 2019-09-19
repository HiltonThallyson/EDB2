package br.ufrn.imd.edb2.uni2.hilton;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class FilaBancoTest {


    FilaBanco fila = null;

    @Before
    public void setUp() {
        fila = new FilaBanco();
    }

    @Test
    public void mustBeOrdered(){
        //Arrange
        Pessoa vovo = new Pessoa("Vovó", 65);
        Pessoa fulano = new Pessoa("Fulano", 10);
        Pessoa sicrano = new Pessoa("Sicrano", 25);
        //Act
        fila.addPessoa(vovo);
        fila.addPessoa(fulano);
        fila.addPessoa(sicrano);

        //Assert
        assertSame(vovo, fila.peek());
        fila.remove();
        assertSame(sicrano, fila.peek());
        fila.remove();
        assertSame(fulano, fila.peek());
        fila.remove();
        assertNull(fila.peek());

    }
    @Test
    public void addPessoa() {
    }

    @Test
    public void testAddPessoa() {
    }

    @Test
    public void peekMustReturnElementHighestPriority() {
        //Arrange
        Pessoa node = new Pessoa("Fulano", 10);
        //Act
        fila.addPessoa(node);
        //Assert
        assertSame(node, fila.peek());
    }

    @Test
    public void remove() {
    }

    @Test
    public void getSize() {
    }

    @Test
    public void getCapacity() {
    }

    @Test
    public void mustReorderWhenPriorityChange(){
        //Arrange
        Pessoa vovo = new Pessoa("Vovó", 65);
        Pessoa fulano = new Pessoa("Fulano", 10);
        Pessoa sicrano = new Pessoa("Sicrano", 25);
        fila.addPessoa(vovo);
        fila.addPessoa(fulano);
        fila.addPessoa(sicrano);
       //Act
       fulano.setIdade(67);
       //Assert
        assertSame(fulano, fila.peek());
        //Não modificar teste

    }
}