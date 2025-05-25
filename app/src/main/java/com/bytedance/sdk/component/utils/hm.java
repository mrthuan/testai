package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collections;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;

/* compiled from: ImageFormatChecker.java */
/* loaded from: classes.dex */
public class hm {
    private static final byte[] CJ;
    private static final byte[] Qhi;
    private static final int ROR;
    private static final byte[] Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private static final byte[] f8428ac;
    private static final byte[] cJ;

    /* renamed from: fl  reason: collision with root package name */
    private static final byte[] f8429fl;

    static {
        byte[] bArr = {-1, -40, -1};
        Qhi = bArr;
        byte[] bArr2 = {-119, 80, 78, Field.FORMCHECKBOX, 13, 10, 26, 10};
        cJ = bArr2;
        byte[] bArr3 = {0, 0, 1, 0};
        f8428ac = bArr3;
        byte[] Qhi2 = Qhi("BM");
        CJ = Qhi2;
        f8429fl = Qhi("GIF87a");
        Tgh = Qhi("GIF89a");
        ROR = ((Integer) Collections.max(Arrays.asList(Integer.valueOf(bArr.length), Integer.valueOf(bArr2.length), Integer.valueOf(bArr3.length), Integer.valueOf(Qhi2.length), 6))).intValue();
    }

    private static boolean CJ(byte[] bArr) {
        if ((bArr.length >= 6 && Qhi(bArr, f8429fl)) || Qhi(bArr, Tgh)) {
            return true;
        }
        return false;
    }

    public static int Qhi() {
        return ROR;
    }

    private static boolean Tgh(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = f8428ac;
        if (length >= bArr2.length && Qhi(bArr, bArr2)) {
            return true;
        }
        return false;
    }

    private static boolean ac(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = cJ;
        if (length >= bArr2.length && Qhi(bArr, bArr2)) {
            return true;
        }
        return false;
    }

    private static boolean cJ(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = Qhi;
        if (length >= bArr2.length && Qhi(bArr, bArr2)) {
            return true;
        }
        return false;
    }

    private static boolean fl(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = CJ;
        if (length >= bArr2.length && Qhi(bArr, bArr2)) {
            return true;
        }
        return false;
    }

    public static final String Qhi(byte[] bArr) {
        return cJ(bArr) ? ContentTypes.EXTENSION_JPG_2 : ac(bArr) ? ContentTypes.EXTENSION_PNG : CJ(bArr) ? ContentTypes.EXTENSION_GIF : fl(bArr) ? "bmp" : Tgh(bArr) ? "ico" : "other";
    }

    private static boolean Qhi(byte[] bArr, byte[] bArr2) {
        return Qhi(bArr, bArr2, 0);
    }

    private static boolean Qhi(byte[] bArr, byte[] bArr2, int i10) {
        if (bArr2.length + i10 > bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i10 + i11] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static byte[] Qhi(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("ASCII not found!", e10);
        }
    }
}
