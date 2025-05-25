package com.google.android.gms.internal.consent_sdk;

import a0.a;
import android.os.Handler;
import android.webkit.WebView;
import java.util.Objects;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public final class zzbu extends WebView {
    private final Handler zza;
    private final zzca zzb;
    private boolean zzc;

    public zzbu(zzbw zzbwVar, Handler handler, zzca zzcaVar) {
        super(zzbwVar);
        this.zzc = false;
        this.zza = handler;
        this.zzb = zzcaVar;
    }

    public static /* bridge */ /* synthetic */ boolean zzf(zzbu zzbuVar, String str) {
        if (str != null && str.startsWith("consent://")) {
            return true;
        }
        return false;
    }

    public final void zzc() {
        final zzca zzcaVar = this.zzb;
        Objects.requireNonNull(zzcaVar);
        this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbr
            @Override // java.lang.Runnable
            public final void run() {
                zzca.this.zzc();
            }
        });
    }

    public final void zzd(String str, String str2) {
        final String j10 = a.j(str, "(", str2, ");");
        this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbq
            @Override // java.lang.Runnable
            public final void run() {
                zzcs.zza(zzbu.this, j10);
            }
        });
    }
}
