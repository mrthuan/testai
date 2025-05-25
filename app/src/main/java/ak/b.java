package ak;

import com.adjust.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.google.android.play.core.assetpacks.b1;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kk.f;
import kk.h;
import kk.p;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import kotlin.text.Regex;
import kotlin.text.j;
import kotlin.text.k;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import okhttp3.o;
import okhttp3.s;
import okhttp3.w;
import okhttp3.x;
import okhttp3.y;
import okio.ByteString;

/* compiled from: Util.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f665a;

    /* renamed from: b  reason: collision with root package name */
    public static final o f666b = o.b.c(new String[0]);
    public static final y c;

    /* renamed from: d  reason: collision with root package name */
    public static final p f667d;

    /* renamed from: e  reason: collision with root package name */
    public static final TimeZone f668e;

    /* renamed from: f  reason: collision with root package name */
    public static final Regex f669f;

    /* renamed from: g  reason: collision with root package name */
    public static final String f670g;

    static {
        byte[] bArr = new byte[0];
        f665a = bArr;
        f fVar = new f();
        fVar.o(0, 0, bArr);
        c = new y(0, null, fVar);
        w.a.a(bArr, null, 7);
        ByteString.Companion.getClass();
        f667d = p.a.b(ByteString.a.b("efbbbf"), ByteString.a.b("feff"), ByteString.a.b("fffe"), ByteString.a.b("0000ffff"), ByteString.a.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        g.b(timeZone);
        f668e = timeZone;
        f669f = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f670g = k.d0(k.c0(s.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(okhttp3.p pVar, okhttp3.p other) {
        g.e(pVar, "<this>");
        g.e(other, "other");
        if (g.a(pVar.f23366d, other.f23366d) && pVar.f23367e == other.f23367e && g.a(pVar.f23364a, other.f23364a)) {
            return true;
        }
        return false;
    }

    public static final int b(TimeUnit timeUnit) {
        boolean z10;
        long millis = timeUnit.toMillis(300L);
        boolean z11 = true;
        if (millis <= 2147483647L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (millis == 0) {
                z11 = false;
            }
            if (z11) {
                return (int) millis;
            }
            throw new IllegalArgumentException(g.h(" too small.", "timeout").toString());
        }
        throw new IllegalArgumentException(g.h(" too large.", "timeout").toString());
    }

    public static final void c(Closeable closeable) {
        g.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (g.a(e11.getMessage(), "bio == null")) {
                return;
            }
            throw e11;
        } catch (Exception unused) {
        }
    }

    public static final int e(int i10, int i11, String str, String str2) {
        g.e(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            boolean z10 = false;
            if (k.U(str2, str.charAt(i10), 0, false, 2) >= 0) {
                z10 = true;
            }
            if (z10) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static final int f(String str, int i10, int i11, char c10) {
        g.e(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static final boolean g(kk.y yVar, TimeUnit timeUnit) {
        g.e(yVar, "<this>");
        g.e(timeUnit, "timeUnit");
        try {
            return t(yVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String h(String format, Object... objArr) {
        g.e(format, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        g.d(format2, "format(locale, format, *args)");
        return format2;
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        boolean z10;
        boolean z11;
        boolean z12;
        g.e(strArr, "<this>");
        if (strArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && strArr2 != null) {
            if (strArr2.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                int length = strArr.length;
                int i10 = 0;
                while (i10 < length) {
                    String str = strArr[i10];
                    i10++;
                    int i11 = 0;
                    while (true) {
                        if (i11 < strArr2.length) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            int i12 = i11 + 1;
                            try {
                                if (comparator.compare(str, strArr2[i11]) == 0) {
                                    return true;
                                }
                                i11 = i12;
                            } catch (ArrayIndexOutOfBoundsException e10) {
                                throw new NoSuchElementException(e10.getMessage());
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long j(x xVar) {
        String a10 = xVar.f23446f.a("Content-Length");
        if (a10 != null) {
            try {
                return Long.parseLong(a10);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    @SafeVarargs
    public static final <T> List<T> k(T... elements) {
        g.e(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(ge.a.I(Arrays.copyOf(objArr, objArr.length)));
        g.d(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char charAt = str.charAt(i10);
            if (g.f(charAt, 31) > 0 && g.f(charAt, ShapeTypes.VERTICAL_SCROLL) < 0) {
                i10 = i11;
            } else {
                return i10;
            }
        }
        return -1;
    }

    public static final int m(int i10, int i11, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        while (i10 < i11) {
            int i12 = i10 + 1;
            char charAt = str.charAt(i10);
            boolean z13 = true;
            if (charAt == '\t' || charAt == '\n') {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || charAt == '\f') {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 || charAt == '\r') {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12 && charAt != ' ') {
                z13 = false;
            }
            if (z13) {
                i10 = i12;
            } else {
                return i10;
            }
        }
        return i11;
    }

    public static final int n(int i10, int i11, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                int i13 = i12 - 1;
                char charAt = str.charAt(i12);
                boolean z13 = false;
                if (charAt == '\t' || charAt == '\n') {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 || charAt == '\f') {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 || charAt == '\r') {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12 || charAt == ' ') {
                    z13 = true;
                }
                if (z13) {
                    if (i12 == i10) {
                        break;
                    }
                    i12 = i13;
                } else {
                    return i12 + 1;
                }
            }
        }
        return i10;
    }

    public static final String[] o(String[] strArr, String[] other, Comparator<? super String> comparator) {
        g.e(other, "other");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str = strArr[i10];
            i10++;
            int length2 = other.length;
            int i11 = 0;
            while (true) {
                if (i11 < length2) {
                    String str2 = other[i11];
                    i11++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean p(String name) {
        g.e(name, "name");
        if (j.G(name, "Authorization", true) || j.G(name, "Cookie", true) || j.G(name, "Proxy-Authorization", true) || j.G(name, "Set-Cookie", true)) {
            return true;
        }
        return false;
    }

    public static final int q(char c10) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if ('0' <= c10 && c10 < ':') {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' <= c10 && c10 < 'g') {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            c11 = 'A';
            if ('A' > c10 || c10 >= 'G') {
                z12 = false;
            }
            if (!z12) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static final Charset r(h hVar, Charset charset) {
        Charset charset2;
        g.e(hVar, "<this>");
        g.e(charset, "default");
        int X = hVar.X(f667d);
        if (X != -1) {
            if (X != 0) {
                if (X != 1) {
                    if (X != 2) {
                        if (X != 3) {
                            if (X == 4) {
                                kotlin.text.a.f19965a.getClass();
                                charset2 = kotlin.text.a.f19967d;
                                if (charset2 == null) {
                                    charset2 = Charset.forName("UTF-32LE");
                                    g.d(charset2, "forName(\"UTF-32LE\")");
                                    kotlin.text.a.f19967d = charset2;
                                }
                            } else {
                                throw new AssertionError();
                            }
                        } else {
                            kotlin.text.a.f19965a.getClass();
                            charset2 = kotlin.text.a.f19968e;
                            if (charset2 == null) {
                                charset2 = Charset.forName("UTF-32BE");
                                g.d(charset2, "forName(\"UTF-32BE\")");
                                kotlin.text.a.f19968e = charset2;
                            }
                        }
                        return charset2;
                    }
                    Charset UTF_16LE = StandardCharsets.UTF_16LE;
                    g.d(UTF_16LE, "UTF_16LE");
                    return UTF_16LE;
                }
                Charset UTF_16BE = StandardCharsets.UTF_16BE;
                g.d(UTF_16BE, "UTF_16BE");
                return UTF_16BE;
            }
            Charset UTF_8 = StandardCharsets.UTF_8;
            g.d(UTF_8, "UTF_8");
            return UTF_8;
        }
        return charset;
    }

    public static final int s(h hVar) {
        g.e(hVar, "<this>");
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    public static final boolean t(kk.y yVar, int i10, TimeUnit timeUnit) {
        long j10;
        g.e(yVar, "<this>");
        g.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        if (yVar.z().e()) {
            j10 = yVar.z().c() - nanoTime;
        } else {
            j10 = Long.MAX_VALUE;
        }
        yVar.z().d(Math.min(j10, timeUnit.toNanos(i10)) + nanoTime);
        try {
            f fVar = new f();
            while (yVar.g(fVar, 8192L) != -1) {
                fVar.clear();
            }
            if (j10 == Long.MAX_VALUE) {
                yVar.z().a();
            } else {
                yVar.z().d(nanoTime + j10);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (j10 == Long.MAX_VALUE) {
                yVar.z().a();
            } else {
                yVar.z().d(nanoTime + j10);
            }
            return false;
        } catch (Throwable th2) {
            if (j10 == Long.MAX_VALUE) {
                yVar.z().a();
            } else {
                yVar.z().d(nanoTime + j10);
            }
            throw th2;
        }
    }

    public static final o u(List<ek.a> list) {
        g.e(list, "<this>");
        o.a aVar = new o.a();
        for (ek.a aVar2 : list) {
            aVar.c(aVar2.f16648a.utf8(), aVar2.f16649b.utf8());
        }
        return aVar.d();
    }

    public static final String v(okhttp3.p pVar, boolean z10) {
        int i10;
        g.e(pVar, "<this>");
        String str = pVar.f23366d;
        if (k.O(str, ":", false)) {
            str = "[" + str + ']';
        }
        int i11 = pVar.f23367e;
        if (!z10) {
            String scheme = pVar.f23364a;
            g.e(scheme, "scheme");
            if (g.a(scheme, "http")) {
                i10 = 80;
            } else if (g.a(scheme, Constants.SCHEME)) {
                i10 = 443;
            } else {
                i10 = -1;
            }
            if (i11 == i10) {
                return str;
            }
        }
        return str + ':' + i11;
    }

    public static final <T> List<T> w(List<? extends T> list) {
        g.e(list, "<this>");
        List<T> unmodifiableList = Collections.unmodifiableList(m.F0(list));
        g.d(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int x(int i10, String str) {
        Long valueOf;
        if (str == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i10;
            }
        }
        if (valueOf == null) {
            return i10;
        }
        long longValue = valueOf.longValue();
        if (longValue > 2147483647L) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final String y(int i10, int i11, String str) {
        int m10 = m(i10, i11, str);
        String substring = str.substring(m10, n(m10, i11, str));
        g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void z(IOException iOException, List suppressed) {
        g.e(iOException, "<this>");
        g.e(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            b1.n(iOException, (Exception) it.next());
        }
    }
}
