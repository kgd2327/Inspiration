package com.v5ent.game.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Resources file-path map
 * Created by Mignet on 2016/11/13.
 */

public class Resource {
    public static final String STATUSUI_TEXTURE_ATLAS_PATH = "skins/statusui.pack";
    public static final String ITEMS_TEXTURE_ATLAS_PATH = "items/items.pack";
    public static final String STATUSUI_SKIN_PATH = "skins/statusui.json";
    //single
    public static final String MONSTERS0 = "battle/Demon0.png";
    public static final String MONSTERS1 = "battle/Demon1.png";
    public static final String TOUCH = "tools/touch.png";
    public static final String SHADOW = "tools/shadow.png";
    public static final String SELECTED = "tools/selected.png";
    public static final String HP_BAR = "hud/hp_bar.png";
    public static final String BAR = "hud/bar.png";

    public Map<String,String> players = new HashMap<String,String>();
    public Map<String,String> fighters = new HashMap<String,String>();
    public Map<String,String> npcs = new HashMap<String,String>();
    public Map<String,String> maps = new HashMap<String,String>();
    public static final Resource instance = new Resource();
    private Resource(){
        players.put("lante","heros/lante.png");
        players.put("hafei","heros/hafei.png");
        players.put("XFD","heros/XFD.png");
        npcs.put("knight","heros/knight.png");
        npcs.put("kelisid","heros/kelisid.png");
        npcs.put("NPC-01","heros/NPC-01.png");
        npcs.put("mother","heros/mother.png");
        npcs.put("moon","heros/moon.png");
        fighters.put("lante","heros/lante-attack.png");
        fighters.put("XFD","heros/XFD-attack.png");
        npcs.put("ASL","heros/ASL.png");
        npcs.put("NPC-G02","heros/NPC-G02.png");
        maps.put("yaka_port","maps/yaka_port.tmx");
        maps.put("home_one","maps/home_one.tmx");
        maps.put("home_two","maps/home_two.tmx");
    }
}
