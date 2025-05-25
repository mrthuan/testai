package lib.zj.office.officereader;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import java.util.HashMap;
import lib.zj.office.officereader.beans.AImageButton;
import lib.zj.office.officereader.beans.AImageFindButton;
import lib.zj.office.officereader.beans.AToolsbar;
import lib.zj.office.system.f;
import lib.zj.office.system.p;
import pdf.pdfreader.viewer.editor.free.R;
import ph.a;

/* loaded from: classes3.dex */
public class FindToolBar extends AToolsbar {

    /* renamed from: h  reason: collision with root package name */
    public AImageFindButton f20876h;

    public FindToolBar(Context context, p pVar) {
        super(context, pVar);
        AImageButton a10 = a(R.drawable.file_left, R.drawable.file_left_disable, R.string.arg_res_0x7f13005d, 788529153, false);
        a10.getLayoutParams().width = this.f20897b / 2;
        a10.setEnabled(false);
        AImageButton a11 = a(R.drawable.file_right, R.drawable.file_right_disable, R.string.arg_res_0x7f130060, 788529154, false);
        a11.getLayoutParams().width = this.f20897b / 2;
        a11.setEnabled(false);
        Resources resources = getContext().getResources();
        Context context2 = getContext();
        f fVar = this.f20899e;
        String string = resources.getString(R.string.arg_res_0x7f13005f);
        int i10 = getResources().getDisplayMetrics().widthPixels;
        int i11 = this.f20897b;
        this.f20876h = new AImageFindButton(context2, fVar, string, i10 - ((i11 * 3) / 2), i11 / 2, this.c, new a(this));
        HashMap hashMap = this.f20901g;
        LinearLayout linearLayout = this.f20900f;
        hashMap.put(788529152, Integer.valueOf(linearLayout.getChildCount()));
        linearLayout.addView(this.f20876h);
    }

    @Override // lib.zj.office.officereader.beans.AToolsbar
    public final void d() {
        super.d();
        this.f20876h = null;
    }

    @Override // lib.zj.office.officereader.beans.AToolsbar, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f20876h.f20890b.getLayoutParams().width = getResources().getDisplayMetrics().widthPixels - ((this.f20897b * 3) / 2);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            ((InputMethodManager) getContext().getSystemService("input_method")).toggleSoftInput(0, 2);
            f(788529153, false);
            f(788529154, false);
            AImageFindButton aImageFindButton = this.f20876h;
            aImageFindButton.f20890b.setText("");
            aImageFindButton.c.setEnabled(false);
        }
    }
}
