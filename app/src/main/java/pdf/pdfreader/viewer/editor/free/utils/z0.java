package pdf.pdfreader.viewer.editor.free.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.utils.a1;

/* compiled from: ReaderPermissionChecker.java */
/* loaded from: classes3.dex */
public final class z0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f28805a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a1 f28806b;

    public z0(a1 a1Var, Activity activity) {
        this.f28806b = a1Var;
        this.f28805a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a1 a1Var = this.f28806b;
        Activity activity = this.f28805a;
        try {
            b1 a10 = b1.a();
            Intent intent = activity.getIntent();
            a10.getClass();
            Uri b10 = b1.b(intent);
            Intent intent2 = new Intent(activity, a1Var.f28539e);
            if (b10 != null) {
                intent2.setFlags(1);
                intent2.setAction(ea.a.p("Bm4CcjlpPC4hbhJlWnR5YVt0O28nLmBJMVc=", "xqgfVXcl"));
                intent2.setData(b10);
            }
            a1.c cVar = a1Var.f28537b;
            if (cVar != null) {
                ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = (ReaderImg2PDFChooseActivity) ((h5.a) cVar).f18008b;
                ReaderImg2PDFChooseActivity.a aVar = ReaderImg2PDFChooseActivity.M0;
                kotlin.jvm.internal.g.e(readerImg2PDFChooseActivity, ea.a.p("O2hYc10w", "APKIiR6z"));
                intent2.putExtra(ReaderImg2PDFChooseActivity.f27337j1, readerImg2PDFChooseActivity.f27365x0);
            }
            activity.startActivity(intent2);
        } catch (Throwable th2) {
            dp.a.a().getClass();
            dp.a.e(th2);
        }
        t1.b(ea.a.p("HWVQZBxyZ2UobSNzBmkHbnZoC2MuZRcgCW49ZTttOHM8aV5uPnJWbi5lLixVcxxhR3ROYSZ0DHYPdHk=", "6gi8fmIQ"));
    }
}
