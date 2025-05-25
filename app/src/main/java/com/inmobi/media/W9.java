package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class W9 {

    /* renamed from: a  reason: collision with root package name */
    public Object f14811a;

    /* renamed from: b  reason: collision with root package name */
    public final long f14812b;

    public W9(S9 view, long j10) {
        kotlin.jvm.internal.g.e(view, "view");
        this.f14811a = view;
        this.f14812b = j10;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).postDelayed(new androidx.activity.k(this, 9), this.f14812b);
    }

    public static final void a(W9 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        S9 s92 = (S9) this$0.f14811a;
        if (s92 != null) {
            A4 a42 = s92.f14665j;
            if (a42 != null) {
                String str = S9.O0;
                ((B4) a42).a(str, G9.a(s92, str, "TAG", "deferredDestroy "));
            }
            s92.destroy();
        }
        this$0.f14811a = null;
    }
}
