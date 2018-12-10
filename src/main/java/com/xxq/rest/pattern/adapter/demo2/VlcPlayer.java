package com.xxq.rest.pattern.adapter.demo2;

/**
 * @author xiaoqiang
 * @Title: VlcPlayer
 * @ProjectName pattern-demo-adapter
 * @Description: TODO
 * @date 2018-12-10 23:05
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
