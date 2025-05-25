package kk;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: JvmOkio.kt */
/* loaded from: classes3.dex */
public final class x extends a {

    /* renamed from: k  reason: collision with root package name */
    public final Socket f19857k;

    public x(Socket socket) {
        this.f19857k = socket;
    }

    @Override // kk.a
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // kk.a
    public final void k() {
        Socket socket = this.f19857k;
        try {
            socket.close();
        } catch (AssertionError e10) {
            if (ge.a.D(e10)) {
                Logger logger = o.f19839a;
                Level level = Level.WARNING;
                logger.log(level, "Failed to close timed out socket " + socket, (Throwable) e10);
                return;
            }
            throw e10;
        } catch (Exception e11) {
            Logger logger2 = o.f19839a;
            Level level2 = Level.WARNING;
            logger2.log(level2, "Failed to close timed out socket " + socket, (Throwable) e11);
        }
    }
}
