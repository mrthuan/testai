package pdf.pdfreader.viewer.editor.free.service;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.UUID;
import kotlin.jvm.internal.g;
import no.f;
import pdf.pdfreader.viewer.editor.free.utils.d1;

/* compiled from: RecallWork.kt */
/* loaded from: classes3.dex */
public final class RecallWork extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecallWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        g.e(context, ea.a.p("LnBBbBBjVnQzbyRDGm4cZU10", "ChUgKAv2"));
        g.e(workerParameters, ea.a.p("A28cawZyPmE6YQtlQGUlcw==", "v7tncnsC"));
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        UUID id2 = getId();
        b bVar = b.f26559a;
        bVar.getClass();
        if (g.a(id2, b.f26565h)) {
            bVar.getClass();
            b.f26565h = null;
            f b10 = f.b(getApplicationContext());
            Context applicationContext = getApplicationContext();
            b10.getClass();
            d1.b(applicationContext).c(ea.a.p("OnNUciZsVm49dStnEF8aZVZhAmwabgp0J2YjYxJ0EW8hX0JoFnc=", "lecDNJsx"), false);
            Context applicationContext2 = getApplicationContext();
            g.d(applicationContext2, ea.a.p("UnA7bBpjA3Qbb1pDBm4iZTx0", "ESmcW0pf"));
            bVar.h(applicationContext2, false, 1);
        }
        ListenableWorker.a.c cVar = new ListenableWorker.a.c();
        ea.a.p("H3UxY1xzMigp", "bBlR9ApN");
        return cVar;
    }
}
