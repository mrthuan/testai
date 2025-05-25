package com.google.android.material.datepicker;

import android.view.View;
import x0.s0;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes2.dex */
public final class q implements x0.u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12459a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f12460b;
    public final /* synthetic */ int c;

    public q(int i10, View view, int i11) {
        this.f12459a = i10;
        this.f12460b = view;
        this.c = i11;
    }

    @Override // x0.u
    public final s0 m(View view, s0 s0Var) {
        int i10 = s0Var.a(7).f22640b;
        View view2 = this.f12460b;
        int i11 = this.f12459a;
        if (i11 >= 0) {
            view2.getLayoutParams().height = i11 + i10;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.c + i10, view2.getPaddingRight(), view2.getPaddingBottom());
        return s0Var;
    }
}
