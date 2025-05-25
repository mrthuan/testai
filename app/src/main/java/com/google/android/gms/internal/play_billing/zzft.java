package com.google.android.gms.internal.play_billing;

import a0.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class zzft extends IllegalArgumentException {
    public zzft(int i10, int i11) {
        super(d.b("Unpaired surrogate at index ", i10, " of ", i11));
    }
}
