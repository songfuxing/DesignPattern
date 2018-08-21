package com.songfuxing.patterns.proxy.protectProxy;

/**
 * 实现了personbean接口，但是有个问题：
 * 1、自己可以修改自己的得分，rating，这样不合理
 * 2、别人可以修改自己的基础信息
 * 因此，需要使用保护代理来实现权限管理
 */
public class PersonBeanImpl implements PersonBean{
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount = 0;

    public PersonBeanImpl(String name, String gender, String interests, int rating) {
        this.name = name;
        this.gender = gender;
        this.interests = interests;
        this.rating = rating;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getHotOrNotRating() {
        return ratingCount == 0 ? 0 : rating / ratingCount ;
    }

    public void setHotOrNotRating(int rating) {
        this.rating = rating;
        ratingCount ++;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    @Override
    public void setInterests(String interests) {

        this.interests = interests;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }
}
