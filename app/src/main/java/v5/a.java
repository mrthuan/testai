package v5;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.internal.p;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v5.c;

/* compiled from: CodelessLoggingEventListener.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30642a = new a();

    /* compiled from: CodelessLoggingEventListener.kt */
    /* renamed from: v5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class View$OnClickListenerC0385a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final EventBinding f30643a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference<View> f30644b;
        public final WeakReference<View> c;

        /* renamed from: d  reason: collision with root package name */
        public final View.OnClickListener f30645d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f30646e = true;

        public View$OnClickListenerC0385a(EventBinding eventBinding, View view, View view2) {
            this.f30643a = eventBinding;
            this.f30644b = new WeakReference<>(view2);
            this.c = new WeakReference<>(view);
            this.f30645d = w5.c.f(view2);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (k6.a.b(this)) {
                return;
            }
            try {
                if (k6.a.b(this)) {
                    return;
                }
                kotlin.jvm.internal.g.e(view, "view");
                View.OnClickListener onClickListener = this.f30645d;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                View view2 = this.c.get();
                View view3 = this.f30644b.get();
                if (view2 != null && view3 != null) {
                    EventBinding eventBinding = this.f30643a;
                    kotlin.jvm.internal.g.c(eventBinding, "null cannot be cast to non-null type com.facebook.appevents.codeless.internal.EventBinding");
                    a.a(eventBinding, view2, view3);
                }
            } catch (Throwable th2) {
                k6.a.a(this, th2);
            }
        }
    }

    /* compiled from: CodelessLoggingEventListener.kt */
    /* loaded from: classes.dex */
    public static final class b implements AdapterView.OnItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final EventBinding f30647a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference<AdapterView<?>> f30648b;
        public final WeakReference<View> c;

        /* renamed from: d  reason: collision with root package name */
        public final AdapterView.OnItemClickListener f30649d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f30650e = true;

        public b(EventBinding eventBinding, View view, AdapterView<?> adapterView) {
            this.f30647a = eventBinding;
            this.f30648b = new WeakReference<>(adapterView);
            this.c = new WeakReference<>(view);
            this.f30649d = adapterView.getOnItemClickListener();
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            kotlin.jvm.internal.g.e(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.f30649d;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i10, j10);
            }
            View view2 = this.c.get();
            AdapterView<?> adapterView2 = this.f30648b.get();
            if (view2 != null && adapterView2 != null) {
                a.a(this.f30647a, view2, adapterView2);
            }
        }
    }

    public static final void a(EventBinding mapping, View view, View view2) {
        if (k6.a.b(a.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.g.e(mapping, "mapping");
            String str = mapping.f9503a;
            c.a aVar = c.f30658f;
            Bundle b10 = c.a.b(mapping, view, view2);
            f30642a.b(b10);
            com.facebook.d.c().execute(new l1.a(2, str, b10));
        } catch (Throwable th2) {
            k6.a.a(a.class, th2);
        }
    }

    public final void b(Bundle bundle) {
        double d10;
        Matcher matcher;
        Locale locale;
        if (k6.a.b(this)) {
            return;
        }
        try {
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                int i10 = c6.f.f5607a;
                try {
                    matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(string);
                } catch (ParseException unused) {
                }
                if (matcher.find()) {
                    String group = matcher.group(0);
                    p pVar = p.f9815a;
                    try {
                        locale = com.facebook.d.a().getResources().getConfiguration().locale;
                    } catch (Exception unused2) {
                        locale = null;
                    }
                    if (locale == null) {
                        locale = Locale.getDefault();
                        kotlin.jvm.internal.g.d(locale, "getDefault()");
                    }
                    d10 = NumberFormat.getNumberInstance(locale).parse(group).doubleValue();
                    bundle.putDouble("_valueToSum", d10);
                }
                d10 = 0.0d;
                bundle.putDouble("_valueToSum", d10);
            }
            bundle.putString("_is_fb_codeless", "1");
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }
}
