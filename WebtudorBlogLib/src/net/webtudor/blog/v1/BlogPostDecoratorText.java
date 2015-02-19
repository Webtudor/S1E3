package net.webtudor.blog.v1;

import net.webtudor.blog.v1.data.BlogPost;
import net.webtudor.blog.v1.data.BlogPostElement;

/**
 *
 * @author krisztian
 */
public class BlogPostDecoratorText implements BlogPostDecorator{
   protected BlogPost blogpost;

    public BlogPostDecoratorText(BlogPost blogpost) {
        this.blogpost = blogpost;
    }
   
   
   public String getInfo(){
       StringBuilder res=new StringBuilder();
       for(BlogPostElement item:blogpost.heads)
           res.append(item.getValue());
       return res.toString();
   }
   
   public String getFull(){
       StringBuilder res=new StringBuilder();
       for(BlogPostElement item:blogpost.bodys)
           res.append(item.getValue());
       return res.toString();
   }    
}
