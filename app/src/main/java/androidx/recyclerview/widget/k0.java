package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ViewInfoStore.java */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public final y.i<RecyclerView.b0, a> f4477a = new y.i<>();

    /* renamed from: b  reason: collision with root package name */
    public final y.f<RecyclerView.b0> f4478b = new y.f<>();

    /* compiled from: ViewInfoStore.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static final com.android.billingclient.api.b0 f4479d = new com.android.billingclient.api.b0(20);

        /* renamed from: a  reason: collision with root package name */
        public int f4480a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.j.c f4481b;
        public RecyclerView.j.c c;

        public static a a() {
            a aVar = (a) f4479d.b();
            if (aVar == null) {
                return new a();
            }
            return aVar;
        }
    }

    public final void a(RecyclerView.b0 b0Var, RecyclerView.j.c cVar) {
        y.i<RecyclerView.b0, a> iVar = this.f4477a;
        a orDefault = iVar.getOrDefault(b0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            iVar.put(b0Var, orDefault);
        }
        orDefault.c = cVar;
        orDefault.f4480a |= 8;
    }

    public final RecyclerView.j.c b(RecyclerView.b0 b0Var, int i10) {
        a l10;
        RecyclerView.j.c cVar;
        y.i<RecyclerView.b0, a> iVar = this.f4477a;
        int e10 = iVar.e(b0Var);
        if (e10 >= 0 && (l10 = iVar.l(e10)) != null) {
            int i11 = l10.f4480a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                l10.f4480a = i12;
                if (i10 == 4) {
                    cVar = l10.f4481b;
                } else if (i10 == 8) {
                    cVar = l10.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    iVar.j(e10);
                    l10.f4480a = 0;
                    l10.f4481b = null;
                    l10.c = null;
                    a.f4479d.a(l10);
                }
                return cVar;
            }
        }
        return null;
    }

    public final void c(RecyclerView.b0 b0Var) {
        a orDefault = this.f4477a.getOrDefault(b0Var, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f4480a &= -2;
    }

    public final void d(RecyclerView.b0 b0Var) {
        y.f<RecyclerView.b0> fVar = this.f4478b;
        int j10 = fVar.j() - 1;
        while (true) {
            if (j10 < 0) {
                break;
            } else if (b0Var == fVar.k(j10)) {
                Object[] objArr = fVar.c;
                Object obj = objArr[j10];
                Object obj2 = y.f.f31922e;
                if (obj != obj2) {
                    objArr[j10] = obj2;
                    fVar.f31923a = true;
                }
            } else {
                j10--;
            }
        }
        a remove = this.f4477a.remove(b0Var);
        if (remove != null) {
            remove.f4480a = 0;
            remove.f4481b = null;
            remove.c = null;
            a.f4479d.a(remove);
        }
    }
}
