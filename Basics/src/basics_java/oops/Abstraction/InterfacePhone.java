package basics_java.oops.Abstraction;
interface Phone{
    abstract void makeCall();
    abstract void playMusic();
    default String camera(){
        String image_video="Clicking photo and recording video!!!! ";
        return image_video;
    }
    abstract void playGame();
}
interface eardopes{
    abstract void connected();
    abstract void disconnected();

    static int battery() {
        int batt=50;
        return batt;
    }
}
class Iphone implements Phone,eardopes{

    @Override
    public void makeCall() {
        System.out.println("Iphone is calling!!! ");
    }

    @Override
    public void playMusic() {
        System.out.println("Iphone is playing music");
    }

    @Override
    public void playGame() {
        System.out.println("Lauching and playing game in Iphpne");
    }

    @Override
    public void connected() {
        System.out.println("Eardopes are connected to iphone via bluetooth");
    }

    @Override
    public void disconnected() {
        System.out.println("Eardopes are disconnected from iphone via bluetooth");
    }
}
class Samsung implements Phone,eardopes{

    @Override
    public void makeCall() {
        System.out.println("Samsung is calling!!! ");
    }

    @Override
    public void playMusic() {
        System.out.println("Samsung is playing music");
    }

    @Override
    public void playGame() {
        System.out.println("Lauching and playing game in Samsung");
    }

    @Override
    public void connected() {
        System.out.println("Eardopes are connected to Samsung via bluetooth");
    }

    @Override
    public void disconnected() {
        System.out.println("Eardopes are disconnected from Samsung via bluetooth");
    }
}
public class InterfacePhone {
    static void main(String[] args) {
        Iphone iph=new Iphone();
        Samsung sam=new Samsung();
        iph.makeCall();
        iph.playMusic();
        System.out.println("Iphone is "+iph.camera());
        iph.playGame();
        iph.connected();
        System.out.println("Eardopes battery is "+eardopes.battery()+"% and is connected to iphone");
        iph.disconnected();
        System.out.println(" ");
        sam.makeCall();
        sam.playMusic();
        System.out.println("Samsung is "+sam.camera());
        sam.playGame();
        sam.connected();
        System.out.println("Eardopes battery is "+eardopes.battery()+"% and is connected to samsung");
        sam.disconnected();
    }
}
