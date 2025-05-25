package hk;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* compiled from: SocketAdapter.kt */
/* loaded from: classes3.dex */
public interface k {
    boolean a();

    boolean b(SSLSocket sSLSocket);

    String c(SSLSocket sSLSocket);

    void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list);
}
