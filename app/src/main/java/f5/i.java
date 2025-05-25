package f5;

import android.app.Activity;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import h5.c;
import h5.m;
import java.util.Arrays;
import java.util.Locale;
import kotlin.random.Random;
import kotlin.text.k;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: UpgradeGuideBottomDialog.kt */
/* loaded from: classes.dex */
public final class i extends a implements b {
    public View A;
    public RecyclerView B;
    public LottieAnimationView C;
    public AppCompatImageView D;
    public j E;
    public boolean F;
    public String G;

    /* renamed from: q  reason: collision with root package name */
    public final Activity f17106q;

    /* renamed from: r  reason: collision with root package name */
    public final m f17107r;

    /* renamed from: s  reason: collision with root package name */
    public final e5.d f17108s;

    /* renamed from: t  reason: collision with root package name */
    public final int f17109t;

    /* renamed from: u  reason: collision with root package name */
    public final c f17110u;

    /* renamed from: v  reason: collision with root package name */
    public final Integer f17111v;

    /* renamed from: w  reason: collision with root package name */
    public final h5.b f17112w;

    /* renamed from: x  reason: collision with root package name */
    public AppCompatTextView f17113x;

    /* renamed from: y  reason: collision with root package name */
    public AppCompatTextView f17114y;

    /* renamed from: z  reason: collision with root package name */
    public AppCompatTextView f17115z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Activity activity, m mVar, e5.d dVar, c cVar, c5.d upgradeCheck) {
        super(activity);
        kotlin.jvm.internal.g.e(activity, "activity");
        kotlin.jvm.internal.g.e(upgradeCheck, "upgradeCheck");
        this.f17106q = activity;
        this.f17107r = mVar;
        this.f17108s = dVar;
        this.f17109t = 1;
        this.f17110u = cVar;
        this.f17111v = null;
        this.f17112w = upgradeCheck;
        this.F = true;
        this.G = "A";
    }

    public final CharSequence A(String str) {
        String obj = str.toString();
        if (!k.O(obj, "<b>", false)) {
            return str;
        }
        try {
            SpannableString spannableString = new SpannableString(kotlin.text.j.K(kotlin.text.j.K(obj, "<b>", ""), "</b>", ""));
            spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.a.getColor(this.f17106q, R.color.lib_upgrade_update_highlight)), k.V(obj, "<b>", 0, false, 6), k.V(obj, "</b>", 0, false, 6) - 3, 18);
            return spannableString;
        } catch (Throwable th2) {
            c5.a b10 = c5.a.b();
            b10.a();
            b10.c.f5583e.k("", th2);
            return str;
        }
    }

    public final String B(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10 / 1000);
        sb2.append(',');
        String format = String.format(Locale.ENGLISH, "%03d", Arrays.copyOf(new Object[]{Integer.valueOf(i10 % 1000)}, 1));
        kotlin.jvm.internal.g.d(format, "format(locale, format, *args)");
        sb2.append(format);
        return sb2.toString();
    }

    @Override // f5.b
    public final int f() {
        return this.f17109t;
    }

    @Override // f5.b
    public final String j() {
        return this.G;
    }

    @Override // f5.b
    public final String l() {
        c5.a b10 = c5.a.b();
        b10.a();
        String c = b10.c.f5583e.c(this.f17106q);
        kotlin.jvm.internal.g.d(c, "getInstance().upgradeCon…tCurrentLanguage(context)");
        return c;
    }

    @Override // f5.a, android.app.Dialog, f5.b
    public final void show() {
        super.show();
        c5.a b10 = c5.a.b();
        b10.a();
        d5.b b11 = b10.c.f5583e.b();
        if (b11 != null) {
            b11.a(this);
        }
    }

    public final int w() {
        c.a aVar = h5.c.f18014h;
        Activity activity = this.f17106q;
        int d10 = aVar.a(activity).d();
        int floor = ((int) Math.floor((130000 - d10) * 0.2f)) + d10;
        if (d10 != floor) {
            d10 = ge.a.N(Random.Default, new hg.c(d10 + 1, floor));
        }
        aVar.a(activity).h(d10);
        return d10;
    }

    public final void x() {
        setCanceledOnTouchOutside(false);
        setOnCancelListener(new f(this, 0));
        setOnDismissListener(new g(this, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x041c, code lost:
        if (r0 == null) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ee, code lost:
        if (r0 == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0105, code lost:
        if (r0 == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0107, code lost:
        r0 = "B";
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010a, code lost:
        r0 = "A";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y() {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.i.y():void");
    }

    public final CharSequence z(String str) {
        String obj = str.toString();
        try {
            int V = k.V(obj, "<b>", 0, false, 6);
            int V2 = k.V(obj, "</b>", 0, false, 6) - 3;
            SpannableString spannableString = new SpannableString(kotlin.text.j.K(kotlin.text.j.K(obj, "<b>", ""), "</b>", ""));
            spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.a.getColor(this.f17106q, R.color.lib_upgrade_update_highlight)), V, V2, 18);
            spannableString.setSpan(new RelativeSizeSpan(1.125f), V, V2, 18);
            spannableString.setSpan(new StyleSpan(1), V, V2, 18);
            return spannableString;
        } catch (Throwable th2) {
            c5.a b10 = c5.a.b();
            b10.a();
            b10.c.f5583e.k("", th2);
            return str;
        }
    }
}
