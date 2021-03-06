package com.servlet.jsp.main;

import java.io.File;

import javax.servlet.ServletException;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class WebAppLauncher
{
    public static void main( String[] args ) throws ServletException, LifecycleException
    {
        String webappDirLocation = "webapp/";
        
        Tomcat tomcat = new Tomcat();
        
        tomcat.setPort(8080);
        
        tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
        
        tomcat.start();
        tomcat.getServer().await();
        
    }
}
