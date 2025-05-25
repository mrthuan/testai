package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.scan.dialog.m;

/* compiled from: ScanSettingActivity.kt */
/* loaded from: classes3.dex */
public final class n0 implements m.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScanSettingActivity f25837a;

    public n0(ScanSettingActivity scanSettingActivity) {
        this.f25837a = scanSettingActivity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.dialog.m.a
    public final void a(int i10) {
        String string;
        int i11 = ScanSettingActivity.f25783v;
        ScanSettingActivity scanSettingActivity = this.f25837a;
        TextView textView = scanSettingActivity.c2().f1425f;
        if (i10 != 1) {
            if (i10 != 2) {
                jn.a.c.getClass();
                jn.a.n(0);
                string = scanSettingActivity.getString(R.string.arg_res_0x7f130078);
            } else {
                jn.a.c.getClass();
                jn.a.o(2);
                jn.a.n(1);
                string = scanSettingActivity.getString(R.string.arg_res_0x7f1302c2);
            }
        } else {
            jn.a.c.getClass();
            jn.a.o(1);
            jn.a.n(1);
            string = scanSettingActivity.getString(R.string.arg_res_0x7f130080);
        }
        textView.setText(string);
    }
}
