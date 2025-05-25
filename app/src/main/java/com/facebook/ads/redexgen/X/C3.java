package com.facebook.ads.redexgen.X;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class C3 {
    public static byte[] A07;
    public static String[] A08 = {"6kStEXL0N53GFq3V1gqexDowqRHYGeCf", "GvacQN", "vwcu66U", "A1GXyDBA", "87T5d6sd1ik", "wZXLMf", "Pesi6L7S5NgS5H9VNXNfznCxhERgloSD", "i5d"};
    public static final int[] A09;
    public static final int[] A0A;
    public static final int[] A0B;
    public static final int[] A0C;
    public static final int[] A0D;
    public static final int[] A0E;
    public static final String[] A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public String A06;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 6);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{Field.CONTROL, Field.INCLUDEPICTURE, 82, Field.SHAPE, Field.AUTOTEXTLIST, 25, Field.HTMLCONTROL, Field.FORMTEXT, Field.FORMDROPDOWN, Field.ADDIN, 24, 12, 29, 16, 22, 86, 20, 9, Field.NUMCHARS, 30, Field.ADVANCE, Field.AUTONUMLGL, Field.NOTEREF, Field.SECTIONPAGES, 86, Field.FORMCHECKBOX, 74, 76, 12, 78, Field.FORMDROPDOWN, Field.FORMTEXT, Field.INCLUDETEXT, 14, 111, 17};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static boolean A04(int i10, C3 c32) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i10 & (-2097152)) != -2097152) {
            return false;
        }
        int i16 = (i10 >>> 19) & 3;
        if (A08[4].length() == 11) {
            String[] strArr = A08;
            strArr[0] = "RiUw1eqoDvBahj8V6TDcRS8iwH7eOScG";
            strArr[6] = "kmp5wJKEvw6YmujV2HYKRga0mutSjdRV";
            if (i16 == 1) {
                return false;
            }
            int i17 = (i10 >>> 17) & 3;
            String[] strArr2 = A08;
            if (strArr2[2].length() == strArr2[3].length()) {
                throw new RuntimeException();
            }
            A08[7] = "sO7yywxLPUYvKcLMkDALEGxaOlT";
            if (i17 == 0 || (i11 = (i10 >>> 12) & 15) == 0 || i11 == 15 || (i12 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            int i18 = A0E[i12];
            if (i16 == 2) {
                i18 /= 2;
            } else if (i16 == 0) {
                i18 /= 4;
            }
            int i19 = i10 >>> 9;
            if (A08[4].length() == 11) {
                String[] strArr3 = A08;
                strArr3[0] = "VOyNOfFo7BnWiNbVlgRj6mnxWRwbIkpB";
                strArr3[6] = "81RrLaAoVLspvvFVdtLQ2olTPTjFw09L";
                int i20 = i19 & 1;
                if (i17 == 3) {
                    i13 = i16 == 3 ? A09[i11 - 1] : A0D[i11 - 1];
                    i15 = (((i13 * 12000) / i18) + i20) * 4;
                    i14 = 384;
                    String[] strArr4 = A08;
                    if (strArr4[2].length() == strArr4[3].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr5 = A08;
                    strArr5[2] = "h6mf2Ke";
                    strArr5[3] = "gfVBXOvo";
                } else {
                    if (i16 == 3) {
                        i13 = i17 == 2 ? A0A[i11 - 1] : A0B[i11 - 1];
                        i14 = 1152;
                        i15 = ((144000 * i13) / i18) + i20;
                    } else {
                        i13 = A0C[i11 - 1];
                        i14 = i17 == 1 ? 576 : 1152;
                        i15 = (((i17 == 1 ? 72000 : 144000) * i13) / i18) + i20;
                    }
                }
                c32.A03(i16, A0F[3 - i17], i15, i18, ((i10 >> 6) & 3) == 3 ? 1 : 2, i13 * 1000, i14);
                return true;
            }
        }
        throw new RuntimeException();
    }

    static {
        A02();
        A0F = new String[]{A01(10, 13, ShapeTypes.VERTICAL_SCROLL), A01(23, 13, 37), A01(0, 10, 48)};
        A0E = new int[]{44100, 48000, 32000};
        A09 = new int[]{32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, TTAdConstant.PACKAGE_NAME_CODE, 448};
        A0D = new int[]{32, 48, 56, 64, 80, 96, 112, 128, 144, 160, ShapeTypes.MATH_PLUS, 192, 224, 256};
        A0A = new int[]{32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384};
        A0B = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320};
        A0C = new int[]{8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};
    }

    public static int A00(int i10) {
        int padding;
        int bitrateIndex;
        int layer;
        int i11;
        int i12;
        int version;
        if ((i10 & (-2097152)) != -2097152 || (padding = (i10 >>> 19) & 3) == 1 || (bitrateIndex = (i10 >>> 17) & 3) == 0 || (layer = (i10 >>> 12) & 15) == 0 || layer == 15 || (i11 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i13 = A0E[i11];
        if (A08[4].length() == 11) {
            String[] strArr = A08;
            strArr[0] = "SACavNzUqDihaCCVBwhZqH9dgMV7CCgo";
            strArr[6] = "NGXmQ6vSzJX8uyjVaek6YMFly75gW1GO";
            if (padding == 2) {
                i13 /= 2;
            } else if (padding == 0) {
                i13 /= 4;
            }
            int i14 = (i10 >>> 9) & 1;
            if (bitrateIndex == 3) {
                if (padding == 3) {
                    int[] iArr = A09;
                    String[] strArr2 = A08;
                    String str = strArr2[2];
                    String str2 = strArr2[3];
                    int length = str.length();
                    int version2 = str2.length();
                    if (length != version2) {
                        String[] strArr3 = A08;
                        strArr3[1] = "i4D7hx";
                        strArr3[5] = "J2Oys6";
                        int version3 = layer - 1;
                        version = iArr[version3];
                    } else {
                        int version4 = layer - 1;
                        version = iArr[version4];
                    }
                } else {
                    int[] iArr2 = A0D;
                    int layer2 = layer - 1;
                    String[] strArr4 = A08;
                    String str3 = strArr4[1];
                    String str4 = strArr4[5];
                    int bitrate = str3.length();
                    int version5 = str4.length();
                    if (bitrate == version5) {
                        String[] strArr5 = A08;
                        strArr5[0] = "C0vPmVzFtdLa424VF7oLSPXdFv7JPKYl";
                        strArr5[6] = "qJ70LKr8xHxcQctVJa4tIMefqwiAYJOB";
                        version = iArr2[layer2];
                    }
                }
                return (((version * 12000) / i13) + i14) * 4;
            }
            if (padding == 3) {
                if (bitrateIndex == 2) {
                    int version6 = layer - 1;
                    i12 = A0A[version6];
                } else {
                    int version7 = layer - 1;
                    i12 = A0B[version7];
                }
            } else {
                int[] iArr3 = A0C;
                String[] strArr6 = A08;
                String str5 = strArr6[2];
                String str6 = strArr6[3];
                int length2 = str5.length();
                int version8 = str6.length();
                if (length2 != version8) {
                    A08[4] = "atDS8UAgb8L";
                    int version9 = layer - 1;
                    i12 = iArr3[version9];
                }
            }
            if (padding == 3) {
                int version10 = 144000 * i12;
                return (version10 / i13) + i14;
            }
            int version11 = bitrateIndex == 1 ? 72000 : 144000;
            return ((version11 * i12) / i13) + i14;
        }
        throw new RuntimeException();
    }

    private void A03(int i10, String str, int i11, int i12, int i13, int i14, int i15) {
        this.A05 = i10;
        this.A06 = str;
        this.A02 = i11;
        this.A03 = i12;
        this.A01 = i13;
        this.A00 = i14;
        this.A04 = i15;
    }
}
