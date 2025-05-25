package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;

@Deprecated
/* loaded from: classes.dex */
class g extends c {
    public g(Context context, b bVar, d dVar) {
        super(CrashType.CUSTOM_JAVA, context, bVar, dVar);
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
        return a10;
    }
}
