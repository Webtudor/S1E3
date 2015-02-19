/*
 * eltero tibusu blogposztok letrehozasa
 */
package net.webtudor.blog.v0.util;

import net.webtudor.blog.v0.data.BlogPost;
import net.webtudor.blog.v0.data.TextBlogPost;
import net.webtudor.blog.v0.data.VideoBlogPost;

/**
 * @author krisztian
 */
public class BlogPostFactory {
    public BlogPost create(String cim, String szoveg, String body, String embedcode){
        if(embedcode!=null)
            return new VideoBlogPost(cim, szoveg, body, embedcode);
        else 
            return new TextBlogPost(cim, szoveg, body);
    }
}
