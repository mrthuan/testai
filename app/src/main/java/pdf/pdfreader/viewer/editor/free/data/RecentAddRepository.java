package pdf.pdfreader.viewer.editor.free.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.flow.r;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.utils.l;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: RecentAddRepository.kt */
/* loaded from: classes3.dex */
public final class RecentAddRepository {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f24181a;

    /* renamed from: b  reason: collision with root package name */
    public static final tf.c f24182b = kotlin.a.a(new cg.a<List<PdfPreviewEntity>>() { // from class: pdf.pdfreader.viewer.editor.free.data.RecentAddRepository$_allFileRecent$2
        @Override // cg.a
        public final List<PdfPreviewEntity> invoke() {
            return new ArrayList();
        }
    });
    public static final tf.c c = kotlin.a.a(new cg.a<List<PdfPreviewEntity>>() { // from class: pdf.pdfreader.viewer.editor.free.data.RecentAddRepository$_pdfRecent$2
        @Override // cg.a
        public final List<PdfPreviewEntity> invoke() {
            return new ArrayList();
        }
    });

    /* renamed from: d  reason: collision with root package name */
    public static final tf.c f24183d = kotlin.a.a(new cg.a<List<PdfPreviewEntity>>() { // from class: pdf.pdfreader.viewer.editor.free.data.RecentAddRepository$_wordRecent$2
        @Override // cg.a
        public final List<PdfPreviewEntity> invoke() {
            return new ArrayList();
        }
    });

    /* renamed from: e  reason: collision with root package name */
    public static final tf.c f24184e = kotlin.a.a(new cg.a<List<PdfPreviewEntity>>() { // from class: pdf.pdfreader.viewer.editor.free.data.RecentAddRepository$_excelRecent$2
        @Override // cg.a
        public final List<PdfPreviewEntity> invoke() {
            return new ArrayList();
        }
    });

    /* renamed from: f  reason: collision with root package name */
    public static final tf.c f24185f = kotlin.a.a(new cg.a<List<PdfPreviewEntity>>() { // from class: pdf.pdfreader.viewer.editor.free.data.RecentAddRepository$_pptRecent$2
        @Override // cg.a
        public final List<PdfPreviewEntity> invoke() {
            return new ArrayList();
        }
    });

    /* renamed from: g  reason: collision with root package name */
    public static final tf.c f24186g = kotlin.a.a(new cg.a<r<List<? extends PdfPreviewEntity>>>() { // from class: pdf.pdfreader.viewer.editor.free.data.RecentAddRepository$_allFileRecentAddFlow$2
        @Override // cg.a
        public final r<List<? extends PdfPreviewEntity>> invoke() {
            return t0.a(EmptyList.INSTANCE);
        }
    });

    /* renamed from: h  reason: collision with root package name */
    public static final tf.c f24187h = kotlin.a.a(new cg.a<r<List<? extends PdfPreviewEntity>>>() { // from class: pdf.pdfreader.viewer.editor.free.data.RecentAddRepository$_pdfRecentAddFlow$2
        @Override // cg.a
        public final r<List<? extends PdfPreviewEntity>> invoke() {
            return t0.a(EmptyList.INSTANCE);
        }
    });

    /* renamed from: i  reason: collision with root package name */
    public static final tf.c f24188i = kotlin.a.a(new cg.a<r<List<? extends PdfPreviewEntity>>>() { // from class: pdf.pdfreader.viewer.editor.free.data.RecentAddRepository$_wordRecentAddFlow$2
        @Override // cg.a
        public final r<List<? extends PdfPreviewEntity>> invoke() {
            return t0.a(EmptyList.INSTANCE);
        }
    });

    /* renamed from: j  reason: collision with root package name */
    public static final tf.c f24189j = kotlin.a.a(new cg.a<r<List<? extends PdfPreviewEntity>>>() { // from class: pdf.pdfreader.viewer.editor.free.data.RecentAddRepository$_excelRecentAddFlow$2
        @Override // cg.a
        public final r<List<? extends PdfPreviewEntity>> invoke() {
            return t0.a(EmptyList.INSTANCE);
        }
    });

    /* renamed from: k  reason: collision with root package name */
    public static final tf.c f24190k = kotlin.a.a(new cg.a<r<List<? extends PdfPreviewEntity>>>() { // from class: pdf.pdfreader.viewer.editor.free.data.RecentAddRepository$_pptRecentAddFlow$2
        @Override // cg.a
        public final r<List<? extends PdfPreviewEntity>> invoke() {
            return t0.a(EmptyList.INSTANCE);
        }
    });

