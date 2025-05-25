package rk;

import androidx.appcompat.widget.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import nk.g;
import nk.l;
import qk.r;

/* compiled from: Parser.java */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f29617a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f29618b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f29619d;

    /* compiled from: Parser.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f29620a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f29621b = new ArrayList();
        public final ArrayList c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final LinkedHashSet f29622d = g.f22520p;
    }

    public c(a aVar) {
        ArrayList arrayList = aVar.f29620a;
        LinkedHashSet<Class> linkedHashSet = aVar.f29622d;
        LinkedHashSet linkedHashSet2 = g.f22520p;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        for (Class cls : linkedHashSet) {
            arrayList2.add(g.f22521q.get(cls));
        }
        this.f29617a = arrayList2;
        this.c = new b();
        this.f29619d = aVar.c;
        ArrayList arrayList3 = aVar.f29621b;
        this.f29618b = arrayList3;
        new l(new i(arrayList3, Collections.emptyMap()));
    }

    public final r a(String str) {
        if (str != null) {
            g gVar = new g(this.f29617a, this.c, this.f29618b);
            int i10 = 0;
            while (true) {
                int length = str.length();
                int i11 = i10;
                while (true) {
                    if (i11 < length) {
                        char charAt = str.charAt(i11);
                        if (charAt == '\n' || charAt == '\r') {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 == -1) {
                    break;
                }
                gVar.i(str.substring(i10, i11));
                i10 = i11 + 1;
                if (i10 < str.length() && str.charAt(i11) == '\r' && str.charAt(i10) == '\n') {
                    i10 = i11 + 2;
                }
            }
            if (str.length() > 0 && (i10 == 0 || i10 < str.length())) {
                gVar.i(str.substring(i10));
            }
            gVar.f(gVar.f22534n);
            i iVar = new i(gVar.f22531k, gVar.f22533m);
            ((b) gVar.f22530j).getClass();
            l lVar = new l(iVar);
            for (sk.c cVar : gVar.f22535o) {
                cVar.b(lVar);
            }
            r rVar = gVar.f22532l.f22519a;
            Iterator it = this.f29619d.iterator();
            while (it.hasNext()) {
                rVar = ((d) it.next()).process();
            }
            return rVar;
        }
        throw new NullPointerException("input must not be null");
    }
}
