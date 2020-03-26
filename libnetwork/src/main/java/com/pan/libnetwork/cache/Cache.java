package com.pan.libnetwork.cache;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "cache")
public class Cache implements Serializable {
    @PrimaryKey
    public String key;
    public byte[] data;
}
