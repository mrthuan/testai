package lib.zj.office.officereader.beans;

import android.content.Context;
import lib.zj.office.system.p;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class PDFToolsbar extends AToolsbar {
    public PDFToolsbar(Context context, p pVar) {
        super(context, pVar);
        a(R.drawable.app_find, R.drawable.app_find_disable, R.string.arg_res_0x7f130069, 536870912, true);
        a(R.drawable.file_share, R.drawable.file_share_disable, R.string.arg_res_0x7f130159, 536870913, true);
        b(R.drawable.file_star_check, R.drawable.file_star_uncheck, R.drawable.file_star_disable, R.string.arg_res_0x7f130155, R.string.arg_res_0x7f13015b, 268435464);
        a(R.drawable.app_drawing, R.drawable.app_drawing_disable, R.string.arg_res_0x7f130066, 536870937, true);
    }

    @Override // lib.zj.office.officereader.beans.AToolsbar
    public final void d() {
        super.d();
    }

    @Override // lib.zj.office.officereader.beans.AToolsbar
    public final void g() {
    }
}
