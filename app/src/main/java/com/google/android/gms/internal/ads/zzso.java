package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzso extends zzhm {
    private static final byte[] zzb = {0, 0, 1, 103, Field.SECTIONPAGES, -64, 11, -38, Field.PAGEREF, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, Field.GLOSSARY, -65, Field.NUMCHARS, Field.EQ, -61, Field.FILLIN, Field.ADDRESSBLOCK, 120};
    private boolean zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private long zzG;
    private int zzH;
    private int zzI;
    private ByteBuffer zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private long zzW;
    private long zzX;
    private boolean zzY;
    private boolean zzZ;
    protected zzhn zza;
    private boolean zzaa;
    private zzsn zzab;
    private long zzac;
    private boolean zzad;
    private zzrj zzae;
    private zzrj zzaf;
    private final zzsa zzc;
    private final zzsq zzd;
    private final float zze;
    private final zzhd zzf;
    private final zzhd zzg;
    private final zzhd zzh;
    private final zzrx zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzqw zzl;
    private zzaf zzm;
    private zzaf zzn;
    private zzld zzo;
    private MediaCrypto zzp;
    private float zzq;
    private zzsc zzr;
    private zzaf zzs;
    private MediaFormat zzt;
    private boolean zzu;
    private float zzv;
    private ArrayDeque zzw;
    private zzsk zzx;
    private zzsf zzy;
    private int zzz;

    public zzso(int i10, zzsa zzsaVar, zzsq zzsqVar, boolean z10, float f10) {
        super(i10);
        this.zzc = zzsaVar;
        this.zzd = zzsqVar;
        this.zze = f10;
        this.zzf = new zzhd(0, 0);
        this.zzg = new zzhd(0, 0);
        this.zzh = new zzhd(2, 0);
        zzrx zzrxVar = new zzrx();
        this.zzi = zzrxVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzq = 1.0f;
        this.zzk = new ArrayDeque();
        this.zzab = zzsn.zza;
        zzrxVar.zzi(0);
        zzrxVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzqw();
        this.zzv = -1.0f;
        this.zzz = 0;
        this.zzQ = 0;
        this.zzH = -1;
        this.zzI = -1;
        this.zzG = -9223372036854775807L;
        this.zzW = -9223372036854775807L;
        this.zzX = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzR = 0;
        this.zzS = 0;
        this.zza = new zzhn();
    }

    public static boolean zzaN(zzaf zzafVar) {
        if (zzafVar.zzG != 0) {
            return false;
        }
        return true;
    }

    private final void zzaO() {
        this.zzH = -1;
        this.zzg.zzc = null;
    }

    private final void zzaP() {
        this.zzI = -1;
        this.zzJ = null;
    }

    private final void zzaQ(zzsn zzsnVar) {
        this.zzab = zzsnVar;
        if (zzsnVar.zzd != -9223372036854775807L) {
            this.zzad = true;
        }
    }

    private final void zzaR() {
        zzrj zzrjVar = this.zzaf;
        zzrjVar.getClass();
        this.zzae = zzrjVar;
        this.zzR = 0;
        this.zzS = 0;
    }

    @TargetApi(23)
    private final boolean zzaS() {
        if (this.zzT) {
            this.zzR = 1;
            if (this.zzB) {
                this.zzS = 3;
                return false;
            }
            this.zzS = 2;
        } else {
            zzaR();
        }
        return true;
    }

    private final boolean zzaT() {
        zzsc zzscVar = this.zzr;
        if (zzscVar == null || this.zzR == 2 || this.zzY) {
            return false;
        }
        if (this.zzH < 0) {
            int zza = zzscVar.zza();
            this.zzH = zza;
            if (zza < 0) {
                return false;
            }
            this.zzg.zzc = zzscVar.zzf(zza);
            this.zzg.zzb();
        }
        if (this.zzR == 1) {
            if (!this.zzF) {
                this.zzU = true;
                zzscVar.zzj(this.zzH, 0, 0, 0L, 4);
                zzaO();
            }
            this.zzR = 2;
            return false;
        } else if (this.zzD) {
            this.zzD = false;
            ByteBuffer byteBuffer = this.zzg.zzc;
            byteBuffer.getClass();
            byteBuffer.put(zzb);
            zzscVar.zzj(this.zzH, 0, 38, 0L, 0);
            zzaO();
            this.zzT = true;
            return true;
        } else {
            if (this.zzQ == 1) {
                int i10 = 0;
                while (true) {
                    zzaf zzafVar = this.zzs;
                    zzafVar.getClass();
                    if (i10 >= zzafVar.zzo.size()) {
                        break;
                    }
                    ByteBuffer byteBuffer2 = this.zzg.zzc;
                    byteBuffer2.getClass();
                    byteBuffer2.put((byte[]) this.zzs.zzo.get(i10));
                    i10++;
                }
                this.zzQ = 2;
            }
            ByteBuffer byteBuffer3 = this.zzg.zzc;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            zzjz zzcY = zzcY();
            try {
                int zzcW = zzcW(zzcY, this.zzg, 0);
                if (zzcW == -3) {
                    if (zzQ()) {
                        this.zzX = this.zzW;
                    }
                    return false;
                } else if (zzcW == -5) {
                    if (this.zzQ == 2) {
                        this.zzg.zzb();
                        this.zzQ = 1;
                    }
                    zzac(zzcY);
                    return true;
                } else {
                    zzhd zzhdVar = this.zzg;
                    if (zzhdVar.zzf()) {
                        this.zzX = this.zzW;
                        if (this.zzQ == 2) {
                            zzhdVar.zzb();
                            this.zzQ = 1;
                        }
                        this.zzY = true;
                        if (!this.zzT) {
                            zzao();
                            return false;
                        }
                        try {
                            if (!this.zzF) {
                                this.zzU = true;
                                zzscVar.zzj(this.zzH, 0, 0, 0L, 4);
                                zzaO();
                            }
                            return false;
                        } catch (MediaCodec.CryptoException e10) {
                            throw zzi(e10, this.zzm, false, zzet.zzj(e10.getErrorCode()));
                        }
                    } else if (!this.zzT && !zzhdVar.zzg()) {
                        zzhdVar.zzb();
                        if (this.zzQ == 2) {
                            this.zzQ = 1;
                        }
                        return true;
                    } else {
                        boolean zzk = zzhdVar.zzk();
                        if (zzk) {
                            zzhdVar.zzb.zzb(position);
                        }
                        long j10 = this.zzg.zze;
                        if (this.zzaa) {
                            if (!this.zzk.isEmpty()) {
                                zzeq zzeqVar = ((zzsn) this.zzk.peekLast()).zze;
                                zzaf zzafVar2 = this.zzm;
                                zzafVar2.getClass();
                                zzeqVar.zzd(j10, zzafVar2);
                            } else {
                                zzeq zzeqVar2 = this.zzab.zze;
                                zzaf zzafVar3 = this.zzm;
                                zzafVar3.getClass();
                                zzeqVar2.zzd(j10, zzafVar3);
                            }
                            this.zzaa = false;
                        }
                        long max = Math.max(this.zzW, j10);
                        this.zzW = max;
                        if (zzQ() || this.zzg.zzh()) {
                            this.zzX = max;
                        }
                        this.zzg.zzj();
                        zzhd zzhdVar2 = this.zzg;
                        if (zzhdVar2.zze()) {
                            zzaj(zzhdVar2);
                        }
                        zzaD(this.zzg);
                        zzat(this.zzg);
                        try {
                            if (zzk) {
                                zzscVar.zzk(this.zzH, 0, this.zzg.zzb, j10, 0);
                            } else {
                                int i11 = this.zzH;
                                ByteBuffer byteBuffer4 = this.zzg.zzc;
                                byteBuffer4.getClass();
                                zzscVar.zzj(i11, 0, byteBuffer4.limit(), j10, 0);
                            }
                            zzaO();
                            this.zzT = true;
                            this.zzQ = 0;
                            this.zza.zzc++;
                            return true;
                        } catch (MediaCodec.CryptoException e11) {
                            throw zzi(e11, this.zzm, false, zzet.zzj(e11.getErrorCode()));
                        }
                    }
                }
            } catch (zzhc e12) {
                zzak(e12);
                zzaW(0);
                zzah();
                return true;
            }
        }
    }

    private final boolean zzaU() {
        if (this.zzI >= 0) {
            return true;
        }
        return false;
    }

    private final boolean zzaV(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        zzaf zzafVar = this.zzn;
        if (zzafVar == null || !Objects.equals(zzafVar.zzm, "audio/opus")) {
            return true;
        }
        if (zzade.zzf(j10, j11)) {
            return false;
        }
        return true;
    }

    private final boolean zzaW(int i10) {
        zzhd zzhdVar = this.zzf;
        zzjz zzcY = zzcY();
        zzhdVar.zzb();
        int zzcW = zzcW(zzcY, this.zzf, i10 | 4);
        if (zzcW == -5) {
            zzac(zzcY);
            return true;
        } else if (zzcW == -4 && this.zzf.zzf()) {
            this.zzY = true;
            zzao();
            return false;
        } else {
            return false;
        }
    }

    private final boolean zzaX(zzaf zzafVar) {
        if (zzet.zza >= 23 && this.zzr != null && this.zzS != 3 && zzcV() != 0) {
            float f10 = this.zzq;
            zzafVar.getClass();
            float zzZ = zzZ(f10, zzafVar, zzT());
            float f11 = this.zzv;
            if (f11 != zzZ) {
                if (zzZ == -1.0f) {
                    zzae();
                    return false;
                } else if (f11 != -1.0f || zzZ > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", zzZ);
                    zzsc zzscVar = this.zzr;
                    zzscVar.getClass();
                    zzscVar.zzp(bundle);
                    this.zzv = zzZ;
                }
            }
        }
        return true;
    }

    private final void zzad() {
        this.zzO = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzN = false;
        this.zzM = false;
        this.zzl.zzb();
    }

    private final void zzae() {
        if (this.zzT) {
            this.zzR = 1;
            this.zzS = 3;
            return;
        }
        zzaF();
        zzaB();
    }

    private final void zzah() {
        try {
            zzsc zzscVar = this.zzr;
            zzdi.zzb(zzscVar);
            zzscVar.zzi();
        } finally {
            zzaG();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03cf  */
    /* JADX WARN: Type inference failed for: r4v13, types: [int] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzai(com.google.android.gms.internal.ads.zzsf r19, android.media.MediaCrypto r20) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzso.zzai(com.google.android.gms.internal.ads.zzsf, android.media.MediaCrypto):void");
    }

    @TargetApi(23)
    private final void zzao() {
        int i10 = this.zzS;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.zzZ = true;
                    zzaq();
                    return;
                }
                zzaF();
                zzaB();
                return;
            }
            zzah();
            zzaR();
            return;
        }
        zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzhm
    public void zzC() {
        try {
            zzad();
            zzaF();
        } finally {
            this.zzaf = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r5 >= r1) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zzhm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzF(com.google.android.gms.internal.ads.zzaf[] r13, long r14, long r16, com.google.android.gms.internal.ads.zzui r18) {
        /*
            r12 = this;
            r0 = r12
            com.google.android.gms.internal.ads.zzsn r1 = r0.zzab
            long r1 = r1.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            com.google.android.gms.internal.ads.zzsn r1 = new com.google.android.gms.internal.ads.zzsn
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzaQ(r1)
            return
        L20:
            java.util.ArrayDeque r1 = r0.zzk
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.zzW
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.zzac
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            com.google.android.gms.internal.ads.zzsn r1 = new com.google.android.gms.internal.ads.zzsn
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzaQ(r1)
            com.google.android.gms.internal.ads.zzsn r1 = r0.zzab
            long r1 = r1.zzd
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L54
            r12.zzap()
        L54:
            return
        L55:
            java.util.ArrayDeque r1 = r0.zzk
            com.google.android.gms.internal.ads.zzsn r9 = new com.google.android.gms.internal.ads.zzsn
            long r3 = r0.zzW
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzso.zzF(com.google.android.gms.internal.ads.zzaf[], long, long, com.google.android.gms.internal.ads.zzui):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhm, com.google.android.gms.internal.ads.zzle
    public void zzM(float f10, float f11) {
        this.zzq = f11;
        zzaX(this.zzs);
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x0308, code lost:
        if (r15.zzn != null) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
        r15.zzZ = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
        r2 = true;
        r1 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x03ac A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24 */
    /* JADX WARN: Type inference failed for: r17v34 */
    /* JADX WARN: Type inference failed for: r17v35 */
    @Override // com.google.android.gms.internal.ads.zzle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzV(long r22, long r24) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzso.zzV(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public boolean zzW() {
        return this.zzZ;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public boolean zzX() {
        if (this.zzm == null) {
            return false;
        }
        if (zzS() || zzaU()) {
            return true;
        }
        if (this.zzG == -9223372036854775807L) {
            return false;
        }
        zzh();
        if (SystemClock.elapsedRealtime() >= this.zzG) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final int zzY(zzaf zzafVar) {
        try {
            return zzaa(this.zzd, zzafVar);
        } catch (zzsw e10) {
            throw zzi(e10, zzafVar, false, 4002);
        }
    }

    public float zzZ(float f10, zzaf zzafVar, zzaf[] zzafVarArr) {
        throw null;
    }

    public final zzsf zzaA() {
        return this.zzy;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed A[Catch: zzsk -> 0x010c, TryCatch #1 {zzsk -> 0x010c, blocks: (B:25:0x0053, B:27:0x0057, B:28:0x005c, B:30:0x0061, B:33:0x0066, B:35:0x007c, B:36:0x0087, B:41:0x0094, B:43:0x009c, B:45:0x00a1, B:46:0x00a7, B:48:0x00ab, B:50:0x00b4, B:60:0x00d3, B:62:0x00ed, B:64:0x00f6, B:67:0x00fd, B:68:0x00ff, B:63:0x00f0, B:69:0x0100, B:71:0x0103, B:72:0x010b, B:39:0x008b, B:40:0x0093, B:52:0x00ba, B:57:0x00c3, B:58:0x00d1), top: B:79:0x0053, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f0 A[Catch: zzsk -> 0x010c, TryCatch #1 {zzsk -> 0x010c, blocks: (B:25:0x0053, B:27:0x0057, B:28:0x005c, B:30:0x0061, B:33:0x0066, B:35:0x007c, B:36:0x0087, B:41:0x0094, B:43:0x009c, B:45:0x00a1, B:46:0x00a7, B:48:0x00ab, B:50:0x00b4, B:60:0x00d3, B:62:0x00ed, B:64:0x00f6, B:67:0x00fd, B:68:0x00ff, B:63:0x00f0, B:69:0x0100, B:71:0x0103, B:72:0x010b, B:39:0x008b, B:40:0x0093, B:52:0x00ba, B:57:0x00c3, B:58:0x00d1), top: B:79:0x0053, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzaB() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzso.zzaB():void");
    }

    public void zzaC(long j10) {
        this.zzac = j10;
        while (!this.zzk.isEmpty() && j10 >= ((zzsn) this.zzk.peek()).zzb) {
            zzsn zzsnVar = (zzsn) this.zzk.poll();
            zzsnVar.getClass();
            zzaQ(zzsnVar);
            zzap();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzsc, com.google.android.gms.internal.ads.zzrj, android.media.MediaCrypto] */
    public final void zzaF() {
        try {
            zzsc zzscVar = this.zzr;
            if (zzscVar != null) {
                zzscVar.zzl();
                this.zza.zzb++;
                zzsf zzsfVar = this.zzy;
                zzsfVar.getClass();
                zzam(zzsfVar.zza);
            }
        } finally {
            this.zzr = null;
            this.zzp = null;
            this.zzae = null;
            zzaH();
        }
    }

    public void zzaG() {
        zzaO();
        zzaP();
        this.zzG = -9223372036854775807L;
        this.zzU = false;
        this.zzT = false;
        this.zzD = false;
        this.zzE = false;
        this.zzK = false;
        this.zzL = false;
        this.zzW = -9223372036854775807L;
        this.zzX = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzR = 0;
        this.zzS = 0;
        this.zzQ = this.zzP ? 1 : 0;
    }

    public final void zzaH() {
        zzaG();
        this.zzw = null;
        this.zzy = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = false;
        this.zzV = false;
        this.zzv = -1.0f;
        this.zzz = 0;
        this.zzA = false;
        this.zzB = false;
        this.zzC = false;
        this.zzF = false;
        this.zzP = false;
        this.zzQ = 0;
    }

    public final boolean zzaI() {
        boolean zzaJ = zzaJ();
        if (zzaJ) {
            zzaB();
        }
        return zzaJ;
    }

    public final boolean zzaJ() {
        boolean z10;
        if (this.zzr == null) {
            return false;
        }
        int i10 = this.zzS;
        if (i10 != 3 && ((!this.zzA || this.zzV) && (!this.zzB || !this.zzU))) {
            if (i10 == 2) {
                int i11 = zzet.zza;
                if (i11 >= 23) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzdi.zzf(z10);
                if (i11 >= 23) {
                    try {
                        zzaR();
                    } catch (zzhw e10) {
                        zzea.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                        zzaF();
                        return true;
                    }
                }
            }
            zzah();
            return false;
        }
        zzaF();
        return true;
    }

    public final boolean zzaK() {
        return this.zzM;
    }

    public final boolean zzaL(zzaf zzafVar) {
        if (this.zzaf == null && zzas(zzafVar)) {
            return true;
        }
        return false;
    }

    public boolean zzaM(zzsf zzsfVar) {
        return true;
    }

    public abstract int zzaa(zzsq zzsqVar, zzaf zzafVar);

    public zzho zzab(zzsf zzsfVar, zzaf zzafVar, zzaf zzafVar2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
        if (zzaS() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ae, code lost:
        if (zzaS() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c1, code lost:
        if (zzaS() == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.zzho zzac(com.google.android.gms.internal.ads.zzjz r12) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzso.zzac(com.google.android.gms.internal.ads.zzjz):com.google.android.gms.internal.ads.zzho");
    }

    public abstract zzrz zzaf(zzsf zzsfVar, zzaf zzafVar, MediaCrypto mediaCrypto, float f10);

    public abstract List zzag(zzsq zzsqVar, zzaf zzafVar, boolean z10);

    public void zzaj(zzhd zzhdVar) {
        throw null;
    }

    public void zzak(Exception exc) {
        throw null;
    }

    public void zzal(String str, zzrz zzrzVar, long j10, long j11) {
        throw null;
    }

    public void zzam(String str) {
        throw null;
    }

    public void zzan(zzaf zzafVar, MediaFormat mediaFormat) {
        throw null;
    }

    public abstract boolean zzar(long j10, long j11, zzsc zzscVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzaf zzafVar);

    public boolean zzas(zzaf zzafVar) {
        return false;
    }

    public int zzat(zzhd zzhdVar) {
        return 0;
    }

    public final long zzau() {
        return this.zzab.zzd;
    }

    public final long zzav() {
        return this.zzab.zzc;
    }

    public final zzld zzax() {
        return this.zzo;
    }

    public final zzsc zzay() {
        return this.zzr;
    }

    public zzse zzaz(Throwable th2, zzsf zzsfVar) {
        return new zzse(th2, zzsfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhm, com.google.android.gms.internal.ads.zzlh
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzhm, com.google.android.gms.internal.ads.zzkz
    public void zzt(int i10, Object obj) {
        if (i10 == 11) {
            this.zzo = (zzld) obj;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhm
    public void zzw() {
        this.zzm = null;
        zzaQ(zzsn.zza);
        this.zzk.clear();
        zzaJ();
    }

    @Override // com.google.android.gms.internal.ads.zzhm
    public void zzx(boolean z10, boolean z11) {
        this.zza = new zzhn();
    }

    @Override // com.google.android.gms.internal.ads.zzhm
    public void zzz(long j10, boolean z10) {
        this.zzY = false;
        this.zzZ = false;
        if (this.zzM) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzN = false;
            this.zzl.zzb();
        } else {
            zzaI();
        }
        zzeq zzeqVar = this.zzab.zze;
        if (zzeqVar.zza() > 0) {
            this.zzaa = true;
        }
        zzeqVar.zze();
        this.zzk.clear();
    }

    public void zzap() {
    }

    public void zzaq() {
    }

    public void zzaD(zzhd zzhdVar) {
    }

    public void zzaE(zzaf zzafVar) {
    }
}
