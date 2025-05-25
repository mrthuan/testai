package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zznv implements zzlq, zznw {
    private final Context zza;
    private final zznx zzb;
    private final PlaybackSession zzc;
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private zzbp zzn;
    private zznu zzo;
    private zznu zzp;
    private zznu zzq;
    private zzaf zzr;
    private zzaf zzs;
    private zzaf zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzcb zze = new zzcb();
    private final zzca zzf = new zzca();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zznv(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zznt zzntVar = new zznt(zznt.zza);
        this.zzb = zzntVar;
        zzntVar.zzh(this);
    }

    public static zznv zzb(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager d10 = b9.f.d(context.getSystemService("media_metrics"));
        if (d10 != null) {
            createPlaybackSession = d10.createPlaybackSession();
            return new zznv(context, createPlaybackSession);
        }
        return null;
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzr(int i10) {
        switch (zzet.zzj(i10)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        long longValue;
        long longValue2;
        int i10;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l10 = (Long) this.zzg.get(this.zzi);
            PlaybackMetrics.Builder builder2 = this.zzj;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l11 = (Long) this.zzh.get(this.zzi);
            PlaybackMetrics.Builder builder3 = this.zzj;
            if (l11 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l11.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.zzj;
            if (l11 != null && l11.longValue() > 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            builder4.setStreamSource(i10);
            PlaybackSession playbackSession = this.zzc;
            build = this.zzj.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j10, zzaf zzafVar, int i10) {
        int i11;
        if (zzet.zzG(this.zzs, zzafVar)) {
            return;
        }
        if (this.zzs == null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        this.zzs = zzafVar;
        zzx(0, j10, zzafVar, i11);
    }

    private final void zzu(long j10, zzaf zzafVar, int i10) {
        int i11;
        if (zzet.zzG(this.zzt, zzafVar)) {
            return;
        }
        if (this.zzt == null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        this.zzt = zzafVar;
        zzx(2, j10, zzafVar, i11);
    }

    private final void zzv(zzcc zzccVar, zzui zzuiVar) {
        int zza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zzuiVar != null && (zza = zzccVar.zza(zzuiVar.zza)) != -1) {
            int i10 = 0;
            zzccVar.zzd(zza, this.zzf, false);
            zzccVar.zze(this.zzf.zzc, this.zze, 0L);
            zzax zzaxVar = this.zze.zzd.zzb;
            int i11 = 2;
            if (zzaxVar != null) {
                int zzn = zzet.zzn(zzaxVar.zza);
                if (zzn != 0) {
                    if (zzn != 1) {
                        if (zzn != 2) {
                            i10 = 1;
                        } else {
                            i10 = 4;
                        }
                    } else {
                        i10 = 5;
                    }
                } else {
                    i10 = 3;
                }
            }
            builder.setStreamType(i10);
            zzcb zzcbVar = this.zze;
            long j10 = zzcbVar.zzm;
            if (j10 != -9223372036854775807L && !zzcbVar.zzk && !zzcbVar.zzi && !zzcbVar.zzb()) {
                builder.setMediaDurationMillis(zzet.zzu(j10));
            }
            if (true != this.zze.zzb()) {
                i11 = 1;
            }
            builder.setPlaybackType(i11);
            this.zzz = true;
        }
    }

    private final void zzw(long j10, zzaf zzafVar, int i10) {
        int i11;
        if (zzet.zzG(this.zzr, zzafVar)) {
            return;
        }
        if (this.zzr == null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        this.zzr = zzafVar;
        zzx(1, j10, zzafVar, i11);
    }

    private final void zzx(int i10, long j10, zzaf zzafVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i12;
        String str;
        timeSinceCreatedMillis = k.e(i10).setTimeSinceCreatedMillis(j10 - this.zzd);
        if (zzafVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i11 != 1) {
                i12 = 1;
            } else {
                i12 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str2 = zzafVar.zzl;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = zzafVar.zzm;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = zzafVar.zzj;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i13 = zzafVar.zzi;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = zzafVar.zzr;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = zzafVar.zzs;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = zzafVar.zzz;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = zzafVar.zzA;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str5 = zzafVar.zzd;
            if (str5 != null) {
                int i18 = zzet.zza;
                String[] split = str5.split("-", -1);
                String str6 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = zzafVar.zzt;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        PlaybackSession playbackSession = this.zzc;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    private final boolean zzy(zznu zznuVar) {
        if (zznuVar != null) {
            if (zznuVar.zzc.equals(this.zzb.zze())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final LogSessionId zza() {
        LogSessionId sessionId;
        sessionId = this.zzc.getSessionId();
        return sessionId;
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzc(zzlo zzloVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        zzui zzuiVar = zzloVar.zzd;
        if (zzuiVar != null && zzuiVar.zzb()) {
            return;
        }
        zzs();
        this.zzi = str;
        playerName = n.c().setPlayerName("AndroidXMedia3");
        playerVersion = playerName.setPlayerVersion("1.4.0-alpha02");
        this.zzj = playerVersion;
        zzv(zzloVar.zzb, zzloVar.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzd(zzlo zzloVar, String str, boolean z10) {
        zzui zzuiVar = zzloVar.zzd;
        if ((zzuiVar == null || !zzuiVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzf(zzlo zzloVar, int i10, long j10, long j11) {
        long longValue;
        zzui zzuiVar = zzloVar.zzd;
        if (zzuiVar != null) {
            zznx zznxVar = this.zzb;
            zzcc zzccVar = zzloVar.zzb;
            HashMap hashMap = this.zzh;
            String zzf = zznxVar.zzf(zzccVar, zzuiVar);
            Long l10 = (Long) hashMap.get(zzf);
            Long l11 = (Long) this.zzg.get(zzf);
            HashMap hashMap2 = this.zzh;
            long j12 = 0;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            hashMap2.put(zzf, Long.valueOf(longValue + j10));
            HashMap hashMap3 = this.zzg;
            if (l11 != null) {
                j12 = l11.longValue();
            }
            hashMap3.put(zzf, Long.valueOf(j12 + i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzg(zzlo zzloVar, zzue zzueVar) {
        zzui zzuiVar = zzloVar.zzd;
        if (zzuiVar != null) {
            zzaf zzafVar = zzueVar.zzb;
            zzafVar.getClass();
            zznu zznuVar = new zznu(zzafVar, 0, this.zzb.zzf(zzloVar.zzb, zzuiVar));
            int i10 = zzueVar.zza;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return;
                        }
                        this.zzq = zznuVar;
                        return;
                    }
                } else {
                    this.zzp = zznuVar;
                    return;
                }
            }
            this.zzo = zznuVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:273:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzlq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(com.google.android.gms.internal.ads.zzbw r18, com.google.android.gms.internal.ads.zzlp r19) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznv.zzi(com.google.android.gms.internal.ads.zzbw, com.google.android.gms.internal.ads.zzlp):void");
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzl(zzlo zzloVar, zzbp zzbpVar) {
        this.zzn = zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzm(zzlo zzloVar, zzbv zzbvVar, zzbv zzbvVar2, int i10) {
        if (i10 == 1) {
            this.zzu = true;
            i10 = 1;
        }
        this.zzk = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzo(zzlo zzloVar, zzhn zzhnVar) {
        this.zzw += zzhnVar.zzg;
        this.zzx += zzhnVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzq(zzlo zzloVar, zzcp zzcpVar) {
        zznu zznuVar = this.zzo;
        if (zznuVar != null) {
            zzaf zzafVar = zznuVar.zza;
            if (zzafVar.zzs == -1) {
                zzad zzb = zzafVar.zzb();
                zzb.zzac(zzcpVar.zzb);
                zzb.zzI(zzcpVar.zzc);
                this.zzo = new zznu(zzb.zzad(), 0, zznuVar.zzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final /* synthetic */ void zzk(zzlo zzloVar, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final /* synthetic */ void zze(zzlo zzloVar, zzaf zzafVar, zzho zzhoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final /* synthetic */ void zzh(zzlo zzloVar, int i10, long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final /* synthetic */ void zzn(zzlo zzloVar, Object obj, long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final /* synthetic */ void zzp(zzlo zzloVar, zzaf zzafVar, zzho zzhoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzj(zzlo zzloVar, zztz zztzVar, zzue zzueVar, IOException iOException, boolean z10) {
    }
}
