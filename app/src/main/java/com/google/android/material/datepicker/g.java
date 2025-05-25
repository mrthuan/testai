package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: DaysOfWeekAdapter.java */
/* loaded from: classes2.dex */
public final class g extends BaseAdapter {

    /* renamed from: d  reason: collision with root package name */
    public static final int f12428d;

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f12429a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12430b;
    public final int c;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 26) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        f12428d = i10;
    }

    public g() {
        Calendar e10 = d0.e(null);
        this.f12429a = e10;
        this.f12430b = e10.getMaximum(7);
        this.c = e10.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f12430b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        int i11 = this.f12430b;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.c;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) androidx.activity.f.i(viewGroup, R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i11 = i10 + this.c;
        int i12 = this.f12430b;
        if (i11 > i12) {
            i11 -= i12;
        }
        Calendar calendar = this.f12429a;
        calendar.set(7, i11);
        textView.setText(calendar.getDisplayName(7, f12428d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.arg_res_0x7f130282), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public g(int i10) {
        Calendar e10 = d0.e(null);
        this.f12429a = e10;
        this.f12430b = e10.getMaximum(7);
        this.c = i10;
    }
}
