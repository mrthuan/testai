package qb;

import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import com.inmobi.media.C1761p5;
import com.inmobi.media.C1834v1;
import pdf.pdfreader.viewer.editor.free.ui.dialog.CreatePDFDialog;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29146a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f29147b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a1(Object obj, int i10, int i11) {
        this.f29146a = i11;
        this.c = obj;
        this.f29147b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29146a;
        int i11 = this.f29147b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                C1761p5.a((C1761p5) obj, i11);
                return;
            case 1:
                C1834v1.a((C1834v1) obj, i11);
                return;
            default:
                CreatePDFDialog createPDFDialog = (CreatePDFDialog) obj;
                int i12 = CreatePDFDialog.E;
                kotlin.jvm.internal.g.e(createPDFDialog, ea.a.p("R2gic1cw", "PbPYcpxS"));
                pdf.pdfreader.viewer.editor.free.ui.adapter.g gVar = createPDFDialog.A;
                if (gVar != null) {
                    gVar.notifyDataSetChanged();
                }
                if (i11 == NativeSoLoaderHelper.f1936e && createPDFDialog.B) {
                    createPDFDialog.H(280, null);
                    createPDFDialog.dismiss();
                    return;
                }
                return;
        }
    }
}
