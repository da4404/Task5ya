package ex02;
//*
public class Main {
    public static void main(String[] args) {
        Playable[] band = {
                new Guitar(6),
                new Piano("c major"),
                new Drum("bass")
        };
        for (Playable instrument : band )
        {
            instrument.play();
        }
    }
}

