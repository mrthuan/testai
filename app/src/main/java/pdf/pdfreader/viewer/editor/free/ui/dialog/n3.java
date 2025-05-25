package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;

/* compiled from: ToolsGuideDialog.kt */
/* loaded from: classes3.dex */
public final class n3 extends Dialog {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f27703k = 0;

    /* renamed from: a  reason: collision with root package name */
    public final View f27704a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f27705b;
    public View c;

    /* renamed from: d  reason: collision with root package name */
    public View f27706d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f27707e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f27708f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f27709g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f27710h;

    /* renamed from: i  reason: collision with root package name */
    public final m3 f27711i;

    /* renamed from: j  reason: collision with root package name */
    public final l3 f27712j;

    /* compiled from: ToolsGuideDialog.kt */
    /* loaded from: classes3.dex */
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f27713a;

        public a(LottieAnimationView lottieAnimationView) {
            this.f27713a = lottieAnimationView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.g.e(animation, "animation");
            LottieAnimationView lottieAnimationView = this.f27713a;
            lottieAnimationView.f6018h.c.removeListener(this);
            lottieAnimationView.k(ShapeTypes.ACTION_BUTTON_DOCUMENT, 315);
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.j();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(ReaderHomeActivity readerHomeActivity, View view) {
        super(readerHomeActivity, R.style.ToolsGuideDialog);
        kotlin.jvm.internal.g.e(readerHomeActivity, ea.a.p("UG8ldBZ4dA==", "UD6VqBS6"));
        kotlin.jvm.internal.g.e(view, ea.a.p("QGEJTFZ5HXV0", "Ns4k7rGp"));
        this.f27704a = view;
        this.f27705b = new Handler(Looper.getMainLooper());
        this.f27707e = new int[]{0, 0};
        this.f27708f = new int[]{0, 0};
        this.f27711i = new m3(this);
        this.f27712j = new l3(this);
    }

    public final void a(final View view, final int i10, final int i11) {
        if (this.f27710h) {
            return;
        }
        this.f27710h = true;
        final View findViewById = findViewById(R.id.container);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        view.setAlpha(1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.k3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                String p10 = ea.a.p("bHY-ZXc=", "BUHWzDOc");
                View view2 = view;
                kotlin.jvm.internal.g.e(view2, p10);
                kotlin.jvm.internal.g.e(valueAnimator, ea.a.p("JnQ=", "Fl8jdVDF"));
                Object animatedValue = valueAnimator.getAnimatedValue();
                kotlin.jvm.internal.g.c(animatedValue, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuJW54bjRsASA7eUFlWWtYdDZpJC4zbAdhdA==", "xAyDJUAm"));
                float floatValue = ((Float) animatedValue).floatValue();
                findViewById.setAlpha(floatValue);
                view2.setScaleX(floatValue);
                view2.setScaleY(floatValue);
                float f10 = 1 - floatValue;
                view2.setScrollX(-((int) (i10 * f10)));
                view2.setScrollY(-((int) (i11 * f10)));
            }
        });
        ofFloat.start();
        ((LottieAnimationView) findViewById(R.id.anim_view)).j();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            this.f27704a.getViewTreeObserver().removeOnGlobalLayoutListener(this.f27711i);
            super.dismiss();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        setContentView(R.layout.dialog_tools_guide);
        Window window = getWindow();
        if (window != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.i.i(window);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(androidx.core.content.a.getColor(getContext(), R.color.black_transparent));
            window.setFlags(8, 8);
            window.setGravity(81);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                ea.a.p("UnQ_chpiF3QXcw==", "bMkElSyh");
                attributes.width = -1;
                attributes.height = -1;
            }
        }
        if (!this.f27709g) {
            this.f27709g = true;
            Paint paint = new Paint(1);
            View view = this.f27704a;
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.g.d(createBitmap, ea.a.p("UHIuYQdlIGkGbVVwQXQ3YghhS28zdG130oCTIDZpEW1ScGVDHG4EaRUudVIuQgk4fDgKKQ==", "05teOQpD"));
            view.draw(new Canvas(createBitmap));
            ((ImageView) findViewById(R.id.tabImage)).setImageBitmap(createBitmap);
            Bitmap createBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.g.d(createBitmap2, ea.a.p("B3JcYTdlNGk8bQdwHHQ2YnRhK288dBh3loDXIBNpNm0FcBdDLG4QaS8uJ1JzQgg4ADhqKQ==", "M6d9CvGj"));
            Canvas canvas = new Canvas(createBitmap2);
            float dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.dp_8);
            canvas.drawARGB(153, 0, 0, 0);
            paint.setColor(0);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            Context context = view.getContext();
            kotlin.jvm.internal.g.d(context, ea.a.p("O2FTTBh5WHUuLilvG3QNeHQ=", "MOkLYil6"));
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(context)) {
                canvas.drawRoundRect(0.0f, 0.0f, view.getWidth() / 4.0f, view.getHeight(), dimensionPixelSize, dimensionPixelSize, paint);
            } else {
                canvas.drawRoundRect(3.0f * (view.getWidth() / 4.0f), 0.0f, view.getWidth(), view.getHeight(), dimensionPixelSize, dimensionPixelSize, paint);
            }
            ((ImageView) findViewById(R.id.shadowImage)).setImageBitmap(createBitmap2);
        }
        findViewById(R.id.rootView).setOnClickListener(new k9.c(this, 27));
        this.c = findViewById(R.id.container);
        this.f27706d = findViewById(R.id.content_tv);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.anim_view);
        lottieAnimationView.c(new a(lottieAnimationView));
    }

    @Override // android.app.Dialog
    public final void show() {
        float f10;
        try {
            super.show();
            this.f27709g = false;
            this.f27710h = false;
            View view = this.f27706d;
            if (view != null) {
                if (view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
                    view.postDelayed(new pdf.pdfreader.viewer.editor.free.office.l0(4, this, view), 50L);
                } else {
                    view.addOnLayoutChangeListener(this.f27712j);
                }
            }
            LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.anim_view);
            if (pdf.pdfreader.viewer.editor.free.utils.a0.i(getContext())) {
                f10 = 180.0f;
            } else {
                f10 = 0.0f;
            }
            lottieAnimationView.setRotationY(f10);
            this.f27705b.postDelayed(new pdf.pdfreader.viewer.editor.free.ui.act.tools.h(this, 2), 50L);
            this.f27704a.getViewTreeObserver().addOnGlobalLayoutListener(this.f27711i);
            Window window = getWindow();
            if (window != null) {
                pdf.pdfreader.viewer.editor.free.utils.extension.i.i(window);
                window.clearFlags(8);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
