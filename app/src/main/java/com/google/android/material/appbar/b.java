package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import y0.j;

/* compiled from: AppBarLayout.java */
/* loaded from: classes2.dex */
public final class b implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f12055a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f12056b;
    public final /* synthetic */ View c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f12057d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f12058e;

    public b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
        this.f12058e = baseBehavior;
        this.f12055a = coordinatorLayout;
        this.f12056b = appBarLayout;
        this.c = view;
        this.f12057d = i10;
    }

    @Override // y0.j
    public final boolean a(View view) {
        this.f12058e.E(this.f12055a, this.f12056b, this.c, this.f12057d, new int[]{0, 0});
        return true;
    }
}
