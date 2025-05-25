package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.m f4390a;

    /* renamed from: b  reason: collision with root package name */
    public int f4391b = SlideAtom.USES_MASTER_SLIDE_ID;
    public final Rect c = new Rect();

    public a0(RecyclerView.m mVar) {
        this.f4390a = mVar;
    }

    public static a0 a(RecyclerView.m mVar, int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return new z(mVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new y(mVar);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public final int m() {
        if (Integer.MIN_VALUE == this.f4391b) {
            return 0;
        }
        return l() - this.f4391b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i10);
}
