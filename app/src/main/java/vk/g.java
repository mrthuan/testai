package vk;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: HtmlWriter.java */
/* loaded from: classes3.dex */
public final class g {
    public static final Map<String, String> c = Collections.emptyMap();

    /* renamed from: a  reason: collision with root package name */
    public final Appendable f30841a;

    /* renamed from: b  reason: collision with root package name */
    public char f30842b = 0;

    public g(StringBuilder sb2) {
        this.f30841a = sb2;
    }

    public final void a(String str) {
        try {
            this.f30841a.append(str);
            int length = str.length();
            if (length != 0) {
                this.f30842b = str.charAt(length - 1);
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void b() {
        char c10 = this.f30842b;
        if (c10 != 0 && c10 != '\n') {
            a("\n");
        }
    }

    public final void c(String str) {
        d(c, str, false);
    }

    public final void d(Map map, String str, boolean z10) {
        a("<");
        a(str);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                a(" ");
                a(pk.a.a((String) entry.getKey()));
                a("=\"");
                a(pk.a.a((String) entry.getValue()));
                a(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            }
        }
        if (z10) {
            a(" /");
        }
        a(">");
    }
}
