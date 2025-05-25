package lib.zj.office.officereader.beans;

import android.content.Context;
import android.util.AttributeSet;
import ei.a;
import ei.c;
import ei.d;
import lib.zj.office.ss.control.ExcelView;
import lib.zj.office.ss.control.Spreadsheet;
import lib.zj.office.system.p;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class SSToolsbar extends AToolsbar {
    public SSToolsbar(Context context, p pVar) {
        super(context, pVar);
        a(R.drawable.file_copy, R.drawable.file_copy_disable, R.string.arg_res_0x7f130151, 268435458, true);
        a(R.drawable.app_internet_hyperlink, R.drawable.app_internet_hyperlink_disable, R.string.arg_res_0x7f13006b, 536870920, true);
        a(R.drawable.app_find, R.drawable.app_find_disable, R.string.arg_res_0x7f130069, 536870912, true);
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
        a aVar;
        boolean z10;
        boolean z11;
        Spreadsheet spreadsheet = ((ExcelView) this.f20899e.getView()).getSpreadsheet();
        if (spreadsheet.getSheetView() == null) {
            return;
        }
        boolean z12 = true;
        f(536870912, true);
        f(536870913, true);
        f(15, true);
        c cVar = spreadsheet.getSheetView().f23076b;
        if (cVar.f16610k == 0 && (aVar = cVar.f16613n) != null) {
            mi.a aVar2 = mi.a.f22038b;
            d dVar = cVar.f16601a;
            aVar2.getClass();
            String f10 = mi.a.f(dVar, aVar);
            if (f10 != null && f10.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            f(268435458, z10);
            if (f10 != null && f10.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            f(536870914, z11);
            if (cVar.f16613n.e() == null || cVar.f16613n.e().f18492b == null) {
                z12 = false;
            }
            f(536870920, z12);
        } else {
            f(268435458, false);
            f(536870920, false);
            f(536870914, false);
        }
        postInvalidate();
    }

    public SSToolsbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
