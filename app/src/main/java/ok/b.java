package ok;

import nk.e;
import qk.f;
import qk.r;
import qk.v;
import qk.w;

/* compiled from: EmphasisDelimiterProcessor.java */
/* loaded from: classes3.dex */
public abstract class b implements tk.a {

    /* renamed from: a  reason: collision with root package name */
    public final char f23115a;

    public b(char c) {
        this.f23115a = c;
    }

    @Override // tk.a
    public final int a(e eVar, e eVar2) {
        if (eVar.f22514d || eVar2.c) {
            int i10 = eVar2.f22518h;
            if (i10 % 3 != 0 && (eVar.f22518h + i10) % 3 == 0) {
                return 0;
            }
        }
        if (eVar.f22517g >= 2 && eVar2.f22517g >= 2) {
            return 2;
        }
        return 1;
    }

    @Override // tk.a
    public final void b(w wVar, w wVar2, int i10) {
        r vVar;
        String.valueOf(this.f23115a);
        if (i10 == 1) {
            vVar = new f(0);
        } else {
            vVar = new v(0);
        }
        r rVar = wVar.f29380e;
        while (rVar != null && rVar != wVar2) {
            r rVar2 = rVar.f29380e;
            vVar.b(rVar);
            rVar = rVar2;
        }
        vVar.f();
        r rVar3 = wVar.f29380e;
        vVar.f29380e = rVar3;
        if (rVar3 != null) {
            rVar3.f29379d = vVar;
        }
        vVar.f29379d = wVar;
        wVar.f29380e = vVar;
        r rVar4 = wVar.f29377a;
        vVar.f29377a = rVar4;
        if (vVar.f29380e == null) {
            rVar4.c = vVar;
        }
    }

    @Override // tk.a
    public final char c() {
        return this.f23115a;
    }

    @Override // tk.a
    public final int d() {
        return 1;
    }

    @Override // tk.a
    public final char e() {
        return this.f23115a;
    }
}
