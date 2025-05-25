package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollbarHelper.java */
/* loaded from: classes.dex */
public final class g0 {
    public static int a(RecyclerView.y yVar, a0 a0Var, View view, View view2, RecyclerView.m mVar, boolean z10) {
        if (mVar.I() != 0 && yVar.b() != 0 && view != null && view2 != null) {
            if (!z10) {
                return Math.abs(RecyclerView.m.P(view) - RecyclerView.m.P(view2)) + 1;
            }
            return Math.min(a0Var.l(), a0Var.b(view2) - a0Var.e(view));
        }
        return 0;
    }

    public static int b(RecyclerView.y yVar, a0 a0Var, View view, View view2, RecyclerView.m mVar, boolean z10, boolean z11) {
        int max;
        if (mVar.I() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(RecyclerView.m.P(view), RecyclerView.m.P(view2));
        int max2 = Math.max(RecyclerView.m.P(view), RecyclerView.m.P(view2));
        if (z11) {
            max = Math.max(0, (yVar.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z10) {
            return max;
        }
        return Math.round((max * (Math.abs(a0Var.b(view2) - a0Var.e(view)) / (Math.abs(RecyclerView.m.P(view) - RecyclerView.m.P(view2)) + 1))) + (a0Var.k() - a0Var.e(view)));
    }

    public static int c(RecyclerView.y yVar, a0 a0Var, View view, View view2, RecyclerView.m mVar, boolean z10) {
        if (mVar.I() != 0 && yVar.b() != 0 && view != null && view2 != null) {
            if (!z10) {
                return yVar.b();
            }
            return (int) (((a0Var.b(view2) - a0Var.e(view)) / (Math.abs(RecyclerView.m.P(view) - RecyclerView.m.P(view2)) + 1)) * yVar.b());
        }
        return 0;
    }
}
