package pdf.pdfreader.viewer.editor.free.office;

import android.content.DialogInterface;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26099a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Word2PDFConvertActivity f26100b;

    public /* synthetic */ f0(Word2PDFConvertActivity word2PDFConvertActivity, int i10) {
        this.f26099a = i10;
        this.f26100b = word2PDFConvertActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f26099a;
        Word2PDFConvertActivity word2PDFConvertActivity = this.f26100b;
        switch (i10) {
            case 0:
                Word2PDFConvertActivity.a aVar = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("O2hYc10w", "y6f1TNLP"));
                word2PDFConvertActivity.u2().postDelayed(new e0(word2PDFConvertActivity, 2), 150L);
                return;
            default:
                Word2PDFConvertActivity.a aVar2 = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("R2gic1cw", "2Hma69sz"));
                word2PDFConvertActivity.u2().postDelayed(new j0(word2PDFConvertActivity, 1), 150L);
                return;
        }
    }
}
