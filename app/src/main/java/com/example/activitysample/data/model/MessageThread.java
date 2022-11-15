package com.example.activitysample.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Objects;

@Entity(tableName = "thread_message")
public class MessageThread {
    @PrimaryKey
    @ColumnInfo(name = "threadId")
    private long threadId;
    @ColumnInfo(name = "id")
    private long id;
    @ColumnInfo(name = "date")
    private long date;
    @ColumnInfo(name = "name" ,defaultValue = "")
    private String name="";
    @ColumnInfo(name = "body",defaultValue = "")
    private String body="";
    @ColumnInfo(name = "uriPhoto",defaultValue = "")
    private String uriPhoto="";
    @ColumnInfo(name = "numberPhone",defaultValue = "")
    private String numberPhone="";
    @ColumnInfo(name = "read")
    private int read;
    @ColumnInfo(name = "hasAttach")
    private int hasAttach;
    @ColumnInfo(name = "isDelete")
    private boolean isDelete;
    @ColumnInfo(name = "isNotification")
    private boolean isNotification;
    @Ignore
    private boolean isSelected;

    public MessageThread(long threadId, long id, long date, String name, String body, String uriPhoto, String numberPhone) {
        this.threadId = threadId;
        this.id = id;
        this.date = date;
        this.name = name;
        this.body = body;
        this.uriPhoto = uriPhoto;
        this.numberPhone = numberPhone;
    }

    public MessageThread() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getUriPhoto() {
        return uriPhoto;
    }

    public void setUriPhoto(String uriPhoto) {
        this.uriPhoto = uriPhoto;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public long getThreadId() {
        return threadId;
    }

    public void setThreadId(long threadId) {
        this.threadId = threadId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRead() {
        return read;
    }

    public void setRead(int read) {
        this.read = read;
    }

    public int getHasAttach() {
        return hasAttach;
    }

    public void setHasAttach(int hasAttach) {
        this.hasAttach = hasAttach;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public boolean isNotification() {
        return isNotification;
    }

    public void setNotification(boolean notification) {
        isNotification = notification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MessageThread)) return false;
        MessageThread that = (MessageThread) o;
        return date == that.date &&
                threadId == that.threadId &&
                id == that.id &&
                read == that.read &&
                hasAttach == that.hasAttach &&
                isDelete == that.isDelete &&
                isNotification == that.isNotification &&
                Objects.equals(name, that.name) &&
                Objects.equals(body, that.body) &&
                Objects.equals(uriPhoto, that.uriPhoto) &&
                Objects.equals(numberPhone, that.numberPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, body, uriPhoto, numberPhone, date, threadId, id, read, hasAttach, isDelete, isNotification);
    }
}