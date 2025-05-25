package pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui;

import android.content.DialogInterface;
import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.feature.scan.dialog.ChooseCropTypeDialog;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25534a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f25535b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f25534a = i10;
        this.f25535b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String p10;
        String concat;
        String p11;
        int i10 = this.f25534a;
        Object obj = this.f25535b;
        switch (i10) {
            case 0:
                BasePdf2ImageActivity basePdf2ImageActivity = (BasePdf2ImageActivity) obj;
                kotlin.jvm.internal.g.e(basePdf2ImageActivity, ea.a.p("R2gic1cw", "p0puKVH3"));
                cn.b bVar = basePdf2ImageActivity.O;
                if (bVar != null) {
                    bVar.f5726f.set(false);
                    return;
                }
                return;
            case 1:
                ChooseCropTypeDialog chooseCropTypeDialog = (ChooseCropTypeDialog) obj;
                int i11 = ChooseCropTypeDialog.E;
                kotlin.jvm.internal.g.e(chooseCropTypeDialog, ea.a.p("R2gic1cw", "SD15PjWE"));
                if (chooseCropTypeDialog.D && !TextUtils.equals(ea.a.p("V2UpdWc=", "4waWTxPn"), chooseCropTypeDialog.f25677y)) {
                    if (chooseCropTypeDialog.B == 0) {
                        if (chooseCropTypeDialog.C) {
                            p11 = ea.a.p("WQ==", "TByymoN9");
                        } else {
                            p11 = ea.a.p("Tg==", "DEGnSRAy");
                        }
                        concat = "manual_".concat(p11);
                    } else {
                        if (chooseCropTypeDialog.C) {
                            p10 = ea.a.p("WQ==", "QVpGijqX");
                        } else {
                            p10 = ea.a.p("Tg==", "VBuPMsqn");
                        }
                        concat = "auto_".concat(p10);
                    }
                    tn.a.d(chooseCropTypeDialog.getContext(), ea.a.p("Q2EsZSxhBmoHc3Q=", "e88fHtST"), ea.a.p("UHIkcBJzCV8Rb1p0AG4jZRtjXmklaw==", "aPNUmUOt"), concat, false);
                }
                cg.l<? super Boolean, tf.d> lVar = chooseCropTypeDialog.f25678z;
                if (lVar != null) {
                    lVar.invoke(Boolean.valueOf(chooseCropTypeDialog.D));
                    return;
                }
                return;
            default:
                ReaderPreviewActivity readerPreviewActivity = (ReaderPreviewActivity) obj;
                ExecutorService executorService = ReaderPreviewActivity.U5;
                readerPreviewActivity.H3();
                readerPreviewActivity.f26199j1 = null;
                return;
        }
    }
}
