# Wicket-SpringBoot-DB-Web-
Wicket + SpringBoot + DBを活用したWebアプリケーション開発

## 概要

JavaのみでのWebアプリ開発

## 目的

コンポーネント指向とIoC/DIを学ぶこと

-コンポーネント指向：たくさんのシンプルなコンポーネント（部品）を組み合わせることで１つのアプリケーションを開発する手法
 
 　メリット：コンポーネントを再利用できること
 
 　デメリット：コンポーネントの粒度が統一されていない
   
-IoC（Inversion of Control）もしくはDI（Dependency Injection）：クラスを外部設定で切り替えて、インスタンス化を自動化する

　メリット：テスト時に、すべてのインスタンス化部分を手動でコメントアウトを切り替える必要がない
 　　

## 使った技術

Apache Wicket

　：サーバサイド型Webアプリケーションの中で、要求の受付とHTMLの生成を担当するフレームワーク
 
Spring Boot　3.2.3

　：Springを使ったアプリケーションを簡単に作成・実行することができるようにする設定済みのひな形
 
 　　-Spring：エンタープライズシステムをJavaで開発するために必要な様々な機能を包括的に担当するフレームワーク
   
H2DB　1.4.200

Java　17

HTML


## 構成図

MVCモデルを考慮した構成

![image](https://github.com/user-attachments/assets/8c83e14e-2534-40e6-9ede-ac5261e148ab)




　-MVCモデル：プログラムを役割ごとにModel・View・Controllerの3つに分けて管理するソフトウェア設計モデル

## 機能

・ユーザー登録

<img width="413" alt="image" src="https://github.com/sss-blisp/Wicket-SpringBoot-DB-Web-/assets/139861013/a82da08f-a751-4092-a3e9-2d70602ba56d">


・ログイン機能

<img width="294" alt="image" src="https://github.com/sss-blisp/Wicket-SpringBoot-DB-Web-/assets/139861013/56bac4ce-3fcf-463f-8bd1-48df9f06bf53">


・登録したユーザーの一覧の閲覧

<img width="344" alt="image" src="https://github.com/sss-blisp/Wicket-SpringBoot-DB-Web-/assets/139861013/55ccb1ae-647c-4734-8f14-8cefb0f5ea06">

・ログイン後の疑似チャット機能

<img width="269" alt="image" src="https://github.com/sss-blisp/Wicket-SpringBoot-DB-Web-/assets/139861013/404a2d8b-e5b9-495a-90ad-66eaa5c0f732">

