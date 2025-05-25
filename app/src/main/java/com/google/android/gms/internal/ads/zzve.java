package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzve implements zzyt, zztx {
    final /* synthetic */ zzvj zza;
    private final Uri zzc;
    private final zzgt zzd;
    private final zzuy zze;
    private final zzacn zzf;
    private final zzdm zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzadp zzm;
    private boolean zzn;
    private final zzadf zzh = new zzadf();
    private boolean zzj = true;
    private final long zzb = zztz.zza();
    private zzfy zzl = zzi(0);

    public zzve(zzvj zzvjVar, Uri uri, zzfs zzfsVar, zzuy zzuyVar, zzacn zzacnVar, zzdm zzdmVar) {
        this.zza = zzvjVar;
        this.zzc = uri;
        this.zzd = new zzgt(zzfsVar);
        this.zze = zzuyVar;
        this.zzf = zzacnVar;
        this.zzg = zzdmVar;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzve zzveVar, long j10, long j11) {
        zzveVar.zzh.zza = j10;
        zzveVar.zzk = j11;
        zzveVar.zzj = true;
        zzveVar.zzn = false;
    }

    private final zzfy zzi(long j10) {
        Map map;
        zzfw zzfwVar = new zzfw();
        zzfwVar.zzd(this.zzc);
        zzfwVar.zzc(j10);
        zzfwVar.zza(6);
        map = zzvj.zzb;
        zzfwVar.zzb(map);
        return zzfwVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zztx
    public final void zza(zzek zzekVar) {
        long zzR;
        long max;
        if (this.zzn) {
            zzR = this.zza.zzR(true);
            max = Math.max(zzR, this.zzk);
        } else {
            max = this.zzk;
        }
        int zzb = zzekVar.zzb();
        zzadp zzadpVar = this.zzm;
        zzadpVar.getClass();
        zzadn.zzb(zzadpVar, zzekVar, zzb);
        zzadpVar.zzs(max, 1, zzb, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x009e A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:151:0x000b, B:161:0x003c, B:162:0x0041, B:165:0x0057, B:166:0x005d, B:175:0x0093, B:177:0x009e, B:179:0x00aa, B:181:0x00b4, B:183:0x00c0, B:185:0x00ca, B:187:0x00d6, B:189:0x00e0, B:191:0x00f2, B:193:0x00fc, B:194:0x0102, B:203:0x0132, B:204:0x0139, B:206:0x0146, B:208:0x014e, B:210:0x016b, B:197:0x010c, B:200:0x0120, B:170:0x0069, B:173:0x007f), top: B:266:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00b4 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:151:0x000b, B:161:0x003c, B:162:0x0041, B:165:0x0057, B:166:0x005d, B:175:0x0093, B:177:0x009e, B:179:0x00aa, B:181:0x00b4, B:183:0x00c0, B:185:0x00ca, B:187:0x00d6, B:189:0x00e0, B:191:0x00f2, B:193:0x00fc, B:194:0x0102, B:203:0x0132, B:204:0x0139, B:206:0x0146, B:208:0x014e, B:210:0x016b, B:197:0x010c, B:200:0x0120, B:170:0x0069, B:173:0x007f), top: B:266:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00ca A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:151:0x000b, B:161:0x003c, B:162:0x0041, B:165:0x0057, B:166:0x005d, B:175:0x0093, B:177:0x009e, B:179:0x00aa, B:181:0x00b4, B:183:0x00c0, B:185:0x00ca, B:187:0x00d6, B:189:0x00e0, B:191:0x00f2, B:193:0x00fc, B:194:0x0102, B:203:0x0132, B:204:0x0139, B:206:0x0146, B:208:0x014e, B:210:0x016b, B:197:0x010c, B:200:0x0120, B:170:0x0069, B:173:0x007f), top: B:266:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00e0 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:151:0x000b, B:161:0x003c, B:162:0x0041, B:165:0x0057, B:166:0x005d, B:175:0x0093, B:177:0x009e, B:179:0x00aa, B:181:0x00b4, B:183:0x00c0, B:185:0x00ca, B:187:0x00d6, B:189:0x00e0, B:191:0x00f2, B:193:0x00fc, B:194:0x0102, B:203:0x0132, B:204:0x0139, B:206:0x0146, B:208:0x014e, B:210:0x016b, B:197:0x010c, B:200:0x0120, B:170:0x0069, B:173:0x007f), top: B:266:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00fc A[Catch: all -> 0x0208, TRY_LEAVE, TryCatch #2 {all -> 0x0208, blocks: (B:151:0x000b, B:161:0x003c, B:162:0x0041, B:165:0x0057, B:166:0x005d, B:175:0x0093, B:177:0x009e, B:179:0x00aa, B:181:0x00b4, B:183:0x00c0, B:185:0x00ca, B:187:0x00d6, B:189:0x00e0, B:191:0x00f2, B:193:0x00fc, B:194:0x0102, B:203:0x0132, B:204:0x0139, B:206:0x0146, B:208:0x014e, B:210:0x016b, B:197:0x010c, B:200:0x0120, B:170:0x0069, B:173:0x007f), top: B:266:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0132 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:151:0x000b, B:161:0x003c, B:162:0x0041, B:165:0x0057, B:166:0x005d, B:175:0x0093, B:177:0x009e, B:179:0x00aa, B:181:0x00b4, B:183:0x00c0, B:185:0x00ca, B:187:0x00d6, B:189:0x00e0, B:191:0x00f2, B:193:0x00fc, B:194:0x0102, B:203:0x0132, B:204:0x0139, B:206:0x0146, B:208:0x014e, B:210:0x016b, B:197:0x010c, B:200:0x0120, B:170:0x0069, B:173:0x007f), top: B:266:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0146 A[Catch: all -> 0x0208, TryCatch #2 {all -> 0x0208, blocks: (B:151:0x000b, B:161:0x003c, B:162:0x0041, B:165:0x0057, B:166:0x005d, B:175:0x0093, B:177:0x009e, B:179:0x00aa, B:181:0x00b4, B:183:0x00c0, B:185:0x00ca, B:187:0x00d6, B:189:0x00e0, B:191:0x00f2, B:193:0x00fc, B:194:0x0102, B:203:0x0132, B:204:0x0139, B:206:0x0146, B:208:0x014e, B:210:0x016b, B:197:0x010c, B:200:0x0120, B:170:0x0069, B:173:0x007f), top: B:266:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0186 A[Catch: all -> 0x0205, TryCatch #1 {all -> 0x0205, blocks: (B:212:0x017b, B:214:0x0186, B:215:0x018b, B:217:0x018f), top: B:264:0x017b }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x018f A[Catch: all -> 0x0205, TRY_LEAVE, TryCatch #1 {all -> 0x0205, blocks: (B:212:0x017b, B:214:0x0186, B:215:0x018b, B:217:0x018f), top: B:264:0x017b }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x01e3 A[EDGE_INSN: B:283:0x01e3->B:237:0x01e3 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh() {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzve.zzh():void");
    }
}
