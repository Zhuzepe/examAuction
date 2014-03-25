/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examauction.com.controller;

import examauction.com.auctiondata.AuctionData;
import examauction.com.entitys.Item;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author artem
 */
@Named
@SessionScoped
public class ViewController implements Serializable {

    @Inject
    private AuctionData auctionData;
    private Item selectedItem;

    public ViewController() {
    }

    public Item getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(Item selectedItem) {
        this.selectedItem = selectedItem;
    }

    public String chooseItem(String id) {
        for (Item item : auctionData.getItems()) {
            if (id.equals(item.getId())) {
                selectedItem = item;
            }
        }
        return "item";
    }

}
