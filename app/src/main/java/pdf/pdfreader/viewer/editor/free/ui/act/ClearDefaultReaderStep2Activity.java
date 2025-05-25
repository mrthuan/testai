package pdf.pdfreader.viewer.editor.free.ui.act;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;

/* compiled from: ClearDefaultReaderStep2Activity.kt */
/* loaded from: classes3.dex */
public final class ClearDefaultReaderStep2Activity extends jl.a {
    public String A = "";
    public long B;

    /* renamed from: t  reason: collision with root package name */
    public View f26601t;

    /* renamed from: u  reason: collision with root package name */
    public View f26602u;

    /* renamed from: v  reason: collision with root package name */
    public TextView f26603v;

    /* renamed from: w  reason: collision with root package name */
    public TextView f26604w;

    /* renamed from: x  reason: collision with root package name */
    public TextView f26605x;

    /* renamed from: y  reason: collision with root package name */
    public TextView f26606y;

    /* renamed from: z  reason: collision with root package name */
    public Space f26607z;
    public static final String D = ea.a.p("WGUyXxdlFGkRZWt0EHBl", "q95mvM2a");
    public static final a C = new a();

    /* compiled from: ClearDefaultReaderStep2Activity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(Context context, String str) {
            Intent intent = new Intent(context, ClearDefaultReaderStep2Activity.class);
            intent.putExtra(ea.a.p("JGVIXx1lQWk5ZRV0DHBl", "efBRgIjX"), str);
            context.startActivity(intent);
            Activity l10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.l(context);
            if (l10 != null) {
                l10.overridePendingTransition(0, 0);
            }
        }
    }

    /* compiled from: ClearDefaultReaderStep2Activity.kt */
    /* loaded from: classes3.dex */
    public static final class b extends androidx.activity.n {
        public b() {
            super(true);
        }

        @Override // androidx.activity.n
        public final void a() {
            ClearDefaultReaderStep2Activity.this.finish();
        }
    }

    @Override // jl.a
    public final void C1() {
        this.f26601t = findViewById(R.id.background_layout);
        this.f26602u = findViewById(R.id.content_layout);
        this.f26607z = (Space) findViewById(R.id.status_bar_space);
        this.f26603v = (TextView) findViewById(R.id.title_tv);
        this.f26604w = (TextView) findViewById(R.id.step1_content_tv);
        this.f26605x = (TextView) findViewById(R.id.step2_content_tv);
        this.f26606y = (TextView) findViewById(R.id.tv_ok);
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_clear_default_step2;
    }

