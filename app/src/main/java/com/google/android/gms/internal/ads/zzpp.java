package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.inmobi.commons.core.configs.CrashConfig;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzpp {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private final zzpo zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private zzpn zze;
    private int zzf;
    private boolean zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private Method zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzpp(zzpo zzpoVar) {
        this.zza = zzpoVar;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
    }

    private final long zzk() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = 2;
        if (this.zzx != -9223372036854775807L) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.zzz;
            }
            return Math.min(this.zzA, this.zzz + zzet.zzo(zzet.zzp(zzet.zzr(elapsedRealtime) - this.zzx, this.zzi), this.zzf));
        }
        if (elapsedRealtime - this.zzr >= 5) {
            AudioTrack audioTrack2 = this.zzc;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                long j10 = 0;
                if (this.zzg) {
                    if (playState == 2) {
                        if (playbackHeadPosition == 0) {
                            this.zzu = this.zzs;
                        }
                    } else {
                        i10 = playState;
                    }
                    playbackHeadPosition += this.zzu;
                    playState = i10;
                }
                if (zzet.zza <= 29) {
                    if (playbackHeadPosition == 0) {
                        if (this.zzs > 0 && playState == 3) {
                            if (this.zzy == -9223372036854775807L) {
                                this.zzy = elapsedRealtime;
                            }
                        }
                    } else {
                        j10 = playbackHeadPosition;
                    }
                    this.zzy = -9223372036854775807L;
                    playbackHeadPosition = j10;
                }
                if (this.zzs > playbackHeadPosition) {
                    this.zzt++;
                }
                this.zzs = playbackHeadPosition;
            }
            this.zzr = elapsedRealtime;
        }
        return this.zzs + this.zzH + (this.zzt << 32);
    }

    private final long zzl() {
        return zzet.zzs(zzk(), this.zzf);
    }

    private final void zzm() {
        this.zzk = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzl = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzj = false;
    }

    public final long zza(boolean z10) {
        long zzp;
        long j10;
        zzpi zzpiVar;
        zzpi zzpiVar2;
        zzpd zzpdVar;
        Method method;
        long zzJ;
        long zzK;
        long zzJ2;
        long zzK2;
        zzpp zzppVar = this;
        AudioTrack audioTrack = zzppVar.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - zzppVar.zzl >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                long zzl = zzl();
                if (zzl != 0) {
                    zzppVar.zzb[zzppVar.zzv] = zzet.zzq(zzl, zzppVar.zzi) - nanoTime;
                    zzppVar.zzv = (zzppVar.zzv + 1) % 10;
                    int i10 = zzppVar.zzw;
                    if (i10 < 10) {
                        zzppVar.zzw = i10 + 1;
                    }
                    zzppVar.zzl = nanoTime;
                    zzppVar.zzk = 0L;
                    int i11 = 0;
                    while (true) {
                        int i12 = zzppVar.zzw;
                        if (i11 >= i12) {
                            break;
                        }
                        zzppVar.zzk = (zzppVar.zzb[i11] / i12) + zzppVar.zzk;
                        i11++;
                    }
                }
            }
            if (!zzppVar.zzg) {
                zzpn zzpnVar = zzppVar.zze;
                zzpnVar.getClass();
                if (zzpnVar.zzg(nanoTime)) {
                    long zzb = zzpnVar.zzb();
                    long zza = zzpnVar.zza();
                    long zzl2 = zzl();
                    if (Math.abs(zzb - nanoTime) > 5000000) {
                        zzqp zzqpVar = ((zzqk) zzppVar.zza).zza;
                        zzJ2 = zzqpVar.zzJ();
                        zzK2 = zzqpVar.zzK();
                        StringBuilder h10 = androidx.activity.r.h("Spurious audio timestamp (system clock mismatch): ", zza, ", ");
                        h10.append(zzb);
                        h10.append(", ");
                        h10.append(nanoTime);
                        h10.append(", ");
                        h10.append(zzl2);
                        h10.append(", ");
                        h10.append(zzJ2);
                        h10.append(", ");
                        h10.append(zzK2);
                        zzea.zzf("DefaultAudioSink", h10.toString());
                        zzpnVar.zzd();
                    } else if (Math.abs(zzet.zzs(zza, zzppVar.zzf) - zzl2) > 5000000) {
                        zzqp zzqpVar2 = ((zzqk) zzppVar.zza).zza;
                        zzJ = zzqpVar2.zzJ();
                        zzK = zzqpVar2.zzK();
                        StringBuilder h11 = androidx.activity.r.h("Spurious audio timestamp (frame position mismatch): ", zza, ", ");
                        h11.append(zzb);
                        h11.append(", ");
                        h11.append(nanoTime);
                        h11.append(", ");
                        h11.append(zzl2);
                        h11.append(", ");
                        h11.append(zzJ);
                        h11.append(", ");
                        h11.append(zzK);
                        zzea.zzf("DefaultAudioSink", h11.toString());
                        zzpnVar.zzd();
                    } else {
                        zzpnVar.zzc();
                    }
                    zzppVar = this;
                }
                if (zzppVar.zzp && (method = zzppVar.zzm) != null && nanoTime - zzppVar.zzq >= 500000) {
                    try {
                        AudioTrack audioTrack2 = zzppVar.zzc;
                        audioTrack2.getClass();
                        int i13 = zzet.zza;
                        long intValue = (((Integer) method.invoke(audioTrack2, new Object[0])).intValue() * 1000) - zzppVar.zzh;
                        zzppVar.zzn = intValue;
                        long max = Math.max(intValue, 0L);
                        zzppVar.zzn = max;
                        if (max > 5000000) {
                            zzea.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                            zzppVar.zzn = 0L;
                        }
                    } catch (Exception unused) {
                        zzppVar.zzm = null;
                    }
                    zzppVar.zzq = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zzpn zzpnVar2 = zzppVar.zze;
        zzpnVar2.getClass();
        boolean zzf = zzpnVar2.zzf();
        if (zzf) {
            j10 = zzet.zzp(nanoTime2 - zzpnVar2.zzb(), zzppVar.zzi) + zzet.zzs(zzpnVar2.zza(), zzppVar.zzf);
        } else {
            if (zzppVar.zzw == 0) {
                zzp = zzl();
            } else {
                zzp = zzet.zzp(zzppVar.zzk + nanoTime2, zzppVar.zzi);
            }
            j10 = zzp;
            if (!z10) {
                j10 = Math.max(0L, j10 - zzppVar.zzn);
            }
        }
        if (zzppVar.zzD != zzf) {
            zzppVar.zzF = zzppVar.zzC;
            zzppVar.zzE = zzppVar.zzB;
        }
        long j11 = nanoTime2 - zzppVar.zzF;
        if (j11 < 1000000) {
            long j12 = (j11 * 1000) / 1000000;
            j10 = (((1000 - j12) * (zzet.zzp(j11, zzppVar.zzi) + zzppVar.zzE)) + (j10 * j12)) / 1000;
        }
        if (!zzppVar.zzj) {
            long j13 = zzppVar.zzB;
            if (j10 > j13) {
                zzppVar.zzj = true;
                int i14 = zzet.zza;
                long currentTimeMillis = System.currentTimeMillis() - zzet.zzu(zzet.zzq(zzet.zzu(j10 - j13), zzppVar.zzi));
                zzqp zzqpVar3 = ((zzqk) zzppVar.zza).zza;
                zzpiVar = zzqpVar3.zzp;
                if (zzpiVar != null) {
                    zzpiVar2 = zzqpVar3.zzp;
                    zzpdVar = ((zzqu) zzpiVar2).zza.zzc;
                    zzpdVar.zzv(currentTimeMillis);
                }
            }
        }
        zzppVar.zzC = nanoTime2;
        zzppVar.zzB = j10;
        zzppVar.zzD = zzf;
        return j10;
    }

    public final void zzb(long j10) {
        this.zzz = zzk();
        this.zzx = zzet.zzr(SystemClock.elapsedRealtime());
        this.zzA = j10;
    }

    public final void zzc() {
        zzm();
        this.zzc = null;
        this.zze = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.zzc = r3
            r2.zzd = r7
            com.google.android.gms.internal.ads.zzpn r0 = new com.google.android.gms.internal.ads.zzpn
            r0.<init>(r3)
            r2.zze = r0
            int r3 = r3.getSampleRate()
            r2.zzf = r3
            r3 = 0
            if (r4 == 0) goto L23
            int r4 = com.google.android.gms.internal.ads.zzet.zza
            r0 = 23
            if (r4 >= r0) goto L23
            r4 = 5
            r0 = 1
            if (r5 == r4) goto L24
            r4 = 6
            if (r5 != r4) goto L23
            r5 = r4
            goto L24
        L23:
            r0 = r3
        L24:
            r2.zzg = r0
            boolean r4 = com.google.android.gms.internal.ads.zzet.zzK(r5)
            r2.zzp = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r7 = r7 / r6
            long r4 = (long) r7
            int r6 = r2.zzf
            long r4 = com.google.android.gms.internal.ads.zzet.zzs(r4, r6)
            goto L3d
        L3c:
            r4 = r0
        L3d:
            r2.zzh = r4
            r4 = 0
            r2.zzs = r4
            r2.zzt = r4
            r2.zzG = r3
            r2.zzH = r4
            r2.zzu = r4
            r2.zzo = r3
            r2.zzx = r0
            r2.zzy = r0
            r2.zzq = r4
            r2.zzn = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.zzi = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpp.zzd(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void zze() {
        if (this.zzx != -9223372036854775807L) {
            this.zzx = zzet.zzr(SystemClock.elapsedRealtime());
        }
        zzpn zzpnVar = this.zze;
        zzpnVar.getClass();
        zzpnVar.zze();
    }

    public final boolean zzf(long j10) {
        if (j10 <= zzet.zzo(zza(false), this.zzf)) {
            if (this.zzg) {
                AudioTrack audioTrack = this.zzc;
                audioTrack.getClass();
                if (audioTrack.getPlayState() == 2 && zzk() == 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean zzg() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            return true;
        }
        return false;
    }

    public final boolean zzh(long j10) {
        if (this.zzy != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200) {
            return true;
        }
        return false;
    }

    public final boolean zzi(long j10) {
        zzpi zzpiVar;
        long j11;
        zzpi zzpiVar2;
        zzpd zzpdVar;
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.zzg) {
            if (playState == 2) {
                this.zzo = false;
                return false;
            } else if (playState == 1) {
                if (zzk() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z10 = this.zzo;
        boolean zzf = zzf(j10);
        this.zzo = zzf;
        if (z10 && !zzf && playState != 1) {
            zzpo zzpoVar = this.zza;
            int i10 = this.zzd;
            long zzu = zzet.zzu(this.zzh);
            zzqk zzqkVar = (zzqk) zzpoVar;
            zzqp zzqpVar = zzqkVar.zza;
            zzpiVar = zzqpVar.zzp;
            if (zzpiVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j11 = zzqpVar.zzV;
                zzpiVar2 = zzqkVar.zza.zzp;
                zzpdVar = ((zzqu) zzpiVar2).zza.zzc;
                zzpdVar.zzx(i10, zzu, elapsedRealtime - j11);
            }
        }
        return true;
    }

    public final boolean zzj() {
        zzm();
        if (this.zzx == -9223372036854775807L) {
            zzpn zzpnVar = this.zze;
            zzpnVar.getClass();
            zzpnVar.zze();
            return true;
        }
        this.zzz = zzk();
        return false;
    }
}
