package l;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f20352a;

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class a extends androidx.activity.s {
        public a() {
        }

        @Override // x0.o0
        public final void a() {
            i iVar = i.this;
            iVar.f20352a.f20314v.setAlpha(1.0f);
            f fVar = iVar.f20352a;
            fVar.f20317y.d(null);
            fVar.f20317y = null;
        }

        @Override // androidx.activity.s, x0.o0
        public final void f() {
            i.this.f20352a.f20314v.setVisibility(0);
        }
    }

    public i(f fVar) {
        this.f20352a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r5 = this;
            l.f r0 = r5.f20352a
            android.widget.PopupWindow r1 = r0.f20315w
            androidx.appcompat.widget.ActionBarContextView r2 = r0.f20314v
            r3 = 55
            r4 = 0
            r1.showAtLocation(r2, r3, r4, r4)
            x0.n0 r1 = r0.f20317y
            if (r1 == 0) goto L13
            r1.b()
        L13:
            boolean r1 = r0.A
            if (r1 == 0) goto L25
            android.view.ViewGroup r1 = r0.B
            if (r1 == 0) goto L25
            java.util.WeakHashMap<android.view.View, x0.n0> r2 = x0.f0.f31435a
            boolean r1 = x0.f0.g.c(r1)
            if (r1 == 0) goto L25
            r1 = 1
            goto L26
        L25:
            r1 = r4
        L26:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L44
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f20314v
            r3 = 0
            r1.setAlpha(r3)
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f20314v
            x0.n0 r1 = x0.f0.a(r1)
            r1.a(r2)
            r0.f20317y = r1
            l.i$a r0 = new l.i$a
            r0.<init>()
            r1.d(r0)
            goto L4e
        L44:
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f20314v
            r1.setAlpha(r2)
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f20314v
            r0.setVisibility(r4)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.i.run():void");
    }
}
