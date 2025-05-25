package com.inmobi.media;

/* loaded from: classes2.dex */
public final class L7 extends W6 {

    /* renamed from: x  reason: collision with root package name */
    public final K7 f14433x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f14434y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L7(String assetId, String assetName, X6 assetStyle, K7 timer) {
        super(assetId, assetName, "TIMER", assetStyle, 16);
        kotlin.jvm.internal.g.e(assetId, "assetId");
        kotlin.jvm.internal.g.e(assetName, "assetName");
        kotlin.jvm.internal.g.e(assetStyle, "assetStyle");
        kotlin.jvm.internal.g.e(timer, "timer");
        this.f14433x = timer;
    }

    public final void a(boolean z10) {
        this.f14434y = z10;
    }
}
