import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int choice = 0;

        UserManager userManager = new UserManager();
        userManager.initializeUsers();
        //userManager.reInitializeArray();


        MovieManager movieManager= new MovieManager();
        movieManager.initializeMovies();
        System.out.println("*****************************");

        System.out.println("Menüyü görmek için giriş yapınız");
        System.out.println("Adınız:");
        String nameofUser=input.nextLine();
        System.out.println("Şifrenizi giriniz");
        String passwordofUser=input.nextLine();

        if(userManager.logIn(nameofUser,passwordofUser)==true) {

            printMenu();

            do {
                System.out.print("Seçiminiz: ");
                choice = input.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("--------------------------------");
                        userManager.listUser();
                        System.out.println("--------------------------------");
                        break;
                    }
                    case 2 -> {

                        input.nextLine();
                        System.out.println("--------------------------------");
                        System.out.print("Aranacak kişinin id sini giriniz: ");
                        Long id = input.nextLong();
                        userManager.searchUserById(id);


                        if (userManager.searchUserById(id) == null) {
                            System.out.println("Kullanıcı bulunamadı");
                            //break;
                        }
                        //System.out.println(userManager.searchUserById(id).toString());
                        else {
                            System.out.println(userManager.searchUserById(id).toString());
                        System.out.println("Kullanıcı sistemde bulundu.");
                        }

                        System.out.println("--------------------------------");
                        break;
                    }
                    case 3 -> {
                        input.nextLine();
                        System.out.println("--------------------------------");
                        System.out.print("Silinecek kişi id'sini giriniz: ");
                        Long id = input.nextLong();

                        if (userManager.removeUser(id) == true) {
                            System.out.println("Kullanıcı sistemden silindi");
                            break;
                        }

                        System.out.println("Kullanıcı sistemde bulunamadı.");
                        System.out.println("--------------------------------");
                        break;
                    }

                    case 4 -> {
                        input.nextLine();
                        System.out.println("--------------------------------");

                        System.out.print("Eklenecek kişinin ıd sini giriniz: ");
                        Long id = input.nextLong();
                        input.nextLine();

                        System.out.print("Eklenecek kişinin adını giriniz: ");
                        String name = input.nextLine();

                        System.out.print("Eklenecek kişinin şifresini giriniz: ");

                        String password = input.nextLine();

                        System.out.print("Eklenecek kişinin mailini giriniz: ");
                        String mail = input.nextLine();


                        User user = new User(id, name, password, mail);
                        userManager.addUsers(user);


                        System.out.println("--------------------------------");
                        break;
                    }
                    case 5 -> {
                        input.nextLine();
                        System.out.println("--------------------------------");
                        movieManager.listMovie();
                        System.out.println("--------------------------------");
                        break;
                    }
                    case 6 -> {
                        input.nextLine();
                        System.out.println("--------------------------------");
                        System.out.print("Aranacak filmin id sini giriniz: ");
                       Long id= input.nextLong();
                        movieManager.searchMovieById(id);


                        if (movieManager.searchMovieById(id) == null) {
                            System.out.println("Film bulunamadı");
                            //break;
                        }

                        else {
                            System.out.println(movieManager.searchMovieById(id).toString());
                            System.out.println("Film sistemde bulundu.");
                        }

                        System.out.println("--------------------------------");
                        break;
                    }
                    case 7 -> {
                        input.nextLine();
                        System.out.println("--------------------------------");
                        System.out.print("Silinecek filmin id'sini giriniz: ");
                        Long id = input.nextLong();


                        if (movieManager.removeMovie(id) == true) {
                            System.out.println("Film sistemden silindi");
                            break;
                        }

                        System.out.println("Film sistemde bulunamadı.");
                        System.out.println("--------------------------------");
                        break;
                    }
                    case 8 -> {
                        input.nextLine();
                        System.out.println("--------------------------------");

                        System.out.print("Eklenecek filmin ıd sini giriniz: ");
                        Long id = input.nextLong();
                        input.nextLine();

                        System.out.print("Eklenecek filmin adını giriniz: ");
                        String title = input.nextLine();

                        System.out.print("Eklenecek filmin yönetmenini giriniz: ");

                        String director = input.nextLine();

                        System.out.print("Eklenecek filmin tarihini giriniz: ");
                        String date = input.nextLine();

                        System.out.print("Eklenecek filmin açıklamasını giriniz: ");
                        String explanation = input.nextLine();

                        System.out.print("Eklenecek filmin türünü giriniz: ");
                        String type = input.nextLine();

                        System.out.print("Eklenecek filmin aktörlerini giriniz: ");
                        String actor = input.nextLine();

                        Movie movie = new Movie(id, title, director, date, explanation, type, actor);
                        movieManager.addMovie(movie);

                        System.out.println("--------------------------------");
                        break;
                    }


                    case -1 -> {
                        System.out.println("İyi günler");
                    }
                    default -> printMenu();
                }
            } while (choice != -1);
        }
        else
            System.out.println("hatalı giriş.");

}


    private static void printMenu() {
        System.out.println("##### Menu #####");
        System.out.println("1: Kullanıcıları Listeleme");
        System.out.println("2: Kullanıcı Arama");
        System.out.println("3: Kullanıcı Silme");
        System.out.println("4: Kullanıcı Ekleme");
        System.out.println("5: Filmleri Listeleme");
        System.out.println("6: Film Arama");
        System.out.println("7: Film Silme");
        System.out.println("8: Film Ekleme");
        System.out.println("-1: Çıkış \n\n");


    }
}
