package ap;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import ap.a;
import com.airbnb.lottie.LottieAnimationView;
import f5.j;
import h5.m;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.g;
import kotlin.text.k;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.utils.extension.i;

/* compiled from: ReaderUpgradeGuideBottomDialog.kt */
/* loaded from: classes3.dex */
public final class d extends f5.a implements f5.b {
    public static final /* synthetic */ int G = 0;
    public RecyclerView A;
    public LottieAnimationView B;
    public AppCompatImageView C;
    public j D;
    public boolean E;
    public String F;

    /* renamed from: q  reason: collision with root package name */
    public final Activity f5156q;

    /* renamed from: r  reason: collision with root package name */
    public final m f5157r;

    /* renamed from: s  reason: collision with root package name */
    public final e5.d f5158s;

    /* renamed from: t  reason: collision with root package name */
    public final int f5159t;

    /* renamed from: u  reason: collision with root package name */
    public final f5.c f5160u;

    /* renamed from: v  reason: collision with root package name */
    public final Integer f5161v;

    /* renamed from: w  reason: collision with root package name */
    public final h5.b f5162w;

    /* renamed from: x  reason: collision with root package name */
    public AppCompatTextView f5163x;

    /* renamed from: y  reason: collision with root package name */
    public AppCompatTextView f5164y;

