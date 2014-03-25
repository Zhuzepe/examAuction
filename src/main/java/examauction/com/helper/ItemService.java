/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examauction.com.helper;

import examauction.com.entitys.Item;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author artem
 */
public class ItemService {

    private SimpleDateFormat format;

    public List<Item> generateDefaultItems() throws ParseException {
        List<Item> items = new ArrayList<>();
        items.add(generateFeverNovaItem());
        items.add(generateCanonItem());
        items.add(generateNesItem());
        return items;
    }

    private Item generateFeverNovaItem() throws ParseException {
        Item item = new Item();
        item.setName("Fevernova FIFA World Cup 2002");
        item.setDescription(generatetFeverNovaDiscription());
        item.setImage("resources/images/Fevernova.jpg");
        item.setInitialPrice(250.0);
        item.setStartDate(new Date());
        item.setEndDate(generateFevernovaEndDate());
        return item;
    }

    private Item generateCanonItem() throws ParseException {
        Item item = new Item();
        item.setName("Canon EOS 600D");
        item.setDescription(generateCanonDiscription());
        item.setImage("resources/images/Canon600.jpg");
        item.setInitialPrice(400.0);
        item.setStartDate(new Date());
        item.setEndDate(generateCanonEndDate());
        return item;
    }

    private Item generateNesItem() throws ParseException {
        Item item = new Item();
        item.setName("NES");
        item.setDescription(generateNesDiscription());
        item.setImage("resources/images/NES.jpg");
        item.setInitialPrice(70.0);
        item.setStartDate(new Date());
        item.setEndDate(generateNesEndDate());
        item.setLastBid(73.0);
        item.setLasBidDate(generateNesLastBidDate());
        return item;
    }

    private String generatetFeverNovaDiscription() {
        return "The official ball of 2002 World Cup was called adidas Fevernova, a name that recalled the passion for football like a new fever. With this model, Adidas definitely abandoned the decorations based on old Tango. "
                + "Fevernova was a revolutionary colourful ball; its decorations consisted of triads based on dragon and flower motives, which recalled ancient Asiatic decorations."
                + "</br>"
                + "</br>"
                + "The new colourful ball was not well accepted by all players and specialists, and some said that it looked a ball for children. "
                + "However, once again the Great Tournament started, the colourful ball become a part of the Great Show without any further controversy."
                + "</br>"
                + "</br>"
                + "Like the previous Adidas World Cup ball, Fevernova was also made of the syntactic foam, namely the matrix composed by three layer of microspheres filled with highly compressible gas. "
                + "Therefore, the performance of the ball when kicked was identical to the Tricolore: the power of the kick was very uniformly distributed on the ball, within a high accuracy of the shot."
                + "</br>"
                + "Fevernova was the very last hand sewn ball of the Adidas World Cup family, and the first one not more made in France. "
                + "Furthermore, this was the very last World Cup ball composed by the classic 32 panels (20 hexagonal + 12 pentagonal shaped), after 32 uninterrupted years.";
    }

    private String generateCanonDiscription() {
        return "Capture all your special moments with the Canon EOS 600D/Rebel T3i DSLR camera and cherish the memories over and over again. "
                + "With an 18.0 MP CMOS sensor and DIGIC 4 image processor, this DSLR camera lets you take smooth, detailed, and high-quality images. "
                + "The 3-inch monitor on this Canon 18.0 MP camera makes it easy to view photos, read menu, and compose shots. "
                + "With a high ISO sensitivity (up to 6,400), the Canon EOS 600D/Rebel T3i captures clear photos even in low-light conditions. "
                + "What's more, you can connect this Canon 18.0 MP camera to the USB port of a PC or a printer, thanks to its dedicated interface cable. "
                + "All things considered, this Canon 18.0 MP camera, with an EF-S IS II 18-55 mm lens, aims to be a great travel companion.";
    }

    private String generateNesDiscription() {
        return "TheNintendo NES Deluxe Console (PAL) brought the video gaming industry into a whole new level. "
                + "Nintendo NES console was released as a Family Computer which became an instant hit. "
                + "Nintendo developed third-party softwares and introduced a front-loading cartridge slot on the game console. "
                + "The Nintendo console is an 8-bit video gaming system that integrates both PAL region cartridges and NTSC-U cartridges. "
                + "The memory on the Nintendo console is directly incorporated into the gaming system with 8 kb of RAM for direct saving of game progress and other relative information. "
                + "The game console uses a custom-made PPU to project the game’s graphical outputs onto the TV screen. Images from the gaming system use a combination of 48 different colors and six greys to create the characters and setting on each game. "
                + "The front of the Nintendo NES console features two ports to accommodate game controllers which are lightweight joysticks featuring several essential buttons. "
                + "The Nintendo NES console allows retro game lovers to relive classic Nintendo entertainment.";
    }

    private Date generateNesEndDate() throws ParseException {
        format = new SimpleDateFormat("yyyy-MM-dd");
        String endDate = "2014-05-30";
        return format.parse(endDate);
    }

    private Date generateFevernovaEndDate() throws ParseException {
        format = new SimpleDateFormat("yyyy-MM-dd");
        String endDate = "2014-09-13";
        return format.parse(endDate);
    }

    private Date generateCanonEndDate() throws ParseException {
        format = new SimpleDateFormat("yyyy-MM-dd");
        String endDate = "2014-10-21";
        return format.parse(endDate);
    }

    private Date generateNesLastBidDate() throws ParseException {
        format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String lastBidDate = "2014-03-25 18:43";
        return format.parse(lastBidDate);
    }

}
