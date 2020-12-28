package Blog;

import Blog.model.Post;
import Blog.storage.PostStorage;
import Blog.storage.impl.PostStorageImpl;

import java.util.Date;
import java.util.Scanner;

public class BlogMain implements Command {

    private static final PostStorage POST_STORAGE = new PostStorageImpl();
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            POST_STORAGE.printAllPost();
            printCommand();
            String commandStr = SCANNER.nextLine();
            int command;
            try {
                command = Integer.parseInt(commandStr);
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_POST:
                    addPost();
                    break;
                case SEARCH_POST:
                    searchPost();
                    break;
                case POST_BY_CATEGORY:
                    postByCatgory();
                    break;
                default:
                    System.out.println("Invalid command.Please try agai");

            }
        }
    }

    private static void postByCatgory() {
        System.out.println("Please enter category");
        String category = SCANNER.nextLine();
        POST_STORAGE.printPostsByCategory(category);
    }

    private static void searchPost() {
        System.out.println("Please input keyword");
        String keyword = SCANNER.nextLine();
        POST_STORAGE.searchPostsByKeyword(keyword);

    }

    private static void addPost() {
        System.out.println("Please enter title,text,category");
        String postDataStr = SCANNER.nextLine();
        String[] postData = postDataStr.split(",");
        try {
            Post post = new Post();
            post.setTitle(postData[0]);
            post.setText(postData[1]);
            post.setCategory(postData[2]);
            post.setCreatedDate(new Date());
            POST_STORAGE.add(post);
            System.out.println("Post added");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid data");
            addPost();
        }
    }

    static void printCommand() {
        System.out.println("Please enter " + EXIT + " for EXIT");
        System.out.println("Please enter " + ADD_POST + " for ADD_POST");
        System.out.println("Please enter " + SEARCH_POST + " for SEARCH_POST");
        System.out.println("Please enter " + POST_BY_CATEGORY + " POST_BY_CATEGORY");

    }
}
