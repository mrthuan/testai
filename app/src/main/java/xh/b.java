package xh;

import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: Highlight.java */
/* loaded from: classes3.dex */
public final class b implements d {

    /* renamed from: d  reason: collision with root package name */
    public final e f31656d;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<c> f31654a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public int f31655b = -1;
    public boolean c = true;

    /* renamed from: e  reason: collision with root package name */
    public final Paint f31657e = new Paint(1);

    public b(e eVar) {
        this.f31656d = eVar;
    }

    public final long a() {
        int i10 = this.f31655b;
        if (i10 >= 0) {
            ArrayList<c> arrayList = this.f31654a;
            if (i10 < arrayList.size()) {
                return arrayList.get(this.f31655b).f31658a;
            }
            return 0L;
        }
        return 0L;
    }

    public final String b() {
        int i10;
        if (c() && (i10 = this.f31655b) >= 0) {
            ArrayList<c> arrayList = this.f31654a;
            if (i10 < arrayList.size()) {
                c cVar = arrayList.get(this.f31655b);
                return this.f31656d.getDocument().b(cVar.f31658a, cVar.f31659b);
            }
            return "";
        }
        return "";
    }

    public final boolean c() {
        return !this.f31654a.isEmpty();
    }
}
