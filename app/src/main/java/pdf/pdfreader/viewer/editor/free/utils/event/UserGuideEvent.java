package pdf.pdfreader.viewer.editor.free.utils.event;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.a;
import no.f;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import tf.c;
import wn.b;

/* compiled from: UserGuideEvent.kt */
/* loaded from: classes3.dex */
public final class UserGuideEvent {

    /* renamed from: a  reason: collision with root package name */
    public static final c f28677a = a.a(new cg.a<Set<Integer>>() { // from class: pdf.pdfreader.viewer.editor.free.utils.event.UserGuideEvent$showIndexRecord$2
        @Override // cg.a
        public final Set<Integer> invoke() {
            return new LinkedHashSet();
        }
    });

    /* renamed from: b  reason: collision with root package name */
    public static final c f28678b = a.a(new cg.a<Set<Integer>>() { // from class: pdf.pdfreader.viewer.editor.free.utils.event.UserGuideEvent$nextIndexRecord$2
        @Override // cg.a
        public final Set<Integer> invoke() {
            return new LinkedHashSet();
        }
    });
    public static final c c = a.a(new cg.a<Set<String>>() { // from class: pdf.pdfreader.viewer.editor.free.utils.event.UserGuideEvent$alreadySendEvent$2
        @Override // cg.a
        public final Set<String> invoke() {
            return new LinkedHashSet();
        }
    });

    /* renamed from: d  reason: collision with root package name */
    public static final c f28679d = a.a(new cg.a<List<? extends String>>() { // from class: pdf.pdfreader.viewer.editor.free.utils.event.UserGuideEvent$roleType$2
        @Override // cg.a
        public final List<? extends String> invoke() {
            return ge.a.I(ea.a.p("VmR1", "lUCHCAr5"), ea.a.p("LnJSaA==", "lnsjPGhV"), ea.a.p("I2VWYWw=", "wuvUGskV"), ea.a.p("UXU4aR1lEXM=", "AYR5NvdL"), ea.a.p("JnQ=", "1YQjzCri"), ea.a.p("QHQ-ZBZudA==", "ga066Mi4"), ea.a.p("J2VQbA1o", "TCcLhXMI"), ea.a.p("WW9i", "Cka1BADu"), ea.a.p("XHQjZXI=", "4eNbiWS4"));
        }
    });

    /* renamed from: e  reason: collision with root package name */
    public static final c f28680e = a.a(new cg.a<List<? extends String>>() { // from class: pdf.pdfreader.viewer.editor.free.utils.event.UserGuideEvent$featureType$2
        @Override // cg.a
        public final List<? extends String> invoke() {
            return ge.a.I(ea.a.p("Cm5dbw==", "9qk3RAYj"), ea.a.p("VmQidA==", "lPb70yxH"), ea.a.p("Jm1WMglkZg==", "p3Pe3P8u"), ea.a.p("QGMqbg==", "082h0luX"), ea.a.p("QGksbg==", "FW4r0Ox2"), ea.a.p("RG85ZEFwBmY=", "tJwVX3OS"), ea.a.p("G2UWZ1MvJXAkaXQ=", "qcvd6V8d"), ea.a.p("BHI0YTpl", "P7gQNv1f"), ea.a.p("P2FWZXM=", "nEtpG2BE"), ea.a.p("H2QXMlBtZw==", "1poq9Lhi"), ea.a.p("Umk=", "2f1lfw5a"));
        }
    });

    /* renamed from: f  reason: collision with root package name */
    public static int f28681f = -1;

    public static Set a() {
        return (Set) c.getValue();
    }

    public static void b() {
        if (b.f31389e) {
            Context m10 = ReaderPdfApplication.m();
            String p10 = ea.a.p("JmVDZg9vdw==", "6UH4c77i");
            String p11 = ea.a.p("KHVYZBxuUncFZCVuZQ==", "AMDmOId3");
            f.b(ReaderPdfApplication.m()).getClass();
            tn.a.d(m10, p10, p11, f.c(), false);
        }
    }

    public static void c() {
        if (b.f31389e) {
            Context m10 = ReaderPdfApplication.m();
            String p10 = ea.a.p("XWU8Zh9vdw==", "By5qWbup");
            String p11 = ea.a.p("VHUiZBZuB3ctc0BhG3QJYyhpUWs=", "5EpBIQdm");
            f.b(ReaderPdfApplication.m()).getClass();
            tn.a.d(m10, p10, p11, f.c(), false);
        }
    }

    public static void d(String str) {
        if (b.f31389e) {
            String concat = "asknew_back_click_".concat(str);
            if (a().contains(concat)) {
                return;
            }
            a().add(concat);
            tn.a.d(ReaderPdfApplication.m(), ea.a.p("XWU8Zh9vdw==", "jbaAB8j9"), ea.a.p("UnMgbhZ3PWITY19fCmw_Y2s=", "tMGe0VXg"), str, false);
        }
    }

    public static void e(String str) {
        if (b.f31389e) {
            String concat = "asknew_next_click_".concat(str);
            if (a().contains(concat)) {
                return;
            }
            a().add(concat);
            tn.a.d(ReaderPdfApplication.m(), ea.a.p("NGU5ZiRvdw==", "hCZNH3rE"), ea.a.p("LnNabhx3aG4_eD5fFmwBY2s=", "NDWZ4ZUy"), str, false);
        }
    }

    public static void f(String str) {
        if (b.f31389e) {
            String concat = "asknew_show_".concat(str);
            if (a().contains(concat)) {
                return;
            }
            a().add(concat);
            tn.a.d(ReaderPdfApplication.m(), ea.a.p("XWU8Zh9vdw==", "B5edc2W0"), ea.a.p("BXMlbgB3FXMgb3c=", "m7dNeJM2"), str, false);
        }
    }
}
