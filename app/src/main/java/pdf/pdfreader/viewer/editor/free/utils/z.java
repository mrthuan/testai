package pdf.pdfreader.viewer.editor.free.utils;

import android.app.Activity;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: KeyboardUtils.kt */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public a f28798a;

    /* renamed from: b  reason: collision with root package name */
    public View f28799b;

    /* compiled from: KeyboardUtils.kt */
    /* loaded from: classes3.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        public final View f28800a;

        /* renamed from: b  reason: collision with root package name */
        public final b f28801b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final int f28802d;

        /* renamed from: e  reason: collision with root package name */
        public final Rect f28803e;

        public a(View view, c cVar) {
            ea.a.p("QW8kdCVpB3c=", "4wJdEIN5");
            ea.a.p("CGUMYgBhS2QEaRV0UW4ycg==", "tQcuo9QE");
            this.f28800a = view;
            this.f28801b = cVar;
            this.f28802d = 148;
            this.f28803e = new Rect();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            Rect rect = this.f28803e;
            View view = this.f28800a;
            try {
                boolean z10 = true;
                int applyDimension = (int) TypedValue.applyDimension(1, this.f28802d, view.getResources().getDisplayMetrics());
                view.getWindowVisibleDisplayFrame(rect);
                if (view.getRootView().getHeight() - (rect.bottom - rect.top) < applyDimension) {
                    z10 = false;
                }
                if (z10 == this.c) {
                    return;
                }
                this.c = z10;
                this.f28801b.a(z10);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* compiled from: KeyboardUtils.kt */
    /* loaded from: classes3.dex */
    public interface b {
        void a(boolean z10);
    }

    /* compiled from: KeyboardUtils.kt */
    /* loaded from: classes3.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cg.l<Boolean, tf.d> f28804a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(cg.l<? super Boolean, tf.d> lVar) {
            this.f28804a = lVar;
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.z.b
        public final void a(boolean z10) {
            this.f28804a.invoke(Boolean.valueOf(z10));
        }
    }

    public final void a(Activity activity, cg.l<? super Boolean, tf.d> lVar) {
        ViewTreeObserver viewTreeObserver;
        kotlin.jvm.internal.g.e(activity, "activity");
        View findViewById = activity.findViewById(16908290);
        this.f28799b = findViewById;
        if (findViewById != null) {
            if (this.f28798a == null) {
                this.f28798a = new a(findViewById, new c(lVar));
            }
            a aVar = this.f28798a;
            if (aVar != null && (viewTreeObserver = findViewById.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(aVar);
            }
        }
    }
}
