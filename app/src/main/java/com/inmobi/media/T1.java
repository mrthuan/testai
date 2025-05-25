package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class T1 {

    /* renamed from: a  reason: collision with root package name */
    public final V1 f14705a;

    /* renamed from: b  reason: collision with root package name */
    public final A4 f14706b;

    public T1(V1 mEventHandler, A4 a42) {
        kotlin.jvm.internal.g.e(mEventHandler, "mEventHandler");
        this.f14705a = mEventHandler;
        this.f14706b = a42;
    }

    public final void a(N1 click) {
        kotlin.jvm.internal.g.e(click, "click");
        click.f14513i.set(false);
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new androidx.emoji2.text.h(2, click, this, handler));
    }

    public static final void a(N1 click, T1 this$0, Handler handler) {
        kotlin.jvm.internal.g.e(click, "$click");
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(handler, "$handler");
        G8 g82 = new G8(click.f14507b, this$0.f14706b);
        g82.f14297x = false;
        g82.f14293t = false;
        g82.f14294u = false;
        HashMap a10 = Y1.a(Y1.f14860a, click);
        if (!a10.isEmpty()) {
            g82.f14282i.putAll(a10);
        }
        new Fc(g82, new S1(click, this$0, handler)).a();
    }
}
