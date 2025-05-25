package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.l.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l extends c {
    public l(Context context, b bVar, d dVar) {
        super(CrashType.NATIVE, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a a10 = super.a(i10, aVar);
        if (i10 == 0) {
            Header a11 = Header.a(this.f6735b);
            a11.c();
            a10.a(a11);
            r.a(a10, a11, this.f6734a);
        } else if (i10 == 1) {
            Header i11 = a10.i();
            i11.d();
            i11.e();
        } else if (i10 == 2) {
            Header.a(a10.i());
        }
        return a10;
    }

    @Override // com.apm.insight.runtime.a.c
    public int b() {
        return com.apm.insight.nativecrash.b.a();
    }

    @Override // com.apm.insight.runtime.a.c
    public boolean d() {
        return false;
    }

    @Override // com.apm.insight.runtime.a.c
    public boolean a() {
        return false;
    }

    @Override // com.apm.insight.runtime.a.c
    public void h(com.apm.insight.entity.a aVar) {
    }
}
