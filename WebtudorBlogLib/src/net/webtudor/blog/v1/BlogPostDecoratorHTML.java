/*
 * Blog Post HTML kornyezetben
 */
package net.webtudor.blog.v1;

import net.webtudor.blog.v1.data.BlogPost;
import net.webtudor.blog.v1.data.BlogPostBodyText;
import net.webtudor.blog.v1.data.BlogPostElement;
import net.webtudor.blog.v1.data.BlogPostHead;
import net.webtudor.blog.v1.data.BlogPostTitle;
import net.webtudor.blog.v1.data.BlogPostVideoURL;

/**
 * @author krisztian
 */
public class BlogPostDecoratorHTML extends BlogPostDecoratorText{

    public BlogPostDecoratorHTML(BlogPost blogpost) {
        super(blogpost);
    }

    @Override
    public String getInfo() {
        StringBuilder res=new StringBuilder("<article>");
        for(BlogPostElement item:blogpost.heads){
            if(item instanceof BlogPostTitle)
                res.append("<h1>".concat(item.getValue()).concat("</h1>"));
            if(item instanceof BlogPostHead)
                res.append(item.getValue());
        }   
        res.append("</article>");
        return res.toString();
    }
    
    @Override
    public String getFull() {
        StringBuilder res=new StringBuilder("<article>");
        for(BlogPostElement item:blogpost.heads){
            if(item instanceof BlogPostBodyText)
                res.append(item.getValue());
            if(item instanceof BlogPostVideoURL)
                res.append("<video src=\"".concat(item.getValue()).concat("\">"));
        }   
        res.append("</article>");
        return res.toString();
    }
    
}
