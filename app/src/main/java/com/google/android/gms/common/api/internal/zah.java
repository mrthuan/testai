package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zah extends i0 {
    public final ListenerHolder.ListenerKey c;

    public zah(ListenerHolder.ListenerKey listenerKey, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.c = listenerKey;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean f(zabq zabqVar) {
        if (((zaci) zabqVar.f11114f.get(this.c)) == null) {
            return false;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] g(zabq zabqVar) {
        if (((zaci) zabqVar.f11114f.get(this.c)) == null) {
            return null;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.i0
    public final void h(zabq zabqVar) {
        if (((zaci) zabqVar.f11114f.remove(this.c)) == null) {
            this.f11011b.d(Boolean.FALSE);
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void d(zaad zaadVar, boolean z10) {
    }
}
