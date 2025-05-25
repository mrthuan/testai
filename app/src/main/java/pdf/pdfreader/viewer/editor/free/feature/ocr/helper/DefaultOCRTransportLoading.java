package pdf.pdfreader.viewer.editor.free.feature.ocr.helper;

import android.content.Context;

/* compiled from: OCRTransportLoading.kt */
/* loaded from: classes3.dex */
public final class DefaultOCRTransportLoading implements i {

    /* renamed from: a  reason: collision with root package name */
    public final tf.c f25058a;

    public DefaultOCRTransportLoading(final Context context) {
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "apeweryC"));
        this.f25058a = kotlin.a.a(new cg.a<pdf.pdfreader.viewer.editor.free.feature.scan.dialog.l>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.helper.DefaultOCRTransportLoading$progressDialog$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cg.a
            public final pdf.pdfreader.viewer.editor.free.feature.scan.dialog.l invoke() {
                return new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.l(context, false, false);
            }
        });
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ocr.helper.i
    public final void cancel() {
        ((pdf.pdfreader.viewer.editor.free.feature.scan.dialog.l) this.f25058a.getValue()).cancel();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ocr.helper.i
    public final void show() {
        ((pdf.pdfreader.viewer.editor.free.feature.scan.dialog.l) this.f25058a.getValue()).show();
    }
}
