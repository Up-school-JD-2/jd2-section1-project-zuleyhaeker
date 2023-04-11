import java.sql.SQLOutput;
import java.util.Arrays;

public class UserManager  {


    private User[] allUsers=new User[1];

    private int itemCount=0;
    private User user1=new User(1L,"züleyha eker","123456","zuleyha@gmail.com");
    private User user2=new User(2L,"Rümeysa eker","12","rümeysa@gmail.com");
    private User user3=new User(3L,"neslihan başaran","123","neslihan@gmail.com");
    private User user4=new User(4L,"merve cenik","1234","merve@gmail.com");
    private User user5=new User(5L,"gülsüm cenik","12384","gülsüm@gmail.com");
    public void initializeUsers() {
        addUsers(user1);
        addUsers(user2);
        addUsers(user3);
        addUsers(user4);
        addUsers(user5);
    }

    public boolean logIn(String nameofUser,String passwordofUser){

        for (int i=0; i<itemCount;i++) {

            if (allUsers[i].getName().equalsIgnoreCase(nameofUser) && allUsers[i].getPassword().equals(passwordofUser)) {
                System.out.println("Sisteme başarılı bir şekilde giriş yapıldı.");
                        return true;
            }

        }
        System.out.println("Hatalı giriş yapıldı.");
        return false;

    }

   public User searchUserById(Long id) {
       User searchedUser = null;
       for (int i=0; i<itemCount;i++) {
          /* if (user.getId().equals(id)) {
               searchedUser = user;
               return searchedUser;

           }*/ if(allUsers[i].getId().equals(id)){
               return allUsers[i];
           }
       }
       return null;
   }


    public void addUsers(User user) {

        for(int i=0;i<itemCount;i++){

            if(allUsers[i].getId().equals(user.id)){
                System.out.println("Bu id de bir kullanıcı var. Başka bir id ile tekrar deneyin.");;
                return;
            }
        }
       if (itemCount==allUsers.length-1){
            reInitializeArray();
        }
            allUsers[itemCount] = user;
            itemCount++;
         System.out.println("Kullanıcı eklendi");
    }
    public void reInitializeArray(){

        User[] newUserArray=new User[allUsers.length+1];
        System.arraycopy(allUsers,0,newUserArray,0,allUsers.length);
        allUsers=newUserArray;
    }
    public void listUser(){
        for (int i=0; i<itemCount;i++){
            System.out.println(allUsers[i]);
        }
    }
    public boolean removeUser(Long id){

        int indexNumber=finfIndexNumberById(id);
        if(indexNumber != -1){
            for(int i= indexNumber; i <itemCount ; i++){
                allUsers[i]=allUsers[i+1];
            }
            allUsers[itemCount-1] = null ;
            itemCount--;
            String mesaj="Kullanıcı sistemden silindi.";
            return true;
        }
        //System.out.println("Kullanıcı bulunamadı.");
        return false;
    }

    public int finfIndexNumberById(Long id) {
        int indexNumber=-1;

        for(int i=0;i<itemCount;i++){

            if(allUsers[i].getId().equals(id)){
                indexNumber=i;
                break;
            }
        }

        return indexNumber;
    }

}









