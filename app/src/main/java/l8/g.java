package l8;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import x0.r0;
import x0.s0;

/* compiled from: InsetsAnimationCallback.java */
/* loaded from: classes2.dex */
public final class g extends r0.b {
    public final View c;

    /* renamed from: d  reason: collision with root package name */
    public int f20533d;

    /* renamed from: e  reason: collision with root package name */
    public int f20534e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f20535f = new int[2];

    public g(View view) {
        this.c = view;
    }

    @Override // x0.r0.b
    public final s0 a(s0 s0Var, List<r0> list) {
        Iterator<r0> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r0 next = it.next();
            if ((next.f31474a.c() & 8) != 0) {
                int i10 = this.f20534e;
                this.c.setTranslationY(f8.b.b(next.f31474a.b(), i10, 0));
                break;
            }
        }
        return s0Var;
    }
}
