/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examauction.com.auctiondata;

import examauction.com.entitys.Item;
import examauction.com.helper.ItemService;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author artem
 */
@Named
@ApplicationScoped
public class AuctionData {

    private List<Item> items;
    private final ItemService itemService;

    public AuctionData() {
        itemService = new ItemService();
        try {
            items = itemService.generateDefaultItems();
        } catch (ParseException ex) {
            Logger.getLogger(AuctionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
