package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;

/* compiled from: AskFeedDialog.kt */
/* loaded from: classes3.dex */
public final class c extends oo.g {
    public static final /* synthetic */ int A = 0;

    /* renamed from: y  reason: collision with root package name */
    public boolean f27508y;

    /* renamed from: z  reason: collision with root package name */
    public ro.a<Boolean> f27509z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context, (Object) null);
        kotlin.jvm.internal.g.e(context, ea.a.p("KW8KdC14dA==", "ZQJdHlsA"));
    }

    @Override // oo.g, android.app.Dialog
    public final void show() {
        super.show();
        pdf.pdfreader.viewer.editor.free.utils.q0.w(getContext(), "home_ask_feed_flag", true);
        tn.a.b(ReaderPdfApplication.m(), ea.a.p("LnNr", "tCKO3l2F"), ea.a.p("UnMgXwBoDXc=", "YaxGzfRg"));
        Context context = getContext();
        boolean z10 = eo.d.f16828a;
        long currentTimeMillis = System.currentTimeMillis();
        long e10 = eo.e.e(context);
        if (currentTimeMillis > e10) {
            eo.e.o(context, currentTimeMillis);
        } else {
            eo.e.o(context, e10 + 1);
        }
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_ask_feed;
    }

    @Override // oo.g
    public final void z() {
        ImageView imageView = (ImageView) findViewById(R.id.ivAskClose);
        if (imageView != null) {
            imageView.setOnClickListener(new d9.f(this, 21));
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.llAskLeft);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new qb.j0(this, 19));
        }
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.llAskRight);
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new f5.d(this, 21));
        }
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                String p10 = ea.a.p("R2gmc1Uw", "xq3OqUey");
                c cVar = c.this;
                kotlin.jvm.internal.g.e(cVar, p10);
                if (!cVar.f27508y) {
                    ro.a<Boolean> aVar = cVar.f27509z;
                    if (aVar != null) {
                        aVar.o(Boolean.FALSE);
                    }
                    tn.a.b(ReaderPdfApplication.m(), ea.a.p("UnNr", "cHtQ0u2f"), ea.a.p("UnMgXxBsDXMXX1dsAGNr", "s5ss00yP"));
                }
            }
        });
    }
}
