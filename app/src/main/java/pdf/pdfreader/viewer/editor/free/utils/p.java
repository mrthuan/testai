package pdf.pdfreader.viewer.editor.free.utils;

import android.content.Context;
import android.text.TextUtils;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity;

/* compiled from: FileTypeEventUtils.java */
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final String f28740a = ea.a.p("Q2Rm", "6FMEtESu");

    /* renamed from: b  reason: collision with root package name */
    public static final String f28741b = ea.a.p("OG9DZA==", "kAiY6Rlx");
    public static final String c = ea.a.p("UXghZWw=", "YE4BmchH");

    /* renamed from: d  reason: collision with root package name */
    public static final String f28742d = ea.a.p("P3B0", "cmxkFYcR");

    public static String a(PdfPreviewEntity pdfPreviewEntity, boolean z10, String str) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append(ea.a.p("HG8fZV8=", "TKqmAqK9"));
        } else {
            sb2.append(ea.a.p("P2FWZV8=", "TXDjLL4m"));
        }
        if (str != null) {
            sb2.append(str);
            sb2.append(ea.a.p("Xw==", "BfDbJ8rc"));
        }
        if (pdfPreviewEntity != null) {
            sb2.append(e(pdfPreviewEntity.getOtherStrOne(), pdfPreviewEntity.getPath()));
        }
        return sb2.toString();
    }

    public static void b(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        if (TextUtils.isEmpty(str3)) {
            tn.a.b(context, str, str2);
        } else {
            tn.a.d(context, str, str2, str3, false);
        }
    }

    public static void c(jl.a aVar, PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        String d10 = d(pdfPreviewEntity);
        if (z10) {
            b(aVar, ea.a.p("OWlUdyZtWHJl", "AkRRGuLB"), ea.a.p("RWkudx5vEGUtdVptCHI9XydsW2Nr", "Ji1jA5dE"), d10);
        } else {
            b(aVar, ea.a.p("RWkudyxtDXJl", "gvCIzga5"), ea.a.p("B2kOdxhvHmUXbQdyX180bFFjaw==", "MCqkulyI"), d10);
        }
    }

    public static String d(PdfPreviewEntity pdfPreviewEntity) {
        if (pdfPreviewEntity != null) {
            return e(pdfPreviewEntity.getOtherStrOne(), pdfPreviewEntity.getPath());
        }
        return "";
    }

    public static String e(String str, String str2) {
        if (TextUtils.equals(str, ea.a.p("CURG", "z7YpJNQI"))) {
            return f28740a;
        }
        boolean equals = TextUtils.equals(str, ea.a.p("GE9jRA==", "wxcLGoie"));
        String str3 = f28741b;
        if (!equals) {
            if (TextUtils.equals(str, ea.a.p("dlgIRUw=", "gIM0nn3E"))) {
                if (str2 == null || !str2.endsWith(ea.a.p("YWNCdg==", "gdhzvZ1A"))) {
                    return c;
                }
            } else if (TextUtils.equals(str, ea.a.p("OVBU", "xHizb2kh"))) {
                return f28742d;
            } else {
                return "";
            }
        }
        return str3;
    }

    public static void f(jl.a aVar, PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        b(aVar, ea.a.p("RWkudw==", "yXHplDlS"), ea.a.p("OWlUdyZwVmc_Xy5vG2U=", "8ZfJdgIm"), a(pdfPreviewEntity, z10, null));
    }

    public static void g(jl.a aVar, PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        b(aVar, ea.a.p("RWkudw==", "GLNhqKr5"), ea.a.p("RWkudyxwA2cXX1FyG29y", "W6DC3SRx"), a(pdfPreviewEntity, z10, null));
    }

    public static void h(Context context, PdfPreviewEntity pdfPreviewEntity, boolean z10, String str) {
        b(context, ea.a.p("RWkudw==", "qlu8ESfX"), ea.a.p("RWkudyxwA2cXX0doBnc=", "Aq1Kvo5X"), a(pdfPreviewEntity, z10, str));
    }

    public static void i(OperatePDFWatcherActivity operatePDFWatcherActivity, String str) {
        b(operatePDFWatcherActivity, ea.a.p("LG9fdhxyQ18rdSN0", "tR68uJiQ"), ea.a.p("FG8ZdgFyTWYpaQpfW2s=", "Zswwd9ke"), str);
    }

    public static void j(OperatePDFWatcherActivity operatePDFWatcherActivity, String str) {
        b(operatePDFWatcherActivity, ea.a.p("UG8ldhZyFl8DdV10", "gH001WEm"), ea.a.p("LG9fdhxyQ2Y7aSZfB2UEZVRzZQ==", "6GWndxzt"), str);
    }

    public static void k(Context context, String str) {
        b(context, ea.a.p("L28JdgFyTF85dQ90", "ALLgd87y"), ea.a.p("UG8ldhZyFmYTaVhfGmg5dw==", "034avIu3"), str);
    }

    public static void l(OperatePDFWatcherActivity operatePDFWatcherActivity, String str) {
        b(operatePDFWatcherActivity, ea.a.p("UG8ldhZyFl8DdV10", "IZ88jaxj"), ea.a.p("UG8ldhZyFnEHaUBfCmw_Y2s=", "3RnS2AQi"), str);
    }

    public static void m(Context context, String str) {
        b(context, ea.a.p("LG9fdhxyQ18rdSN0", "vULssC68"), ea.a.p("Im9Xdi5yA3E9aRJfR2g4dw==", "zXA9Kwp7"), str);
    }

    public static void n(BasePdf2ImageActivity basePdf2ImageActivity, String str) {
        b(basePdf2ImageActivity, ea.a.p("KWlfaQpo", "RPleARQF"), ea.a.p("KWlfaQpoaGE2Yj9tKmMEaVZr", "yQsAittB"), str);
    }

    public static void o(Context context, String str) {
        b(context, ea.a.p("KWlfaQpo", "OkrGZAT8"), ea.a.p("AmlaaQNoMWIpYw1fV2w-Y2s=", "fcd4pnwH"), str);
    }

    public static void p(OperatePDFWatcherActivity operatePDFWatcherActivity, String str) {
        b(operatePDFWatcherActivity, ea.a.p("ImknaTto", "k6DIHfkY"), ea.a.p("VWklaQBoPXMaYUZlNmM6aSdr", "EZkHQ940"), str);
    }

    public static void q(OperatePDFWatcherActivity operatePDFWatcherActivity, String str) {
        b(operatePDFWatcherActivity, ea.a.p("VWklaQBo", "gva5y5hM"), ea.a.p("VWklaQBoPXMab3c=", "ZuNYa8yT"), str);
    }

    public static void r(jl.a aVar, PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        String str;
        String str2;
        String p10 = ea.a.p("N2kOdw==", "97AkqeME");
        String p11 = ea.a.p("RWkudyxzCmEAZWtjBWk1aw==", "EdJip0vx");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d(pdfPreviewEntity));
        sb2.append(ea.a.p("Xw==", "KhfP7AFQ"));
        if (z10) {
            str = "QWUtbBx3";
            str2 = "5HFxcksI";
        } else {
            str = "IW9DbRhs";
            str2 = "pFVzPdcb";
        }
        sb2.append(ea.a.p(str, str2));
        b(aVar, p10, p11, sb2.toString());
    }

    public static void s(jl.a aVar, PdfPreviewEntity pdfPreviewEntity, boolean z10) {
        String str;
        String str2;
        String p10 = ea.a.p("RWkudw==", "SC8TkAtn");
        String p11 = ea.a.p("OWlUdyZtWHI_XylsHGNr", "gRDFjhLx");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d(pdfPreviewEntity));
        sb2.append(ea.a.p("Xw==", "RnEB29Bk"));
        if (z10) {
            str = "QWUtbBx3";
            str2 = "5HFxcksI";
        } else {
            str = "IW9DbRhs";
            str2 = "pFVzPdcb";
        }
        sb2.append(ea.a.p(str, str2));
        b(aVar, p10, p11, sb2.toString());
    }

    public static void t(jl.a aVar, PdfPreviewEntity pdfPreviewEntity, boolean z10, boolean z11) {
        String str;
        String str2;
        String p10 = ea.a.p("RWkudw==", "xroso56C");
        String p11 = ea.a.p("PGk0dxRoHHIheglua2M7aVtr", "7ZJQKsYN");
        StringBuilder sb2 = new StringBuilder();
        if (pdfPreviewEntity != null) {
            sb2.append(e(pdfPreviewEntity.getOtherStrOne(), pdfPreviewEntity.getPath()) + ea.a.p("Xw==", "tuumFEeM"));
        }
        if (z11) {
            str = "QWUtbBx3";
            str2 = "5HFxcksI";
        } else {
            str = "IW9DbRhs";
            str2 = "pFVzPdcb";
        }
        sb2.append(ea.a.p(str, str2));
        sb2.append(ea.a.p("Xw==", "nK57m7hg"));
        if (z10) {
            sb2.append(ea.a.p("OWVDdBBjVmw=", "DTMkPzdf"));
        } else {
            sb2.append(ea.a.p("W285aQlvDHQTbA==", "wY800DQq"));
        }
        b(aVar, p10, p11, sb2.toString());
    }

    public static void u(Context context, PdfPreviewEntity pdfPreviewEntity) {
        b(context, ea.a.p("RWkudw==", "pSNoM4cv"), ea.a.p("OWlUdyZzUmEoYyJfBmgHdw==", "rPRbRxuP"), d(pdfPreviewEntity));
    }

    public static void v(Context context, String str) {
        b(context, ea.a.p("OWlUdw==", "DFg3NGOY"), ea.a.p("OWlUdyZ0X3U3XylsHGNr", "jAVucXh6"), str);
    }

    public static void w(Context context, String str) {
        b(context, ea.a.p("Omkddw==", "C9LxY3bE"), ea.a.p("RWkudyx0CnUfX0doBnc=", "7BxaftqP"), str);
    }

    public static void x(Context context, String str, PdfPreviewEntity pdfPreviewEntity) {
        String p10 = ea.a.p("RWkudw==", "Sp98F4Pz");
        String p11 = ea.a.p("OWlUdyZzX293", "6N3TY1Bv");
        StringBuilder k10 = a0.a.k(str);
        k10.append(ea.a.p("Xw==", "PX8wh4mt"));
        k10.append(d(pdfPreviewEntity));
        b(context, p10, p11, k10.toString());
    }
}
