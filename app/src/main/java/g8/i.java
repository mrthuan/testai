package g8;

import android.view.View;
import java.util.WeakHashMap;
import x0.f0;
import x0.n0;

/* compiled from: ViewOffsetHelper.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final View f17693a;

    /* renamed from: b  reason: collision with root package name */
    public int f17694b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f17695d;

    public i(View view) {
        this.f17693a = view;
    }

    public final void a() {
        int i10 = this.f17695d;
        View view = this.f17693a;
        int top = i10 - (view.getTop() - this.f17694b);
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.c));
    }

    public final boolean b(int i10) {
        if (this.f17695d != i10) {
            this.f17695d = i10;
            a();
            return true;
        }
        return false;
    }
}
