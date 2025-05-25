package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.l.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a extends c {
    public a(Context context, b bVar, d dVar) {
        super(CrashType.ANR, context, bVar, dVar);
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
        a10.a("process_name", (Object) com.apm.insight.l.a.c(this.f6735b));
        r.a(a10, a11, this.f6734a);
        return a10;
    }

    @Override // com.apm.insight.runtime.a.c
    public boolean a() {
        return true;
    }
}
