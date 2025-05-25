package pdf.pdfreader.viewer.editor.free.utils.event;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import androidx.activity.f;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import tf.c;
import wn.b;

/* compiled from: EventCenter.kt */
/* loaded from: classes3.dex */
public final class EventCenter {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f28655a = false;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f28656b = false;
    public static boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f28657d = false;

    /* renamed from: e  reason: collision with root package name */
    public static String f28658e = "";

    /* renamed from: f  reason: collision with root package name */
    public static String f28659f = "";

    /* renamed from: g  reason: collision with root package name */
    public static String f28660g = "";

    /* renamed from: h  reason: collision with root package name */
    public static String f28661h = "";

    /* renamed from: i  reason: collision with root package name */
    public static boolean f28662i = false;

    /* renamed from: j  reason: collision with root package name */
    public static String f28663j = "";

    /* renamed from: n  reason: collision with root package name */
    public static boolean f28667n;

    /* renamed from: k  reason: collision with root package name */
    public static final c f28664k = kotlin.a.a(new cg.a<Set<String>>() { // from class: pdf.pdfreader.viewer.editor.free.utils.event.EventCenter$permissionShowEventPosted$2
        @Override // cg.a
        public final Set<String> invoke() {
            return new LinkedHashSet();
        }
    });

    /* renamed from: l  reason: collision with root package name */
    public static final c f28665l = kotlin.a.a(new cg.a<Set<String>>() { // from class: pdf.pdfreader.viewer.editor.free.utils.event.EventCenter$defaultFileShowTypes$2
        @Override // cg.a
        public final Set<String> invoke() {
            return new LinkedHashSet();
        }
    });

    /* renamed from: m  reason: collision with root package name */
    public static final c f28666m = kotlin.a.a(new cg.a<Set<String>>() { // from class: pdf.pdfreader.viewer.editor.free.utils.event.EventCenter$defaultFileClickTypes$2
        @Override // cg.a
        public final Set<String> invoke() {
            return new LinkedHashSet();
        }
    });

    /* renamed from: o  reason: collision with root package name */
    public static final CopyOnWriteArraySet<String> f28668o = new CopyOnWriteArraySet<>();

