package okhttp3.internal.connection;

import com.google.android.play.core.assetpacks.b1;
import java.io.IOException;

/* compiled from: RouteException.kt */
/* loaded from: classes3.dex */
public final class RouteException extends RuntimeException {
    private final IOException firstConnectException;
    private IOException lastConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException firstConnectException) {
        super(firstConnectException);
        kotlin.jvm.internal.g.e(firstConnectException, "firstConnectException");
        this.firstConnectException = firstConnectException;
        this.lastConnectException = firstConnectException;
    }

    public final void addConnectException(IOException e10) {
        kotlin.jvm.internal.g.e(e10, "e");
        b1.n(this.firstConnectException, e10);
        this.lastConnectException = e10;
    }

    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
