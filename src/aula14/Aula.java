package aula14;

public class Aula {

    private PlayerVideo video;
    private PlayerAudio audio;

    void audios(){
        System.out.println("arquivos de audio");

        audio = new WMA();
        audio.play();
        audio.pause();
        audio.volume(89);
        audio.taxaDeBits();
        audio.nomeMusica("Last Resort - Papa Roch");
        audio.stop();

        System.out.println("--------------------");

        audio = new MP3();
        audio.play();
        audio.pause();
        audio.volume(77);
        audio.taxaDeBits();
        audio.nomeMusica("Anything - The Calling");
        audio.stop();

    }


    void videos(){
        System.out.println("arquivos de video");

        video = new WMV();
        video.play();
        video.pause();
        video.volume(12);
        video.taxaDeBits();
        video.taxaDeQuadros();
        video.nomeArquivo("Galerito_x_GildaEsfirra.wmv");
        video.stop();

        System.out.println("--------------------");

        video = new RMV();
        video.play();
        video.pause();
        video.volume(15);
        video.taxaDeBits();
        video.taxaDeQuadros();
        video.nomeArquivo("A_Morte_de_Athena.rmv");
        video.stop();

        System.out.println("--------------------");

        video = new AVI();
        video.play();
        video.pause();
        video.volume(15);
        video.taxaDeBits();
        video.taxaDeQuadros();
        video.nomeArquivo("A_Ressureicao_de_Jiban.avi");
        video.stop();

        System.out.println("--------------------");


    }

    public static void main(String args[]){

        new Aula().videos();
        new Aula().audios();





    }
}
