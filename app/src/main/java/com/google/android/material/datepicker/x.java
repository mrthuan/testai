package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.n0;

/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes2.dex */
public final class x extends RecyclerView.Adapter<a> {

    /* renamed from: d  reason: collision with root package name */
    public final com.google.android.material.datepicker.a f12480d;

    /* renamed from: e  reason: collision with root package name */
    public final d<?> f12481e;

    /* renamed from: f  reason: collision with root package name */
    public final f f12482f;

    /* renamed from: g  reason: collision with root package name */
    public final MaterialCalendar.d f12483g;

    /* renamed from: h  reason: collision with root package name */
    public final int f12484h;

    /* compiled from: MonthsPagerAdapter.java */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final TextView f12485b;
        public final MaterialCalendarGridView c;

        public a(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f12485b = textView;
            WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
            new x0.e0().e(textView, Boolean.TRUE);
            this.c = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z10) {
                textView.setVisibility(8);
            }
        }
    }

    public x(ContextThemeWrapper contextThemeWrapper, d dVar, com.google.android.material.datepicker.a aVar, f fVar, MaterialCalendar.c cVar) {
        int i10;
        Calendar calendar = aVar.f12396a.f12465a;
        u uVar = aVar.f12398d;
        if (calendar.compareTo(uVar.f12465a) <= 0) {
            if (uVar.f12465a.compareTo(aVar.f12397b.f12465a) <= 0) {
                int i11 = v.f12471g;
                int i12 = MaterialCalendar.f12379m0;
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i11;
                if (p.u0(contextThemeWrapper)) {
                    i10 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i10 = 0;
                }
                this.f12484h = dimensionPixelSize + i10;
                this.f12480d = aVar;
                this.f12481e = dVar;
                this.f12482f = fVar;
                this.f12483g = cVar;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f12480d.f12401g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i10) {
        Calendar c = d0.c(this.f12480d.f12396a.f12465a);
        c.add(2, i10);
        return new u(c).f12465a.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i10) {
        a aVar2 = aVar;
        com.google.android.material.datepicker.a aVar3 = this.f12480d;
        Calendar c = d0.c(aVar3.f12396a.f12465a);
        c.add(2, i10);
        u uVar = new u(c);
        aVar2.f12485b.setText(uVar.d());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar2.c.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter2() != null && uVar.equals(materialCalendarGridView.getAdapter2().f12473a)) {
            materialCalendarGridView.invalidate();
            v adapter2 = materialCalendarGridView.getAdapter2();
            for (Long l10 : adapter2.c) {
                adapter2.e(materialCalendarGridView, l10.longValue());
            }
            d<?> dVar = adapter2.f12474b;
            if (dVar != null) {
                for (Long l11 : dVar.Y()) {
                    adapter2.e(materialCalendarGridView, l11.longValue());
                }
                adapter2.c = dVar.Y();
            }
        } else {
            v vVar = new v(uVar, this.f12481e, aVar3, this.f12482f);
            materialCalendarGridView.setNumColumns(uVar.f12467d);
            materialCalendarGridView.setAdapter((ListAdapter) vVar);
        }
        materialCalendarGridView.setOnItemClickListener(new w(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) androidx.activity.f.i(viewGroup, R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (p.u0(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.n(-1, this.f12484h));
            return new a(linearLayout, true);
        }
        return new a(linearLayout, false);
    }
}
