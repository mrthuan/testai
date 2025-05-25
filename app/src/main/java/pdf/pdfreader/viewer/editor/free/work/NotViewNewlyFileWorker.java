package pdf.pdfreader.viewer.editor.free.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import ea.a;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.repo.data.FileReadProgressChecker;
import tf.c;

/* compiled from: NotViewNewlyFileWorker.kt */
/* loaded from: classes3.dex */
public final class NotViewNewlyFileWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotViewNewlyFileWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        g.e(context, a.p("CW8pdFx4dA==", "GcjG9vHq"));
        g.e(workerParameters, a.p("D28Vaz1yFGE6YQtz", "MKxgXDw9"));
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        c cVar = FileReadProgressChecker.f26553a;
        Context applicationContext = getApplicationContext();
        g.d(applicationContext, a.p("J3AAbFBjUnQhbwhDW24jZUB0", "RmFp93vT"));
        FileReadProgressChecker.b(applicationContext, true);
        ListenableWorker.a.c cVar2 = new ListenableWorker.a.c();
        a.p("PHVSYxxzRCgp", "p2dcxG36");
        return cVar2;
    }
}
