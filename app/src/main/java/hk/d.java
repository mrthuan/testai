package hk;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: AndroidLog.kt */
/* loaded from: classes3.dex */
public final class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final d f18357a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int i10;
        int min;
        kotlin.jvm.internal.g.e(record, "record");
        CopyOnWriteArraySet<Logger> copyOnWriteArraySet = c.f18355a;
        String loggerName = record.getLoggerName();
        kotlin.jvm.internal.g.d(loggerName, "record.loggerName");
        if (record.getLevel().intValue() > Level.INFO.intValue()) {
            i10 = 5;
        } else if (record.getLevel().intValue() == Level.INFO.intValue()) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        String message = record.getMessage();
        kotlin.jvm.internal.g.d(message, "record.message");
        Throwable thrown = record.getThrown();
        String str = c.f18356b.get(loggerName);
        if (str == null) {
            str = kotlin.text.l.p0(23, loggerName);
        }
        if (Log.isLoggable(str, i10)) {
            if (thrown != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(thrown));
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                int U = kotlin.text.k.U(message, '\n', i11, false, 4);
                if (U == -1) {
                    U = length;
                }
                while (true) {
                    min = Math.min(U, i11 + 4000);
                    String substring = message.substring(i11, min);
                    kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, str, substring);
                    if (min >= U) {
                        break;
                    }
                    i11 = min;
                }
                i11 = min + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
