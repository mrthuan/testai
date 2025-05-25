package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class zzfe extends RuntimeException {
    public zzfe(zzec zzecVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzdc zza() {
        return new zzdc(getMessage());
    }
}
