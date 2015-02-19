package net.webtudor.blog.v1.data;

/**
 * @author krisztian
 */
public class BlogPostTitle implements BlogPostElement{
    protected String value;

    public BlogPostTitle(String value) {
        this.value = value;
    }
    
    
    @Override
    public void setValue(String pData) {this.value=pData;}

    @Override
    public String getValue() {return value;}
    
}