    /* renamed from: l  reason: collision with root package name */
    public static final tf.c f24191l = kotlin.a.a(new cg.a<r<Integer>>() { // from class: pdf.pdfreader.viewer.editor.free.data.RecentAddRepository$_allFileRecentAddTipsCountFlow$2
        @Override // cg.a
        public final r<Integer> invoke() {
            return t0.a(0);
        }
    });

    /* renamed from: m  reason: collision with root package name */
    public static final tf.c f24192m = kotlin.a.a(new cg.a<r<Integer>>() { // from class: pdf.pdfreader.viewer.editor.free.data.RecentAddRepository$_pdfRecentAddTipsCountFlow$2
        @Override // cg.a
        public final r<Integer> invoke() {
            return t0.a(0);
        }
    });

    /* renamed from: n  reason: collision with root package name */
    public static final tf.c f24193n = kotlin.a.a(new cg.a<r<Integer>>() { // from class: pdf.pdfreader.viewer.editor.free.data.RecentAddRepository$_wordRecentAddTipsCountFlow$2
        @Override // cg.a
        public final r<Integer> invoke() {
            return t0.a(0);
        }
    });

    /* renamed from: o  reason: collision with root package name */
    public static final tf.c f24194o = kotlin.a.a(new cg.a<r<Integer>>() { // from class: pdf.pdfreader.viewer.editor.free.data.RecentAddRepository$_excelRecentAddTipsCountFlow$2
        @Override // cg.a
        public final r<Integer> invoke() {
            return t0.a(0);
        }
    });

    /* renamed from: p  reason: collision with root package name */
    public static final tf.c f24195p = kotlin.a.a(new cg.a<r<Integer>>() { // from class: pdf.pdfreader.viewer.editor.free.data.RecentAddRepository$_pptRecentAddTipsCountFlow$2
        @Override // cg.a
        public final r<Integer> invoke() {
            return t0.a(0);
        }
    });

    /* renamed from: q  reason: collision with root package name */
    public static final r f24196q = c();

    /* renamed from: r  reason: collision with root package name */
    public static final r f24197r = i();

    /* renamed from: s  reason: collision with root package name */
    public static final r f24198s = o();

    /* renamed from: t  reason: collision with root package name */
    public static final r f24199t = f();

    /* renamed from: u  reason: collision with root package name */
    public static final r f24200u = l();

    /* renamed from: v  reason: collision with root package name */
    public static final r f24201v = d();

