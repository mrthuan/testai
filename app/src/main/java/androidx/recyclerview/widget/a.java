package androidx.recyclerview.widget;

import androidx.recyclerview.widget.x;
import java.util.ArrayList;

/* compiled from: AdapterHelper.java */
/* loaded from: classes.dex */
public final class a implements x.a {

    /* renamed from: d  reason: collision with root package name */
    public final InterfaceC0023a f4384d;

    /* renamed from: a  reason: collision with root package name */
    public final com.android.billingclient.api.b0 f4382a = new com.android.billingclient.api.b0(30);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f4383b = new ArrayList<>();
    public final ArrayList<b> c = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public int f4386f = 0;

    /* renamed from: e  reason: collision with root package name */
    public final x f4385e = new x(this);

    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0023a {
    }

    /* compiled from: AdapterHelper.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f4387a;

        /* renamed from: b  reason: collision with root package name */
        public int f4388b;
        public Object c;

        /* renamed from: d  reason: collision with root package name */
        public int f4389d;

        public b(int i10, Object obj, int i11, int i12) {
            this.f4387a = i10;
            this.f4388b = i11;
            this.f4389d = i12;
            this.c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f4387a;
            if (i10 != bVar.f4387a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f4389d - this.f4388b) == 1 && this.f4389d == bVar.f4388b && this.f4388b == bVar.f4389d) {
                return true;
            }
            if (this.f4389d != bVar.f4389d || this.f4388b != bVar.f4388b) {
                return false;
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.c)) {
                    return false;
                }
            } else if (bVar.c != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f4387a * 31) + this.f4388b) * 31) + this.f4389d;
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append("[");
            int i10 = this.f4387a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 8) {
                            str = "??";
                        } else {
                            str = "mv";
                        }
                    } else {
                        str = "up";
                    }
                } else {
                    str = "rm";
                }
            } else {
                str = "add";
            }
            sb2.append(str);
            sb2.append(",s:");
            sb2.append(this.f4388b);
            sb2.append("c:");
            sb2.append(this.f4389d);
            sb2.append(",p:");
            sb2.append(this.c);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public a(e0 e0Var) {
        this.f4384d = e0Var;
    }

    public final boolean a(int i10) {
        ArrayList<b> arrayList = this.c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = arrayList.get(i11);
            int i12 = bVar.f4387a;
            if (i12 == 8) {
                if (f(bVar.f4389d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f4388b;
                int i14 = bVar.f4389d + i13;
                while (i13 < i14) {
                    if (f(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<b> arrayList = this.c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e0) this.f4384d).a(arrayList.get(i10));
        }
        l(arrayList);
        this.f4386f = 0;
    }

    public final void c() {
        b();
        ArrayList<b> arrayList = this.f4383b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = arrayList.get(i10);
            int i11 = bVar.f4387a;
            InterfaceC0023a interfaceC0023a = this.f4384d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            e0 e0Var = (e0) interfaceC0023a;
                            e0Var.a(bVar);
                            e0Var.e(bVar.f4388b, bVar.f4389d);
                        }
                    } else {
                        e0 e0Var2 = (e0) interfaceC0023a;
                        e0Var2.a(bVar);
                        e0Var2.c(bVar.f4388b, bVar.f4389d, bVar.c);
                    }
                } else {
                    e0 e0Var3 = (e0) interfaceC0023a;
                    e0Var3.a(bVar);
                    int i12 = bVar.f4388b;
                    int i13 = bVar.f4389d;
                    RecyclerView recyclerView = e0Var3.f4415a;
                    recyclerView.d0(i12, i13, true);
                    recyclerView.f4235k0 = true;
                    recyclerView.f4229h0.c += i13;
                }
            } else {
                e0 e0Var4 = (e0) interfaceC0023a;
                e0Var4.a(bVar);
                e0Var4.d(bVar.f4388b, bVar.f4389d);
            }
        }
        l(arrayList);
        this.f4386f = 0;
    }

    public final void d(b bVar) {
        int i10;
        com.android.billingclient.api.b0 b0Var;
        boolean z10;
        int i11 = bVar.f4387a;
        if (i11 != 1 && i11 != 8) {
            int m10 = m(bVar.f4388b, i11);
            int i12 = bVar.f4388b;
            int i13 = bVar.f4387a;
            if (i13 != 2) {
                if (i13 == 4) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + bVar);
                }
            } else {
                i10 = 0;
            }
            int i14 = 1;
            int i15 = 1;
            while (true) {
                int i16 = bVar.f4389d;
                b0Var = this.f4382a;
                if (i14 >= i16) {
                    break;
                }
                int m11 = m((i10 * i14) + bVar.f4388b, bVar.f4387a);
                int i17 = bVar.f4387a;
                if (i17 == 2 ? m11 == m10 : !(i17 != 4 || m11 != m10 + 1)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i15++;
                } else {
                    b h10 = h(i17, bVar.c, m10, i15);
                    e(h10, i12);
                    h10.c = null;
                    b0Var.a(h10);
                    if (bVar.f4387a == 4) {
                        i12 += i15;
                    }
                    i15 = 1;
                    m10 = m11;
                }
                i14++;
            }
            Object obj = bVar.c;
            bVar.c = null;
            b0Var.a(bVar);
            if (i15 > 0) {
                b h11 = h(bVar.f4387a, obj, m10, i15);
                e(h11, i12);
                h11.c = null;
                b0Var.a(h11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public final void e(b bVar, int i10) {
        e0 e0Var = (e0) this.f4384d;
        e0Var.a(bVar);
        int i11 = bVar.f4387a;
        if (i11 != 2) {
            if (i11 == 4) {
                e0Var.c(i10, bVar.f4389d, bVar.c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i12 = bVar.f4389d;
        RecyclerView recyclerView = e0Var.f4415a;
        recyclerView.d0(i10, i12, true);
        recyclerView.f4235k0 = true;
        recyclerView.f4229h0.c += i12;
    }

    public final int f(int i10, int i11) {
        ArrayList<b> arrayList = this.c;
        int size = arrayList.size();
        while (i11 < size) {
            b bVar = arrayList.get(i11);
            int i12 = bVar.f4387a;
            if (i12 == 8) {
                int i13 = bVar.f4388b;
                if (i13 == i10) {
                    i10 = bVar.f4389d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f4389d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f4388b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f4389d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f4389d;
                }
            }
            i11++;
        }
        return i10;
    }

    public final boolean g() {
        if (this.f4383b.size() > 0) {
            return true;
        }
        return false;
    }

    public final b h(int i10, Object obj, int i11, int i12) {
        b bVar = (b) this.f4382a.b();
        if (bVar == null) {
            return new b(i10, obj, i11, i12);
        }
        bVar.f4387a = i10;
        bVar.f4388b = i11;
        bVar.f4389d = i12;
        bVar.c = obj;
        return bVar;
    }

    public final void i(b bVar) {
        this.c.add(bVar);
        int i10 = bVar.f4387a;
        InterfaceC0023a interfaceC0023a = this.f4384d;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        ((e0) interfaceC0023a).e(bVar.f4388b, bVar.f4389d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + bVar);
                }
                ((e0) interfaceC0023a).c(bVar.f4388b, bVar.f4389d, bVar.c);
                return;
            }
            int i11 = bVar.f4388b;
            int i12 = bVar.f4389d;
            RecyclerView recyclerView = ((e0) interfaceC0023a).f4415a;
            recyclerView.d0(i11, i12, false);
            recyclerView.f4235k0 = true;
            return;
        }
        ((e0) interfaceC0023a).d(bVar.f4388b, bVar.f4389d);
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.j():void");
    }

    public final void k(b bVar) {
        bVar.c = null;
        this.f4382a.a(bVar);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k((b) arrayList.get(i10));
        }
        arrayList.clear();
    }

    public final int m(int i10, int i11) {
        int i12;
        int i13;
        ArrayList<b> arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = arrayList.get(size);
            int i14 = bVar.f4387a;
            if (i14 == 8) {
                int i15 = bVar.f4388b;
                int i16 = bVar.f4389d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 >= i13 && i10 <= i12) {
                    if (i13 == i15) {
                        if (i11 == 1) {
                            bVar.f4389d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f4389d = i16 - 1;
                        }
                        i10++;
                    } else {
                        if (i11 == 1) {
                            bVar.f4388b = i15 + 1;
                        } else if (i11 == 2) {
                            bVar.f4388b = i15 - 1;
                        }
                        i10--;
                    }
                } else if (i10 < i15) {
                    if (i11 == 1) {
                        bVar.f4388b = i15 + 1;
                        bVar.f4389d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f4388b = i15 - 1;
                        bVar.f4389d = i16 - 1;
                    }
                }
            } else {
                int i17 = bVar.f4388b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f4389d;
                    } else if (i14 == 2) {
                        i10 += bVar.f4389d;
                    }
                } else if (i11 == 1) {
                    bVar.f4388b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f4388b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            b bVar2 = arrayList.get(size2);
            if (bVar2.f4387a == 8) {
                int i18 = bVar2.f4389d;
                if (i18 == bVar2.f4388b || i18 < 0) {
                    arrayList.remove(size2);
                    k(bVar2);
                }
            } else if (bVar2.f4389d <= 0) {
                arrayList.remove(size2);
                k(bVar2);
            }
        }
        return i10;
    }
}
