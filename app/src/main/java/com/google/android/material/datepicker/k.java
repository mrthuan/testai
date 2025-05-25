package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class k extends RecyclerView.l {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f12435a = d0.e(null);

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f12436b = d0.e(null);
    public final /* synthetic */ MaterialCalendar c;

    public k(MaterialCalendar materialCalendar) {
        this.c = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        Long l10;
        int i10;
        int width;
        if ((recyclerView.getAdapter() instanceof f0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            f0 f0Var = (f0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            MaterialCalendar materialCalendar = this.c;
            for (w0.c<Long, Long> cVar : materialCalendar.f12380a0.t()) {
                Long l11 = cVar.f30902a;
                if (l11 != null && (l10 = cVar.f30903b) != null) {
                    long longValue = l11.longValue();
                    Calendar calendar = this.f12435a;
                    calendar.setTimeInMillis(longValue);
                    long longValue2 = l10.longValue();
                    Calendar calendar2 = this.f12436b;
                    calendar2.setTimeInMillis(longValue2);
                    int i11 = calendar.get(1) - f0Var.f12426d.f12381b0.f12396a.c;
                    int i12 = calendar2.get(1) - f0Var.f12426d.f12381b0.f12396a.c;
                    View C = gridLayoutManager.C(i11);
                    View C2 = gridLayoutManager.C(i12);
                    int i13 = gridLayoutManager.F;
                    int i14 = i11 / i13;
                    int i15 = i12 / i13;
                    for (int i16 = i14; i16 <= i15; i16++) {
                        View C3 = gridLayoutManager.C(gridLayoutManager.F * i16);
                        if (C3 != null) {
                            int top = C3.getTop() + materialCalendar.f12385f0.f12415d.f12408a.top;
                            int bottom = C3.getBottom() - materialCalendar.f12385f0.f12415d.f12408a.bottom;
                            if (i16 == i14 && C != null) {
                                i10 = (C.getWidth() / 2) + C.getLeft();
                            } else {
                                i10 = 0;
                            }
                            if (i16 == i15 && C2 != null) {
                                width = (C2.getWidth() / 2) + C2.getLeft();
                            } else {
                                width = recyclerView.getWidth();
                            }
                            canvas.drawRect(i10, top, width, bottom, materialCalendar.f12385f0.f12419h);
                        }
                    }
                }
            }
        }
    }
}
