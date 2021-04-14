package musicplayer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PlayListCollection {
    Map<String, PlayList> playListMap; // contain all the play lists

    public PlayListCollection() {
        playListMap = new HashMap<String, PlayList>();
    }

    public Map<String, PlayList> getPlayListMap() {
        return playListMap;
    }

    public void setPlayListMap(Map<String, PlayList> playListMap) {
        this.playListMap = playListMap;
    }

    public void addPlayList(PlayList playList){
        playListMap.put(playList.getPlayListName(), playList);
    }

    public void deletePlayList(PlayList playList){
        playListMap.remove(playList.getPlayListName());
        System.out.println("delete success!");
    }

    public PlayList searchPlayListByName(String playListName){
        PlayList playList = null;
        Set<String> playListSet = playListMap.keySet();
        for (String s:playListSet){
            if (s.equals(playListName)){
                playList = playListMap.get(s);
                break;
            }
        }
        return playList;
    }

    // display all the music lists' names
    public void displayListName(){
        Set<String> playListSet = playListMap.keySet();
        System.out.println("all music lists are:");
        for (String s:playListSet){
            System.out.println(s);
        }
    }
}
