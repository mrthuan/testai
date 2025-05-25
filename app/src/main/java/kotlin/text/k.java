package kotlin.text;

import cg.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jg.m;
import kotlin.Pair;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: Strings.kt */
/* loaded from: classes.dex */
public class k extends j {
    public static final boolean O(CharSequence charSequence, CharSequence other, boolean z10) {
        kotlin.jvm.internal.g.e(charSequence, "<this>");
        kotlin.jvm.internal.g.e(other, "other");
        if (other instanceof String) {
            if (V(charSequence, (String) other, 0, z10, 2) < 0) {
                return false;
            }
        } else if (T(charSequence, other, 0, charSequence.length(), z10, false) < 0) {
            return false;
        }
        return true;
    }

    public static boolean Q(CharSequence charSequence, String suffix) {
        kotlin.jvm.internal.g.e(charSequence, "<this>");
        kotlin.jvm.internal.g.e(suffix, "suffix");
        if (charSequence instanceof String) {
            return j.F((String) charSequence, suffix, false);
        }
        return b0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), false);
    }

    public static final int R(CharSequence charSequence) {
        kotlin.jvm.internal.g.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int S(int i10, CharSequence charSequence, String string, boolean z10) {
        kotlin.jvm.internal.g.e(charSequence, "<this>");
        kotlin.jvm.internal.g.e(string, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i10);
        }
        return T(charSequence, string, i10, charSequence.length(), z10, false);
    }

    public static final int T(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        hg.a aVar;
        if (!z11) {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            aVar = new hg.c(i10, i11);
        } else {
            int R = R(charSequence);
            if (i10 > R) {
                i10 = R;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            aVar = new hg.a(i10, i11, -1);
        }
        boolean z12 = charSequence instanceof String;
        int i12 = aVar.f18326a;
        int i13 = aVar.c;
        int i14 = aVar.f18327b;
        if (z12 && (charSequence2 instanceof String)) {
            if ((i13 > 0 && i12 <= i14) || (i13 < 0 && i14 <= i12)) {
                while (!j.I(0, i12, charSequence2.length(), (String) charSequence2, (String) charSequence, z10)) {
                    if (i12 != i14) {
                        i12 += i13;
                    }
                }
                return i12;
            }
        } else if ((i13 > 0 && i12 <= i14) || (i13 < 0 && i14 <= i12)) {
            while (!b0(charSequence2, 0, charSequence, i12, charSequence2.length(), z10)) {
                if (i12 != i14) {
                    i12 += i13;
                }
            }
            return i12;
        }
        return -1;
    }

    public static int U(CharSequence charSequence, char c, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        kotlin.jvm.internal.g.e(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i10);
        }
        return W(i10, charSequence, z10, new char[]{c});
    }

    public static /* synthetic */ int V(CharSequence charSequence, String str, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return S(i10, charSequence, str, z10);
    }

    public static final int W(int i10, CharSequence charSequence, boolean z10, char[] chars) {
        boolean z11;
        kotlin.jvm.internal.g.e(charSequence, "<this>");
        kotlin.jvm.internal.g.e(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(kotlin.collections.f.F(chars), i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        hg.b it = new hg.c(i10, R(charSequence)).iterator();
        while (it.c) {
            int a10 = it.a();
            char charAt = charSequence.charAt(a10);
            int length = chars.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (t0.D(chars[i11], charAt, z10)) {
                        z11 = true;
                        continue;
                        break;
                    }
                    i11++;
                } else {
                    z11 = false;
                    continue;
                    break;
                }
            }
            if (z11) {
                return a10;
            }
        }
        return -1;
    }

    public static int X(CharSequence charSequence, char c, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = R(charSequence);
        }
        kotlin.jvm.internal.g.e(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            char[] cArr = {c};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(kotlin.collections.f.F(cArr), i10);
            }
            int R = R(charSequence);
            if (i10 > R) {
                i10 = R;
            }
            while (-1 < i10) {
                if (t0.D(cArr[0], charSequence.charAt(i10), false)) {
                    return i10;
                }
                i10--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c, i10);
    }

    public static int Y(CharSequence charSequence, String string, int i10) {
        int i11;
        if ((i10 & 2) != 0) {
            i11 = R(charSequence);
        } else {
            i11 = 0;
        }
        int i12 = i11;
        kotlin.jvm.internal.g.e(charSequence, "<this>");
        kotlin.jvm.internal.g.e(string, "string");
        if (!(charSequence instanceof String)) {
            return T(charSequence, string, i12, 0, false, true);
        }
        return ((String) charSequence).lastIndexOf(string, i12);
    }

    public static final List<String> Z(final CharSequence charSequence) {
        kotlin.jvm.internal.g.e(charSequence, "<this>");
        return kotlin.sequences.a.i0(new m(a0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new cg.l<hg.c, String>() { // from class: kotlin.text.StringsKt__StringsKt$splitToSequence$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cg.l
            public final String invoke(hg.c it) {
                kotlin.jvm.internal.g.e(it, "it");
                return k.i0(charSequence, it);
            }
        }));
    }

    public static b a0(CharSequence charSequence, String[] strArr, final boolean z10, int i10) {
        e0(i10);
        final List v10 = kotlin.collections.f.v(strArr);
        return new b(charSequence, 0, i10, new p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>>() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cg.p
            public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence2, Integer num) {
                return invoke(charSequence2, num.intValue());
            }

            public final Pair<Integer, Integer> invoke(CharSequence $receiver, int i11) {
                Object obj;
                Pair pair;
                Object obj2;
                Object obj3;
                kotlin.jvm.internal.g.e($receiver, "$this$$receiver");
                List<String> list = v10;
                boolean z11 = z10;
                if (!z11 && list.size() == 1) {
                    List<String> list2 = list;
                    if (list2 instanceof List) {
                        List<String> list3 = list2;
                        int size = list3.size();
                        if (size == 0) {
                            throw new NoSuchElementException("List is empty.");
                        }
                        if (size == 1) {
                            obj3 = list3.get(0);
                        } else {
                            throw new IllegalArgumentException("List has more than one element.");
                        }
                    } else {
                        Iterator<T> it = list2.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (it.hasNext()) {
                                throw new IllegalArgumentException("Collection has more than one element.");
                            }
                            obj3 = next;
                        } else {
                            throw new NoSuchElementException("Collection is empty.");
                        }
                    }
                    String str = (String) obj3;
                    int V = k.V($receiver, str, i11, false, 4);
                    if (V >= 0) {
                        pair = new Pair(Integer.valueOf(V), str);
                    }
                    pair = null;
                } else {
                    if (i11 < 0) {
                        i11 = 0;
                    }
                    hg.c cVar = new hg.c(i11, $receiver.length());
                    boolean z12 = $receiver instanceof String;
                    int i12 = cVar.c;
                    int i13 = cVar.f18327b;
                    if (z12) {
                        if ((i12 > 0 && i11 <= i13) || (i12 < 0 && i13 <= i11)) {
                            while (true) {
                                Iterator<T> it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it2.next();
                                    String str2 = (String) obj2;
                                    if (j.I(0, i11, str2.length(), str2, (String) $receiver, z11)) {
                                        break;
                                    }
                                }
                                String str3 = (String) obj2;
                                if (str3 == null) {
                                    if (i11 == i13) {
                                        break;
                                    }
                                    i11 += i12;
                                } else {
                                    pair = new Pair(Integer.valueOf(i11), str3);
                                    break;
                                }
                            }
                        }
                        pair = null;
                    } else {
                        if ((i12 > 0 && i11 <= i13) || (i12 < 0 && i13 <= i11)) {
                            while (true) {
                                Iterator<T> it3 = list.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it3.next();
                                    String str4 = (String) obj;
                                    if (k.b0(str4, 0, $receiver, i11, str4.length(), z11)) {
                                        break;
                                    }
                                }
                                String str5 = (String) obj;
                                if (str5 == null) {
                                    if (i11 == i13) {
                                        break;
                                    }
                                    i11 += i12;
                                } else {
                                    pair = new Pair(Integer.valueOf(i11), str5);
                                    break;
                                }
                            }
                        }
                        pair = null;
                    }
                }
                if (pair != null) {
                    return new Pair<>(pair.getFirst(), Integer.valueOf(((String) pair.getSecond()).length()));
                }
                return null;
            }
        });
    }

    public static final boolean b0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.g.e(charSequence, "<this>");
        kotlin.jvm.internal.g.e(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!t0.D(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static final String c0(String str, String str2) {
        if (j.M(str, str2, false)) {
            String substring = str.substring(str2.length());
            kotlin.jvm.internal.g.d(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    public static final String d0(String str, String suffix) {
        kotlin.jvm.internal.g.e(str, "<this>");
        kotlin.jvm.internal.g.e(suffix, "suffix");
        if (Q(str, suffix)) {
            String substring = str.substring(0, str.length() - suffix.length());
            kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static final void e0(int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(b.a.c("Limit must be non-negative, but was ", i10).toString());
    }

    public static final List f0(int i10, CharSequence charSequence, String str, boolean z10) {
        boolean z11;
        e0(i10);
        int i11 = 0;
        int S = S(0, charSequence, str, z10);
        if (S != -1 && i10 != 1) {
            if (i10 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i12 = 10;
            if (z11 && i10 <= 10) {
                i12 = i10;
            }
            ArrayList arrayList = new ArrayList(i12);
            do {
                arrayList.add(charSequence.subSequence(i11, S).toString());
                i11 = str.length() + S;
                if (z11 && arrayList.size() == i10 - 1) {
                    break;
                }
                S = S(i11, charSequence, str, z10);
            } while (S != -1);
            arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
            return arrayList;
        }
        return ge.a.H(charSequence.toString());
    }

    public static List g0(CharSequence charSequence, final char[] cArr) {
        kotlin.jvm.internal.g.e(charSequence, "<this>");
        if (cArr.length == 1) {
            return f0(0, charSequence, String.valueOf(cArr[0]), false);
        }
        e0(0);
        jg.l lVar = new jg.l(new b(charSequence, 0, 0, new p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>>() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cg.p
            public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence2, Integer num) {
                return invoke(charSequence2, num.intValue());
            }

            public final Pair<Integer, Integer> invoke(CharSequence $receiver, int i10) {
                kotlin.jvm.internal.g.e($receiver, "$this$$receiver");
                int W = k.W(i10, $receiver, r2, cArr);
                if (W < 0) {
                    return null;
                }
                return new Pair<>(Integer.valueOf(W), 1);
            }
        }));
        ArrayList arrayList = new ArrayList(kotlin.collections.g.h0(lVar, 10));
        Iterator<Object> it = lVar.iterator();
        while (it.hasNext()) {
            arrayList.add(i0(charSequence, (hg.c) it.next()));
        }
        return arrayList;
    }

    public static List h0(CharSequence charSequence, String[] strArr, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        kotlin.jvm.internal.g.e(charSequence, "<this>");
        boolean z10 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z10 = false;
            }
            if (!z10) {
                return f0(i10, charSequence, str, false);
            }
        }
        jg.l lVar = new jg.l(a0(charSequence, strArr, false, i10));
        ArrayList arrayList = new ArrayList(kotlin.collections.g.h0(lVar, 10));
        Iterator<Object> it = lVar.iterator();
        while (it.hasNext()) {
            arrayList.add(i0(charSequence, (hg.c) it.next()));
        }
        return arrayList;
    }

    public static final String i0(CharSequence charSequence, hg.c range) {
        kotlin.jvm.internal.g.e(charSequence, "<this>");
        kotlin.jvm.internal.g.e(range, "range");
        return charSequence.subSequence(Integer.valueOf(range.f18326a).intValue(), Integer.valueOf(range.f18327b).intValue() + 1).toString();
    }

    public static String j0(String str, String delimiter) {
        kotlin.jvm.internal.g.e(delimiter, "delimiter");
        int V = V(str, delimiter, 0, false, 6);
        if (V != -1) {
            String substring = str.substring(delimiter.length() + V, str.length());
            kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static final String k0(String str, String missingDelimiterValue) {
        kotlin.jvm.internal.g.e(str, "<this>");
        kotlin.jvm.internal.g.e(missingDelimiterValue, "missingDelimiterValue");
        int X = X(str, '.', 0, 6);
        if (X != -1) {
            String substring = str.substring(X + 1, str.length());
            kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static final String l0(String str, String str2, String missingDelimiterValue) {
        kotlin.jvm.internal.g.e(str, "<this>");
        kotlin.jvm.internal.g.e(missingDelimiterValue, "missingDelimiterValue");
        int Y = Y(str, str2, 6);
        if (Y != -1) {
            String substring = str.substring(str2.length() + Y, str.length());
            kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static String m0(String str, String str2) {
        int Y = Y(str, str2, 6);
        if (Y != -1) {
            String substring = str.substring(0, Y);
            kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static final CharSequence n0(CharSequence charSequence) {
        int i10;
        kotlin.jvm.internal.g.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i11 = 0;
        boolean z10 = false;
        while (i11 <= length) {
            if (!z10) {
                i10 = i11;
            } else {
                i10 = length;
            }
            boolean c02 = t0.c0(charSequence.charAt(i10));
            if (!z10) {
                if (!c02) {
                    z10 = true;
                } else {
                    i11++;
                }
            } else if (!c02) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i11, length + 1);
    }
}
