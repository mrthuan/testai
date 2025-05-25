package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbrv extends NativeAd {
    private final zzbha zza;
    private final zzbru zzc;
    private final NativeAd.AdChoicesInfo zzd;
    private final List zzb = new ArrayList();
    private final List zze = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|2|3|(2:5|(5:8|(1:10)(1:17)|(3:12|13|14)(1:16)|15|6))|19|20|(2:22|(5:25|(1:27)(1:34)|(3:29|30|31)(1:33)|32|23))|36|37|(7:39|40|41|42|(2:44|45)|47|48)|52|40|41|42|(0)|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
        com.google.android.gms.ads.internal.util.client.zzm.g(6);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093 A[Catch: RemoteException -> 0x00a0, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00a0, blocks: (B:36:0x008b, B:38:0x0093), top: B:43:0x008b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbrv(com.google.android.gms.internal.ads.zzbha r6) {
        /*
            r5 = this;
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.zzb = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.zze = r0
            r5.zza = r6
            r0 = 6
            r1 = 0
            java.util.List r6 = r6.zzu()     // Catch: android.os.RemoteException -> L42
            if (r6 == 0) goto L45
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L42
        L1f:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L42
            if (r2 == 0) goto L45
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L42
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L42
            if (r3 == 0) goto L34
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L42
            com.google.android.gms.internal.ads.zzbfd r2 = com.google.android.gms.internal.ads.zzbfc.zzg(r2)     // Catch: android.os.RemoteException -> L42
            goto L35
        L34:
            r2 = r1
        L35:
            if (r2 == 0) goto L1f
            java.util.List r3 = r5.zzb     // Catch: android.os.RemoteException -> L42
            com.google.android.gms.internal.ads.zzbru r4 = new com.google.android.gms.internal.ads.zzbru     // Catch: android.os.RemoteException -> L42
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L42
            r3.add(r4)     // Catch: android.os.RemoteException -> L42
            goto L1f
        L42:
            com.google.android.gms.ads.internal.util.client.zzm.g(r0)
        L45:
            com.google.android.gms.internal.ads.zzbha r6 = r5.zza     // Catch: android.os.RemoteException -> L74
            java.util.List r6 = r6.zzv()     // Catch: android.os.RemoteException -> L74
            if (r6 == 0) goto L77
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L74
        L51:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L74
            if (r2 == 0) goto L77
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L74
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L74
            if (r3 == 0) goto L66
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.ads.internal.client.zzcw r2 = com.google.android.gms.ads.internal.client.zzcv.K(r2)     // Catch: android.os.RemoteException -> L74
            goto L67
        L66:
            r2 = r1
        L67:
            if (r2 == 0) goto L51
            java.util.List r3 = r5.zze     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.ads.internal.client.zzcx r4 = new com.google.android.gms.ads.internal.client.zzcx     // Catch: android.os.RemoteException -> L74
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L74
            r3.add(r4)     // Catch: android.os.RemoteException -> L74
            goto L51
        L74:
            com.google.android.gms.ads.internal.util.client.zzm.g(r0)
        L77:
            com.google.android.gms.internal.ads.zzbha r6 = r5.zza     // Catch: android.os.RemoteException -> L85
            com.google.android.gms.internal.ads.zzbfd r6 = r6.zzk()     // Catch: android.os.RemoteException -> L85
            if (r6 == 0) goto L88
            com.google.android.gms.internal.ads.zzbru r2 = new com.google.android.gms.internal.ads.zzbru     // Catch: android.os.RemoteException -> L85
            r2.<init>(r6)     // Catch: android.os.RemoteException -> L85
            goto L89
        L85:
            com.google.android.gms.ads.internal.util.client.zzm.g(r0)
        L88:
            r2 = r1
        L89:
            r5.zzc = r2
            com.google.android.gms.internal.ads.zzbha r6 = r5.zza     // Catch: android.os.RemoteException -> La0
            com.google.android.gms.internal.ads.zzbew r6 = r6.zzi()     // Catch: android.os.RemoteException -> La0
            if (r6 == 0) goto La3
            com.google.android.gms.internal.ads.zzbrs r6 = new com.google.android.gms.internal.ads.zzbrs     // Catch: android.os.RemoteException -> La0
            com.google.android.gms.internal.ads.zzbha r2 = r5.zza     // Catch: android.os.RemoteException -> La0
            com.google.android.gms.internal.ads.zzbew r2 = r2.zzi()     // Catch: android.os.RemoteException -> La0
            r6.<init>(r2)     // Catch: android.os.RemoteException -> La0
            r1 = r6
            goto La3
        La0:
            com.google.android.gms.ads.internal.util.client.zzm.g(r0)
        La3:
            r5.zzd = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbrv.<init>(com.google.android.gms.internal.ads.zzbha):void");
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.zza.zzw();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
        try {
            this.zza.zzx();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void enableCustomClickGesture() {
        try {
            this.zza.zzC();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getAdvertiser() {
        try {
            return this.zza.zzn();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getBody() {
        try {
            return this.zza.zzo();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getCallToAction() {
        try {
            return this.zza.zzp();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Bundle getExtras() {
        try {
            Bundle zzf = this.zza.zzf();
            if (zzf != null) {
                return zzf;
            }
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getHeadline() {
        try {
            return this.zza.zzq();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.Image getIcon() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final MediaContent getMediaContent() {
        try {
            if (this.zza.zzj() != null) {
                return new com.google.android.gms.ads.internal.client.zzep(this.zza.zzj(), null);
            }
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getPrice() {
        try {
            return this.zza.zzs();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdn zzdnVar;
        try {
            zzdnVar = this.zza.zzg();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            zzdnVar = null;
        }
        if (zzdnVar == null) {
            return null;
        }
        return new ResponseInfo(zzdnVar);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Double getStarRating() {
        try {
            double zze = this.zza.zze();
            if (zze == -1.0d) {
                return null;
            }
            return Double.valueOf(zze);
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getStore() {
        try {
            return this.zza.zzt();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zza.zzG();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zza.zzH();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            try {
                if (this.zza.zzH()) {
                    if (muteThisAdReason == null) {
                        this.zza.zzy(null);
                        return;
                    } else if (muteThisAdReason instanceof com.google.android.gms.ads.internal.client.zzcx) {
                        this.zza.zzy(((com.google.android.gms.ads.internal.client.zzcx) muteThisAdReason).f10123b);
                        return;
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzm.c("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
            }
            com.google.android.gms.ads.internal.util.client.zzm.c("Ad is not custom mute enabled");
        } catch (RemoteException unused2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzz(bundle);
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordCustomClickGesture() {
        try {
            this.zza.zzA();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzI(bundle);
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzB(bundle);
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.zza.zzD(new com.google.android.gms.ads.internal.client.zzct(muteThisAdListener));
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zza.zzE(new com.google.android.gms.ads.internal.client.zzfe(onPaidEventListener));
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setUnconfirmedClickListener(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.zza.zzF(new zzbsd(unconfirmedClickListener));
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Object zza() {
        try {
            return this.zza.zzm();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return null;
        }
    }
}
