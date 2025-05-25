package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;

/* compiled from: YearGridAdapter.java */
/* loaded from: classes2.dex */
public final class e0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12424a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f0 f12425b;

    public e0(f0 f0Var, int i10) {
        this.f12425b = f0Var;
        this.f12424a = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f0 f0Var = this.f12425b;
        u a10 = u.a(this.f12424a, f0Var.f12426d.f12383d0.f12466b);
        MaterialCalendar<?> materialCalendar = f0Var.f12426d;
        a aVar = materialCalendar.f12381b0;
        u uVar = aVar.f12396a;
        Calendar calendar = uVar.f12465a;
        Calendar calendar2 = a10.f12465a;
        if (calendar2.compareTo(calendar) < 0) {
            a10 = uVar;
        } else {
            u uVar2 = aVar.f12397b;
            if (calendar2.compareTo(uVar2.f12465a) > 0) {
                a10 = uVar2;
            }
        }
        materialCalendar.q0(a10);
        materialCalendar.r0(MaterialCalendar.CalendarSelector.DAY);
    }
}
