package com.xxq.rest.pattern.adapter.demo2;

/**
 * @author xiaoqiang
 * @Title: AdapterPatternDemo
 * @ProjectName pattern-demo-adapter
 * @Description: TODO
 * @date 2018-12-10 23:16
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
