package com.google.android.material.datepicker;

import android.view.View;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes2.dex */
public final class r implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f12461a;

    public r(p pVar) {
        this.f12461a = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p pVar = this.f12461a;
        pVar.K0.setEnabled(pVar.s0().U());
        pVar.I0.toggle();
        pVar.y0(pVar.I0);
        pVar.x0();
    }
}