    /* renamed from: z  reason: collision with root package name */
    public AppCompatTextView f5165z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Activity activity, m mVar, e5.d dVar, int i10, f5.c cVar, c5.d dVar2) {
        super(activity);
        g.e(activity, ea.a.p("GWMFaSdpBXk=", "gHxqQqGj"));
        ea.a.p("IjMdcFxhEmUBbgBv", "vMQH8fOA");
        this.f5156q = activity;
        this.f5157r = mVar;
        this.f5158s = dVar;
        this.f5159t = i10;
        this.f5160u = cVar;
        this.f5161v = null;
        this.f5162w = dVar2;
        this.E = true;
        this.F = ea.a.p("QQ==", "q4dml7I3");
    }

    public static a x() {
        ReaderPdfApplication readerPdfApplication;
        Context m10 = ReaderPdfApplication.m();
        if (m10 instanceof ReaderPdfApplication) {
            readerPdfApplication = (ReaderPdfApplication) m10;
        } else {
            readerPdfApplication = null;
        }
        if (readerPdfApplication == null) {
            return null;
        }
        return ReaderPdfApplication.f23853e.c;
    }

    public final CharSequence A(int i10, String str) {
        String obj = str.toString();
        try {
            int V = k.V(obj, ea.a.p("D2I-", "7W5qurpa"), 0, false, 6);
            int V2 = k.V(obj, ea.a.p("cy9TPg==", "Ut2JEywn"), 0, false, 6) - 3;
            String K = kotlin.text.j.K(kotlin.text.j.K(obj, ea.a.p("D2I-", "CNt2TaV5"), ""), ea.a.p("cy9TPg==", "RiKDvAKr"), "");
            SpannableString spannableString = new SpannableString(K);
            spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.a.getColor(this.f5156q, R.color.lib_upgrade_update_highlight)), V, V2, 18);
            spannableString.setSpan(new RelativeSizeSpan(1.125f), V, V2, 18);
            spannableString.setSpan(new StyleSpan(1), V, V2, 18);
            spannableString.setSpan(new ImageSpan(getContext(), i10, 0), K.length() - 1, K.length(), 18);
            return spannableString;
        } catch (Throwable th2) {
            a x4 = x();
            if (x4 != null) {
                x4.k(ea.a.p("DWFCZSxwUHI7ZC9EHGEEb2c=", "XWcDk4YC"), th2);
                return str;
            }
            return str;
        }
    }

    public final CharSequence B(String str, Integer num) {
        String obj = str.toString();
        if (!k.O(obj, ea.a.p("c2I-", "YKZMWpE6"), false)) {
            return str;
        }
        try {
            int V = k.V(obj, ea.a.p("D2I-", "TkB7jbra"), 0, false, 6);
            int V2 = k.V(obj, ea.a.p("cy9TPg==", "Cs1W6ksx"), 0, false, 6) - 3;
            String K = kotlin.text.j.K(kotlin.text.j.K(obj, ea.a.p("c2I-", "klOEsg2y"), ""), ea.a.p("Di8uPg==", "IF2L39qo"), "");
            SpannableString spannableString = new SpannableString(K);
            spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.a.getColor(this.f5156q, R.color.lib_upgrade_update_highlight)), V, V2, 18);
            spannableString.setSpan(new StyleSpan(1), V, V2, 18);
            if (num != null) {
                num.intValue();
                spannableString.setSpan(new ImageSpan(getContext(), num.intValue(), 0), K.length() - 1, K.length(), 18);
            }
            return spannableString;
        } catch (Throwable th2) {
            a x4 = x();
            if (x4 != null) {
                x4.k(ea.a.p("CGEEZWxwInIpZANEXWE7b2c=", "AWJw9E8q"), th2);
                return str;
            }
            return str;
        }
    }

    public final String C(int i10) {
        int i11 = i10 / 1000;
        String format = String.format(Locale.ENGLISH, ea.a.p("FjB4ZA==", "GLWWM040"), Arrays.copyOf(new Object[]{Integer.valueOf(i10 % 1000)}, 1));
        g.d(format, ea.a.p("KW9DbRh0H2w1YytsECxIZlpyA2ExLEUqFHIScyk=", "uJ1guuxf"));
        return i11 + "," + format;
    }

    @Override // f5.b
    public final int f() {
        return this.f5159t;
    }

    @Override // f5.b
    public final String j() {
        return this.F;
    }

    @Override // f5.b
    public final String l() {
        String c;
        a x4 = x();
        if (x4 == null || (c = x4.c(this.f5156q)) == null) {
            return ea.a.p("Km4=", "vKfuyDVB");
        }
        return c;
    }

    @Override // f5.a, android.app.Dialog, f5.b
    public final void show() {
        super.show();
        Window window = getWindow();
        if (window != null) {
            Context context = getContext();
            g.d(context, ea.a.p("LG9fdBx4dA==", "QE2xNQBk"));
            i.a(window, !pdf.pdfreader.viewer.editor.free.utils.extension.c.h(context));
        }
        if (x() != null) {
            new a.C0030a().a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int w() {
        /*
            r7 = this;
            pdf.pdfreader.viewer.editor.free.utils.c1 r0 = pdf.pdfreader.viewer.editor.free.utils.c1.f28564a
            android.app.Activity r0 = r7.f5156q
            java.lang.String r1 = "context"
            kotlin.jvm.internal.g.e(r0, r1)
            java.lang.String r1 = "RnAschJkB18fYUxfHHMzchsxBjI="
            java.lang.String r2 = "ARa1iLaj"
            java.lang.String r1 = ea.a.p(r1, r2)
            java.lang.String r2 = ""
            java.lang.String r1 = de.e.h(r1, r2)
            java.lang.String r2 = "UG8lZhpn"
            java.lang.String r3 = "t12rUzo5"
            int r2 = android.support.v4.media.session.h.b(r2, r3, r1)
            if (r2 != 0) goto L24
            r2 = 1
            goto L25
        L24:
            r2 = 0
        L25:
            r3 = 130000(0x1fbd0, float:1.82169E-40)
            if (r2 == 0) goto L32
            java.lang.String r1 = "OnBWchhkUl83YTJfAHMNcmoxWjJlZABmD3UudFUtWy1iMQIwSTAw"
            java.lang.String r2 = "JpY8nBuv"
            ea.a.p(r1, r2)
            goto L3b
        L32:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L37
            goto L3c
        L37:
            r1 = move-exception
            r1.printStackTrace()
        L3b:
            r1 = r3
        L3c:
            h5.c$a r2 = h5.c.f18014h
            h5.c r4 = r2.a(r0)
            int r4 = r4.d()
            if (r1 >= r4) goto L57
            hg.c r0 = new hg.c
            r1 = 110000(0x1adb0, float:1.54143E-40)
            r0.<init>(r1, r3)
            kotlin.random.Random$Default r1 = kotlin.random.Random.Default
            int r0 = ge.a.N(r1, r0)
            return r0
        L57:
            int r1 = r1 - r4
            float r1 = (float) r1
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            float r1 = r1 * r3
            double r5 = (double) r1
            double r5 = java.lang.Math.floor(r5)
            float r1 = (float) r5
            int r1 = (int) r1
            int r1 = r1 + r4
            if (r4 != r1) goto L68
            goto L75
        L68:
            hg.c r3 = new hg.c
            int r4 = r4 + 1
            r3.<init>(r4, r1)
            kotlin.random.Random$Default r1 = kotlin.random.Random.Default
            int r4 = ge.a.N(r1, r3)
        L75:
            h5.c r0 = r2.a(r0)
            r0.h(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ap.d.w():int");
    }

    public final void y() {
        setCanceledOnTouchOutside(false);
        s().J = true;
        s().K = false;
        setOnCancelListener(new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.b(this, 2));
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ap.b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c cVar;
                String p10 = ea.a.p("MGgcc3Ew", "X9DuUZyZ");
                d dVar = d.this;
                g.e(dVar, p10);
                d.x();
                f5.c cVar2 = dVar.f5160u;
                if (cVar2 != null && (cVar = ReaderHomeActivity.this.E0) != null) {
                    Boolean bool = Boolean.FALSE;
                    pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.i iVar = cVar.f27673g;
                    iVar.f28987b = bool;
                    iVar.c = false;
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:221:0x04bf, code lost:
        if (r0 == null) goto L201;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z() {
        /*
            Method dump skipped, instructions count: 1362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ap.d.z():void");
    }
}
