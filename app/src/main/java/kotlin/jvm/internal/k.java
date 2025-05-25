package kotlin.jvm.internal;

import cg.l;
import cg.m;
import cg.n;
import cg.o;
import cg.p;
import cg.q;
import cg.r;
import cg.s;
import cg.t;
import cg.u;
import cg.v;
import cg.w;
import java.util.List;
import java.util.Map;

/* compiled from: TypeIntrinsics.java */
/* loaded from: classes.dex */
public final class k {
    public static List a(List list) {
        if ((list instanceof dg.a) && !(list instanceof dg.c)) {
            d(list, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return list;
        } catch (ClassCastException e10) {
            g.g(k.class.getName(), e10);
            throw e10;
        }
    }

    public static Map b(Map map) {
        if (!(map instanceof dg.a)) {
            try {
                return map;
            } catch (ClassCastException e10) {
                g.g(k.class.getName(), e10);
                throw e10;
            }
        }
        d(map, "kotlin.collections.MutableMap");
        throw null;
    }

    public static void c(int i10, Object obj) {
        int i11;
        if (obj != null) {
            boolean z10 = false;
            if (obj instanceof tf.a) {
                if (obj instanceof f) {
                    i11 = ((f) obj).getArity();
                } else if (obj instanceof cg.a) {
                    i11 = 0;
                } else if (obj instanceof l) {
                    i11 = 1;
                } else if (obj instanceof p) {
                    i11 = 2;
                } else if (obj instanceof q) {
                    i11 = 3;
                } else if (obj instanceof r) {
                    i11 = 4;
                } else if (obj instanceof s) {
                    i11 = 5;
                } else if (obj instanceof t) {
                    i11 = 6;
                } else if (obj instanceof u) {
                    i11 = 7;
                } else if (obj instanceof v) {
                    i11 = 8;
                } else if (obj instanceof w) {
                    i11 = 9;
                } else if (obj instanceof cg.b) {
                    i11 = 10;
                } else if (obj instanceof cg.c) {
                    i11 = 11;
                } else if (obj instanceof cg.d) {
                    i11 = 12;
                } else if (obj instanceof cg.e) {
                    i11 = 13;
                } else if (obj instanceof cg.f) {
                    i11 = 14;
                } else if (obj instanceof cg.g) {
                    i11 = 15;
                } else if (obj instanceof cg.h) {
                    i11 = 16;
                } else if (obj instanceof cg.i) {
                    i11 = 17;
                } else if (obj instanceof cg.j) {
                    i11 = 18;
                } else if (obj instanceof cg.k) {
                    i11 = 19;
                } else if (obj instanceof m) {
                    i11 = 20;
                } else if (obj instanceof n) {
                    i11 = 21;
                } else if (obj instanceof o) {
                    i11 = 22;
                } else {
                    i11 = -1;
                }
                if (i11 == i10) {
                    z10 = true;
                }
            }
            if (!z10) {
                d(obj, "kotlin.jvm.functions.Function" + i10);
                throw null;
            }
        }
    }

    public static void d(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(androidx.activity.f.m(name, " cannot be cast to ", str));
        g.g(k.class.getName(), classCastException);
        throw classCastException;
    }
}
