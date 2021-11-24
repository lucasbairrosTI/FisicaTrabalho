public class Calculos {

    public float forcaPeso(float peso1,float gravidade1) {
        return peso1 * gravidade1; //98N
    }

    public float forcaCentrÃ­peta(float velocidade1,float peso2,float raio1) {
        return ((velocidade1*velocidade1) / raio1) * peso2; //3200N
    }

    public float impulso(float forca1,float tempoInicial1,float tempoFinal1) {
        return (tempoFinal1-tempoInicial1) * forca1; //100
    }

    public float forcaElastica(float forca2,float peso3,float gravidade2) {
        return (gravidade2*peso3) / forca2; //0,66m
    }

    public float velocidadeMedia(float tempoFinal2,float tempoInicial2,float posicaoFinal1,float posicaoInicial1) {
        return (posicaoFinal1-posicaoInicial1) / (tempoFinal2-tempoInicial2); //60km/h
    }

    public float movimentoUniforme(float tempo1,float velocidade2,float distanciaPercorrida1) {
        return (velocidade2*tempo1) / distanciaPercorrida1; 
    }

    //public float movimentoUniformementeVariado(){
    //    return ;
    //}
}