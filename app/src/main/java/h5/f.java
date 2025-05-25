package h5;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.activity.s;
import c6.h;
import com.facebook.appevents.ml.ModelManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import d7.a;
import h5.m;
import java.io.File;
import java.util.Date;
import jl.a;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.ads.a;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.vh.ImageAdjustPreviewViewHolder;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView;
import pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements m.a, h.a, a.InterfaceC0194a, Continuation, CropImageView.b, a.d, a.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18024a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f18025b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.f18024a = i10;
        this.f18025b = obj;
        this.c = obj2;
    }

    @Override // jl.a.d
    public final void B(boolean z10) {
        Word2PDFConvertActivity word2PDFConvertActivity = (Word2PDFConvertActivity) this.f18025b;
        Bundle bundle = (Bundle) this.c;
        Word2PDFConvertActivity.a aVar = Word2PDFConvertActivity.f26020p1;
        kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("O2hYc10w", "fnDMTdJO"));
        if (z10) {
            word2PDFConvertActivity.z2(bundle);
        } else {
            word2PDFConvertActivity.r2();
        }
    }

    @Override // c6.h.a
    public final void a(File file) {
        ModelManager.a slave = (ModelManager.a) this.f18025b;
        kotlin.jvm.internal.g.e(slave, "$slave");
        kotlin.jvm.internal.g.e(file, "file");
        slave.f9629g = (com.facebook.appevents.ml.a) this.c;
        slave.f9628f = file;
        Runnable runnable = slave.f9630h;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView.b
    public final void b() {
        ImageAdjustPreviewViewHolder imageAdjustPreviewViewHolder = (ImageAdjustPreviewViewHolder) this.f18025b;
        ul.b bVar = (ul.b) this.c;
        int i10 = ImageAdjustPreviewViewHolder.f25662f;
        kotlin.jvm.internal.g.e(imageAdjustPreviewViewHolder, ea.a.p("R2gic1cw", "0qYtEu4Q"));
        kotlin.jvm.internal.g.e(bVar, ea.a.p("F2kmYRRl", "4l1w85EV"));
        imageAdjustPreviewViewHolder.f25665e.a(bVar);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.e
    public final void d(Dialog dialog) {
        RecentAddedActivity recentAddedActivity = (RecentAddedActivity) this.f18025b;
        qo.g gVar = (qo.g) this.c;
        RecentAddedActivity.a aVar = RecentAddedActivity.f26850l0;
        kotlin.jvm.internal.g.e(recentAddedActivity, ea.a.p("O2hYc10w", "lCiNc2fi"));
        kotlin.jvm.internal.g.e(gVar, ea.a.p("aGU6ZSJ0", "LZLLLHDl"));
        ((Handler) recentAddedActivity.f26861j0.getValue()).postDelayed(new v4.a(7, recentAddedActivity, gVar, dialog), 800L);
    }

    @Override // h5.m.a
    public final void h(o9.a aVar) {
        int i10 = this.f18024a;
        Object obj = this.c;
        Object obj2 = this.f18025b;
        switch (i10) {
            case 0:
                w scope = (w) obj2;
                Context context = (Context) obj;
                kotlin.jvm.internal.g.e(scope, "$scope");
                kotlin.jvm.internal.g.e(context, "$context");
                if (aVar != null && s.s(aVar)) {
                    t0.d0(scope, null, null, new h(context, aVar.f22746a, null), 3);
                    return;
                }
                return;
            default:
                m mVar = (m) obj2;
                d5.a aVar2 = (d5.a) obj;
                mVar.f18038d = aVar;
                boolean z10 = false;
                mVar.f18041g = false;
                if (aVar2 != null) {
                    if (aVar != null) {
                        z10 = true;
                    }
                    aVar2.b(z10);
                    return;
                }
                return;
        }
    }

    @Override // d7.a.InterfaceC0194a
    public final Object l() {
        return Boolean.valueOf(((b7.e) this.f18025b).c.m0((v6.s) this.c));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        ConfigFetchHandler configFetchHandler = (ConfigFetchHandler) this.f18025b;
        Date date = (Date) this.c;
        int[] iArr = ConfigFetchHandler.f13694k;
        configFetchHandler.getClass();
        if (task.o()) {
            com.google.firebase.remoteconfig.internal.b bVar = configFetchHandler.f13701h;
            synchronized (bVar.f13724b) {
                bVar.f13723a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
        } else {
            Exception j10 = task.j();
            if (j10 != null) {
                if (j10 instanceof FirebaseRemoteConfigFetchThrottledException) {
                    configFetchHandler.f13701h.g();
                } else {
                    configFetchHandler.f13701h.f();
                }
            }
        }
        return task;
    }
}
