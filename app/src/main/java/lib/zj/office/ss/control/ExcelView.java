package lib.zj.office.ss.control;

import android.app.Activity;
import android.widget.RelativeLayout;
import ei.d;
import lib.zj.office.ss.sheetbar.SheetBar;
import lib.zj.office.system.f;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import rg.c;

/* loaded from: classes3.dex */
public class ExcelView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f20946a;

    /* renamed from: b  reason: collision with root package name */
    public final Spreadsheet f20947b;
    public SheetBar c;

    /* renamed from: d  reason: collision with root package name */
    public final f f20948d;

    public ExcelView(Activity activity, String str, d dVar, f fVar) {
        super(activity);
        this.f20946a = true;
        this.f20948d = fVar;
        t0.f28775h = (int) (activity.getResources().getDimensionPixelSize(R.dimen.sp_12) / activity.getResources().getDisplayMetrics().scaledDensity);
        t0.f28774g = activity.getResources().getDimensionPixelSize(R.dimen.dp_1);
        Spreadsheet spreadsheet = new Spreadsheet(activity, str, dVar, fVar, this);
        this.f20947b = spreadsheet;
        addView(spreadsheet, new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void a() {
        SheetBar sheetBar = this.c;
        if (c.c) {
            sheetBar.f20966e.setBackground(sheetBar.getResources().getDrawable(R.drawable.lib_wps_shape_sheet_bar_dark));
        } else {
            sheetBar.f20966e.setBackground(sheetBar.getResources().getDrawable(R.drawable.lib_wps_shape_sheet_bar));
        }
        sheetBar.a(sheetBar.c.getSheetIndex(), true);
        boolean z10 = c.c;
        Spreadsheet spreadsheet = this.f20947b;
        if (z10) {
            spreadsheet.setBackgroundColor(-16777216);
        } else {
            spreadsheet.setBackgroundColor(-1);
        }
    }

    public final void b(String str) {
        d dVar;
        ei.c p10;
        Spreadsheet spreadsheet = this.f20947b;
        String str2 = spreadsheet.f20954g;
        if ((str2 == null || !str2.equals(str)) && (p10 = (dVar = spreadsheet.f20957j).p(str)) != null) {
            spreadsheet.f20954g = str;
            spreadsheet.f20953f = dVar.r(p10);
            spreadsheet.i(p10);
        }
        ei.c p11 = spreadsheet.getWorkbook().p(str);
        if (p11 == null) {
            return;
        }
        int r4 = spreadsheet.getWorkbook().r(p11);
        if (this.f20946a) {
            this.c.a(r4, false);
        } else {
            this.f20948d.s().t(1073741828, Integer.valueOf(r4));
        }
    }

    public int getBottomBarHeight() {
        if (this.f20946a) {
            return this.c.getHeight();
        }
        return this.f20948d.s().V0();
    }

    public int getCurrentViewIndex() {
        return this.f20947b.getCurrentSheetNumber();
    }

    public oi.f getSheetView() {
        return this.f20947b.getSheetView();
    }

    public Spreadsheet getSpreadsheet() {
        return this.f20947b;
    }
}
