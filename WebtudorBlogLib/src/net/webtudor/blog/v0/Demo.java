/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.webtudor.blog.v0;

import net.webtudor.blog.v0.util.SingletonBlog;
import net.webtudor.blog.v0.util.BlogPostFactory;
import net.webtudor.blog.v0.data.BlogPost;

/**
 *
 * @author krisztian
 */
public class Demo {
    public static void main(String[] args) {
        SingletonBlog store=SingletonBlog.getInstance();
        BlogPostFactory factory=new BlogPostFactory();
        
        store.initBlog("Webtudor");
        store.getBlog().add(factory.create("hir 0", "head 0", "body 0", null));
        store.getBlog().add(factory.create("hir 1", "head 1", "body 1", "http://webtudor.net/intro.mp4"));
        for(BlogPost item:store.getBlog().getPostok())
            System.out.println(item.getFull());
    }
}
