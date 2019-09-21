package br.ufrn.imd.edb2.uni2.hilton;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FilaBancoTest{


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
    public void addPessoaByName() {
        //Arrange
        //Act
        fila.addPessoa("Hilton", 27);
        //Assert
        assertEquals("Hilton", fila.peek().getNome());
    }

    @Test
    public void addPessoaByObject() {
        //Arrange
        Pessoa p = new Pessoa("Hilton", 27);
        //Act
        fila.addPessoa(p);
        //Assert
        assertSame(p, fila.peek());
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
    public void removeElementWithHighestPriority() {
        //Arrange
        Pessoa p = new Pessoa("João", 46);
        Pessoa t = new Pessoa("Maria", 35);
        fila.addPessoa(p);
        fila.addPessoa(t);
        //Act
        fila.remove();
        //Assert
        assertSame(t,fila.peek());
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