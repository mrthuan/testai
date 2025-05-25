package okhttp3;

import com.adjust.sdk.Constants;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: HttpUrl.kt */
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: k  reason: collision with root package name */
    public static final char[] f23363k;

    /* renamed from: a  reason: collision with root package name */
    public final String f23364a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23365b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f23366d;

    /* renamed from: e  reason: collision with root package name */
    public final int f23367e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f23368f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f23369g;

    /* renamed from: h  reason: collision with root package name */
    public final String f23370h;

    /* renamed from: i  reason: collision with root package name */
    public final String f23371i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f23372j;

    /* compiled from: HttpUrl.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f23373a;

        /* renamed from: d  reason: collision with root package name */
        public String f23375d;

        /* renamed from: f  reason: collision with root package name */
        public final ArrayList f23377f;

        /* renamed from: g  reason: collision with root package name */
        public List<String> f23378g;

        /* renamed from: h  reason: collision with root package name */
        public String f23379h;

        /* renamed from: b  reason: collision with root package name */
        public String f23374b = "";
        public String c = "";

        /* renamed from: e  reason: collision with root package name */
        public int f23376e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f23377f = arrayList;
            arrayList.add("");
        }

        public final p a() {
            ArrayList arrayList;
            String d10;
            String str = this.f23373a;
            if (str != null) {
                String d11 = b.d(this.f23374b, 0, 0, false, 7);
                String d12 = b.d(this.c, 0, 0, false, 7);
                String str2 = this.f23375d;
                if (str2 != null) {
                    int b10 = b();
                    ArrayList arrayList2 = this.f23377f;
                    ArrayList arrayList3 = new ArrayList(kotlin.collections.g.h0(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(b.d((String) it.next(), 0, 0, false, 7));
                    }
                    List<String> list = this.f23378g;
                    String str3 = null;
                    if (list == null) {
                        arrayList = null;
                    } else {
                        List<String> list2 = list;
                        arrayList = new ArrayList(kotlin.collections.g.h0(list2, 10));
                        for (String str4 : list2) {
                            if (str4 == null) {
                                d10 = null;
                            } else {
                                d10 = b.d(str4, 0, 0, true, 3);
                            }
                            arrayList.add(d10);
                        }
                    }
                    String str5 = this.f23379h;
                    if (str5 != null) {
                        str3 = b.d(str5, 0, 0, false, 7);
                    }
                    return new p(str, d11, d12, str2, b10, arrayList3, arrayList, str3, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final int b() {
            int i10 = this.f23376e;
            if (i10 == -1) {
                String str = this.f23373a;
                kotlin.jvm.internal.g.b(str);
                if (kotlin.jvm.internal.g.a(str, "http")) {
                    return 80;
                }
                if (!kotlin.jvm.internal.g.a(str, Constants.SCHEME)) {
                    return -1;
                }
                return 443;
            }
            return i10;
        }

        public final void c(String str) {
            ArrayList e10;
            if (str == null) {
                e10 = null;
            } else {
                e10 = b.e(b.a(str, 0, 0, " \"'<>#", true, false, true, false, null, 211));
            }
            this.f23378g = e10;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:141:0x027a
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        public final void d(okhttp3.p r29, java.lang.String r30) {
            /*
                Method dump skipped, instructions count: 1134
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.p.a.d(okhttp3.p, java.lang.String):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
            if (r1 != false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
            if (r1 != r3) goto L47;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 238
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.p.a.toString():java.lang.String");
        }
    }

    /* compiled from: HttpUrl.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        public static String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12) {
            int i13;
            int i14;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            Charset charset2;
            boolean z18;
            boolean z19;
            String str3;
            boolean z20;
            if ((i12 & 1) != 0) {
                i13 = 0;
            } else {
                i13 = i10;
            }
            if ((i12 & 2) != 0) {
                i14 = str.length();
            } else {
                i14 = i11;
            }
            if ((i12 & 8) != 0) {
                z14 = false;
            } else {
                z14 = z10;
            }
            if ((i12 & 16) != 0) {
                z15 = false;
            } else {
                z15 = z11;
            }
            if ((i12 & 32) != 0) {
                z16 = false;
            } else {
                z16 = z12;
            }
            if ((i12 & 64) != 0) {
                z17 = false;
            } else {
                z17 = z13;
            }
            int i15 = 128;
            if ((i12 & 128) != 0) {
                charset2 = null;
            } else {
                charset2 = charset;
            }
            kotlin.jvm.internal.g.e(str, "<this>");
            int i16 = i13;
            while (i16 < i14) {
                int codePointAt = str.codePointAt(i16);
                int i17 = 32;
                int i18 = 2;
                if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < i15 || z17)) {
                    if (kotlin.text.k.U(str2, (char) codePointAt, 0, false, 2) >= 0) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    if (!z20 && ((codePointAt != 37 || (z14 && (!z15 || c(i16, i14, str)))) && (codePointAt != 43 || !z16))) {
                        i16 += Character.charCount(codePointAt);
                        i15 = 128;
                    }
                }
                kk.f fVar = new kk.f();
                fVar.w(i13, i16, str);
                kk.f fVar2 = null;
                while (i16 < i14) {
                    int codePointAt2 = str.codePointAt(i16);
                    if (!z14 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z16) {
                            if (z14) {
                                str3 = "+";
                            } else {
                                str3 = "%2B";
                            }
                            fVar.x(str3);
                        } else {
                            if (codePointAt2 >= i17 && codePointAt2 != 127 && (codePointAt2 < 128 || z17)) {
                                z18 = false;
                                if (kotlin.text.k.U(str2, (char) codePointAt2, 0, false, i18) >= 0) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                if (!z19 && (codePointAt2 != 37 || (z14 && (!z15 || c(i16, i14, str))))) {
                                    fVar.Q(codePointAt2);
                                    i16 += Character.charCount(codePointAt2);
                                    i18 = 2;
                                    i17 = 32;
                                }
                            } else {
                                z18 = false;
                            }
                            if (fVar2 == null) {
                                fVar2 = new kk.f();
                            }
                            if (charset2 != null && !kotlin.jvm.internal.g.a(charset2, StandardCharsets.UTF_8)) {
                                fVar2.v(str, i16, Character.charCount(codePointAt2) + i16, charset2);
                            } else {
                                fVar2.Q(codePointAt2);
                            }
                            while (!fVar2.E()) {
                                int readByte = fVar2.readByte() & 255;
                                fVar.q(37);
                                char[] cArr = p.f23363k;
                                fVar.q(cArr[(readByte >> 4) & 15]);
                                fVar.q(cArr[readByte & 15]);
                            }
                            i16 += Character.charCount(codePointAt2);
                            i18 = 2;
                            i17 = 32;
                        }
                    }
                    z18 = false;
                    i16 += Character.charCount(codePointAt2);
                    i18 = 2;
                    i17 = 32;
                }
                return fVar.k();
            }
            String substring = str.substring(i13, i14);
            kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public static int b(String scheme) {
            kotlin.jvm.internal.g.e(scheme, "scheme");
            if (kotlin.jvm.internal.g.a(scheme, "http")) {
                return 80;
            }
            if (kotlin.jvm.internal.g.a(scheme, Constants.SCHEME)) {
                return 443;
            }
            return -1;
        }

        public static boolean c(int i10, int i11, String str) {
            int i12 = i10 + 2;
            if (i12 < i11 && str.charAt(i10) == '%' && ak.b.q(str.charAt(i10 + 1)) != -1 && ak.b.q(str.charAt(i12)) != -1) {
                return true;
            }
            return false;
        }

        public static String d(String str, int i10, int i11, boolean z10, int i12) {
            int i13;
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            kotlin.jvm.internal.g.e(str, "<this>");
            int i14 = i10;
            while (i14 < i11) {
                int i15 = i14 + 1;
                char charAt = str.charAt(i14);
                if (charAt != '%' && (charAt != '+' || !z10)) {
                    i14 = i15;
                } else {
                    kk.f fVar = new kk.f();
                    fVar.w(i10, i14, str);
                    while (i14 < i11) {
                        int codePointAt = str.codePointAt(i14);
                        if (codePointAt == 37 && (i13 = i14 + 2) < i11) {
                            int q5 = ak.b.q(str.charAt(i14 + 1));
                            int q6 = ak.b.q(str.charAt(i13));
                            if (q5 != -1 && q6 != -1) {
                                fVar.q((q5 << 4) + q6);
                                i14 = Character.charCount(codePointAt) + i13;
                            }
                            fVar.Q(codePointAt);
                            i14 += Character.charCount(codePointAt);
                        } else {
                            if (codePointAt == 43 && z10) {
                                fVar.q(32);
                                i14++;
                            }
                            fVar.Q(codePointAt);
                            i14 += Character.charCount(codePointAt);
                        }
                    }
                    return fVar.k();
                }
            }
            String substring = str.substring(i10, i11);
            kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public static ArrayList e(String str) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                int U = kotlin.text.k.U(str, '&', i10, false, 4);
                if (U == -1) {
                    U = str.length();
                }
                int U2 = kotlin.text.k.U(str, '=', i10, false, 4);
                if (U2 != -1 && U2 <= U) {
                    String substring = str.substring(i10, U2);
                    kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    String substring2 = str.substring(U2 + 1, U);
                    kotlin.jvm.internal.g.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                } else {
                    String substring3 = str.substring(i10, U);
                    kotlin.jvm.internal.g.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                    arrayList.add(null);
                }
                i10 = U + 1;
            }
            return arrayList;
        }

        public static void f(StringBuilder sb2, List list) {
            kotlin.jvm.internal.g.e(list, "<this>");
            hg.a a02 = ge.a.a0(ge.a.f0(0, list.size()), 2);
            int i10 = a02.f18326a;
            int i11 = a02.f18327b;
            int i12 = a02.c;
            if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
                return;
            }
            while (true) {
                int i13 = i10 + i12;
                String str = (String) list.get(i10);
                String str2 = (String) list.get(i10 + 1);
                if (i10 > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (i10 != i11) {
                    i10 = i13;
                } else {
                    return;
                }
            }
        }
    }

    static {
        new b();
        f23363k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public p(String str, String str2, String str3, String str4, int i10, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f23364a = str;
        this.f23365b = str2;
        this.c = str3;
        this.f23366d = str4;
        this.f23367e = i10;
        this.f23368f = arrayList;
        this.f23369g = arrayList2;
        this.f23370h = str5;
        this.f23371i = str6;
        this.f23372j = kotlin.jvm.internal.g.a(str, Constants.SCHEME);
    }

    public final String a() {
        boolean z10;
        if (this.c.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return "";
        }
        String str = this.f23371i;
        String substring = str.substring(kotlin.text.k.U(str, ':', this.f23364a.length() + 3, false, 4) + 1, kotlin.text.k.U(str, '@', 0, false, 6));
        kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        String str = this.f23371i;
        int U = kotlin.text.k.U(str, PackagingURIHelper.FORWARD_SLASH_CHAR, this.f23364a.length() + 3, false, 4);
        String substring = str.substring(U, ak.b.e(U, str.length(), str, "?#"));
        kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        String str = this.f23371i;
        int U = kotlin.text.k.U(str, PackagingURIHelper.FORWARD_SLASH_CHAR, this.f23364a.length() + 3, false, 4);
        int e10 = ak.b.e(U, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (U < e10) {
            int i10 = U + 1;
            int f10 = ak.b.f(str, i10, e10, PackagingURIHelper.FORWARD_SLASH_CHAR);
            String substring = str.substring(i10, f10);
            kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            U = f10;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f23369g == null) {
            return null;
        }
        String str = this.f23371i;
        int U = kotlin.text.k.U(str, '?', 0, false, 6) + 1;
        String substring = str.substring(U, ak.b.f(str, U, str.length(), '#'));
        kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        boolean z10;
        if (this.f23365b.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return "";
        }
        int length = this.f23364a.length() + 3;
        String str = this.f23371i;
        String substring = str.substring(length, ak.b.e(length, str.length(), str, ":@"));
        kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof p) && kotlin.jvm.internal.g.a(((p) obj).f23371i, this.f23371i)) {
            return true;
        }
        return false;
    }

    public final String f() {
        a aVar;
        try {
            aVar = new a();
            aVar.d(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        kotlin.jvm.internal.g.b(aVar);
        aVar.f23374b = b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        aVar.c = b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        return aVar.a().f23371i;
    }

    public final URI g() {
        String substring;
        String replace;
        String a10;
        a aVar = new a();
        String str = this.f23364a;
        aVar.f23373a = str;
        aVar.f23374b = e();
        aVar.c = a();
        aVar.f23375d = this.f23366d;
        int b10 = b.b(str);
        int i10 = this.f23367e;
        if (i10 == b10) {
            i10 = -1;
        }
        aVar.f23376e = i10;
        ArrayList arrayList = aVar.f23377f;
        arrayList.clear();
        arrayList.addAll(c());
        aVar.c(d());
        int i11 = 0;
        String str2 = null;
        if (this.f23370h == null) {
            substring = null;
        } else {
            String str3 = this.f23371i;
            substring = str3.substring(kotlin.text.k.U(str3, '#', 0, false, 6) + 1);
            kotlin.jvm.internal.g.d(substring, "this as java.lang.String).substring(startIndex)");
        }
        aVar.f23379h = substring;
        String str4 = aVar.f23375d;
        if (str4 == null) {
            replace = null;
        } else {
            replace = new Regex("[\"<>^`{|}]").replace(str4, "");
        }
        aVar.f23375d = replace;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.set(i12, b.a((String) arrayList.get(i12), 0, 0, "[]", true, true, false, false, null, 227));
        }
        List<String> list = aVar.f23378g;
        if (list != null) {
            int size2 = list.size();
            while (i11 < size2) {
                int i13 = i11 + 1;
                String str5 = list.get(i11);
                if (str5 == null) {
                    a10 = null;
                } else {
                    a10 = b.a(str5, 0, 0, "\\^`{|}", true, true, true, false, null, 195);
                }
                list.set(i11, a10);
                i11 = i13;
            }
        }
        String str6 = aVar.f23379h;
        if (str6 != null) {
            str2 = b.a(str6, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, ShapeTypes.ACTION_BUTTON_HELP);
        }
        aVar.f23379h = str2;
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e10) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(aVar2, ""));
                kotlin.jvm.internal.g.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final int hashCode() {
        return this.f23371i.hashCode();
    }

    public final String toString() {
        return this.f23371i;
    }
