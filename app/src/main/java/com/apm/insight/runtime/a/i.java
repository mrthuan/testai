package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.l.r;

/* loaded from: classes.dex */
public class i extends c {
    public i(Context context, b bVar, d dVar) {
        super(CrashType.ENSURE, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a a10 = super.a(aVar);
        g(a10);
        r.a(a10, (Header) null, this.f6734a);
        return a10;
    }

    @Override // com.apm.insight.runtime.a.c
    public boolean c() {
        return false;
    }

    @Override // com.apm.insight.runtime.a.c
    public boolean d() {
        return false;
    }

    @Override // com.apm.insight.runtime.a.c
    public boolean a() {
        return false;
    }
}