    @Override // jl.a
    public final void K1() {
        getOnBackPressedDispatcher().a(this, new b());
        View decorView = getWindow().getDecorView();
        pdf.pdfreader.viewer.editor.free.ui.act.b bVar = new pdf.pdfreader.viewer.editor.free.ui.act.b(this, 0);
        WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
        f0.i.u(decorView, bVar);
        View view = this.f26601t;
        if (view != null) {
            view.setOnClickListener(new f5.e(this, 17));
        }
        View view2 = this.f26602u;
        if (view2 != null) {
            view2.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.s(2));
        }
        TextView textView = this.f26606y;
        if (textView != null) {
            textView.setOnClickListener(new c(this, 0));
        }
        Context m10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.m(this);
        TextView textView2 = this.f26606y;
        if (textView2 != null) {
            textView2.setText(m10.getString(R.string.arg_res_0x7f130023));
        }
        TextView textView3 = this.f26603v;
        if (textView3 != null) {
            textView3.setText(m10.getString(R.string.arg_res_0x7f1300b0));
        }
    }

    public final CharSequence a2(String str) {
        String obj = str.toString();
        if (!kotlin.text.k.O(obj, ea.a.p("RmI-", "rHz4Cizo"), false)) {
            return str;
        }
        try {
            int V = kotlin.text.k.V(obj, ea.a.p("V2I-", "1lkAV7c1"), 0, false, 6);
            int V2 = kotlin.text.k.V(obj, ea.a.p("cy9TPg==", "RmIOIRW4"), 0, false, 6) - 3;
            SpannableString spannableString = new SpannableString(kotlin.text.j.K(kotlin.text.j.K(obj, ea.a.p("UmI-", "imnqCric"), ""), ea.a.p("ci80Pg==", "9fNVTsv7"), ""));
            spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.a.getColor(this, R.color.colorAccent)), V, V2, 18);
            spannableString.setSpan(new StyleSpan(1), V, V2, 18);
            return spannableString;
        } catch (Throwable unused) {
            return str;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    public final void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
        pdf.pdfreader.viewer.editor.free.utils.extension.a.d(this);
        Intent intent = getIntent();
        String str = D;
        if (intent.hasExtra(str)) {
            String stringExtra = getIntent().getStringExtra(str);
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.A = stringExtra;
        }
        tn.a.d(this, ea.a.p("KHVYZGU=", "LCQlDeTQ"), ea.a.p("KHVYZBxzTnMFcyJvdw==", "4isebFjP"), ea.a.p("VWwqYXI=", "3H6OOFYT"), false);
        String str2 = this.A;
        Context m10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.m(this);
        int hashCode = str2.hashCode();
        if (hashCode != -759499589) {
            if (hashCode != 106680966) {
                if (hashCode == 1864941562 && str2.equals(ea.a.p("QGEmcwZuZw==", "fBUrpHaY"))) {
                    TextView textView = this.f26604w;
                    if (textView != null) {
                        String string = m10.getString(R.string.arg_res_0x7f130440);
                        kotlin.jvm.internal.g.d(string, ea.a.p("QHk4dBZtLm8RYVhDBm4iZTx0HGcjdBB01oDRcy9uVV9QbC5hAV8GZRRhQWwdXyV0IXADKQ==", "4wZ2Ya64"));
                        textView.setText(a2(string));
                    }
                    TextView textView2 = this.f26605x;
                    if (textView2 != null) {
                        String string2 = m10.getString(R.string.arg_res_0x7f130441);
                        kotlin.jvm.internal.g.d(string2, ea.a.p("QHk4dBZtLm8RYVhDBm4iZTx0HGcjdBB0loDpcyZuK19QbC5hAV8GZRRhQWwdXyV0IXAAKQ==", "tOSL4jsZ"));
                        textView2.setText(a2(string2));
                    }
                }
                finish();
            } else {
                if (str2.equals(ea.a.p("AWk9ZWw=", "7bqE1MI9"))) {
                    TextView textView3 = this.f26604w;
                    if (textView3 != null) {
                        String string3 = m10.getString(R.string.arg_res_0x7f13034a);
                        kotlin.jvm.internal.g.d(string3, ea.a.p("RHkbdBNtIG8rYQpDW24jZUB0fGcsdGV0loDXaSllLl9UbA1hBF8IZS5hE2xAXyR0XXBjKQ==", "cY7hvlIL"));
                        textView3.setText(a2(string3));
                    }
                    TextView textView4 = this.f26605x;
                    if (textView4 != null) {
                        String string4 = m10.getString(R.string.arg_res_0x7f13034b);
                        kotlin.jvm.internal.g.d(string4, ea.a.p("QHk4dBZtLm8RYVhDBm4iZTx0HGcjdBB0sID0aQhlOF9QbC5hAV8GZRRhQWwdXyV0IXAAKQ==", "RRpT5nPc"));
                        textView4.setText(a2(string4));
                    }
                }
                finish();
            }
        } else {
            if (str2.equals(ea.a.p("S2kqbx5p", "NAA5NjGp"))) {
                TextView textView5 = this.f26604w;
                if (textView5 != null) {
                    String string5 = m10.getString(R.string.arg_res_0x7f13025b);
                    kotlin.jvm.internal.g.d(string5, ea.a.p("PHlCdBxte285YSZDGm4cZU10QGcgdDZ0ioDLZ01tPV8sbFRhC19TZTxhP2wBXxt0UHBfKQ==", "IROKhmcT"));
                    textView5.setText(a2(string5));
                }
                TextView textView6 = this.f26605x;
                if (textView6 != null) {
                    String string6 = m10.getString(R.string.arg_res_0x7f13025c);
                    kotlin.jvm.internal.g.d(string6, ea.a.p("G3kXdCltCm8rYQpDW24jZUB0fGcsdGV0loDXXzJsJ2EaXwBlKmEzbDxfFXRRcGVfX3AmKQ==", "qmhdLFPc"));
                    textView6.setText(a2(string6));
                }
            }
            finish();
        }
        this.B = SystemClock.elapsedRealtime();
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (SystemClock.elapsedRealtime() - this.B < 2000) {
            this.B = 0L;
            startActivity(new Intent(this, ClearDefaultReaderStep2Activity.class));
        }
    }
}
