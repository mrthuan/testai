package com.google.android.material.datepicker;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Locale;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: YearGridAdapter.java */
/* loaded from: classes2.dex */
public final class f0 extends RecyclerView.Adapter<a> {

    /* renamed from: d  reason: collision with root package name */
    public final MaterialCalendar<?> f12426d;

    /* compiled from: YearGridAdapter.java */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final TextView f12427b;

        public a(TextView textView) {
            super(textView);
            this.f12427b = textView;
        }
    }

    public f0(MaterialCalendar<?> materialCalendar) {
        this.f12426d = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f12426d.f12381b0.f12400f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i10) {
        String format;
        b bVar;
        a aVar2 = aVar;
        MaterialCalendar<?> materialCalendar = this.f12426d;
        int i11 = materialCalendar.f12381b0.f12396a.c + i10;
        aVar2.f12427b.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
        TextView textView = aVar2.f12427b;
        Context context = textView.getContext();
        if (d0.d().get(1) == i11) {
            format = String.format(context.getString(R.string.arg_res_0x7f130288), Integer.valueOf(i11));
        } else {
            format = String.format(context.getString(R.string.arg_res_0x7f130289), Integer.valueOf(i11));
        }
        textView.setContentDescription(format);
        c cVar = materialCalendar.f12385f0;
        Calendar d10 = d0.d();
        if (d10.get(1) == i11) {
            bVar = cVar.f12417f;
        } else {
            bVar = cVar.f12415d;
        }
        for (Long l10 : materialCalendar.f12380a0.Y()) {
            d10.setTimeInMillis(l10.longValue());
            if (d10.get(1) == i11) {
                bVar = cVar.f12416e;
            }
        }
        bVar.b(textView);
        textView.setOnClickListener(new e0(this, i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a((TextView) androidx.activity.f.i(viewGroup, R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
