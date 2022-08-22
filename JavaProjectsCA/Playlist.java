import java.util.ArrayList;

public class Playlist {

    public static void main(String[] args) {
        
        ArrayList desertIslandPlaylist = new ArrayList<String>();

        desertIslandPlaylist.add("Numb");
        desertIslandPlaylist.add("Hate will never win");
        desertIslandPlaylist.add("Topanga");
        desertIslandPlaylist.add("Guardian Angel");
        desertIslandPlaylist.add("Infinity (888)");
        desertIslandPlaylist.add("Star Shopping");

        System.out.println(desertIslandPlaylist);

        System.out.println(desertIslandPlaylist.size());

        desertIslandPlaylist.remove("Numb");

        System.out.println(desertIslandPlaylist.size());

        int a = desertIslandPlaylist.indexOf("Topanga");

        int b = desertIslandPlaylist.indexOf("Star Shopping");

        String tempA = "Topanga";

        String tempB = "Star Shopping";

        desertIslandPlaylist.set(a, tempA);
        desertIslandPlaylist.set(b, tempB);


    }
    
}
