/*
Q1 — Classe Retangulo
Crie a classe Retangulo com double base e double altura. Crie um
construtor com os dois valores. Implemente area(), perimetro() e
ehQuadrado(). Teste dois retângulos no void main().
*/

class Retangulo{
    double base, altura, area, perimetro;
    
    Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    Double area(){
        return area = base * altura;
    }
    Double perimetro(){
        return perimetro = 2 * (base + altura);
    }
    Boolean ehQuadrado(){
        return base == altura;
    }
}

void main(){
    var ret1 = new Retangulo(2, 5);
    var ret2 = new Retangulo(4, 4);
    
    IO.println("Retângulo 1" +
        " | Area: " + ret1.area() +
        " | Perimetro: " + ret1.perimetro() +
        " | Quadrado: " + ret1.ehQuadrado());

    IO.println("Retângulo 2" +
        " | Area: " + ret2.area() +
        " | Perimetro: " + ret2.perimetro() +
        " | Quadrado: " + ret2.ehQuadrado());
}