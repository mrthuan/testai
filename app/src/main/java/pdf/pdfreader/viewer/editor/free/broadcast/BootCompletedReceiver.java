package pdf.pdfreader.viewer.editor.free.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import yn.d;

/* compiled from: BootCompletedReceiver.kt */
/* loaded from: classes3.dex */
public final class BootCompletedReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f24066a = new AtomicBoolean(false);

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Context m10;
        AtomicBoolean atomicBoolean = this.f24066a;
        if (atomicBoolean.get() || (m10 = ReaderPdfApplication.m()) == null) {
            return;
        }
        try {
            d.c(m10);
            atomicBoolean.set(true);
        } catch (Exception unused) {
        }
    }
}
