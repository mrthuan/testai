package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: Headers.kt */
/* loaded from: classes3.dex */
public final class o implements Iterable<Pair<? extends String, ? extends String>>, dg.a {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f23361a;

    /* compiled from: Headers.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f23362a = new ArrayList(20);

        public final void a(String name, String value) {
            kotlin.jvm.internal.g.e(name, "name");
            kotlin.jvm.internal.g.e(value, "value");
            b.a(name);
            b.b(value, name);
            c(name, value);
        }

        public final void b(String line) {
            kotlin.jvm.internal.g.e(line, "line");
            int U = kotlin.text.k.U(line, ':', 1, false, 4);
            if (U != -1) {
                String substring = line.substring(0, U);
                kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = line.substring(U + 1);
                kotlin.jvm.internal.g.d(substring2, "this as java.lang.String).substring(startIndex)");
                c(substring, substring2);
            } else if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                kotlin.jvm.internal.g.d(substring3, "this as java.lang.String).substring(startIndex)");
                c("", substring3);
            } else {
                c("", line);
            }
        }

        public final void c(String name, String value) {
            kotlin.jvm.internal.g.e(name, "name");
            kotlin.jvm.internal.g.e(value, "value");
            ArrayList arrayList = this.f23362a;
            arrayList.add(name);
            arrayList.add(kotlin.text.k.n0(value).toString());
        }

        public final o d() {
            Object[] array = this.f23362a.toArray(new String[0]);
            if (array != null) {
                return new o((String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final String e(String name) {
            kotlin.jvm.internal.g.e(name, "name");
            ArrayList arrayList = this.f23362a;
            int size = arrayList.size() - 2;
            int S = t0.S(size, 0, -2);
            if (S > size) {
                return null;
            }
            while (true) {
                int i10 = size - 2;
                if (kotlin.text.j.G(name, (String) arrayList.get(size), true)) {
                    return (String) arrayList.get(size + 1);
                }
                if (size != S) {
                    size = i10;
                } else {
                    return null;
                }
            }
        }

        public final void f(String name) {
            kotlin.jvm.internal.g.e(name, "name");
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f23362a;
                if (i10 < arrayList.size()) {
                    if (kotlin.text.j.G(name, (String) arrayList.get(i10), true)) {
                        arrayList.remove(i10);
                        arrayList.remove(i10);
                        i10 -= 2;
                    }
                    i10 += 2;
                } else {
                    return;
                }
            }
        }
    }

    /* compiled from: Headers.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        public static void a(String str) {
            boolean z10;
            boolean z11;
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int length = str.length();
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    char charAt = str.charAt(i10);
                    if ('!' <= charAt && charAt < 127) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i10 = i11;
                    } else {
                        throw new IllegalArgumentException(ak.b.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x005b A[LOOP:0: B:3:0x0006->B:23:0x005b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0026 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void b(java.lang.String r7, java.lang.String r8) {
            /*
                int r0 = r7.length()
                r1 = 0
                r2 = r1
            L6:
                if (r2 >= r0) goto L5d
                int r3 = r2 + 1
                char r4 = r7.charAt(r2)
                r5 = 9
                r6 = 1
                if (r4 == r5) goto L23
                r5 = 32
                if (r5 > r4) goto L1d
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 >= r5) goto L1d
                r5 = r6
                goto L1e
            L1d:
                r5 = r1
            L1e:
                if (r5 == 0) goto L21
                goto L23
            L21:
                r5 = r1
                goto L24
            L23:
                r5 = r6
            L24:
                if (r5 != 0) goto L5b
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                r0[r1] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0[r6] = r1
                r1 = 2
                r0[r1] = r8
                java.lang.String r1 = "Unexpected char %#04x at %d in %s value"
                java.lang.String r0 = ak.b.h(r1, r0)
                boolean r8 = ak.b.p(r8)
                if (r8 == 0) goto L47
                java.lang.String r7 = ""
                goto L4d
            L47:
                java.lang.String r8 = ": "
                java.lang.String r7 = kotlin.jvm.internal.g.h(r7, r8)
            L4d:
                java.lang.String r7 = kotlin.jvm.internal.g.h(r7, r0)
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r7 = r7.toString()
                r8.<init>(r7)
                throw r8
            L5b:
                r2 = r3
                goto L6
            L5d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.o.b.b(java.lang.String, java.lang.String):void");
        }

        public static o c(String... strArr) {
            boolean z10;
            boolean z11;
            int i10 = 0;
            if (strArr.length % 2 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                String[] strArr2 = (String[]) strArr.clone();
                int length = strArr2.length;
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    String str = strArr2[i11];
                    if (str != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        strArr2[i11] = kotlin.text.k.n0(str).toString();
                        i11 = i12;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                int S = t0.S(0, strArr2.length - 1, 2);
                if (S >= 0) {
                    while (true) {
                        int i13 = i10 + 2;
                        String str2 = strArr2[i10];
                        String str3 = strArr2[i10 + 1];
                        a(str2);
                        b(str3, str2);
                        if (i10 == S) {
                            break;
                        }
                        i10 = i13;
                    }
                }
                return new o(strArr2);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    public o(String[] strArr) {
        this.f23361a = strArr;
    }

    public final String a(String name) {
        kotlin.jvm.internal.g.e(name, "name");
        String[] strArr = this.f23361a;
        int length = strArr.length - 2;
        int S = t0.S(length, 0, -2);
        if (S <= length) {
            while (true) {
                int i10 = length - 2;
                if (kotlin.text.j.G(name, strArr[length], true)) {
                    return strArr[length + 1];
                }
                if (length == S) {
                    break;
                }
                length = i10;
            }
        }
        return null;
    }

    public final String b(int i10) {
        return this.f23361a[i10 * 2];
    }

    public final a c() {
        a aVar = new a();
        ArrayList arrayList = aVar.f23362a;
        kotlin.jvm.internal.g.e(arrayList, "<this>");
        String[] elements = this.f23361a;
        kotlin.jvm.internal.g.e(elements, "elements");
        arrayList.addAll(kotlin.collections.f.v(elements));
        return aVar;
    }

    public final String d(int i10) {
        return this.f23361a[(i10 * 2) + 1];
    }

    public final List<String> e(String name) {
        kotlin.jvm.internal.g.e(name, "name");
        int length = this.f23361a.length / 2;
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            if (kotlin.text.j.G(name, b(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(d(i10));
            }
            i10 = i11;
        }
        if (arrayList != null) {
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.g.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            return unmodifiableList;
        }
        return EmptyList.INSTANCE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            if (Arrays.equals(this.f23361a, ((o) obj).f23361a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f23361a);
    }

    @Override // java.lang.Iterable
    public final Iterator<Pair<? extends String, ? extends String>> iterator() {
        int length = this.f23361a.length / 2;
        Pair[] pairArr = new Pair[length];
        for (int i10 = 0; i10 < length; i10++) {
            pairArr[i10] = new Pair(b(i10), d(i10));
        }
        return new kotlin.jvm.internal.a(pairArr);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int length = this.f23361a.length / 2;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            String b10 = b(i10);
            String d10 = d(i10);
            sb2.append(b10);
            sb2.append(": ");
            if (ak.b.p(b10)) {
                d10 = "██";
            }
            sb2.append(d10);
            sb2.append("\n");
            i10 = i11;
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
