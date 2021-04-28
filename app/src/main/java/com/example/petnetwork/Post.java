package com.example.petnetwork;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

import java.text.SimpleDateFormat;
import java.util.Date;

@ParseClassName("Post")
public class Post extends ParseObject {

    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";
    public static final String KEY_CREATED_KEY = "createdAt";
    public static final String KEY_AVATAR = "avatar";

    public String getDescpription() {
        return getString(KEY_DESCRIPTION);
    }

    public void setDescription(String description) {
        put(KEY_DESCRIPTION, description);
    }

    public ParseFile getImage() {
        return getParseFile(KEY_IMAGE);
    }

    public void setImage(ParseFile parseFile) {
        put(KEY_IMAGE, parseFile);
    }

    public ParseUser getUser() {
        return getParseUser(KEY_USER);
    }

    public void setUser(ParseUser user) {
        put(KEY_USER, user);
    }

    public ParseFile getAvatar() {
        return getParseUser(KEY_USER).getParseFile(KEY_AVATAR);
    }

    public String getTimeStamp() {

        Date today = new Date();
        Date dateRaw = getCreatedAt();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        SimpleDateFormat justTime = new SimpleDateFormat("h:mm a");

        String compareDate = dateFormat.format(today);
        String parseDate = dateFormat.format(dateRaw);

        if (parseDate.equals(compareDate)) {
            return justTime.format(dateRaw);
        }
        return parseDate;
    }


}
