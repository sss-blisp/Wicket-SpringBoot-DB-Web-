package com.example.wsbp.page;

import com.example.wsbp.MySession;
import com.example.wsbp.data.ChatUser;
import com.example.wsbp.page.signed.SignedPage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.validation.validator.StringValidator;
import org.wicketstuff.annotation.mount.MountPath;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;

import org.apache.wicket.model.Model;

import org.apache.wicket.spring.injection.annot.SpringBean;
import com.example.wsbp.service.IUserService;

@MountPath("UserChatMaker")
public class UserChatMakerPage extends WebPage {

    //IUserService を IoC/DI する
    @SpringBean
    private IUserService userService;

    public UserChatMakerPage() {
        var signedUserName = MySession.get().getUserName();
        var userNameModel = Model.of(signedUserName);
//        var userNameLabel = new Label("userName", name);
//        add(userNameLabel);

//        var userNameModel = Model.of("");
        var userChatModel = Model.of("");

        var toSignedLink = new BookmarkablePageLink<>("toSigned", SignedPage.class);
        add(toSignedLink);

//配置したFormコンポーネントを匿名クラス化して処理を上書きする
        Form<Void> userInfoForm = new Form<Void>("userInfo") {
            @Override
            protected void onSubmit() {
                var userName = userNameModel.getObject();
                var userChat = userChatModel.getObject();
                var msg = "送信データ："
                        + userName
                        + ","
                        + userChat;
                System.out.println(msg);
                // IoC/DI した userService のメソッドを呼び出す
                userService.registerUserChat(userName, userChat);
                setResponsePage(new UserChatMakerCompPage(userNameModel));
            }
        };
        add(userInfoForm);

        // 右辺の型引数 <String> を <> に省略して書いている
        var userChatField = new TextField<>("userChat", userChatModel);
        userInfoForm.add(userChatField);


    }

}