package com.google.android.gms.internal.measurement;

import a0.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzny extends IllegalArgumentException {
    public zzny(int i10, int i11) {
        super(d.b("Unpaired surrogate at index ", i10, " of ", i11));
    }
}
