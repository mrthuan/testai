package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzawh extends zzaxd {
    public zzawh(zzavp zzavpVar, String str, String str2, zzaro zzaroVar, int i10, int i11) {
        super(zzavpVar, "FLgp79R6LGLnWDio6G1XBjsjORgKSjLkdakyn5bigQludVyQtVZMhDAlppvakfKf", "oPDFFWKd1EuWWR8iem/Fb2LK/5grpy+LhaDBlMcgIHs=", zzaroVar, i10, 24);
    }

    private final void zzc() {
        AdvertisingIdClient zzh = this.zza.zzh();
        if (zzh != null) {
            try {
                AdvertisingIdClient.Info info = zzh.getInfo();
                String id2 = info.getId();
                int i10 = zzavs.zza;
                if (id2 != null && id2.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                    UUID fromString = UUID.fromString(id2);
                    byte[] bArr = new byte[16];
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.putLong(fromString.getMostSignificantBits());
                    wrap.putLong(fromString.getLeastSignificantBits());
                    id2 = zzasz.zza(bArr, true);
                }
                if (id2 != null) {
                    synchronized (this.zzd) {
                        this.zzd.zzs(id2);
                        this.zzd.zzr(info.isLimitAdTrackingEnabled());
                        this.zzd.zzab(6);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxd, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzk();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaxd
    public final void zza() {
        if (!this.zza.zzq()) {
            synchronized (this.zzd) {
                this.zzd.zzs((String) this.zze.invoke(null, this.zza.zzb()));
            }
            return;
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaxd
    public final Void zzk() {
        if (this.zza.zzr()) {
            super.zzk();
            return null;
        }
        if (this.zza.zzq()) {
            zzc();
        }
        return null;
    }
}
