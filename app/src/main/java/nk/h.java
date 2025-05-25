package nk;

import nk.g;

/* compiled from: FencedCodeBlockParser.java */
/* loaded from: classes3.dex */
public final class h extends sk.a {

    /* renamed from: a  reason: collision with root package name */
    public final qk.g f22537a;

    /* renamed from: b  reason: collision with root package name */
    public String f22538b;
    public final StringBuilder c;

    /* compiled from: FencedCodeBlockParser.java */
    /* loaded from: classes3.dex */
    public static class a extends sk.b {
        @Override // sk.d
        public final c a(sk.e eVar, g.a aVar) {
            h hVar;
            g gVar = (g) eVar;
            int i10 = gVar.f22527g;
            if (i10 >= 4) {
                return null;
            }
            int i11 = gVar.f22525e;
            CharSequence charSequence = gVar.f22522a;
            int length = charSequence.length();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = i11; i14 < length; i14++) {
                char charAt = charSequence.charAt(i14);
                if (charAt != '`') {
                    if (charAt != '~') {
                        break;
                    }
                    i13++;
                } else {
                    i12++;
                }
            }
            if (i12 >= 3 && i13 == 0) {
                int i15 = i11 + i12;
                int length2 = charSequence.length();
                while (true) {
                    if (i15 < length2) {
                        if (charSequence.charAt(i15) == '`') {
                            break;
                        }
                        i15++;
                    } else {
                        i15 = -1;
                        break;
                    }
                }
                if (i15 == -1) {
                    hVar = new h('`', i12, i10);
                }
                hVar = null;
            } else {
                if (i13 >= 3 && i12 == 0) {
                    hVar = new h('~', i13, i10);
                }
                hVar = null;
            }
            if (hVar == null) {
                return null;
            }
            c cVar = new c(hVar);
            cVar.f22504b = i11 + hVar.f22537a.f29361g;
            return cVar;
        }
    }

    public h(char c, int i10, int i11) {
        qk.g gVar = new qk.g();
        this.f22537a = gVar;
        this.c = new StringBuilder();
        gVar.f29360f = c;
        gVar.f29361g = i10;
        gVar.f29362h = i11;
    }

    @Override // sk.a, sk.c
    public final void c() {
        String b10 = pk.a.b(this.f22538b.trim());
        qk.g gVar = this.f22537a;
        gVar.f29363i = b10;
        gVar.f29364j = this.c.toString();
    }

    @Override // sk.c
    public final nk.a f(sk.e eVar) {
        boolean z10;
        g gVar = (g) eVar;
        int i10 = gVar.f22525e;
        int i11 = gVar.f22523b;
        CharSequence charSequence = gVar.f22522a;
        int i12 = gVar.f22527g;
        qk.g gVar2 = this.f22537a;
        boolean z11 = false;
        if (i12 < 4) {
            char c = gVar2.f29360f;
            int i13 = gVar2.f29361g;
            int W = ge.a.W(c, charSequence, i10, charSequence.length()) - i10;
            if (W >= i13 && ge.a.X(charSequence, i10 + W, charSequence.length()) == charSequence.length()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            return new nk.a(-1, -1, true);
        }
        int length = charSequence.length();
        for (int i14 = gVar2.f29362h; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return nk.a.a(i11);
    }

    @Override // sk.c
    public final qk.a g() {
        return this.f22537a;
    }

    @Override // sk.a, sk.c
    public final void h(CharSequence charSequence) {
        if (this.f22538b == null) {
            this.f22538b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.c;
        sb2.append(charSequence);
        sb2.append('\n');
    }
}
