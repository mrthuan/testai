package com.inmobi.media;

import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class I5 extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ J5 f14346a;

    public I5(J5 j52) {
        this.f14346a = j52;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f14346a.b();
    }
}
