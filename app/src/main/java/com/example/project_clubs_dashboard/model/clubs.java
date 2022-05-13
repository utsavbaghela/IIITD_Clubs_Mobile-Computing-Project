package com.example.project_clubs_dashboard.model;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;

import java.io.Serializable;
import java.util.List;

public class clubs implements Serializable , Parcelable {
    String culb_id,name,desc,subTitle,instaUrl,twitterUrl,facebookUrl;
    Bitmap image_bm;

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getInstaUrl() {
        return instaUrl;
    }

    public void setInstaUrl(String instaUrl) {
        this.instaUrl = instaUrl;
    }

    public String getTwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    public String getFacebookUrl() {
        return facebookUrl;
    }

    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }



    public Bitmap getImage_bm() {
        return image_bm;
    }

    public void setImage_bm(Bitmap image_bm) {
        this.image_bm = image_bm;
    }

    public String getCulb_id() {
        return culb_id;
    }

    public void setCulb_id(String culb_id) {
        this.culb_id = culb_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }
}