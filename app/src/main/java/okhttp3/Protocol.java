package okhttp3;

import java.io.IOException;

/* compiled from: Protocol.kt */
/* loaded from: classes3.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final a Companion = new a();
    private final String protocol;

    /* compiled from: Protocol.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static Protocol a(String protocol) {
            kotlin.jvm.internal.g.e(protocol, "protocol");
            Protocol protocol2 = Protocol.HTTP_1_0;
            if (!kotlin.jvm.internal.g.a(protocol, protocol2.protocol)) {
                protocol2 = Protocol.HTTP_1_1;
                if (!kotlin.jvm.internal.g.a(protocol, protocol2.protocol)) {
                    protocol2 = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!kotlin.jvm.internal.g.a(protocol, protocol2.protocol)) {
                        protocol2 = Protocol.HTTP_2;
                        if (!kotlin.jvm.internal.g.a(protocol, protocol2.protocol)) {
                            protocol2 = Protocol.SPDY_3;
                            if (!kotlin.jvm.internal.g.a(protocol, protocol2.protocol)) {
                                protocol2 = Protocol.QUIC;
                                if (!kotlin.jvm.internal.g.a(protocol, protocol2.protocol)) {
                                    throw new IOException(kotlin.jvm.internal.g.h(protocol, "Unexpected protocol: "));
                                }
                            }
                        }
                    }
                }
            }
            return protocol2;
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    public static final Protocol get(String str) {
        Companion.getClass();
        return a.a(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
