package ap;

import android.app.Activity;
import android.content.Context;
import android.support.v4.media.session.h;
import android.text.TextUtils;
import android.util.Pair;
import androidx.activity.f;
import com.google.android.play.core.assetpacks.b1;
import h5.m;
import java.util.Locale;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: CustomUpgradeDelegate.kt */
/* loaded from: classes3.dex */
public final class a extends b1 {
    @Override // com.google.android.play.core.assetpacks.b1, h5.d
    public final d5.b b() {
        return new C0030a();
    }

    @Override // com.google.android.play.core.assetpacks.b1, h5.d
    public final String c(Activity context) {
        boolean z10;
        g.e(context, "context");
        Locale d10 = a0.d(context);
        String country = d10.getCountry();
        if (country != null && country.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            String language = d10.getLanguage();
            g.d(language, ea.a.p("JnQfbBhuUHU7Z2U=", "iM2XErFf"));
            return language;
        }
        return f.m(d10.getLanguage(), "_", d10.getCountry());
    }

    @Override // com.google.android.play.core.assetpacks.b1, h5.d
    public final void d(Context context, String msg) {
        g.e(context, "context");
        g.e(msg, "msg");
        j1.e(context, msg, true, null, -1);
    }

    @Override // com.google.android.play.core.assetpacks.b1, h5.d
    public final f5.b e(Activity activity, m mVar, e5.d dVar, f5.c cVar, c5.d upgradeCheck) {
        g.e(activity, "activity");
        g.e(upgradeCheck, "upgradeCheck");
        int i10 = d.G;
        d dVar2 = new d(activity, mVar, dVar, 1, cVar, upgradeCheck);
        dVar2.y();
        dVar2.setContentView(R.layout.upgrade_bottom_dialog_upgrade_guide);
        dVar2.z();
        return dVar2;
    }

    @Override // com.google.android.play.core.assetpacks.b1, h5.d
    public final i5.a h() {
        return new e();
    }

    @Override // com.google.android.play.core.assetpacks.b1, h5.d
    public final Pair<Boolean, Boolean> i() {
        boolean z10;
        g.d(ReaderPdfApplication.m(), ea.a.p("VGU_SR1zFmEcY1EoKQ==", "3ra3mDTr"));
        c1 c1Var = c1.f28564a;
        String p10 = ea.a.p("MA==", "ry9cdFG3");
        String h10 = de.e.h(ea.a.p("OnBWchhkUl8ybydlKnAJZ1BfXzQy", "QOjjwhYJ"), "");
        if (h.b("VG8vZiNn", "427AJHxD", h10) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            p10 = h10;
        }
        boolean equals = TextUtils.equals(p10, ea.a.p("MQ==", "JHmj0kfm"));
        Context m10 = ReaderPdfApplication.m();
        g.d(m10, ea.a.p("KGVFSRdzQ2E0Yy8oKQ==", "CiDrdkRQ"));
        return new Pair<>(Boolean.valueOf(equals), Boolean.valueOf(c1.u(m10)));
    }

    @Override // com.google.android.play.core.assetpacks.b1, h5.d
    public final com.facebook.appevents.m j() {
        return new com.facebook.appevents.m(12);
    }

    @Override // com.google.android.play.core.assetpacks.b1, h5.d
    public final void k(String str, Throwable th2) {
        ea.a.p("RnAschJkZQ==", "tY1ON50l");
        th2.getMessage();
        t1.c(str, th2);
    }

