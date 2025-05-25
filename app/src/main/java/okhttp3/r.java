package okhttp3;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: MediaType.kt */
/* loaded from: classes3.dex */
public final class r {
    public static final Pattern c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f23380d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    public final String f23381a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f23382b;

    /* compiled from: MediaType.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static r a(String str) {
            kotlin.jvm.internal.g.e(str, "<this>");
            Matcher matcher = r.c.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                kotlin.jvm.internal.g.d(group, "typeSubtype.group(1)");
                Locale US = Locale.US;
                kotlin.jvm.internal.g.d(US, "US");
                kotlin.jvm.internal.g.d(group.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                kotlin.jvm.internal.g.d(group2, "typeSubtype.group(2)");
                kotlin.jvm.internal.g.d(group2.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = r.f23380d.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (kotlin.text.j.M(group4, OperatorName.SHOW_TEXT_LINE, false) && kotlin.text.j.F(group4, OperatorName.SHOW_TEXT_LINE, false) && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                kotlin.jvm.internal.g.d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        kotlin.jvm.internal.g.d(substring, "this as java.lang.String).substring(startIndex)");
                        sb2.append(substring);
                        sb2.append("\" for: \"");
                        sb2.append(str);
                        sb2.append('\"');
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    return new r(str, (String[]) array);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        public static r b(String str) {
            kotlin.jvm.internal.g.e(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public r(String str, String[] strArr) {
        this.f23381a = str;
        this.f23382b = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.f23382b;
        int i10 = 0;
        int S = t0.S(0, strArr.length - 1, 2);
        if (S >= 0) {
            while (true) {
                int i11 = i10 + 2;
                if (kotlin.text.j.G(strArr[i10], "charset", true)) {
                    str = strArr[i10 + 1];
                    break;
                } else if (i10 == S) {
                    break;
                } else {
                    i10 = i11;
                }
            }
        }
        str = null;
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof r) && kotlin.jvm.internal.g.a(((r) obj).f23381a, this.f23381a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23381a.hashCode();
    }

    public final String toString() {
        return this.f23381a;
    }
}
