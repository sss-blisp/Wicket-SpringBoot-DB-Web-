package com.example.wsbp.page;

import com.example.wsbp.data.ChatUser;
import com.example.wsbp.page.signed.SignedPage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.wicketstuff.annotation.mount.MountPath;
import com.example.wsbp.service.IUserService;
@MountPath("UserChatMakerComp")
public class UserChatMakerCompPage extends WebPage {

    @SpringBean
    private IUserService userService;

    public UserChatMakerCompPage(IModel<String> userNameModel) {
        var userNameLabel = new Label("userName", userNameModel);
        add(userNameLabel);

        var toSignedLink = new BookmarkablePageLink<>("toSigned", SignedPage.class);
        add(toSignedLink);

        var chatUsersModel = Model.ofList(userService.findChatUsers());
//    var authUsersModel = LoadableDetachableModel.of(() -> userService.findAuthUsers());

        // List型のモデルを表示する ListView
        var usersLV = new ListView<>("users", chatUsersModel) {
            @Override
            protected void populateItem(ListItem<ChatUser> listItem) {
                var itemModel = listItem.getModel();
                var chatUser = itemModel.getObject();

                var userNameModel = Model.of(chatUser.getUserName());
                var userNameLabel = new Label("userName", userNameModel);
                listItem.add(userNameLabel);

                var userChatModel = Model.of(chatUser.getUserChat());
                var userChatLabel = new Label("userChat", userChatModel);
                listItem.add(userChatLabel);
            }
        };
        add(usersLV);
    }
}