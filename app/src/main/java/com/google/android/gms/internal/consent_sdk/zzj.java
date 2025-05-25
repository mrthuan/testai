package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import com.google.android.ump.ConsentInformation;
import x9.c;
import x9.d;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public final class zzj implements ConsentInformation {
    private final zzap zza;
    private final zzu zzb;
    private final zzbn zzc;
    private final Object zzd = new Object();
    private final Object zze = new Object();
    private boolean zzf = false;
    private boolean zzg = false;
    private c zzh = new c(new c.a());

    public zzj(zzap zzapVar, zzu zzuVar, zzbn zzbnVar) {
        this.zza = zzapVar;
        this.zzb = zzuVar;
        this.zzc = zzbnVar;
    }

    public final boolean canRequestAds() {
        int zza;
        if (!this.zza.zzk()) {
            if (!zzc()) {
                zza = 0;
            } else {
                zza = this.zza.zza();
            }
            if (zza != 1 && zza != 3) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final int getConsentStatus() {
        if (!zzc()) {
            return 0;
        }
        return this.zza.zza();
    }

    public final ConsentInformation.PrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus() {
        if (!zzc()) {
            return ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN;
        }
        return this.zza.zzb();
    }

    @Override // com.google.android.ump.ConsentInformation
    public final boolean isConsentFormAvailable() {
        return this.zzc.zzf();
    }

    @Override // com.google.android.ump.ConsentInformation
    public final void requestConsentInfoUpdate(Activity activity, c cVar, ConsentInformation.b bVar, ConsentInformation.a aVar) {
        synchronized (this.zzd) {
            this.zzf = true;
        }
        this.zzh = cVar;
        this.zzb.zzc(activity, cVar, bVar, aVar);
    }

    public final void reset() {
        this.zzc.zzd(null);
        this.zza.zze();
        synchronized (this.zzd) {
            this.zzf = false;
        }
    }

    public final void zza(Activity activity) {
        if (zzc() && !zzd()) {
            zzb(true);
            this.zzb.zzc(activity, this.zzh, new ConsentInformation.b() { // from class: com.google.android.gms.internal.consent_sdk.zzh
                @Override // com.google.android.ump.ConsentInformation.b
                public final void onConsentInfoUpdateSuccess() {
                    zzj.this.zzb(false);
                }
            }, new ConsentInformation.a() { // from class: com.google.android.gms.internal.consent_sdk.zzi
                @Override // com.google.android.ump.ConsentInformation.a
                public final void onConsentInfoUpdateFailure(d dVar) {
                    zzj.this.zzb(false);
                }
            });
            return;
        }
        zzc();
        zzd();
    }

    public final void zzb(boolean z10) {
        synchronized (this.zze) {
            this.zzg = z10;
        }
    }

    public final boolean zzc() {
        boolean z10;
        synchronized (this.zzd) {
            z10 = this.zzf;
        }
        return z10;
    }

    public final boolean zzd() {
        boolean z10;
        synchronized (this.zze) {
            z10 = this.zzg;
        }
        return z10;
    }
}
