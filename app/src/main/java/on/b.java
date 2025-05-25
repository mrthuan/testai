package on;

import androidx.lifecycle.j0;
import androidx.lifecycle.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.flow.StateFlowImpl;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustType;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.ImageAdjustPageMode;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import ul.c;

/* compiled from: ImageAdjustViewModel.kt */
/* loaded from: classes3.dex */
public final class b extends j0 {

    /* renamed from: d  reason: collision with root package name */
    public final StateFlowImpl f23511d;

    /* renamed from: e  reason: collision with root package name */
    public final StateFlowImpl f23512e;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f23513f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f23514g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f23515h;

    /* renamed from: i  reason: collision with root package name */
    public final w<List<ul.b>> f23516i;

    /* renamed from: j  reason: collision with root package name */
    public final w f23517j;

    /* renamed from: k  reason: collision with root package name */
    public int f23518k;

    public b() {
        StateFlowImpl a10 = t0.a(new mn.b(0));
        this.f23511d = a10;
        this.f23512e = a10;
        this.f23515h = new ArrayList();
        w<List<ul.b>> wVar = new w<>(EmptyList.INSTANCE);
        this.f23516i = wVar;
        this.f23517j = wVar;
    }

    public final void d(ho.b bVar) {
        boolean z10;
        int i10 = this.f23518k;
        int i11 = i10 - 1;
        int i12 = i10 + 1;
        Iterator it = this.f23515h.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 >= 0) {
                ul.b bVar2 = (ul.b) next;
                if (i11 <= i13 && i13 <= i12) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    bVar2.f30413k = null;
                    bVar2.f30414l = null;
                }
                bVar2.f30420r.c = bVar.d();
                i13 = i14;
            } else {
                ge.a.c0();
                throw null;
            }
        }
    }

    public final void e() {
        Iterator it = this.f23515h.iterator();
        while (it.hasNext()) {
            ul.b bVar = (ul.b) it.next();
            c cVar = bVar.f30419q;
            int i10 = cVar.f30425a;
            c cVar2 = bVar.f30420r;
            if (i10 != cVar2.f30425a || cVar.f30426b != cVar2.f30426b || !g.a(cVar.c, cVar2.c) || cVar.f30427d != cVar2.f30427d || cVar.f30428e != cVar2.f30428e || cVar.f30429f != cVar2.f30429f || !g.a(cVar.f30430g, cVar2.f30430g)) {
                bVar.f30416n = null;
                bVar.f30424v = true;
            }
            ge.a.p(cVar, cVar2);
        }
    }

    public final void f() {
        ArrayList arrayList = this.f23515h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ul.b bVar = (ul.b) it.next();
            bVar.f30418p = ImageAdjustType.CROP;
            c cVar = bVar.f30419q;
            if (cVar.a()) {
                bVar.f30414l = null;
            }
            ge.a.p(bVar.f30420r, cVar);
        }
        StateFlowImpl stateFlowImpl = this.f23511d;
        ImageAdjustPageMode pageMode = ImageAdjustPageMode.CROP;
        ((mn.b) stateFlowImpl.b()).getClass();
        g.e(pageMode, "pageMode");
        stateFlowImpl.setValue(new mn.b(pageMode));
        this.f23516i.j(arrayList);
    }

    public final void g() {
        ArrayList arrayList = this.f23515h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ul.b bVar = (ul.b) it.next();
            bVar.f30418p = ImageAdjustType.FILTER;
            ge.a.p(bVar.f30420r, bVar.f30419q);
        }
        StateFlowImpl stateFlowImpl = this.f23511d;
        ImageAdjustPageMode pageMode = ImageAdjustPageMode.FILTER;
        ((mn.b) stateFlowImpl.b()).getClass();
        g.e(pageMode, "pageMode");
        stateFlowImpl.setValue(new mn.b(pageMode));
        this.f23516i.j(arrayList);
    }

    public final void h() {
        ArrayList arrayList = this.f23515h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ul.b) it.next()).f30418p = ImageAdjustType.PREVIEW;
        }
        StateFlowImpl stateFlowImpl = this.f23511d;
        ImageAdjustPageMode pageMode = ImageAdjustPageMode.PREVIEW;
        ((mn.b) stateFlowImpl.b()).getClass();
        g.e(pageMode, "pageMode");
        stateFlowImpl.setValue(new mn.b(pageMode));
        this.f23516i.j(arrayList);
    }

    public final ul.b i() {
        return (ul.b) m.t0(this.f23518k, this.f23515h);
    }

    public final ImageAdjustPageMode j() {
        return ((mn.b) this.f23512e.b()).f22149a;
    }

    public final c k() {
        if (j() == ImageAdjustPageMode.PREVIEW) {
            ul.b i10 = i();
            if (i10 == null) {
                return null;
            }
            return i10.f30419q;
        }
        ul.b i11 = i();
        if (i11 == null) {
            return null;
        }
        return i11.f30420r;
    }

    public final int l() {
        c k10 = k();
        if (k10 == null) {
            return -1;
        }
        int i10 = k10.f30426b - 90;
        k10.f30426b = i10;
        if (i10 % 360 == 0) {
            k10.f30426b = 0;
        }
        ul.b i11 = i();
        if (i11 != null) {
            i11.f30424v = true;
        }
        return this.f23518k;
    }

    public final void m() {
        Iterator it = this.f23515h.iterator();
        while (it.hasNext()) {
            ul.b bVar = (ul.b) it.next();
            c cVar = bVar.f30419q;
            c cVar2 = bVar.f30420r;
            if (!cVar.equals(cVar2)) {
                bVar.f30413k = null;
                bVar.f30414l = null;
                if (cVar.f30432i != null) {
                    ArrayList arrayList = new ArrayList(cVar.f30432i);
                    cVar.f30431h = arrayList;
                    cVar2.f30431h = arrayList;
                    cVar.f30432i = null;
                }
            }
        }
    }
}
