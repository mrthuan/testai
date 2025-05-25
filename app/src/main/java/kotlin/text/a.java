package kotlin.text;

import java.nio.charset.Charset;
import lib.zj.office.fc.codec.CharEncoding;

/* compiled from: Charsets.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f19965a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f19966b;
    public static final Charset c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile Charset f19967d;

    /* renamed from: e  reason: collision with root package name */
    public static volatile Charset f19968e;

    static {
        Charset forName = Charset.forName("UTF-8");
        kotlin.jvm.internal.g.d(forName, "forName(\"UTF-8\")");
        f19966b = forName;
        kotlin.jvm.internal.g.d(Charset.forName(CharEncoding.UTF_16), "forName(\"UTF-16\")");
        kotlin.jvm.internal.g.d(Charset.forName(CharEncoding.UTF_16BE), "forName(\"UTF-16BE\")");
        kotlin.jvm.internal.g.d(Charset.forName(CharEncoding.UTF_16LE), "forName(\"UTF-16LE\")");
        kotlin.jvm.internal.g.d(Charset.forName(CharEncoding.US_ASCII), "forName(\"US-ASCII\")");
        Charset forName2 = Charset.forName(CharEncoding.ISO_8859_1);
        kotlin.jvm.internal.g.d(forName2, "forName(\"ISO-8859-1\")");
        c = forName2;
    }
}
