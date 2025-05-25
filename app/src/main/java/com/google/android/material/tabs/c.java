package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: TabLayout.java */
/* loaded from: classes2.dex */
public final class c implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f12991a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TabLayout.TabView f12992b;

    public c(TabLayout.TabView tabView, View view) {
        this.f12992b = tabView;
        this.f12991a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        View view2 = this.f12991a;
        if (view2.getVisibility() == 0) {
            int i18 = TabLayout.TabView.f12961l;
            this.f12992b.c(view2);
        }
    }
}
