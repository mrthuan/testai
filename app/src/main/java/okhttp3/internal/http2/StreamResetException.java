package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.jvm.internal.g;

/* compiled from: StreamResetException.kt */
/* loaded from: classes3.dex */
public final class StreamResetException extends IOException {
    public final ErrorCode errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode) {
        super(g.h(errorCode, "stream was reset: "));
        g.e(errorCode, "errorCode");
        this.errorCode = errorCode;
    }
}
