package com.azh.core;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2023-01-03
 */
public class Entry {

    private String key;
    private String val;

    private int tag;

    private char occupied;

    private char rehash;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public char getOccupied() {
        return occupied;
    }

    public void setOccupied(char occupied) {
        this.occupied = occupied;
    }

    public char getRehash() {
        return rehash;
    }

    public void setRehash(char rehash) {
        this.rehash = rehash;
    }
}
