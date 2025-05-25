package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzru implements zzsd {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzdm zzg;
    private boolean zzh;

    public zzru(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdm zzdmVar = new zzdm(zzdj.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdmVar;
        this.zzf = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ void zza(com.google.android.gms.internal.ads.zzru r9, android.os.Message r10) {
        /*
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L57
            r2 = 1
            if (r0 == r2) goto L36
            r2 = 2
            if (r0 == r2) goto L30
            r2 = 3
            if (r0 == r2) goto L1f
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            com.google.android.gms.internal.ads.zzrr.zza(r9, r1, r0)
            goto L71
        L1f:
            java.lang.Object r10 = r10.obj
            android.os.Bundle r10 = (android.os.Bundle) r10
            android.media.MediaCodec r0 = r9.zzc     // Catch: java.lang.RuntimeException -> L29
            r0.setParameters(r10)     // Catch: java.lang.RuntimeException -> L29
            goto L71
        L29:
            r10 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            com.google.android.gms.internal.ads.zzrr.zza(r9, r1, r10)
            goto L71
        L30:
            com.google.android.gms.internal.ads.zzdm r9 = r9.zzg
            r9.zze()
            goto L71
        L36:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.zzrt r10 = (com.google.android.gms.internal.ads.zzrt) r10
            int r3 = r10.zza
            android.media.MediaCodec$CryptoInfo r5 = r10.zzd
            long r6 = r10.zze
            int r8 = r10.zzf
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzru.zzb     // Catch: java.lang.RuntimeException -> L50
            monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L50
            android.media.MediaCodec r2 = r9.zzc     // Catch: java.lang.Throwable -> L4d
            r4 = 0
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            goto L70
        L4d:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            throw r2     // Catch: java.lang.RuntimeException -> L50
        L50:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            com.google.android.gms.internal.ads.zzrr.zza(r9, r1, r0)
            goto L70
        L57:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.zzrt r10 = (com.google.android.gms.internal.ads.zzrt) r10
            int r3 = r10.zza
            int r5 = r10.zzc
            long r6 = r10.zze
            int r8 = r10.zzf
            android.media.MediaCodec r2 = r9.zzc     // Catch: java.lang.RuntimeException -> L6a
            r4 = 0
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.RuntimeException -> L6a
            goto L70
        L6a:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            com.google.android.gms.internal.ads.zzrr.zza(r9, r1, r0)
        L70:
            r1 = r10
        L71:
            if (r1 == 0) goto L7e
            java.util.ArrayDeque r9 = com.google.android.gms.internal.ads.zzru.zza
            monitor-enter(r9)
            r9.add(r1)     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L7b
            return
        L7b:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L7b
            throw r10
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzru.zza(com.google.android.gms.internal.ads.zzru, android.os.Message):void");
    }

    private static zzrt zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzrt();
            }
            return (zzrt) arrayDeque.removeFirst();
        }
    }

    private static byte[] zzj(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= (length = bArr.length)) {
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    private static int[] zzk(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= (length = iArr.length)) {
            System.arraycopy(iArr, 0, iArr2, 0, length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                handler2.getClass();
                handler2.obtainMessage(2).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzd(int i10, int i11, int i12, long j10, int i13) {
        zzc();
        zzrt zzi = zzi();
        zzi.zza(i10, 0, i12, j10, i13);
        Handler handler = this.zze;
        int i14 = zzet.zza;
        handler.obtainMessage(0, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zze(int i10, int i11, zzha zzhaVar, long j10, int i12) {
        zzc();
        zzrt zzi = zzi();
        zzi.zza(i10, 0, 0, j10, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzi.zzd;
        cryptoInfo.numSubSamples = zzhaVar.zzf;
        cryptoInfo.numBytesOfClearData = zzk(zzhaVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzk(zzhaVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzj = zzj(zzhaVar.zzb, cryptoInfo.key);
        zzj.getClass();
        cryptoInfo.key = zzj;
        byte[] zzj2 = zzj(zzhaVar.zza, cryptoInfo.iv);
        zzj2.getClass();
        cryptoInfo.iv = zzj2;
        cryptoInfo.mode = zzhaVar.zzc;
        if (zzet.zza >= 24) {
            q.f();
            cryptoInfo.setPattern(com.bytedance.sdk.openadsdk.component.reward.b.c(zzhaVar.zzg, zzhaVar.zzh));
        }
        this.zze.obtainMessage(1, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzf(Bundle bundle) {
        zzc();
        Handler handler = this.zze;
        int i10 = zzet.zza;
        handler.obtainMessage(3, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzg() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzh() {
        if (!this.zzh) {
            this.zzd.start();
            this.zze = new zzrs(this, this.zzd.getLooper());
            this.zzh = true;
        }
    }
}
