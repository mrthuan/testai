package nk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import nk.b;
import nk.h;
import nk.i;
import nk.j;
import nk.k;
import nk.m;
import nk.p;
import org.commonmark.internal.LinkReferenceDefinitionParser;
import qk.r;
import qk.t;
import qk.x;

/* compiled from: DocumentParser.java */
/* loaded from: classes3.dex */
public final class g implements sk.e {

    /* renamed from: p  reason: collision with root package name */
    public static final LinkedHashSet f22520p = new LinkedHashSet(Arrays.asList(qk.b.class, qk.i.class, qk.g.class, qk.j.class, x.class, qk.p.class, qk.m.class));

    /* renamed from: q  reason: collision with root package name */
    public static final Map<Class<? extends qk.a>, sk.d> f22521q;

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f22522a;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22524d;

    /* renamed from: h  reason: collision with root package name */
    public boolean f22528h;

    /* renamed from: i  reason: collision with root package name */
    public final List<sk.d> f22529i;

    /* renamed from: j  reason: collision with root package name */
    public final rk.a f22530j;

    /* renamed from: k  reason: collision with root package name */
    public final List<tk.a> f22531k;

    /* renamed from: l  reason: collision with root package name */
    public final f f22532l;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f22534n;

    /* renamed from: o  reason: collision with root package name */
    public final LinkedHashSet f22535o;

    /* renamed from: b  reason: collision with root package name */
    public int f22523b = 0;
    public int c = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f22525e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f22526f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f22527g = 0;

    /* renamed from: m  reason: collision with root package name */
    public final LinkedHashMap f22533m = new LinkedHashMap();

