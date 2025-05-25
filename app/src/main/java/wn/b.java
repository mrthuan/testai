package wn;

import android.content.Context;
import androidx.lifecycle.w;
import java.util.ArrayList;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.q0;

/* compiled from: PdfGlobalData.kt */
/* loaded from: classes3.dex */
public final class b {
    public static int c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f31388d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f31389e;

    /* renamed from: f  reason: collision with root package name */
    public static int f31390f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f31391g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f31392h;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f31393i;

    /* renamed from: a  reason: collision with root package name */
    public static final w<ArrayList<PdfPreviewEntity>> f31386a = new w<>();

    /* renamed from: b  reason: collision with root package name */
    public static final w<Integer> f31387b = new w<>(-1);

    /* renamed from: j  reason: collision with root package name */
    public static final w<Boolean> f31394j = new w<>(Boolean.FALSE);

    /* JADX WARN: Removed duplicated region for block: B:55:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wn.b.a(boolean, boolean):void");
    }

    public static void b() {
        f31390f++;
        q0.x(ReaderPdfApplication.m(), f31390f, "read_file_cnt");
    }

    public static void c() {
        Context m10 = ReaderPdfApplication.m();
        g.d(m10, ea.a.p("VGU_SR1zFmEcY1EoKQ==", "Z5L0jPNn"));
        boolean g10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.g(m10);
        w<Boolean> wVar = f31394j;
        if (!g.a(wVar.d(), Boolean.valueOf(g10))) {
            String str = n0.f28727a;
            wVar.j(Boolean.valueOf(g10));
        }
    }

    public static void d() {
        if (!f31388d) {
            return;
        }
        int i10 = c + 1;
        c = i10;
        if (i10 == 3) {
            tn.a.b(ReaderPdfApplication.m(), ea.a.p("UmQ=", "0NyQUqsK"), ea.a.p("I2Q9dDRwJ2YXZAluUV8jaEppMWU=", "HqFTkC1j"));
        } else if (i10 == 4) {
            tn.a.b(ReaderPdfApplication.m(), ea.a.p("UmQ=", "iuw5iTCH"), ea.a.p("KmRYdCZwU2YFZCVuEF8Ob0By", "8ZijnxPb"));
        }
    }

    public static String e() {
        String str;
        String str2;
        if (f31389e) {
            str = "IWV3";
            str2 = "z3MkUMiR";
        } else {
            str = "IGxk";
            str2 = "MD6niOzh";
        }
        return ea.a.p(str, str2);
    }

    public static void f(boolean z10) {
        Context m10 = ReaderPdfApplication.m();
        int l10 = q0.l(m10, -1, "read_file_cnt");
        if (l10 > 0) {
            q0.x(m10, 0, "read_file_cnt");
        }
        if (l10 > 0) {
            f31390f = 0;
            String e10 = e();
            if (!z10 && Math.max(q0.l(ReaderPdfApplication.m(), 0, "key_app_open_times"), 0) < 2) {
                e10 = ea.a.p("IWV3", "oJF1ZfXf");
            }
            Context m11 = ReaderPdfApplication.m();
            String p10 = ea.a.p("RWkudyxmC2wXcw==", "abhNXjzl");
            String p11 = ea.a.p("RWkudyxmC2xl", "PJ0vKLHg");
            tn.a.d(m11, p10, p11, e10 + "_" + l10, false);
        }
    }
}
