package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzakn implements zzaka {
    private static final byte[] zza = {0, 7, 8, 15};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, Field.MACROBUTTON, Field.INCLUDETEXT, Field.DOCPROPERTY, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzakg zzg;
    private final zzakf zzh;
    private final zzakm zzi;
    private Bitmap zzj;

    public zzakn(List list) {
        zzek zzekVar = new zzek((byte[]) list.get(0));
        int zzq = zzekVar.zzq();
        int zzq2 = zzekVar.zzq();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzakg(719, 575, 0, 719, 0, 575);
        this.zzh = new zzakf(0, zzh(), zzi(), zzj());
        this.zzi = new zzakm(zzq, zzq2);
    }

    private static int zzc(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static zzakf zzd(zzej zzejVar, int i10) {
        int[] iArr;
        int zzd;
        int i11;
        int zzd2;
        int zzd3;
        int i12 = 8;
        int zzd4 = zzejVar.zzd(8);
        zzejVar.zzn(8);
        int[] zzh = zzh();
        int[] zzi = zzi();
        int[] zzj = zzj();
        int i13 = i10 - 2;
        while (i13 > 0) {
            int zzd5 = zzejVar.zzd(i12);
            int zzd6 = zzejVar.zzd(i12);
            int i14 = i13 - 2;
            if ((zzd6 & 128) != 0) {
                iArr = zzh;
            } else if ((zzd6 & 64) != 0) {
                iArr = zzi;
            } else {
                iArr = zzj;
            }
            if ((zzd6 & 1) != 0) {
                zzd2 = zzejVar.zzd(i12);
                zzd3 = zzejVar.zzd(i12);
                zzd = zzejVar.zzd(i12);
                i11 = zzejVar.zzd(i12);
                i13 = i14 - 4;
            } else {
                int zzd7 = zzejVar.zzd(2) << 6;
                i13 = i14 - 2;
                zzd = zzejVar.zzd(4) << 4;
                i11 = zzd7;
                zzd2 = zzejVar.zzd(6) << 2;
                zzd3 = zzejVar.zzd(4) << 4;
            }
            if (zzd2 == 0) {
                i11 = 255;
            }
            if (zzd2 == 0) {
                zzd = 0;
            }
            if (zzd2 == 0) {
                zzd3 = 0;
            }
            double d10 = zzd2;
            double d11 = zzd3 - 128;
            double d12 = zzd - 128;
            iArr[zzd5] = zzc((byte) (255 - (i11 & FunctionEval.FunctionID.EXTERNAL_FUNC)), Math.max(0, Math.min((int) ((1.402d * d11) + d10), (int) FunctionEval.FunctionID.EXTERNAL_FUNC)), Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), (int) FunctionEval.FunctionID.EXTERNAL_FUNC)), Math.max(0, Math.min((int) ((d12 * 1.772d) + d10), (int) FunctionEval.FunctionID.EXTERNAL_FUNC)));
            zzd4 = zzd4;
            i12 = 8;
        }
        return new zzakf(zzd4, zzh, zzi, zzj);
    }

    private static zzakh zze(zzej zzejVar) {
        byte[] bArr;
        int zzd = zzejVar.zzd(16);
        zzejVar.zzn(4);
        int zzd2 = zzejVar.zzd(2);
        boolean zzp = zzejVar.zzp();
        zzejVar.zzn(1);
        byte[] bArr2 = zzet.zzf;
        if (zzd2 == 1) {
            zzejVar.zzn(zzejVar.zzd(8) * 16);
        } else if (zzd2 == 0) {
            int zzd3 = zzejVar.zzd(16);
            int zzd4 = zzejVar.zzd(16);
            if (zzd3 > 0) {
                bArr2 = new byte[zzd3];
                zzejVar.zzi(bArr2, 0, zzd3);
            }
            if (zzd4 > 0) {
                bArr = new byte[zzd4];
                zzejVar.zzi(bArr, 0, zzd4);
                return new zzakh(zzd, zzp, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new zzakh(zzd, zzp, bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0228 A[LOOP:3: B:88:0x0172->B:119:0x0228, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0181  */
    /* JADX WARN: Type inference failed for: r2v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzf(byte[] r24, int[] r25, int r26, int r27, int r28, android.graphics.Paint r29, android.graphics.Canvas r30) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakn.zzf(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] zzg(int i10, int i11, zzej zzejVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) zzejVar.zzd(i11);
        }
        return bArr;
    }

    private static int[] zzh() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] zzi() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i15 = 1; i15 < 16; i15++) {
            int i16 = i15 & 4;
            int i17 = i15 & 2;
            int i18 = i15 & 1;
            if (i15 < 8) {
                if (1 != i18) {
                    i12 = 0;
                } else {
                    i12 = 255;
                }
                if (i17 != 0) {
                    i13 = 255;
                } else {
                    i13 = 0;
                }
                if (i16 != 0) {
                    i14 = 255;
                } else {
                    i14 = 0;
                }
                iArr[i15] = zzc(FunctionEval.FunctionID.EXTERNAL_FUNC, i12, i13, i14);
            } else {
                int i19 = ShapeTypes.VERTICAL_SCROLL;
                if (1 != i18) {
                    i10 = 0;
                } else {
                    i10 = 127;
                }
                if (i17 != 0) {
                    i11 = 127;
                } else {
                    i11 = 0;
                }
                if (i16 == 0) {
                    i19 = 0;
                }
                iArr[i15] = zzc(FunctionEval.FunctionID.EXTERNAL_FUNC, i10, i11, i19);
            }
        }
        return iArr;
    }

    private static int[] zzj() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i28 = 0; i28 < 256; i28++) {
            int i29 = FunctionEval.FunctionID.EXTERNAL_FUNC;
            if (i28 < 8) {
                int i30 = i28 & 2;
                int i31 = i28 & 4;
                if (1 != (i28 & 1)) {
                    i26 = 0;
                } else {
                    i26 = 255;
                }
                if (i30 != 0) {
                    i27 = 255;
                } else {
                    i27 = 0;
                }
                if (i31 == 0) {
                    i29 = 0;
                }
                iArr[i28] = zzc(63, i26, i27, i29);
            } else {
                int i32 = i28 & ShapeTypes.FLOW_CHART_INTERNAL_STORAGE;
                int i33 = ShapeTypes.ACTION_BUTTON_DOCUMENT;
                int i34 = 85;
                if (i32 != 0) {
                    if (i32 != 8) {
                        int i35 = 43;
                        if (i32 != 128) {
                            if (i32 == 136) {
                                int i36 = i28 & 16;
                                int i37 = i28 & 32;
                                int i38 = i28 & 2;
                                int i39 = i28 & 64;
                                int i40 = i28 & 4;
                                if (1 != (i28 & 1)) {
                                    i22 = 0;
                                } else {
                                    i22 = 43;
                                }
                                if (i36 != 0) {
                                    i23 = 85;
                                } else {
                                    i23 = 0;
                                }
                                if (i38 != 0) {
                                    i24 = 43;
                                } else {
                                    i24 = 0;
                                }
                                if (i37 != 0) {
                                    i25 = 85;
                                } else {
                                    i25 = 0;
                                }
                                if (i40 == 0) {
                                    i35 = 0;
                                }
                                if (i39 == 0) {
                                    i34 = 0;
                                }
                                iArr[i28] = zzc(FunctionEval.FunctionID.EXTERNAL_FUNC, i22 + i23, i24 + i25, i35 + i34);
                            }
                        } else {
                            int i41 = i28 & 16;
                            int i42 = i28 & 32;
                            int i43 = i28 & 2;
                            int i44 = i28 & 64;
                            int i45 = i28 & 4;
                            if (1 != (i28 & 1)) {
                                i18 = 0;
                            } else {
                                i18 = 43;
                            }
                            int i46 = i18 + ShapeTypes.VERTICAL_SCROLL;
                            if (i41 != 0) {
                                i19 = 85;
                            } else {
                                i19 = 0;
                            }
                            if (i43 != 0) {
                                i20 = 43;
                            } else {
                                i20 = 0;
                            }
                            int i47 = i20 + ShapeTypes.VERTICAL_SCROLL;
                            if (i42 != 0) {
                                i21 = 85;
                            } else {
                                i21 = 0;
                            }
                            if (i45 == 0) {
                                i35 = 0;
                            }
                            int i48 = i35 + ShapeTypes.VERTICAL_SCROLL;
                            if (i44 == 0) {
                                i34 = 0;
                            }
                            iArr[i28] = zzc(FunctionEval.FunctionID.EXTERNAL_FUNC, i46 + i19, i47 + i21, i48 + i34);
                        }
                    } else {
                        int i49 = i28 & 16;
                        int i50 = i28 & 32;
                        int i51 = i28 & 2;
                        int i52 = i28 & 64;
                        int i53 = i28 & 4;
                        if (1 != (i28 & 1)) {
                            i14 = 0;
                        } else {
                            i14 = 85;
                        }
                        if (i49 != 0) {
                            i15 = 170;
                        } else {
                            i15 = 0;
                        }
                        if (i51 != 0) {
                            i16 = 85;
                        } else {
                            i16 = 0;
                        }
                        if (i50 != 0) {
                            i17 = 170;
                        } else {
                            i17 = 0;
                        }
                        if (i53 == 0) {
                            i34 = 0;
                        }
                        if (i52 == 0) {
                            i33 = 0;
                        }
                        iArr[i28] = zzc(ShapeTypes.VERTICAL_SCROLL, i14 + i15, i16 + i17, i34 + i33);
                    }
                } else {
                    int i54 = i28 & 16;
                    int i55 = i28 & 32;
                    int i56 = i28 & 2;
                    int i57 = i28 & 64;
                    int i58 = i28 & 4;
                    if (1 != (i28 & 1)) {
                        i10 = 0;
                    } else {
                        i10 = 85;
                    }
                    if (i54 != 0) {
                        i11 = 170;
                    } else {
                        i11 = 0;
                    }
                    if (i56 != 0) {
                        i12 = 85;
                    } else {
                        i12 = 0;
                    }
                    if (i55 != 0) {
                        i13 = 170;
                    } else {
                        i13 = 0;
                    }
                    if (i58 == 0) {
                        i34 = 0;
                    }
                    if (i57 == 0) {
                        i33 = 0;
                    }
                    iArr[i28] = zzc(FunctionEval.FunctionID.EXTERNAL_FUNC, i10 + i11, i12 + i13, i34 + i33);
                }
            }
        }
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zza(byte[] bArr, int i10, int i11, zzajz zzajzVar, zzdn zzdnVar) {
        zzajs zzajsVar;
        char c;
        char c10;
        int i12;
        SparseArray sparseArray;
        int i13;
        SparseArray sparseArray2;
        Paint paint;
        int[] iArr;
        zzakk zzakkVar;
        int i14;
        int zzd;
        int zzd2;
        int i15;
        int i16;
        int i17;
        int i18;
        zzej zzejVar = new zzej(bArr, i10 + i11);
        zzejVar.zzl(i10);
        while (zzejVar.zza() >= 48 && zzejVar.zzd(8) == 15) {
            zzakm zzakmVar = this.zzi;
            int zzd3 = zzejVar.zzd(8);
            int zzd4 = zzejVar.zzd(16);
            int zzd5 = zzejVar.zzd(16);
            int zzb2 = zzejVar.zzb() + zzd5;
            if (zzd5 * 8 > zzejVar.zza()) {
                zzea.zzf("DvbParser", "Data field length exceeds limit");
                zzejVar.zzn(zzejVar.zza());
            } else {
                switch (zzd3) {
                    case 16:
                        if (zzd4 == zzakmVar.zza) {
                            zzaki zzakiVar = zzakmVar.zzi;
                            int zzd6 = zzejVar.zzd(8);
                            int zzd7 = zzejVar.zzd(4);
                            int zzd8 = zzejVar.zzd(2);
                            zzejVar.zzn(2);
                            SparseArray sparseArray3 = new SparseArray();
                            for (int i19 = zzd5 - 2; i19 > 0; i19 -= 6) {
                                int zzd9 = zzejVar.zzd(8);
                                zzejVar.zzn(8);
                                sparseArray3.put(zzd9, new zzakj(zzejVar.zzd(16), zzejVar.zzd(16)));
                            }
                            zzaki zzakiVar2 = new zzaki(zzd6, zzd7, zzd8, sparseArray3);
                            if (zzakiVar2.zzb != 0) {
                                zzakmVar.zzi = zzakiVar2;
                                zzakmVar.zzc.clear();
                                zzakmVar.zzd.clear();
                                zzakmVar.zze.clear();
                                break;
                            } else if (zzakiVar != null) {
                                if (zzakiVar.zza != zzakiVar2.zza) {
                                    zzakmVar.zzi = zzakiVar2;
                                    break;
                                }
                            }
                        }
                        break;
                    case 17:
                        zzaki zzakiVar3 = zzakmVar.zzi;
                        if (zzd4 == zzakmVar.zza && zzakiVar3 != null) {
                            int zzd10 = zzejVar.zzd(8);
                            zzejVar.zzn(4);
                            boolean zzp = zzejVar.zzp();
                            zzejVar.zzn(3);
                            int zzd11 = zzejVar.zzd(16);
                            int zzd12 = zzejVar.zzd(16);
                            int zzd13 = zzejVar.zzd(3);
                            int zzd14 = zzejVar.zzd(3);
                            zzejVar.zzn(2);
                            int zzd15 = zzejVar.zzd(8);
                            int zzd16 = zzejVar.zzd(8);
                            int zzd17 = zzejVar.zzd(4);
                            int zzd18 = zzejVar.zzd(2);
                            zzejVar.zzn(2);
                            int i20 = zzd5 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i20 > 0) {
                                int zzd19 = zzejVar.zzd(16);
                                int zzd20 = zzejVar.zzd(2);
                                int zzd21 = zzejVar.zzd(2);
                                int zzd22 = zzejVar.zzd(12);
                                zzejVar.zzn(4);
                                int zzd23 = zzejVar.zzd(12);
                                i20 -= 6;
                                if (zzd20 != 1) {
                                    if (zzd20 == 2) {
                                        zzd20 = 2;
                                    } else {
                                        i14 = zzd20;
                                        zzd = 0;
                                        zzd2 = 0;
                                        sparseArray4.put(zzd19, new zzakl(i14, zzd21, zzd22, zzd23, zzd, zzd2));
                                    }
                                }
                                i20 -= 2;
                                i14 = zzd20;
                                zzd = zzejVar.zzd(8);
                                zzd2 = zzejVar.zzd(8);
                                sparseArray4.put(zzd19, new zzakl(i14, zzd21, zzd22, zzd23, zzd, zzd2));
                            }
                            zzakk zzakkVar2 = new zzakk(zzd10, zzp, zzd11, zzd12, zzd13, zzd14, zzd15, zzd16, zzd17, zzd18, sparseArray4);
                            if (zzakiVar3.zzb == 0 && (zzakkVar = (zzakk) zzakmVar.zzc.get(zzakkVar2.zza)) != null) {
                                int i21 = 0;
                                while (true) {
                                    SparseArray sparseArray5 = zzakkVar.zzj;
                                    if (i21 < sparseArray5.size()) {
                                        zzakkVar2.zzj.put(sparseArray5.keyAt(i21), (zzakl) sparseArray5.valueAt(i21));
                                        i21++;
                                    }
                                }
                            }
                            zzakmVar.zzc.put(zzakkVar2.zza, zzakkVar2);
                            break;
                        }
                        break;
                    case 18:
                        if (zzd4 == zzakmVar.zza) {
                            zzakf zzd24 = zzd(zzejVar, zzd5);
                            zzakmVar.zzd.put(zzd24.zza, zzd24);
                            break;
                        } else if (zzd4 == zzakmVar.zzb) {
                            zzakf zzd25 = zzd(zzejVar, zzd5);
                            zzakmVar.zzf.put(zzd25.zza, zzd25);
                            break;
                        }
                        break;
                    case 19:
                        if (zzd4 == zzakmVar.zza) {
                            zzakh zze = zze(zzejVar);
                            zzakmVar.zze.put(zze.zza, zze);
                            break;
                        } else if (zzd4 == zzakmVar.zzb) {
                            zzakh zze2 = zze(zzejVar);
                            zzakmVar.zzg.put(zze2.zza, zze2);
                            break;
                        }
                        break;
                    case 20:
                        if (zzd4 == zzakmVar.zza) {
                            zzejVar.zzn(4);
                            boolean zzp2 = zzejVar.zzp();
                            zzejVar.zzn(3);
                            int zzd26 = zzejVar.zzd(16);
                            int zzd27 = zzejVar.zzd(16);
                            if (zzp2) {
                                int zzd28 = zzejVar.zzd(16);
                                i15 = zzejVar.zzd(16);
                                i18 = zzejVar.zzd(16);
                                i16 = zzejVar.zzd(16);
                                i17 = zzd28;
                            } else {
                                i15 = zzd26;
                                i16 = zzd27;
                                i17 = 0;
                                i18 = 0;
                            }
                            zzakmVar.zzh = new zzakg(zzd26, zzd27, i17, i15, i18, i16);
                            break;
                        }
                        break;
                }
                zzejVar.zzo(zzb2 - zzejVar.zzb());
            }
        }
        zzakm zzakmVar2 = this.zzi;
        zzaki zzakiVar4 = zzakmVar2.zzi;
        if (zzakiVar4 == null) {
            zzajsVar = new zzajs(zzfxr.zzm(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzakg zzakgVar = zzakmVar2.zzh;
            if (zzakgVar == null) {
                zzakgVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzakgVar.zza + 1 != bitmap.getWidth() || zzakgVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(zzakgVar.zza + 1, zzakgVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = createBitmap;
                this.zzf.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray6 = zzakiVar4.zzc;
            int i22 = 0;
            while (i22 < sparseArray6.size()) {
                this.zzf.save();
                zzakj zzakjVar = (zzakj) sparseArray6.valueAt(i22);
                zzakk zzakkVar3 = (zzakk) this.zzi.zzc.get(sparseArray6.keyAt(i22));
                int i23 = zzakjVar.zza + zzakgVar.zzc;
                int i24 = zzakjVar.zzb + zzakgVar.zze;
                this.zzf.clipRect(i23, i24, Math.min(zzakkVar3.zzc + i23, zzakgVar.zzd), Math.min(zzakkVar3.zzd + i24, zzakgVar.zzf));
                zzakf zzakfVar = (zzakf) this.zzi.zzd.get(zzakkVar3.zzf);
                if (zzakfVar == null) {
                    zzakfVar = (zzakf) this.zzi.zzf.get(zzakkVar3.zzf);
                    if (zzakfVar == null) {
                        zzakfVar = this.zzh;
                    }
                }
                SparseArray sparseArray7 = zzakkVar3.zzj;
                int i25 = 0;
                while (i25 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i25);
                    zzakl zzaklVar = (zzakl) sparseArray7.valueAt(i25);
                    zzakh zzakhVar = (zzakh) this.zzi.zze.get(keyAt);
                    if (zzakhVar == null) {
                        zzakhVar = (zzakh) this.zzi.zzg.get(keyAt);
                    }
                    if (zzakhVar != null) {
                        if (zzakhVar.zzb) {
                            paint = null;
                        } else {
                            paint = this.zzd;
                        }
                        int i26 = zzakkVar3.zze;
                        int i27 = zzaklVar.zza + i23;
                        int i28 = zzaklVar.zzb + i24;
                        sparseArray = sparseArray6;
                        Canvas canvas = this.zzf;
                        sparseArray2 = sparseArray7;
                        if (i26 == 3) {
                            iArr = zzakfVar.zzd;
                        } else if (i26 == 2) {
                            iArr = zzakfVar.zzc;
                        } else {
                            iArr = zzakfVar.zzb;
                        }
                        i13 = i22;
                        int[] iArr2 = iArr;
                        Paint paint2 = paint;
                        zzf(zzakhVar.zzc, iArr2, i26, i27, i28, paint2, canvas);
                        zzf(zzakhVar.zzd, iArr2, i26, i27, i28 + 1, paint2, canvas);
                    } else {
                        sparseArray = sparseArray6;
                        i13 = i22;
                        sparseArray2 = sparseArray7;
                    }
                    i25++;
                    sparseArray6 = sparseArray;
                    sparseArray7 = sparseArray2;
                    i22 = i13;
                }
                SparseArray sparseArray8 = sparseArray6;
                int i29 = i22;
                float f10 = i24;
                float f11 = i23;
                if (zzakkVar3.zzb) {
                    int i30 = zzakkVar3.zze;
                    c = 3;
                    if (i30 == 3) {
                        i12 = zzakfVar.zzd[zzakkVar3.zzg];
                        c10 = 2;
                    } else {
                        c10 = 2;
                        if (i30 == 2) {
                            i12 = zzakfVar.zzc[zzakkVar3.zzh];
                        } else {
                            i12 = zzakfVar.zzb[zzakkVar3.zzi];
                        }
                    }
                    this.zze.setColor(i12);
                    this.zzf.drawRect(f11, f10, zzakkVar3.zzc + i23, zzakkVar3.zzd + i24, this.zze);
                } else {
                    c = 3;
                    c10 = 2;
                }
                zzcz zzczVar = new zzcz();
                zzczVar.zzc(Bitmap.createBitmap(this.zzj, i23, i24, zzakkVar3.zzc, zzakkVar3.zzd));
                zzczVar.zzh(f11 / zzakgVar.zza);
                zzczVar.zzi(0);
                zzczVar.zze(f10 / zzakgVar.zzb, 0);
                zzczVar.zzf(0);
                zzczVar.zzk(zzakkVar3.zzc / zzakgVar.zza);
                zzczVar.zzd(zzakkVar3.zzd / zzakgVar.zzb);
                arrayList.add(zzczVar.zzp());
                this.zzf.drawColor(0, PorterDuff.Mode.CLEAR);
                this.zzf.restore();
                i22 = i29 + 1;
                sparseArray6 = sparseArray8;
            }
            zzajsVar = new zzajs(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzdnVar.zza(zzajsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zzb() {
        zzakm zzakmVar = this.zzi;
        zzakmVar.zzc.clear();
        zzakmVar.zzd.clear();
        zzakmVar.zze.clear();
        zzakmVar.zzf.clear();
        zzakmVar.zzg.clear();
        zzakmVar.zzh = null;
        zzakmVar.zzi = null;
    }
}
