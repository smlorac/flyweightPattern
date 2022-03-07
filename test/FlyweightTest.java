package Aula09.test;

import Aula09.model.Quadrado;
import Aula09.model.Triangulo;
import Aula09.service.FlyweightFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlyweightTest {

    @Test
    void getTrianguloTamanho2(){

        Triangulo triangulo = FlyweightFactory.obterTriangulo("vermelho");
        triangulo.setTamanho(2);

        Triangulo triangulo2 = FlyweightFactory.obterTriangulo("vermelho");
        triangulo.setTamanho(4);

        Triangulo triangulo3 = FlyweightFactory.obterTriangulo("azul");
        triangulo3.setTamanho(6);

        assertEquals(triangulo.getCor(), "vermelho");
        assertEquals(triangulo2.getTamanho(), 4);
        assertEquals(FlyweightFactory.trianguloMap.size() == 2, true);

        Quadrado quadrado = FlyweightFactory.obterQuadrado(2);
        quadrado.setCor("vermelho");

        Quadrado quadrado2 = FlyweightFactory.obterQuadrado(2);
        quadrado2.setCor("azul");

        Quadrado quadrado3 = FlyweightFactory.obterQuadrado(4);
        quadrado3.setCor("vermelho");

        Quadrado quadrado4 = FlyweightFactory.obterQuadrado(6);
        quadrado4.setCor("azul");

        assertEquals(quadrado.getTamanho(), 2);
        assertEquals(quadrado2.getCor(), "azul");
        assertEquals(FlyweightFactory.quadradoMap.size() == 3, true);

    }
}
