package com.viceman.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class synonym {

	private List<String> tags;

    private String score;

    private String word;

    public List<String> getTags ()
    {
        return tags;
    }

    public void setTags (List<String> tags)
    {
        this.tags = tags;
    }

    public String getScore ()
    {
        return score;
    }

    public void setScore (String score)
    {
        this.score = score;
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
        return "ClassPojo [tags = "+tags+", score = "+score+", word = "+word+"]";
    }

}
