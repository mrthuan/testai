package com.facebook.ads.redexgen.X;

import android.util.Pair;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Hj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0848Hj {
    public static byte[] A00;
    public static String[] A01 = {"hgkv3K5D7LUdfYtfghp3vny7W6PJ75x1", "5OxuqdKIp2nP9LR2zHzFDLENZioxECvO", "CAnbNdwyZNAIqQCRG3atCxjTS11tGtep", "nI9Q0c0eZRrT7faNpsYhcG", "wvdDgPhEetLkfVyUXU5OqcDmpJOXplEG", "lkGhosMNtvxo3OcAc0XPmTZNlf43dohM", "7WCwK6uLOSx7G5D82H1RtAFjcLrdRlkB", "N3LI1K8U1EAyrNNyoXaRNfYZq4euqJJf"};
    public static final byte[] A02;
    public static final int[] A03;
    public static final int[] A04;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[3].length() == 9) {
                throw new RuntimeException();
            }
            A01[0] = "te1WrCSgggsWDMNxGrks3ULWi6FlwITL";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 52);
            i13++;
        }
    }

    public static void A05() {
        A00 = new byte[]{Field.AUTONUMLGL, 14, 19, 21, 16, 16, 15, 18, 20, 5, 4, 64, 1, 21, 4, 9, 15, 64, 15, 2, 10, 5, 3, 20, 64, 20, 25, 16, 5, Field.LISTNUM, 64, 113, 74, Field.CONTROL, Field.ADDIN, Field.ADVANCE, Field.ADVANCE, Field.MERGESEQ, 86, 80, Field.SECTION, 64, 4, Field.SECTION, Field.ADVANCE, 103, Field.MERGESEQ, 74, Field.SECTIONPAGES, 77, Field.INCLUDEPICTURE, 30, 4};
    }

    static {
        A05();
        A02 = new byte[]{0, 0, 0, 1};
        A04 = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
        A03 = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    }

    public static int A00(I3 i32) {
        int A042 = i32.A04(5);
        if (A042 == 31) {
            int audioObjectType = i32.A04(6);
            return audioObjectType + 32;
        }
        return A042;
    }

    public static int A01(I3 i32) {
        int A042 = i32.A04(4);
        if (A042 == 15) {
            int frequencyIndex = i32.A04(24);
            return frequencyIndex;
        }
        AbstractC0844Hf.A03(A042 < 13);
        int frequencyIndex2 = A04[A042];
        return frequencyIndex2;
    }

    public static Pair<Integer, Integer> A02(I3 i32, boolean z10) throws A0 {
        int A002 = A00(i32);
        int channelConfiguration = A01(i32);
        int sampleRate = i32.A04(4);
        if (A002 == 5 || A002 == 29) {
            channelConfiguration = A01(i32);
            A002 = A00(i32);
            if (A002 == 22) {
                sampleRate = i32.A04(4);
            }
        }
        if (z10) {
            switch (A002) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                case 7:
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    A06(i32, A002, sampleRate);
                    switch (A002) {
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            int epConfig = i32.A04(2);
                            if (epConfig == 2 || epConfig == 3) {
                                throw new A0(A04(31, 22, 16) + epConfig);
                            }
                            break;
                    }
                case 5:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 18:
                default:
                    throw new A0(A04(0, 31, 84) + A002);
            }
        }
        int channelCount = A03[sampleRate];
        AbstractC0844Hf.A03(channelCount != -1);
        return Pair.create(Integer.valueOf(channelConfiguration), Integer.valueOf(channelCount));
    }

    public static Pair<Integer, Integer> A03(byte[] bArr) throws A0 {
        return A02(new I3(bArr), false);
    }

    public static void A06(I3 i32, int i10, int i11) {
        i32.A08(1);
        if (i32.A0F()) {
            i32.A08(14);
        }
        boolean dependsOnCoreDecoder = i32.A0F();
        if (i11 != 0) {
            if (i10 == 6 || i10 == 20) {
                i32.A08(3);
            }
            if (dependsOnCoreDecoder) {
                if (i10 == 22) {
                    i32.A08(16);
                }
                if (A01[1].charAt(24) != 'Z') {
                    throw new RuntimeException();
                }
                A01[3] = "4px";
                if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                    i32.A08(3);
                }
                i32.A08(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static byte[] A07(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    public static byte[] A08(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[A02.length + i11];
        byte[] bArr3 = A02;
        byte[] nalUnit = A02;
        System.arraycopy(bArr3, 0, bArr2, 0, nalUnit.length);
        byte[] nalUnit2 = A02;
        System.arraycopy(bArr, i10, bArr2, nalUnit2.length, i11);
        return bArr2;
    }
}
