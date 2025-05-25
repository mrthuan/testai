package lib.zj.office.officereader.beans;

import android.content.Context;
import android.util.AttributeSet;
import lib.zj.office.system.p;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class CalloutToolsbar extends AToolsbar {
    public CalloutToolsbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CalloutToolsbar(Context context, p pVar) {
        super(context, pVar);
        a(R.drawable.app_back, R.drawable.app_back_disable, R.string.arg_res_0x7f130064, 536870938, true);
        b(R.drawable.app_pen_check, R.drawable.app_pen, R.drawable.app_pen, R.string.arg_res_0x7f13006e, R.string.arg_res_0x7f13006d, 536870939);
        b(R.drawable.app_eraser_check, R.drawable.app_eraser, R.drawable.app_eraser_disable, R.string.arg_res_0x7f130068, R.string.arg_res_0x7f130067, 536870940);
        a(R.drawable.app_color, R.drawable.app_color_disable, R.string.arg_res_0x7f130065, 536870941, true);
        this.f20900f.setBackgroundResource(R.drawable.sys_toolsbar_button_bg_normal);
    }
}
