package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.m;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: Indent.kt */
/* loaded from: classes.dex */
public class f extends ea.a {
    public static final String C(String str) {
        Comparable comparable;
        int i10;
        boolean z10;
        kotlin.jvm.internal.g.e(str, "<this>");
        List<String> Z = k.Z(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : Z) {
            if (true ^ j.H((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g.h0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            int i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i11 < length) {
                    if (!t0.c0(str2.charAt(i11))) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 == -1) {
                i11 = str2.length();
            }
            arrayList2.add(Integer.valueOf(i11));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        int size = (Z.size() * 0) + str.length();
        StringsKt__IndentKt$getIndentFunction$1 stringsKt__IndentKt$getIndentFunction$1 = StringsKt__IndentKt$getIndentFunction$1.INSTANCE;
        int A = ge.a.A(Z);
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        for (Object obj2 : Z) {
            int i13 = i12 + 1;
            if (i12 >= 0) {
                String str3 = (String) obj2;
                if ((i12 == 0 || i12 == A) && j.H(str3)) {
                    str3 = null;
                } else {
                    kotlin.jvm.internal.g.e(str3, "<this>");
                    if (i10 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        int length2 = str3.length();
                        if (i10 <= length2) {
                            length2 = i10;
                        }
                        String substring = str3.substring(length2);
                        kotlin.jvm.internal.g.d(substring, "this as java.lang.String).substring(startIndex)");
                        String invoke = stringsKt__IndentKt$getIndentFunction$1.invoke((StringsKt__IndentKt$getIndentFunction$1) substring);
                        if (invoke != null) {
                            str3 = invoke;
                        }
                    } else {
                        throw new IllegalArgumentException(a0.a.g("Requested character count ", i10, " is less than zero.").toString());
                    }
                }
                if (str3 != null) {
                    arrayList3.add(str3);
                }
                i12 = i13;
            } else {
                ge.a.c0();
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder(size);
        m.v0(arrayList3, sb2);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g.d(sb3, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb3;
    }

    public static String D(String str) {
        kotlin.jvm.internal.g.e(str, "<this>");
        if (!j.H("|")) {
            List<String> Z = k.Z(str);
            int size = (Z.size() * 0) + str.length();
            StringsKt__IndentKt$getIndentFunction$1 stringsKt__IndentKt$getIndentFunction$1 = StringsKt__IndentKt$getIndentFunction$1.INSTANCE;
            int A = ge.a.A(Z);
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (Object obj : Z) {
                int i11 = i10 + 1;
                String str2 = null;
                if (i10 >= 0) {
                    String str3 = (String) obj;
                    if ((i10 != 0 && i10 != A) || !j.H(str3)) {
                        int length = str3.length();
                        int i12 = 0;
                        while (true) {
                            if (i12 < length) {
                                if (!t0.c0(str3.charAt(i12))) {
                                    break;
                                }
                                i12++;
                            } else {
                                i12 = -1;
                                break;
                            }
                        }
                        if (i12 != -1 && j.L(str3, i12, "|", false)) {
                            str2 = str3.substring("|".length() + i12);
                            kotlin.jvm.internal.g.d(str2, "this as java.lang.String).substring(startIndex)");
                        }
                        if (str2 == null || (str2 = stringsKt__IndentKt$getIndentFunction$1.invoke((StringsKt__IndentKt$getIndentFunction$1) str2)) == null) {
                            str2 = str3;
                        }
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                    i10 = i11;
                } else {
                    ge.a.c0();
                    throw null;
                }
            }
            StringBuilder sb2 = new StringBuilder(size);
            m.v0(arrayList, sb2);
            String sb3 = sb2.toString();
            kotlin.jvm.internal.g.d(sb3, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb3;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }
}
}
}
