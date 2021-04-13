package musicplayer;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private String playListName;
    private List<Song> musicList;

    public PlayList(String playListName) {
        this.playListName = playListName;
        musicList = new ArrayList<Song>();
    }

    // add the song to this play list
    public void addToPlayList(Song song){
        // cannot add the repeated song
        boolean flag = false;
        for (Song s:musicList){
            if (s.equals(song)){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("***cannot add, this song is already in the list!***");
        }else {
            musicList.add(song);
        }
    }

    // search the song by its id
    public Song searchSongById(String id){
        Song song = null;
        for (Song s:musicList){
            if (s.getId().equals(id)){
                song = s;
                break;
            }
        }
        return song;
    }

    // search the song by its name
    public Song searchSongByName(String name){
        Song song = null;
        for (Song s:musicList){
            if (s.getName().equals(name)){
                song = s;
                break;
            }
        }
        return song;
    }

    // update the song information in this list
    public void updateSong(String id, Song song){
        Song song1 = searchSongById(id);
        if (song1==null){
            System.out.println("***this song with id:"+id+"does not exist***");
        } else {
            musicList.remove(song1);
            musicList.add(song);
            System.out.println("update success!");
        }
    }

    // delete a song in this list
    public void deleteSong(String id){
        Song song1 = searchSongById(id);
        if (song1!=null){
            musicList.remove(song1);
        }else {
            System.out.println("***this song with id:"+id+"does not exist***");
        }
    }

    // show all the songs in the list
    public void displayAllSong(){
        System.out.println("all the songs in the list are:");
        for (Song s:musicList){
            System.out.println(s);
        }
    }
}
