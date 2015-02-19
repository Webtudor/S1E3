/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.webtudor.blog.v0.data;

/**
 * @author krisztian
 */
public class VideoBlogPost extends TextBlogPost{
    private String embedcode;
    
    public VideoBlogPost(String title, String head, String body,String embedcode) {
        super(title, head, body);
        this.embedcode=embedcode;
    }
    
    @Override
    public String getFull(){
        return "<section><header><h1>"+title+"</h1>"+head+"</header><video src=\""+embedcode+"\">"+body+"<section>";
    }
    
}
