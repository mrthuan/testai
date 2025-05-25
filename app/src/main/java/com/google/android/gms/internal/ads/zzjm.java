package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Pair;
import android.view.Surface;
import com.adjust.sdk.network.ErrorCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzjm extends zzj implements zzih {
    public static final /* synthetic */ int zzd = 0;
    private boolean zzA;
    private int zzB;
    private zzlj zzC;
    private zzig zzD;
    private zzbt zzE;
    private zzbh zzF;
    private Object zzG;
    private Surface zzH;
    private int zzI;
    private zzel zzJ;
    private int zzK;
    private zzh zzL;
    private float zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private int zzQ;
    private zzbh zzR;
    private zzkx zzS;
    private int zzT;
    private long zzU;
    private final zzii zzV;
    private zzwa zzW;
    final zzyc zzb;
    final zzbt zzc;
    private final zzdm zze;
    private final Context zzf;
    private final zzbw zzg;
    private final zzle[] zzh;
    private final zzyb zzi;
    private final zzdt zzj;
    private final zzjx zzk;
    private final zzdz zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzca zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzln zzq;
    private final Looper zzr;
    private final zzyj zzs;
    private final zzdj zzt;
    private final zzji zzu;
    private final zzjk zzv;
    private final zzhl zzw;
    private final long zzx;
    private int zzy;
    private int zzz;

    static {
        zzbd.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.android.gms.internal.ads.zzyi, java.lang.Object, com.google.android.gms.internal.ads.zzln] */
    @SuppressLint({"HandlerLeak"})
    public zzjm(zzif zzifVar, zzbw zzbwVar) {
        zznz zza;
        int generateAudioSessionId;
        zzdm zzdmVar = new zzdm(zzdj.zza);
        this.zze = zzdmVar;
        try {
            zzea.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0-alpha02] [" + zzet.zze + "]");
            Context applicationContext = zzifVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            ?? apply = zzifVar.zzh.apply(zzifVar.zzb);
            this.zzq = apply;
            this.zzQ = zzifVar.zzj;
            this.zzL = zzifVar.zzk;
            this.zzI = zzifVar.zzl;
            this.zzN = false;
            this.zzx = zzifVar.zzp;
            zzji zzjiVar = new zzji(this, null);
            this.zzu = zzjiVar;
            zzjk zzjkVar = new zzjk(null);
            this.zzv = zzjkVar;
            Handler handler = new Handler(zzifVar.zzi);
            zzle[] zza2 = ((zzhy) zzifVar.zzc).zza.zza(handler, zzjiVar, zzjiVar, zzjiVar, zzjiVar);
            this.zzh = zza2;
            int length = zza2.length;
            zzyb zzybVar = (zzyb) zzifVar.zze.zza();
            this.zzi = zzybVar;
            zzif.zza(((zzhz) zzifVar.zzd).zza);
            zzyn zzg = zzyn.zzg(((zzic) zzifVar.zzg).zza);
            this.zzs = zzg;
            this.zzp = zzifVar.zzm;
            this.zzC = zzifVar.zzn;
            Looper looper = zzifVar.zzi;
            this.zzr = looper;
            zzdj zzdjVar = zzifVar.zzb;
            this.zzt = zzdjVar;
            this.zzg = zzbwVar;
            zzdz zzdzVar = new zzdz(looper, zzdjVar, new zzdx(this) { // from class: com.google.android.gms.internal.ads.zzjc
                @Override // com.google.android.gms.internal.ads.zzdx
                public final void zza(Object obj, zzab zzabVar) {
                    zzbu zzbuVar = (zzbu) obj;
                }
            });
            this.zzl = zzdzVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzW = new zzwa(0);
            this.zzD = zzig.zza;
            int length2 = zza2.length;
            zzyc zzycVar = new zzyc(new zzli[2], new zzxv[2], zzck.zza, null);
            this.zzb = zzycVar;
            this.zzn = new zzca();
            zzbr zzbrVar = new zzbr();
            zzbrVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzybVar.zzn();
            zzbrVar.zzd(29, true);
            zzbrVar.zzd(23, false);
            zzbrVar.zzd(25, false);
            zzbrVar.zzd(33, false);
            zzbrVar.zzd(26, false);
            zzbrVar.zzd(34, false);
            zzbt zze = zzbrVar.zze();
            this.zzc = zze;
            zzbr zzbrVar2 = new zzbr();
            zzbrVar2.zzb(zze);
            zzbrVar2.zza(4);
            zzbrVar2.zza(10);
            this.zzE = zzbrVar2.zze();
            this.zzj = zzdjVar.zzb(looper, null);
            zzii zziiVar = new zzii(this);
            this.zzV = zziiVar;
            this.zzS = zzkx.zzg(zzycVar);
            apply.zzR(zzbwVar, looper);
            if (zzet.zza < 31) {
                zza = new zznz(zzifVar.zzs);
            } else {
                zza = zzjd.zza(applicationContext, this, zzifVar.zzq, zzifVar.zzs);
            }
            this.zzk = new zzjx(zza2, zzybVar, zzycVar, (zzkb) zzifVar.zzf.zza(), zzg, 0, false, apply, this.zzC, zzifVar.zzt, zzifVar.zzo, false, false, looper, zzdjVar, zziiVar, zza, null, this.zzD);
            this.zzM = 1.0f;
            zzbh zzbhVar = zzbh.zza;
            this.zzF = zzbhVar;
            this.zzR = zzbhVar;
            this.zzT = -1;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
            if (audioManager == null) {
                generateAudioSessionId = -1;
            } else {
                generateAudioSessionId = audioManager.generateAudioSessionId();
            }
            this.zzK = generateAudioSessionId;
            int i10 = zzdc.zza;
            this.zzO = true;
            apply.getClass();
            zzdzVar.zzb(apply);
            zzg.zze(new Handler(looper), apply);
            copyOnWriteArraySet.add(zzjiVar);
            new zzhh(zzifVar.zza, handler, zzjiVar);
            this.zzw = new zzhl(zzifVar.zza, handler, zzjiVar);
            zzet.zzG(null, null);
            PowerManager powerManager = (PowerManager) zzifVar.zza.getApplicationContext().getSystemService("power");
            WifiManager wifiManager = (WifiManager) zzifVar.zza.getApplicationContext().getSystemService("wifi");
            new zzs(0).zza();
            zzcp zzcpVar = zzcp.zza;
            this.zzJ = zzel.zza;
            zzybVar.zzk(this.zzL);
            zzab(1, 10, Integer.valueOf(this.zzK));
            zzab(2, 10, Integer.valueOf(this.zzK));
            zzab(1, 3, this.zzL);
            zzab(2, 4, Integer.valueOf(this.zzI));
            zzab(2, 5, 0);
            zzab(1, 9, Boolean.valueOf(this.zzN));
            zzab(2, 7, zzjkVar);
            zzab(6, 8, zzjkVar);
            zzab(-1, 16, Integer.valueOf(this.zzQ));
            zzdmVar.zze();
        } catch (Throwable th2) {
            this.zze.zze();
            throw th2;
        }
    }

    public static /* bridge */ /* synthetic */ void zzK(zzjm zzjmVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzjmVar.zzad(surface);
        zzjmVar.zzH = surface;
    }

    private final int zzR(zzkx zzkxVar) {
        if (zzkxVar.zza.zzo()) {
            return this.zzT;
        }
        return zzkxVar.zza.zzn(zzkxVar.zzb.zza, this.zzn).zzc;
    }

    public static int zzS(boolean z10, int i10) {
        if (!z10 || i10 == 1) {
            return 1;
        }
        return 2;
    }

    private final long zzT(zzkx zzkxVar) {
        if (zzkxVar.zzb.zzb()) {
            zzkxVar.zza.zzn(zzkxVar.zzb.zza, this.zzn);
            long j10 = zzkxVar.zzc;
            if (j10 == -9223372036854775807L) {
                long j11 = zzkxVar.zza.zze(zzR(zzkxVar), this.zza, 0L).zzl;
                return zzet.zzu(0L);
            }
            return zzet.zzu(j10) + zzet.zzu(0L);
        }
        return zzet.zzu(zzU(zzkxVar));
    }

    private final long zzU(zzkx zzkxVar) {
        if (zzkxVar.zza.zzo()) {
            return zzet.zzr(this.zzU);
        }
        long j10 = zzkxVar.zzr;
        if (zzkxVar.zzb.zzb()) {
            return j10;
        }
        zzW(zzkxVar.zza, zzkxVar.zzb, j10);
        return j10;
    }

    private static long zzV(zzkx zzkxVar) {
        zzcb zzcbVar = new zzcb();
        zzca zzcaVar = new zzca();
        zzkxVar.zza.zzn(zzkxVar.zzb.zza, zzcaVar);
        long j10 = zzkxVar.zzc;
        if (j10 == -9223372036854775807L) {
            long j11 = zzkxVar.zza.zze(zzcaVar.zzc, zzcbVar, 0L).zzl;
            return 0L;
        }
        return j10;
    }

    private final long zzW(zzcc zzccVar, zzui zzuiVar, long j10) {
        zzccVar.zzn(zzuiVar.zza, this.zzn);
        return j10;
    }

    private final Pair zzX(zzcc zzccVar, int i10, long j10) {
        if (zzccVar.zzo()) {
            this.zzT = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.zzU = j10;
            return null;
        }
        if (i10 == -1 || i10 >= zzccVar.zzc()) {
            i10 = zzccVar.zzg(false);
            long j11 = zzccVar.zze(i10, this.zza, 0L).zzl;
            j10 = zzet.zzu(0L);
        }
        return zzccVar.zzl(this.zza, this.zzn, i10, zzet.zzr(j10));
    }

    private final zzkx zzY(zzkx zzkxVar, zzcc zzccVar, Pair pair) {
        boolean z10;
        zzui zzuiVar;
        zzwi zzwiVar;
        zzyc zzycVar;
        List list;
        int i10;
        long j10;
        if (!zzccVar.zzo() && pair == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        zzdi.zzd(z10);
        zzcc zzccVar2 = zzkxVar.zza;
        long zzT = zzT(zzkxVar);
        zzkx zzf = zzkxVar.zzf(zzccVar);
        if (zzccVar.zzo()) {
            zzui zzh = zzkx.zzh();
            long zzr = zzet.zzr(this.zzU);
            zzkx zza = zzf.zzb(zzh, zzr, zzr, zzr, 0L, zzwi.zza, this.zzb, zzfxr.zzm()).zza(zzh);
            zza.zzp = zza.zzr;
            return zza;
        }
        Object obj = zzf.zzb.zza;
        int i11 = zzet.zza;
        boolean z11 = !obj.equals(pair.first);
        if (z11) {
            zzuiVar = new zzui(pair.first, -1L);
        } else {
            zzuiVar = zzf.zzb;
        }
        zzui zzuiVar2 = zzuiVar;
        long longValue = ((Long) pair.second).longValue();
        long zzr2 = zzet.zzr(zzT);
        if (!zzccVar2.zzo()) {
            zzccVar2.zzn(obj, this.zzn);
        }
        if (!z11 && longValue >= zzr2) {
            if (i10 == 0) {
                int zza2 = zzccVar.zza(zzf.zzk.zza);
                if (zza2 == -1 || zzccVar.zzd(zza2, this.zzn, false).zzc != zzccVar.zzn(zzuiVar2.zza, this.zzn).zzc) {
                    zzccVar.zzn(zzuiVar2.zza, this.zzn);
                    if (zzuiVar2.zzb()) {
                        j10 = this.zzn.zzh(zzuiVar2.zzb, zzuiVar2.zzc);
                    } else {
                        j10 = this.zzn.zzd;
                    }
                    zzkx zza3 = zzf.zzb(zzuiVar2, zzf.zzr, zzf.zzr, zzf.zzd, j10 - zzf.zzr, zzf.zzh, zzf.zzi, zzf.zzj).zza(zzuiVar2);
                    zza3.zzp = j10;
                    return zza3;
                }
                return zzf;
            }
            zzdi.zzf(!zzuiVar2.zzb());
            long max = Math.max(0L, zzf.zzq - (longValue - zzr2));
            long j11 = zzf.zzp;
            if (zzf.zzk.equals(zzf.zzb)) {
                j11 = longValue + max;
            }
            zzkx zzb = zzf.zzb(zzuiVar2, longValue, longValue, longValue, max, zzf.zzh, zzf.zzi, zzf.zzj);
            zzb.zzp = j11;
            return zzb;
        }
        zzdi.zzf(!zzuiVar2.zzb());
        if (z11) {
            zzwiVar = zzwi.zza;
        } else {
            zzwiVar = zzf.zzh;
        }
        zzwi zzwiVar2 = zzwiVar;
        if (z11) {
            zzycVar = this.zzb;
        } else {
            zzycVar = zzf.zzi;
        }
        zzyc zzycVar2 = zzycVar;
        if (z11) {
            list = zzfxr.zzm();
        } else {
            list = zzf.zzj;
        }
        zzkx zza4 = zzf.zzb(zzuiVar2, longValue, longValue, longValue, 0L, zzwiVar2, zzycVar2, list).zza(zzuiVar2);
        zza4.zzp = longValue;
        return zza4;
    }

    private final zzla zzZ(zzkz zzkzVar) {
        int zzR = zzR(this.zzS);
        zzcc zzccVar = this.zzS.zza;
        if (zzR == -1) {
            zzR = 0;
        }
        zzdj zzdjVar = this.zzt;
        zzjx zzjxVar = this.zzk;
        return new zzla(zzjxVar, zzkzVar, zzccVar, zzR, zzdjVar, zzjxVar.zzc());
    }

    public final void zzaa(final int i10, final int i11) {
        if (i10 == this.zzJ.zzb() && i11 == this.zzJ.zza()) {
            return;
        }
        this.zzJ = new zzel(i10, i11);
        zzdz zzdzVar = this.zzl;
        zzdzVar.zzd(24, new zzdw() { // from class: com.google.android.gms.internal.ads.zziz
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                int i12 = zzjm.zzd;
                ((zzbu) obj).zzo(i10, i11);
            }
        });
        zzdzVar.zzc();
        zzab(2, 14, new zzel(i10, i11));
    }

    private final void zzab(int i10, int i11, Object obj) {
        zzle[] zzleVarArr = this.zzh;
        int length = zzleVarArr.length;
        for (int i12 = 0; i12 < 2; i12++) {
            zzle zzleVar = zzleVarArr[i12];
            if (i10 == -1 || zzleVar.zzb() == i10) {
                zzla zzZ = zzZ(zzleVar);
                zzZ.zzf(i11);
                zzZ.zze(obj);
                zzZ.zzd();
            }
        }
    }

    public final void zzac() {
        zzab(1, 2, Float.valueOf(this.zzM * this.zzw.zza()));
    }

    public final void zzad(Object obj) {
        ArrayList arrayList = new ArrayList();
        zzle[] zzleVarArr = this.zzh;
        int length = zzleVarArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < 2; i10++) {
            zzle zzleVar = zzleVarArr[i10];
            if (zzleVar.zzb() == 2) {
                zzla zzZ = zzZ(zzleVar);
                zzZ.zzf(1);
                zzZ.zze(obj);
                zzZ.zzd();
                arrayList.add(zzZ);
            }
        }
        Object obj2 = this.zzG;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzla) it.next()).zzi(this.zzx);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj3 = this.zzG;
            Surface surface = this.zzH;
            if (obj3 == surface) {
                surface.release();
                this.zzH = null;
            }
        }
        this.zzG = obj;
        if (z10) {
            zzae(zzhw.zzd(new zzjy(3), ErrorCodes.MALFORMED_URL_EXCEPTION));
        }
    }

    private final void zzae(zzhw zzhwVar) {
        zzkx zzkxVar = this.zzS;
        zzkx zza = zzkxVar.zza(zzkxVar.zzb);
        zza.zzp = zza.zzr;
        zza.zzq = 0L;
        zzkx zze = zza.zze(1);
        if (zzhwVar != null) {
            zze = zze.zzd(zzhwVar);
        }
        this.zzy++;
        this.zzk.zzn();
        zzag(zze, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void zzaf(boolean z10, int i10, int i11) {
        boolean z11;
        int i12 = 0;
        if (z10 && i10 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        zzkx zzkxVar = this.zzS;
        if (zzkxVar.zzl == z11 && zzkxVar.zzm == i12) {
            return;
        }
        this.zzy++;
        zzkx zzc = zzkxVar.zzc(z11, i12);
        this.zzk.zzm(z11, i12);
        zzag(zzc, 0, i11, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:256:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0475 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x047f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x048a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x049b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x04a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x04be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x04cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x04e4  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzag(final com.google.android.gms.internal.ads.zzkx r43, final int r44, final int r45, boolean r46, int r47, long r48, int r50, boolean r51) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjm.zzag(com.google.android.gms.internal.ads.zzkx, int, int, boolean, int, long, int, boolean):void");
    }

    private final void zzah() {
        int zzf = zzf();
        if (zzf != 2 && zzf != 3) {
            return;
        }
        zzai();
        boolean z10 = this.zzS.zzo;
        zzu();
        zzu();
    }

    private final void zzai() {
        IllegalStateException illegalStateException;
        this.zze.zzb();
        if (Thread.currentThread() != this.zzr.getThread()) {
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzr.getThread().getName());
            if (!this.zzO) {
                if (this.zzP) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                zzea.zzg("ExoPlayerImpl", format, illegalStateException);
                this.zzP = true;
                return;
            }
            throw new IllegalStateException(format);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zzA(zzlq zzlqVar) {
        zzai();
        this.zzq.zzQ(zzlqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zzB(zzuk zzukVar) {
        boolean z10;
        zzai();
        List singletonList = Collections.singletonList(zzukVar);
        zzai();
        zzai();
        zzR(this.zzS);
        zzk();
        this.zzy++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                this.zzo.remove(i10);
            }
            this.zzW = this.zzW.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < singletonList.size(); i11++) {
            zzku zzkuVar = new zzku((zzuk) singletonList.get(i11), this.zzp);
            arrayList.add(zzkuVar);
            this.zzo.add(i11, new zzjl(zzkuVar.zzb, zzkuVar.zza));
        }
        this.zzW = this.zzW.zzg(0, arrayList.size());
        zzlc zzlcVar = new zzlc(this.zzo, this.zzW);
        if (!zzlcVar.zzo() && zzlcVar.zzc() < 0) {
            throw new zzaj(zzlcVar, -1, -9223372036854775807L);
        }
        int zzg = zzlcVar.zzg(false);
        zzkx zzY = zzY(this.zzS, zzlcVar, zzX(zzlcVar, zzg, -9223372036854775807L));
        int i12 = zzY.zze;
        if (zzg != -1 && i12 != 1) {
            i12 = 4;
            if (!zzlcVar.zzo() && zzg < zzlcVar.zzc()) {
                i12 = 2;
            }
        }
        zzkx zze = zzY.zze(i12);
        this.zzk.zzp(arrayList, zzg, zzet.zzr(-9223372036854775807L), this.zzW);
        if (!this.zzS.zzb.zza.equals(zze.zzb.zza) && !this.zzS.zza.zzo()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzag(zze, 0, 1, z10, 4, zzU(zze), -1, false);
    }

    public final zzhw zzE() {
        zzai();
        return this.zzS.zzf;
    }

    public final /* synthetic */ void zzN(zzjv zzjvVar) {
        long j10;
        boolean z10;
        boolean z11;
        int i10 = this.zzy - zzjvVar.zzb;
        this.zzy = i10;
        boolean z12 = true;
        if (zzjvVar.zzc) {
            this.zzz = zzjvVar.zzd;
            this.zzA = true;
        }
        if (zzjvVar.zze) {
            this.zzB = zzjvVar.zzf;
        }
        if (i10 == 0) {
            zzcc zzccVar = zzjvVar.zza.zza;
            if (!this.zzS.zza.zzo() && zzccVar.zzo()) {
                this.zzT = -1;
                this.zzU = 0L;
            }
            if (!zzccVar.zzo()) {
                List zzw = ((zzlc) zzccVar).zzw();
                if (zzw.size() == this.zzo.size()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zzdi.zzf(z11);
                for (int i11 = 0; i11 < zzw.size(); i11++) {
                    ((zzjl) this.zzo.get(i11)).zzc((zzcc) zzw.get(i11));
                }
            }
            if (this.zzA) {
                if (zzjvVar.zza.zzb.equals(this.zzS.zzb) && zzjvVar.zza.zzd == this.zzS.zzr) {
                    z12 = false;
                }
                if (z12) {
                    if (!zzccVar.zzo() && !zzjvVar.zza.zzb.zzb()) {
                        zzkx zzkxVar = zzjvVar.zza;
                        zzui zzuiVar = zzkxVar.zzb;
                        j10 = zzkxVar.zzd;
                        zzW(zzccVar, zzuiVar, j10);
                    } else {
                        j10 = zzjvVar.zza.zzd;
                    }
                } else {
                    j10 = -9223372036854775807L;
                }
                z10 = z12;
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.zzA = false;
            zzag(zzjvVar.zza, 1, this.zzB, z10, this.zzz, j10, -1, false);
        }
    }

    public final /* synthetic */ void zzO(final zzjv zzjvVar) {
        this.zzj.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjb
            @Override // java.lang.Runnable
            public final void run() {
                zzjm.this.zzN(zzjvVar);
            }
        });
    }

    public final /* synthetic */ void zzP(zzbu zzbuVar) {
        zzbuVar.zza(this.zzE);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final void zza(int i10, long j10, int i11, boolean z10) {
        boolean z11;
        zzai();
        if (i10 != -1) {
            if (i10 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            zzdi.zzd(z11);
            zzcc zzccVar = this.zzS.zza;
            if (!zzccVar.zzo() && i10 >= zzccVar.zzc()) {
                return;
            }
            this.zzq.zzu();
            this.zzy++;
            if (zzw()) {
                zzea.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzjv zzjvVar = new zzjv(this.zzS);
                zzjvVar.zza(1);
                this.zzV.zza.zzO(zzjvVar);
                return;
            }
            zzkx zzkxVar = this.zzS;
            int i12 = zzkxVar.zze;
            if (i12 == 3 || (i12 == 4 && !zzccVar.zzo())) {
                zzkxVar = this.zzS.zze(2);
            }
            int zzd2 = zzd();
            zzkx zzY = zzY(zzkxVar, zzccVar, zzX(zzccVar, i10, j10));
            this.zzk.zzk(zzccVar, i10, zzet.zzr(j10));
            zzag(zzY, 0, 1, true, 1, zzU(zzY), zzd2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzb() {
        zzai();
        if (zzw()) {
            return this.zzS.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzc() {
        zzai();
        if (zzw()) {
            return this.zzS.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzd() {
        zzai();
        int zzR = zzR(this.zzS);
        if (zzR == -1) {
            return 0;
        }
        return zzR;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zze() {
        zzai();
        if (this.zzS.zza.zzo()) {
            return 0;
        }
        zzkx zzkxVar = this.zzS;
        return zzkxVar.zza.zza(zzkxVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzf() {
        zzai();
        return this.zzS.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzg() {
        zzai();
        return this.zzS.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzh() {
        zzai();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzi() {
        zzai();
        if (zzw()) {
            zzkx zzkxVar = this.zzS;
            if (zzkxVar.zzk.equals(zzkxVar.zzb)) {
                return zzet.zzu(this.zzS.zzp);
            }
            return zzl();
        }
        zzai();
        if (this.zzS.zza.zzo()) {
            return this.zzU;
        }
        zzkx zzkxVar2 = this.zzS;
        long j10 = 0;
        if (zzkxVar2.zzk.zzd != zzkxVar2.zzb.zzd) {
            return zzet.zzu(zzkxVar2.zza.zze(zzd(), this.zza, 0L).zzm);
        }
        long j11 = zzkxVar2.zzp;
        if (this.zzS.zzk.zzb()) {
            zzkx zzkxVar3 = this.zzS;
            zzkxVar3.zza.zzn(zzkxVar3.zzk.zza, this.zzn).zzi(this.zzS.zzk.zzb);
        } else {
            j10 = j11;
        }
        zzkx zzkxVar4 = this.zzS;
        zzW(zzkxVar4.zza, zzkxVar4.zzk, j10);
        return zzet.zzu(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzj() {
        zzai();
        return zzT(this.zzS);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzk() {
        zzai();
        return zzet.zzu(zzU(this.zzS));
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzl() {
        zzai();
        if (!zzw()) {
            zzcc zzn = zzn();
            if (zzn.zzo()) {
                return -9223372036854775807L;
            }
            return zzet.zzu(zzn.zze(zzd(), this.zza, 0L).zzm);
        }
        zzkx zzkxVar = this.zzS;
        zzui zzuiVar = zzkxVar.zzb;
        zzkxVar.zza.zzn(zzuiVar.zza, this.zzn);
        return zzet.zzu(this.zzn.zzh(zzuiVar.zzb, zzuiVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzm() {
        zzai();
        return zzet.zzu(this.zzS.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final zzcc zzn() {
        zzai();
        return this.zzS.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final zzck zzo() {
        zzai();
        return this.zzS.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzp() {
        zzai();
        zzhl zzhlVar = this.zzw;
        boolean zzu = zzu();
        int i10 = 2;
        int zzb = zzhlVar.zzb(zzu, 2);
        zzaf(zzu, zzb, zzS(zzu, zzb));
        zzkx zzkxVar = this.zzS;
        if (zzkxVar.zze != 1) {
            return;
        }
        zzkx zzd2 = zzkxVar.zzd(null);
        if (true == zzd2.zza.zzo()) {
            i10 = 4;
        }
        zzkx zze = zzd2.zze(i10);
        this.zzy++;
        this.zzk.zzj();
        zzag(zze, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzq(boolean z10) {
        zzai();
        int zzb = this.zzw.zzb(z10, zzf());
        zzaf(z10, zzb, zzS(z10, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzr(Surface surface) {
        int i10;
        zzai();
        zzad(surface);
        if (surface == null) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        zzaa(i10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzs(float f10) {
        zzai();
        final float max = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.zzM == max) {
            return;
        }
        this.zzM = max;
        zzac();
        zzdz zzdzVar = this.zzl;
        zzdzVar.zzd(22, new zzdw() { // from class: com.google.android.gms.internal.ads.zziq
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                int i10 = zzjm.zzd;
                ((zzbu) obj).zzs(max);
            }
        });
        zzdzVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzt() {
        zzai();
        this.zzw.zzb(zzu(), 1);
        zzae(null);
        int i10 = zzdc.zza;
        zzfxr zzm = zzfxr.zzm();
        long j10 = this.zzS.zzr;
        zzfxr.zzk(zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean zzu() {
        zzai();
        return this.zzS.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean zzv() {
        zzai();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean zzw() {
        zzai();
        return this.zzS.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final int zzx() {
        zzai();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zzy(zzlq zzlqVar) {
        this.zzq.zzt(zzlqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zzz() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzet.zze;
        String zza = zzbd.zza();
        StringBuilder f10 = android.support.v4.media.session.h.f("Release ", hexString, " [AndroidXMedia3/1.4.0-alpha02] [", str, "] [");
        f10.append(zza);
        f10.append("]");
        zzea.zze("ExoPlayerImpl", f10.toString());
        zzai();
        this.zzw.zzd();
        if (!this.zzk.zzo()) {
            zzdz zzdzVar = this.zzl;
            zzdzVar.zzd(10, new zzdw() { // from class: com.google.android.gms.internal.ads.zzja
                @Override // com.google.android.gms.internal.ads.zzdw
                public final void zza(Object obj) {
                    ((zzbu) obj).zzj(zzhw.zzd(new zzjy(1), ErrorCodes.MALFORMED_URL_EXCEPTION));
                }
            });
            zzdzVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzs.zzf(this.zzq);
        zzkx zzkxVar = this.zzS;
        boolean z10 = zzkxVar.zzo;
        zzkx zze = zzkxVar.zze(1);
        this.zzS = zze;
        zzkx zza2 = zze.zza(zze.zzb);
        this.zzS = zza2;
        zza2.zzp = zza2.zzr;
        this.zzS.zzq = 0L;
        this.zzq.zzP();
        this.zzi.zzj();
        Surface surface = this.zzH;
        if (surface != null) {
            surface.release();
            this.zzH = null;
        }
        int i10 = zzdc.zza;
    }
}
