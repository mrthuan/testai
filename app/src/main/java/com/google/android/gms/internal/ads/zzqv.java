package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hssf.record.BOFRecord;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzqv extends zzso implements zzkg {
    private final Context zzb;
    private final zzpd zzc;
    private final zzpl zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private zzaf zzh;
    private zzaf zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;

    public zzqv(Context context, zzsa zzsaVar, zzsq zzsqVar, boolean z10, Handler handler, zzpe zzpeVar, zzpl zzplVar) {
        super(1, zzsaVar, zzsqVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zzplVar;
        this.zzn = -1000;
        this.zzc = new zzpd(handler, zzpeVar);
        zzplVar.zzp(new zzqu(this, null));
    }

    private final int zzaO(zzsf zzsfVar, zzaf zzafVar) {
        int i10;
        if ("OMX.google.raw.decoder".equals(zzsfVar.zza) && (i10 = zzet.zza) < 24 && (i10 != 23 || !zzet.zzN(this.zzb))) {
            return -1;
        }
        return zzafVar.zzn;
    }

    private static List zzaP(zzsq zzsqVar, zzaf zzafVar, boolean z10, zzpl zzplVar) {
        zzsf zzb;
        if (zzafVar.zzm == null) {
            return zzfxr.zzm();
        }
        if (zzplVar.zzz(zzafVar) && (zzb = zztc.zzb()) != null) {
            return zzfxr.zzn(zzb);
        }
        return zztc.zzf(zzsqVar, zzafVar, false, false);
    }

    private final void zzaQ() {
        long zzb = this.zzd.zzb(zzW());
        if (zzb != Long.MIN_VALUE) {
            if (!this.zzk) {
                zzb = Math.max(this.zzj, zzb);
            }
            this.zzj = zzb;
            this.zzk = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhm
    public final void zzA() {
        this.zzd.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzhm
    public final void zzC() {
        this.zzm = false;
        try {
            super.zzC();
            if (this.zzl) {
                this.zzl = false;
                this.zzd.zzl();
            }
        } catch (Throwable th2) {
            if (this.zzl) {
                this.zzl = false;
                this.zzd.zzl();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhm
    public final void zzD() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzhm
    public final void zzE() {
        zzaQ();
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzle, com.google.android.gms.internal.ads.zzlh
    public final String zzU() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzle
    public final boolean zzW() {
        if (super.zzW() && this.zzd.zzy()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzle
    public final boolean zzX() {
        if (!this.zzd.zzx() && !super.zzX()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final float zzZ(float f10, zzaf zzafVar, zzaf[] zzafVarArr) {
        int i10 = -1;
        for (zzaf zzafVar2 : zzafVarArr) {
            int i11 = zzafVar2.zzA;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return i10 * f10;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final long zza() {
        if (zzcV() == 2) {
            zzaQ();
        }
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final int zzaa(zzsq zzsqVar, zzaf zzafVar) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13 = 128;
        if (!zzbn.zzg(zzafVar.zzm)) {
            return 128;
        }
        int i14 = zzet.zza;
        int i15 = zzafVar.zzG;
        boolean zzaN = zzso.zzaN(zzafVar);
        int i16 = 1;
        if (zzaN && (i15 == 0 || zztc.zzb() != null)) {
            zzoq zzd = this.zzd.zzd(zzafVar);
            if (!zzd.zzb) {
                i10 = 0;
            } else {
                if (true != zzd.zzc) {
                    i10 = 512;
                } else {
                    i10 = BOFRecord.VERSION;
                }
                if (zzd.zzd) {
                    i10 |= 2048;
                }
            }
            if (this.zzd.zzz(zzafVar)) {
                return i10 | ShapeTypes.ACTION_BUTTON_MOVIE;
            }
        } else {
            i10 = 0;
        }
        if ((!"audio/raw".equals(zzafVar.zzm) || this.zzd.zzz(zzafVar)) && this.zzd.zzz(zzet.zzz(2, zzafVar.zzz, zzafVar.zzA))) {
            List zzaP = zzaP(zzsqVar, zzafVar, false, this.zzd);
            if (!zzaP.isEmpty()) {
                if (!zzaN) {
                    i16 = 2;
                } else {
                    zzsf zzsfVar = (zzsf) zzaP.get(0);
                    boolean zze = zzsfVar.zze(zzafVar);
                    if (!zze) {
                        for (int i17 = 1; i17 < zzaP.size(); i17++) {
                            zzsf zzsfVar2 = (zzsf) zzaP.get(i17);
                            if (zzsfVar2.zze(zzafVar)) {
                                z10 = false;
                                zze = true;
                                zzsfVar = zzsfVar2;
                                break;
                            }
                        }
                    }
                    z10 = true;
                    if (true != zze) {
                        i11 = 3;
                    } else {
                        i11 = 4;
                    }
                    int i18 = 8;
                    if (zze && zzsfVar.zzf(zzafVar)) {
                        i18 = 16;
                    }
                    if (true != zzsfVar.zzg) {
                        i12 = 0;
                    } else {
                        i12 = 64;
                    }
                    if (true != z10) {
                        i13 = 0;
                    }
                    return i11 | i18 | 32 | i12 | i13 | i10;
                }
            }
        }
        return i16 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final zzho zzab(zzsf zzsfVar, zzaf zzafVar, zzaf zzafVar2) {
        int i10;
        int i11;
        zzho zzb = zzsfVar.zzb(zzafVar, zzafVar2);
        int i12 = zzb.zze;
        if (zzaL(zzafVar2)) {
            i12 |= Variant.VT_RESERVED;
        }
        if (zzaO(zzsfVar, zzafVar2) > this.zze) {
            i12 |= 64;
        }
        String str = zzsfVar.zza;
        if (i12 != 0) {
            i11 = i12;
            i10 = 0;
        } else {
            i10 = zzb.zzd;
            i11 = 0;
        }
        return new zzho(str, zzafVar, zzafVar2, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final zzho zzac(zzjz zzjzVar) {
        zzaf zzafVar = zzjzVar.zza;
        zzafVar.getClass();
        this.zzh = zzafVar;
        zzho zzac = super.zzac(zzjzVar);
        this.zzc.zzi(zzafVar, zzac);
        return zzac;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x00d0, code lost:
        if ("AXON 7 mini".equals(r10) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0112  */
    @Override // com.google.android.gms.internal.ads.zzso
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzrz zzaf(com.google.android.gms.internal.ads.zzsf r8, com.google.android.gms.internal.ads.zzaf r9, android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqv.zzaf(com.google.android.gms.internal.ads.zzsf, com.google.android.gms.internal.ads.zzaf, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzrz");
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final List zzag(zzsq zzsqVar, zzaf zzafVar, boolean z10) {
        return zztc.zzg(zzaP(zzsqVar, zzafVar, false, this.zzd), zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzaj(zzhd zzhdVar) {
        zzaf zzafVar;
        if (zzet.zza >= 29 && (zzafVar = zzhdVar.zza) != null && Objects.equals(zzafVar.zzm, "audio/opus") && zzaK()) {
            ByteBuffer byteBuffer = zzhdVar.zzf;
            byteBuffer.getClass();
            zzaf zzafVar2 = zzhdVar.zza;
            zzafVar2.getClass();
            if (byteBuffer.remaining() == 8) {
                this.zzd.zzq(zzafVar2.zzC, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzak(Exception exc) {
        zzea.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzal(String str, zzrz zzrzVar, long j10, long j11) {
        this.zzc.zze(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzam(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzan(zzaf zzafVar, MediaFormat mediaFormat) {
        int i10;
        int[] iArr;
        int i11;
        zzaf zzafVar2 = this.zzi;
        boolean z10 = true;
        int[] iArr2 = null;
        if (zzafVar2 != null) {
            zzafVar = zzafVar2;
        } else if (zzay() != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(zzafVar.zzm)) {
                i10 = zzafVar.zzB;
            } else if (zzet.zza >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = zzet.zzl(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i10 = 2;
            }
            zzad zzadVar = new zzad();
            zzadVar.zzX("audio/raw");
            zzadVar.zzR(i10);
            zzadVar.zzF(zzafVar.zzC);
            zzadVar.zzG(zzafVar.zzD);
            zzadVar.zzQ(zzafVar.zzk);
            zzadVar.zzK(zzafVar.zza);
            zzadVar.zzM(zzafVar.zzb);
            zzadVar.zzN(zzafVar.zzc);
            zzadVar.zzO(zzafVar.zzd);
            zzadVar.zzZ(zzafVar.zze);
            zzadVar.zzV(zzafVar.zzf);
            zzadVar.zzy(mediaFormat.getInteger("channel-count"));
            zzadVar.zzY(mediaFormat.getInteger("sample-rate"));
            zzaf zzad = zzadVar.zzad();
            if (this.zzf && zzad.zzz == 6 && (i11 = zzafVar.zzz) < 6) {
                iArr2 = new int[i11];
                for (int i12 = 0; i12 < zzafVar.zzz; i12++) {
                    iArr2[i12] = i12;
                }
            } else if (this.zzg) {
                int i13 = zzad.zzz;
                if (i13 != 3) {
                    if (i13 != 5) {
                        if (i13 != 6) {
                            if (i13 != 7) {
                                if (i13 == 8) {
                                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                                }
                            } else {
                                iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                            }
                        } else {
                            iArr = new int[]{0, 2, 1, 5, 3, 4};
                        }
                    } else {
                        iArr = new int[]{0, 2, 1, 3, 4};
                    }
                } else {
                    iArr = new int[]{0, 2, 1};
                }
                iArr2 = iArr;
            }
            zzafVar = zzad;
        }
        try {
            int i14 = zzet.zza;
            if (i14 >= 29) {
                if (zzaK()) {
                    zzm();
                }
                if (i14 < 29) {
                    z10 = false;
                }
                zzdi.zzf(z10);
            }
            this.zzd.zze(zzafVar, 0, iArr2);
        } catch (zzpg e10) {
            throw zzi(e10, e10.zza, false, 5001);
        }
    }

    public final void zzao() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzap() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzaq() {
        int i10;
        try {
            this.zzd.zzj();
        } catch (zzpk e10) {
            if (true != zzaK()) {
                i10 = 5002;
            } else {
                i10 = 5003;
            }
            throw zzi(e10, e10.zzc, e10.zzb, i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final boolean zzar(long j10, long j11, zzsc zzscVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzaf zzafVar) {
        byteBuffer.getClass();
        if (this.zzi != null && (i11 & 2) != 0) {
            zzscVar.getClass();
            zzscVar.zzn(i10, false);
            return true;
        } else if (z10) {
            if (zzscVar != null) {
                zzscVar.zzn(i10, false);
            }
            ((zzso) this).zza.zzf += i12;
            this.zzd.zzg();
            return true;
        } else {
            try {
                if (!this.zzd.zzw(byteBuffer, j12, i12)) {
                    return false;
                }
                if (zzscVar != null) {
                    zzscVar.zzn(i10, false);
                }
                ((zzso) this).zza.zze += i12;
                return true;
            } catch (zzph e10) {
                zzaf zzafVar2 = this.zzh;
                if (zzaK()) {
                    zzm();
                }
                throw zzi(e10, zzafVar2, e10.zzb, 5001);
            } catch (zzpk e11) {
                if (zzaK()) {
                    zzm();
                }
                throw zzi(e11, zzafVar, e11.zzb, 5002);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final boolean zzas(zzaf zzafVar) {
        zzm();
        return this.zzd.zzz(zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final zzbq zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzg(zzbq zzbqVar) {
        this.zzd.zzr(zzbqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzj() {
        boolean z10 = this.zzm;
        this.zzm = false;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzhm, com.google.android.gms.internal.ads.zzkz
    public final void zzt(int i10, Object obj) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 6) {
                    if (i10 != 12) {
                        if (i10 != 16) {
                            if (i10 != 9) {
                                if (i10 != 10) {
                                    super.zzt(i10, obj);
                                    return;
                                }
                                zzpl zzplVar = this.zzd;
                                obj.getClass();
                                zzplVar.zzn(((Integer) obj).intValue());
                                return;
                            }
                            zzpl zzplVar2 = this.zzd;
                            obj.getClass();
                            zzplVar2.zzu(((Boolean) obj).booleanValue());
                            return;
                        }
                        obj.getClass();
                        this.zzn = ((Integer) obj).intValue();
                        zzsc zzay = zzay();
                        if (zzay != null && zzet.zza >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.zzn));
                            zzay.zzp(bundle);
                            return;
                        }
                        return;
                    } else if (zzet.zza >= 23) {
                        zzqs.zza(this.zzd, obj);
                        return;
                    } else {
                        return;
                    }
                }
                zzi zziVar = (zzi) obj;
                zzpl zzplVar3 = this.zzd;
                zziVar.getClass();
                zzplVar3.zzo(zziVar);
                return;
            }
            zzh zzhVar = (zzh) obj;
            zzpl zzplVar4 = this.zzd;
            zzhVar.getClass();
            zzplVar4.zzm(zzhVar);
            return;
        }
        zzpl zzplVar5 = this.zzd;
        obj.getClass();
        zzplVar5.zzv(((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzhm
    public final void zzw() {
        this.zzl = true;
        this.zzh = null;
        try {
            this.zzd.zzf();
            super.zzw();
        } finally {
            this.zzc.zzg(((zzso) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzhm
    public final void zzx(boolean z10, boolean z11) {
        super.zzx(z10, z11);
        this.zzc.zzh(((zzso) this).zza);
        zzm();
        this.zzd.zzs(zzn());
        zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzso, com.google.android.gms.internal.ads.zzhm
    public final void zzz(long j10, boolean z10) {
        super.zzz(j10, z10);
        this.zzd.zzf();
        this.zzj = j10;
        this.zzm = false;
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhm, com.google.android.gms.internal.ads.zzle
    public final zzkg zzk() {
        return this;
    }
}
