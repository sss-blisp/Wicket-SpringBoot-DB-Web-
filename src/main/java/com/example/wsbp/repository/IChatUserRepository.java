package com.example.wsbp.repository;

import com.example.wsbp.data.ChatUser;

import java.util.List;

public interface IChatUserRepository {
    /**
     * ユーザー名とパスワードをchatテーブルに記録する
     *
     * @param userName ユーザー名
     * @param userChat チャット内容
     * @return データベースの更新行数
     */
    public int insert(String userName, String userChat);

    /**
     * ユーザ名とパスワードが一致するレコードがAuthUserテーブルにあるか検索する
     *
     * @param userName ユーザー名
     * @param userPass パスワード
     * @return レコードの有無, 存在すれば<code>true</code>, それ以外は <code>false</code>
     */
    public boolean exists(String userName, String userChat);
    /**
     * Chatテーブルのすべての情報を検索する
     *
     * @return レコードの内容を {@link ChatUser} の {@link List} で返す
     */
    public List<ChatUser> find();
}
