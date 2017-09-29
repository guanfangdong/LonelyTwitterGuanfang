
/*
 * Class Name : Tweet
 *
 * Version: V 1.0
 *
 * Date: Sept 28, 2017
 *
 * Copyright (x) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the code behaviour of students.
 */

package ca.ualberta.cs.lonelytwitter;

/**
 *Represents a Tweet
 *@author guanfang
 *@version 1.0
 *@see ca.ualberta.cs.lonelytwitter.NormalTweet
 */
import java.util.Date;


public abstract class Tweet {

    private String message;
    private Date date;


    /**
     *Represents a Tweet
     *@author guanfang
     *@version 1.0
     *@param message
     */

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }
    /**
     *Represents a Tweet
     *@author guanfang
     *@version 1.0
     *@param message
     *@param date
     */

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public abstract Boolean isImportant();





    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
