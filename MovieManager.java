import java.sql.SQLOutput;
import java.util.Arrays;

public class MovieManager {

   public Movie[] allMovies=new Movie[1];
    private int movieCount=0;

    private Movie movie1=new Movie(1L,"Hükümet Kadın","Sermiyan Midyat","2013","komedi filmi","komedi","Demet Akbağ,Sermiyan Midyat");
    private Movie movie2=new Movie(2L,"The Old Way","Brett Donowho","2023","aksiyon filmi","aksiyon","Nicolas Cage,Kerry Knuppe");
    private Movie movie3=new Movie(3L,"Buz devri 1","Chris Wedge","2003","animasyon filmi","animasyon","mamut, tembel hayvan");
    private Movie movie4=new Movie(4L,"7. Koğuştaki Mucize","Mehmet Ada Öztekin","2019","drama filmi","drama","Aras Bulut İynemli,Nisa Sofiya Aksongur");
    public void initializeMovies() {

       addMovie(movie1);
       addMovie(movie2);
       addMovie(movie3);
       addMovie(movie4);
    }

    public Movie searchMovieById(Long id) {
        User searchedMovie = null;
        for (int i=0; i<movieCount;i++) {
          /* if (user.getId().equals(id)) {
               searchedUser = user;
               return searchedUser;

           }*/ if(allMovies[i].getId().equals(id)){
                return allMovies[i];
            }
        }
        return null;
    }

    public void addMovie(Movie movie) {

        for(int i=0;i<movieCount;i++){

            if(allMovies[i].getId().equals(movie.id)){
                System.out.println("Bu id de bir film var. Başka bir id ile tekrar deneyin.");;
                return;
            }
        }
        if (movieCount==allMovies.length-1){
            reInitializeArray();
        }
        allMovies[movieCount] = movie;
        movieCount++;
        System.out.println("Film eklendi");
    }
    public void reInitializeArray(){

        Movie[] newUserArrays=new Movie[allMovies.length+1];
        System.arraycopy(allMovies,0,newUserArrays,0,allMovies.length);
        allMovies=newUserArrays;
    }
    public void listMovie(){
        for (int i=0; i<movieCount;i++){
            System.out.println(allMovies[i]);
        }
    }
    public boolean removeMovie(Long id){

        int indexNumber=finfIndexNumberByIdforMovie(id);
        if(indexNumber != -1){
            for(int i= indexNumber; i <movieCount ; i++){
                allMovies[i]=allMovies[i+1];
            }
            allMovies[movieCount-1] = null ;
            movieCount--;
            String mesaj="Film sistemden silindi. ";
            return true;
        }

        return false;
    }

    public int finfIndexNumberByIdforMovie(Long id) {
        int indexNumber=-1;

        for(int i=0;i<movieCount;i++){

            if(allMovies[i].getId().equals(id)){
                indexNumber=i;
                break;
            }
        }

        return indexNumber;
    }


}
