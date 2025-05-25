package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcdw extends zzcbb implements zzgu, zzlq {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcdh zzc;
    private final zzxt zzd;
    private final zzcbj zze;
    private final WeakReference zzf;
    private final zzvm zzg;
    private zzih zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcba zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcdj zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e1, code lost:
        if (((java.lang.Boolean) r1.c.zza(com.google.android.gms.internal.ads.zzbbw.zzbG)).booleanValue() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e5, code lost:
        if (r5.zzi == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e7, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ea, code lost:
        if (r5.zzl == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ec, code lost:
        r6 = new com.google.android.gms.internal.ads.zzcdn(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f4, code lost:
        if (r5.zzh <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f6, code lost:
        r6 = new com.google.android.gms.internal.ads.zzcdo(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fc, code lost:
        r6 = new com.google.android.gms.internal.ads.zzcdp(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0103, code lost:
        if (r5.zzi == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0105, code lost:
        r5 = new com.google.android.gms.internal.ads.zzcdq(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010c, code lost:
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010d, code lost:
        r4 = r3.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010f, code lost:
        if (r4 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0115, code lost:
        if (r4.limit() <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0117, code lost:
        r4 = new byte[r3.zzi.limit()];
        r3.zzi.get(r4);
        r5 = new com.google.android.gms.internal.ads.zzcdr(r5, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzcdw(android.content.Context r4, com.google.android.gms.internal.ads.zzcbj r5, com.google.android.gms.internal.ads.zzcbk r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdw.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcbj, com.google.android.gms.internal.ads.zzcbk, java.lang.Integer):void");
    }

    private final boolean zzad() {
        if (this.zzt != null && this.zzt.zzq()) {
            return true;
        }
        return false;
    }

    public final void finalize() {
        zzcbb.zzD().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.i()) {
            com.google.android.gms.ads.internal.util.zze.h("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final long zzA() {
        if (!zzad()) {
            return this.zzl;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final long zzB() {
        if (!zzad()) {
            synchronized (this.zzq) {
                while (!this.zzs.isEmpty()) {
                    long j10 = this.zzn;
                    Map zze = ((zzgp) this.zzs.remove(0)).zze();
                    long j11 = 0;
                    if (zze != null) {
                        Iterator it = zze.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzfuf.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j11 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j10 + j11;
                }
            }
            return this.zzn;
        }
        return this.zzt.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final Integer zzC() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10) {
        zzuk zzuxVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z10;
            int length = uriArr.length;
            if (length == 1) {
                zzuxVar = zzaa(uriArr[0]);
            } else {
                zzuk[] zzukVarArr = new zzuk[length];
                for (int i10 = 0; i10 < uriArr.length; i10++) {
                    zzukVarArr[i10] = zzaa(uriArr[i10]);
                }
                zzuxVar = new zzux(false, false, new zztt(), zzukVarArr);
            }
            this.zzh.zzB(zzuxVar);
            this.zzh.zzp();
            zzcbb.zzE().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzH() {
        zzih zzihVar = this.zzh;
        if (zzihVar != null) {
            zzihVar.zzA(this);
            this.zzh.zzz();
            this.zzh = null;
            zzcbb.zzE().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzI(long j10) {
        zzj zzjVar = (zzj) this.zzh;
        zzjVar.zza(zzjVar.zzd(), j10, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzJ(int i10) {
        this.zzc.zzk(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzK(int i10) {
        this.zzc.zzl(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzL(zzcba zzcbaVar) {
        this.zzk = zzcbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzM(int i10) {
        this.zzc.zzm(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzN(int i10) {
        this.zzc.zzn(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzO(boolean z10) {
        this.zzh.zzq(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzP(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzQ(boolean z10) {
        if (this.zzh != null) {
            int i10 = 0;
            while (true) {
                this.zzh.zzx();
                if (i10 < 2) {
                    zzxt zzxtVar = this.zzd;
                    zzxg zzc = zzxtVar.zzf().zzc();
                    zzc.zzp(i10, !z10);
                    zzxtVar.zzl(zzc);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzR(int i10) {
        for (WeakReference weakReference : this.zzu) {
            zzcdg zzcdgVar = (zzcdg) weakReference.get();
            if (zzcdgVar != null) {
                zzcdgVar.zzm(i10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzS(Surface surface, boolean z10) {
        zzih zzihVar = this.zzh;
        if (zzihVar != null) {
            zzihVar.zzr(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzT(float f10, boolean z10) {
        zzih zzihVar = this.zzh;
        if (zzihVar != null) {
            zzihVar.zzs(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzU() {
        this.zzh.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final boolean zzV() {
        if (this.zzh != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ zzfs zzW(String str, boolean z10) {
        zzcdw zzcdwVar;
        if (true != z10) {
            zzcdwVar = null;
        } else {
            zzcdwVar = this;
        }
        zzcbj zzcbjVar = this.zze;
        return new zzcdz(str, zzcdwVar, zzcbjVar.zzd, zzcbjVar.zze, zzcbjVar.zzm, zzcbjVar.zzn);
    }

    public final /* synthetic */ zzfs zzX(String str, boolean z10) {
        zzcdw zzcdwVar;
        if (true != z10) {
            zzcdwVar = null;
        } else {
            zzcdwVar = this;
        }
        zzcbj zzcbjVar = this.zze;
        zzcdg zzcdgVar = new zzcdg(str, zzcdwVar, zzcbjVar.zzd, zzcbjVar.zze, zzcbjVar.zzh);
        this.zzu.add(new WeakReference(zzcdgVar));
        return zzcdgVar;
    }

    public final /* synthetic */ zzfs zzY(String str, boolean z10) {
        zzcdw zzcdwVar;
        zzgb zzgbVar = new zzgb();
        zzgbVar.zzf(str);
        if (true != z10) {
            zzcdwVar = null;
        } else {
            zzcdwVar = this;
        }
        zzgbVar.zze(zzcdwVar);
        zzgbVar.zzc(this.zze.zzd);
        zzgbVar.zzd(this.zze.zze);
        zzgbVar.zzb(true);
        return zzgbVar.zza();
    }

    public final /* synthetic */ zzfs zzZ(zzfr zzfrVar) {
        zzfs zza2 = zzfrVar.zza();
        zzcdu zzcduVar = new zzcdu(this);
        return new zzcdj(this.zzb, zza2, this.zzo, this.zzp, this, zzcduVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final void zza(zzfs zzfsVar, zzfy zzfyVar, boolean z10, int i10) {
        this.zzl += i10;
    }

    public final zzuk zzaa(Uri uri) {
        zzam zzamVar = new zzam();
        zzamVar.zzb(uri);
        zzbc zzc = zzamVar.zzc();
        zzvm zzvmVar = this.zzg;
        zzvmVar.zza(this.zze.zzf);
        return zzvmVar.zzb(zzc);
    }

    public final /* synthetic */ void zzab(boolean z10, long j10) {
        zzcba zzcbaVar = this.zzk;
        if (zzcbaVar != null) {
            zzcbaVar.zzi(z10, j10);
        }
    }

    public final /* synthetic */ zzle[] zzac(Handler handler, zzaay zzaayVar, zzpe zzpeVar, zzwl zzwlVar, zztg zztgVar) {
        zzsq zzsqVar = zzsq.zza;
        Context context = this.zzb;
        zzqv zzqvVar = new zzqv(context, new zzry(context), zzsqVar, false, handler, zzpeVar, new zzqb(context).zzc());
        Context context2 = this.zzb;
        return new zzle[]{zzqvVar, new zzaaa(context2, new zzry(context2), zzsqVar, 0L, false, handler, zzaayVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final void zzd(zzfs zzfsVar, zzfy zzfyVar, boolean z10) {
        if (zzfsVar instanceof zzgp) {
            synchronized (this.zzq) {
                this.zzs.add((zzgp) zzfsVar);
            }
        } else if (zzfsVar instanceof zzcdj) {
            this.zzt = (zzcdj) zzfsVar;
            final zzcbk zzcbkVar = (zzcbk) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbG)).booleanValue() && zzcbkVar != null && this.zzt.zzn()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcds
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = zzcdw.zza;
                        zzcbk.this.zzd("onGcacheInfoEvent", hashMap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zze(zzlo zzloVar, zzaf zzafVar, zzho zzhoVar) {
        zzcbk zzcbkVar = (zzcbk) this.zzf.get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbG)).booleanValue() && zzcbkVar != null) {
            HashMap hashMap = new HashMap();
            String str = zzafVar.zzl;
            if (str != null) {
                hashMap.put("audioMime", str);
            }
            String str2 = zzafVar.zzm;
            if (str2 != null) {
                hashMap.put("audioSampleMime", str2);
            }
            String str3 = zzafVar.zzj;
            if (str3 != null) {
                hashMap.put("audioCodec", str3);
            }
            zzcbkVar.zzd("onMetadataEvent", hashMap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzh(zzlo zzloVar, int i10, long j10) {
        this.zzm += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzj(zzlo zzloVar, zztz zztzVar, zzue zzueVar, IOException iOException, boolean z10) {
        zzcba zzcbaVar = this.zzk;
        if (zzcbaVar != null) {
            if (this.zze.zzj) {
                zzcbaVar.zzl("onLoadException", iOException);
            } else {
                zzcbaVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzk(zzlo zzloVar, int i10) {
        zzcba zzcbaVar = this.zzk;
        if (zzcbaVar != null) {
            zzcbaVar.zzm(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzl(zzlo zzloVar, zzbp zzbpVar) {
        zzcba zzcbaVar = this.zzk;
        if (zzcbaVar != null) {
            zzcbaVar.zzk("onPlayerError", zzbpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzn(zzlo zzloVar, Object obj, long j10) {
        zzcba zzcbaVar = this.zzk;
        if (zzcbaVar != null) {
            zzcbaVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzp(zzlo zzloVar, zzaf zzafVar, zzho zzhoVar) {
        zzcbk zzcbkVar = (zzcbk) this.zzf.get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbG)).booleanValue() && zzcbkVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(zzafVar.zzt));
            hashMap.put("bitRate", String.valueOf(zzafVar.zzi));
            int i10 = zzafVar.zzr;
            int i11 = zzafVar.zzs;
            hashMap.put("resolution", i10 + "x" + i11);
            String str = zzafVar.zzl;
            if (str != null) {
                hashMap.put("videoMime", str);
            }
            String str2 = zzafVar.zzm;
            if (str2 != null) {
                hashMap.put("videoSampleMime", str2);
            }
            String str3 = zzafVar.zzj;
            if (str3 != null) {
                hashMap.put("videoCodec", str3);
            }
            zzcbkVar.zzd("onMetadataEvent", hashMap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzq(zzlo zzloVar, zzcp zzcpVar) {
        zzcba zzcbaVar = this.zzk;
        if (zzcbaVar != null) {
            zzcbaVar.zzD(zzcpVar.zzb, zzcpVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final int zzt() {
        return this.zzh.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final long zzv() {
        return this.zzh.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return Math.min(this.zzl, this.zzt.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final long zzy() {
        return this.zzh.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final long zzz() {
        return this.zzh.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final /* synthetic */ void zzg(zzlo zzloVar, zzue zzueVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final /* synthetic */ void zzi(zzbw zzbwVar, zzlp zzlpVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final /* synthetic */ void zzo(zzlo zzloVar, zzhn zzhnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final void zzb(zzfs zzfsVar, zzfy zzfyVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final void zzc(zzfs zzfsVar, zzfy zzfyVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final /* synthetic */ void zzf(zzlo zzloVar, int i10, long j10, long j11) {
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final /* synthetic */ void zzm(zzlo zzloVar, zzbv zzbvVar, zzbv zzbvVar2, int i10) {
    }
}
