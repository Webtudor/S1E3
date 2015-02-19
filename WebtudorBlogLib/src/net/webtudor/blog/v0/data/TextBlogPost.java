/*
 * Szoveges post
 */
package net.webtudor.blog.v0.data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author krisztian
 */
public class TextBlogPost implements BlogPost{
    protected String title,head,body;
    protected long timestamp;
    protected List<String> categories=new ArrayList<String>();

    public TextBlogPost(String title, String head, String body) {
        this.title = title;
        this.head = head;
        this.body = body;
        this.timestamp=System.currentTimeMillis();
    }
    
    
    @Override
    public String getInfo(){
        return "<section><header>"+title+"</header>"+head+"</section>";
    }


    @Override
    public String getFull() {
        return "<section><header><h1>"+title+"</h1>"+head+"</header>"+body+"</section>";
    }

}