    /* compiled from: DocumentParser.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final sk.c f22536a;

        public a(sk.c cVar) {
            this.f22536a = cVar;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(qk.b.class, new b.a());
        hashMap.put(qk.i.class, new i.a());
        hashMap.put(qk.g.class, new h.a());
        hashMap.put(qk.j.class, new j.a());
        hashMap.put(x.class, new p.a());
        hashMap.put(qk.p.class, new m.a());
        hashMap.put(qk.m.class, new k.a());
        f22521q = Collections.unmodifiableMap(hashMap);
    }

    public g(ArrayList arrayList, rk.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f22534n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f22535o = linkedHashSet;
        this.f22529i = arrayList;
        this.f22530j = bVar;
        this.f22531k = arrayList2;
        f fVar = new f();
        this.f22532l = fVar;
        arrayList3.add(fVar);
        linkedHashSet.add(fVar);
    }

    public final void a(sk.c cVar) {
        while (!h().d(cVar.g())) {
            e(h());
        }
        h().g().b(cVar.g());
        this.f22534n.add(cVar);
        this.f22535o.add(cVar);
    }

    public final void b(org.commonmark.internal.a aVar) {
        LinkReferenceDefinitionParser linkReferenceDefinitionParser = aVar.f23567b;
        linkReferenceDefinitionParser.a();
        Iterator it = linkReferenceDefinitionParser.c.iterator();
        while (it.hasNext()) {
            qk.o oVar = (qk.o) it.next();
            t tVar = aVar.f23566a;
            tVar.getClass();
            oVar.f();
            r rVar = tVar.f29379d;
            oVar.f29379d = rVar;
            if (rVar != null) {
                rVar.f29380e = oVar;
            }
            oVar.f29380e = tVar;
            tVar.f29379d = oVar;
            r rVar2 = tVar.f29377a;
            oVar.f29377a = rVar2;
            if (oVar.f29379d == null) {
                rVar2.f29378b = oVar;
            }
            LinkedHashMap linkedHashMap = this.f22533m;
            String str = oVar.f29373f;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, oVar);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.f22524d) {
            CharSequence charSequence = this.f22522a;
            CharSequence subSequence2 = charSequence.subSequence(this.f22523b + 1, charSequence.length());
            int i10 = 4 - (this.c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f22522a;
            subSequence = charSequence2.subSequence(this.f22523b, charSequence2.length());
        }
        h().h(subSequence);
    }

    public final void d() {
        if (this.f22522a.charAt(this.f22523b) == '\t') {
            this.f22523b++;
            int i10 = this.c;
            this.c = (4 - (i10 % 4)) + i10;
            return;
        }
        this.f22523b++;
        this.c++;
    }

    public final void e(sk.c cVar) {
        if (h() == cVar) {
            ArrayList arrayList = this.f22534n;
            arrayList.remove(arrayList.size() - 1);
        }
        if (cVar instanceof org.commonmark.internal.a) {
            b((org.commonmark.internal.a) cVar);
        }
        cVar.c();
    }

    public final void f(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                e((sk.c) arrayList.get(size));
            } else {
                return;
            }
        }
    }

    public final void g() {
        int i10 = this.f22523b;
        int i11 = this.c;
        this.f22528h = true;
        int length = this.f22522a.length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.f22522a.charAt(i10);
            if (charAt != '\t') {
                if (charAt != ' ') {
                    this.f22528h = false;
                    break;
                } else {
                    i10++;
                    i11++;
                }
            } else {
                i10++;
                i11 += 4 - (i11 % 4);
            }
        }
        this.f22525e = i10;
        this.f22526f = i11;
        this.f22527g = i11 - this.c;
    }

    public final sk.c h() {
        ArrayList arrayList = this.f22534n;
        return (sk.c) arrayList.get(arrayList.size() - 1);
    }

    public final void i(String str) {
        boolean z10;
        c cVar;
        int length = str.length();
        StringBuilder sb2 = null;
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt != 0) {
                if (sb2 != null) {
                    sb2.append(charAt);
                }
            } else {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length);
                    sb2.append((CharSequence) str, 0, i10);
                }
                sb2.append((char) 65533);
            }
        }
        if (sb2 != null) {
            str = sb2.toString();
        }
        this.f22522a = str;
        this.f22523b = 0;
        this.c = 0;
        this.f22524d = false;
        ArrayList arrayList = this.f22534n;
        int i11 = 1;
        for (sk.c cVar2 : arrayList.subList(1, arrayList.size())) {
            g();
            nk.a f10 = cVar2.f(this);
            if (!(f10 instanceof nk.a)) {
                break;
            } else if (f10.c) {
                e(cVar2);
                return;
            } else {
                int i12 = f10.f22500a;
                if (i12 != -1) {
                    k(i12);
                } else {
                    int i13 = f10.f22501b;
                    if (i13 != -1) {
                        j(i13);
                    }
                }
                i11++;
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i11, arrayList.size()));
        r4 = (sk.c) arrayList.get(i11 - 1);
        boolean isEmpty = arrayList2.isEmpty();
        if (!(r4.g() instanceof t) && !r4.a()) {
            z10 = false;
        } else {
            z10 = true;
        }
        while (true) {
            if (!z10) {
                break;
            }
            g();
            if (this.f22528h || (this.f22527g < 4 && Character.isLetter(Character.codePointAt(this.f22522a, this.f22525e)))) {
                break;
            }
            a aVar = new a(r4);
            Iterator<sk.d> it = this.f22529i.iterator();
            while (true) {
                if (it.hasNext()) {
                    cVar = it.next().a(this, aVar);
                    if (cVar instanceof c) {
                        break;
                    }
                } else {
                    cVar = null;
                    break;
                }
            }
            if (cVar == null) {
                k(this.f22525e);
                break;
            }
            if (!isEmpty) {
                f(arrayList2);
                isEmpty = true;
            }
            int i14 = cVar.f22504b;
            if (i14 != -1) {
                k(i14);
            } else {
                int i15 = cVar.c;
                if (i15 != -1) {
                    j(i15);
                }
            }
            if (cVar.f22505d) {
                sk.c h10 = h();
                arrayList.remove(arrayList.size() - 1);
                this.f22535o.remove(h10);
                if (h10 instanceof org.commonmark.internal.a) {
                    b((org.commonmark.internal.a) h10);
                }
                h10.g().f();
            }
            sk.c[] cVarArr = cVar.f22503a;
            for (sk.c cVar3 : cVarArr) {
                a(cVar3);
                z10 = cVar3.a();
            }
        }
        k(this.f22525e);
        if (!isEmpty && !this.f22528h && h().e()) {
            c();
            return;
        }
        if (!isEmpty) {
            f(arrayList2);
        }
        if (!cVar3.a()) {
            c();
        } else if (!this.f22528h) {
            a(new org.commonmark.internal.a());
            c();
        }
    }

    public final void j(int i10) {
        int i11;
        int i12 = this.f22526f;
        if (i10 >= i12) {
            this.f22523b = this.f22525e;
            this.c = i12;
        }
        int length = this.f22522a.length();
        while (true) {
            i11 = this.c;
            if (i11 >= i10 || this.f22523b == length) {
                break;
            }
            d();
        }
        if (i11 > i10) {
            this.f22523b--;
            this.c = i10;
            this.f22524d = true;
            return;
        }
        this.f22524d = false;
    }

    public final void k(int i10) {
        int i11 = this.f22525e;
        if (i10 >= i11) {
            this.f22523b = i11;
            this.c = this.f22526f;
        }
        int length = this.f22522a.length();
        while (true) {
            int i12 = this.f22523b;
            if (i12 >= i10 || i12 == length) {
                break;
            }
            d();
        }
        this.f22524d = false;
    }
}
