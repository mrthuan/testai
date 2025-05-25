package com.facebook.internal;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.e;

/* compiled from: FeatureManager.kt */
/* loaded from: classes.dex */
public final class d implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FeatureManager.a f9759a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FeatureManager.Feature f9760b;

    public d(FeatureManager.a aVar, FeatureManager.Feature feature) {
        this.f9759a = aVar;
        this.f9760b = feature;
    }

    @Override // com.facebook.internal.e.a
    public final void a() {
        this.f9759a.k(FeatureManager.c(this.f9760b));
    }
}
