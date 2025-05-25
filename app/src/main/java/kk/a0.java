package kk;

import lib.zj.office.fc.hwpf.usermodel.Field;
import okio.ByteString;

/* compiled from: -Base64.kt */
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f19818a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f19819b;

    static {
        ByteString.Companion.getClass();
        f19818a = ByteString.a.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
        f19819b = ByteString.a.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();
    }

    public static final String a(byte[] bArr, byte[] map) {
        kotlin.jvm.internal.g.e(bArr, "<this>");
        kotlin.jvm.internal.g.e(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            int i13 = i12 + 1;
            byte b11 = bArr[i12];
            int i14 = i13 + 1;
            byte b12 = bArr[i13];
            int i15 = i11 + 1;
            bArr2[i11] = map[(b10 & 255) >> 2];
            int i16 = i15 + 1;
            bArr2[i15] = map[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i17 = i16 + 1;
            bArr2[i16] = map[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 = i17 + 1;
            bArr2[i17] = map[b12 & Field.BARCODE];
            i10 = i14;
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i18 = i10 + 1;
                byte b13 = bArr[i10];
                byte b14 = bArr[i18];
                int i19 = i11 + 1;
                bArr2[i11] = map[(b13 & 255) >> 2];
                int i20 = i19 + 1;
                bArr2[i19] = map[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
                bArr2[i20] = map[(b14 & 15) << 2];
                bArr2[i20 + 1] = (byte) 61;
            }
        } else {
            byte b15 = bArr[i10];
            int i21 = i11 + 1;
            bArr2[i11] = map[(b15 & 255) >> 2];
            int i22 = i21 + 1;
            bArr2[i21] = map[(b15 & 3) << 4];
            byte b16 = (byte) 61;
            bArr2[i22] = b16;
            bArr2[i22 + 1] = b16;
        }
        return new String(bArr2, kotlin.text.a.f19966b);
    }
}
