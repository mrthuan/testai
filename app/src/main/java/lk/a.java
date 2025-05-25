package lk;

import kk.f;
import kk.p;
import kk.u;
import kotlin.jvm.internal.g;

/* compiled from: -Buffer.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f21759a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(kotlin.text.a.f19966b);
        g.d(bytes, "this as java.lang.String).getBytes(charset)");
        f21759a = bytes;
    }

    public static final String a(f fVar, long j10) {
        g.e(fVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (fVar.c(j11) == ((byte) 13)) {
                String l10 = fVar.l(j11);
                fVar.skip(2L);
                return l10;
            }
        }
        String l11 = fVar.l(j10);
        fVar.skip(1L);
        return l11;
    }

    public static final int b(f fVar, p options, boolean z10) {
        int i10;
        int i11;
        boolean z11;
        byte[] bArr;
        int i12;
        u uVar;
        g.e(fVar, "<this>");
        g.e(options, "options");
        u uVar2 = fVar.f19825a;
        int i13 = -2;
        if (uVar2 == null) {
            if (z10) {
                return -2;
            }
            return -1;
        }
        int i14 = uVar2.f19850b;
        int i15 = uVar2.c;
        byte[] bArr2 = uVar2.f19849a;
        u uVar3 = uVar2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int[] iArr = options.f19841b;
            int i19 = iArr[i17];
            int i20 = i18 + 1;
            int i21 = iArr[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (uVar3 == null) {
                break;
            }
            if (i19 < 0) {
                int i22 = (i19 * (-1)) + i20;
                while (true) {
                    int i23 = i14 + 1;
                    int i24 = i20 + 1;
                    if ((bArr2[i14] & 255) != iArr[i20]) {
                        return i16;
                    }
                    if (i24 == i22) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (i23 == i15) {
                        g.b(uVar3);
                        u uVar4 = uVar3.f19853f;
                        g.b(uVar4);
                        i12 = uVar4.f19850b;
                        int i25 = uVar4.c;
                        bArr = uVar4.f19849a;
                        if (uVar4 == uVar2) {
                            if (!z11) {
                                break loop0;
                            }
                            i15 = i25;
                            uVar = null;
                        } else {
                            uVar = uVar4;
                            i15 = i25;
                        }
                    } else {
                        u uVar5 = uVar3;
                        bArr = bArr2;
                        i12 = i23;
                        uVar = uVar5;
                    }
                    if (z11) {
                        i10 = iArr[i24];
                        i11 = i12;
                        bArr2 = bArr;
                        uVar3 = uVar;
                        break;
                    }
                    i14 = i12;
                    bArr2 = bArr;
                    i20 = i24;
                    uVar3 = uVar;
                }
            } else {
                int i26 = i14 + 1;
                int i27 = bArr2[i14] & 255;
                int i28 = i20 + i19;
                while (i20 != i28) {
                    if (i27 == iArr[i20]) {
                        i10 = iArr[i20 + i19];
                        if (i26 == i15) {
                            uVar3 = uVar3.f19853f;
                            g.b(uVar3);
                            i11 = uVar3.f19850b;
                            i15 = uVar3.c;
                            bArr2 = uVar3.f19849a;
                            if (uVar3 == uVar2) {
                                uVar3 = null;
                            }
                        } else {
                            i11 = i26;
                        }
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            if (i10 >= 0) {
                return i10;
            }
            i17 = -i10;
            i14 = i11;
            i13 = -2;
        }
        if (z10) {
            return i13;
        }
        return i16;
    }
}
