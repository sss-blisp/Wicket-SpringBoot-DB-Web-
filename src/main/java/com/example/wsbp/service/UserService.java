package com.example.wsbp.service;

import com.example.wsbp.data.AuthUser;
import com.example.wsbp.data.ChatUser;
import com.example.wsbp.repository.IAuthUserRepository;
import com.example.wsbp.repository.IChatUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    private IAuthUserRepository authUserRepos;
    private IChatUserRepository chatUserRepos;

    @Autowired
    public UserService(IAuthUserRepository authUserRepos,IChatUserRepository chatUserRepository) {
        this.authUserRepos = authUserRepos;
        this.chatUserRepos = chatUserRepository;
    }

    @Override
    public void registerUser(String userName, String userPass) {
        int n = authUserRepos.insert(userName, userPass);
        System.out.println("記録行数：" + n);
    }

    @Override
    public void deleteUser(String userName) {
        int n = authUserRepos.delete(userName);
        System.out.println("記録行数：" + n);
    }

    @Override
    public boolean existsUser(String userName, String userPass) {
        var result = authUserRepos.exists(userName, userPass);
        System.out.println(userName + ", " + userPass + " のユーザ照合結果：" + result);
        return result;
    }
    @Override
    public List<AuthUser> findAuthUsers() {
        var users = authUserRepos.find();
        System.out.println("データ件数：" + users.size());
        return users;
    }

    @Override
    public void registerUserChat(String userName, String userChat) {
        int n = chatUserRepos.insert(userName, userChat);
        System.out.println("記録行数：" + n);
    }

    @Override
    public List<ChatUser> findChatUsers() {
        var users = chatUserRepos.find();
        System.out.println("データ件数：" + users.size());
        return users;
    }


}
