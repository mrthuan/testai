package jf;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.fragment.app.w;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jf.j;
import jf.m;
import jf.q;
import qk.r;

/* compiled from: MarkwonImpl.java */
/* loaded from: classes.dex */
public final class f extends w {

    /* renamed from: d  reason: collision with root package name */
    public final rk.c f19186d;

    /* renamed from: e  reason: collision with root package name */
    public final l f19187e;

    /* renamed from: f  reason: collision with root package name */
    public final List<g> f19188f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f19189g;

    public f(rk.c cVar, k kVar, List list, boolean z10) {
        this.f19186d = cVar;
        this.f19187e = kVar;
        this.f19188f = list;
        this.f19189g = z10;
    }

    public final SpannableStringBuilder J(String str) {
        List<g> list = this.f19188f;
        String str2 = str;
        for (g gVar : list) {
            str2 = gVar.b(str2);
        }
        r a10 = this.f19186d.a(str2);
        for (g gVar2 : list) {
            gVar2.c();
        }
        k kVar = (k) this.f19187e;
        e eVar = kVar.f19193b;
        o oVar = new o(0);
        m.a aVar = (m.a) kVar.f19192a;
        j.a aVar2 = aVar.f19199b;
        if (aVar2 == null) {
            aVar2 = new b();
        }
        m mVar = new m(eVar, oVar, new q(), Collections.unmodifiableMap(aVar.f19198a), aVar2);
        a10.a(mVar);
        for (g gVar3 : list) {
            gVar3.a();
        }
        q qVar = mVar.c;
        qVar.getClass();
        q.b bVar = new q.b(qVar.f19202a);
        Iterator it = qVar.f19203b.iterator();
        while (it.hasNext()) {
            q.a aVar3 = (q.a) it.next();
            bVar.setSpan(aVar3.f19204a, aVar3.f19205b, aVar3.c, aVar3.f19206d);
        }
        if (TextUtils.isEmpty(bVar) && this.f19189g && !TextUtils.isEmpty(str)) {
            return new SpannableStringBuilder(str);
        }
        return bVar;
    }
}
