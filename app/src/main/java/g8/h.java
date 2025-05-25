package g8;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ViewOffsetBehavior.java */
/* loaded from: classes2.dex */
public class h<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public i f17691a;

    /* renamed from: b  reason: collision with root package name */
    public int f17692b;

    public h() {
        this.f17692b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        u(coordinatorLayout, v10, i10);
        if (this.f17691a == null) {
            this.f17691a = new i(v10);
        }
        i iVar = this.f17691a;
        View view = iVar.f17693a;
        iVar.f17694b = view.getTop();
        iVar.c = view.getLeft();
        this.f17691a.a();
        int i11 = this.f17692b;
        if (i11 != 0) {
            this.f17691a.b(i11);
            this.f17692b = 0;
            return true;
        }
        return true;
    }

    public final int s() {
        i iVar = this.f17691a;
        if (iVar != null) {
            return iVar.f17695d;
        }
        return 0;
    }

    public int t() {
        return s();
    }

    public void u(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        coordinatorLayout.u(v10, i10);
    }

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17692b = 0;
    }
}
