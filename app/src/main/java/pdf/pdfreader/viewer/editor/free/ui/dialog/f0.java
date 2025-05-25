package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.method.PasswordTransformationMethod;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptContainer;

/* compiled from: OperateInputPwdDialog.java */
/* loaded from: classes3.dex */
public final class f0 extends oo.f {
    public static final /* synthetic */ int L = 0;
    public LottieAnimationView A;
    public final Handler B;
    public ProgressBar C;
    public long D;
    public int E;
    public final pdf.pdfreader.viewer.editor.free.decrypt.e F;
    public boolean G;
    public boolean H;
    public ValueAnimator I;
    public boolean J;
    public boolean K;

    /* renamed from: n  reason: collision with root package name */
    public EditText f27550n;

    /* renamed from: o  reason: collision with root package name */
    public ObjectAnimator f27551o;

    /* renamed from: p  reason: collision with root package name */
    public LinearLayout f27552p;

    /* renamed from: q  reason: collision with root package name */
    public TextView f27553q;

    /* renamed from: r  reason: collision with root package name */
    public TextView f27554r;

    /* renamed from: s  reason: collision with root package name */
    public TextView f27555s;

    /* renamed from: t  reason: collision with root package name */
    public TextView f27556t;

    /* renamed from: u  reason: collision with root package name */
    public TextView f27557u;

    /* renamed from: v  reason: collision with root package name */
    public TextView f27558v;

    /* renamed from: w  reason: collision with root package name */
    public TextView f27559w;

    /* renamed from: x  reason: collision with root package name */
    public ViewGroup f27560x;

    /* renamed from: y  reason: collision with root package name */
    public ViewGroup f27561y;

    /* renamed from: z  reason: collision with root package name */
    public ViewGroup f27562z;

    public f0(Context context, DecryptAndCopyUIHelper decryptAndCopyUIHelper) {
        super(context);
        this.B = new Handler();
        this.G = false;
        this.J = false;
        this.K = false;
        this.F = decryptAndCopyUIHelper;
    }

    public final void A(List<DecryptContainer> list) {
        if (!isShowing()) {
            return;
        }
        boolean z10 = this.J;
        Handler handler = this.B;
        if (z10) {
            handler.postDelayed(new l.r(28, this, list), 50L);
        } else if (this.K && SystemClock.elapsedRealtime() - this.D < 500) {
            handler.postDelayed(new com.facebook.appevents.g(24, this, list), SystemClock.elapsedRealtime() - this.D);
        } else {
            handler.removeCallbacksAndMessages(null);
            this.F.a(list);
        }
    }

    public final String B() {
        EditText editText = this.f27550n;
        if (editText == null || editText.getText() == null) {
            return "";
        }
        return this.f27550n.getText().toString();
    }

    public final void C(String str, SpannableString spannableString, int i10) {
        if (!this.f23531g) {
            return;
        }
        TextView textView = this.f27554r;
        if (textView != null) {
            textView.setText(spannableString);
        }
        TextView textView2 = this.f27553q;
        if (textView2 != null) {
            textView2.setText(str);
        }
        TextView textView3 = this.f27555s;
        if (textView3 != null) {
            textView3.setText("" + i10);
        }
    }

