package com.facebook.ads.redexgen.X;

import android.media.MediaPlayer;
import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.Rc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1094Rc implements MediaController.MediaPlayerControl {
    public static String[] A01 = {"G2jsbExkD9brib249v9eCTdtCCMiwFzU", "MybJItuTTwvMgUX2RH23VAkcAJ", "ow4pie4IyD8vnQFKIBNl8mdJIY6Q5gW8", "kaFU92mf6AOB2B7qFy6jCknY9pgFVbwN", "XSYkluwu3NIdD0aesrZFwy6vCjOS", "MBQtVF6anIuSN", "XyB5XGE3kPOvBkLqSfjYtL", "1ylIFWR"};
    public final /* synthetic */ LW A00;

    public C1094Rc(LW lw) {
        this.A00 = lw;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        mediaPlayer = this.A00.A06;
        if (mediaPlayer != null) {
            LW lw = this.A00;
            if (A01[1].length() != 26) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[0] = "Hfs5YLVNykkKsniRiyykCGhMklelUedO";
            strArr[3] = "ZNxy2mQzqI9R708Jl4ViCzH0rbFY1aBC";
            mediaPlayer2 = lw.A06;
            return mediaPlayer2.getAudioSessionId();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        mediaPlayer = this.A00.A06;
        if (mediaPlayer != null) {
            mediaPlayer2 = this.A00.A06;
            if (mediaPlayer2.isPlaying()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC1100Ri interfaceC1100Ri;
        InterfaceC1100Ri interfaceC1100Ri2;
        interfaceC1100Ri = this.A00.A0E;
        if (interfaceC1100Ri != null) {
            interfaceC1100Ri2 = this.A00.A0E;
            interfaceC1100Ri2.ACe();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i10) {
        this.A00.seekTo(i10);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        InterfaceC1100Ri interfaceC1100Ri;
        InterfaceC1100Ri interfaceC1100Ri2;
        interfaceC1100Ri = this.A00.A0E;
        if (interfaceC1100Ri != null) {
            interfaceC1100Ri2 = this.A00.A0E;
            interfaceC1100Ri2.ACf();
        }
    }
}
