/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examauction.com.entitys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author artem
 */
public class Item {

    private final String id = UUID.randomUUID().toString();
    private String name;
    private String description;
    private String image;
    private Date startDate;
    private Date endDate;
    private double initialPrice;
    private double lastBid;
    private Date lasBidDate;
    private SimpleDateFormat format;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(double initialPrice) {
        this.initialPrice = initialPrice;
    }

    public double getLastBid() {
        return lastBid;
    }

    public void setLastBid(double lastBid) {
        this.lastBid = lastBid;
    }

    public Date getLasBidDate() {
        return lasBidDate;
    }

    public void setLasBidDate(Date lasBidDate) {
        this.lasBidDate = lasBidDate;
    }

    public String getStartDateAsString() {
        format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(startDate);
    }

    public String getEndDateAsString() {
        format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(endDate);
    }

    public String getLastBidDateAsString() {
        String lastBidDateAsString = "";
        if (lasBidDate != null) {
            format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            lastBidDateAsString = format.format(lasBidDate);
        }
        return lastBidDateAsString;
    }

}
