package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import t6.b;
import w6.c;
import w6.f;
import w6.i;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements c {
    @Override // w6.c
    public i create(f fVar) {
        return new b(fVar.a(), fVar.d(), fVar.c());
    }
}
