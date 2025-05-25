package com.google.android.gms.internal.ads;

import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgpz {
    public static byte[] zza(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            int i10 = 0;
            while (i10 < 16) {
                int i11 = i10 + 1;
                byte b10 = bArr[i10];
                byte b11 = (byte) ((b10 + b10) & 254);
                bArr2[i10] = b11;
                if (i10 < 15) {
                    bArr2[i10] = (byte) (((bArr[i11] >> 7) & 1) | b11);
                }
                i10 = i11;
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & ShapeTypes.FLOW_CHART_PREDEFINED_PROCESS)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }
}
