/*
 * Blog definicio 
 */
package net.webtudor.blog.v0.data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author krisztian
 */
public class Blog {
    private String title;
    private List<BlogPost> posts=new ArrayList<BlogPost>();

    public Blog(String title) {
        this.title = title;
    }
    
    public String getTitle(){return title;}
    public void add(BlogPost item){posts.add(0,item);}
    public List<BlogPost> getPostok(){return posts;}
}
