package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: com.inmobi.media.xb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1870xb {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC1844vb f15658a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f15659b;

    public C1870xb(InterfaceC1844vb timeOutInformer) {
        kotlin.jvm.internal.g.e(timeOutInformer, "timeOutInformer");
        this.f15658a = timeOutInformer;
        this.f15659b = new HashMap();
    }

    public final void a(byte b10) {
        new Handler(Looper.getMainLooper()).post(new qb.m0(this, b10, 1));
    }

    public static final void a(C1870xb this$0, byte b10) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.f15658a.a(b10);
    }
}
