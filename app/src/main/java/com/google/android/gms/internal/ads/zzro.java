package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzro implements zzsa {
    private final zzfvk zza;
    private final zzfvk zzb;
    private boolean zzc;

    public zzro(int i10) {
        zzrm zzrmVar = new zzrm(i10);
        zzrn zzrnVar = new zzrn(i10);
        this.zza = zzrmVar;
        this.zzb = zzrnVar;
        this.zzc = true;
    }

    public static /* synthetic */ HandlerThread zza(int i10) {
        String zzs;
        zzs = zzrq.zzs(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(zzs);
    }

    public static /* synthetic */ HandlerThread zzb(int i10) {
        String zzs;
        zzs = zzrq.zzs(i10, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(zzs);
    }

    public final zzrq zzc(zzrz zzrzVar) {
        MediaCodec mediaCodec;
        zzsd zzruVar;
        int i10;
        zzrq zzrqVar;
        String str = zzrzVar.zza.zza;
        zzrq zzrqVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                try {
                    if (this.zzc) {
                        zzaf zzafVar = zzrzVar.zzc;
                        int i11 = zzet.zza;
                        if (i11 >= 34 && (i11 >= 35 || zzbn.zzi(zzafVar.zzm))) {
                            zzruVar = new zztf(mediaCodec);
                            i10 = 4;
                            zzrqVar = new zzrq(mediaCodec, zza(((zzrm) this.zza).zza), zzruVar, null);
                            Trace.endSection();
                            zzrq.zzh(zzrqVar, zzrzVar.zzb, zzrzVar.zzd, null, i10);
                            return zzrqVar;
                        }
                    }
                    Trace.endSection();
                    zzrq.zzh(zzrqVar, zzrzVar.zzb, zzrzVar.zzd, null, i10);
                    return zzrqVar;
                } catch (Exception e10) {
                    e = e10;
                    zzrqVar2 = zzrqVar;
                    if (zzrqVar2 == null) {
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                    } else {
                        zzrqVar2.zzl();
                    }
                    throw e;
                }
                zzruVar = new zzru(mediaCodec, zzb(((zzrn) this.zzb).zza));
                i10 = 0;
                zzrqVar = new zzrq(mediaCodec, zza(((zzrm) this.zza).zza), zzruVar, null);
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodec = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsa
    public final /* bridge */ /* synthetic */ zzsc zzd(zzrz zzrzVar) {
        throw null;
    }

    public final void zze(boolean z10) {
        this.zzc = true;
    }
}
