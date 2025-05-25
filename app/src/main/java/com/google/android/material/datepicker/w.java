package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Iterator;

/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes2.dex */
public final class w implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f12478a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f12479b;

    public w(x xVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f12479b = xVar;
        this.f12478a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        boolean z10;
        MaterialCalendarGridView materialCalendarGridView = this.f12478a;
        v adapter2 = materialCalendarGridView.getAdapter2();
        if (i10 >= adapter2.b() && i10 <= (adapter2.b() + adapter2.f12473a.f12468e) - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            MaterialCalendar.d dVar = this.f12479b.f12483g;
            long longValue = materialCalendarGridView.getAdapter2().getItem(i10).longValue();
            MaterialCalendar materialCalendar = MaterialCalendar.this;
            if (materialCalendar.f12381b0.c.c(longValue)) {
                materialCalendar.f12380a0.r();
                Iterator it = materialCalendar.Y.iterator();
                while (it.hasNext()) {
                    ((y) it.next()).a(materialCalendar.f12380a0.q());
                }
                materialCalendar.f12387h0.getAdapter().notifyDataSetChanged();
                RecyclerView recyclerView = materialCalendar.f12386g0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }
}
