package ei;

import ai.h;
import androidx.activity.f;
import com.android.billingclient.api.a0;
import ii.e;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;

/* compiled from: Cell.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: h  reason: collision with root package name */
    public static final GregorianCalendar f16587h = new GregorianCalendar();

    /* renamed from: a  reason: collision with root package name */
    public c f16588a;

    /* renamed from: b  reason: collision with root package name */
    public short f16589b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f16590d;

    /* renamed from: e  reason: collision with root package name */
    public int f16591e;

    /* renamed from: f  reason: collision with root package name */
    public Object f16592f;

    /* renamed from: g  reason: collision with root package name */
    public final a0 f16593g = new a0();

    public a(short s4) {
        this.f16589b = s4;
    }

    public final short a() {
        Object obj = ((Map) this.f16593g.f6179b).get((short) 0);
        if (obj != null) {
            return ((Short) obj).shortValue();
        }
        return (short) -1;
    }

    public final e b() {
        return this.f16588a.f16601a.h(this.f16591e);
    }

    public final Date c(boolean z10) {
        Object obj;
        int i10;
        int i11;
        if (this.f16589b == 0 && (obj = this.f16592f) != null) {
            double doubleValue = ((Double) obj).doubleValue();
            int floor = (int) Math.floor(doubleValue);
            int e10 = (int) f.e(doubleValue, floor, 8.64E7d, 0.5d);
            if (z10) {
                i10 = 1904;
            } else {
                i10 = 1900;
            }
            int i12 = i10;
            if (z10) {
                i11 = 1;
            } else if (floor < 61) {
                i11 = 0;
            } else {
                i11 = -1;
            }
            GregorianCalendar gregorianCalendar = f16587h;
            gregorianCalendar.clear();
            gregorianCalendar.set(i12, 0, floor + i11, 0, 0, 0);
            gregorianCalendar.set(14, e10);
            return gregorianCalendar.getTime();
        }
        return null;
    }

    public final int d() {
        Object obj = ((Map) this.f16593g.f6179b).get((short) 2);
        if (obj != null) {
            return ((Integer) obj).intValue();
        }
        return -1;
    }

    public final ih.a e() {
        Object obj = ((Map) this.f16593g.f6179b).get((short) 3);
        if (obj != null) {
            return (ih.a) obj;
        }
        return null;
    }

    public final double f() {
        Object obj;
        if (this.f16589b == 0 && (obj = this.f16592f) != null) {
            return ((Double) obj).doubleValue();
        }
        return Double.NaN;
    }

    public final int g() {
        Object obj = ((Map) this.f16593g.f6179b).get((short) 1);
        if (obj != null) {
            return ((Integer) obj).intValue();
        }
        return -1;
    }

    public final h h() {
        int i10;
        c cVar = this.f16588a;
        Object obj = ((Map) this.f16593g.f6179b).get((short) 4);
        if (obj != null) {
            i10 = ((Integer) obj).intValue();
        } else {
            i10 = -1;
        }
        if (i10 >= 0) {
            if (i10 < cVar.f16622w.size()) {
                return (h) cVar.f16622w.get(i10);
            }
        } else {
            cVar.getClass();
        }
        return null;
    }

    public final int i() {
        Object obj;
        if (this.f16589b == 1 && (obj = this.f16592f) != null) {
            return ((Integer) obj).intValue();
        }
        return -1;
    }

    public final void j(h hVar) {
        if (this.f16588a.j() == 2) {
            c cVar = this.f16588a;
            if (cVar.f16622w == null) {
                cVar.f16622w = new ArrayList();
            }
            int size = cVar.f16622w.size();
            cVar.f16622w.add(size, hVar);
            this.f16593g.f((short) 4, Integer.valueOf(size));
        }
    }
}
