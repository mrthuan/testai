package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ScannerInfoDialog.kt */
/* loaded from: classes3.dex */
public final class ScannerInfoDialog extends oo.g {
    public static final /* synthetic */ int B = 0;
    public boolean A;

    /* renamed from: y  reason: collision with root package name */
    public ScannerType f27485y;

    /* renamed from: z  reason: collision with root package name */
    public ImageView f27486z;

    /* compiled from: ScannerInfoDialog.kt */
    /* loaded from: classes3.dex */
    public enum ScannerType {
        SCANNER,
        OCR
    }

    /* compiled from: ScannerInfoDialog.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27488a;

        static {
            int[] iArr = new int[ScannerType.values().length];
            try {
                iArr[ScannerType.SCANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScannerType.OCR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27488a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScannerInfoDialog(Context context, ScannerType scannerType) {
        super(context, (Object) null);
        ea.a.p("UG8ldBZ4dA==", "Q00YK1Kd");
        kotlin.jvm.internal.g.e(scannerType, ea.a.p("Ink_ZQ==", "9gVO4O1q"));
        this.f27485y = scannerType;
    }

    @Override // oo.g
    public final boolean A() {
        return true;
    }

    @Override // oo.g
    public final boolean B() {
        return true;
    }

    public final String H() {
        int i10 = a.f27488a[this.f27485y.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return ea.a.p("XGNy", "FEMYaYiC");
            }
            throw new NoWhenBranchMatchedException();
        }
        return ea.a.p("PGNQbhdlcg==", "kV6es2l3");
    }

    public final void I() {
        int i10;
        ImageView imageView = this.f27486z;
        if (imageView != null) {
            int i11 = a.f27488a[this.f27485y.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    i10 = R.drawable.img_to_text_cover;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i10 = R.drawable.scanner_to_pdf_cover;
            }
            imageView.setImageResource(i10);
        }
    }

    @Override // oo.g, android.app.Dialog
    public final void show() {
        super.show();
        this.A = false;
        tn.a.d(getContext(), ea.a.p("KHVYZGU=", "PAPvOrpp"), ea.a.p("Q2QtMhR1C2QXX0doBnc=", "PZBJm6D0"), H(), false);
        I();
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_scanner_info;
    }

    @Override // oo.g
    public final void z() {
        this.f27486z = (ImageView) findViewById(R.id.iv_cover);
        I();
        TextView textView = (TextView) findViewById(R.id.tv_open);
        if (textView != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.ScannerInfoDialog$initView$1
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                    invoke2(view);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    ScannerInfoDialog scannerInfoDialog = ScannerInfoDialog.this;
                    scannerInfoDialog.A = true;
                    boolean z10 = false;
                    tn.a.d(scannerInfoDialog.getContext(), ea.a.p("HXUYZGU=", "9mzqmHFj"), ea.a.p("Q2QtMhR1C2QXX1twDG4JYyhpUWs=", "Lxg0YIdv"), ScannerInfoDialog.this.H(), false);
                    Context context = it.getContext();
                    try {
                        Intent addFlags = new Intent(ea.a.p("KW4pcgxpLy4hbhJlWnR5YVt0O28nLmBJMVc=", "W7HMcKn7"), Uri.parse(ea.a.p("WnQEcDI6Xi84bAd5Gmc4b19sNy4qb1svB3QecjQvI3BCc19kJHQQaSRzWWlQPQ==", "Jc2pAqey").concat(ea.a.p("Q2QtcxBhDG4XchpzCmE4LjRkVC41YyJuK2UiLlZyEGUVci5mFnIQZQA9QXQEXyVvMXJRZWMzB3IgYTRlQjJQMgV1P20sbQdkG3VZJVpEIm8rbEFfNmEkZQ==", "EP0un3zL")))).addFlags(268435456);
                        try {
                            z10 = context.getPackageManager().getApplicationInfo(ea.a.p("UG8mLhJuBnIdaVAuH2U4ZC1uZw==", "ORAYkb5e"), 0).enabled;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        if (z10) {
                            addFlags.setPackage(ea.a.p("UG8mLhJuBnIdaVAuH2U4ZC1uZw==", "SUYAyZvP"));
                        }
                        context.startActivity(addFlags);
                    } catch (ActivityNotFoundException e10) {
                        e10.printStackTrace();
                    }
                    ScannerInfoDialog.this.dismiss();
                }
            });
        }
        TextView textView2 = (TextView) findViewById(R.id.tv_later);
        if (textView2 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.ScannerInfoDialog$initView$2
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                    invoke2(view);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    ScannerInfoDialog.this.dismiss();
                }
            });
        }
        setOnDismissListener(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.z(this, 2));
    }
}
