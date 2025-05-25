package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ImgOrScan2pdfGuideDialog.java */
/* loaded from: classes3.dex */
public final class t extends oo.g implements View.OnClickListener {
    public boolean A;
    public final String B;

    /* renamed from: y  reason: collision with root package name */
    public TextView f27751y;

    /* renamed from: z  reason: collision with root package name */
    public TextView f27752z;

    /* compiled from: ImgOrScan2pdfGuideDialog.java */
    /* loaded from: classes3.dex */
    public class a implements DialogInterface.OnShowListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public final void onShow(DialogInterface dialogInterface) {
            tn.a.b(t.this.getContext(), ea.a.p("KnUDZGU=", "pOMje1lH"), ea.a.p("X203czdhOHIvdQ9kUV8kaFd3", "OD6PTVC7"));
        }
    }

    /* compiled from: ImgOrScan2pdfGuideDialog.java */
    /* loaded from: classes3.dex */
    public class b implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f27754a;

        public b(LottieAnimationView lottieAnimationView) {
            this.f27754a = lottieAnimationView;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            t tVar = t.this;
            tVar.getClass();
            this.f27754a.d();
            if (tVar.A) {
                tn.a.b(tVar.getContext(), ea.a.p("VHUiZGU=", "BW3xz5Zd"), ea.a.p("Wm0scxBhDHIVdV1kDF8icj1fUWwvY2s=", "f1SDUCoB"));
            } else {
                tn.a.b(tVar.getContext(), ea.a.p("KHVYZGU=", "NYyXLBuB"), ea.a.p("Jm1WcxphWXI9dSNkEF8EYUFlHF8mbAxjaw==", "AvAIiLwr"));
            }
        }
    }

    public t(Context context) {
        super(context);
        this.A = false;
        this.B = " ";
    }

    @Override // oo.g
    public final boolean B() {
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.f27751y) {
            this.A = true;
            cancel();
        } else if (view == this.f27752z) {
            cancel();
        }
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_img_or_scan_pdf;
    }

    @Override // oo.g
    public final void z() {
        this.f27751y = (TextView) x().findViewById(R.id.tv_ok);
        this.f27752z = (TextView) x().findViewById(R.id.tv_later);
        TextView textView = (TextView) x().findViewById(R.id.tv_title);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) x().findViewById(R.id.iv_app_widget);
        SpannableString spannableString = new SpannableString(getContext().getResources().getString(R.string.arg_res_0x7f13059e, getContext().getResources().getString(R.string.arg_res_0x7f13019b), getContext().getResources().getString(R.string.arg_res_0x7f13030c)) + "  ");
        String spannableString2 = spannableString.toString();
        String str = this.B;
        try {
            if (getContext() != null) {
                String str2 = spannableString2 + str;
                Drawable a10 = m.a.a(getContext(), R.drawable.ic_flower_tube);
                int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.dp_22);
                if (a10 != null) {
                    a10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    ImageSpan imageSpan = new ImageSpan(a10);
                    int length = (str2.length() - str.length()) - 1;
                    spannableString.setSpan(imageSpan, length, length + 1, 17);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        textView.setText(spannableString);
        this.f27751y.setOnClickListener(this);
        this.f27752z.setOnClickListener(this);
        setOnShowListener(new a());
        setOnCancelListener(new b(lottieAnimationView));
    }
}
