package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderRoundProgressBar;

/* compiled from: NormalProgressDialog.kt */
/* loaded from: classes3.dex */
public final class y extends oo.i {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f27800a;

    /* renamed from: b  reason: collision with root package name */
    public final cg.p<Integer, Integer, String> f27801b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f27802d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f27803e;

    /* renamed from: f  reason: collision with root package name */
    public ReaderRoundProgressBar f27804f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f27805g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(Context context, boolean z10, cg.p<? super Integer, ? super Integer, String> pVar, boolean z11, boolean z12, boolean z13) {
        super(context, R.style.Centerdialog);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "01bLodrW"));
        ea.a.p("O2lFbBxNVms_cg==", "d36mjIJj");
        this.f27800a = z10;
        this.f27801b = pVar;
        this.c = z11;
        this.f27802d = z12;
        this.f27803e = z13;
    }

    public final void c(int i10, int i11) {
        if (isShowing()) {
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            ReaderRoundProgressBar readerRoundProgressBar = this.f27804f;
            if (readerRoundProgressBar != null) {
                readerRoundProgressBar.setMax(i11);
            }
            ReaderRoundProgressBar readerRoundProgressBar2 = this.f27804f;
            if (readerRoundProgressBar2 != null) {
                readerRoundProgressBar2.setProgress(i10);
            }
            TextView textView = this.f27805g;
            if (textView != null) {
                textView.setText(this.f27801b.invoke(Integer.valueOf(i10), Integer.valueOf(i11)));
            }
        }
    }

    public final void d(int i10, int i11) {
        try {
            show();
            ReaderRoundProgressBar readerRoundProgressBar = this.f27804f;
            if (readerRoundProgressBar != null) {
                readerRoundProgressBar.setMax(i11);
            }
            ReaderRoundProgressBar readerRoundProgressBar2 = this.f27804f;
            if (readerRoundProgressBar2 != null) {
                readerRoundProgressBar2.setProgress(i10);
            }
            TextView textView = this.f27805g;
            if (textView != null) {
                textView.setText(this.f27801b.invoke(Integer.valueOf(i10), Integer.valueOf(i11)));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.layout_horizontal_progress_dialog);
        setCancelable(this.c);
        setCanceledOnTouchOutside(this.f27802d);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -2;
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        this.f27804f = (ReaderRoundProgressBar) findViewById(R.id.progressbar);
        this.f27805g = (TextView) findViewById(R.id.tv_desc);
        ReaderRoundProgressBar readerRoundProgressBar = this.f27804f;
        if (readerRoundProgressBar != null) {
            readerRoundProgressBar.setShowWhiteDot(this.f27803e);
        }
        ReaderRoundProgressBar readerRoundProgressBar2 = this.f27804f;
        if (readerRoundProgressBar2 != null) {
            readerRoundProgressBar2.setMax(100);
        }
        ReaderRoundProgressBar readerRoundProgressBar3 = this.f27804f;
        if (readerRoundProgressBar3 != null) {
            readerRoundProgressBar3.setProgress(0);
        }
        TextView textView = this.f27805g;
        if (textView != null) {
            textView.setText(this.f27801b.invoke(0, 100));
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        if (this.f27800a) {
            a();
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        try {
            if (this.f27800a) {
                if (Build.VERSION.SDK_INT > 29) {
                    super.show();
                } else {
                    Window window = getWindow();
                    window.setFlags(8, 8);
                    super.show();
                    oo.i.b(window);
                    window.clearFlags(8);
                }
            } else {
                super.show();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public /* synthetic */ y(jl.a aVar, cg.p pVar) {
        this(aVar, pVar, false, false, true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(Context context, cg.p<? super Integer, ? super Integer, String> pVar, boolean z10, boolean z11, boolean z12) {
        this(context, true, pVar, z10, z11, z12);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "PvNPaFOi"));
        ea.a.p("O2lFbBxNVms_cg==", "iZYlL6XA");
    }
}
