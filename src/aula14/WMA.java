package aula14;

public class WMA implements PlayerAudio {
    @Override
    public void nomeMusica(String musica) {
        System.out.println("Musica: " + musica);

    }

    @Override
    public void play() {
        System.out.println("Play...");

    }

    @Override
    public void stop() {
        System.out.println("Stop...");

    }

    @Override
    public void pause() {
        System.out.println("Pause...");

    }

    @Override
    public void volume(int volume) {
        System.out.println("Volume: " + volume);

    }

    @Override
    public void taxaDeBits() {
        System.out.println("128 bits...");
    }
}
