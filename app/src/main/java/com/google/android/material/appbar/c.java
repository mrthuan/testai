package com.google.android.material.appbar;

import android.view.View;
import y0.j;

/* compiled from: AppBarLayout.java */
/* loaded from: classes2.dex */
public final class c implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f12059a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f12060b;

    public c(AppBarLayout appBarLayout, boolean z10) {
        this.f12059a = appBarLayout;
        this.f12060b = z10;
    }

    @Override // y0.j
    public final boolean a(View view) {
        this.f12059a.setExpanded(this.f12060b);
        return true;
    }
}
