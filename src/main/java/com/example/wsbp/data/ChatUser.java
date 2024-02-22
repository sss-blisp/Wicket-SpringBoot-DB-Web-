package com.example.wsbp.data;

import java.io.Serializable;

// AUTH_USER テーブルのデータを入れるクラス
// Wicketの Model に使うかもしれないクラスは、 implements Serializable をつける
public class ChatUser implements Serializable {

    private final String userName;  // chat_userテーブルのuser_name列のデータ
    private final String userChat;  // chat_userテーブルのuser_chat列のデータ

    public ChatUser(String userName, String userChat) {
        this.userName = userName;
        this.userChat = userChat;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserChat() {
        return userChat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChatUser chatUser = (ChatUser) o;

        if (!userName.equals(chatUser.userName)) return false;
        return userChat.equals(chatUser.userChat);
    }

    @Override
    public int hashCode() {
        int result = userName.hashCode();
        result = 31 * result + userChat.hashCode();
        return result;
    }
}