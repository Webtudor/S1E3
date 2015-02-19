package net.webtudor.blog.v1;

import net.webtudor.blog.v1.data.BlogPost;
import net.webtudor.blog.v1.data.BlogPostTitle;

/**
 * @author krisztian
 */
public class Demo {

    public static void main(String[] args) {
        SingletonBlog.getInstance().initBlog("Webtudor");
        BlogPost newPost=new BlogPost();
        newPost.heads.add(new BlogPostTitle("t0"));
        SingletonBlog.getInstance().getBlog().add(new BlogPostDecoratorHTML(newPost));
        for(BlogPostDecorator post:SingletonBlog.getInstance().getBlog().getPostok())
            System.out.println(post.getInfo());
    }
    
}
