package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public interface zzsc {
    int zza();

    int zzb(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzc();

    ByteBuffer zzf(int i10);

    ByteBuffer zzg(int i10);

    void zzi();

    void zzj(int i10, int i11, int i12, long j10, int i13);

    void zzk(int i10, int i11, zzha zzhaVar, long j10, int i12);

    void zzl();

    void zzm(int i10, long j10);

    void zzn(int i10, boolean z10);

    void zzo(Surface surface);

    void zzp(Bundle bundle);

    void zzq(int i10);

    boolean zzr(zzsb zzsbVar);
}
