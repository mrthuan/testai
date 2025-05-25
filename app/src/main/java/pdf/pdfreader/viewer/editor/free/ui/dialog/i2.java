package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import pdf.pdfreader.viewer.editor.free.ui.dialog.j1;

/* compiled from: PdfShowSecondTipsDialog.java */
/* loaded from: classes3.dex */
public final class i2 {

    /* renamed from: a  reason: collision with root package name */
    public static j1 f27622a;

    public static void a() {
        try {
            j1 j1Var = f27622a;
            if (j1Var != null) {
                j1Var.dismiss();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void b(Context context, androidx.fragment.app.o0 o0Var, j1.c cVar) {
        try {
            a();
            j1 j1Var = new j1(context, o0Var, cVar);
            f27622a = j1Var;
            j1Var.show();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