    /* compiled from: CustomUpgradeDelegate.kt */
    /* renamed from: ap.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0030a implements d5.b {
        @Override // d5.b
        public final void a(f5.b bVar) {
            String p10;
            if (bVar == null) {
                return;
            }
            try {
                if (bVar.f() == 1 || bVar.f() == 2) {
                    if (g.a(bVar.l(), ea.a.p("Vm4=", "nmbN5W7E"))) {
                        p10 = ea.a.p("Km4=", "ZXWkeBUP");
                    } else {
                        p10 = ea.a.p("VnQMZXI=", "cM9dDiHK");
                    }
                    if (g.a(ea.a.p("QQ==", "6gYxCqsS"), bVar.j())) {
                        tn.a.d(bVar.getContext(), ea.a.p("RnAvYQdl", "wUAa8wG3"), ea.a.p("THAzYQ5lbW4ncgthWF8kaFd3", "Fr9Wz2tn"), p10, false);
                    } else if (g.a(ea.a.p("Qg==", "wfAhg9Uq"), bVar.j())) {
                        tn.a.b(bVar.getContext(), ea.a.p("OnBVYQ1l", "LDxzuVR4"), ea.a.p("L3A0YQFlDW0paglya3M_b3c=", "8HZPuRjJ"));
                    }
                }
            } catch (Exception unused) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0067 A[Catch: Exception -> 0x00ef, TryCatch #0 {Exception -> 0x00ef, blocks: (B:3:0x0008, B:5:0x0018, B:7:0x0027, B:13:0x003f, B:15:0x0046, B:18:0x0050, B:26:0x00a8, B:28:0x00b8, B:29:0x00d4, B:31:0x00e4, B:20:0x0056, B:22:0x0067, B:23:0x0081, B:25:0x0091, B:10:0x0034, B:6:0x001f), top: B:34:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0081 A[Catch: Exception -> 0x00ef, TryCatch #0 {Exception -> 0x00ef, blocks: (B:3:0x0008, B:5:0x0018, B:7:0x0027, B:13:0x003f, B:15:0x0046, B:18:0x0050, B:26:0x00a8, B:28:0x00b8, B:29:0x00d4, B:31:0x00e4, B:20:0x0056, B:22:0x0067, B:23:0x0081, B:25:0x0091, B:10:0x0034, B:6:0x001f), top: B:34:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b8 A[Catch: Exception -> 0x00ef, TryCatch #0 {Exception -> 0x00ef, blocks: (B:3:0x0008, B:5:0x0018, B:7:0x0027, B:13:0x003f, B:15:0x0046, B:18:0x0050, B:26:0x00a8, B:28:0x00b8, B:29:0x00d4, B:31:0x00e4, B:20:0x0056, B:22:0x0067, B:23:0x0081, B:25:0x0091, B:10:0x0034, B:6:0x001f), top: B:34:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00d4 A[Catch: Exception -> 0x00ef, TryCatch #0 {Exception -> 0x00ef, blocks: (B:3:0x0008, B:5:0x0018, B:7:0x0027, B:13:0x003f, B:15:0x0046, B:18:0x0050, B:26:0x00a8, B:28:0x00b8, B:29:0x00d4, B:31:0x00e4, B:20:0x0056, B:22:0x0067, B:23:0x0081, B:25:0x0091, B:10:0x0034, B:6:0x001f), top: B:34:0x0008 }] */
        @Override // d5.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(f5.b r11) {
            /*
                r10 = this;
                java.lang.String r0 = "Vm4="
                java.lang.String r1 = "update:update_major_done:"
                java.lang.String r2 = "update:update_nomal_done:"
                java.lang.String r3 = r11.l()     // Catch: java.lang.Exception -> Lef
                java.lang.String r4 = "f9P6hlU0"
                java.lang.String r4 = ea.a.p(r0, r4)     // Catch: java.lang.Exception -> Lef
                boolean r3 = kotlin.jvm.internal.g.a(r3, r4)     // Catch: java.lang.Exception -> Lef
                if (r3 == 0) goto L1f
                java.lang.String r3 = "Ba40U5ej"
                java.lang.String r0 = ea.a.p(r0, r3)     // Catch: java.lang.Exception -> Lef
                goto L27
            L1f:
                java.lang.String r0 = "IHRZZXI="
                java.lang.String r3 = "sXWkdnZu"
                java.lang.String r0 = ea.a.p(r0, r3)     // Catch: java.lang.Exception -> Lef
            L27:
                int r3 = r11.f()     // Catch: java.lang.Exception -> Lef
                r4 = 2
                r5 = 1
                if (r3 != r5) goto L34
                java.lang.String r3 = "BHUfbw=="
                java.lang.String r6 = "9VekZHPX"
                goto L3f
            L34:
                int r3 = r11.f()     // Catch: java.lang.Exception -> Lef
                if (r3 != r4) goto L44
                java.lang.String r3 = "PGV0"
                java.lang.String r6 = "ziMuAOON"
            L3f:
                java.lang.String r3 = ea.a.p(r3, r6)     // Catch: java.lang.Exception -> Lef
                goto L46
            L44:
                java.lang.String r3 = ""
            L46:
                int r6 = r11.f()     // Catch: java.lang.Exception -> Lef
                java.lang.String r7 = "Qg=="
                java.lang.String r8 = "QQ=="
                if (r6 == r5) goto L56
                int r5 = r11.f()     // Catch: java.lang.Exception -> Lef
                if (r5 != r4) goto La8
            L56:
                java.lang.String r4 = "zKaeJlL2"
                java.lang.String r4 = ea.a.p(r8, r4)     // Catch: java.lang.Exception -> Lef
                java.lang.String r5 = r11.j()     // Catch: java.lang.Exception -> Lef
                boolean r4 = kotlin.jvm.internal.g.a(r4, r5)     // Catch: java.lang.Exception -> Lef
                if (r4 == 0) goto L81
                android.content.Context r4 = r11.getContext()     // Catch: java.lang.Exception -> Lef
                java.lang.String r5 = "J3AoYQZl"
                java.lang.String r6 = "uARLrJ9R"
                java.lang.String r5 = ea.a.p(r5, r6)     // Catch: java.lang.Exception -> Lef
                java.lang.String r6 = "QXA2YR9lGm4nbQdsQXAIY1RpMWs="
                java.lang.String r9 = "Zv4RkE67"
                java.lang.String r6 = ea.a.p(r6, r9)     // Catch: java.lang.Exception -> Lef
                r9 = 0
                tn.a.d(r4, r5, r6, r0, r9)     // Catch: java.lang.Exception -> Lef
                goto La8
            L81:
                java.lang.String r4 = "KxVx0r2f"
                java.lang.String r4 = ea.a.p(r7, r4)     // Catch: java.lang.Exception -> Lef
                java.lang.String r5 = r11.j()     // Catch: java.lang.Exception -> Lef
                boolean r4 = kotlin.jvm.internal.g.a(r4, r5)     // Catch: java.lang.Exception -> Lef
                if (r4 == 0) goto La8
                android.content.Context r4 = r11.getContext()     // Catch: java.lang.Exception -> Lef
                java.lang.String r5 = "RnAvYQdl"
                java.lang.String r6 = "lRBavPqA"
                java.lang.String r5 = ea.a.p(r5, r6)     // Catch: java.lang.Exception -> Lef
                java.lang.String r6 = "RnAvYQdlPW0TaltyHHAJYyhpUWs="
                java.lang.String r9 = "g0lzn5vX"
                java.lang.String r6 = ea.a.p(r6, r9)     // Catch: java.lang.Exception -> Lef
                tn.a.b(r4, r5, r6)     // Catch: java.lang.Exception -> Lef
            La8:
                java.lang.String r4 = "hql8W240"
                java.lang.String r4 = ea.a.p(r8, r4)     // Catch: java.lang.Exception -> Lef
                java.lang.String r5 = r11.j()     // Catch: java.lang.Exception -> Lef
                boolean r4 = kotlin.jvm.internal.g.a(r4, r5)     // Catch: java.lang.Exception -> Lef
                if (r4 == 0) goto Ld4
                android.content.Context r11 = r11.getContext()     // Catch: java.lang.Exception -> Lef
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lef
                r1.<init>(r2)     // Catch: java.lang.Exception -> Lef
                r1.append(r3)     // Catch: java.lang.Exception -> Lef
                java.lang.String r2 = "_"
                r1.append(r2)     // Catch: java.lang.Exception -> Lef
                r1.append(r0)     // Catch: java.lang.Exception -> Lef
                java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> Lef
                pdf.pdfreader.viewer.editor.free.utils.q0.B(r11, r0)     // Catch: java.lang.Exception -> Lef
                goto Lef
            Ld4:
                java.lang.String r0 = "Lzytqetk"
                java.lang.String r0 = ea.a.p(r7, r0)     // Catch: java.lang.Exception -> Lef
                java.lang.String r2 = r11.j()     // Catch: java.lang.Exception -> Lef
                boolean r0 = kotlin.jvm.internal.g.a(r0, r2)     // Catch: java.lang.Exception -> Lef
                if (r0 == 0) goto Lef
                android.content.Context r11 = r11.getContext()     // Catch: java.lang.Exception -> Lef
                java.lang.String r0 = r1.concat(r3)     // Catch: java.lang.Exception -> Lef
                pdf.pdfreader.viewer.editor.free.utils.q0.B(r11, r0)     // Catch: java.lang.Exception -> Lef
            Lef:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ap.a.C0030a.b(f5.b):void");
        }

        @Override // d5.b
        public final void onCancel() {
        }

        @Override // d5.b
        public final void onDismiss() {
        }
    }
}
