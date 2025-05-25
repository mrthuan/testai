package pdf.pdfreader.viewer.editor.free.office;

import android.widget.ImageView;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;
import pdf.pdfreader.viewer.editor.free.utils.event.ConvertEventCenter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26115a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Word2PDFConvertActivity f26116b;

    public /* synthetic */ k0(Word2PDFConvertActivity word2PDFConvertActivity, int i10) {
        this.f26115a = i10;
        this.f26116b = word2PDFConvertActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26115a;
        Word2PDFConvertActivity word2PDFConvertActivity = this.f26116b;
        switch (i10) {
            case 0:
                Word2PDFConvertActivity.a aVar = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("HmgZc00w", "qxjpivJO"));
                word2PDFConvertActivity.init();
                return;
            default:
                Word2PDFConvertActivity.a aVar2 = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("R2gic1cw", "rYqt49Sl"));
                tn.a.d(word2PDFConvertActivity, ea.a.p("LG9fdhxydA==", "2u8pCVwM"), ea.a.p("P3dSbxd2UnIuXyZvFGQBbmc=", "AcANo2gV"), androidx.activity.f.m(word2PDFConvertActivity.t2(), "_", ConvertEventCenter.f28653a), false);
                ImageView imageView = word2PDFConvertActivity.P;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    ProgressView progressView = word2PDFConvertActivity.Q;
                    if (progressView != null) {
                        progressView.setVisibility(0);
                        return;
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("NG89ZABQKWYYcglnRmUkcw==", "89CO2MDD"));
                        throw null;
                    }
                }
                kotlin.jvm.internal.g.i(ea.a.p("Hm8xZHBQU2YYcglJdg==", "vTiCB7do"));
                throw null;
        }
    }
}
