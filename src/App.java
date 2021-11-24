public class App {
    public static void main(String[] args) {
        Calculos calculadora = new Calculos();

        float peso1 = 10;
        float gravidade1 = 9.8f;
        float velocidade1 = 20;
        float peso2 = 800;
        float raio1 = 100;
        float forca1 = 20;
        float tempoInicial1 = 0;
        float tempoFinal1 = 5;
        float forca2 = 150;
        float peso3 = 10;
        float gravidade2 = 10;
        float tempoInicial2 = 7;
        float tempoFinal2 = 12;
        float posicaoFinal1 = 300;
        float posicaoInicial1 = 0;
        float tempo1 = 2.5f;
        float velocidade2 = 340;
        float distanciaPercorrida1 = 2;

        float resultado = calculadora.forcaPeso(peso1, gravidade1);
        float resultado2 = calculadora.forcaCentrÃ­peta(velocidade1, peso2, raio1);
        float resultado3 = calculadora.impulso(forca1, tempoInicial1, tempoFinal1);
        float resultado4 = calculadora.forcaElastica(forca2, peso3, gravidade2);
        float resultado5 = calculadora.velocidadeMedia(tempoFinal2, tempoInicial2, posicaoFinal1, posicaoInicial1);
        float resultado6 = calculadora.movimentoUniforme(tempo1, velocidade2, distanciaPercorrida1);

        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
        System.out.println(resultado5);
        System.out.println(resultado6);
    }
}
