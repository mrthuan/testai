package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;

/* compiled from: SaveEditDialog.java */
/* loaded from: classes3.dex */
public final class x2 extends oo.g implements View.OnClickListener {
    public TextView A;
    public ImageView B;
    public boolean C;
    public final String D;
    public final boolean E;
    public ImageView F;
    public final String G;
    public final String H;
    public final a I;
    public boolean J;
    public volatile long K;

    /* renamed from: y */
    public FrameLayout f27797y;

    /* renamed from: z */
    public LinearLayout f27798z;

    /* compiled from: SaveEditDialog.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
            x2.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            x2.this.K = System.currentTimeMillis();
            FrameLayout frameLayout = x2.this.f27797y;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                x2.this.f27798z.setVisibility(4);
            }
        }
    }

    public x2(Context context, String str, String str2, String str3, boolean z10) {
        this(context, str, z10);
        this.G = str3;
        this.H = str2;
    }

    @Override // oo.g
    public final boolean B() {
        return true;
    }

    @Override // oo.g
    public final void G() {
        FrameLayout frameLayout = this.f27797y;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
            this.f27798z.setVisibility(0);
            this.A.setVisibility(0);
            this.A.setEnabled(true);
            this.f27798z.setEnabled(true);
        }
    }

    public final String I() {
        String p10 = ea.a.p("KmRYdA==", "KDKhw8bD");
        String str = this.D;
        if (str.startsWith(p10)) {
            return ea.a.p("VmQidANkZg==", "ruOUk56f");
        }
        return str;
    }

    public final void J() {
        if (this.J) {
            this.J = false;
            if (BillingConfigImpl.c.w()) {
                this.K = 0L;
                this.B.setEnabled(false);
                this.A.setEnabled(false);
                this.f27798z.setEnabled(false);
                this.f27798z.postDelayed(this.I, 200L);
                oo.a aVar = this.f23542t;
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    @Override // oo.g, l.p, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.K > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.K;
            if (currentTimeMillis < 200) {
                this.f27798z.postDelayed(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.f(this, 9), 200 - currentTimeMillis);
                return;
            } else {
                super.dismiss();
                return;
            }
        }
        this.f27798z.removeCallbacks(this.I);
        super.dismiss();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.tv_ok) {
            if (!TextUtils.isEmpty(this.D)) {
                Context context = getContext();
                String p10 = ea.a.p("VmQidCxzA3Zl", "AzFu50xi");
                String p11 = ea.a.p("VmQidABhFGUtc1V2DF81bC1jaw==", "9SHXjVOD");
                tn.a.d(context, p10, p11, I() + ea.a.p("EHRedBhs", "DJ1z8ifl"), false);
                Context context2 = getContext();
                String p12 = ea.a.p("MmQFdCxzOXZl", "hTWlsXh9");
                String p13 = ea.a.p("KmRYdAphQWUFcyt2EF8LbFxjaw==", "sU4LxYmV");
                tn.a.d(context2, p12, p13, I() + ea.a.p("EHNQdmU=", "cnWxC3kN"), false);
            }
            if (this.C) {
                dismiss();
            } else if (this.E && !BillingConfigImpl.c.w()) {
                this.J = true;
                BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
                Context context3 = getContext();
                String str = this.D;
                aVar.getClass();
                BaseSubscriptionActivity.a.a(context3, str);
            } else {
                this.K = 0L;
                this.B.setEnabled(false);
                this.A.setEnabled(false);
                this.f27798z.setEnabled(false);
                this.f27798z.postDelayed(this.I, 200L);
                oo.a aVar2 = this.f23542t;
                if (aVar2 != null) {
                    aVar2.a();
                }
            }
        } else if (view.getId() == R.id.tv_cancel) {
            if (this.C) {
                dismiss();
                return;
            }
            oo.a aVar3 = this.f23542t;
            if (aVar3 != null) {
                aVar3.cancel();
            }
            if (!TextUtils.isEmpty(this.D)) {
                Context context4 = getContext();
                String p14 = ea.a.p("VmQidCxzA3Zl", "xkmkS1Ka");
                String p15 = ea.a.p("VmQidABhFGUtZF1hCmEkZBtjXmklaw==", "s85HzzSx");
                tn.a.d(context4, p14, p15, I() + ea.a.p("F3QJdBRs", "wWHfuBVp"), false);
                Context context5 = getContext();
                String p16 = ea.a.p("VmQidCxzA3Zl", "SBxmhsr6");
                String p17 = ea.a.p("KmRYdAphQWUFZCNhFmEaZGpjAmkmaw==", "GwhoPTbi");
                tn.a.d(context5, p16, p17, I() + ea.a.p("EHNQdmU=", "tCfRhJho"), false);
            }
        } else if (view.getId() == R.id.iv_close) {
            if (this.C) {
                dismiss();
                return;
            }
            if (!TextUtils.isEmpty(this.D)) {
                Context context6 = getContext();
                String p18 = ea.a.p("VmQidCxzA3Zl", "QCcSZqss");
                String p19 = ea.a.p("KmRYdAphQWUFYyZvBmU3Y1lpDWs=", "z2poRN1t");
                tn.a.d(context6, p18, p19, I() + ea.a.p("bHQkdBJs", "GzaP5opI"), false);
                Context context7 = getContext();
                String p20 = ea.a.p("LWQ8dB1zNnZl", "ZEHUBWc6");
                String p21 = ea.a.p("VmQidABhFGUtY1hvGmUJYyhpUWs=", "FBoTO07s");
                tn.a.d(context7, p20, p21, I() + ea.a.p("LHMldmU=", "DYsDPmA9"), false);
            }
            dismiss();
        }
    }

    @Override // oo.g, android.app.Dialog
    public final void show() {
        super.show();
        if (!TextUtils.isEmpty(this.D)) {
            Context context = getContext();
            String p10 = ea.a.p("VmQidCxzA3Zl", "01avBf8l");
            String p11 = ea.a.p("DmQ8dDphPGUXcw5vdw==", "V7kUIJKU");
            tn.a.d(context, p10, p11, I() + ea.a.p("EHRedBhs", "d4hCEYpc"), false);
            Context context2 = getContext();
            String p12 = ea.a.p("VmQidCxzA3Zl", "DWdOXVCa");
            String p13 = ea.a.p("KmRYdAphQWUFcyJvdw==", "noNVmbFD");
            tn.a.d(context2, p12, p13, I() + ea.a.p("EHNQdmU=", "Xv8Q3Cev"), false);
        }
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_save_edit;
    }

    @Override // oo.g
    public final void z() {
        View x4 = x();
        this.A = (TextView) x4.findViewById(R.id.tv_cancel);
        this.f27798z = (LinearLayout) x4.findViewById(R.id.tv_ok);
        this.F = (ImageView) x4.findViewById(R.id.iv_save_pro);
        ProgressView progressView = (ProgressView) x4.findViewById(R.id.save_anim);
        this.f27797y = (FrameLayout) x4.findViewById(R.id.animFl);
        this.B = (ImageView) findViewById(R.id.iv_close);
        TextView textView = (TextView) findViewById(R.id.tv_desc);
        this.f27797y.setVisibility(4);
        if (textView != null) {
            String str = this.G;
            if (TextUtils.isEmpty(str)) {
                textView.setText(R.string.arg_res_0x7f130387);
            } else {
                textView.setText(str);
            }
        }
        if (this.A != null) {
            String str2 = this.H;
            if (TextUtils.isEmpty(str2)) {
                this.A.setText(R.string.arg_res_0x7f130384);
            } else {
                this.A.setText(str2);
            }
            this.A.setOnClickListener(this);
        }
        this.f27798z.setOnClickListener(this);
        this.B.setOnClickListener(this);
        setOnKeyListener(new w2());
        if (this.E && !BillingConfigImpl.c.w()) {
            this.F.setVisibility(0);
        }
    }

    public x2(Context context, String str, boolean z10) {
        super(context);
        this.C = false;
        this.G = "";
        this.H = "";
        this.I = new a();
        this.K = 0L;
        this.D = str;
        this.E = z10;
    }
}
