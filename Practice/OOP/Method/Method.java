package OOP.Method;

class Computer {

    public void PlayMusic() {
        System.out.println("Play some music...");
    }

    public String getMyPen() {
        return "Pen";
    }
}

public class Method {

    public static void main(String[] args) {

        Computer music = new Computer();
        Computer pen = new Computer();

        music.PlayMusic();

        String myPen = pen.getMyPen();
        System.out.println(myPen);
    }
}
