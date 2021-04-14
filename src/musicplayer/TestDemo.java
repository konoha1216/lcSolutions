package musicplayer;

import java.util.Scanner;

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

    public void testPlayListCollection(){
        Song s1 = new Song("s001","name1","Shawn");
        Song s2 = new Song("s002","name2","Rothschild");
        Song s3 = new Song("s003","name3","Richard");
        Song s4 = new Song("s001","name1","Shawn");

        PlayList mainPlayList = new PlayList("main list");
        // add the songs to the main list
        mainPlayList.addToPlayList(s1);
        mainPlayList.addToPlayList(s2);
        mainPlayList.addToPlayList(s3);

        // create a new music list, add songs in main list to the new list
        PlayList favoriteList = new PlayList("favorite list");
        favoriteList.addToPlayList(mainPlayList.getMusicList().get(0));
        favoriteList.addToPlayList(mainPlayList.getMusicList().get(2));
        favoriteList.displayAllSong();

        // add the two lists to the list collection
        PlayListCollection plc = new PlayListCollection();
        plc.addPlayList(mainPlayList);
        plc.addPlayList(favoriteList);
        plc.displayListName();

        // search a play list by its name and display all songs in it
        PlayList playList = plc.searchPlayListByName("favorite list");
        playList.displayAllSong();
        // delete a music list
        plc.deletePlayList(favoriteList);
        plc.displayListName();
    }


    // 主页面
    public void mainMenu() {
        System.out.println("***************************************");
        System.out.println("                 **Main Menu**                      ");
        System.out.println("                 1--Player lists    ");
        System.out.println("                 2--Music Player    ");
        System.out.println("                 0--Quit   ");
        System.out.println("***************************************");

    }

    // 播放列表管理菜单
    public void playListMenu() {
        System.out.println("*******************************************************");
        System.out.println("                 **Player Lists**    ");
        System.out.println("                 1--add a song to the main list    ");
        System.out.println("                 2--add a song to a normal list    ");
        System.out.println("                 3--search a song by its ID in one list   ");
        System.out.println("                 4--search a song by its name in one list   ");
        System.out.println("                 5--update a song in one list   ");
        System.out.println("                 6--delete a song in one list   ");
        System.out.println("                 7--display all songs in one list    ");
        System.out.println("                 9--back   ");
        System.out.println("*******************************************************");
    }

    // 播放器菜单
    public void playerMenu() {
        System.out.println("*******************************************************");
        System.out.println("                 **Music Player**    ");
        System.out.println("                 1--add a list to the player    ");
        System.out.println("                 2--delete a list in the player    ");
        System.out.println("                 3--search a list by its name    ");
        System.out.println("                 4--display all player lists    ");
        System.out.println("                 9--back   ");
        System.out.println("*******************************************************");
    }

    public void test(){
        TestDemo td = new TestDemo();
        Scanner sc = new Scanner(System.in);
        int input = 0, input1 = 0, input2 = 0;

        //创建一个播放列表容器（播放器）
        PlayListCollection plc=new PlayListCollection();
        //创建主播放列表
        PlayList mainPlayList=new PlayList("main");
        //将主播放列表添加到播放器
        plc.addPlayList(mainPlayList);
        PlayList favouritePlayList=null;

        while (true){
            td.mainMenu();
            System.out.println("please input a number to operate:");
            input = sc.nextInt();
            if (input==0){
                break;
            }
            switch (input){
                case 1:
                    while (true){
                        td.playListMenu();
                        System.out.println("please input a number to operate player lists:");
                        input1 = sc.nextInt();
                        if(input1==9){
                            break;
                        }
                        switch (input1){
                            case 1:
                                System.out.println("add songs to the main list");
                                System.out.println("how many songs to add：");
                                int count=sc.nextInt();
                                for(int i=1;i<=count;i++){
                                    System.out.println("input the NO."+i+" song：");
                                    System.out.println("input its id:");
                                    String strId=sc.next();
                                    System.out.println("input its name:");
                                    String strName=sc.next();
                                    System.out.println("input its singer:");
                                    String strSinger=sc.next();
                                    //创建歌曲类的对象
                                    Song song=new Song(strId,strName,strSinger);
                                    mainPlayList.addToPlayList(song);
                                    //mainPlayList.displayAllSong();
                                }
                                mainPlayList.displayAllSong();
                                break;
                            case 2:
                                System.out.println("add songs to a normal list");
                                System.out.println("the list name to add songs：");
                                String sName=sc.next();
                                //根据名称判断播放列表是否在播放器中存在
                                favouritePlayList=plc.searchPlayListByName(sName);
                                if(favouritePlayList==null){
                                    System.out.println("***this list doesn't exits, add it to the player first***");
                                }else{
                                    System.out.println("how many songs to add：");
                                    int count1=sc.nextInt();
                                    for(int i=1;i<=count1;i++){
                                        System.out.println("input the NO."+i+" song：");
                                        System.out.println("input its id：");
                                        String strId=sc.next();
                                        //首先判断该id的歌曲是否在主播放列表存在
                                        Song song=mainPlayList.searchSongById(strId);
                                        if(song==null){
                                            //如果歌曲不存在，则创建新的添加，并且添加到主播放列表
                                            System.out.println("***this song isn't in main list, please continue to input***");
                                            System.out.println("input its name：");
                                            String strName=sc.next();
                                            System.out.println("input its singer：");
                                            String strSinger=sc.next();
                                            //创建一个Song类的对象
                                            song=new Song(strId,strName,strSinger);
                                            //分别将歌曲添加到普通播放列表和主播放列表
                                            favouritePlayList.addToPlayList(song);
                                            mainPlayList.addToPlayList(song);
                                        }else{
                                            //如果歌曲存在于主播放列表，则直接添加到现在的播放列表
                                            System.out.println("***this song is in the main list, no need to add other information***");
                                            favouritePlayList.addToPlayList(song);
                                        }
                                    }
                                    //显示播放列表中的歌曲信息
//                                    System.out.println("主播放列表:");
//                                    mainPlayList.displayAllSong();
//                                    System.out.println("普通播放列表：");
                                    favouritePlayList.displayAllSong();
                                }
                                break;
                            case 3:
                                System.out.println("search a song by its ID in one list");
                                System.out.println("the list to search：");
                                String strPlayListName1=sc.next();
                                //查询播放列表是否存在
                                PlayList pl=plc.searchPlayListByName(strPlayListName1);
                                if(pl==null){
                                    System.out.println("***this list does not exist***");break;
                                }else{
                                    System.out.println("the song's id to search");
                                    String strId1=sc.next();
                                    Song s=pl.searchSongById(strId1);
                                    if(s==null){
                                        System.out.println("this song does not exits in the "+strPlayListName1+" list");
                                    }else{
                                        System.out.println("this song is：");
                                        System.out.println(s);
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("search a song by its name in one list");
                                System.out.println("the list to search：");
                                String strPlayListName2=sc.next();
                                //查询播放列表是否存在
                                PlayList pl1=plc.searchPlayListByName(strPlayListName2);
                                if(pl1==null){
                                    System.out.println("***this list does not exist***");break;
                                }else{
                                    System.out.println("the song's name to search");
                                    String strName1=sc.next();
                                    Song s=pl1.searchSongById(strName1);
                                    if(s==null){
                                        System.out.println("this song does not exits in the "+strPlayListName2+" list");
                                    }else{
                                        System.out.println("this song is：");
                                        System.out.println(s);
                                    }
                                }
                                break;
                            case 5:
                                System.out.println("update a song in one list");
                                System.out.println("the list to update:");
                                String strPlayListName3=sc.next();
                                PlayList pl2=plc.searchPlayListByName(strPlayListName3);
                                if (pl2==null){
                                    System.out.println("***this list does not exist***");break;
                                }else {
                                    System.out.println("input its id:");
                                    String strId=sc.next();
                                    System.out.println("input its name:");
                                    String strName=sc.next();
                                    System.out.println("input its singer:");
                                    String strSinger=sc.next();
                                    //创建歌曲类的对象
                                    Song song=new Song(strId,strName,strSinger);
                                    pl2.updateSong(strId, song);
                                }
                                break;
                            case 6:
                                System.out.println("delete a song in one list");
                                System.out.println("the list to delete a song:");
                                String strPlayListName4=sc.next();
                                PlayList pl3=plc.searchPlayListByName(strPlayListName4);
                                if (pl3==null){
                                    System.out.println("***this list does not exist***");break;
                                }else {
                                    System.out.println("input its id:");
                                    String strId=sc.next();
                                    pl3.deleteSong(strId);
                                }
                                break;
                            case 7:
                                System.out.println("display all songs in one list");
                                System.out.println("the list to display:");
                                String strPlayListName5=sc.next();
                                PlayList pl4=plc.searchPlayListByName(strPlayListName5);
                                if (pl4==null){
                                    System.out.println("***this list does not exist***");break;
                                }else {
                                    pl4.displayAllSong();
                                }
                                break;
                            default:
                                System.out.println("***no operation for this input***");
                                break;
                        }
                    }
                    break;
                case 2:
                    while (true){
                        td.playerMenu();
                        System.out.println("please input a number to operate the music player:");
                        input2 = sc.nextInt();
                        if (input2==9){
                            break;
                        }
                        switch (input2){
                            case 1:
                                System.out.println("add a list to the player");
                                System.out.println("the name of list to add：");
                                String playerName=sc.next();
                                //创建一个新的播放列表对象
                                favouritePlayList=new PlayList(playerName);
                                //将播放列表添加到播放器Map
                                plc.addPlayList(favouritePlayList);
                                break;
                            case 2:
                                System.out.println("delete a list in the player");
                                System.out.println("the list to delete:");
                                String strPlayListName=sc.next();
                                if(strPlayListName.equals("main")){
                                    System.out.println("***cannot delete the main list***");
                                    break;
                                }
                                //查询播放列表是否存在
                                PlayList playList1=plc.searchPlayListByName(strPlayListName);
                                if(playList1==null){
                                    System.out.println("***this list does not exist***");
                                }else{
                                    //存在则删除
                                    plc.deletePlayList(playList1);
                                }
                                break;
                            case 3:
                                System.out.println("search a list by its name");
                                System.out.println("the list name to search");
                                String strPlayList1=sc.next();
                                PlayList playList2=plc.searchPlayListByName(strPlayList1);
                                if(playList2==null){
                                    System.out.println("***this list does not exist***");
                                }else{
                                    //显示该播放列表名称及其中的所有歌曲
                                    System.out.println("this list exists");
                                    playList2.displayAllSong();
                                }
                                break;
                            case 4:
                                System.out.println("display all player lists");
                                plc.displayListName();
                                break;
                            default:
                                System.out.println("***no operation for this input***");
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("***no operation for this input***");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        TestDemo td = new TestDemo();
//        td.testSong();
//        td.testPlaylist();
//        td.testPlayListCollection();
        td.test();
    }
}
