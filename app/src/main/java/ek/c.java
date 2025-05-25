package ek;

import okio.ByteString;

/* compiled from: Http2.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f16667a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final ByteString f16668b;
    public static final String[] c;

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f16669d;

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f16670e;

    static {
        ByteString.Companion.getClass();
        f16668b = ByteString.a.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        c = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f16669d = new String[64];
        String[] strArr = new String[256];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            String binaryString = Integer.toBinaryString(i11);
            kotlin.jvm.internal.g.d(binaryString, "toBinaryString(it)");
            strArr[i11] = kotlin.text.j.J(ak.b.h("%8s", binaryString), '0');
        }
        f16670e = strArr;
        String[] strArr2 = f16669d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i12 = iArr[0];
        strArr2[i12 | 8] = kotlin.jvm.internal.g.h("|PADDED", strArr2[i12]);
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i13 = 0;
        while (i13 < 3) {
            int i14 = iArr2[i13];
            i13++;
            int i15 = iArr[0];
            String[] strArr3 = f16669d;
            int i16 = i15 | i14;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) strArr3[i15]);
            sb2.append('|');
            sb2.append((Object) strArr3[i14]);
            strArr3[i16] = sb2.toString();
            strArr3[i16 | 8] = ((Object) strArr3[i15]) + '|' + ((Object) strArr3[i14]) + "|PADDED";
        }
        int length = f16669d.length;
        while (i10 < length) {
            int i17 = i10 + 1;
            String[] strArr4 = f16669d;
            if (strArr4[i10] == null) {
                strArr4[i10] = f16670e[i10];
            }
            i10 = i17;
        }
    }

    public static String a(int i10, int i11, int i12, int i13, boolean z10) {
        String h10;
        String str;
        String str2;
        String str3;
        String[] strArr = c;
        if (i12 < strArr.length) {
            h10 = strArr[i12];
        } else {
            h10 = ak.b.h("0x%02x", Integer.valueOf(i12));
        }
        if (i13 == 0) {
            str = "";
        } else {
            String[] strArr2 = f16670e;
            if (i12 != 2 && i12 != 3) {
                if (i12 != 4 && i12 != 6) {
                    if (i12 != 7 && i12 != 8) {
                        String[] strArr3 = f16669d;
                        if (i13 < strArr3.length) {
                            str2 = strArr3[i13];
                            kotlin.jvm.internal.g.b(str2);
                        } else {
                            str2 = strArr2[i13];
                        }
                        if (i12 == 5 && (i13 & 4) != 0) {
                            str = kotlin.text.j.K(str2, "HEADERS", "PUSH_PROMISE");
                        } else if (i12 == 0 && (i13 & 32) != 0) {
                            str = kotlin.text.j.K(str2, "PRIORITY", "COMPRESSED");
                        } else {
                            str = str2;
                        }
                    }
                } else if (i13 == 1) {
                    str = "ACK";
                } else {
                    str = strArr2[i13];
                }
            }
            str = strArr2[i13];
        }
        if (z10) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        return ak.b.h("%s 0x%08x %5d %-13s %s", str3, Integer.valueOf(i10), Integer.valueOf(i11), h10, str);
    }
}
