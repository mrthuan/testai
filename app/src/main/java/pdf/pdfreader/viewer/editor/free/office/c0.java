package pdf.pdfreader.viewer.editor.free.office;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: OfficeSearchTask.kt */
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f26073a;

    /* renamed from: b  reason: collision with root package name */
    public final tf.c f26074b;
    public final tf.c c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f26075d;

    /* renamed from: e  reason: collision with root package name */
    public final b1.e f26076e;

    /* renamed from: f  reason: collision with root package name */
    public final pdf.pdfreader.viewer.editor.free.feature.scan.ui.f f26077f;

    /* renamed from: g  reason: collision with root package name */
    public a0 f26078g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f26079h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f26080i;

    /* renamed from: j  reason: collision with root package name */
    public final long f26081j;

    /* renamed from: k  reason: collision with root package name */
    public final long f26082k;

    /* renamed from: l  reason: collision with root package name */
    public final AtomicLong f26083l;

    public c0(OfficeReaderActivity officeReaderActivity) {
        kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("Om8ldAJ4dA==", "yUYKgfW9"));
        this.f26073a = ea.a.p("AGZXaRplZGU7ciloIWEbaw==", "tcBWDZyT");
        this.f26074b = kotlin.a.a(new cg.a<ExecutorService>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeSearchTask$searchThread$2
            @Override // cg.a
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
        this.c = kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeSearchTask$mainHandler$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final Handler invoke() {
                return new Handler(Looper.getMainLooper());
            }
        });
        this.f26076e = new b1.e(this, 23);
        this.f26077f = new pdf.pdfreader.viewer.editor.free.feature.scan.ui.f(this, 2);
        this.f26081j = 200L;
        this.f26082k = 800L;
        this.f26083l = new AtomicLong(0L);
        Activity l10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.l(officeReaderActivity);
        if (l10 != null && (l10 instanceof androidx.appcompat.app.c)) {
            ((androidx.appcompat.app.c) l10).getLifecycle().a(new androidx.lifecycle.o() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeSearchTask$1$1
                @androidx.lifecycle.y(Lifecycle.Event.ON_DESTROY)
                public final void onDestroy() {
                    c0 c0Var = c0.this;
                    String str = c0Var.f26073a;
                    ea.a.p("K2VCdAtveQ==", "AjFy36pL");
                    ((Handler) c0Var.c.getValue()).removeCallbacksAndMessages(null);
                    c0Var.f26079h = true;
                }
            });
        }
    }

    public final void a(b0 b0Var, cg.a aVar) {
        this.f26075d = true;
        ((Handler) this.c.getValue()).postDelayed(this.f26076e, this.f26081j);
        this.f26080i = false;
        ((ExecutorService) this.f26074b.getValue()).execute(new androidx.emoji2.text.h(8, this, aVar, b0Var));
    }
}
