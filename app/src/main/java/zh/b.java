package zh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import lib.zj.office.fc.hssf.record.chart.AreaFormatRecord;
import lib.zj.office.fc.hssf.record.chart.DataFormatRecord;
import lib.zj.office.fc.hssf.record.chart.SeriesLabelsRecord;
import lib.zj.office.fc.hssf.record.chart.SeriesRecord;
import lib.zj.office.fc.hssf.record.chart.SeriesTextRecord;
import lib.zj.office.fc.hssf.record.chart.UnitsRecord;

/* compiled from: AttrManage.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final b f32374b = new b();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<l> f32375a = new ArrayList<>();

    public static void A(f fVar, boolean z10) {
        ((c) fVar).e(z10 ? 1 : 0, (short) 6);
    }

    public static void B(f fVar, int i10) {
        ((c) fVar).e(i10, (short) 8);
    }

    public static void C(f fVar, int i10) {
        ((c) fVar).e(i10, (short) 9);
    }

    public static void D(f fVar, int i10) {
        ((c) fVar).e(i10, (short) 12);
    }

    public static void E(f fVar, int i10) {
        ((c) fVar).e(i10, (short) 8193);
    }

    public static void F(f fVar, int i10) {
        ((c) fVar).e(i10, (short) 8197);
    }

    public static void G(f fVar, int i10) {
        ((c) fVar).e(i10, (short) 8194);
    }

    public static void H(f fVar, int i10) {
        ((c) fVar).e(i10, (short) 8195);
    }

    public static void I(f fVar, int i10) {
        ((c) fVar).e(i10, (short) 8196);
    }

    public static void J(f fVar, byte b10) {
        ((c) fVar).e(b10, (short) 8198);
    }

    public static void K(f fVar, int i10) {
        ((c) fVar).e(i10, (short) 8192);
    }

    public static void L(f fVar, int i10) {
        ((c) fVar).e(i10, (short) 4101);
    }

    public static void M(f fVar, int i10) {
        ((c) fVar).e(i10, (short) 4100);
    }

    public static void N(f fVar, int i10) {
        ((c) fVar).e(i10, DataFormatRecord.sid);
    }

    public static void O(f fVar, int i10) {
        ((c) fVar).e(i10, UnitsRecord.sid);
    }

    public static void P(f fVar, float f10) {
        ((c) fVar).e((int) (f10 * 100.0f), (short) 4105);
    }

    public static void Q(f fVar, int i10) {
        ((c) fVar).e(i10, AreaFormatRecord.sid);
    }

    public static void R(f fVar, int i10) {
        ((c) fVar).e(i10, (short) 4104);
    }

    public static void S(f fVar, int i10) {
        ((c) fVar).e(i10, (short) 13);
    }

    public static void a(ai.b bVar, f fVar, f fVar2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10 = 0;
        bVar.f499h = 0;
        int i11 = -1;
        bVar.f495d = -1;
        bVar.f500i = -1;
        bVar.f501j = false;
        bVar.f502k = false;
        bVar.f503l = (short) 0;
        bVar.f494b = -1;
        bVar.f506o = (byte) -1;
        bVar.f507p = (byte) -1;
        c cVar = (c) fVar2;
        int b10 = cVar.b((short) 2, true);
        if (b10 == Integer.MIN_VALUE && (b10 = ((c) fVar).b((short) 2, true)) == Integer.MIN_VALUE) {
            b10 = -1;
        }
        bVar.f494b = b10;
        bVar.f493a = g(fVar, fVar2);
        int b11 = cVar.b((short) 14, true);
        if (b11 == Integer.MIN_VALUE && (b11 = ((c) fVar).b((short) 14, true)) == Integer.MIN_VALUE) {
            b11 = 100;
        }
        bVar.c = b11;
        bVar.f495d = f(fVar, fVar2);
        int b12 = cVar.b((short) 4, true);
        if ((b12 != Integer.MIN_VALUE || (b12 = ((c) fVar).b((short) 4, true)) != Integer.MIN_VALUE) && b12 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.f496e = z10;
        int b13 = cVar.b((short) 17, true);
        if ((b13 != Integer.MIN_VALUE || (b13 = ((c) fVar).b((short) 17, true)) != Integer.MIN_VALUE) && b13 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        bVar.f497f = z11;
        int b14 = cVar.b((short) 5, true);
        if ((b14 != Integer.MIN_VALUE || (b14 = ((c) fVar).b((short) 5, true)) != Integer.MIN_VALUE) && b14 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        bVar.f498g = z12;
        int b15 = cVar.b((short) 6, true);
        if ((b15 != Integer.MIN_VALUE || (b15 = ((c) fVar).b((short) 6, true)) != Integer.MIN_VALUE) && b15 == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        bVar.f501j = z13;
        int b16 = cVar.b((short) 7, true);
        if ((b16 != Integer.MIN_VALUE || (b16 = ((c) fVar).b((short) 7, true)) != Integer.MIN_VALUE) && b16 == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        bVar.f502k = z14;
        bVar.f499h = h(fVar, fVar2);
        bVar.f500i = i(fVar, fVar2);
        c cVar2 = (c) fVar2;
        int b17 = cVar2.b((short) 10, true);
        if (b17 == Integer.MIN_VALUE) {
            int b18 = ((c) fVar).b((short) 10, true);
            if (b18 != Integer.MIN_VALUE) {
                i10 = b18;
            }
        } else {
            i10 = b17;
        }
        bVar.f503l = (short) i10;
        int b19 = cVar2.b((short) 11, true);
        if (b19 == Integer.MIN_VALUE && (b19 = ((c) fVar).b((short) 11, true)) == Integer.MIN_VALUE) {
            b19 = -1;
        }
        bVar.f504m = b19;
        int b20 = cVar2.b((short) 16, true);
        if (b20 == Integer.MIN_VALUE) {
            b20 = -1;
        }
        bVar.f506o = (byte) b20;
        int b21 = cVar2.b((short) 15, true);
        if (b21 == Integer.MIN_VALUE) {
            int b22 = ((c) fVar).b((short) 15, true);
            if (b22 != Integer.MIN_VALUE) {
                i11 = b22;
            }
        } else {
            i11 = b21;
        }
        bVar.f507p = (byte) i11;
    }

    public static void c(ai.f fVar, f fVar2) {
        fVar.a();
        fVar.f514g = o(fVar2);
        fVar.f515h = l(fVar2);
        fVar.f509a = (int) (p(fVar2) * 0.06666667f);
        fVar.f510b = (int) (k(fVar2) * 0.06666667f);
        c cVar = (c) fVar2;
        int b10 = cVar.b((short) 8196, true);
        int i10 = 1440;
        if (b10 == Integer.MIN_VALUE) {
            b10 = 1440;
        }
        fVar.c = (int) (b10 * 0.06666667f);
        int b11 = cVar.b((short) 8197, true);
        if (b11 != Integer.MIN_VALUE) {
            i10 = b11;
        }
        fVar.f511d = (int) (i10 * 0.06666667f);
        fVar.f513f = (int) (n(fVar2) * 0.06666667f);
        fVar.f512e = (int) (m(fVar2) * 0.06666667f);
        int b12 = cVar.b((short) 8199, true);
        int i11 = 850;
        if (b12 == Integer.MIN_VALUE) {
            b12 = 850;
        }
        fVar.f516i = (int) (b12 * 0.06666667f);
        int b13 = cVar.b((short) 8200, true);
        if (b13 != Integer.MIN_VALUE) {
            i11 = b13;
        }
        fVar.f517j = (int) (i11 * 0.06666667f);
        int b14 = cVar.b((short) 8202, true);
        int i12 = -1;
        if (b14 == Integer.MIN_VALUE) {
            b14 = -1;
        }
        fVar.f518k = b14;
        cVar.b((short) 8203, true);
        fVar.getClass();
        int b15 = cVar.b((short) 8204, true);
        if (b15 != Integer.MIN_VALUE) {
            i12 = b15;
        }
        fVar.f519l = i12 * 0.06666667f;
    }

    public static void d(lib.zj.office.system.f fVar, ai.g gVar, f fVar2) {
        float f10;
        hh.b a10;
        int i10;
        gVar.f520a = 0;
        gVar.f521b = 0;
        gVar.c = 0;
        int i11 = -1;
        gVar.f522d = (byte) -1;
        gVar.f523e = 0.0f;
        gVar.f524f = 0;
        gVar.f525g = 0;
        gVar.f526h = (byte) 0;
        gVar.f527i = -1;
        gVar.f528j = (byte) -1;
        gVar.f529k = 0;
        gVar.f530l = -1;
        gVar.f531m = 0;
        c cVar = (c) fVar2;
        int b10 = cVar.b((short) 4111, true);
        if (b10 == Integer.MIN_VALUE) {
            b10 = -1;
        }
        gVar.f531m = (int) (b10 * 0.06666667f);
        gVar.f520a = (int) (r(fVar2) * 0.06666667f);
        int b11 = cVar.b(SeriesRecord.sid, true);
        if (b11 == Integer.MIN_VALUE) {
            b11 = 0;
        }
        gVar.f521b = (int) (b11 * 0.06666667f);
        int b12 = cVar.b((short) 4100, true);
        if (b12 == Integer.MIN_VALUE) {
            b12 = 0;
        }
        gVar.f524f = (int) (b12 * 0.06666667f);
        int b13 = cVar.b((short) 4101, true);
        if (b13 == Integer.MIN_VALUE) {
            b13 = 0;
        }
        gVar.f525g = (int) (b13 * 0.06666667f);
        int b14 = cVar.b(AreaFormatRecord.sid, true);
        if (b14 == Integer.MIN_VALUE) {
            b14 = 1;
        }
        gVar.f522d = (byte) b14;
        int b15 = cVar.b((short) 4105, true);
        if (b15 == Integer.MIN_VALUE) {
            f10 = 1.0f;
        } else {
            f10 = b15 / 100.0f;
        }
        gVar.f523e = f10;
        byte b16 = gVar.f522d;
        if (b16 == 3 || b16 == 4) {
            gVar.f523e = f10 * 0.06666667f;
        }
        gVar.f526h = (byte) q(fVar2);
        gVar.c = (int) (t(fVar2) * 0.06666667f);
        gVar.f527i = s(fVar2);
        int b17 = cVar.b(SeriesLabelsRecord.sid, true);
        if (b17 == Integer.MIN_VALUE) {
            b17 = -1;
        }
        gVar.f528j = (byte) b17;
        int b18 = cVar.b((short) 4110, true);
        if (b18 != Integer.MIN_VALUE) {
            i11 = b18;
        }
        gVar.f530l = i11;
        if (gVar.f527i >= 0 && gVar.f528j >= 0 && fVar != null) {
            hh.a aVar = (hh.a) ((LinkedHashMap) fVar.o().e().f26b).get(Integer.valueOf(gVar.f527i));
            if (aVar != null && (a10 = aVar.a(gVar.f528j)) != null) {
                int i12 = (int) (a10.f18339e * 0.06666667f);
                int i13 = ((int) (a10.f18340f * 0.06666667f)) + i12;
                gVar.f529k = i13;
                int i14 = gVar.f520a;
                if (i14 - i12 != 0 && i14 != 0) {
                    if (i14 + i13 == i12) {
                        gVar.f520a = i13;
                    }
                    int i15 = gVar.c;
                    if (i15 >= 0) {
                        gVar.f529k = i15;
                    } else {
                        gVar.f529k = 0;
                    }
                    if (i15 == 0 && (i10 = i12 - gVar.f520a) > 0) {
                        gVar.c = i15 - i10;
                        return;
                    }
                    return;
                }
                if (gVar.c == 0) {
                    gVar.c = -(i12 - i13);
                }
                int i16 = gVar.c;
                if (i16 < 0) {
                    gVar.f520a = i13;
                    gVar.f529k = 0;
                } else if (i13 > i16) {
                    gVar.c = i16 + i13;
                }
            }
        }
    }

    public static void e(ai.i iVar, f fVar) {
        c cVar = (c) fVar;
        int b10 = cVar.b((short) 12305, true);
        int i10 = 0;
        if (b10 == Integer.MIN_VALUE) {
            b10 = 0;
        }
        iVar.f538a = b10;
        int b11 = cVar.b((short) 12307, true);
        int i11 = 7;
        if (b11 == Integer.MIN_VALUE) {
            b11 = 7;
        }
        iVar.f539b = b11;
        int b12 = cVar.b((short) 12308, true);
        if (b12 != Integer.MIN_VALUE) {
            i11 = b12;
        }
        iVar.c = i11;
        f32374b.getClass();
        int b13 = cVar.b((short) 12306, true);
        if (b13 == Integer.MIN_VALUE) {
            b13 = 0;
        }
        iVar.f540d = b13;
        int b14 = cVar.b((short) 12297, true);
        if (b14 == Integer.MIN_VALUE) {
            b14 = 0;
        }
        iVar.f541e = (int) (b14 * 0.06666667f);
        int b15 = cVar.b((short) 12304, true);
        if (b15 != Integer.MIN_VALUE) {
            i10 = b15;
        }
        iVar.f542f = (byte) i10;
        int b16 = cVar.b((short) 8202, true);
        if (b16 == Integer.MIN_VALUE) {
            b16 = -1;
        }
        iVar.f543g = b16;
        int b17 = cVar.b((short) 12289, true);
        int i12 = -16777216;
        if (b17 == Integer.MIN_VALUE) {
            b17 = -16777216;
        }
        iVar.f544h = b17;
        int b18 = cVar.b((short) 12291, true);
        if (b18 == Integer.MIN_VALUE) {
            b18 = -16777216;
        }
        iVar.f545i = b18;
        int b19 = cVar.b((short) 12295, true);
        if (b19 == Integer.MIN_VALUE) {
            b19 = -16777216;
        }
        iVar.f547k = b19;
        int b20 = cVar.b((short) 12293, true);
        if (b20 != Integer.MIN_VALUE) {
            i12 = b20;
        }
        iVar.f546j = i12;
    }

    public static int f(f fVar, f fVar2) {
        int b10 = ((c) fVar2).b((short) 3, true);
        if (b10 == Integer.MIN_VALUE && (b10 = ((c) fVar).b((short) 3, true)) == Integer.MIN_VALUE) {
            return -16777216;
        }
        return b10;
    }

    public static int g(f fVar, f fVar2) {
        int b10 = ((c) fVar2).b((short) 1, true);
        if (b10 == Integer.MIN_VALUE && (b10 = ((c) fVar).b((short) 1, true)) == Integer.MIN_VALUE) {
            return 12;
        }
        return b10;
    }

    public static int h(f fVar, f fVar2) {
        int b10 = ((c) fVar2).b((short) 8, true);
        if (b10 == Integer.MIN_VALUE && (b10 = ((c) fVar).b((short) 8, true)) == Integer.MIN_VALUE) {
            return 0;
        }
        return b10;
    }

    public static int i(f fVar, f fVar2) {
        int b10 = ((c) fVar2).b((short) 9, true);
        if (b10 == Integer.MIN_VALUE && (b10 = ((c) fVar).b((short) 9, true)) == Integer.MIN_VALUE) {
            return f(fVar, fVar2);
        }
        return b10;
    }

    public static int j(f fVar) {
        int b10 = ((c) fVar).b((short) 12, true);
        if (b10 == Integer.MIN_VALUE) {
            return -1;
        }
        return b10;
    }

    public static int k(f fVar) {
        int b10 = ((c) fVar).b((short) 8193, true);
        if (b10 == Integer.MIN_VALUE) {
            return 1200;
        }
        return b10;
    }

    public static byte l(f fVar) {
        int b10 = ((c) fVar).b((short) 8201, true);
        if (b10 == Integer.MIN_VALUE) {
            return (byte) 0;
        }
        return (byte) b10;
    }

    public static int m(f fVar) {
        int b10 = ((c) fVar).b((short) 8194, true);
        if (b10 == Integer.MIN_VALUE) {
            return 1800;
        }
        return b10;
    }

    public static int n(f fVar) {
        int b10 = ((c) fVar).b((short) 8195, true);
        if (b10 == Integer.MIN_VALUE) {
            return 1800;
        }
        return b10;
    }

    public static byte o(f fVar) {
        int b10 = ((c) fVar).b((short) 8198, true);
        if (b10 == Integer.MIN_VALUE) {
            return (byte) 0;
        }
        return (byte) b10;
    }

    public static int p(f fVar) {
        int b10 = ((c) fVar).b((short) 8192, true);
        if (b10 == Integer.MIN_VALUE) {
            return 1000;
        }
        return b10;
    }

    public static int q(f fVar) {
        int b10 = ((c) fVar).b(DataFormatRecord.sid, true);
        if (b10 == Integer.MIN_VALUE) {
            return 0;
        }
        return b10;
    }

    public static int r(f fVar) {
        int b10 = ((c) fVar).b(UnitsRecord.sid, true);
        if (b10 == Integer.MIN_VALUE) {
            return 0;
        }
        return b10;
    }

    public static int s(f fVar) {
        int b10 = ((c) fVar).b(SeriesTextRecord.sid, true);
        if (b10 == Integer.MIN_VALUE) {
            return -1;
        }
        return b10;
    }

    public static int t(f fVar) {
        int b10 = ((c) fVar).b((short) 4104, true);
        if (b10 == Integer.MIN_VALUE) {
            return 0;
        }
        return b10;
    }

    public static boolean u(f fVar, short s4) {
        if (((c) fVar).b(s4, true) != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public static void v(f fVar, boolean z10) {
        ((c) fVar).e(z10 ? 1 : 0, (short) 4);
    }

    public static void w(f fVar, int i10) {
        ((c) fVar).e(i10, (short) 3);
    }

    public static void x(f fVar, boolean z10) {
        ((c) fVar).e(z10 ? 1 : 0, (short) 5);
    }

    public static void y(f fVar, int i10) {
        ((c) fVar).e(i10, (short) 10);
    }

    public static void z(f fVar, int i10) {
        ((c) fVar).e(i10, (short) 1);
    }

    public final l b(Long l10, ai.f fVar) {
        l lVar;
        fVar.a();
        ArrayList<l> arrayList = this.f32375a;
        int i10 = -1;
        if (!arrayList.isEmpty()) {
            Iterator<l> it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    lVar = it.next();
                    if (lVar != null && lVar.f32371a <= l10.longValue() && l10.longValue() < lVar.f32372b) {
                        break;
                    }
                } else {
                    lVar = null;
                    break;
                }
            }
            if (lVar == null) {
                lVar = arrayList.get(arrayList.size() - 1);
            }
        } else {
            lVar = null;
        }
        if (lVar == null) {
            return null;
        }
        f fVar2 = lVar.c;
        if (fVar2 != null) {
            fVar.f514g = o(fVar2);
            fVar.f515h = l(fVar2);
            fVar.f509a = (int) (p(fVar2) * 0.06666667f);
            fVar.f510b = (int) (k(fVar2) * 0.06666667f);
            c cVar = (c) fVar2;
            int b10 = cVar.b((short) 8196, true);
            int i11 = 1440;
            if (b10 == Integer.MIN_VALUE) {
                b10 = 1440;
            }
            fVar.c = (int) (b10 * 0.06666667f);
            int b11 = cVar.b((short) 8197, true);
            if (b11 != Integer.MIN_VALUE) {
                i11 = b11;
            }
            fVar.f511d = (int) (i11 * 0.06666667f);
            fVar.f513f = (int) (n(fVar2) * 0.06666667f);
            fVar.f512e = (int) (m(fVar2) * 0.06666667f);
            int b12 = cVar.b((short) 8199, true);
            int i12 = 850;
            if (b12 == Integer.MIN_VALUE) {
                b12 = 850;
            }
            fVar.f516i = (int) (b12 * 0.06666667f);
            int b13 = cVar.b((short) 8200, true);
            if (b13 != Integer.MIN_VALUE) {
                i12 = b13;
            }
            fVar.f517j = (int) (i12 * 0.06666667f);
            int b14 = cVar.b((short) 8202, true);
            if (b14 == Integer.MIN_VALUE) {
                b14 = -1;
            }
            fVar.f518k = b14;
            cVar.b((short) 8203, true);
            fVar.getClass();
            int b15 = cVar.b((short) 8204, true);
            if (b15 != Integer.MIN_VALUE) {
                i10 = b15;
            }
            fVar.f519l = i10 * 0.06666667f;
        }
        return lVar;
    }
}
