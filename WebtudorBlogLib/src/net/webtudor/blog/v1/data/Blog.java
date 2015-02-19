/*
 * Blog definicio 
 */
package net.webtudor.blog.v1.data;

import net.webtudor.blog.v0.data.*;
import java.util.ArrayList;
import java.util.List;
import net.webtudor.blog.v1.BlogPostDecorator;

/**
 * @author krisztian
 */
public class Blog {
    private String title;
    private List<BlogPostDecorator> posts=new ArrayList<BlogPostDecorator>();

    public Blog(String title) {
        this.title = title;
    }
    
    public String getTitle(){return title;}
    public void add(BlogPostDecorator item){posts.add(0,item);}
    public List<BlogPostDecorator> getPostok(){return posts;}
}
