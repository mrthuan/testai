package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.c8  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC1585c8 extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f14988a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1585c8(C1627f8 videoView) {
        super(Looper.getMainLooper());
        kotlin.jvm.internal.g.e(videoView, "videoView");
        this.f14988a = new WeakReference(videoView);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        W7 w7;
        InterfaceC1557a8 playbackEventListener;
        kotlin.jvm.internal.g.e(msg, "msg");
        C1627f8 c1627f8 = (C1627f8) this.f14988a.get();
        if (c1627f8 != null && msg.what == 1) {
            int duration = c1627f8.getDuration();
            int currentPosition = c1627f8.getCurrentPosition();
            if (duration != -1 && currentPosition != 0) {
                Object tag = c1627f8.getTag();
                if (tag instanceof W7) {
                    w7 = (W7) tag;
                } else {
                    w7 = null;
                }
                if (w7 != null) {
                    Object obj = w7.f14804t.get("didCompleteQ1");
                    kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    if (!((Boolean) obj).booleanValue() && (currentPosition * 4) - duration >= 0) {
                        w7.f14804t.put("didCompleteQ1", Boolean.TRUE);
                        InterfaceC1571b8 quartileCompletedListener = c1627f8.getQuartileCompletedListener();
                        kotlin.jvm.internal.g.b(quartileCompletedListener);
                        ((C1814t7) quartileCompletedListener).a((byte) 0);
                    }
                    Object obj2 = w7.f14804t.get("didCompleteQ2");
                    kotlin.jvm.internal.g.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                    if (!((Boolean) obj2).booleanValue() && (currentPosition * 2) - duration >= 0) {
                        w7.f14804t.put("didCompleteQ2", Boolean.TRUE);
                        InterfaceC1571b8 quartileCompletedListener2 = c1627f8.getQuartileCompletedListener();
                        if (quartileCompletedListener2 != null) {
                            ((C1814t7) quartileCompletedListener2).a((byte) 1);
                        }
                    }
                    Object obj3 = w7.f14804t.get("didCompleteQ3");
                    kotlin.jvm.internal.g.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    if (!((Boolean) obj3).booleanValue() && (currentPosition * 4) - (duration * 3) >= 0) {
                        w7.f14804t.put("didCompleteQ3", Boolean.TRUE);
                        InterfaceC1571b8 quartileCompletedListener3 = c1627f8.getQuartileCompletedListener();
                        if (quartileCompletedListener3 != null) {
                            ((C1814t7) quartileCompletedListener3).a((byte) 2);
                        }
                    }
                    if ((currentPosition / duration) * 100 > w7.D) {
                        Object obj4 = w7.f14804t.get("didQ4Fire");
                        kotlin.jvm.internal.g.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        if (!((Boolean) obj4).booleanValue() && (playbackEventListener = c1627f8.getPlaybackEventListener()) != null) {
                            ((C1827u7) playbackEventListener).a((byte) 5);
                        }
                    }
                }
            }
            sendEmptyMessageDelayed(1, 1000L);
        }
        super.handleMessage(msg);
    }
}
