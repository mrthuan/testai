package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class mc extends AbstractC1701kc {

    /* renamed from: e  reason: collision with root package name */
    public final M6 f15324e;

    /* renamed from: f  reason: collision with root package name */
    public S9 f15325f;

    /* renamed from: g  reason: collision with root package name */
    public final A4 f15326g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15327h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f15328i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(M6 mNativeAdContainer, S9 s92, A4 a42) {
        super(mNativeAdContainer);
        kotlin.jvm.internal.g.e(mNativeAdContainer, "mNativeAdContainer");
        this.f15324e = mNativeAdContainer;
        this.f15325f = s92;
        this.f15326g = a42;
        this.f15327h = "InMobi";
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(byte b10) {
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(HashMap hashMap) {
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.g.e(childView, "childView");
        kotlin.jvm.internal.g.e(obstructionCode, "obstructionCode");
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(Context context, byte b10) {
        kotlin.jvm.internal.g.e(context, "context");
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a(View childView) {
        kotlin.jvm.internal.g.e(childView, "childView");
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final View a(View view, ViewGroup parent, boolean z10) {
        Context j10;
        kotlin.jvm.internal.g.e(parent, "parent");
        if (this.f15328i || (j10 = this.f15324e.j()) == null) {
            return null;
        }
        AdConfig adConfig = this.f15273d;
        M6 m62 = this.f15324e;
        C1682j7 c1682j7 = m62.f14461b;
        kotlin.jvm.internal.g.c(c1682j7, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeDataModel");
        this.f15272b = new C1788r7(j10, adConfig, m62, c1682j7, this.f15326g);
        A4 a42 = this.f15326g;
        if (a42 != null) {
            ((B4) a42).b(this.f15327h, "Ad markup loaded into the container will be inflated into a View.");
        }
        C1788r7 c1788r7 = this.f15272b;
        this.c = new WeakReference(c1788r7 != null ? c1788r7.a(view, parent, z10, this.f15325f) : null);
        M6 m63 = this.f15324e;
        m63.getClass();
        J3.a(new D6(m63, m63), "EndCardBuilderTask");
        return b();
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void e() {
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a() {
        if (this.f15328i) {
            return;
        }
        this.f15328i = true;
        C1788r7 c1788r7 = this.f15272b;
        if (c1788r7 != null) {
            C1866x7 c1866x7 = c1788r7.f15419e;
            c1866x7.f15647n = true;
            c1866x7.f15642i.clear();
            c1866x7.f15649p = null;
            G7 g72 = c1866x7.f15643j;
            if (g72 != null) {
                g72.destroy();
            }
            c1866x7.f15643j = null;
            if (!c1788r7.f15416a) {
                c1788r7.f15416a = true;
            }
        }
        this.f15272b = null;
        S9 s92 = this.f15325f;
        if (s92 != null) {
            s92.b();
        }
        this.f15325f = null;
        super.a();
    }
}
