package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class ZX implements InterfaceC06257z {
    public static byte[] A00;
    public static String[] A01 = {"N9cBQFuEXnMHuOhuUHmrN1NbOn9dUH6l", "t4327HI34dmOHxHgJ5Xqb1TMdgfhViRu", "W9WF83HwW2JJuxhyMa", "tDcIRbsxuTPzi4rfI85ylCxCUvgLsm3F", "qO4Uq7mg6XVWSCx2fb2lLTULAXcH9HmN", "DdhWBjv", "pI4BrYZb6jEfbOR6K30piOXwM4lgsdMH", "sO2hGyIlN5zgciGhFXZ1rYz4NH0oO9ru"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-70, -73, -54, -73, -43, -58, -56, -59, -71, -69, -55, -55, -65, -60, -67, -43, -59, -58, -54, -65, -59, -60, -55, -43, -71, -59, -53, -60, -54, -56, -49, -43, -63, -69, -49, 48, Field.DDE, 64, Field.DDE, Field.MERGESEQ, 60, Field.USERADDRESS, 59, Field.GLOSSARY, Field.EQ, Field.BARCODE, Field.BARCODE, Field.AUTONUMLGL, 58, Field.MACROBUTTON, Field.MERGESEQ, 59, 60, 64, Field.AUTONUMLGL, 59, 58, Field.BARCODE, Field.MERGESEQ, Field.IMPORT, Field.EQ, Field.FILESIZE, 5, 2, 21, 2, 32, 17, 19, 16, 4, 6, 20, 20, 10, 15, 8, 32, 16, 17, 21, 10, 16, 15, 20, 32, 20, 21, 2, 21, 6, 32, 12, 6, 26};
        String[] strArr = A01;
        if (strArr[6].charAt(20) == strArr[0].charAt(20)) {
            throw new RuntimeException();
        }
        A01[2] = "00h";
        A00 = bArr;
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06257z
    public final void AAq(C7y c7y) {
        String[] stringArray;
        Integer integer;
        Integer integer2;
        if (!AdInternalSettings.sDataProcessingOptionsUpdate.getAndSet(false)) {
            return;
        }
        synchronized (AdInternalSettings.sSettingsBundle) {
            stringArray = AdInternalSettings.sSettingsBundle.getStringArray(A00(35, 27, 123));
            integer = AdInternalSettings.sSettingsBundle.getInteger(A00(0, 35, 5));
            integer2 = AdInternalSettings.sSettingsBundle.getInteger(A00(62, 33, 80));
        }
        c7y.ADY(stringArray, integer, integer2);
    }
}
