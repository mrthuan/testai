package com.lib.flutter.encrypt;

import kotlin.jvm.internal.g;

/* compiled from: MessagKt.kt */
/* loaded from: classes2.dex */
public final class FlutterError extends Throwable {
    private final String code;
    private final Object details;
    private final String message;

    public /* synthetic */ FlutterError(String str, String str2, Object obj, int i10, kotlin.jvm.internal.d dVar) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : obj);
    }

    public final String getCode() {
        return this.code;
    }

    public final Object getDetails() {
        return this.details;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public FlutterError(String str, String str2, Object obj) {
        g.e(str, ea.a.p("UG8vZQ==", "GEodqu5u"));
        this.code = str;
        this.message = str2;
        this.details = obj;
    }
}
