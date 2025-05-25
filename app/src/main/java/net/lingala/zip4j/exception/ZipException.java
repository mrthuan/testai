package net.lingala.zip4j.exception;

import java.io.IOException;

/* loaded from: classes3.dex */
public class ZipException extends IOException {
    private static final long serialVersionUID = 1;
    private Type type;

    /* loaded from: classes3.dex */
    public enum Type {
        WRONG_PASSWORD,
        TASK_CANCELLED_EXCEPTION,
        CHECKSUM_MISMATCH,
        UNKNOWN_COMPRESSION_METHOD,
        FILE_NOT_FOUND,
        UNSUPPORTED_ENCRYPTION,
        UNKNOWN
    }

    public ZipException(String str) {
        super(str);
        this.type = Type.UNKNOWN;
    }

    public Type getType() {
        return this.type;
    }

    public ZipException(Exception exc) {
        super(exc);
        this.type = Type.UNKNOWN;
    }

    public ZipException(String str, Exception exc) {
        super(str, exc);
        this.type = Type.UNKNOWN;
    }

    public ZipException(String str, Type type) {
        super(str);
        Type type2 = Type.WRONG_PASSWORD;
        this.type = type;
    }

    public ZipException(String str, Throwable th2, Type type) {
        super(str, th2);
        Type type2 = Type.WRONG_PASSWORD;
        this.type = type;
    }
}
