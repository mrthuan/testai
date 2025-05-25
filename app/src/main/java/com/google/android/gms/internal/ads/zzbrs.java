package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbrs extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbrs(zzbew zzbewVar) {
        zzbfd zzbfdVar;
        try {
            this.zzb = zzbewVar.zzg();
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbewVar.zzh()) {
                if (obj instanceof IBinder) {
                    zzbfdVar = zzbfc.zzg((IBinder) obj);
                } else {
                    zzbfdVar = null;
                }
                if (zzbfdVar != null) {
                    this.zza.add(new zzbru(zzbfdVar));
                }
            }
        } catch (RemoteException unused2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzb;
    }
}
