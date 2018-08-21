package com.songfuxing.patterns.proxy.protectProxy;

/**
 * Created by songfuxing on 2018/8/21.
 */
public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}
