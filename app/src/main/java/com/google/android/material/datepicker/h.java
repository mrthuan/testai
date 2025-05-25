package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f12431a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f12432b;

    public h(MaterialCalendar materialCalendar, x xVar) {
        this.f12432b = materialCalendar;
        this.f12431a = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f12432b;
        int Z0 = ((LinearLayoutManager) materialCalendar.f12387h0.getLayoutManager()).Z0() - 1;
        if (Z0 >= 0) {
            Calendar c = d0.c(this.f12431a.f12480d.f12396a.f12465a);
            c.add(2, Z0);
            materialCalendar.q0(new u(c));
        }
    }
}
