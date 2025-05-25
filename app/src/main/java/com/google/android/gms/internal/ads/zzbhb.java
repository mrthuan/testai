package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbhb extends UnifiedNativeAd {
    private final zzbha zza;
    private final zzbfe zzc;
    private final List zzb = new ArrayList();
    private final VideoController zzd = new VideoController();
    private final List zze = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:55:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0026 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbhb(com.google.android.gms.internal.ads.zzbha r6) {
        /*
            r5 = this;
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.zzb = r0
            com.google.android.gms.ads.VideoController r0 = new com.google.android.gms.ads.VideoController
            r0.<init>()
            r5.zzd = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.zze = r0
            r5.zza = r6
            r0 = 6
            r1 = 0
            java.util.List r6 = r6.zzu()     // Catch: android.os.RemoteException -> L5a
            if (r6 == 0) goto L5d
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L5a
        L26:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L5a
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L5a
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L5a
            if (r3 == 0) goto L4c
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L5a
            if (r2 != 0) goto L39
            goto L4c
        L39:
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch: android.os.RemoteException -> L5a
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzbfd     // Catch: android.os.RemoteException -> L5a
            if (r4 == 0) goto L46
            com.google.android.gms.internal.ads.zzbfd r3 = (com.google.android.gms.internal.ads.zzbfd) r3     // Catch: android.os.RemoteException -> L5a
            goto L4d
        L46:
            com.google.android.gms.internal.ads.zzbfb r3 = new com.google.android.gms.internal.ads.zzbfb     // Catch: android.os.RemoteException -> L5a
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L5a
            goto L4d
        L4c:
            r3 = r1
        L4d:
            if (r3 == 0) goto L26
            java.util.List r2 = r5.zzb     // Catch: android.os.RemoteException -> L5a
            com.google.android.gms.internal.ads.zzbfe r4 = new com.google.android.gms.internal.ads.zzbfe     // Catch: android.os.RemoteException -> L5a
            r4.<init>(r3)     // Catch: android.os.RemoteException -> L5a
            r2.add(r4)     // Catch: android.os.RemoteException -> L5a
            goto L26
        L5a:
            com.google.android.gms.ads.internal.util.client.zzm.g(r0)
        L5d:
            com.google.android.gms.internal.ads.zzbha r6 = r5.zza     // Catch: android.os.RemoteException -> L8c
            java.util.List r6 = r6.zzv()     // Catch: android.os.RemoteException -> L8c
            if (r6 == 0) goto L8f
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L8c
        L69:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L8c
            if (r2 == 0) goto L8f
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L8c
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L8c
            if (r3 == 0) goto L7e
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L8c
            com.google.android.gms.ads.internal.client.zzcw r2 = com.google.android.gms.ads.internal.client.zzcv.K(r2)     // Catch: android.os.RemoteException -> L8c
            goto L7f
        L7e:
            r2 = r1
        L7f:
            if (r2 == 0) goto L69
            java.util.List r3 = r5.zze     // Catch: android.os.RemoteException -> L8c
            com.google.android.gms.ads.internal.client.zzcx r4 = new com.google.android.gms.ads.internal.client.zzcx     // Catch: android.os.RemoteException -> L8c
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L8c
            r3.add(r4)     // Catch: android.os.RemoteException -> L8c
            goto L69
        L8c:
            com.google.android.gms.ads.internal.util.client.zzm.g(r0)
        L8f:
            com.google.android.gms.internal.ads.zzbha r6 = r5.zza     // Catch: android.os.RemoteException -> L9e
            com.google.android.gms.internal.ads.zzbfd r6 = r6.zzk()     // Catch: android.os.RemoteException -> L9e
            if (r6 == 0) goto La1
            com.google.android.gms.internal.ads.zzbfe r2 = new com.google.android.gms.internal.ads.zzbfe     // Catch: android.os.RemoteException -> L9e
            r2.<init>(r6)     // Catch: android.os.RemoteException -> L9e
            r1 = r2
            goto La1
        L9e:
            com.google.android.gms.ads.internal.util.client.zzm.g(r0)
        La1:
            r5.zzc = r1
            com.google.android.gms.internal.ads.zzbha r6 = r5.zza     // Catch: android.os.RemoteException -> Lb7
            com.google.android.gms.internal.ads.zzbew r6 = r6.zzi()     // Catch: android.os.RemoteException -> Lb7
            if (r6 == 0) goto Lb6
            com.google.android.gms.internal.ads.zzbex r6 = new com.google.android.gms.internal.ads.zzbex     // Catch: android.os.RemoteException -> Lb7
            com.google.android.gms.internal.ads.zzbha r1 = r5.zza     // Catch: android.os.RemoteException -> Lb7
            com.google.android.gms.internal.ads.zzbew r1 = r1.zzi()     // Catch: android.os.RemoteException -> Lb7
            r6.<init>(r1)     // Catch: android.os.RemoteException -> Lb7
        Lb6:
            return
        Lb7:
            com.google.android.gms.ads.internal.util.client.zzm.g(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhb.<init>(com.google.android.gms.internal.ads.zzbha):void");
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzz(bundle);
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzI(bundle);
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzB(bundle);
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController zza() {
        try {
            if (this.zza.zzh() != null) {
                this.zzd.b(this.zza.zzh());
            }
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double zzc() {
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

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zzd() {
        try {
            IObjectWrapper zzl = this.zza.zzl();
            if (zzl != null) {
                return ObjectWrapper.L0(zzl);
            }
            return null;
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zze() {
        try {
            return this.zza.zzn();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzf() {
        try {
            return this.zza.zzo();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzg() {
        try {
            return this.zza.zzp();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzh() {
        try {
            return this.zza.zzq();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzi() {
        try {
            return this.zza.zzs();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzj() {
        try {
            return this.zza.zzt();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List zzk() {
        return this.zzb;
    }
}
