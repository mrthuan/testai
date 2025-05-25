package wi;

import android.graphics.Bitmap;
import java.util.Arrays;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.java.awt.Color;
import xi.p;
import xi.q;

/* compiled from: EMFImageLoader.java */
/* loaded from: classes3.dex */
public final class b {
    public static Bitmap a(p pVar, int i10, int i11, c cVar, int i12, q qVar) {
        int i13;
        int i14;
        int i15 = pVar.f31757d;
        int i16 = 0;
        if (i15 == 1) {
            int readUnsignedByte = cVar.readUnsignedByte();
            int readUnsignedByte2 = cVar.readUnsignedByte();
            int readUnsignedByte3 = cVar.readUnsignedByte();
            cVar.readUnsignedByte();
            int rgb = new Color(readUnsignedByte3, readUnsignedByte2, readUnsignedByte).getRGB();
            int readUnsignedByte4 = cVar.readUnsignedByte();
            int readUnsignedByte5 = cVar.readUnsignedByte();
            int readUnsignedByte6 = cVar.readUnsignedByte();
            cVar.readUnsignedByte();
            int rgb2 = new Color(readUnsignedByte6, readUnsignedByte5, readUnsignedByte4).getRGB();
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            int[] c = cVar.c(i12 - 8);
            int i17 = i10 % 8;
            if (i17 != 0) {
                i17 = 8 - i17;
            }
            int[] iArr = {1, 2, 4, 8, 16, 32, 64, 128};
            int i18 = 0;
            for (int i19 = i11 - 1; i19 > -1; i19--) {
                for (int i20 = 0; i20 < i10; i20++) {
                    int i21 = c[i18 / 8] & iArr[i18 % 8];
                    i18++;
                    if (i21 > 0) {
                        createBitmap.setPixel(i20, i19, rgb2);
                    } else {
                        createBitmap.setPixel(i20, i19, rgb);
                    }
                }
                i18 += i17;
            }
            return createBitmap;
        }
        int i22 = 2;
        int i23 = pVar.f31762i;
        int i24 = pVar.f31758e;
        if (i15 == 4 && i24 == 0) {
            int i25 = i23 * 4;
            int[] c10 = cVar.c(i25);
            int i26 = i12 - i25;
            int[] iArr2 = new int[i26];
            int i27 = 0;
            while (i27 < i26 / 12) {
                int[] c11 = cVar.c(10);
                cVar.c(i22);
                System.arraycopy(c11, 0, iArr2, i27 * 10, 10);
                i27++;
                i22 = 2;
            }
            int[] iArr3 = new int[256];
            int i28 = 0;
            int i29 = 0;
            while (i28 < i23) {
                iArr3[i28] = new Color(c10[i29 + 2], c10[i29 + 1], c10[i29]).getRGB();
                i28++;
                i29 = i28 * 4;
            }
            if (i23 < 256) {
                Arrays.fill(iArr3, i23, 256, 0);
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            int i30 = 0;
            for (int i31 = i11 - 1; i31 > -1; i31--) {
                for (int i32 = 0; i32 < i10 && i30 < i26; i32 += 2) {
                    createBitmap2.setPixel(i32, i31, iArr3[iArr2[i30] % 8]);
                    createBitmap2.setPixel(i32 + 1, i31, iArr3[iArr2[i30] % 8]);
                    i30++;
                }
            }
            return createBitmap2;
        } else if (i15 == 8 && i24 == 0) {
            int i33 = i23 * 4;
            int[] c12 = cVar.c(i33);
            int[] c13 = cVar.c(i12 - i33);
            int[] iArr4 = new int[256];
            int i34 = 0;
            int i35 = 0;
            while (i34 < i23) {
                iArr4[i34] = new Color(c12[i35 + 2], c12[i35 + 1], c12[i35]).getRGB();
                i34++;
                i35 = i34 * 4;
            }
            if (i23 < 256) {
                Arrays.fill(iArr4, i23, 256, 0);
            }
            int i36 = i10 % 4;
            if (i36 != 0) {
                i36 = 4 - i36;
            }
            Bitmap createBitmap3 = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
            int i37 = 0;
            for (int i38 = i11 - 1; i38 > -1; i38--) {
                int i39 = 0;
                while (i39 < i10) {
                    createBitmap3.setPixel(i39, i38, iArr4[c13[i37]]);
                    i39++;
                    i37++;
                }
                i37 += i36;
            }
            return createBitmap3;
        } else {
            int i40 = 16;
            if (i15 == 16 && i24 == 0) {
                int i41 = i12 / 4;
                int[] iArr5 = new int[i41];
                for (int i42 = 0; i42 < i41; i42++) {
                    iArr5[i42] = (int) cVar.readUnsignedInt();
                }
                int i43 = ((i10 % 2) + i10) / 2;
                int i44 = (i41 / i43) / 2;
                Bitmap createBitmap4 = Bitmap.createBitmap(i43, i44, Bitmap.Config.RGB_565);
                int i45 = i44 - 1;
                int i46 = 0;
                while (i45 > -1) {
                    int i47 = 0;
                    while (i47 < i43) {
                        int i48 = iArr5[i46 + i43];
                        int i49 = i46 + 1;
                        int i50 = iArr5[i46];
                        createBitmap4.setPixel(i47, i45, new Color(((i50 & 31744) + (i48 & 31744)) / 63488.0f, ((i50 & 992) + (i48 & 992)) / 1984.0f, ((i50 & 31) + (i48 & 31)) / 62.0f).getRGB());
                        i47++;
                        i46 = i49;
                    }
                    i45--;
                    i46 += i43;
                }
                return createBitmap4;
            } else if (i15 == 32 && i24 == 0) {
                Bitmap createBitmap5 = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
                int i51 = i12 / 4;
                if (qVar != null) {
                    i14 = qVar.f31766a;
                    i13 = qVar.f31767b;
                } else {
                    i13 = 0;
                    i14 = 255;
                }
                int i52 = 65280;
                if (i13 != 1) {
                    int i53 = i11 - 1;
                    int i54 = 0;
                    while (i53 > -1 && i54 < i51) {
                        int i55 = i16;
                        while (i55 < i10 && i54 < i51) {
                            int readUnsignedInt = (int) cVar.readUnsignedInt();
                            createBitmap5.setPixel(i55, i53, new Color((readUnsignedInt & 16711680) >> 16, (readUnsignedInt & i52) >> 8, readUnsignedInt & FunctionEval.FunctionID.EXTERNAL_FUNC, i14).getRGB());
                            i55++;
                            i54++;
                            i52 = 65280;
                        }
                        i53--;
                        i16 = 0;
                        i52 = 65280;
                    }
                } else {
                    int i56 = -16777216;
                    if (i14 == 255) {
                        int i57 = i11 - 1;
                        int i58 = 0;
                        while (i57 > -1 && i58 < i51) {
                            int i59 = 0;
                            while (i59 < i10 && i58 < i51) {
                                int readUnsignedInt2 = (int) cVar.readUnsignedInt();
                                int i60 = (readUnsignedInt2 & (-16777216)) >> 24;
                                if (i60 == -1) {
                                    i60 = 255;
                                }
                                createBitmap5.setPixel(i59, i57, new Color((readUnsignedInt2 & 16711680) >> i40, (readUnsignedInt2 & 65280) >> 8, readUnsignedInt2 & FunctionEval.FunctionID.EXTERNAL_FUNC, i60).getRGB());
                                i59++;
                                i58++;
                                i40 = 16;
                            }
                            i57--;
                            i40 = 16;
                        }
                    } else {
                        int i61 = i11 - 1;
                        int i62 = 0;
                        while (i61 > -1 && i62 < i51) {
                            int i63 = 0;
                            while (i63 < i10 && i62 < i51) {
                                int readUnsignedInt3 = (int) cVar.readUnsignedInt();
                                int i64 = (readUnsignedInt3 & i56) >> 24;
                                if (i64 == -1) {
                                    i64 = 255;
                                }
                                createBitmap5.setPixel(i63, i61, new Color((readUnsignedInt3 & 16711680) >> 16, (readUnsignedInt3 & 65280) >> 8, readUnsignedInt3 & FunctionEval.FunctionID.EXTERNAL_FUNC, (i64 * i14) / FunctionEval.FunctionID.EXTERNAL_FUNC).getRGB());
                                i63++;
                                i62++;
                                i56 = -16777216;
                            }
                            i61--;
                            i56 = -16777216;
                        }
                    }
                }
                return createBitmap5;
            } else if (i15 == 32 && i24 == 3) {
                cVar.b(i12);
                return null;
            } else {
                cVar.b(i12);
                return null;
            }
        }
    }
}
