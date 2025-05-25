package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzrw extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;
    private MediaFormat zzh;
    private MediaFormat zzi;
    private MediaCodec.CodecException zzj;
    private MediaCodec.CryptoException zzk;
    private long zzl;
    private boolean zzm;
    private IllegalStateException zzn;
    private zzsb zzo;
    private final Object zza = new Object();
    private final y.e zzd = new y.e();
    private final y.e zze = new y.e();
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();

    public zzrw(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    public static /* synthetic */ void zzd(zzrw zzrwVar) {
        synchronized (zzrwVar.zza) {
            if (zzrwVar.zzm) {
                return;
            }
            long j10 = zzrwVar.zzl - 1;
            zzrwVar.zzl = j10;
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 > 0) {
                return;
            }
            if (i10 < 0) {
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (zzrwVar.zza) {
                    zzrwVar.zzn = illegalStateException;
                }
                return;
            }
            zzrwVar.zzj();
        }
    }

    private final void zzi(MediaFormat mediaFormat) {
        this.zze.a(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzj() {
        if (!this.zzg.isEmpty()) {
            this.zzi = (MediaFormat) this.zzg.getLast();
        }
        y.e eVar = this.zzd;
        eVar.c = eVar.f31920b;
        y.e eVar2 = this.zze;
        eVar2.c = eVar2.f31920b;
        this.zzf.clear();
        this.zzg.clear();
    }

    private final void zzk() {
        IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.zzj;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.zzk;
                if (cryptoException == null) {
                    return;
                }
                this.zzk = null;
                throw cryptoException;
            }
            this.zzj = null;
            throw codecException;
        }
        this.zzn = null;
        throw illegalStateException;
    }

    private final boolean zzl() {
        if (this.zzl <= 0 && !this.zzm) {
            return false;
        }
        return true;
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.zza) {
            this.zzk = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        zzld zzldVar;
        zzld zzldVar2;
        synchronized (this.zza) {
            this.zzd.a(i10);
            zzsb zzsbVar = this.zzo;
            if (zzsbVar != null) {
                zzso zzsoVar = ((zzsm) zzsbVar).zza;
                zzldVar = zzsoVar.zzo;
                if (zzldVar != null) {
                    zzldVar2 = zzsoVar.zzo;
                    zzldVar2.zza();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        zzld zzldVar;
        zzld zzldVar2;
        synchronized (this.zza) {
            MediaFormat mediaFormat = this.zzi;
            if (mediaFormat != null) {
                zzi(mediaFormat);
                this.zzi = null;
            }
            this.zze.a(i10);
            this.zzf.add(bufferInfo);
            zzsb zzsbVar = this.zzo;
            if (zzsbVar != null) {
                zzso zzsoVar = ((zzsm) zzsbVar).zza;
                zzldVar = zzsoVar.zzo;
                if (zzldVar != null) {
                    zzldVar2 = zzsoVar.zzo;
                    zzldVar2.zza();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzi(mediaFormat);
            this.zzi = null;
        }
    }

    public final int zza() {
        boolean z10;
        synchronized (this.zza) {
            zzk();
            int i10 = -1;
            if (zzl()) {
                return -1;
            }
            y.e eVar = this.zzd;
            int i11 = eVar.f31920b;
            int i12 = eVar.c;
            if (i11 == i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (i11 != i12) {
                    i10 = eVar.f31919a[i11];
                    eVar.f31920b = (i11 + 1) & eVar.f31921d;
                } else {
                    throw new ArrayIndexOutOfBoundsException();
                }
            }
            return i10;
        }
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        boolean z10;
        synchronized (this.zza) {
            zzk();
            if (zzl()) {
                return -1;
            }
            y.e eVar = this.zze;
            int i10 = eVar.f31920b;
            int i11 = eVar.c;
            if (i10 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return -1;
            }
            if (i10 != i11) {
                int i12 = eVar.f31919a[i10];
                eVar.f31920b = (i10 + 1) & eVar.f31921d;
                if (i12 >= 0) {
                    zzdi.zzb(this.zzh);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i12 == -2) {
                    this.zzh = (MediaFormat) this.zzg.remove();
                    i12 = -2;
                }
                return i12;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public final MediaFormat zzc() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            mediaFormat = this.zzh;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void zze() {
        synchronized (this.zza) {
            this.zzl++;
            Handler handler = this.zzc;
            int i10 = zzet.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrv
                @Override // java.lang.Runnable
                public final void run() {
                    zzrw.zzd(zzrw.this);
                }
            });
        }
    }

    public final void zzf(MediaCodec mediaCodec) {
        boolean z10;
        if (this.zzc == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzf(z10);
        this.zzb.start();
        Handler handler = new Handler(this.zzb.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzg(zzsb zzsbVar) {
        synchronized (this.zza) {
            this.zzo = zzsbVar;
        }
    }

    public final void zzh() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzj();
        }
    }
}
