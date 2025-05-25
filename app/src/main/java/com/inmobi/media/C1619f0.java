package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.inmobi.media.f0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1619f0 implements Y0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1633g0 f15043a;

    public C1619f0(C1633g0 c1633g0) {
        this.f15043a = c1633g0;
    }

    public static final void a(C1633g0 this$0, byte b10) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        ((AbstractC1846w0) this$0.f15080a).a(this$0.c, false, b10 == 1 ? (short) 78 : b10 == 2 ? (short) 79 : b10 == 3 ? (short) 80 : b10 == 4 ? (short) 81 : b10 == 5 ? (short) 5 : b10 == 6 ? (short) 77 : b10 == 7 ? (short) 31 : b10 == 8 ? (short) 27 : (short) 82);
    }

    public static final void a(C1633g0 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        ((AbstractC1846w0) this$0.f15080a).a(this$0.c, true, (short) 0);
    }

    @Override // com.inmobi.media.Y0
    public final void a(C1688k assetBatch, byte b10) {
        kotlin.jvm.internal.g.e(assetBatch, "assetBatch");
        this.f15043a.f15086h.a(assetBatch, b10);
        C1633g0 c1633g0 = this.f15043a;
        A4 a42 = c1633g0.f15084f;
        if (a42 != null) {
            String str = c1633g0.f15082d;
            StringBuilder a10 = A5.a(str, "access$getTAG$p(...)", "Notifying failure  to ad unit with placement ID (");
            a10.append(this.f15043a.c);
            a10.append(')');
            ((B4) a42).b(str, a10.toString());
        }
        new Handler(Looper.getMainLooper()).post(new qb.m0(this.f15043a, b10, 0));
    }

    @Override // com.inmobi.media.Y0
    public final void a(C1688k assetBatch) {
        kotlin.jvm.internal.g.e(assetBatch, "assetBatch");
        this.f15043a.f15086h.a(assetBatch);
        C1633g0 c1633g0 = this.f15043a;
        A4 a42 = c1633g0.f15084f;
        if (a42 != null) {
            String str = c1633g0.f15082d;
            StringBuilder a10 = A5.a(str, "access$getTAG$p(...)", "Notifying ad unit with placement ID (");
            a10.append(this.f15043a.c);
            a10.append(')');
            ((B4) a42).a(str, a10.toString());
        }
        new Handler(Looper.getMainLooper()).post(new b7.g(this.f15043a, 7));
    }
}
