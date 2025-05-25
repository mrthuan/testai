package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzqp implements zzpl {
    private static final Object zza = new Object();
    private static ExecutorService zzb;
    private static int zzc;
    private zzbq zzA;
    private boolean zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private long zzF;
    private int zzG;
    private boolean zzH;
    private boolean zzI;
    private long zzJ;
    private float zzK;
    private ByteBuffer zzL;
    private int zzM;
    private ByteBuffer zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzi zzT;
    private zzon zzU;
    private long zzV;
    private boolean zzW;
    private boolean zzX;
    private Looper zzY;
    private long zzZ;
    private long zzaa;
    private Handler zzab;
    private final zzqd zzac;
    private final zzpt zzad;
    private final Context zzd;
    private final zzpq zze;
    private final zzqz zzf;
    private final zzfxr zzg;
    private final zzfxr zzh;
    private final zzdm zzi;
    private final zzpp zzj;
    private final ArrayDeque zzk;
    private zzqn zzl;
    private final zzqi zzm;
    private final zzqi zzn;
    private zznz zzo;
    private zzpi zzp;
    private zzqc zzq;
    private zzqc zzr;
    private zzcq zzs;
    private AudioTrack zzt;
    private zzof zzu;
    private zzom zzv;
    private zzqh zzw;
    private zzh zzx;
    private zzqf zzy;
    private zzqf zzz;

    public /* synthetic */ zzqp(zzqb zzqbVar, zzqo zzqoVar) {
        Context context;
        zzof zzofVar;
        zzqd zzqdVar;
        zzpt zzptVar;
        context = zzqbVar.zza;
        this.zzd = context;
        zzh zzhVar = zzh.zza;
        this.zzx = zzhVar;
        if (context == null) {
            zzofVar = zzqbVar.zzb;
        } else {
            zzof zzofVar2 = zzof.zza;
            int i10 = zzet.zza;
            zzofVar = zzof.zzc(context, zzhVar, null);
        }
        this.zzu = zzofVar;
        zzqdVar = zzqbVar.zze;
        this.zzac = zzqdVar;
        int i11 = zzet.zza;
        zzptVar = zzqbVar.zzf;
        zzptVar.getClass();
        this.zzad = zzptVar;
        zzdm zzdmVar = new zzdm(zzdj.zza);
        this.zzi = zzdmVar;
        zzdmVar.zze();
        this.zzj = new zzpp(new zzqk(this, null));
        zzpq zzpqVar = new zzpq();
        this.zze = zzpqVar;
        zzqz zzqzVar = new zzqz();
        this.zzf = zzqzVar;
        this.zzg = zzfxr.zzp(new zzcx(), zzpqVar, zzqzVar);
        this.zzh = zzfxr.zzn(new zzqy());
        this.zzK = 1.0f;
        this.zzS = 0;
        this.zzT = new zzi(0, 0.0f);
        zzbq zzbqVar = zzbq.zza;
        this.zzz = new zzqf(zzbqVar, 0L, 0L, null);
        this.zzA = zzbqVar;
        this.zzB = false;
        this.zzk = new ArrayDeque();
        this.zzm = new zzqi(100L);
        this.zzn = new zzqi(100L);
    }

    public static /* bridge */ /* synthetic */ AudioTrack zzD(zzqp zzqpVar) {
        return zzqpVar.zzt;
    }

    public static /* synthetic */ void zzF(zzqp zzqpVar) {
        if (zzqpVar.zzaa >= 300000) {
            ((zzqu) zzqpVar.zzp).zza.zzm = true;
            zzqpVar.zzaa = 0L;
        }
    }

    public static /* bridge */ /* synthetic */ void zzG(zzqp zzqpVar, boolean z10) {
        zzqpVar.zzQ = true;
    }

    public static /* synthetic */ void zzH(AudioTrack audioTrack, final zzpi zzpiVar, Handler handler, final zzpf zzpfVar, zzdm zzdmVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzpiVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzpd zzpdVar;
                        zzpdVar = ((zzqu) zzpi.this).zza.zzc;
                        zzpdVar.zzd(zzpfVar);
                    }
                });
            }
            zzdmVar.zze();
            synchronized (zza) {
                int i10 = zzc - 1;
                zzc = i10;
                if (i10 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th2) {
            if (zzpiVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzpd zzpdVar;
                        zzpdVar = ((zzqu) zzpi.this).zza.zzc;
                        zzpdVar.zzd(zzpfVar);
                    }
                });
            }
            zzdmVar.zze();
            synchronized (zza) {
                int i11 = zzc - 1;
                zzc = i11;
                if (i11 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th2;
            }
        }
    }

    public final long zzJ() {
        zzqc zzqcVar = this.zzr;
        if (zzqcVar.zzc == 0) {
            return this.zzC / zzqcVar.zzb;
        }
        return this.zzD;
    }

    public final long zzK() {
        zzqc zzqcVar = this.zzr;
        if (zzqcVar.zzc == 0) {
            long j10 = this.zzE;
            long j11 = zzqcVar.zzd;
            int i10 = zzet.zza;
            return ((j10 + j11) - 1) / j11;
        }
        return this.zzF;
    }

    private final AudioTrack zzL(zzqc zzqcVar) {
        try {
            return zzqcVar.zza(this.zzx, this.zzS);
        } catch (zzph e10) {
            zzpi zzpiVar = this.zzp;
            if (zzpiVar != null) {
                zzpiVar.zza(e10);
            }
            throw e10;
        }
    }

    private final void zzM(long j10) {
        zzbq zzbqVar;
        boolean z10;
        zzpd zzpdVar;
        if (zzY()) {
            zzqd zzqdVar = this.zzac;
            zzbqVar = this.zzA;
            zzqdVar.zzc(zzbqVar);
        } else {
            zzbqVar = zzbq.zza;
        }
        zzbq zzbqVar2 = zzbqVar;
        this.zzA = zzbqVar2;
        if (zzY()) {
            zzqd zzqdVar2 = this.zzac;
            z10 = this.zzB;
            zzqdVar2.zzd(z10);
        } else {
            z10 = false;
        }
        this.zzB = z10;
        this.zzk.add(new zzqf(zzbqVar2, Math.max(0L, j10), zzet.zzs(zzK(), this.zzr.zze), null));
        zzT();
        zzpi zzpiVar = this.zzp;
        if (zzpiVar != null) {
            boolean z11 = this.zzB;
            zzpdVar = ((zzqu) zzpiVar).zza.zzc;
            zzpdVar.zzw(z11);
        }
    }

    private final void zzN() {
        if (!this.zzr.zzc()) {
            return;
        }
        this.zzW = true;
    }

    private final void zzO() {
        if (this.zzv == null && this.zzd != null) {
            this.zzY = Looper.myLooper();
            zzom zzomVar = new zzom(this.zzd, new zzpx(this), this.zzx, this.zzU);
            this.zzv = zzomVar;
            this.zzu = zzomVar.zzc();
        }
    }

    private final void zzP() {
        if (!this.zzP) {
            this.zzP = true;
            this.zzj.zzb(zzK());
            if (zzX(this.zzt)) {
                this.zzQ = false;
            }
            this.zzt.stop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0026, code lost:
        r0 = r2.zzL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0028, code lost:
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x002e, code lost:
        if (r0.hasRemaining() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0030, code lost:
        r2.zzs.zze(r2.zzL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzQ(long r3) {
        /*
            r2 = this;
            com.google.android.gms.internal.ads.zzcq r0 = r2.zzs
            boolean r0 = r0.zzh()
            if (r0 == 0) goto L39
        L8:
            com.google.android.gms.internal.ads.zzcq r0 = r2.zzs
            boolean r0 = r0.zzg()
            if (r0 != 0) goto L38
        L10:
            com.google.android.gms.internal.ads.zzcq r0 = r2.zzs
            java.nio.ByteBuffer r0 = r0.zzb()
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L26
            r2.zzU(r0, r3)
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L10
            goto L38
        L26:
            java.nio.ByteBuffer r0 = r2.zzL
            if (r0 == 0) goto L38
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.zzcq r0 = r2.zzs
            java.nio.ByteBuffer r1 = r2.zzL
            r0.zze(r1)
            goto L8
        L38:
            return
        L39:
            java.nio.ByteBuffer r0 = r2.zzL
            if (r0 != 0) goto L3f
            java.nio.ByteBuffer r0 = com.google.android.gms.internal.ads.zzct.zza
        L3f:
            r2.zzU(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqp.zzQ(long):void");
    }

    private final void zzR(zzbq zzbqVar) {
        zzqf zzqfVar = new zzqf(zzbqVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzW()) {
            this.zzy = zzqfVar;
        } else {
            this.zzz = zzqfVar;
        }
    }

    private final void zzS() {
        if (!zzW()) {
            return;
        }
        int i10 = zzet.zza;
        this.zzt.setVolume(this.zzK);
    }

    private final void zzT() {
        zzcq zzcqVar = this.zzr.zzi;
        this.zzs = zzcqVar;
        zzcqVar.zzc();
    }

    private final void zzU(ByteBuffer byteBuffer, long j10) {
        zzpi zzpiVar;
        boolean z10;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzN;
            boolean z11 = false;
            if (byteBuffer2 != null) {
                if (byteBuffer2 == byteBuffer) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzdi.zzd(z10);
            } else {
                this.zzN = byteBuffer;
                int i10 = zzet.zza;
            }
            int remaining = byteBuffer.remaining();
            int i11 = zzet.zza;
            int write = this.zzt.write(byteBuffer, remaining, 1);
            this.zzV = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((zzet.zza >= 24 && write == -6) || write == -32) {
                    if (zzK() <= 0) {
                        if (zzX(this.zzt)) {
                            zzN();
                        }
                    }
                    z11 = true;
                }
                zzpk zzpkVar = new zzpk(write, this.zzr.zza, z11);
                zzpi zzpiVar2 = this.zzp;
                if (zzpiVar2 != null) {
                    zzpiVar2.zza(zzpkVar);
                }
                if (!zzpkVar.zzb) {
                    this.zzn.zzb(zzpkVar);
                    return;
                } else {
                    this.zzu = zzof.zza;
                    throw zzpkVar;
                }
            }
            this.zzn.zza();
            if (zzX(this.zzt)) {
                if (this.zzF > 0) {
                    this.zzX = false;
                }
                if (this.zzR && (zzpiVar = this.zzp) != null && write < remaining) {
                    zzqu zzquVar = (zzqu) zzpiVar;
                }
            }
            int i12 = this.zzr.zzc;
            if (i12 == 0) {
                this.zzE += write;
            }
            if (write == remaining) {
                if (i12 != 0) {
                    if (byteBuffer == this.zzL) {
                        z11 = true;
                    }
                    zzdi.zzf(z11);
                    this.zzF = (this.zzG * this.zzM) + this.zzF;
                }
                this.zzN = null;
            }
        }
    }

    private final boolean zzV() {
        if (!this.zzs.zzh()) {
            ByteBuffer byteBuffer = this.zzN;
            if (byteBuffer == null) {
                return true;
            }
            zzU(byteBuffer, Long.MIN_VALUE);
            if (this.zzN != null) {
                return false;
            }
            return true;
        }
        this.zzs.zzd();
        zzQ(Long.MIN_VALUE);
        if (!this.zzs.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.zzN;
        if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
            return false;
        }
        return true;
    }

    private final boolean zzW() {
        if (this.zzt != null) {
            return true;
        }
        return false;
    }

    private static boolean zzX(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (zzet.zza >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final boolean zzY() {
        zzqc zzqcVar = this.zzr;
        if (zzqcVar.zzc == 0) {
            int i10 = zzqcVar.zza.zzB;
            return true;
        }
        return false;
    }

    public final void zzI(zzof zzofVar) {
        String name;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zzY;
        if (looper != myLooper) {
            String str = "null";
            if (looper == null) {
                name = "null";
            } else {
                name = looper.getThread().getName();
            }
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            }
            throw new IllegalStateException(a0.d.d("Current looper (", str, ") is not the playback looper (", name, ")"));
        } else if (!zzofVar.equals(this.zzu)) {
            this.zzu = zzofVar;
            zzpi zzpiVar = this.zzp;
            if (zzpiVar != null) {
                ((zzqu) zzpiVar).zza.zzB();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final int zza(zzaf zzafVar) {
        zzO();
        if ("audio/raw".equals(zzafVar.zzm)) {
            if (!zzet.zzK(zzafVar.zzB)) {
                a0.d.i("Invalid PCM encoding: ", zzafVar.zzB, "DefaultAudioSink");
                return 0;
            } else if (zzafVar.zzB == 2) {
                return 2;
            } else {
                return 1;
            }
        } else if (this.zzu.zzb(zzafVar, this.zzx) == null) {
            return 0;
        } else {
            return 2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final long zzb(boolean z10) {
        long zzp;
        if (zzW() && !this.zzI) {
            long min = Math.min(this.zzj.zza(z10), zzet.zzs(zzK(), this.zzr.zze));
            while (!this.zzk.isEmpty() && min >= ((zzqf) this.zzk.getFirst()).zzc) {
                this.zzz = (zzqf) this.zzk.remove();
            }
            long j10 = min - this.zzz.zzc;
            if (this.zzk.isEmpty()) {
                zzp = this.zzz.zzb + this.zzac.zza(j10);
            } else {
                zzqf zzqfVar = (zzqf) this.zzk.getFirst();
                zzp = zzqfVar.zzb - zzet.zzp(zzqfVar.zzc - min, this.zzz.zza.zzb);
            }
            long zzb2 = this.zzac.zzb();
            long zzs = zzet.zzs(zzb2, this.zzr.zze) + zzp;
            long j11 = this.zzZ;
            if (zzb2 > j11) {
                long zzs2 = zzet.zzs(zzb2 - j11, this.zzr.zze);
                this.zzZ = zzb2;
                this.zzaa += zzs2;
                if (this.zzab == null) {
                    this.zzab = new Handler(Looper.myLooper());
                }
                this.zzab.removeCallbacksAndMessages(null);
                this.zzab.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzqp.zzF(zzqp.this);
                    }
                }, 100L);
            }
            return zzs;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final zzbq zzc() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final zzoq zzd(zzaf zzafVar) {
        if (this.zzW) {
            return zzoq.zza;
        }
        return this.zzad.zza(zzafVar, this.zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zze(zzaf zzafVar, int i10, int[] iArr) {
        int intValue;
        zzcq zzcqVar;
        int i11;
        int intValue2;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int max;
        int zzb2;
        zzO();
        if ("audio/raw".equals(zzafVar.zzm)) {
            zzdi.zzd(zzet.zzK(zzafVar.zzB));
            i11 = zzet.zzm(zzafVar.zzB, zzafVar.zzz);
            zzfxo zzfxoVar = new zzfxo();
            zzfxoVar.zzh(this.zzg);
            zzfxoVar.zzg(this.zzac.zze());
            zzcq zzcqVar2 = new zzcq(zzfxoVar.zzi());
            if (zzcqVar2.equals(this.zzs)) {
                zzcqVar2 = this.zzs;
            }
            this.zzf.zzq(zzafVar.zzC, zzafVar.zzD);
            this.zze.zzo(iArr);
            try {
                zzcr zza2 = zzcqVar2.zza(new zzcr(zzafVar.zzA, zzafVar.zzz, zzafVar.zzB));
                intValue = zza2.zzd;
                i13 = zza2.zzb;
                int i17 = zza2.zzc;
                intValue2 = zzet.zzh(i17);
                zzcqVar = zzcqVar2;
                i12 = zzet.zzm(intValue, i17);
                i14 = 0;
            } catch (zzcs e10) {
                throw new zzpg(e10, zzafVar);
            }
        } else {
            zzcq zzcqVar3 = new zzcq(zzfxr.zzm());
            int i18 = zzafVar.zzA;
            zzoq zzoqVar = zzoq.zza;
            Pair zzb3 = this.zzu.zzb(zzafVar, this.zzx);
            if (zzb3 != null) {
                intValue = ((Integer) zzb3.first).intValue();
                zzcqVar = zzcqVar3;
                i11 = -1;
                intValue2 = ((Integer) zzb3.second).intValue();
                i12 = -1;
                i13 = i18;
                i14 = 2;
            } else {
                throw new zzpg("Unable to configure passthrough for: ".concat(String.valueOf(zzafVar)), zzafVar);
            }
        }
        if (intValue != 0) {
            if (intValue2 != 0) {
                int i19 = zzafVar.zzi;
                if ("audio/vnd.dts.hd;profile=lbr".equals(zzafVar.zzm) && i19 == -1) {
                    i19 = 768000;
                }
                int minBufferSize = AudioTrack.getMinBufferSize(i13, intValue2, intValue);
                if (minBufferSize != -2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzdi.zzf(z10);
                if (i12 != -1) {
                    i15 = i12;
                } else {
                    i15 = 1;
                }
                int i20 = 250000;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (intValue == 5) {
                            i20 = 500000;
                        } else if (intValue == 8) {
                            i20 = 1000000;
                            intValue = 8;
                        }
                        if (i19 != -1) {
                            zzb2 = zzgah.zzb(i19, 8, RoundingMode.CEILING);
                        } else {
                            zzb2 = zzqr.zzb(intValue);
                        }
                        i16 = i14;
                        max = zzgap.zzb((i20 * zzb2) / 1000000);
                    } else {
                        i16 = i14;
                        max = zzgap.zzb((zzqr.zzb(intValue) * 50000000) / 1000000);
                    }
                } else {
                    i16 = i14;
                    max = Math.max(zzqr.zza(250000, i13, i15), Math.min(minBufferSize * 4, zzqr.zza(750000, i13, i15)));
                }
                this.zzW = false;
                zzqc zzqcVar = new zzqc(zzafVar, i11, i16, i12, i13, intValue2, intValue, (((Math.max(minBufferSize, max) + i15) - 1) / i15) * i15, zzcqVar, false, false, false);
                if (zzW()) {
                    this.zzq = zzqcVar;
                    return;
                } else {
                    this.zzr = zzqcVar;
                    return;
                }
            }
            throw new zzpg("Invalid output channel config (mode=" + i14 + ") for: " + String.valueOf(zzafVar), zzafVar);
        }
        throw new zzpg("Invalid output encoding (mode=" + i14 + ") for: " + String.valueOf(zzafVar), zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzf() {
        zzqh zzqhVar;
        if (zzW()) {
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzE = 0L;
            this.zzF = 0L;
            this.zzX = false;
            this.zzG = 0;
            this.zzz = new zzqf(this.zzA, 0L, 0L, null);
            this.zzJ = 0L;
            this.zzy = null;
            this.zzk.clear();
            this.zzL = null;
            this.zzM = 0;
            this.zzN = null;
            this.zzP = false;
            this.zzO = false;
            this.zzQ = false;
            this.zzf.zzp();
            zzT();
            if (this.zzj.zzg()) {
                this.zzt.pause();
            }
            if (zzX(this.zzt)) {
                zzqn zzqnVar = this.zzl;
                zzqnVar.getClass();
                zzqnVar.zzb(this.zzt);
            }
            int i10 = zzet.zza;
            final zzpf zzb2 = this.zzr.zzb();
            zzqc zzqcVar = this.zzq;
            if (zzqcVar != null) {
                this.zzr = zzqcVar;
                this.zzq = null;
            }
            this.zzj.zzc();
            if (zzet.zza >= 24 && (zzqhVar = this.zzw) != null) {
                zzqhVar.zzb();
                this.zzw = null;
            }
            final AudioTrack audioTrack = this.zzt;
            final zzdm zzdmVar = this.zzi;
            final zzpi zzpiVar = this.zzp;
            zzdmVar.zzc();
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                if (zzb == null) {
                    zzb = zzet.zzE("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpu
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzqp.zzH(audioTrack, zzpiVar, handler, zzb2, zzdmVar);
                    }
                });
            }
            this.zzt = null;
        }
        this.zzn.zza();
        this.zzm.zza();
        this.zzZ = 0L;
        this.zzaa = 0L;
        Handler handler2 = this.zzab;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzg() {
        this.zzH = true;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzh() {
        this.zzR = false;
        if (zzW()) {
            if (this.zzj.zzj() || zzX(this.zzt)) {
                this.zzt.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzi() {
        this.zzR = true;
        if (zzW()) {
            this.zzj.zze();
            this.zzt.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzj() {
        if (!this.zzO && zzW() && zzV()) {
            zzP();
            this.zzO = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzk() {
        zzom zzomVar = this.zzv;
        if (zzomVar != null) {
            zzomVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzl() {
        zzf();
        zzfxr zzfxrVar = this.zzg;
        int size = zzfxrVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzct) zzfxrVar.get(i10)).zzf();
        }
        zzfxr zzfxrVar2 = this.zzh;
        int size2 = zzfxrVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((zzct) zzfxrVar2.get(i11)).zzf();
        }
        zzcq zzcqVar = this.zzs;
        if (zzcqVar != null) {
            zzcqVar.zzf();
        }
        this.zzR = false;
        this.zzW = false;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzm(zzh zzhVar) {
        if (this.zzx.equals(zzhVar)) {
            return;
        }
        this.zzx = zzhVar;
        zzom zzomVar = this.zzv;
        if (zzomVar != null) {
            zzomVar.zzg(zzhVar);
        }
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzn(int i10) {
        if (this.zzS != i10) {
            this.zzS = i10;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzo(zzi zziVar) {
        if (this.zzT.equals(zziVar)) {
            return;
        }
        if (this.zzt != null) {
            int i10 = this.zzT.zza;
        }
        this.zzT = zziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzp(zzpi zzpiVar) {
        this.zzp = zzpiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzq(int i10, int i11) {
        AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzX(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzr(zzbq zzbqVar) {
        this.zzA = new zzbq(Math.max(0.1f, Math.min(zzbqVar.zzb, 8.0f)), Math.max(0.1f, Math.min(zzbqVar.zzc, 8.0f)));
        zzR(zzbqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzs(zznz zznzVar) {
        this.zzo = zznzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzt(AudioDeviceInfo audioDeviceInfo) {
        zzon zzonVar;
        if (audioDeviceInfo == null) {
            zzonVar = null;
        } else {
            zzonVar = new zzon(audioDeviceInfo);
        }
        this.zzU = zzonVar;
        zzom zzomVar = this.zzv;
        if (zzomVar != null) {
            zzomVar.zzh(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzpy.zza(audioTrack, this.zzU);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzu(boolean z10) {
        this.zzB = z10;
        zzR(this.zzA);
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzv(float f10) {
        if (this.zzK != f10) {
            this.zzK = f10;
            zzS();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzpl
    public final boolean zzw(java.nio.ByteBuffer r25, long r26, int r28) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqp.zzw(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final boolean zzx() {
        boolean isOffloadedPlayback;
        if (zzW()) {
            if (zzet.zza >= 29) {
                isOffloadedPlayback = this.zzt.isOffloadedPlayback();
                if (isOffloadedPlayback && this.zzQ) {
                    return false;
                }
            }
            if (this.zzj.zzf(zzK())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final boolean zzy() {
        if (!zzW()) {
            return true;
        }
        if (this.zzO && !zzx()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final boolean zzz(zzaf zzafVar) {
        if (zza(zzafVar) != 0) {
            return true;
        }
        return false;
    }
}
