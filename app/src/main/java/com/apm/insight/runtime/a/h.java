package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.l.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h extends c {
    public h(Context context, b bVar, d dVar) {
        super(CrashType.DART, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a a10 = super.a(aVar);
        Header a11 = Header.a(this.f6735b);
        Header.a(a11);
        Header.b(a11);
        a11.c();
        a11.d();
        a11.e();
        a10.a(a11);
        r.a(a10, a11, this.f6734a);
        return a10;
    }
}
