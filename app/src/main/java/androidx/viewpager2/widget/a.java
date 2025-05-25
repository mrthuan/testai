package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: CompositeOnPageChangeCallback.java */
/* loaded from: classes.dex */
public final class a extends ViewPager2.g {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f4852a = new ArrayList(3);

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void a(int i10) {
        try {
            Iterator it = this.f4852a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.g) it.next()).a(i10);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void b(int i10, float f10, int i11) {
        try {
            Iterator it = this.f4852a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.g) it.next()).b(i10, f10, i11);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void c(int i10) {
        try {
            Iterator it = this.f4852a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.g) it.next()).c(i10);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }
}
