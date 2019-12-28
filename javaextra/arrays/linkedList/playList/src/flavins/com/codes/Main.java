package flavins.com.codes;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Zombi", "Fela");
        album.addSong("Zombie", 3.4);
        album.addSong("Wakaka", 4.0);
        album.addSong("Mamiwater", 5.0);
        album.addSong("African Woman", 5.0);
        album.addSong("Kparawo", 5.0);

        albums.add(album);

        album = new Album("Moral Instruction", "Falz");
        album.addSong("elections", 4.9);
        album.addSong("this is nigeria", 3.6);
        album.addSong("Mr Politician", 5.0);
        album.addSong("come dance with me", 3.2);
        albums.add(album);


        LinkedList<Song>playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Wakaka", playList);
        albums.get(0).addToPlayList("Zombie", playList);
        albums.get(0).addToPlayList("Kparawo", playList);
        albums.get(0).addToPlayList("mummy", playList);
        albums.get(0).addToPlayList(2, playList);

        play(playList);
    }



    private static void play(LinkedList<Song>playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song>listIterator = playList.listIterator();
        if(playList.size()==0){
            System.out.println("No song in the play List");
            return;
        }
        else {
            System.out.println("Now Playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            System.out.println("Please make a choice number");
            int choice = scanner.nextInt();
            switch (choice){
                case 0:
                    System.out.println("Playlist completed now quiting the playlist");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();

                        }
                        forward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("now playing " + listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the end of the playList");
                        forward=false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious());
                        listIterator.previous();

                    }
                    forward=false;
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else{
                        System.out.println("We have kinda reached the end of the service");
                        forward=true;
                    }

                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Replaying " + listIterator.previous().toString());
                            forward=false;
                        }else{
                            System.out.println("We are at the begining of the playlist");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("We are replaying " + listIterator.next().toString());
                            forward=true;
                        }else{
                            System.out.println("We have reached the end of the play list");
                        }
                    }
                    break;
                case 4:
                   printPlayList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().toString());
                        }
                        else if(listIterator.hasPrevious()){
                            System.out.println("Now Playing " + listIterator.previous().toString());
                        }
                    }
                    break;
            }
        }
    }


    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to plya previous song\n" +
                "3 - to replay current song\n" +
                "4 - to list songs in the playlist\n" +
                "5 - to list available options\n" +
                "6 - to delete current song");
    }

    private static void printPlayList(LinkedList<Song>playList){
        Iterator<Song>iterator = playList.iterator();
        System.out.println("==============================");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("===============================");
    }
}
