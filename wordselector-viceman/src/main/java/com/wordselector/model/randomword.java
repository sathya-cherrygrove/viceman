package com.wordselector.model;

import org.springframework.stereotype.Component;

@Component
public class randomword
{
    private String id;

    private String word;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getWord ()
    {
        return word;
    }

    public void setWord (String word)
    {
        this.word = word;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", word = "+word+"]";
    }
}