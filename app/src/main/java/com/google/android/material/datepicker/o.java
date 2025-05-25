package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f12441a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f12442b;

    public o(MaterialCalendar materialCalendar, x xVar) {
        this.f12442b = materialCalendar;
        this.f12441a = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f12442b;
        int Y0 = ((LinearLayoutManager) materialCalendar.f12387h0.getLayoutManager()).Y0() + 1;
        if (Y0 < materialCalendar.f12387h0.getAdapter().getItemCount()) {
            Calendar c = d0.c(this.f12441a.f12480d.f12396a.f12465a);
            c.add(2, Y0);
            materialCalendar.q0(new u(c));
        }
    }
}
