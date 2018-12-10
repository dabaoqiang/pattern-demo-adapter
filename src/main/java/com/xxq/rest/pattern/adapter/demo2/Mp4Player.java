package com.xxq.rest.pattern.adapter.demo2;

/**
 * @author xiaoqiang
 * @Title: Mp4Player
 * @ProjectName pattern-demo-adapter
 * @Description: TODO
 * @date 2018-12-10 23:12
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
