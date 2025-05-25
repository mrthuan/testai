package com.google.android.material.floatingactionbutton;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: ExtendedFloatingActionButton.java */
/* loaded from: classes2.dex */
public final class a implements ExtendedFloatingActionButton.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f12525a;

    public a(ExtendedFloatingActionButton extendedFloatingActionButton) {
        this.f12525a = extendedFloatingActionButton;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final int getHeight() {
        return this.f12525a.getMeasuredHeight();
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final int getPaddingEnd() {
        return this.f12525a.A;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final int getPaddingStart() {
        return this.f12525a.f12496z;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
    public final int getWidth() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f12525a;
        return (extendedFloatingActionButton.getMeasuredWidth() - (extendedFloatingActionButton.getCollapsedPadding() * 2)) + extendedFloatingActionButton.f12496z + extendedFloatingActionButton.A;
    }
}
