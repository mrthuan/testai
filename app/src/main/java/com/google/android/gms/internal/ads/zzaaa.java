package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import com.facebook.ads.AdError;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.inmobi.commons.core.configs.CrashConfig;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaaa extends zzso implements zzaag {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private zzcp zzA;
    private zzcp zzB;
    private boolean zzC;
    private int zzD;
    private int zzE;
    private zzaae zzF;
    private final Context zze;
    private final zzabc zzf;
    private final zzaax zzg;
    private final boolean zzh;
    private final zzaah zzi;
    private final zzaaf zzj;
    private boolean zzk;
    private boolean zzl;
    private zzzz zzm;
    private boolean zzn;
    private boolean zzo;
    private Surface zzp;
    private zzaad zzq;
    private boolean zzr;
    private int zzs;
    private long zzt;
    private int zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    public zzaaa(Context context, zzsa zzsaVar, zzsq zzsqVar, long j10, boolean z10, Handler handler, zzaay zzaayVar, int i10, float f10) {
        super(2, zzsaVar, zzsqVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzg = new zzaax(handler, zzaayVar);
        zzzt zzc2 = new zzzg(applicationContext, new zzaah(applicationContext, this, 0L)).zzc();
        this.zzf = zzc2.zzi();
        zzaah zzh = zzc2.zzh();
        zzdi.zzb(zzh);
        this.zzi = zzh;
        this.zzj = new zzaaf();
        this.zzh = "NVIDIA".equals(zzet.zzc);
        this.zzs = 1;
        this.zzA = zzcp.zza;
        this.zzE = 0;
        this.zzB = null;
        this.zzD = -1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x04bf, code lost:
        if (r0.equals("deb") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x079d, code lost:
        if (r10 != 0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzaS(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaa.zzaS(java.lang.String):boolean");
    }

    private static List zzaT(Context context, zzsq zzsqVar, zzaf zzafVar, boolean z10, boolean z11) {
        String str = zzafVar.zzm;
        if (str == null) {
            return zzfxr.zzm();
        }
        if (zzet.zza >= 26 && "video/dolby-vision".equals(str) && !zzzy.zza(context)) {
            List zzd2 = zztc.zzd(zzsqVar, zzafVar, z10, z11);
            if (!zzd2.isEmpty()) {
                return zzd2;
            }
        }
        return zztc.zzf(zzsqVar, zzafVar, z10, z11);
    }

    private final void zzaU() {
        zzcp zzcpVar = this.zzB;
        if (zzcpVar != null) {
            this.zzg.zzt(zzcpVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaV() {
        this.zzg.zzq(this.zzp);
        this.zzr = true;
    }

    private final void zzaW() {
        Surface surface = this.zzp;
        zzaad zzaadVar = this.zzq;
        if (surface == zzaadVar) {
            this.zzp = null;
        }
        if (zzaadVar != null) {
            zzaadVar.release();
            this.zzq = null;
        }
    }

    private final boolean zzaX(zzsf zzsfVar) {
        if (zzet.zza < 23 || zzaS(zzsfVar.zza)) {
            return false;
        }
        if (zzsfVar.zzf && !zzaad.zzb(this.zze)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
        if (r3.equals("video/av01") != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzad(com.google.android.gms.internal.ads.zzsf r10, com.google.android.gms.internal.ads.zzaf r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaa.zzad(com.google.android.gms.internal.ads.zzsf, com.google.android.gms.internal.ads.zzaf):int");
    }

    public static int zzae(zzsf zzsfVar, zzaf zzafVar) {
        if (zzafVar.zzn != -1) {
            int size = zzafVar.zzo.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += ((byte[]) zzafVar.zzo.get(i11)).length;
            }
            return zzafVar.zzn + i10;
        }
        return zzad(zzsfVar, zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhm
    public final void zzA() {
        ((zzzr) this.zzf).zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzhm
    public final void zzC() {
        try {
            super.zzC();
            this.zzl = false;
            if (this.zzq != null) {
                zzaW();
            }
        } catch (Throwable th2) {
            this.zzl = false;
            if (this.zzq != null) {
                zzaW();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhm
    public final void zzD() {
        this.zzu = 0;
        zzh();
        this.zzt = SystemClock.elapsedRealtime();
        this.zzx = 0L;
        this.zzy = 0;
        if (this.zzk) {
            zzzt.zzg(((zzzr) this.zzf).zza).zzg();
        } else {
            this.zzi.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhm
    public final void zzE() {
        if (this.zzu > 0) {
            zzh();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzu, elapsedRealtime - this.zzt);
            this.zzu = 0;
            this.zzt = elapsedRealtime;
        }
        int i10 = this.zzy;
        if (i10 != 0) {
            this.zzg.zzr(this.zzx, i10);
            this.zzx = 0L;
            this.zzy = 0;
        }
        if (this.zzk) {
            zzzt.zzg(((zzzr) this.zzf).zza).zzh();
        } else {
            this.zzi.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzhm, com.google.android.gms.internal.ads.zzle
    public final void zzM(float f10, float f11) {
        super.zzM(f10, f11);
        this.zzi.zzm(f10);
        if (this.zzk) {
            zzzt.zzp(((zzzr) this.zzf).zza, f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzle, com.google.android.gms.internal.ads.zzlh
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzle
    public final void zzV(long j10, long j11) {
        super.zzV(j10, j11);
        if (this.zzk) {
            try {
                this.zzf.zzg(j10, j11);
            } catch (zzabb e10) {
                throw zzi(e10, e10.zza, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzle
    public final boolean zzW() {
        if (!super.zzW() || this.zzk) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzle
    public final boolean zzX() {
        zzaad zzaadVar;
        boolean z10 = false;
        if (super.zzX() && !this.zzk) {
            z10 = true;
        }
        if (z10 && (((zzaadVar = this.zzq) != null && this.zzp == zzaadVar) || zzay() == null)) {
            return true;
        }
        return this.zzi.zzn(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final float zzZ(float f10, zzaf zzafVar, zzaf[] zzafVarArr) {
        float f11 = -1.0f;
        for (zzaf zzafVar2 : zzafVarArr) {
            float f12 = zzafVar2.zzt;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzaC(long j10) {
        super.zzaC(j10);
        this.zzw--;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzaD(zzhd zzhdVar) {
        this.zzw++;
        int i10 = zzet.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzaE(zzaf zzafVar) {
        if (this.zzk) {
            try {
                zzabc zzabcVar = this.zzf;
                zzzt.zzd(((zzzr) zzabcVar).zza, zzafVar, zzh());
                this.zzf.zzh(new zzzx(this), zzgda.zzb());
            } catch (zzabb e10) {
                throw zzi(e10, zzafVar, false, 7000);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzaG() {
        super.zzaG();
        this.zzw = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final boolean zzaM(zzsf zzsfVar) {
        if (this.zzp == null && !zzaX(zzsfVar)) {
            return false;
        }
        return true;
    }

    public final void zzaO(zzsc zzscVar, int i10, long j10) {
        Trace.beginSection("skipVideoBuffer");
        zzscVar.zzn(i10, false);
        Trace.endSection();
        ((zzso) this).zza.zzf++;
    }

    public final void zzaP(int i10, int i11) {
        zzhn zzhnVar = ((zzso) this).zza;
        zzhnVar.zzh += i10;
        int i12 = i10 + i11;
        zzhnVar.zzg += i12;
        this.zzu += i12;
        int i13 = this.zzv + i12;
        this.zzv = i13;
        zzhnVar.zzi = Math.max(i13, zzhnVar.zzi);
    }

    public final void zzaQ(long j10) {
        zzhn zzhnVar = ((zzso) this).zza;
        zzhnVar.zzk += j10;
        zzhnVar.zzl++;
        this.zzx += j10;
        this.zzy++;
    }

    public final boolean zzaR(long j10, boolean z10) {
        int zzd2 = zzd(j10);
        if (zzd2 == 0) {
            return false;
        }
        if (z10) {
            zzhn zzhnVar = ((zzso) this).zza;
            zzhnVar.zzd += zzd2;
            zzhnVar.zzf += this.zzw;
        } else {
            ((zzso) this).zza.zzj++;
            zzaP(zzd2, this.zzw);
        }
        zzaI();
        if (this.zzk) {
            this.zzf.zze();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final int zzaa(zzsq zzsqVar, zzaf zzafVar) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13 = 128;
        if (!zzbn.zzi(zzafVar.zzm)) {
            return 128;
        }
        int i14 = 1;
        int i15 = 0;
        if (zzafVar.zzp != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        List zzaT = zzaT(this.zze, zzsqVar, zzafVar, z10, false);
        if (z10 && zzaT.isEmpty()) {
            zzaT = zzaT(this.zze, zzsqVar, zzafVar, false, false);
        }
        if (!zzaT.isEmpty()) {
            if (!zzso.zzaN(zzafVar)) {
                i14 = 2;
            } else {
                zzsf zzsfVar = (zzsf) zzaT.get(0);
                boolean zze = zzsfVar.zze(zzafVar);
                if (!zze) {
                    for (int i16 = 1; i16 < zzaT.size(); i16++) {
                        zzsf zzsfVar2 = (zzsf) zzaT.get(i16);
                        if (zzsfVar2.zze(zzafVar)) {
                            zze = true;
                            z11 = false;
                            zzsfVar = zzsfVar2;
                            break;
                        }
                    }
                }
                z11 = true;
                if (true != zze) {
                    i10 = 3;
                } else {
                    i10 = 4;
                }
                if (true != zzsfVar.zzf(zzafVar)) {
                    i11 = 8;
                } else {
                    i11 = 16;
                }
                if (true != zzsfVar.zzg) {
                    i12 = 0;
                } else {
                    i12 = 64;
                }
                if (true != z11) {
                    i13 = 0;
                }
                if (zzet.zza >= 26 && "video/dolby-vision".equals(zzafVar.zzm) && !zzzy.zza(this.zze)) {
                    i13 = 256;
                }
                if (zze) {
                    List zzaT2 = zzaT(this.zze, zzsqVar, zzafVar, z10, true);
                    if (!zzaT2.isEmpty()) {
                        zzsf zzsfVar3 = (zzsf) zztc.zzg(zzaT2, zzafVar).get(0);
                        if (zzsfVar3.zze(zzafVar) && zzsfVar3.zzf(zzafVar)) {
                            i15 = 32;
                        }
                    }
                }
                return i10 | i11 | i15 | i12 | i13;
            }
        }
        return i14 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final zzho zzab(zzsf zzsfVar, zzaf zzafVar, zzaf zzafVar2) {
        int i10;
        int i11;
        zzho zzb2 = zzsfVar.zzb(zzafVar, zzafVar2);
        int i12 = zzb2.zze;
        zzzz zzzzVar = this.zzm;
        zzzzVar.getClass();
        if (zzafVar2.zzr > zzzzVar.zza || zzafVar2.zzs > zzzzVar.zzb) {
            i12 |= 256;
        }
        if (zzae(zzsfVar, zzafVar2) > zzzzVar.zzc) {
            i12 |= 64;
        }
        String str = zzsfVar.zza;
        if (i12 != 0) {
            i11 = i12;
            i10 = 0;
        } else {
            i10 = zzb2.zzd;
            i11 = 0;
        }
        return new zzho(str, zzafVar, zzafVar2, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final zzho zzac(zzjz zzjzVar) {
        zzho zzac = super.zzac(zzjzVar);
        zzaf zzafVar = zzjzVar.zza;
        zzafVar.getClass();
        this.zzg.zzf(zzafVar, zzac);
        return zzac;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0207  */
    @Override // com.google.android.gms.internal.ads.zzso
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzrz zzaf(com.google.android.gms.internal.ads.zzsf r20, com.google.android.gms.internal.ads.zzaf r21, android.media.MediaCrypto r22, float r23) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaa.zzaf(com.google.android.gms.internal.ads.zzsf, com.google.android.gms.internal.ads.zzaf, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzrz");
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final List zzag(zzsq zzsqVar, zzaf zzafVar, boolean z10) {
        return zztc.zzg(zzaT(this.zze, zzsqVar, zzafVar, false, false), zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    @TargetApi(29)
    public final void zzaj(zzhd zzhdVar) {
        if (this.zzo) {
            ByteBuffer byteBuffer = zzhdVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s4 = byteBuffer.getShort();
                short s10 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s4 == 60 && s10 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzsc zzay = zzay();
                        zzay.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzay.zzp(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzak(Exception exc) {
        zzea.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzal(String str, zzrz zzrzVar, long j10, long j11) {
        this.zzg.zza(str, j10, j11);
        this.zzn = zzaS(str);
        zzsf zzaA = zzaA();
        zzaA.getClass();
        boolean z10 = false;
        if (zzet.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzaA.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzh = zzaA.zzh();
            int length = zzh.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (zzh[i10].profile == 16384) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.zzo = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzam(String str) {
        this.zzg.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzan(zzaf zzafVar, MediaFormat mediaFormat) {
        boolean z10;
        int integer;
        int integer2;
        zzsc zzay = zzay();
        if (zzay != null) {
            zzay.zzq(this.zzs);
        }
        mediaFormat.getClass();
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger(InMobiNetworkValues.WIDTH);
        }
        if (z10) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger(InMobiNetworkValues.HEIGHT);
        }
        float f10 = zzafVar.zzv;
        int i10 = zzet.zza;
        int i11 = zzafVar.zzu;
        if (i11 == 90 || i11 == 270) {
            f10 = 1.0f / f10;
            int i12 = integer2;
            integer2 = integer;
            integer = i12;
        }
        this.zzA = new zzcp(integer, integer2, 0, f10);
        if (this.zzk) {
            zzabc zzabcVar = this.zzf;
            zzad zzb2 = zzafVar.zzb();
            zzb2.zzac(integer);
            zzb2.zzI(integer2);
            zzb2.zzW(0);
            zzb2.zzT(f10);
            zzabcVar.zzf(1, zzb2.zzad());
            return;
        }
        this.zzi.zzk(zzafVar.zzt);
    }

    public final void zzao(zzsc zzscVar, int i10, long j10, long j11) {
        Trace.beginSection("releaseOutputBuffer");
        zzscVar.zzm(i10, j11);
        Trace.endSection();
        ((zzso) this).zza.zze++;
        this.zzv = 0;
        if (!this.zzk) {
            zzcp zzcpVar = this.zzA;
            if (!zzcpVar.equals(zzcp.zza) && !zzcpVar.equals(this.zzB)) {
                this.zzB = zzcpVar;
                this.zzg.zzt(zzcpVar);
            }
            if (this.zzi.zzo() && this.zzp != null) {
                zzaV();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzap() {
        if (this.zzk) {
            this.zzf.zzi(zzau());
        } else {
            this.zzi.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final boolean zzar(long j10, long j11, zzsc zzscVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzaf zzafVar) {
        zzscVar.getClass();
        long zzau = j12 - zzau();
        int zza = this.zzi.zza(j12, j10, j11, zzav(), z11, this.zzj);
        if (zza != 4) {
            if (z10 && !z11) {
                zzaO(zzscVar, i10, zzau);
                return true;
            } else if (this.zzp == this.zzq && !this.zzk) {
                if (this.zzj.zzc() < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                    zzaO(zzscVar, i10, zzau);
                    zzaQ(this.zzj.zzc());
                    return true;
                }
            } else if (this.zzk) {
                try {
                    this.zzf.zzg(j10, j11);
                    long zzd2 = this.zzf.zzd(zzau, z11);
                    if (zzd2 != -9223372036854775807L) {
                        int i13 = zzet.zza;
                        zzao(zzscVar, i10, zzau, zzd2);
                        return true;
                    }
                } catch (zzabb e10) {
                    throw zzi(e10, e10.zza, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
                }
            } else if (zza != 0) {
                if (zza != 1) {
                    if (zza != 2) {
                        if (zza != 3) {
                            if (zza != 5) {
                                throw new IllegalStateException(String.valueOf(zza));
                            }
                        } else {
                            zzaO(zzscVar, i10, zzau);
                            zzaQ(this.zzj.zzc());
                            return true;
                        }
                    } else {
                        Trace.beginSection("dropVideoBuffer");
                        zzscVar.zzn(i10, false);
                        Trace.endSection();
                        zzaP(0, 1);
                        zzaQ(this.zzj.zzc());
                        return true;
                    }
                } else {
                    zzaaf zzaafVar = this.zzj;
                    long zzd3 = zzaafVar.zzd();
                    long zzc2 = zzaafVar.zzc();
                    int i14 = zzet.zza;
                    if (zzd3 == this.zzz) {
                        zzaO(zzscVar, i10, zzau);
                    } else {
                        zzao(zzscVar, i10, zzau, zzd3);
                    }
                    zzaQ(zzc2);
                    this.zzz = zzd3;
                    return true;
                }
            } else {
                zzh();
                long nanoTime = System.nanoTime();
                int i15 = zzet.zza;
                zzao(zzscVar, i10, zzau, nanoTime);
                zzaQ(this.zzj.zzc());
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final int zzat(zzhd zzhdVar) {
        int i10 = zzet.zza;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final zzse zzaz(Throwable th2, zzsf zzsfVar) {
        return new zzzw(th2, zzsfVar, this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzhm, com.google.android.gms.internal.ads.zzle
    public final void zzs() {
        this.zzi.zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v13, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzhm, com.google.android.gms.internal.ads.zzkz
    public final void zzt(int i10, Object obj) {
        zzaad zzaadVar;
        if (i10 != 1) {
            if (i10 != 7) {
                if (i10 != 10) {
                    if (i10 != 16) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                if (i10 != 13) {
                                    if (i10 != 14) {
                                        super.zzt(i10, obj);
                                        return;
                                    }
                                    obj.getClass();
                                    zzel zzelVar = (zzel) obj;
                                    if (zzelVar.zzb() != 0 && zzelVar.zza() != 0) {
                                        zzabc zzabcVar = this.zzf;
                                        Surface surface = this.zzp;
                                        zzdi.zzb(surface);
                                        ((zzzr) zzabcVar).zza.zzu(surface, zzelVar);
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                this.zzf.zzj((List) obj);
                                this.zzC = true;
                                return;
                            }
                            zzaah zzaahVar = this.zzi;
                            obj.getClass();
                            zzaahVar.zzj(((Integer) obj).intValue());
                            return;
                        }
                        obj.getClass();
                        int intValue = ((Integer) obj).intValue();
                        this.zzs = intValue;
                        zzsc zzay = zzay();
                        if (zzay != null) {
                            zzay.zzq(intValue);
                            return;
                        }
                        return;
                    }
                    obj.getClass();
                    this.zzD = ((Integer) obj).intValue();
                    zzsc zzay2 = zzay();
                    if (zzay2 != null && zzet.zza >= 35) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("importance", Math.max(0, -this.zzD));
                        zzay2.zzp(bundle);
                        return;
                    }
                    return;
                }
                obj.getClass();
                int intValue2 = ((Integer) obj).intValue();
                if (this.zzE != intValue2) {
                    this.zzE = intValue2;
                    return;
                }
                return;
            }
            obj.getClass();
            zzaae zzaaeVar = (zzaae) obj;
            this.zzF = zzaaeVar;
            zzzt.zzq(((zzzr) this.zzf).zza, zzaaeVar);
            return;
        }
        if (obj instanceof Surface) {
            zzaadVar = (Surface) obj;
        } else {
            zzaadVar = null;
        }
        if (zzaadVar == null) {
            zzaad zzaadVar2 = this.zzq;
            if (zzaadVar2 != null) {
                zzaadVar = zzaadVar2;
            } else {
                zzsf zzaA = zzaA();
                if (zzaA != null && zzaX(zzaA)) {
                    zzaadVar = zzaad.zza(this.zze, zzaA.zzf);
                    this.zzq = zzaadVar;
                }
            }
        }
        if (this.zzp != zzaadVar) {
            this.zzp = zzaadVar;
            if (!this.zzk) {
                this.zzi.zzl(zzaadVar);
            }
            this.zzr = false;
            int zzcV = zzcV();
            zzsc zzay3 = zzay();
            zzaad zzaadVar3 = zzaadVar;
            if (zzay3 != null) {
                zzaadVar3 = zzaadVar;
                if (!this.zzk) {
                    zzaad zzaadVar4 = zzaadVar;
                    if (zzet.zza >= 23) {
                        if (zzaadVar != null) {
                            zzaadVar4 = zzaadVar;
                            if (!this.zzn) {
                                zzay3.zzo(zzaadVar);
                                zzaadVar3 = zzaadVar;
                            }
                        } else {
                            zzaadVar4 = null;
                        }
                    }
                    zzaF();
                    zzaB();
                    zzaadVar3 = zzaadVar4;
                }
            }
            if (zzaadVar3 != null && zzaadVar3 != this.zzq) {
                zzaU();
                if (zzcV == 2) {
                    this.zzi.zzc(true);
                    return;
                }
                return;
            }
            this.zzB = null;
            if (this.zzk) {
                ((zzzr) this.zzf).zza.zzr();
            }
        } else if (zzaadVar != null && zzaadVar != this.zzq) {
            zzaU();
            Surface surface2 = this.zzp;
            if (surface2 != null && this.zzr) {
                this.zzg.zzq(surface2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzhm
    public final void zzw() {
        this.zzB = null;
        if (this.zzk) {
            zzzt.zzg(((zzzr) this.zzf).zza).zzd();
        } else {
            this.zzi.zzd();
        }
        this.zzr = false;
        try {
            super.zzw();
        } finally {
            this.zzg.zzc(((zzso) this).zza);
            this.zzg.zzt(zzcp.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzhm
    public final void zzx(boolean z10, boolean z11) {
        super.zzx(z10, z11);
        zzm();
        this.zzg.zze(((zzso) this).zza);
        if (!this.zzl) {
            this.zzk = this.zzC;
            this.zzl = true;
        }
        if (this.zzk) {
            zzzt.zzg(((zzzr) this.zzf).zza).zze(z11);
        } else {
            this.zzi.zze(z11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhm
    public final void zzy() {
        zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzhm
    public final void zzz(long j10, boolean z10) {
        this.zzf.zze();
        this.zzf.zzi(zzau());
        super.zzz(j10, z10);
        this.zzi.zzi();
        if (z10) {
            this.zzi.zzc(false);
        }
        this.zzv = 0;
    }
}
