/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.webtudor.blog.v1;


import net.webtudor.blog.v1.data.Blog;

/**
 *
 * @author krisztian
 */
public class SingletonBlog {
    private Blog blog;
    private static SingletonBlog instance=new SingletonBlog();
    
    private SingletonBlog(){}
    
    public static SingletonBlog getInstance(){return instance;}
    
    public Blog getBlog(){return blog;}
    
    public void initBlog(String title){
        blog=new Blog(title);
    }
}
