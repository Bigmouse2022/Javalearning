package player;

public class Test1 {
    public static void main(String[] args) {
        // 定义几个Song类的对象，添加到播放列表中
        Song song1 = new Song("s001", "两只老虎", "小太阳");
        Song song2 = new Song("s002", "小燕子", "风车");
        Song song3 = new Song("s003", "茉莉花", "彩虹");
        Song song4 = new Song("s003", "茉莉花", "彩虹");
        // 创建一个PlayList对象
        PlayList mainPlayList = new PlayList("主播放列表");
        mainPlayList.addToPlayList(song1);
        mainPlayList.addToPlayList(song2);
        mainPlayList.addToPlayList(song3);
        mainPlayList.addToPlayList(song4);
        // 显示播放列表的内容
        mainPlayList.displayAllSong();
    }
}
