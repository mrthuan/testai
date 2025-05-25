package com.inmobi.media;

import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: com.inmobi.media.b4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1567b4 {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f14961b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final HandlerC1553a4 f14962a;

    public C1567b4() {
        HandlerThread handlerThread = new HandlerThread("DataCollectionHandler");
        J3.a(handlerThread, "DataCollectionHandler");
        Looper looper = handlerThread.getLooper();
        kotlin.jvm.internal.g.d(looper, "getLooper(...)");
        this.f14962a = new HandlerC1553a4(looper);
    }

    public final synchronized void a() {
        if (!Jc.a()) {
            return;
        }
        HandlerC1553a4 handlerC1553a4 = this.f14962a;
        handlerC1553a4.f14932a = false;
        if (!handlerC1553a4.hasMessages(3)) {
            this.f14962a.removeMessages(2);
            this.f14962a.sendEmptyMessage(1);
        }
    }
}
