package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck.java */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f4466a;

    /* renamed from: b  reason: collision with root package name */
    public final a f4467b = new a();

    /* compiled from: ViewBoundsCheck.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f4468a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f4469b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f4470d;

        /* renamed from: e  reason: collision with root package name */
        public int f4471e;

        public final boolean a() {
            int i10;
            int i11;
            int i12;
            int i13 = this.f4468a;
            int i14 = 2;
            if ((i13 & 7) != 0) {
                int i15 = this.f4470d;
                int i16 = this.f4469b;
                if (i15 > i16) {
                    i12 = 1;
                } else if (i15 == i16) {
                    i12 = 2;
                } else {
                    i12 = 4;
                }
                if (((i12 << 0) & i13) == 0) {
                    return false;
                }
            }
            if ((i13 & 112) != 0) {
                int i17 = this.f4470d;
                int i18 = this.c;
                if (i17 > i18) {
                    i11 = 1;
                } else if (i17 == i18) {
                    i11 = 2;
                } else {
                    i11 = 4;
                }
                if (((i11 << 4) & i13) == 0) {
                    return false;
                }
            }
            if ((i13 & 1792) != 0) {
                int i19 = this.f4471e;
                int i20 = this.f4469b;
                if (i19 > i20) {
                    i10 = 1;
                } else if (i19 == i20) {
                    i10 = 2;
                } else {
                    i10 = 4;
                }
                if (((i10 << 8) & i13) == 0) {
                    return false;
                }
            }
            if ((i13 & 28672) != 0) {
                int i21 = this.f4471e;
                int i22 = this.c;
                if (i21 > i22) {
                    i14 = 1;
                } else if (i21 != i22) {
                    i14 = 4;
                }
                if ((i13 & (i14 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: ViewBoundsCheck.java */
    /* loaded from: classes.dex */
    public interface b {
        int a(View view);

        int b();

        int c();

        View d(int i10);

        int e(View view);
    }

    public j0(b bVar) {
        this.f4466a = bVar;
    }

    public final View a(int i10, int i11, int i12, int i13) {
        int i14;
        b bVar = this.f4466a;
        int b10 = bVar.b();
        int c = bVar.c();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View d10 = bVar.d(i10);
            int a10 = bVar.a(d10);
            int e10 = bVar.e(d10);
            a aVar = this.f4467b;
            aVar.f4469b = b10;
            aVar.c = c;
            aVar.f4470d = a10;
            aVar.f4471e = e10;
            if (i12 != 0) {
                aVar.f4468a = i12 | 0;
                if (aVar.a()) {
                    return d10;
                }
            }
            if (i13 != 0) {
                aVar.f4468a = i13 | 0;
                if (aVar.a()) {
                    view = d10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public final boolean b(View view) {
        b bVar = this.f4466a;
        int b10 = bVar.b();
        int c = bVar.c();
        int a10 = bVar.a(view);
        int e10 = bVar.e(view);
        a aVar = this.f4467b;
        aVar.f4469b = b10;
        aVar.c = c;
        aVar.f4470d = a10;
        aVar.f4471e = e10;
        aVar.f4468a = 24579 | 0;
        return aVar.a();
    }
}
