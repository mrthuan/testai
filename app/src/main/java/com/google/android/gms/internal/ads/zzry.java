package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Trace;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzry implements zzsa {
    private final Context zza;

    @Deprecated
    public zzry() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    public final zzsc zzd(zzrz zzrzVar) {
        Context context;
        int i10 = zzet.zza;
        if (i10 >= 23 && (i10 >= 31 || ((context = this.zza) != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int zzb = zzbn.zzb(zzrzVar.zzc.zzm);
            zzea.zze("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzet.zzC(zzb)));
            zzro zzroVar = new zzro(zzb);
            zzroVar.zze(true);
            return zzroVar.zzc(zzrzVar);
        }
        MediaCodec mediaCodec = null;
        try {
            String str = zzrzVar.zza.zza;
            Trace.beginSection("createCodec:".concat(str));
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            try {
                Trace.beginSection("configureCodec");
                createByCodecName.configure(zzrzVar.zzb, zzrzVar.zzd, (MediaCrypto) null, 0);
                Trace.endSection();
                Trace.beginSection("startCodec");
                createByCodecName.start();
                Trace.endSection();
                return new zzte(createByCodecName, null);
            } catch (IOException | RuntimeException e10) {
                e = e10;
                mediaCodec = createByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (IOException e11) {
            e = e11;
        } catch (RuntimeException e12) {
            e = e12;
        }
    }

    public zzry(Context context) {
        this.zza = context;
    }
}
