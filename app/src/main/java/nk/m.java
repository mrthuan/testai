package nk;

import qk.q;

/* compiled from: ListBlockParser.java */
/* loaded from: classes3.dex */
public final class m extends sk.a {

    /* renamed from: a  reason: collision with root package name */
    public final qk.p f22568a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f22569b;
    public int c;

    /* compiled from: ListBlockParser.java */
    /* loaded from: classes3.dex */
    public static class a extends sk.b {
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0133, code lost:
            if (r1 == null) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0135, code lost:
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
            if (r6.length() == 0) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x0157, code lost:
            if (r1 == null) goto L65;
         */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0100 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
        @Override // sk.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final nk.c a(sk.e r17, nk.g.a r18) {
            /*
                Method dump skipped, instructions count: 416
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: nk.m.a.a(sk.e, nk.g$a):nk.c");
        }
    }

    /* compiled from: ListBlockParser.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final qk.p f22570a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22571b;

        public b(qk.p pVar, int i10) {
            this.f22570a = pVar;
            this.f22571b = i10;
        }
    }

    /* compiled from: ListBlockParser.java */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final qk.p f22572a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22573b;

        public c(qk.p pVar, int i10) {
            this.f22572a = pVar;
            this.f22573b = i10;
        }
    }

    public m(qk.p pVar) {
        this.f22568a = pVar;
    }

    @Override // sk.a, sk.c
    public final boolean a() {
        return true;
    }

    @Override // sk.a, sk.c
    public final boolean d(qk.a aVar) {
        if (!(aVar instanceof q)) {
            return false;
        }
        if (this.f22569b && this.c == 1) {
            this.f22568a.f29376f = false;
            this.f22569b = false;
        }
        return true;
    }

    @Override // sk.c
    public final nk.a f(sk.e eVar) {
        g gVar = (g) eVar;
        if (gVar.f22528h) {
            this.f22569b = true;
            this.c = 0;
        } else if (this.f22569b) {
            this.c++;
        }
        return nk.a.a(gVar.f22523b);
    }

    @Override // sk.c
    public final qk.a g() {
        return this.f22568a;
    }
}
