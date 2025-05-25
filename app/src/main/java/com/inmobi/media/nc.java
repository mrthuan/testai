package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class nc extends AbstractC1701kc {

    /* renamed from: e  reason: collision with root package name */
    public final U7 f15353e;

    /* renamed from: f  reason: collision with root package name */
    public final A4 f15354f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f15355g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(U7 mNativeVideoAdContainer, A4 a42) {
        super(mNativeVideoAdContainer);
        kotlin.jvm.internal.g.e(mNativeVideoAdContainer, "mNativeVideoAdContainer");
        this.f15353e = mNativeVideoAdContainer;
        this.f15354f = a42;
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
        if (this.f15355g || (j10 = this.f15353e.j()) == null) {
            return null;
        }
        AdConfig adConfig = this.f15273d;
        U7 u7 = this.f15353e;
        C1682j7 c1682j7 = u7.f14461b;
        kotlin.jvm.internal.g.c(c1682j7, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeDataModel");
        C1788r7 c1788r7 = new C1788r7(j10, adConfig, u7, c1682j7, this.f15354f);
        this.f15272b = c1788r7;
        this.c = new WeakReference(c1788r7.a(view, parent, false, null));
        U7 u72 = this.f15353e;
        u72.getClass();
        J3.a(new D6(u72, u72), "EndCardBuilderTask");
        return b();
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void e() {
    }

    @Override // com.inmobi.media.AbstractC1701kc
    public final void a() {
        if (this.f15355g) {
            return;
        }
        this.f15355g = true;
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
        super.a();
    }
}
