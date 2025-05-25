package pdf.pdfreader.viewer.editor.free.utils;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: FileUtils.java */
/* loaded from: classes3.dex */
public final class s implements u0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ pdf.pdfreader.viewer.editor.free.ui.dialog.y[] f28756a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f28757b;
    public final /* synthetic */ Context c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String[] f28758d;

    /* compiled from: FileUtils.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            s sVar = s.this;
            sVar.f28758d[0] = sVar.f28757b.getString(R.string.arg_res_0x7f130363);
        }
    }

    public s(pdf.pdfreader.viewer.editor.free.ui.dialog.y[] yVarArr, jl.a aVar, Context context, String[] strArr) {
        this.f28756a = yVarArr;
        this.f28757b = aVar;
        this.c = context;
        this.f28758d = strArr;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.u0
    public final void a(File file) {
        pdf.pdfreader.viewer.editor.free.ui.dialog.y[] yVarArr = this.f28756a;
        pdf.pdfreader.viewer.editor.free.ui.dialog.y yVar = yVarArr[0];
        if (yVar != null && yVar.isShowing()) {
            yVar.cancel();
        }
        yVarArr[0] = null;
        v.F(this.f28757b, this.c, file);
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.u0
    public final void onProgress(int i10, int i11) {
        pdf.pdfreader.viewer.editor.free.ui.dialog.y yVar = this.f28756a[0];
        if (yVar != null && yVar.isShowing()) {
            yVar.c(i10, i11);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.u0
    public final void onStart() {
        Context context = this.f28757b;
        final String[] strArr = this.f28758d;
        pdf.pdfreader.viewer.editor.free.ui.dialog.y yVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.y(context, new cg.p() { // from class: pdf.pdfreader.viewer.editor.free.utils.r
            @Override // cg.p
            public final Object invoke(Object obj, Object obj2) {
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                String str = strArr[0];
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                return str;
            }
        }, false, false, false);
        yVar.show();
        this.f28756a[0] = yVar;
        w0.c cVar = w0.a().f28791b;
        cVar.f28792a.postDelayed(new a(), 10000L);
    }
}
