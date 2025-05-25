package nk;

import nk.g;

/* compiled from: BlockQuoteParser.java */
/* loaded from: classes3.dex */
public final class b extends sk.a {

    /* renamed from: a  reason: collision with root package name */
    public final qk.b f22502a = new qk.b();

    /* compiled from: BlockQuoteParser.java */
    /* loaded from: classes3.dex */
    public static class a extends sk.b {
        @Override // sk.d
        public final c a(sk.e eVar, g.a aVar) {
            boolean z10;
            char charAt;
            int i10 = ((g) eVar).f22525e;
            if (b.i(eVar, i10)) {
                g gVar = (g) eVar;
                int i11 = gVar.c + gVar.f22527g + 1;
                CharSequence charSequence = gVar.f22522a;
                int i12 = i10 + 1;
                if (i12 < charSequence.length() && ((charAt = charSequence.charAt(i12)) == '\t' || charAt == ' ')) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i11++;
                }
                c cVar = new c(new b());
                cVar.c = i11;
                return cVar;
            }
            return null;
        }
    }

    public static boolean i(sk.e eVar, int i10) {
        CharSequence charSequence = ((g) eVar).f22522a;
        if (((g) eVar).f22527g < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>') {
            return true;
        }
        return false;
    }

    @Override // sk.c
    public final nk.a f(sk.e eVar) {
        char charAt;
        int i10 = ((g) eVar).f22525e;
        if (i(eVar, i10)) {
            g gVar = (g) eVar;
            boolean z10 = true;
            int i11 = gVar.c + gVar.f22527g + 1;
            CharSequence charSequence = gVar.f22522a;
            int i12 = i10 + 1;
            if (i12 >= charSequence.length() || ((charAt = charSequence.charAt(i12)) != '\t' && charAt != ' ')) {
                z10 = false;
            }
            if (z10) {
                i11++;
            }
            return new nk.a(-1, i11, false);
        }
        return null;
    }

    @Override // sk.c
    public final qk.a g() {
        return this.f22502a;
    }
}
