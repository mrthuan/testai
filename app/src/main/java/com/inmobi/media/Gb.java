package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public abstract class Gb extends AbstractRunnableC1690k1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gb(AbstractC1846w0 obj, byte b10) {
        super(obj);
        kotlin.jvm.internal.g.e(obj, "obj");
    }

    public static final void a(Gb this$0, Object obj) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.a(obj);
    }

    public abstract void a(Object obj);

    public final void b(Object obj) {
        new Handler(Looper.getMainLooper()).post(new l.r(8, this, obj));
    }
}
