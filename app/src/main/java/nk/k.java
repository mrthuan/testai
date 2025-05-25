package nk;

import java.util.ArrayList;
import nk.g;
import qk.t;

/* compiled from: IndentedCodeBlockParser.java */
/* loaded from: classes3.dex */
public final class k extends sk.a {

    /* renamed from: a  reason: collision with root package name */
    public final qk.m f22545a = new qk.m();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f22546b = new ArrayList();

    /* compiled from: IndentedCodeBlockParser.java */
    /* loaded from: classes3.dex */
    public static class a extends sk.b {
        @Override // sk.d
        public final c a(sk.e eVar, g.a aVar) {
            g gVar = (g) eVar;
            if (gVar.f22527g >= 4 && !gVar.f22528h && !(gVar.h().g() instanceof t)) {
                c cVar = new c(new k());
                cVar.c = gVar.c + 4;
                return cVar;
            }
            return null;
        }
    }

    @Override // sk.a, sk.c
    public final void c() {
        int i10;
        boolean z10;
        ArrayList arrayList = this.f22546b;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                CharSequence charSequence = (CharSequence) arrayList.get(size);
                int length = charSequence.length();
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        char charAt = charSequence.charAt(i11);
                        if (charAt != ' ') {
                            switch (charAt) {
                            }
                        }
                        i11++;
                    } else {
                        i11 = -1;
                    }
                }
                if (i11 == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    size--;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (i10 = 0; i10 < size + 1; i10++) {
            sb2.append((CharSequence) arrayList.get(i10));
            sb2.append('\n');
        }
        this.f22545a.f29370f = sb2.toString();
    }

    @Override // sk.c
    public final nk.a f(sk.e eVar) {
        g gVar = (g) eVar;
        if (gVar.f22527g >= 4) {
            return new nk.a(-1, gVar.c + 4, false);
        }
        if (gVar.f22528h) {
            return nk.a.a(gVar.f22525e);
        }
        return null;
    }

    @Override // sk.c
    public final qk.a g() {
        return this.f22545a;
    }

    @Override // sk.a, sk.c
    public final void h(CharSequence charSequence) {
        this.f22546b.add(charSequence);
    }
}
