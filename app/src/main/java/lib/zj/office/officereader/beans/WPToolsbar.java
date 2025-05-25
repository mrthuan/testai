package lib.zj.office.officereader.beans;

import android.content.Context;
import lib.zj.office.system.p;
import lib.zj.office.wp.control.Word;
import pdf.pdfreader.viewer.editor.free.R;
import xh.b;

/* loaded from: classes3.dex */
public class WPToolsbar extends AToolsbar {
    public WPToolsbar(Context context, p pVar) {
        super(context, pVar);
        a(R.drawable.file_copy, R.drawable.file_copy_disable, R.string.arg_res_0x7f130151, 268435458, true);
        a(R.drawable.app_find, R.drawable.app_find_disable, R.string.arg_res_0x7f130069, 536870912, true);
        a(R.drawable.wp_switch_view, R.drawable.wp_switch_view_disable, R.string.arg_res_0x7f130593, 805306369, true);
        a(R.drawable.app_print_n, R.drawable.app_print_d, R.string.arg_res_0x7f130591, 805306375, true);
        a(R.drawable.file_share, R.drawable.file_share_disable, R.string.arg_res_0x7f130159, 536870913, true);
        a(R.drawable.app_internet_search, R.drawable.app_internet_search_disable, R.string.arg_res_0x7f13006c, 536870914, true);
        b(R.drawable.file_star_check, R.drawable.file_star_uncheck, R.drawable.file_star_disable, R.string.arg_res_0x7f130155, R.string.arg_res_0x7f13015b, 268435464);
        a(R.drawable.app_drawing, R.drawable.app_drawing_disable, R.string.arg_res_0x7f130066, 536870937, true);
    }

    @Override // lib.zj.office.officereader.beans.AToolsbar
    public final void d() {
        super.d();
    }

    @Override // lib.zj.office.officereader.beans.AToolsbar
    public final void g() {
        boolean z10;
        Word word = (Word) this.f20899e.getView();
        f(536870914, ((b) word.getHighlight()).c());
        f(268435458, ((b) word.getHighlight()).c());
        if (word.getCurrentRootType() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        f(536870937, z10);
    }
}
