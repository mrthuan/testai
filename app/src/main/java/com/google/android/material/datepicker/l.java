package com.google.android.material.datepicker;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class l extends x0.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f12437d;

    public l(MaterialCalendar materialCalendar) {
        this.f12437d = materialCalendar;
    }

    @Override // x0.a
    public final void d(View view, y0.f fVar) {
        String x4;
        this.f31416a.onInitializeAccessibilityNodeInfo(view, fVar.f31951a);
        MaterialCalendar materialCalendar = this.f12437d;
        if (materialCalendar.f12391l0.getVisibility() == 0) {
            x4 = materialCalendar.x(R.string.arg_res_0x7f13029c);
        } else {
            x4 = materialCalendar.x(R.string.arg_res_0x7f13029a);
        }
        fVar.k(x4);
    }
}
