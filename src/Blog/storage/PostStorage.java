package Blog.storage;

import Blog.execption.PostNotFoundExecption;
import Blog.model.Post;

public interface PostStorage {
    void add(Post post);

    Post getPostByTitle(String title) throws PostNotFoundExecption;

    void searchPostsByKeyword(String keyword);

    void printAllPost();

    void printPostsByCategory(String category);
}
