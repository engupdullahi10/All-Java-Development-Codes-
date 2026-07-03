class PostUser{
    private final int postId;
    private final String content;
    private final String author;
    //Static members (shared)
    static int totalPosts = 0;
    static String appName = "Instagram";
    // Constructor
    public  PostUser(int postId, String content, String author) {
        this.postId = postId;
        this.content = content;
        this.author = author;
        totalPosts++; // IMPORTANT
    }
    // Getter & Setter

    public int getPostId() {
        return postId;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public static int getTotalPosts() {
        return totalPosts;
    }

    public static void setTotalPosts(int totalPosts) {
        PostUser.totalPosts = totalPosts;
    }

    public static String getAppName() {
        return appName;
    }

    public static void setAppName(String appName) {
        PostUser.appName = appName;
    }

    // Display post
    public void displayPost() {
        System.out.println("\n=== Post Info ===");
        System.out.println("App: " + appName);
        System.out.println("Post ID: " + postId);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
    }
    // Static method
    public static void showTotalPosts() {
        System.out.println("Total posts created so far: " + totalPosts);
    }
}

public class Task17 {
    public static void main(String[] args) {
        // ✅ BEFORE creating any post
        System.out.println("Before creating posts:");
        PostUser.showTotalPosts();
        // Create Post 1
        PostUser p1 = new  PostUser(1, "Hello World!", "Ali");
        PostUser.showTotalPosts();
        p1.displayPost();
        // Create Post 2
        PostUser p2 = new  PostUser(2, "Learning Java OOP", "Sara");
        PostUser.showTotalPosts();
        p2.displayPost();
        // Create Post 3
        PostUser p3 = new  PostUser(3, "Static is powerful!", "Ahmed");
        PostUser.showTotalPosts();
        p3.displayPost();
        // ✅ Reflection (shared behavior)
        System.out.println("\nExplanation:");
        System.out.println("The totalPosts variable is shared among all Post objects.");
        // Change app name
        PostUser.appName = "Inst 2.0";
        // Show effect on all objects
        System.out.println("\nAfter changing app name:");
        p1.displayPost();
        p2.displayPost();
        p3.displayPost();
    }
}