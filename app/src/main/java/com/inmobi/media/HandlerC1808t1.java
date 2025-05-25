package com.inmobi.media;

import android.os.Handler;
import android.os.Message;
import com.inmobi.ads.InMobiBanner;

/* renamed from: com.inmobi.media.t1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC1808t1 extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final InMobiBanner f15456a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HandlerC1808t1(com.inmobi.ads.InMobiBanner r3) {
        /*
            r2 = this;
            java.lang.String r0 = "mInmobiBanner"
            kotlin.jvm.internal.g.e(r3, r0)
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.String r1 = "getMainLooper(...)"
            kotlin.jvm.internal.g.d(r0, r1)
            r2.<init>(r0)
            r2.f15456a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.HandlerC1808t1.<init>(com.inmobi.ads.InMobiBanner):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        kotlin.jvm.internal.g.e(msg, "msg");
        if (msg.what == 1) {
            this.f15456a.refreshBanner$media_release();
        }
    }
}
