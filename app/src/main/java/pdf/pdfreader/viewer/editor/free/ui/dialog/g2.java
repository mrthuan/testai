package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Locale;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.ReaderEncryptionAndDecryptionHelper;

/* compiled from: PdfShowPwdDialog.java */
/* loaded from: classes3.dex */
public final class g2 extends oo.f implements xn.c {
    public static final /* synthetic */ int N = 0;
    public ObjectAnimator A;
    public ViewGroup B;
    public ViewGroup C;
    public ViewGroup D;
    public LottieAnimationView E;
    public final Handler F;
    public ProgressBar G;
    public final xn.c H;
    public long I;
    public int J;
    public ValueAnimator K;
    public boolean L;
    public boolean M;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f27578n;

    /* renamed from: o  reason: collision with root package name */
    public final PdfPreviewEntity f27579o;

    /* renamed from: p  reason: collision with root package name */
    public final f f27580p;

    /* renamed from: q  reason: collision with root package name */
    public AppCompatEditText f27581q;

    /* renamed from: r  reason: collision with root package name */
    public LinearLayout f27582r;

    /* renamed from: s  reason: collision with root package name */
    public TextView f27583s;

    /* renamed from: t  reason: collision with root package name */
    public TextView f27584t;

    /* renamed from: u  reason: collision with root package name */
    public TextView f27585u;

    /* renamed from: v  reason: collision with root package name */
    public TextView f27586v;

    /* renamed from: w  reason: collision with root package name */
    public TextView f27587w;

    /* renamed from: x  reason: collision with root package name */
    public TextView f27588x;

    /* renamed from: y  reason: collision with root package name */
    public ImageView f27589y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f27590z;

    /* compiled from: PdfShowPwdDialog.java */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AppCompatImageView f27591a;

