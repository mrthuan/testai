package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.text.TextUtils;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: SignSwitchDialog.java */
/* loaded from: classes3.dex */
public final class g3 extends oo.g {

    /* renamed from: y  reason: collision with root package name */
    public String f27599y;

    /* renamed from: z  reason: collision with root package name */
    public a f27600z;

    /* compiled from: SignSwitchDialog.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b();
    }

    @Override // oo.g
    public final boolean B() {
        return true;
    }

    public final String H() {
        return this.f27599y + ea.a.p("EHRedBhs", "vPoYnB6M");
    }

    public final String I() {
        return this.f27599y + ea.a.p("EHRQYg==", "gX4NJXGU");
    }

    @Override // oo.g, android.app.Dialog
    public final void show() {
        super.show();
        if (!TextUtils.isEmpty(this.f27599y)) {
            tn.a.d(getContext(), ea.a.p("A2QGdCZzBXZl", "VqfoydMp"), ea.a.p("FGQDdCZhRGUXcw5vdw==", "u1qjU28m"), H(), false);
            tn.a.d(getContext(), ea.a.p("KmRYdCZzVnZl", "MeTCp2nb"), ea.a.p("KmRYdAphQWUFcyJvdw==", "gcNPDYvR"), I(), false);
        }
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_save_sign;
    }

    @Override // oo.g
    public final void z() {
        View x4 = x();
        View findViewById = x4.findViewById(R.id.iv_close);
        View findViewById2 = x4.findViewById(R.id.operate_discard);
        x4.findViewById(R.id.ll_operate_save).setOnClickListener(new d3(this));
        findViewById.setOnClickListener(new e3(this));
        findViewById2.setOnClickListener(new f3(this));
    }
}
