package com.google.android.material.datepicker;

import android.os.Build;
import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class m extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f12438a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f12439b;
    public final /* synthetic */ MaterialCalendar c;

    public m(MaterialCalendar materialCalendar, x xVar, MaterialButton materialButton) {
        this.c = materialCalendar;
        this.f12438a = xVar;
        this.f12439b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(int i10, RecyclerView recyclerView) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f12439b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int Z0;
        String formatDateTime;
        MaterialCalendar materialCalendar = this.c;
        if (i10 < 0) {
            Z0 = ((LinearLayoutManager) materialCalendar.f12387h0.getLayoutManager()).Y0();
        } else {
            Z0 = ((LinearLayoutManager) materialCalendar.f12387h0.getLayoutManager()).Z0();
        }
        x xVar = this.f12438a;
        Calendar c = d0.c(xVar.f12480d.f12396a.f12465a);
        c.add(2, Z0);
        materialCalendar.f12383d0 = new u(c);
        Calendar c10 = d0.c(xVar.f12480d.f12396a.f12465a);
        c10.add(2, Z0);
        c10.set(5, 1);
        Calendar c11 = d0.c(c10);
        c11.get(2);
        c11.get(1);
        c11.getMaximum(7);
        c11.getActualMaximum(5);
        c11.getTimeInMillis();
        long timeInMillis = c11.getTimeInMillis();
        if (Build.VERSION.SDK_INT >= 24) {
            formatDateTime = d0.b("yMMMM", Locale.getDefault()).format(new Date(timeInMillis));
        } else {
            formatDateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        this.f12439b.setText(formatDateTime);
    }
}