        public a(AppCompatImageView appCompatImageView) {
            this.f27591a = appCompatImageView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            g2 g2Var = g2.this;
            boolean z10 = !g2Var.f27590z;
            g2Var.f27590z = z10;
            AppCompatImageView appCompatImageView = this.f27591a;
            if (z10) {
                g2Var.f27581q.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                appCompatImageView.setImageResource(R.drawable.ic_input_eye);
            } else {
                g2Var.f27581q.setTransformationMethod(PasswordTransformationMethod.getInstance());
                appCompatImageView.setImageResource(R.drawable.ic_input_eye_off);
            }
            Editable text = g2Var.f27581q.getText();
            if (text != null && !TextUtils.isEmpty(text.toString())) {
                g2Var.f27581q.setSelection(text.toString().length());
            }
        }
    }

    /* compiled from: PdfShowPwdDialog.java */
    /* loaded from: classes3.dex */
    public class b extends pdf.pdfreader.viewer.editor.free.utils.l0 {
        public b() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            g2.this.dismiss();
        }
    }

    /* compiled from: PdfShowPwdDialog.java */
    /* loaded from: classes3.dex */
    public class c extends pdf.pdfreader.viewer.editor.free.utils.l0 {

        /* compiled from: PdfShowPwdDialog.java */
        /* loaded from: classes3.dex */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f27595a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ String f27596b;

            public a(View view, String str) {
                this.f27595a = view;
                this.f27596b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                boolean z10 = g2.this.f27578n;
                g2 g2Var = g2.this;
                String str = this.f27596b;
                View view = this.f27595a;
                if (z10) {
                    ReaderEncryptionAndDecryptionHelper readerEncryptionAndDecryptionHelper = new ReaderEncryptionAndDecryptionHelper(view.getContext(), g2Var);
                    String path = g2Var.f27579o.getPath();
                    readerEncryptionAndDecryptionHelper.c = false;
                    readerEncryptionAndDecryptionHelper.a(path);
                    if (readerEncryptionAndDecryptionHelper.f24239f == null) {
                        try {
                            readerEncryptionAndDecryptionHelper.f24239f = new ReaderPDFCore(readerEncryptionAndDecryptionHelper.f24236b, path);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                    ReaderPDFCore readerPDFCore = readerEncryptionAndDecryptionHelper.f24239f;
                    if (readerPDFCore != null) {
                        boolean authenticatePassword = readerPDFCore.authenticatePassword(str);
                        Handler handler = readerEncryptionAndDecryptionHelper.f24240g;
                        if (authenticatePassword) {
                            if (readerEncryptionAndDecryptionHelper.f24237d != null) {
                                pdf.pdfreader.viewer.editor.free.utils.t1.b(ea.a.p("PHRQcg0gU2U5cjNwAVAMZhVwD3QtIAxzdzog", "tcZfWXgO") + path);
                                handler.post(new androidx.appcompat.widget.y0(readerEncryptionAndDecryptionHelper, 23));
                                System.currentTimeMillis();
                                ea.a.p("FWphZB9UWG82cw==", "gkMJypzy");
                                ea.a.p("V2UocgpwFiABdFVydA==", "T0OUasxE");
                                int createPdf = ReaderPDFCore.createPdf(path, readerEncryptionAndDecryptionHelper.f24237d.getAbsolutePath(), readerEncryptionAndDecryptionHelper.f24239f.getFormatPassword(str), false, readerEncryptionAndDecryptionHelper);
                                ea.a.p("MGo8ZBVUPm8kcw==", "A2jlsQH3");
                                ea.a.p("K2VScgBwQyA_bi4g", "xecrbegM");
                                System.currentTimeMillis();
                                if (createPdf > 0) {
                                    handler.post(new androidx.appcompat.widget.z0(readerEncryptionAndDecryptionHelper, 24));
                                    return;
                                } else {
                                    handler.post(new io.flutter.plugin.platform.c(readerEncryptionAndDecryptionHelper, createPdf, 1));
                                    return;
                                }
                            }
                            return;
                        }
                        handler.post(new pdf.pdfreader.viewer.editor.free.decrypt.g(readerEncryptionAndDecryptionHelper, 1));
                        return;
                    }
                    return;
                }
                ReaderEncryptionAndDecryptionHelper readerEncryptionAndDecryptionHelper2 = new ReaderEncryptionAndDecryptionHelper(view.getContext(), g2Var);
                String path2 = g2Var.f27579o.getPath();
                readerEncryptionAndDecryptionHelper2.c = true;
                readerEncryptionAndDecryptionHelper2.a(path2);
                if (readerEncryptionAndDecryptionHelper2.f24237d != null) {
                    pdf.pdfreader.viewer.editor.free.utils.t1.b(ea.a.p("QHQqcgcgB24Rck1wHWUyUCBmEnAndCsgDHN2OiA=", "eVeuaxkU") + path2);
                    Handler handler2 = readerEncryptionAndDecryptionHelper2.f24240g;
                    handler2.post(new androidx.activity.k(readerEncryptionAndDecryptionHelper2, 22));
                    System.currentTimeMillis();
                    ea.a.p("aWobZBVUDW8ecw==", "gbtiN7I5");
                    ea.a.p("Dm4ycgFwPCA7dAdydA==", "eYkQxHu4");
                    int createPdf2 = ReaderPDFCore.createPdf(path2, readerEncryptionAndDecryptionHelper2.f24237d.getAbsolutePath(), str, true, readerEncryptionAndDecryptionHelper2);
                    ea.a.p("aWobZBVUDW8ecw==", "y80pNs1Q");
                    ea.a.p("Vm4ocgpwFiAXblAg", "xrq8zeal");
                    System.currentTimeMillis();
                    if (createPdf2 > 0) {
                        handler2.post(new androidx.activity.b(readerEncryptionAndDecryptionHelper2, 27));
                    } else {
                        handler2.post(new qb.g1(readerEncryptionAndDecryptionHelper2, createPdf2, 2));
                    }
                }
            }
        }

        public c() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            AppCompatEditText appCompatEditText;
            String str;
            g2 g2Var = g2.this;
            if (g2Var.f27580p != null && (appCompatEditText = g2Var.f27581q) != null) {
                if (appCompatEditText.getText() != null) {
                    str = g2Var.f27581q.getText().toString();
                } else {
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    pdf.pdfreader.viewer.editor.free.utils.w0.a().f28790a.execute(new a(view, str));
                    g2Var.f27580p.c(g2Var.f27578n);
                    return;
                }
                g2Var.A();
                return;
            }
            g2Var.dismiss();
        }
    }

    /* compiled from: PdfShowPwdDialog.java */
    /* loaded from: classes3.dex */
    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                g2 g2Var = g2.this;
                g2Var.f27581q.setSelectAllOnFocus(true);
                g2Var.f27581q.selectAll();
                return false;
            }
            return false;
        }
    }

    /* compiled from: PdfShowPwdDialog.java */
    /* loaded from: classes3.dex */
    public class e implements TextView.OnEditorActionListener {
        public e() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (i10 == 6) {
                boolean isEmpty = TextUtils.isEmpty(textView.getText().toString());
                g2 g2Var = g2.this;
                if (!isEmpty) {
                    g2Var.f27580p.c(g2Var.f27578n);
                    return true;
                }
                g2Var.A();
                return true;
            }
            return false;
        }
    }

    /* compiled from: PdfShowPwdDialog.java */
    /* loaded from: classes3.dex */
    public interface f {
        void c(boolean z10);
    }

    public g2(Context context, boolean z10, PdfPreviewEntity pdfPreviewEntity, f fVar, xn.c cVar) {
        super(context);
        this.f27590z = false;
        this.F = new Handler();
        this.L = false;
        this.M = false;
        this.f27578n = z10;
        this.f27579o = pdfPreviewEntity;
        this.f27580p = fVar;
        this.H = cVar;
    }

    public final void A() {
        AppCompatEditText appCompatEditText;
        if (this.A == null && (appCompatEditText = this.f27581q) != null) {
            this.A = pdf.pdfreader.viewer.editor.free.utils.s1.a(appCompatEditText);
        }
        ObjectAnimator objectAnimator = this.A;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
    }

    @Override // xn.c
    public final void R0() {
        if (!isShowing()) {
            return;
        }
        this.H.R0();
        TextView textView = this.f27587w;
        if (textView != null) {
            textView.setEnabled(false);
        }
        TextView textView2 = this.f27588x;
        if (textView2 != null) {
            textView2.setEnabled(false);
        }
        ViewGroup viewGroup = this.D;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            this.E.j();
        }
        Handler handler = this.F;
        handler.postDelayed(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c(this, 12), 2000L);
        ProgressBar progressBar = this.G;
        if (progressBar != null) {
            progressBar.setMax(100);
            this.G.setProgress(0);
        }
        TextView textView3 = this.f27585u;
        if (textView3 != null) {
            textView3.setText(ea.a.p("AyU=", "665bbTar"));
        }
        TextView textView4 = this.f27586v;
        if (textView4 != null) {
            textView4.setText(getContext().getString(R.string.arg_res_0x7f1303cd));
        }
        handler.postDelayed(new b1.e(this, 28), 10000L);
    }

    @Override // xn.c
    public final void V(int i10) {
        TextView textView;
        if (!isShowing()) {
            return;
        }
        ProgressBar progressBar = this.G;
        if (progressBar != null) {
            progressBar.setMax(100);
            this.G.setProgress(i10);
        }
        TextView textView2 = this.f27585u;
        if (textView2 != null) {
            textView2.setText(String.format(Locale.getDefault(), ea.a.p("amQUJQ==", "YpKG6rei"), Integer.valueOf(i10)));
        }
        if (this.J <= 90 && i10 >= 90 && (textView = this.f27586v) != null) {
            textView.setText(getContext().getString(R.string.arg_res_0x7f130385));
        }
        this.J = i10;
    }

    @Override // xn.c
    public final void c(String str, boolean z10) {
        if (!isShowing()) {
            return;
        }
        boolean z11 = this.L;
        Handler handler = this.F;
        if (z11) {
            handler.postDelayed(new qb.f0(this, str, z10), 50L);
            return;
        }
        com.google.android.play.core.assetpacks.b1.Y();
        if (this.M && SystemClock.elapsedRealtime() - this.I < 500) {
            handler.postDelayed(new u.h(this, str, z10), SystemClock.elapsedRealtime() - this.I);
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.H.c(str, z10);
    }

    @Override // oo.f, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.F.removeCallbacksAndMessages(null);
        ObjectAnimator objectAnimator = this.A;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        LottieAnimationView lottieAnimationView = this.E;
        if (lottieAnimationView != null) {
            lottieAnimationView.d();
        }
        ViewGroup viewGroup = this.B;
        if (viewGroup != null) {
            viewGroup.animate().cancel();
        }
        ViewGroup viewGroup2 = this.C;
        if (viewGroup2 != null) {
            viewGroup2.animate().cancel();
        }
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.K.cancel();
        }
        super.dismiss();
    }

    @Override // xn.c
    public final void g() {
        if (!isShowing()) {
            return;
        }
        this.F.removeCallbacksAndMessages(null);
        if (isShowing() && this.f27582r != null) {
            A();
            this.f27582r.setVisibility(0);
        }
        TextView textView = this.f27587w;
        if (textView != null) {
            textView.setEnabled(true);
        }
        TextView textView2 = this.f27588x;
        if (textView2 != null) {
            textView2.setEnabled(true);
        }
        ViewGroup viewGroup = this.D;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            this.E.d();
        }
        this.H.g();
    }

    @Override // oo.f
    public final int r() {
        return R.layout.pdf_layout_show_password;
    }

    @Override // oo.f
    @SuppressLint({"ClickableViewAccessibility"})
    public final void t() {
        this.B = (ViewGroup) s().findViewById(R.id.input_layout);
        this.C = (ViewGroup) s().findViewById(R.id.process_layout);
        this.f27582r = (LinearLayout) s().findViewById(R.id.wrong_ll);
        this.f27583s = (TextView) s().findViewById(R.id.title);
        this.f27584t = (TextView) s().findViewById(R.id.dec_tv);
        this.f27587w = (TextView) s().findViewById(R.id.dia_reset_pwd_file_ok);
        this.f27588x = (TextView) s().findViewById(R.id.dia_reset_pwd_file_cancel);
        this.f27585u = (TextView) s().findViewById(R.id.process_tv);
        this.f27586v = (TextView) s().findViewById(R.id.process_desc_tv);
        this.G = (ProgressBar) s().findViewById(R.id.processBar);
        this.D = (ViewGroup) s().findViewById(R.id.animFl);
        this.E = (LottieAnimationView) s().findViewById(R.id.save_anim);
        AppCompatEditText appCompatEditText = (AppCompatEditText) s().findViewById(R.id.dia_reset_pwd_file_et);
        this.f27581q = appCompatEditText;
        appCompatEditText.setHint(" " + getContext().getResources().getString(R.string.arg_res_0x7f1303c3));
        this.f27581q.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.f27589y = (ImageView) s().findViewById(R.id.iv_icon);
        this.f27590z = false;
        AppCompatImageView appCompatImageView = (AppCompatImageView) s().findViewById(R.id.dia_reset_pwd_file_eye);
        appCompatImageView.setImageResource(R.drawable.ic_input_eye_off);
        appCompatImageView.setOnClickListener(new a(appCompatImageView));
        TextView textView = this.f27583s;
        boolean z10 = this.f27578n;
        if (textView != null) {
            if (z10) {
                textView.setText(getContext().getString(R.string.arg_res_0x7f1303dd));
                this.f27584t.setVisibility(0);
                this.f27584t.setText(getContext().getString(R.string.arg_res_0x7f1303de));
                this.f27589y.setImageResource(R.drawable.ic_merge_lock_off);
            } else {
                textView.setText(getContext().getString(R.string.arg_res_0x7f1303ee));
                this.f27584t.setText(getContext().getString(R.string.arg_res_0x7f1303ed));
                this.f27589y.setImageResource(R.drawable.ic_merge_lock);
            }
        }
        if (!z10) {
            this.f27581q.setFilters(new InputFilter[]{new f2()});
        } else {
            this.f27581q.setFilters(new InputFilter[0]);
        }
        this.f27588x.setOnClickListener(new b());
        this.f27587w.setOnClickListener(new c());
        this.f27581q.setOnTouchListener(new d());
        this.f27581q.setOnEditorActionListener(new e());
    }

    @Override // oo.f
    public final EditText u() {
        return this.f27581q;
    }

    @Override // xn.c
    public final void w0(Throwable th2) {
        if (!isShowing()) {
            return;
        }
        dp.a a10 = dp.a.a();
        Context context = getContext();
        a10.getClass();
        dp.a.d(context, th2);
        this.F.removeCallbacksAndMessages(null);
        this.H.w0(th2);
        dismiss();
    }
}
