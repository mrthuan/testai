package com.inmobi.media;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class X7 extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f14851a;

    public X7(Y7 controller) {
        kotlin.jvm.internal.g.e(controller, "controller");
        this.f14851a = new WeakReference(controller);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        C1627f8 c1627f8;
        kotlin.jvm.internal.g.e(msg, "msg");
        if (msg.what == 2) {
            Y7 y72 = (Y7) this.f14851a.get();
            if (y72 != null) {
                C1627f8 c1627f82 = y72.f14876d;
                if (c1627f82 != null) {
                    int currentPosition = c1627f82.getCurrentPosition();
                    int duration = c1627f82.getDuration();
                    if (duration != 0) {
                        y72.f14880h.setProgress((currentPosition * 100) / duration);
                    }
                }
                if (y72.f14877e && (c1627f8 = y72.f14876d) != null && c1627f8.isPlaying()) {
                    Message obtainMessage = obtainMessage(2);
                    kotlin.jvm.internal.g.d(obtainMessage, "obtainMessage(...)");
                    sendMessageDelayed(obtainMessage, 200L);
                    return;
                }
                return;
            }
            return;
        }
        super.handleMessage(msg);
    }
}
