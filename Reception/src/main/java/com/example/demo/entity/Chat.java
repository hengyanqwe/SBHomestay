package com.example.demo.entity;

import java.sql.Time;

public class Chat {
    //聊天内容编号
    Integer chatId;
    //聊天内容
    String chatContent;
    //聊天时间
    Time chatDates;
    //聊天设置编号
    Integer csId;

    public Chat() {
        super();
    }

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public String getChatContent() {
        return chatContent;
    }

    public void setChatContent(String chatContent) {
        this.chatContent = chatContent;
    }

    public Time getChatDates() {
        return chatDates;
    }

    public void setChatDates(Time chatDates) {
        this.chatDates = chatDates;
    }

    public Integer getCsId() {
        return csId;
    }

    public void setCsId(Integer csId) {
        this.csId = csId;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "chatId=" + chatId +
                ", chatContent='" + chatContent + '\'' +
                ", chatDates=" + chatDates +
                ", csId=" + csId +
                '}';
    }
}
