package u1;

import android.content.Context;
import com.inmobi.media.C1829u9;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.repo.data.FileReadProgressChecker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30130a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f30131b;

    public /* synthetic */ c(Context context, int i10) {
        this.f30130a = i10;
        this.f30131b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f30130a;
        Context context = this.f30131b;
        switch (i10) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new d(context, 0));
                return;
            case 1:
                C1829u9.a(context);
                return;
            default:
                tf.c cVar = FileReadProgressChecker.f26553a;
                g.e(context, ea.a.p("a2Nebg1lT3Q=", "FM1V3Ojh"));
                FileReadProgressChecker.a(context, false);
                return;
        }
    }
}
