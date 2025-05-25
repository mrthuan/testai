package org.commonmark.internal;

import nk.g;
import nk.l;
import qk.t;
import sk.e;

/* compiled from: ParagraphParser.java */
/* loaded from: classes3.dex */
public final class a extends sk.a {

    /* renamed from: a  reason: collision with root package name */
    public final t f23566a = new t();

    /* renamed from: b  reason: collision with root package name */
    public final LinkReferenceDefinitionParser f23567b = new LinkReferenceDefinitionParser();

    @Override // sk.a, sk.c
    public final void b(l lVar) {
        StringBuilder sb2 = this.f23567b.f23557b;
        if (sb2.length() > 0) {
            lVar.f(sb2.toString(), this.f23566a);
        }
    }

    @Override // sk.a, sk.c
    public final void c() {
        if (this.f23567b.f23557b.length() == 0) {
            this.f23566a.f();
        }
    }

    @Override // sk.c
    public final nk.a f(e eVar) {
        g gVar = (g) eVar;
        if (!gVar.f22528h) {
            return nk.a.a(gVar.f22523b);
        }
        return null;
    }

    @Override // sk.c
    public final qk.a g() {
        return this.f23566a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0103, code lost:
        if (r4 == r5) goto L25;
     */
    @Override // sk.a, sk.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.CharSequence r11) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.a.h(java.lang.CharSequence):void");
    }
}
