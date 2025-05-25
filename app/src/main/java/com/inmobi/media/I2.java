package com.inmobi.media;

/* loaded from: classes2.dex */
public class I2 extends R4 {

    /* renamed from: g  reason: collision with root package name */
    public final StackTraceElement[] f14339g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I2(Thread thread, Throwable error) {
        super("crashReporting", "CrashEvent", Vb.a(thread, error));
        kotlin.jvm.internal.g.e(thread, "thread");
        kotlin.jvm.internal.g.e(error, "error");
        StackTraceElement[] stackTrace = error.getStackTrace();
        kotlin.jvm.internal.g.d(stackTrace, "getStackTrace(...)");
        this.f14339g = stackTrace;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public I2(java.lang.String r4) {
        /*
            r3 = this;
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.g.d(r0, r1)
            java.lang.String r1 = "crashReporting"
            java.lang.String r2 = "CatchEvent"
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.I2.<init>(java.lang.String):void");
    }
}
