
/*
 * Class Name : ImportantTweet
 *
 * Version: V 1.0
 *
 * Date: Sept 28, 2017
 *
 * Copyright (x) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the code behaviour of students.
 */
package ca.ualberta.cs.lonelytwitter;

/**
 *Represents a ImportantTweet
 *@author guanfang
 *@version 1.0
 *@see ca.ualberta.cs.lonelytwitter.Tweetable
 */
import java.util.Date;


public class ImportantTweet extends Tweet implements Tweetable {

    public ImportantTweet(String message){
        super(message);
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }


    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
