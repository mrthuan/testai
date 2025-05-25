package pdf.pdfreader.viewer.editor.free.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import ea.a;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.repo.data.FileReadProgressChecker;
import tf.c;

/* compiled from: NotFinishedReaderWorker.kt */
/* loaded from: classes3.dex */
public final class NotFinishedReaderWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotFinishedReaderWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        g.e(context, a.p("NG8FdFF4dA==", "76Wk4OHW"));
        g.e(workerParameters, a.p("RG85axZyMmEAYVlz", "5XBAbO7v"));
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        c cVar = FileReadProgressChecker.f26553a;
        Context applicationContext = getApplicationContext();
        g.d(applicationContext, a.p("UnA7bBpjA3Qbb1pDBm4iZTx0", "nLZxYQJa"));
        FileReadProgressChecker.a(applicationContext, true);
        ListenableWorker.a.c cVar2 = new ListenableWorker.a.c();
        a.p("O3U3YyxzCygp", "vYHTIxmE");
        return cVar2;
    }
}
