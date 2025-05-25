package pdf.pdfreader.viewer.editor.free.billing.util;

import a6.h;
import android.text.TextUtils;
import com.android.billingclient.api.h;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.g;
import lib.zj.office.fc.hpsf.Constants;
import ol.j;
import tf.d;

/* compiled from: Utils.kt */
/* loaded from: classes3.dex */
public final class c {
    public static String a(long j10, String str) {
        String b10 = b(str);
        float f10 = ((float) (j10 / 1000000)) / 365.0f;
        if (f10 <= 0.0f) {
            return h.c(b10, "0.01");
        }
        StringBuilder sb2 = new StringBuilder(ea.a.p("Ay57MA==", "0hu6I6nc"));
        float f11 = 100 * f10;
        while (f11 < 1.0f) {
            f11 *= 10;
            sb2.append(ea.a.p("MA==", "F8STWJGp"));
        }
        return h.c(b10, new DecimalFormat(sb2.toString()).format(Float.valueOf(f10)));
    }

    /* JADX WARN: Type inference failed for: r2v26, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10, types: [T, java.lang.String] */
    public static String b(String str) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        int length = str.length();
        int i12 = 0;
        while (true) {
            i10 = -1;
            if (i12 < length) {
                if (Character.isDigit(str.charAt(i12))) {
                    break;
                }
                i12++;
            } else {
                i12 = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i12);
        if (valueOf.intValue() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Integer num = null;
        if (!z10) {
            valueOf = null;
        }
        if (valueOf != null) {
            ?? substring = str.substring(0, valueOf.intValue());
            g.d(substring, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtn2oDqaSlnRHM7YUN0MG5TZSIsamUbZCFuUWUWKQ==", "YVJr8LGl"));
            ref$ObjectRef.element = substring;
        }
        if (TextUtils.isEmpty((CharSequence) ref$ObjectRef.element) || g.a(ref$ObjectRef.element, ea.a.p("qoCP", "xtHH4FsW"))) {
            ref$ObjectRef.element = "";
        }
        int length2 = str.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i13 = length2 - 1;
                if (Character.isDigit(str.charAt(length2))) {
                    i10 = length2;
                    break;
                } else if (i13 < 0) {
                    break;
                } else {
                    length2 = i13;
                }
            }
        }
        Integer valueOf2 = Integer.valueOf(i10);
        if (valueOf2.intValue() + 1 < str.length()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            num = valueOf2;
        }
        if (num != null) {
            String substring2 = str.substring(num.intValue() + 1, str.length());
            g.d(substring2, ea.a.p("R2gic1NhESAYYUJhR2w3biMuYXQ0aS1nsYDvaSpnG3NHYTl0Om4GZQosFGUHZB9uIGVKKQ==", "SID37NIw"));
            int length3 = substring2.length() - 1;
            int i14 = 0;
            boolean z13 = false;
            while (i14 <= length3) {
                if (!z13) {
                    i11 = i14;
                } else {
                    i11 = length3;
                }
                if (g.f(substring2.charAt(i11), 32) <= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z13) {
                    if (!z12) {
                        z13 = true;
                    } else {
                        i14++;
                    }
                } else if (!z12) {
                    break;
                } else {
                    length3--;
                }
            }
            ref$ObjectRef.element = substring2.subSequence(i14, length3 + 1).toString();
        }
        if (TextUtils.isEmpty((CharSequence) ref$ObjectRef.element) || g.a(ref$ObjectRef.element, ea.a.p("0YCP", "0l3qAi4a"))) {
            ref$ObjectRef.element = "";
        }
        return (String) ref$ObjectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0098 A[EDGE_INSN: B:84:0x0098->B:33:0x0098 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00db A[EDGE_INSN: B:89:0x00db->B:48:0x00db ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ol.d c(java.util.ArrayList r22) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.billing.util.c.c(java.util.ArrayList):ol.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0097 A[EDGE_INSN: B:108:0x0097->B:33:0x0097 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0112 A[EDGE_INSN: B:114:0x0112->B:59:0x0112 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0155 A[EDGE_INSN: B:117:0x0155->B:75:0x0155 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0194 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ol.b d(java.util.ArrayList r14) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.billing.util.c.d(java.util.ArrayList):ol.b");
    }

    public static j e(String str, String str2, h.d dVar) {
        long j10;
        boolean z10;
        d dVar2;
        ArrayList arrayList = dVar.f6253d.f6250a;
        g.d(arrayList, ea.a.p("K2VFYRBsRC4qciNjHG4PUF1hHWU2LhVyL2Mfbh9QK2E8ZX1pCnQ=", "B6lMFvxC"));
        Iterator it = arrayList.iterator();
        h.b bVar = null;
        h.b bVar2 = null;
        while (true) {
            j10 = 0;
            if (!it.hasNext()) {
                break;
            }
            h.b bVar3 = (h.b) it.next();
            long j11 = bVar3.f6249b;
            if (j11 != 0) {
                if (bVar != null) {
                    int i10 = (bVar.f6249b > j11 ? 1 : (bVar.f6249b == j11 ? 0 : -1));
                    if (i10 > 0) {
                        bVar2 = bVar;
                        bVar = bVar3;
                    } else if (i10 < 0) {
                        bVar2 = bVar3;
                    }
                    dVar2 = d.f30009a;
                } else {
                    dVar2 = null;
                }
                if (dVar2 == null) {
                    bVar = bVar3;
                }
            }
        }
        if (bVar == null || bVar2 == null) {
            return null;
        }
        long j12 = (bVar2.f6249b - bVar.f6249b) / ((long) Constants.CP_MAC_ROMAN);
        float f10 = ((float) j12) / 100.0f;
        StringBuilder sb2 = new StringBuilder();
        long j13 = 1;
        if (j12 < 1) {
            return null;
        }
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            boolean z12 = true;
            if (j12 <= j13) {
                break;
            }
            if (i11 == 2) {
                if (sb2.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    sb2.insert(0, ea.a.p("Lg==", "DiKtzp6q"));
                }
            }
            long j14 = 10;
            if (j12 % j14 == j10) {
                if (sb2.length() <= 0) {
                    z12 = false;
                }
                if (z12) {
                    sb2.insert(0, ea.a.p("MA==", "NpVUh71B"));
                }
            } else {
                sb2.insert(0, ea.a.p("MA==", "IHEW0CBe"));
            }
            j12 /= j14;
            i11++;
            j10 = 0;
            j13 = 1;
        }
        if (sb2.length() == 0) {
            z11 = true;
        }
        if (z11) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat(sb2.toString());
        String p10 = ea.a.p("V2U_YRpsES4dZlJlG1Q5ayFu", "ae2D14Pn");
        String str3 = dVar.c;
        g.d(str3, p10);
        String format = decimalFormat.format(Float.valueOf(f10));
        g.d(format, ea.a.p("VW85bRJ0FmUALlJvG203dGxmW24nbBBhMGUxcidjLyk=", "FaNJGa4L"));
        String p11 = ea.a.p("V2k4Yxx1DHRcZltyBGEidCFkYnIvY2U=", "aIlhRAdh");
        String str4 = bVar.f6248a;
        g.d(str4, p11);
        String p12 = ea.a.p("WHIqZzNuHWYncgthQHQyZGhyO2Nl", "bw7CZ3bi");
        String str5 = bVar2.f6248a;
        g.d(str5, p12);
        return new j(str, str3, str2, format, str4, str5);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0098 A[EDGE_INSN: B:144:0x0098->B:33:0x0098 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0101 A[EDGE_INSN: B:150:0x0101->B:57:0x0101 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ol.d f(java.util.ArrayList r26) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.billing.util.c.f(java.util.ArrayList):ol.d");
    }
}
