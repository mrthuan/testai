package pk;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Escaping.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f28968a = Pattern.compile("[\\\\&]");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f28969b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern c;

    /* renamed from: d  reason: collision with root package name */
    public static final C0363a f28970d;

    /* compiled from: Escaping.java */
    /* renamed from: pk.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0363a {
        public final void a(String str, StringBuilder sb2) {
            if (str.charAt(0) == '\\') {
                sb2.append((CharSequence) str, 1, str.length());
            } else {
                sb2.append(pk.b.a(str));
            }
        }
    }

    /* compiled from: Escaping.java */
    /* loaded from: classes3.dex */
    public static class b {
    }

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        c = Pattern.compile("[ \t\r\n]+");
        f28970d = new C0363a();
        new b();
    }

    public static String a(String str) {
        String str2;
        StringBuilder sb2 = null;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt != '\"') {
                if (charAt != '&') {
                    if (charAt != '<') {
                        if (charAt != '>') {
                            if (sb2 != null) {
                                sb2.append(charAt);
                            }
                        } else {
                            str2 = "&gt;";
                        }
                    } else {
                        str2 = "&lt;";
                    }
                } else {
                    str2 = "&amp;";
                }
            } else {
                str2 = "&quot;";
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
                sb2.append((CharSequence) str, 0, i10);
            }
            sb2.append(str2);
        }
        if (sb2 != null) {
            return sb2.toString();
        }
        return str;
    }

    public static String b(String str) {
        if (f28968a.matcher(str).find()) {
            Matcher matcher = f28969b.matcher(str);
            if (matcher.find()) {
                StringBuilder sb2 = new StringBuilder(str.length() + 16);
                int i10 = 0;
                do {
                    sb2.append((CharSequence) str, i10, matcher.start());
                    f28970d.a(matcher.group(), sb2);
                    i10 = matcher.end();
                } while (matcher.find());
                if (i10 != str.length()) {
                    sb2.append((CharSequence) str, i10, str.length());
                }
                return sb2.toString();
            }
            return str;
        }
        return str;
    }
}
