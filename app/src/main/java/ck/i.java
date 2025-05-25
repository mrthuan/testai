package ck;

import java.net.ProtocolException;
import kotlin.text.j;
import okhttp3.Protocol;

/* compiled from: StatusLine.kt */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Protocol f5708a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5709b;
    public final String c;

    /* compiled from: StatusLine.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static i a(String statusLine) {
            Protocol protocol;
            int i10;
            String str;
            kotlin.jvm.internal.g.e(statusLine, "statusLine");
            if (j.M(statusLine, "HTTP/1.", false)) {
                i10 = 9;
                if (statusLine.length() >= 9 && statusLine.charAt(8) == ' ') {
                    int charAt = statusLine.charAt(7) - '0';
                    if (charAt != 0) {
                        if (charAt == 1) {
                            protocol = Protocol.HTTP_1_1;
                        } else {
                            throw new ProtocolException(kotlin.jvm.internal.g.h(statusLine, "Unexpected status line: "));
                        }
                    } else {
                        protocol = Protocol.HTTP_1_0;
                    }
                } else {
                    throw new ProtocolException(kotlin.jvm.internal.g.h(statusLine, "Unexpected status line: "));
                }
            } else if (j.M(statusLine, "ICY ", false)) {
                protocol = Protocol.HTTP_1_0;
                i10 = 4;
            } else {
                throw new ProtocolException(kotlin.jvm.internal.g.h(statusLine, "Unexpected status line: "));
            }
            int i11 = i10 + 3;
            if (statusLine.length() >= i11) {
                try {
                    String substring = statusLine.substring(i10, i11);
                    kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (statusLine.length() > i11) {
                        if (statusLine.charAt(i11) == ' ') {
                            str = statusLine.substring(i10 + 4);
                            kotlin.jvm.internal.g.d(str, "this as java.lang.String).substring(startIndex)");
                        } else {
                            throw new ProtocolException(kotlin.jvm.internal.g.h(statusLine, "Unexpected status line: "));
                        }
                    } else {
                        str = "";
                    }
                    return new i(protocol, parseInt, str);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException(kotlin.jvm.internal.g.h(statusLine, "Unexpected status line: "));
                }
            }
            throw new ProtocolException(kotlin.jvm.internal.g.h(statusLine, "Unexpected status line: "));
        }
    }

    public i(Protocol protocol, int i10, String str) {
        kotlin.jvm.internal.g.e(protocol, "protocol");
        this.f5708a = protocol;
        this.f5709b = i10;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f5708a == Protocol.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f5709b);
        sb2.append(' ');
        sb2.append(this.c);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