    /* compiled from: EventCenter.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static boolean f28669a;
    }

    public static final void a(Context context, String str) {
        g.e(context, "context");
        if (!f28667n) {
            tn.a.d(context, ea.a.p("UnA7XxxwB24=", "txmH435i"), ea.a.p("UnA7XxxwB24tZFtuZQ==", "cktD0K04"), ea.a.p("R28_YWw=", "6nl0gNTo"), false);
            tn.a.d(context, ea.a.p("M3ATXwJwBm4=", "jURcmcHl"), ea.a.p("VnAbXz9wLW4XZAluZQ==", "NQ7kPHox"), str, false);
            f28667n = true;
        }
    }

    public static final void b(Context context, String type) {
        g.e(context, "context");
        g.e(type, "type");
        c cVar = f28666m;
        if (((Set) cVar.getValue()).contains(type)) {
            return;
        }
        ((Set) cVar.getValue()).add(type);
        tn.a.d(context, ea.a.p("J29cZQ==", "ElXBxK2N"), ea.a.p("VWknZSxkB2YTdVh0NmM6aSdr", "JDcPAvca"), type, false);
    }

    public static final void c(Context context) {
        g.e(context, "context");
        if (b.f31388d) {
            String m10 = f.m(f28658e, "_", f28659f);
            c cVar = f28664k;
            if (((Set) cVar.getValue()).contains(m10)) {
                return;
            }
            ((Set) cVar.getValue()).add(m10);
            String p10 = ea.a.p("GmVOZhpvdw==", "fbt9vnPM");
            String p11 = ea.a.p("P2VDbRBfRGg1dw==", "e3UgsOfT");
            no.f.b(context).getClass();
            tn.a.d(context, p10, p11, a0.a.j(no.f.c(), "_", f28658e, "_total"), false);
            String p12 = ea.a.p("IWVGZhVvdw==", "WfQezTKg");
            String p13 = ea.a.p("KWVKbQNfOWgndw==", "q3Y8jJZR");
            no.f.b(context).getClass();
            tn.a.d(context, p12, p13, f.m(no.f.c(), "_", m10), false);
            f28663j = f28659f;
        }
    }

    public static final void d(Context context) {
        g.e(context, "context");
        if (!g.a(f28661h, ea.a.p("PHlCMTA=", "DAuikrtF")) && !g.a(f28661h, ea.a.p("P2VDMQ==", "jcCmBbVg")) && !g.a(f28661h, ea.a.p("P2VDMg==", "wthmV4vO"))) {
            return;
        }
        tn.a.d(context, ea.a.p("P2VDbRBzRGk1bg==", "m6gdsbp6"), ea.a.p("R28kbABwB3IfaQUwNnM-b3c=", "mgnmDral"), f.m(f28660g, "_", f28661h), false);
    }

    public static final void e(Context context) {
        g.e(context, "context");
        if (!g.a(f28661h, ea.a.p("XW8_aRBlUzE=", "GkbS3CZj")) && !g.a(f28661h, ea.a.p("QWVDMTE=", "vT11Hm6b"))) {
            return;
        }
        tn.a.d(context, ea.a.p("P2VDbRBzRGk1bg==", "2Retvo3A"), ea.a.p("LG8kbAtwJHIlaVcxa3M_b3c=", "G7XKxAr7"), f.m(f28660g, "_", f28661h), false);
    }

    public static final void f(String str) {
        boolean isExternalStorageManager;
        if (h1.c()) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (!isExternalStorageManager) {
                f28663j = str;
            }
        }
        f28659f = str;
    }

    public static final void sendLanguageRecallClickEvent(Context context, Intent intent) {
        String p10;
        String p11;
        String p12;
        g.e(context, "context");
        if (intent == null) {
            return;
        }
        if (intent.hasExtra(ea.a.p("WGUyXx9hDGcHYVNlNnIzYyVsXl8gcixt", "YlBaMW6d"))) {
            p10 = intent.getStringExtra(ea.a.p("JGVIXxVhWWcvYS1lKnINY1RsAl8jcgpt", "XL1rlTCB"));
            if (p10 == null) {
                p10 = ea.a.p("K28=", "TTEoH1kx");
            }
        } else {
            p10 = ea.a.p("XW8=", "dUgz6jb0");
        }
        if (intent.hasExtra(ea.a.p("WGUyXx9hDGcHYVNlNnIzYyVsXl8lbzZudA==", "Iydhkaf1"))) {
            p11 = intent.getStringExtra(ea.a.p("WGUyXx9hDGcHYVNlNnIzYyVsXl8lbzZudA==", "K5zyo9CU"));
            if (p11 == null) {
                p11 = ea.a.p("K28=", "N4EmeKF9");
            }
        } else {
            p11 = ea.a.p("IW8=", "Z3mY21gW");
        }
        if (intent.hasExtra(ea.a.p("HWUjXzphP2c9YQFla3IyY1lsPl85bFdu", "7XvZVQp8"))) {
            p12 = intent.getStringExtra(ea.a.p("B2UQXzhhJmc9YQFla3IyY1lsPl85bFdu", "U7liTHD8"));
            if (p12 == null) {
                p12 = ea.a.p("XW8=", "CoH1W5Ra");
            }
        } else {
            p12 = ea.a.p("IW8=", "bNb6PIKB");
        }
        String p13 = ea.a.p("Im8GaStl", "ubLrHnRh");
        String p14 = ea.a.p("XW8_aSxsA24VX1dsAGNr", "c7yA5m2q");
        tn.a.d(context, p13, p14, p10 + "_" + p11 + "_" + p12, false);
        a(context, ea.a.p("IW9FaRpl", "TWeNFuh8"));
    }
}
