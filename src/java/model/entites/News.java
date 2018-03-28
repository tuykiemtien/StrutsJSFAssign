/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entites;

import java.util.Date;

/**
 *
 * @author Nguyen Ngoc Son
 */
public class News {
    private int newsID;
    private String newsName;
    private String newsStaff;
    private String newsDepartment;
    private Date newsOutDate;
    private int newsNumber;
    private String newsStatus;
    private String newDescription;

    public int getNewsID() {
        return newsID;
    }

    public News(int newsID, String newsName, String newsStaff, String newsDepartment, Date newsOutDate, int newsNumber, String newsStatus, String newDescription) {
        this.newsID = newsID;
        this.newsName = newsName;
        this.newsStaff = newsStaff;
        this.newsDepartment = newsDepartment;
        this.newsOutDate = newsOutDate;
        this.newsNumber = newsNumber;
        this.newsStatus = newsStatus;
        this.newDescription = newDescription;
    }

    public News() {
    }

    public void setNewsID(int newsID) {
        this.newsID = newsID;
    }

    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }

    public String getNewsStaff() {
        return newsStaff;
    }

    public void setNewsStaff(String newsStaff) {
        this.newsStaff = newsStaff;
    }

    public String getNewsDepartment() {
        return newsDepartment;
    }

    public void setNewsDepartment(String newsDepartment) {
        this.newsDepartment = newsDepartment;
    }

    public Date getNewsOutDate() {
        return newsOutDate;
    }

    public void setNewsOutDate(Date newsOutDate) {
        this.newsOutDate = newsOutDate;
    }

    public int getNewsNumber() {
        return newsNumber;
    }

    public void setNewsNumber(int newsNumber) {
        this.newsNumber = newsNumber;
    }

    public String getNewsStatus() {
        return newsStatus;
    }

    public void setNewsStatus(String newsStatus) {
        this.newsStatus = newsStatus;
    }

    public String getNewDescription() {
        return newDescription;
    }

    public void setNewDescription(String newDescription) {
        this.newDescription = newDescription;
    }
    
}
