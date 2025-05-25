package x0;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: ViewGroup.kt */
/* loaded from: classes.dex */
public final class j0 implements Iterator<View>, dg.a {

    /* renamed from: a  reason: collision with root package name */
    public int f31457a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f31458b;

    public j0(ViewGroup viewGroup) {
        this.f31458b = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f31457a < this.f31458b.getChildCount()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final View next() {
        int i10 = this.f31457a;
        this.f31457a = i10 + 1;
        View childAt = this.f31458b.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10 = this.f31457a - 1;
        this.f31457a = i10;
        this.f31458b.removeViewAt(i10);
    }
}
