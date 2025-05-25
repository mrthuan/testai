package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;

/* compiled from: PagerSnapHelper.java */
/* loaded from: classes.dex */
public class c0 extends i0 {
    public z c;

    /* renamed from: d  reason: collision with root package name */
    public y f4398d;

    public static int e(View view, a0 a0Var) {
        return ((a0Var.c(view) / 2) + a0Var.e(view)) - ((a0Var.l() / 2) + a0Var.k());
    }

    public static View f(RecyclerView.m mVar, a0 a0Var) {
        int I = mVar.I();
        View view = null;
        if (I == 0) {
            return null;
        }
        int l10 = (a0Var.l() / 2) + a0Var.k();
        int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i11 = 0; i11 < I; i11++) {
            View H = mVar.H(i11);
            int abs = Math.abs(((a0Var.c(H) / 2) + a0Var.e(H)) - l10);
            if (abs < i10) {
                view = H;
                i10 = abs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.i0
    public final int[] b(RecyclerView.m mVar, View view) {
        int[] iArr = new int[2];
        if (mVar.p()) {
            iArr[0] = e(view, g(mVar));
        } else {
            iArr[0] = 0;
        }
        if (mVar.q()) {
            iArr[1] = e(view, h(mVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.i0
    public View c(RecyclerView.m mVar) {
        if (mVar.q()) {
            return f(mVar, h(mVar));
        }
        if (mVar.p()) {
            return f(mVar, g(mVar));
        }
        return null;
    }

    public final a0 g(RecyclerView.m mVar) {
        y yVar = this.f4398d;
        if (yVar == null || yVar.f4390a != mVar) {
            this.f4398d = new y(mVar);
        }
        return this.f4398d;
    }

    public final a0 h(RecyclerView.m mVar) {
        z zVar = this.c;
        if (zVar == null || zVar.f4390a != mVar) {
            this.c = new z(mVar);
        }
        return this.c;
    }
}
