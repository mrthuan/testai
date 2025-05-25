package pdf.pdfreader.viewer.editor.free.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ea.a;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.repo.data.FileReadProgressChecker;

/* compiled from: TimeReceiver.kt */
/* loaded from: classes3.dex */
public final class TimeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && context != null) {
            if (g.a(a.p("Lm5VchZpUy4zbj5lG3RGYVZ0B28rLjFJe0UpUyFU", "bMVg6vdD"), intent.getAction()) || g.a(a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLhdJLEUfTwpFLEN7QQVHNkQ=", "aEDsGy7Y"), intent.getAction())) {
                pp.a.b(context);
                pp.a.c(context);
                FileReadProgressChecker.c(context);
            }
            if (g.a(a.p("VW4ccl1pFy4hbhJlWnR5YVt0O28nLmJJOUUuVBhDSw==", "7u4x2sz3"), intent.getAction()) || g.a(a.p("Cm4lcjVpDC4hbhJlWnR5YVt0O28nLnRBIFQ0UghfAUgqTgZFRA==", "WHkAZhCv"), intent.getAction())) {
                FileReadProgressChecker.c(context);
            }
        }
    }
}
