package pdf.pdfreader.viewer.editor.free.utils.event;

import android.content.Context;
import cl.b;
import ig.h;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.a;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.s.network.NetworkType;
import pdf.pdfreader.viewer.editor.free.feature.ai.data.AIQuickTag;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.c;
import tf.d;

/* compiled from: AIEventCenter.kt */
/* loaded from: classes3.dex */
public final class AIEventCenter {

    /* renamed from: a  reason: collision with root package name */
    public static final AIEventCenter f28648a = new AIEventCenter();

    /* renamed from: b  reason: collision with root package name */
    public static final c f28649b = a.a(new cg.a<Context>() { // from class: pdf.pdfreader.viewer.editor.free.utils.event.AIEventCenter$applicationContext$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Context invoke() {
            return ReaderPdfApplication.m();
        }
    });
    public static final c c = a.a(new cg.a<Boolean>() { // from class: pdf.pdfreader.viewer.editor.free.utils.event.AIEventCenter$isAINewUser$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Boolean invoke() {
            AIEventCenter.f28648a.getClass();
            return Boolean.valueOf(q0.j((Context) AIEventCenter.f28649b.getValue()) >= 78);
        }
    });

    public static void a(String str) {
        String p10;
        if (b.a((Context) f28649b.getValue()) == NetworkType.NETWORK_NULL) {
            p10 = ea.a.p("XWYxbF5uZQ==", "Zx2W7cRF");
        } else {
            p10 = ea.a.p("XG4naR1l", "J6CzzRa0");
        }
        String p11 = ea.a.p("UmkoaBJ0PXIXdEZ5NmM6aSdr", "SO252Hy4");
        i(p11, p10 + "_" + str);
    }

    public static void b() {
        String str;
        String str2;
        tn.a.a(ReaderPdfApplication.m(), ea.a.p("Gm8QZRdhaQ==", "jBybHR3b"));
        i(ea.a.p("UmkUZR10EGEcY1FfCmw_Y2s=", "aZW1EIxR"), h());
        zl.a.c.getClass();
        h<Object>[] hVarArr = zl.a.f32400d;
        h<Object> hVar = hVarArr[6];
        pdf.pdfreader.viewer.editor.free.datasource.sp.a aVar = zl.a.f32407k;
        if (((Number) aVar.b(hVar)).longValue() == 0) {
            aVar.c(hVarArr[6], Long.valueOf(System.currentTimeMillis()));
        }
        h<Object> hVar2 = hVarArr[3];
        pdf.pdfreader.viewer.editor.free.datasource.sp.a aVar2 = zl.a.f32404h;
        if (!t0.b0(((Number) aVar2.b(hVar2)).longValue(), System.currentTimeMillis())) {
            Pair g10 = g(((Number) aVar.b(hVarArr[6])).longValue());
            long longValue = ((Number) g10.component1()).longValue();
            long longValue2 = ((Number) g10.component2()).longValue();
            if (((Boolean) c.getValue()).booleanValue()) {
                str = "UmkUdQBlEF8RbF1jaw==";
                str2 = "PfQwSvdq";
            } else {
                str = "VmkzdRhlKl8rbA9jX184bGQ=";
                str2 = "yu7lkXjr";
            }
            String p10 = ea.a.p(str, str2);
            i(p10, longValue + "_" + longValue2);
            aVar2.c(hVarArr[3], Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void c() {
        i(ea.a.p("UmkUZR10EGEcY1FfGmg5dw==", "XIDpWSZy"), h());
    }

    public static void d(String str, AIQuickTag aiQuickTag, String from) {
        g.e(aiQuickTag, "aiQuickTag");
        g.e(from, "from");
        String h10 = h();
        String event = aiQuickTag.getEvent();
        i(str, h10 + "_total_" + event);
        String event2 = aiQuickTag.getEvent();
        i(str, h10 + "_" + from + "_" + event2);
    }

    public static void e(String str) {
        i(ea.a.p("LmlSaBh0aHI_cz9sAWYdblZfDWwsY2s=", "vcz1Jf2Z"), str);
    }

    public static void f(String str) {
        i(ea.a.p("UmkjaQB0DXILX1dsAGNr", "roxbg5ZO"), str);
    }

    public static Pair g(long j10) {
        long currentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zl.a.c.getClass();
        return new Pair(Long.valueOf(timeUnit.toDays(currentTimeMillis - ((Number) zl.a.f32405i.b(zl.a.f32400d[4])).longValue()) + 1), Long.valueOf(timeUnit.toDays(currentTimeMillis - j10) + 1));
    }

    public static String h() {
        String str;
        String str2;
        if (((Boolean) c.getValue()).booleanValue()) {
            str = "X2V3";
            str2 = "CM1wHvic";
        } else {
            str = "XGxk";
            str2 = "dw0tsn9L";
        }
        return ea.a.p(str, str2);
    }

    public static void i(String str, String str2) {
        d dVar;
        c cVar = f28649b;
        if (str2 != null) {
            f28648a.getClass();
            tn.a.d((Context) cVar.getValue(), ea.a.p("K2k=", "rXJPrly9"), str, str2, false);
            dVar = d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            tn.a.b((Context) cVar.getValue(), ea.a.p("Lmk=", "r1vgFk2p"), str);
        }
    }
}
