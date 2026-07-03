package InstagramPostSystem;
import java.util.Scanner;
// Class Post
class Post{
    private  String username;
    private String caption;
    private int likes;
    private boolean isPublic;
    private String location;
    // Default Constructor
    public  Post(){
        username= "Unknown";
        caption= "No caption";
        likes= 0;
        isPublic= true;
        location= "Unknown";
    }
    // Overloaded constructor
    public Post(String username , String caption , int likes , boolean isPublic , String location){
        this.username=username;
        this.caption=caption;
        this.likes=likes;
        this.isPublic=isPublic;
        this.location=location;
    }
    // Getter and Setter
    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    // Methods
    public void likePost(){
        likes++;
        System.out.println("Likes Post " + likes);
    }
    public void newCaption(String NewCaption){
        caption=NewCaption;
        System.out.println("Caption updated :" + caption);
    }
    public void togglePrivacy(){
        isPublic=!isPublic;
        System.out.println("Privacy changed to: " + (isPublic ? "Public" : "Private"));
    }
    // Show Post Details
    public void ShowPostDetail(){
        System.out.println("\n====Show Post Details OutPut====");
        System.out.println("Username: " + username);
        System.out.println("Caption: " + caption);
        System.out.println("Likes: " +likes);
        System.out.println("Is Public: " + isPublic);
        System.out.println("Location: " + location);
    }
}
public class Task13 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter you username: ");
        String name=input.nextLine();
        System.out.print("Enter  the a caption: ");
        String caption=input.nextLine();
        System.out.print("Enter the post likes:  ");
        int lik=input.nextInt();
        System.out.print("Enter public post (true/false): ");
        boolean isPublic=input.nextBoolean();
        input.nextLine();
        System.out.print("Enter the location: ");
        String location=input.nextLine();
        // Create An Object
        Post post=new Post(name , caption , lik , isPublic , location);
        //Display The Result For The Post
        post.ShowPostDetail();
        //Update
        post.likePost();
        System.out.print("Enter a new caption: ");
        String newCaption=input.nextLine();
        post.newCaption(newCaption);
        post.togglePrivacy();
        input.close();
    }

}