    public final void R0() {
        if (!isShowing()) {
            return;
        }
        setCancelable(false);
        TextView textView = this.f27558v;
        if (textView != null) {
            textView.setEnabled(false);
        }
        TextView textView2 = this.f27559w;
        if (textView2 != null) {
            textView2.setEnabled(false);
        }
        ViewGroup viewGroup = this.f27562z;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            this.A.j();
        }
        Handler handler = this.B;
        handler.postDelayed(new pdf.pdfreader.viewer.editor.free.ui.act.tools.j(this, 3), 2000L);
        ProgressBar progressBar = this.C;
        if (progressBar != null) {
            progressBar.setMax(100);
            this.C.setProgress(0);
        }
        TextView textView3 = this.f27556t;
        if (textView3 != null) {
            textView3.setText(ea.a.p("AyU=", "d6grPQRa"));
        }
        TextView textView4 = this.f27557u;
        if (textView4 != null) {
            textView4.setText(getContext().getString(R.string.arg_res_0x7f1303cd));
        }
        handler.postDelayed(new pdf.pdfreader.viewer.editor.free.feature.ocr.helper.c(this, 5), 10000L);
    }

    @Override // oo.f, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.B.removeCallbacksAndMessages(null);
        ObjectAnimator objectAnimator = this.f27551o;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        LottieAnimationView lottieAnimationView = this.A;
        if (lottieAnimationView != null) {
            lottieAnimationView.d();
        }
        ViewGroup viewGroup = this.f27560x;
        if (viewGroup != null) {
            viewGroup.animate().cancel();
        }
        ViewGroup viewGroup2 = this.f27561y;
        if (viewGroup2 != null) {
            viewGroup2.animate().cancel();
        }
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.I.cancel();
        }
        super.dismiss();
    }

    public final void g() {
        EditText editText;
        if (!isShowing()) {
            return;
        }
        this.B.removeCallbacksAndMessages(null);
        if (this.f27552p != null) {
            if (this.f27551o == null && (editText = this.f27550n) != null) {
                this.f27551o = pdf.pdfreader.viewer.editor.free.utils.s1.a(editText);
            }
            ObjectAnimator objectAnimator = this.f27551o;
            if (objectAnimator != null) {
                objectAnimator.start();
            }
            this.f27552p.setVisibility(0);
        }
        TextView textView = this.f27558v;
        if (textView != null) {
            textView.setEnabled(true);
        }
        TextView textView2 = this.f27559w;
        if (textView2 != null) {
            textView2.setEnabled(true);
        }
        ViewGroup viewGroup = this.f27562z;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            this.A.d();
        }
    }

    @Override // oo.f
    public final int r() {
        return R.layout.dialog_operate_input_password;
    }

    @Override // oo.f
    public final void t() {
        this.f27550n = (EditText) s().findViewById(R.id.et_name);
        this.f27552p = (LinearLayout) s().findViewById(R.id.wrong_ll);
        this.f27553q = (TextView) s().findViewById(R.id.title);
        this.f27554r = (TextView) s().findViewById(R.id.dec_tv);
        this.f27555s = (TextView) s().findViewById(R.id.file_numbers);
        this.f27558v = (TextView) s().findViewById(R.id.okTv);
        this.f27559w = (TextView) s().findViewById(R.id.cancelTv);
        this.f27556t = (TextView) s().findViewById(R.id.process_tv);
        this.f27557u = (TextView) s().findViewById(R.id.process_desc_tv);
        this.C = (ProgressBar) s().findViewById(R.id.processBar);
        this.f27562z = (ViewGroup) s().findViewById(R.id.animFl);
        this.A = (LottieAnimationView) s().findViewById(R.id.save_anim);
        this.f27560x = (ViewGroup) s().findViewById(R.id.input_layout);
        this.f27561y = (ViewGroup) s().findViewById(R.id.process_layout);
        ImageView imageView = (ImageView) s().findViewById(R.id.iv_eye);
        this.f27550n.setImeOptions(268435456);
        EditText editText = this.f27550n;
        editText.setHint(" " + getContext().getResources().getString(R.string.arg_res_0x7f1303c3));
        this.H = false;
        this.f27550n.setTransformationMethod(PasswordTransformationMethod.getInstance());
        imageView.setImageResource(R.drawable.ic_input_eye_off);
        imageView.setOnClickListener(new d0(this, imageView));
        this.f27559w.setOnClickListener(new u4.j(this, 21));
        this.f27558v.setOnClickListener(new d9.f(this, 22));
    }

    @Override // oo.f
    public final EditText u() {
        return this.f27550n;
    }

    @Override // oo.f
    public final boolean w() {
        return true;
    }
}
