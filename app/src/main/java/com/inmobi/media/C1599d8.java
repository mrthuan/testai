package com.inmobi.media;

import android.media.MediaPlayer;
import java.util.HashMap;

/* renamed from: com.inmobi.media.d8  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1599d8 implements MediaPlayer.OnPreparedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1627f8 f15017a;

    public C1599d8(C1627f8 c1627f8) {
        this.f15017a = c1627f8;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mp2) {
        W7 w7;
        Object obj;
        Boolean bool;
        Object obj2;
        HashMap hashMap;
        Y7 y72;
        Object obj3;
        HashMap hashMap2;
        HashMap hashMap3;
        kotlin.jvm.internal.g.e(mp2, "mp");
        if (this.f15017a.getMediaPlayer() == null) {
            return;
        }
        A7 mediaPlayer = this.f15017a.getMediaPlayer();
        if (mediaPlayer != null) {
            mediaPlayer.f14128a = 2;
        }
        C1627f8 c1627f8 = this.f15017a;
        c1627f8.f15067s = true;
        c1627f8.f15066r = true;
        c1627f8.f15065q = true;
        Y7 y73 = c1627f8.f15063o;
        if (y73 != null) {
            y73.setEnabled(true);
        }
        this.f15017a.f15054f = mp2.getVideoWidth();
        this.f15017a.f15055g = mp2.getVideoHeight();
        Object tag = this.f15017a.getTag();
        Boolean bool2 = null;
        if (tag instanceof W7) {
            w7 = (W7) tag;
        } else {
            w7 = null;
        }
        int i10 = 0;
        if (w7 != null) {
            Object obj4 = w7.f14804t.get("didCompleteQ4");
            kotlin.jvm.internal.g.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj4).booleanValue()) {
                this.f15017a.a(8, 0);
                Object obj5 = w7.f14804t.get("placementType");
                kotlin.jvm.internal.g.c(obj5, "null cannot be cast to non-null type kotlin.Byte");
                if (((Byte) obj5).byteValue() == 1) {
                    return;
                }
            }
        }
        InterfaceC1557a8 playbackEventListener = this.f15017a.getPlaybackEventListener();
        if (playbackEventListener != null) {
            ((C1827u7) playbackEventListener).a((byte) 0);
        }
        if (w7 != null && (hashMap3 = w7.f14804t) != null) {
            obj = hashMap3.get("didCompleteQ4");
        } else {
            obj = null;
        }
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        } else {
            bool = null;
        }
        if (kotlin.jvm.internal.g.a(bool, Boolean.FALSE)) {
            Object obj6 = w7.f14804t.get("seekPosition");
            kotlin.jvm.internal.g.c(obj6, "null cannot be cast to non-null type kotlin.Int");
            i10 = ((Integer) obj6).intValue();
        }
        C1627f8 c1627f82 = this.f15017a;
        if (c1627f82.f15054f != 0 && c1627f82.f15055g != 0) {
            A7 mediaPlayer2 = c1627f82.getMediaPlayer();
            if (mediaPlayer2 != null && 3 == mediaPlayer2.f14129b) {
                if (w7 != null && (hashMap2 = w7.f14804t) != null) {
                    obj3 = hashMap2.get("isFullScreen");
                } else {
                    obj3 = null;
                }
                if (obj3 instanceof Boolean) {
                    bool2 = (Boolean) obj3;
                }
                if (kotlin.jvm.internal.g.a(bool2, Boolean.TRUE)) {
                    this.f15017a.start();
                }
                Y7 y74 = this.f15017a.f15063o;
                if (y74 != null) {
                    y74.d();
                    return;
                }
                return;
            } else if (!this.f15017a.isPlaying()) {
                if ((i10 != 0 || this.f15017a.getCurrentPosition() > 0) && (y72 = this.f15017a.f15063o) != null) {
                    y72.d();
                    return;
                }
                return;
            } else {
                return;
            }
        }
        A7 mediaPlayer3 = c1627f82.getMediaPlayer();
        if (mediaPlayer3 != null && 3 == mediaPlayer3.f14129b) {
            if (w7 != null && (hashMap = w7.f14804t) != null) {
                obj2 = hashMap.get("isFullScreen");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof Boolean) {
                bool2 = (Boolean) obj2;
            }
            if (kotlin.jvm.internal.g.a(bool2, Boolean.TRUE)) {
                this.f15017a.start();
            }
        }
    }
}