    public static void a(List list) {
        Object b10;
        Object b11;
        Object b12;
        Object b13;
        Object b14;
        Object b15;
        Object b16;
        Object b17;
        Object b18;
        Object b19;
        long j10;
        long j11;
        String otherStrOne;
        Context m10 = ReaderPdfApplication.m();
        long o10 = q0.o();
        long i10 = q0.i();
        long max = Math.max(q0.n(m10, 0), o10);
        long max2 = Math.max(q0.n(m10, 1), max);
        long max3 = Math.max(q0.n(m10, 2), max);
        long max4 = Math.max(q0.n(m10, 3), max);
        long max5 = Math.max(q0.n(m10, 4), max);
        int intValue = ((Number) j().b()).intValue();
        int intValue2 = ((Number) p().b()).intValue();
        int intValue3 = ((Number) g().b()).intValue();
        int intValue4 = ((Number) m().b()).intValue();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i11 = intValue;
            PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) it.next();
            if (pdfPreviewEntity.getDate() > o10 && pdfPreviewEntity.getId() > i10) {
                j10 = o10;
                String path = pdfPreviewEntity.getPath();
                j11 = i10;
                g.d(path, ea.a.p("WnRlcBJ0aA==", "v0P2OHcW"));
                if (!l.c(path) && (otherStrOne = pdfPreviewEntity.getOtherStrOne()) != null) {
                    switch (otherStrOne.hashCode()) {
                        case 79058:
                            if (otherStrOne.equals(ea.a.p("CURG", "XLYJ9gow"))) {
                                b().add(pdfPreviewEntity);
                                h().add(pdfPreviewEntity);
                                if (pdfPreviewEntity.getDate() > max2) {
                                    intValue = i11 + 1;
                                    continue;
                                    o10 = j10;
                                    i10 = j11;
                                }
                            }
                            break;
                        case 79444:
                            if (otherStrOne.equals(ea.a.p("Y1BU", "JD40zW4L"))) {
                                b().add(pdfPreviewEntity);
                                k().add(pdfPreviewEntity);
                                if (pdfPreviewEntity.getDate() > max5) {
                                    intValue4++;
                                    break;
                                }
                            }
                            break;
                        case 2670346:
                            if (otherStrOne.equals(ea.a.p("GE9jRA==", "OrhIFtXL"))) {
                                b().add(pdfPreviewEntity);
                                n().add(pdfPreviewEntity);
                                if (pdfPreviewEntity.getDate() > max3) {
                                    intValue2++;
                                    break;
                                }
                            }
                            break;
                        case 66411159:
                            if (otherStrOne.equals(ea.a.p("dlgIRUw=", "2f0aU5X8"))) {
                                b().add(pdfPreviewEntity);
                                e().add(pdfPreviewEntity);
                                if (pdfPreviewEntity.getDate() > max4) {
                                    intValue3++;
                                    break;
                                }
                            }
                            break;
                    }
                }
            } else {
                j10 = o10;
                j11 = i10;
            }
            intValue = i11;
            o10 = j10;
            i10 = j11;
        }
        int i12 = intValue;
        r c10 = c();
        do {
            b10 = c10.b();
            List list2 = (List) b10;
        } while (!c10.c(b10, m.E0(b())));
        r i13 = i();
        do {
            b11 = i13.b();
            List list3 = (List) b11;
        } while (!i13.c(b11, m.E0(h())));
        r o11 = o();
        do {
            b12 = o11.b();
            List list4 = (List) b12;
        } while (!o11.c(b12, m.E0(n())));
        r f10 = f();
        do {
            b13 = f10.b();
            List list5 = (List) b13;
        } while (!f10.c(b13, m.E0(e())));
        r l10 = l();
        do {
            b14 = l10.b();
            List list6 = (List) b14;
        } while (!l10.c(b14, m.E0(k())));
        r d10 = d();
        do {
            b15 = d10.b();
            ((Number) b15).intValue();
        } while (!d10.c(b15, Integer.valueOf(i12 + intValue2 + intValue3 + intValue4)));
        r j12 = j();
        do {
            b16 = j12.b();
            ((Number) b16).intValue();
        } while (!j12.c(b16, Integer.valueOf(i12)));
        r p10 = p();
        do {
            b17 = p10.b();
            ((Number) b17).intValue();
        } while (!p10.c(b17, Integer.valueOf(intValue2)));
        r g10 = g();
        do {
            b18 = g10.b();
            ((Number) b18).intValue();
        } while (!g10.c(b18, Integer.valueOf(intValue3)));
        r m11 = m();
        do {
            b19 = m11.b();
            ((Number) b19).intValue();
        } while (!m11.c(b19, Integer.valueOf(intValue4)));
    }

    public static List b() {
        return (List) f24182b.getValue();
    }

    public static r c() {
        return (r) f24186g.getValue();
    }

    public static r d() {
        return (r) f24191l.getValue();
    }

    public static List e() {
        return (List) f24184e.getValue();
    }

    public static r f() {
        return (r) f24189j.getValue();
    }

    public static r g() {
        return (r) f24194o.getValue();
    }

    public static List h() {
        return (List) c.getValue();
    }

    public static r i() {
        return (r) f24187h.getValue();
    }

    public static r j() {
        return (r) f24192m.getValue();
    }

    public static List k() {
        return (List) f24185f.getValue();
    }

    public static r l() {
        return (r) f24190k.getValue();
    }

    public static r m() {
        return (r) f24195p.getValue();
    }

    public static List n() {
        return (List) f24183d.getValue();
    }

    public static r o() {
        return (r) f24188i.getValue();
    }

    public static r p() {
        return (r) f24193n.getValue();
    }

    public static void q(List list) {
        long j10;
        long j11;
        String otherStrOne;
        g.e(list, "list");
        if (f24181a) {
            return;
        }
        f24181a = true;
        Context m10 = ReaderPdfApplication.m();
        long o10 = q0.o();
        long i10 = q0.i();
        int i11 = 0;
        long max = Math.max(q0.n(m10, 0), o10);
        long max2 = Math.max(q0.n(m10, 1), max);
        long max3 = Math.max(q0.n(m10, 2), max);
        long max4 = Math.max(q0.n(m10, 3), max);
        long max5 = Math.max(q0.n(m10, 4), max);
        b().clear();
        h().clear();
        n().clear();
        e().clear();
        k().clear();
        Iterator it = list.iterator();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (it.hasNext()) {
            Iterator it2 = it;
            PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) it.next();
            if (pdfPreviewEntity.getDate() > o10 && pdfPreviewEntity.getId() > i10) {
                j10 = o10;
                String path = pdfPreviewEntity.getPath();
                j11 = i10;
                g.d(path, ea.a.p("JnQfcBh0aA==", "oy6s6VQr"));
                if (!l.c(path) && (otherStrOne = pdfPreviewEntity.getOtherStrOne()) != null) {
                    switch (otherStrOne.hashCode()) {
                        case 79058:
                            if (!otherStrOne.equals(ea.a.p("H0RG", "QPiQulCT"))) {
                                break;
                            } else {
                                b().add(pdfPreviewEntity);
                                h().add(pdfPreviewEntity);
                                if (pdfPreviewEntity.getDate() > max2) {
                                    i11++;
                                    break;
                                } else {
                                    continue;
                                }
                            }
                        case 79444:
                            if (!otherStrOne.equals(ea.a.p("H1BU", "IVJIdhkd"))) {
                                break;
                            } else {
                                b().add(pdfPreviewEntity);
                                k().add(pdfPreviewEntity);
                                if (pdfPreviewEntity.getDate() > max5) {
                                    i14++;
                                    break;
                                } else {
                                    continue;
                                }
                            }
                        case 2670346:
                            if (!otherStrOne.equals(ea.a.p("ZE8ZRA==", "0jpIkZ5f"))) {
                                break;
                            } else {
                                b().add(pdfPreviewEntity);
                                n().add(pdfPreviewEntity);
                                if (pdfPreviewEntity.getDate() > max3) {
                                    i12++;
                                    break;
                                } else {
                                    continue;
                                }
                            }
                        case 66411159:
                            if (!otherStrOne.equals(ea.a.p("ClhyRUw=", "tuydehni"))) {
                                break;
                            } else {
                                b().add(pdfPreviewEntity);
                                e().add(pdfPreviewEntity);
                                if (pdfPreviewEntity.getDate() > max4) {
                                    i13++;
                                    break;
                                } else {
                                    continue;
                                }
                            }
                    }
                }
            } else {
                j10 = o10;
                j11 = i10;
            }
            it = it2;
            o10 = j10;
            i10 = j11;
        }
        c().setValue(m.E0(b()));
        i().setValue(m.E0(h()));
        o().setValue(m.E0(n()));
        f().setValue(m.E0(e()));
        l().setValue(m.E0(k()));
        d().setValue(Integer.valueOf(i11 + i12 + i13 + i14));
        j().setValue(Integer.valueOf(i11));
        p().setValue(Integer.valueOf(i12));
        g().setValue(Integer.valueOf(i13));
        m().setValue(Integer.valueOf(i14));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void r(String str) {
        r rVar;
        switch (str.hashCode()) {
            case 64897:
                if (str.equals(ea.a.p("ckxM", "eb1XGESO"))) {
                    d().setValue(0);
                    j().setValue(0);
                    p().setValue(0);
                    g().setValue(0);
                    m().setValue(0);
                }
                rVar = null;
                break;
            case 79058:
                if (str.equals(ea.a.p("H0RG", "IoDoO1ps"))) {
                    rVar = j();
                    break;
                }
                rVar = null;
                break;
            case 79444:
                if (str.equals(ea.a.p("Y1BU", "h5nzaY1v"))) {
                    rVar = m();
                    break;
                }
                rVar = null;
                break;
            case 2670346:
                if (str.equals(ea.a.p("GE9jRA==", "lj1vDVBm"))) {
                    rVar = p();
                    break;
                }
                rVar = null;
                break;
            case 66411159:
                if (str.equals(ea.a.p("ElgyRUw=", "AjWqYY1j"))) {
                    rVar = g();
                    break;
                }
                rVar = null;
                break;
            default:
                rVar = null;
                break;
        }
        if (rVar != null) {
            int intValue = ((Number) rVar.b()).intValue();
            rVar.setValue(0);
            d().setValue(Integer.valueOf(Math.max(0, ((Number) d().b()).intValue() - intValue)));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void s(PdfPreviewEntity pdfPreviewEntity) {
        List list;
        r rVar;
        if (t0.v0(b(), pdfPreviewEntity)) {
            c().setValue(m.E0(b()));
            String otherStrOne = pdfPreviewEntity.getOtherStrOne();
            if (otherStrOne != null) {
                switch (otherStrOne.hashCode()) {
                    case 79058:
                        if (otherStrOne.equals(ea.a.p("GERG", "ZtH9mDO2"))) {
                            list = h();
                            rVar = i();
                            break;
                        }
                        break;
                    case 79444:
                        if (otherStrOne.equals(ea.a.p("Y1BU", "8S7zxcY9"))) {
                            list = k();
                            rVar = l();
                            break;
                        }
                        break;
                    case 2670346:
                        if (otherStrOne.equals(ea.a.p("ZE8ZRA==", "Eb9nBrSF"))) {
                            list = n();
                            rVar = o();
                            break;
                        }
                        break;
                    case 66411159:
                        if (otherStrOne.equals(ea.a.p("dFh6RUw=", "lr19MWhc"))) {
                            list = e();
                            rVar = f();
                            break;
                        }
                        break;
                }
                if (list == null && rVar != null && t0.v0(list, pdfPreviewEntity)) {
                    rVar.setValue(m.E0(list));
                    return;
                }
                return;
            }
            list = null;
            rVar = null;
            if (list == null) {
            }
        }
    }
}
