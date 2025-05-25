package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import com.google.android.ump.ConsentInformation;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import x9.b;
import x9.d;
import x9.e;
import x9.f;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public final class zzbn {
    private final zzds zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();

    public zzbn(zzds zzdsVar, Executor executor) {
        this.zza = zzdsVar;
        this.zzb = executor;
    }

    public final /* synthetic */ void zza(zzbb zzbbVar) {
        final AtomicReference atomicReference = this.zzd;
        Objects.requireNonNull(atomicReference);
        zzbbVar.zzf(new f() { // from class: com.google.android.gms.internal.consent_sdk.zzbe
            @Override // x9.f
            public final void onConsentFormLoadSuccess(b bVar) {
                atomicReference.set(bVar);
            }
        }, new e() { // from class: com.google.android.gms.internal.consent_sdk.zzbf
            @Override // x9.e
            public final void onConsentFormLoadFailure(d dVar) {
                "Failed to load and cache a form, error=".concat(String.valueOf(dVar.f31632a));
            }
        });
    }

    public final void zzb(f fVar, e eVar) {
        zzcr.zza();
        zzbp zzbpVar = (zzbp) this.zzc.get();
        if (zzbpVar == null) {
            eVar.onConsentFormLoadFailure(new zzg(3, "No available form can be built.").zza());
        } else {
            ((zzav) this.zza.zza()).zza(zzbpVar).zzb().zza().zzf(fVar, eVar);
        }
    }

    public final void zzc() {
        zzbp zzbpVar = (zzbp) this.zzc.get();
        if (zzbpVar == null) {
            return;
        }
        final zzbb zza = ((zzav) this.zza.zza()).zza(zzbpVar).zzb().zza();
        zza.zza = true;
        zzcr.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbd
            @Override // java.lang.Runnable
            public final void run() {
                zzbn.this.zza(zza);
            }
        });
    }

    public final void zzd(zzbp zzbpVar) {
        this.zzc.set(zzbpVar);
    }

    public final void zze(Activity activity, final b.a aVar) {
        zzcr.zza();
        zzj zzb = zza.zza(activity).zzb();
        if (zzb == null) {
            zzcr.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbg
                @Override // java.lang.Runnable
                public final void run() {
                    b.a.this.a(new zzg(1, "No consentInformation.").zza());
                }
            });
        } else if (!zzb.isConsentFormAvailable() && zzb.getPrivacyOptionsRequirementStatus() != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            zzcr.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbh
                @Override // java.lang.Runnable
                public final void run() {
                    b.a.this.a(new zzg(3, "No valid response received yet.").zza());
                }
            });
            zzb.zza(activity);
        } else if (zzb.getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            zzcr.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbi
                @Override // java.lang.Runnable
                public final void run() {
                    b.a.this.a(new zzg(3, "Privacy options form is not required.").zza());
                }
            });
        } else {
            b bVar = (b) this.zzd.get();
            if (bVar == null) {
                zzcr.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbj
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.a.this.a(new zzg(3, "Privacy options form is being loading. Please try again later.").zza());
                    }
                });
                return;
            }
            bVar.show(activity, aVar);
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbk
                @Override // java.lang.Runnable
                public final void run() {
                    zzbn.this.zzc();
                }
            });
        }
    }

    public final boolean zzf() {
        if (this.zzc.get() != null) {
            return true;
        }
        return false;
    }
}
