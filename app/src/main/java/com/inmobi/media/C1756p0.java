package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.ads.InMobiAdRequestStatus;

/* renamed from: com.inmobi.media.p0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1756p0 extends U9 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC1846w0 f15368a;

    public C1756p0(AbstractC1846w0 abstractC1846w0) {
        this.f15368a = abstractC1846w0;
    }

    public static final void a(AbstractC1846w0 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 43);
    }

    public static final void b(AbstractC1846w0 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.f15538q = true;
        this$0.f();
    }

    @Override // com.inmobi.media.U9
    public final void f(S9 renderView) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        if (2 == this.f15368a.Q()) {
            this.f15368a.q0();
        }
    }

    @Override // com.inmobi.media.U9
    public final void g(S9 renderView) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        new Handler(Looper.getMainLooper()).post(new qb.z0(this.f15368a, 0));
    }

    @Override // com.inmobi.media.U9
    public final void h(S9 renderView) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        if (2 == this.f15368a.Q()) {
            new Handler(Looper.getMainLooper()).post(new androidx.activity.i(this.f15368a, 13));
        }
    }

    @Override // com.inmobi.media.U9
    public final void a(S9 renderView, short s4) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        if (2 == this.f15368a.Q()) {
            this.f15368a.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2176);
        }
    }

    @Override // com.inmobi.media.U9
    public final void a(C1780qb telemetryOnAdImpression) {
        kotlin.jvm.internal.g.e(telemetryOnAdImpression, "telemetryOnAdImpression");
        this.f15368a.a(telemetryOnAdImpression);
    }
}
