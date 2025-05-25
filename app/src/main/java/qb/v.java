package qb;

import android.content.Context;
import com.inmobi.media.Rb;
import pdf.pdfreader.viewer.editor.free.repo.data.FileReadProgressChecker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29270a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f29271b;

    public /* synthetic */ v(Context context, int i10) {
        this.f29270a = i10;
        this.f29271b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29270a;
        Context context = this.f29271b;
        switch (i10) {
            case 0:
                Rb.d(context);
                return;
            default:
                tf.c cVar = FileReadProgressChecker.f26553a;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "aeQW2XaP"));
                FileReadProgressChecker.d(context);
                return;
        }
    }
}
