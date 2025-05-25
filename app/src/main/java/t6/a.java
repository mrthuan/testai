package t6;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import v6.l;

/* compiled from: CCTDestination.java */
/* loaded from: classes.dex */
public final class a implements l {
    public static final String c;

    /* renamed from: d  reason: collision with root package name */
    public static final Set<s6.b> f29948d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f29949e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f29950f;

    /* renamed from: a  reason: collision with root package name */
    public final String f29951a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29952b;

    static {
        String N = b.b.N("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = N;
        String N2 = b.b.N("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String N3 = b.b.N("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f29948d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new s6.b("proto"), new s6.b("json"))));
        f29949e = new a(N, null);
        f29950f = new a(N2, N3);
    }

    public a(String str, String str2) {
        this.f29951a = str;
        this.f29952b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public final byte[] b() {
        String str = this.f29951a;
        String str2 = this.f29952b;
        if (str2 == null && str == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = str;
        objArr[2] = "\\";
        if (str2 == null) {
            str2 = "";
        }
        objArr[3] = str2;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
