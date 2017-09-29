/*
 * Class Name : NormalTweet
 *
 * Version: V 1.0
 *
 * Date: Sept 28, 2017
 *
 * Copyright (x) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the code behaviour of students.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 *Represents a NormalTweet
 *@author guanfang
 *@version 1.0
 *@see Tweet
 */

public class NormalTweet extends Tweet {

    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
