package com.servlet.jsp.vo;

public class UserVO
{
    private String userId;
    private String password;
    private String name;
    private String eMail;
    
    public void setUserId(String userId)
    {
        this.userId = userId;
    }
    
    public String getUserId()
    {
        return userId;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setEmail(String eMail)
    {
        this.eMail = eMail;
    }
    
    public String getEmail()
    {
        return eMail;
    }
    
}

