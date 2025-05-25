package lib.zj.office.officereader.beans;

import android.content.Context;
import android.util.AttributeSet;
import lib.zj.office.pg.control.Presentation;
import lib.zj.office.system.p;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class PGToolsbar extends AToolsbar {
    public PGToolsbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // lib.zj.office.officereader.beans.AToolsbar
    public final void d() {
        super.d();
    }

    @Override // lib.zj.office.officereader.beans.AToolsbar
    public final void g() {
        Presentation presentation = (Presentation) this.f20899e.getView();
        if (presentation.getCurrentSlide() != null && presentation.getCurrentSlide().f30040g != null) {
            f(1342177280, true);
        } else {
            f(1342177280, false);
        }
        postInvalidate();
    }

    public PGToolsbar(Context context, p pVar) {
        super(context, pVar);
        a(R.drawable.file_slideshow, R.drawable.file_slideshow, R.string.arg_res_0x7f130344, 1358954497, true);
        a(R.drawable.app_find, R.drawable.app_find_disable, R.string.arg_res_0x7f130069, 536870912, true);
        a(R.drawable.ppt_node, R.drawable.ppt_node_disable, R.string.arg_res_0x7f130347, 1342177280, true);
        a(R.drawable.file_share, R.drawable.file_share_disable, R.string.arg_res_0x7f130159, 536870913, true);
        a(R.drawable.app_internet_search, R.drawable.app_internet_search_disable, R.string.arg_res_0x7f13006c, 536870914, true);
        b(R.drawable.file_star_check, R.drawable.file_star_uncheck, R.drawable.file_star_disable, R.string.arg_res_0x7f130155, R.string.arg_res_0x7f13015b, 268435464);
        a(R.drawable.app_drawing, R.drawable.app_drawing_disable, R.string.arg_res_0x7f130066, 536870937, true);
    }
}
