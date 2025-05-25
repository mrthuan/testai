package v5;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.appevents.codeless.internal.EventBinding;
import java.lang.ref.WeakReference;

/* compiled from: RCTCodelessLoggingEventListener.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f30669a = 0;

    /* compiled from: RCTCodelessLoggingEventListener.kt */
    /* loaded from: classes.dex */
    public static final class a implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public final EventBinding f30670a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference<View> f30671b;
        public final WeakReference<View> c;

        /* renamed from: d  reason: collision with root package name */
        public final View.OnTouchListener f30672d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f30673e = true;

        public a(EventBinding eventBinding, View view, View view2) {
            this.f30670a = eventBinding;
            this.f30671b = new WeakReference<>(view2);
            this.c = new WeakReference<>(view);
            this.f30672d = w5.c.g(view2);
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            kotlin.jvm.internal.g.e(view, "view");
            kotlin.jvm.internal.g.e(motionEvent, "motionEvent");
            View view2 = this.c.get();
            View view3 = this.f30671b.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                v5.a.a(this.f30670a, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.f30672d;
            if (onTouchListener != null && onTouchListener.onTouch(view, motionEvent)) {
                return true;
            }
            return false;
        }
    }

    static {
        new d();
    }
}
