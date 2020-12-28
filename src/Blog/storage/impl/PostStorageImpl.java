package Blog.storage.impl;

import Blog.storage.PostStorage;
import Blog.execption.PostNotFoundExecption;
import Blog.model.Post;

public class PostStorageImpl implements PostStorage {

    private Post[] posts = new Post[20];
    private int size;


    @Override
    public void add(Post post) {
        if (posts.length == size) {
            extend();
        }
        posts[size++] = post;
    }

    private void extend() {
        Post[] tmp = new Post[posts.length + 10];
        System.arraycopy(posts, 0, tmp, 0, posts.length);
        posts = tmp;
    }

    @Override
    public Post getPostByTitle(String title) throws PostNotFoundExecption {
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().equals(title)) {
                return posts[i];
            }
        }
        throw new PostNotFoundExecption("Post not found");
    }

    @Override
    public void searchPostsByKeyword(String keyword) {

        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().contains(keyword) || posts[i].getText().contains(keyword)) {
                System.out.println(posts[i]);
            }
        }
    }

    @Override
    public void printAllPost() {
        System.out.println("----------");
        for (int i = 0; i < size; i++) {
            System.out.println(posts[i]);
        }
        System.out.println("----------");
    }

    @Override
    public void printPostsByCategory(String category) {
        for (int i = 0; i < size; i++) {
            if (category.equals(posts[i].getCategory())) {
                System.out.println(posts[i]);
            }
        }
    }
}
