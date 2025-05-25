package okhttp3.internal.http2;

/* compiled from: ErrorCode.kt */
/* loaded from: classes3.dex */
public enum ErrorCode {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    
    public static final a Companion = new a();
    private final int httpCode;

    /* compiled from: ErrorCode.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    ErrorCode(int i10) {
        this.httpCode = i10;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }
}
