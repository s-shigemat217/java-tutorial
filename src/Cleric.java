import java.util.Random;

public class Cleric {
    String name;
    int hp = 50;
    final int maxHp =50;
    int mp = 10;
    final int maxMp = 10;

    public void selfAid(){
        mp -= 5;
        hp = maxHp;
    }
    public int pray(int seconds){
        int recovery = seconds + new java.util.Random().nextInt(3);
        mp += recovery;
        if(mp >= maxMp){
            mp = maxMp;
        }
        return mp;
    }
}
