package Oops.MultipleInheritance;

public class NiceCar {
    private Engine engine;
    private Media player = new MediaPlayer() ;



    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.start();
    }

    public void musicStart(){
        player.start();
    }
    public void musicStop(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
