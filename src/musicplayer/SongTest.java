package musicplayer;

public class SongTest {
    public static void main(String[] args) {
        Song s1 = new Song("s001","song1","Shawn");
        Song s2 = new Song("s002","song2","Rothschild");
        Song s3 = new Song("s003","song3","Richard");
        Song s4 = new Song("s001","song1","Shawn");

        System.out.println(s1);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
        System.out.println(s1==s4);
    }
}
