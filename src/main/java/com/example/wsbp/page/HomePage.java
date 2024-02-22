package com.example.wsbp.page;

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;
import org.apache.wicket.markup.html.WebPage;
import org.wicketstuff.annotation.mount.MountPath;

//HTMLを書き換えるコンポーネントを設定
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

//Springのクラスを、WicketのWebPageから呼び出す(DI)
import com.example.wsbp.service.ISampleService;
import org.apache.wicket.spring.injection.annot.SpringBean;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;
@WicketHomePage
@MountPath("Home")
public class HomePage extends WebPage {
    @SpringBean
    private ISampleService service;
    public HomePage() {
        //コンポーネント
        var youModel = Model.of("Wicket-Spring-Boot");
        //モデル
        var youLabel = new Label("you", youModel);
        add(youLabel);

        var gakusekiModel = Model.of("B2200190");
        var gakusekiLabel = new Label("gakuseki", gakusekiModel);
        add(gakusekiLabel);

        var nameModel = Model.of("Ando");
        var nameLabel = new Label("name", nameModel);
        add(nameLabel);

        var timeModel = Model.of(service.makeCurrentHMS());
        var timeLabel = new Label("time", timeModel);
        add(timeLabel);

        var randModel = Model.of(service.makeRandInt());
        var randLabel = new Label("rand", randModel);
        add(randLabel);

        var toUserMakerLink = new BookmarkablePageLink<>("toUserMaker", UserMakerPage.class);
        add(toUserMakerLink);
        var toUserDeleterLink = new BookmarkablePageLink<>("toUserDeleter", UserDeletePage.class);
        add(toUserDeleterLink);
    }

}