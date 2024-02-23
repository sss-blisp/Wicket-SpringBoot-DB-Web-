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

<img width="539" alt="image" src="https://github.com/sss-blisp/Wicket-SpringBoot-DB-Web-/assets/139861013/e427147a-d0c6-4f68-8bba-c398fee10d83">

　-MVCモデル：プログラムを役割ごとにModel（モデル）・View（ビュー）・Controller（コントローラー）の3つに分けて管理するソフトウェア設計モデル
 
 
