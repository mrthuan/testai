package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
public final class L0 extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public boolean f14416a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(Looper looper) {
        super(looper);
        kotlin.jvm.internal.g.e(looper, "looper");
        this.f14416a = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        boolean z10;
        kotlin.jvm.internal.g.e(msg, "msg");
        z10 = O0.c;
        if (z10) {
            return;
        }
        int i10 = msg.what;
        if (i10 == 1001 && this.f14416a) {
            this.f14416a = false;
            O0.a(O0.f14537a, false);
            kotlin.jvm.internal.g.d(O0.b(), "access$getTAG$p(...)");
        } else if (i10 == 1002 && !this.f14416a) {
            this.f14416a = true;
            O0.a(O0.f14537a, true);
            kotlin.jvm.internal.g.d(O0.b(), "access$getTAG$p(...)");
        }
    }
}
