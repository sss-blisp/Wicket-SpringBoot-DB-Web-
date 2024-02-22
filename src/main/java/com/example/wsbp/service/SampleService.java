package com.example.wsbp.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
// importを追加
import java.util.Random;

@Service
public class SampleService implements ISampleService {

    @Override
    public String makeCurrentHMS() {
        var now = LocalDateTime.now();
        var str = now.getHour()
                + ":" + now.getMinute()
                + ":" + now.getSecond();
        return str;
    }
    public int makeRandInt(){
// 乱数の作成方法
        var rand = new Random();
        var n = rand.nextInt(10);
        return n;
    }

}