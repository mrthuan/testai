package com.inmobi.media;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.commons.core.configs.AdConfig;

/* renamed from: com.inmobi.media.r7  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1788r7 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f15416a;

    /* renamed from: b  reason: collision with root package name */
    public final M6 f15417b;
    public final A4 c;

    /* renamed from: d  reason: collision with root package name */
    public final String f15418d;

    /* renamed from: e  reason: collision with root package name */
    public final C1866x7 f15419e;

    public C1788r7(Context context, AdConfig adConfig, M6 mNativeAdContainer, C1682j7 dataModel, A4 a42) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(adConfig, "adConfig");
        kotlin.jvm.internal.g.e(mNativeAdContainer, "mNativeAdContainer");
        kotlin.jvm.internal.g.e(dataModel, "dataModel");
        this.f15417b = mNativeAdContainer;
        this.c = a42;
        this.f15418d = "r7";
        C1866x7 c1866x7 = new C1866x7(context, adConfig, mNativeAdContainer, dataModel, new C1776q7(this), new C1763p7(this), this, a42);
        this.f15419e = c1866x7;
        C1867x8 c1867x8 = c1866x7.f15646m;
        int i10 = mNativeAdContainer.A;
        c1867x8.getClass();
        C1867x8.f15652f = i10;
    }

    public final D7 a(View view, ViewGroup parent, boolean z10, S9 s92) {
        KeyEvent.Callback callback;
        D7 d72;
        A4 a42;
        kotlin.jvm.internal.g.e(parent, "parent");
        D7 d73 = null;
        if (view != null) {
            callback = view.findViewWithTag("InMobiAdView");
        } else {
            callback = null;
        }
        if (callback instanceof D7) {
            d73 = (D7) callback;
        }
        if (z10) {
            d72 = this.f15419e.a(d73, parent, s92);
        } else {
            C1866x7 c1866x7 = this.f15419e;
            c1866x7.getClass();
            c1866x7.f15648o = s92;
            D7 a10 = c1866x7.a(d73, parent);
            if (!c1866x7.f15647n) {
                C1570b7 c1570b7 = c1866x7.c.f15220f;
                if (a10 != null && c1570b7 != null) {
                    c1866x7.b((ViewGroup) a10, c1570b7);
                }
            }
            d72 = a10;
        }
        if (d73 == null && (a42 = this.c) != null) {
            String TAG = this.f15418d;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).b(TAG, "InMobiNative.getPrimaryView called with Non Native View.");
        }
        if (d72 != null) {
            d72.setNativeStrandAd(this.f15417b);
        }
        if (d72 != null) {
            d72.setTag("InMobiAdView");
        }
        return d72;
    }
}
