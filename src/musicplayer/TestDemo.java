package musicplayer;

public class TestDemo {
    public void testSong(){
        Song s1 = new Song("s001","song1","Shawn");
        Song s2 = new Song("s002","song2","Rothschild");
        Song s3 = new Song("s003","song3","Richard");
        Song s4 = new Song("s001","song1","Shawn");

        System.out.println(s1);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
        System.out.println(s1==s4);
    }

    public void testPlaylist(){
        Song s1 = new Song("s001","name1","Shawn");
        Song s2 = new Song("s002","name2","Rothschild");
        Song s3 = new Song("s003","name3","Richard");
        Song s4 = new Song("s001","name1","Shawn");

        PlayList mainPlayList = new PlayList("main list");
        mainPlayList.addToPlayList(s1);
        mainPlayList.addToPlayList(s2);
        mainPlayList.addToPlayList(s3);
        mainPlayList.addToPlayList(s4);

        // display all songs in the list
        mainPlayList.displayAllSong();

        // search a song by its id and name
        Song song = mainPlayList.searchSongById("s005");
        if (song!=null){
            System.out.println("the song is:");
            System.out.println(song);
        }else {
            System.out.println("***this song does not exist***");
        }

        Song song1 = mainPlayList.searchSongByName("name1");
        if(song1!=null){
            System.out.println("the song is:");
            System.out.println(song1);
        }else{
            System.out.println("***this song does not exist***");
        }

            // update the song information
        Song songUpdate = new Song("s005","name5","Ryan");
        mainPlayList.updateSong("s001",songUpdate);
        mainPlayList.displayAllSong();

        // delete a song
        mainPlayList.deleteSong("s005");
        mainPlayList.displayAllSong();
    }

    public static void main(String[] args) {
        TestDemo td = new TestDemo();
//        td.testSong();
        td.testPlaylist();
    }
}
