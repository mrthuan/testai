package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.math.RoundingMode;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzanw implements zzanx {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, ShapeTypes.DOUBLE_WAVE, ShapeTypes.FLOW_CHART_CONNECTOR, ShapeTypes.FLOW_CHART_DISPLAY, ShapeTypes.GEAR_6, 190, 209, 230, 253, 279, 307, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzacn zzc;
    private final zzadp zzd;
    private final zzaoa zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzek zzh;
    private final int zzi;
    private final zzaf zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzanw(zzacn zzacnVar, zzadp zzadpVar, zzaoa zzaoaVar) {
        this.zzc = zzacnVar;
        this.zzd = zzadpVar;
        this.zze = zzaoaVar;
        int max = Math.max(1, zzaoaVar.zzc / 10);
        this.zzi = max;
        zzek zzekVar = new zzek(zzaoaVar.zzf);
        zzekVar.zzk();
        int zzk = zzekVar.zzk();
        this.zzf = zzk;
        int i10 = zzaoaVar.zzb;
        int i11 = zzaoaVar.zzd;
        int a10 = androidx.appcompat.view.menu.d.a(i11 - (i10 * 4), 8, zzaoaVar.zze * i10, 1);
        if (zzk == a10) {
            int i12 = zzet.zza;
            int i13 = ((max + zzk) - 1) / zzk;
            this.zzg = new byte[i11 * i13];
            this.zzh = new zzek((zzk + zzk) * i10 * i13);
            int i14 = ((zzaoaVar.zzc * zzaoaVar.zzd) * 8) / zzk;
            zzad zzadVar = new zzad();
            zzadVar.zzX("audio/raw");
            zzadVar.zzx(i14);
            zzadVar.zzS(i14);
            zzadVar.zzP((max + max) * i10);
            zzadVar.zzy(zzaoaVar.zzb);
            zzadVar.zzY(zzaoaVar.zzc);
            zzadVar.zzR(2);
            this.zzj = zzadVar.zzad();
            return;
        }
        throw zzbo.zza("Expected frames per block: " + a10 + "; got: " + zzk, null);
    }

    private final int zzd(int i10) {
        int i11 = this.zze.zzb;
        return i10 / (i11 + i11);
    }

    private final int zze(int i10) {
        return (i10 + i10) * this.zze.zzb;
    }

    private final void zzf(int i10) {
        long zzt = this.zzl + zzet.zzt(this.zzn, 1000000L, this.zze.zzc, RoundingMode.FLOOR);
        int zze = zze(i10);
        this.zzd.zzs(zzt, 1, zze, this.zzm - zze, null);
        this.zzn += i10;
        this.zzm -= zze;
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final void zza(int i10, long j10) {
        this.zzc.zzO(new zzaod(this.zze, this.zzf, i10, j10));
        this.zzd.zzl(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final void zzb(long j10) {
        this.zzk = 0;
        this.zzl = j10;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x0020). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzanx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzacl r21, long r22) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanw.zzc(com.google.android.gms.internal.ads.zzacl, long):boolean");
    }
}
