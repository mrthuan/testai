package pdf.pdfreader.viewer.editor.free.ui.widget.act;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: BasePdfEditActivity.kt */
/* loaded from: classes3.dex */
public abstract class BasePdfEditActivity extends jl.a {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f28296v = 0;

    /* renamed from: t  reason: collision with root package name */
    public final tf.c f28297t = kotlin.a.a(new cg.a<pdf.pdfreader.viewer.editor.free.ui.dialog.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.act.BasePdfEditActivity$progressDialog$2
        {
            super(0);
        }

        @Override // cg.a
        public final pdf.pdfreader.viewer.editor.free.ui.dialog.d invoke() {
            pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.d(BasePdfEditActivity.this, false);
            dVar.a(R.string.arg_res_0x7f1303a6);
            return dVar;
        }
    });

    /* renamed from: u  reason: collision with root package name */
    public final Handler f28298u = new Handler(Looper.getMainLooper());

    public abstract void a2(List<? extends PdfPreviewEntity> list);
}
