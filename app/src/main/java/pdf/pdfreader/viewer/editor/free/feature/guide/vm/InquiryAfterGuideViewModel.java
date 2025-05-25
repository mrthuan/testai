package pdf.pdfreader.viewer.editor.free.feature.guide.vm;

import androidx.lifecycle.e0;
import androidx.lifecycle.j0;
import androidx.lifecycle.w;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.flow.v;
import pdf.pdfreader.viewer.editor.free.feature.guide.data.InquiryAfterGuideType;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuidePageFragment;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import zl.c;

/* compiled from: InquiryAfterGuideViewModel.kt */
/* loaded from: classes3.dex */
public final class InquiryAfterGuideViewModel extends j0 {

    /* renamed from: d  reason: collision with root package name */
    public final e0 f25040d;

    /* renamed from: e  reason: collision with root package name */
    public final v f25041e;

    /* renamed from: f  reason: collision with root package name */
    public final v f25042f;

    /* renamed from: g  reason: collision with root package name */
    public final w f25043g;

    /* renamed from: h  reason: collision with root package name */
    public final w f25044h;

    /* renamed from: i  reason: collision with root package name */
    public InquiryAfterGuideType f25045i;

    /* renamed from: j  reason: collision with root package name */
    public Locale f25046j;

    /* renamed from: k  reason: collision with root package name */
    public qm.a f25047k;

    /* renamed from: l  reason: collision with root package name */
    public qm.a f25048l;

    /* compiled from: InquiryAfterGuideViewModel.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25049a;

        static {
            int[] iArr = new int[InquiryAfterGuideType.values().length];
            try {
                iArr[InquiryAfterGuideType.ROLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InquiryAfterGuideType.FEATURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25049a = iArr;
        }
    }

    public InquiryAfterGuideViewModel(e0 e0Var) {
        Object obj;
        g.e(e0Var, ea.a.p("PGFHZR1TQ2EuZQJhG2QEZQ==", "djAFXOl1"));
        this.f25040d = e0Var;
        v d10 = ea.a.d(0, 7);
        this.f25041e = d10;
        this.f25042f = d10;
        this.f25043g = e0Var.b(ea.a.p("PW9dZSplW2U5dANuEWV4", "12rENilQ"));
        this.f25044h = e0Var.b(ea.a.p("VWUqdAZyB1MXbFFjHUk4ZCF4", "SlDhqpZQ"));
        String p10 = ea.a.p("LHVDchxuQ1A7Zy9GB2EPbVBuGlQ8cGU=", "rNZzcbF2");
        LinkedHashMap linkedHashMap = e0Var.f4039a;
        try {
            obj = linkedHashMap.get(p10);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(p10);
            e0.b bVar = (e0.b) e0Var.c.remove(p10);
            if (bVar != null) {
                bVar.f4044m = null;
            }
            e0Var.f4041d.remove(p10);
            obj = null;
        }
        this.f25045i = (InquiryAfterGuideType) obj;
    }

    public final boolean d() {
        if (this.f25045i == InquiryAfterGuideType.FEATURE) {
            c.c.getClass();
            if (((Number) c.f32420g.b(c.f32417d[2])).intValue() == 0) {
                return true;
            }
        }
        return false;
    }

    public final InquiryAfterGuidePageFragment e() {
        c.c.getClass();
        c.f32421h.c(c.f32417d[3], 0);
        InquiryAfterGuideType inquiryAfterGuideType = InquiryAfterGuideType.ROLE;
        this.f25040d.c(inquiryAfterGuideType, ea.a.p("LHVDchxuQ1A7Zy9GB2EPbVBuGlQ8cGU=", "s6AJWC2M"));
        this.f25045i = inquiryAfterGuideType;
        InquiryAfterGuidePageFragment.f25034e0.getClass();
        return InquiryAfterGuidePageFragment.a.a(inquiryAfterGuideType);
    }

    public final void f() {
        t0.d0(t0.X(this), null, null, new InquiryAfterGuideViewModel$sendPreviousEvent$1(this, null), 3);
    }
}
