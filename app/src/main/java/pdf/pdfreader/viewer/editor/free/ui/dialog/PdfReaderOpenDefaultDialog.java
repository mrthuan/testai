package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.act.SettingOpenWithGuideABActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.SettingOpenWithGuideActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog;

/* compiled from: PdfReaderOpenDefaultDialog.kt */
/* loaded from: classes3.dex */
public final class PdfReaderOpenDefaultDialog extends oo.g {
    public static final a J;
    public static boolean K;
    public static int L;
    public static String M;
    public final ro.a<Boolean> A;
    public final tf.c B;
    public final tf.c C;
    public final tf.c D;
    public boolean E;
    public final tf.c F;
    public final tf.c G;
    public final tf.c H;
    public int I;

    /* renamed from: y  reason: collision with root package name */
    public final int f27449y;

    /* renamed from: z  reason: collision with root package name */
    public final String f27450z;

    /* compiled from: PdfReaderOpenDefaultDialog.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static int a(androidx.fragment.app.u activity, int i10, boolean z10) {
            kotlin.jvm.internal.g.e(activity, "activity");
            if (PdfReaderOpenDefaultDialog.K) {
                return 3;
            }
            pdf.pdfreader.viewer.editor.free.utils.c cVar = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
            if (pdf.pdfreader.viewer.editor.free.utils.c.f28559b.getBoolean(ea.a.p("OGwPYTtzOHMgbxFfV2wyYUpfNmUvYUNsAF9ANDg=", "B9YxBgzW"), false)) {
                return 2;
            }
            if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.g(activity)) {
                return 3;
            }
            if (!z10) {
                pdf.pdfreader.viewer.editor.free.utils.d1 b10 = pdf.pdfreader.viewer.editor.free.utils.d1.b(activity);
                if (b10.a("KEY_TYPE_SET_DEFAULT_SHOW_" + i10, false)) {
                    pdf.pdfreader.viewer.editor.free.utils.t1.b(ea.a.p("L2kkZX5wEG4MZQBhQWwjIFlsIGUoZE8gBG8BLi4=", "WpIH1uQD"));
                    return 3;
                }
            }
            if (b(activity)) {
                pdf.pdfreader.viewer.editor.free.utils.t1.b(ea.a.p("KWldZTZwUm4eZSxhAGwcIF1hHSAnbARjBEwzcz0uaS4=", "jMMGoZIG"));
                return 3;
            }
            String c = c(activity, i10);
            if (TextUtils.isEmpty(c)) {
                return 1;
            }
            if (TextUtils.equals(activity.getPackageName(), c)) {
                return 3;
            }
            return 2;
        }

        public static boolean b(Context context) {
            kotlin.jvm.internal.g.e(context, "context");
            ArrayList arrayList = new ArrayList();
            try {
                for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(e(1), 65536)) {
                    String str = resolveInfo.activityInfo.packageName;
                    String str2 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                    kotlin.jvm.internal.g.d(str, ea.a.p("QWU4bx92B0kcZlsuCGMiaTJpRnkPbiVvHnBUY15hKGV9YSZl", "055OWVC8"));
                    arrayList.add(str);
                }
                pdf.pdfreader.viewer.editor.free.utils.c1 c1Var = pdf.pdfreader.viewer.editor.free.utils.c1.f28564a;
                ArrayList J = ge.a.J(ea.a.p("KWQ0chxhFWU6LhZkUnY-ZU9lIC4mZlBpF2UFbz5sbHA9ZiFjGG4fZXI=", "cTYRyqDK"), ea.a.p("V28nLgVyN3M8ZQJhRHB5cFxmIGUoZFNyBGQXdjhlNWVy", "KW4JqBgR"), ea.a.p("AW8cLghkE3ItYQJlRi4kY1luPGU7LkZkEnYYZSZlcg==", "nUbqxuMs"), ea.a.p("OW83LiNtPi44ZAAuUWQ-dFdy", "j7ZZHQPT"), ea.a.p("Q2QtLgFlA2QXchpwDWYkZSVkV3JocCdmRmkTdzByWnBXZjllEmQHchRyUWU=", "0vUtCkvl"), ea.a.p("UG8mLgdhG20TeRpwDWZ4ciFhVmVy", "KWbM2aCG"), ea.a.p("VG83LkdkLS46ZQdkUXJ5cFxmJGksd1NyWnAVZjRkK3RYcnRmWHIqbixyCWlk", "VO7Z7KVT"), ea.a.p("DG8BLkJ0G2whdA9lR2E5ZExvPWxncFJmBmUQZDRy", "rRol7rQr"), ea.a.p("Lm8ALglkHmItLhRlVWQycg==", "t1Mmhq4T"), ea.a.p("LG9cLhx6Qy4qZCxyEGEMZUcuHmQjdgxlE2Vy", "YOirdVW6"), ea.a.p("N28VLkJ0HWwhdA9lR2E5ZExvPWxncFJmBmUQZDRy", "YjTx7tEd"));
                String h10 = de.e.h(pdf.pdfreader.viewer.editor.free.utils.c1.f28599s, "");
                if (!TextUtils.isEmpty(h10)) {
                    kotlin.jvm.internal.g.d(h10, ea.a.p("JXNebi1lWnA=", "II8kEgTs"));
                    pdf.pdfreader.viewer.editor.free.utils.c1.f28564a.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        JSONArray optJSONArray = new JSONObject(h10).optJSONArray(ea.a.p("KGkqdA==", "92DYm2yf"));
                        if (optJSONArray != null) {
                            int length = optJSONArray.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                arrayList2.add(optJSONArray.getString(i10));
                            }
                            J = arrayList2;
                        }
                    } catch (Exception e10) {
                        e10.toString();
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (J.contains((String) it.next())) {
                        pdf.pdfreader.viewer.editor.free.utils.t1.b(ea.a.p("VWknZTxwB242ZVJhHGwiICdoV2MtICthAiAQbCJjJUxacz8uLg==", "qrCN4D0W"));
                        return true;
                    }
                }
                return false;
            } catch (Exception unused) {
                return true;
            }
        }

        public static String c(ContextWrapper wrapper, int i10) {
            String str;
            ActivityInfo activityInfo;
            kotlin.jvm.internal.g.e(wrapper, "wrapper");
            try {
                ResolveInfo resolveActivity = wrapper.getPackageManager().resolveActivity(e(i10), 65536);
                if (resolveActivity != null && (activityInfo = resolveActivity.activityInfo) != null) {
                    str = activityInfo.packageName;
                } else {
                    str = null;
                }
                pdf.pdfreader.viewer.editor.free.utils.t1.b("OpenDefault getDefaultOpenPackage=" + str + ", resolve=" + resolveActivity);
                if (!kotlin.jvm.internal.g.a(ea.a.p("Um4vchxpZA==", "MvRsSMNU"), str) && !kotlin.jvm.internal.g.a(ea.a.p("LG9cLhF1Vnc_aWRhG2Qab1xkQGkrdAByPGEJLjRwcA==", "VtbdReUl"), str) && !kotlin.jvm.internal.g.a(ea.a.p("UG8mLhtpCm8cb0YuCG4ycitpVi4vbjdlBG5SbBdhEXA=", "v39a97EI"), str)) {
                    if (!kotlin.jvm.internal.g.a(ea.a.p("UG8mLhJuBnIdaVAuAG4iZSp0QGU1by92NnI=", "SwA5ZcXn"), str)) {
                        return str;
                    }
                }
                return null;
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }

        public static int d(String fileName) {
            kotlin.jvm.internal.g.e(fileName, "fileName");
            Locale locale = Locale.ROOT;
            String f10 = a6.h.f("HU9-VA==", "mom2TzQT", locale, fileName, locale);
            kotlin.jvm.internal.g.d(f10, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtnYC5CbypvGWU9Q1BzHChbbzlhJmUp", "TzJdI6fn"));
            if (kotlin.text.j.F(f10, ea.a.p("ZHArZg==", "O2JO19nc"), false)) {
                return 1;
            }
            ea.a.p("YU8EVA==", "1YixP1Se");
            String lowerCase = fileName.toLowerCase(locale);
            kotlin.jvm.internal.g.d(lowerCase, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtnWy5FbyZvQWU9Q1BzHChbbzlhJmUp", "gJm2r1j6"));
            if (kotlin.text.j.F(lowerCase, ea.a.p("dmQqYw==", "9tXEEesU"), false)) {
                return 2;
            }
            ea.a.p("HU9-VA==", "x1NwvWG6");
            String lowerCase2 = fileName.toLowerCase(locale);
            kotlin.jvm.internal.g.d(lowerCase2, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtnZy4gbxRvB2U9Q1BzHChbbzlhJmUp", "xLBgNTXp"));
            if (kotlin.text.j.F(lowerCase2, ea.a.p("HWQkY3g=", "cg8tPe09"), false)) {
                return 3;
            }
            ea.a.p("HU9-VA==", "DVkON38z");
            String lowerCase3 = fileName.toLowerCase(locale);
            kotlin.jvm.internal.g.d(lowerCase3, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtnSy4cbzZvDmU9Q1BzHChbbzlhJmUp", "f8f6bhzy"));
            if (kotlin.text.j.F(lowerCase3, ea.a.p("HXgncw==", "pFWa9gca"), false)) {
                return 4;
            }
            ea.a.p("YU8EVA==", "aJgZFIIj");
            String lowerCase4 = fileName.toLowerCase(locale);
            kotlin.jvm.internal.g.d(lowerCase4, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtnXC4AbwJvB2U9Q1BzHChbbzlhJmUp", "dyVDutNp"));
            if (kotlin.text.j.F(lowerCase4, ea.a.p("F3g8c3g=", "QU9PJVsU"), false)) {
                return 5;
            }
            ea.a.p("HU9-VA==", "zve1IVmj");
            String lowerCase5 = fileName.toLowerCase(locale);
            kotlin.jvm.internal.g.d(lowerCase5, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtnfi4Nby9vA2U9Q1BzHChbbzlhJmUp", "DEERWyct"));
            if (kotlin.text.j.F(lowerCase5, ea.a.p("anAadA==", "yTDj7XFY"), false)) {
                return 6;
            }
            ea.a.p("K08YVA==", "8ryWt1uH");
            String lowerCase6 = fileName.toLowerCase(locale);
            kotlin.jvm.internal.g.d(lowerCase6, ea.a.p("EGgbc2phSyAiYRBhGmw2bl8uAXQ7aVhnXS4Fbx1vNWUWQxNzLyhUbythCmUp", "ACdrJ8B7"));
            if (!kotlin.text.j.F(lowerCase6, ea.a.p("HXA7dHg=", "gPOOXRSP"), false)) {
                return 0;
            }
            return 7;
        }

        public static Intent e(int i10) {
            String p10;
            Intent intent = new Intent();
            intent.setAction(ea.a.p("Lm5VchZpUy4zbj5lG3RGYVZ0B28rLjNJCVc=", "YGtCLJws"));
            Uri build = Uri.parse(ea.a.p("UG8ldBZuFjpdL1dvBC4ldCFwW24ybzdoC2sCdDNoVW4dZC5mEnUOdBNwRHM=", "nkP0vayi")).buildUpon().appendPath(f(i10)).build();
            switch (i10) {
                case 1:
                    p10 = ea.a.p("BXAmbAdjWXQhbwgvRGRm", "NJdVn8J7");
                    break;
                case 2:
                    p10 = ea.a.p("UnA7bBpjA3Qbb1ovBHMhbzZk", "8Jy3Izo0");
                    break;
                case 3:
                    p10 = ea.a.p("UnA7bBpjA3Qbb1ovH24yLitwV24-bS9mXXIZYRZzG29VZiJjFmQNYwdtUW4dLiFvNmRCciljJnNBaRpnD2wYZFxjPm0WbnQ=", "2tb6ESoc");
                    break;
                case 4:
                    p10 = ea.a.p("LnBBbBBjVnQzbyQvA24MLlhzQ2U9YwBs", "cI4grABk");
                    break;
                case 5:
                    p10 = ea.a.p("VXA0bDljBnQhbwgvQm4zLldwN24xbVpmG3IcYSVzb29SZi1jNWQIYz1tA25ALiRwSmUzZDpoU2UAbR0uImgnZXQ=", "BM4DPgz9");
                    break;
                case 6:
                    p10 = ea.a.p("KHAgbDtjVXQhbwgvQm4zLlVzf3Amd1NyBG8YbnQ=", "WqIPR4ud");
                    break;
                case 7:
                    p10 = ea.a.p("UnA7bBpjA3Qbb1ovH24yLitwV24-bS9mIHJYYUJzHW9VZiJjFmQNYwdtUW4dLiZyIXNXbjJhN2kgblhsGHBCZUBlJXQSdAtvbg==", "O560WEYa");
                    break;
                default:
                    p10 = "";
                    break;
            }
            intent.setDataAndType(build, p10);
            intent.putExtra(ea.a.p("KW40cgxpNS4hbhJlWnR5ZUB0IGFnU2JSMUFN", "vFHPcQKp"), build);
            intent.setFlags(2);
            return intent;
        }

        public static String f(int i10) {
            switch (i10) {
                case 1:
                    return ea.a.p("PGFccBVlGXA-Zg==", "4xR22uy8");
                case 2:
                    return ea.a.p("QGEmcB9lTGQdYw==", "30t76YY3");
                case 3:
                    return ea.a.p("PGFccBVlGWQ1Y3g=", "wMVkyDrZ");
                case 4:
                    return ea.a.p("QGEmcB9lTHgecw==", "VLaq6eOa");
                case 5:
                    return ea.a.p("PGFccBVlGXg2c3g=", "3CJpBcfe");
                case 6:
                    return ea.a.p("P2EAcC5lGXA4dA==", "NwLmB7ib");
                case 7:
                    return ea.a.p("QGEmcB9lTHACdHg=", "obn6Gtb0");
                default:
                    return "";
            }
        }

        public static String g(int i10) {
            switch (i10) {
                case 1:
                    return ea.a.p("P2Rm", "K8IvYGC8");
                case 2:
                    return ea.a.p("V29j", "vGmXxDaQ");
                case 3:
                    return ea.a.p("V28oeA==", "aXB4RW0k");
                case 4:
                    return ea.a.p("N2xz", "3YmZTkwc");
                case 5:
                    return ea.a.p("S2w4eA==", "xaB3IANf");
                case 6:
                    return ea.a.p("Q3B0", "kSFmcDD5");
                case 7:
                    return ea.a.p("Q3A_eA==", "aUGyRoVR");
                default:
                    return ea.a.p("K29j", "AeflYJ6p");
            }
        }

        public static void h(Context context, int i10, String _checkFrom) {
            String p10;
            Class cls;
            kotlin.jvm.internal.g.e(context, "context");
            kotlin.jvm.internal.g.e(_checkFrom, "_checkFrom");
            context.startActivity(e(i10));
            String str = Build.BRAND;
            kotlin.jvm.internal.g.d(str, ea.a.p("NFIuTkQ=", "kTvoqLAV"));
            Locale locale = Locale.ROOT;
            String f10 = a6.h.f("HU9-VA==", "bsdmWOWV", locale, str, locale);
            kotlin.jvm.internal.g.d(f10, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtnRC4AbwZvPmU9Q1BzHChbbzlhJmUp", "6cvPmtJI"));
            String str2 = Build.MODEL;
            kotlin.jvm.internal.g.d(str2, ea.a.p("HE8FRUw=", "47QAkjuE"));
            ea.a.p("ME8sVA==", "7Pbco8Cd");
            kotlin.jvm.internal.g.d(str2.toLowerCase(locale), ea.a.p("R2gic1NhESAYYUJhR2w3biMuYXQ0aS1nfi4cb3xvAmVBQypzFigObxFhWGUp", "Wh0uxsPx"));
            if (TextUtils.equals(ea.a.p("OmE8czFuZw==", "UuIQD329"), f10) && Build.VERSION.SDK_INT >= 28) {
                p10 = ea.a.p("Qg==", "Z4EAD7wZ");
            } else {
                p10 = ea.a.p("Qw==", "oNR4rNYm");
            }
            if (!kotlin.jvm.internal.g.a(p10, ea.a.p("QQ==", "aHLah7HM")) && !kotlin.jvm.internal.g.a(p10, ea.a.p("Qg==", "NW6QbB8R"))) {
                cls = SettingOpenWithGuideActivity.class;
            } else {
                cls = SettingOpenWithGuideABActivity.class;
            }
            Intent intent = new Intent(context, cls);
            intent.putExtra(ea.a.p("WWUPXxViG3M8cg==", "Cq2vtDfj"), p10);
            context.startActivity(intent);
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(0, 0);
            }
            PdfReaderOpenDefaultDialog.M = _checkFrom;
            pdf.pdfreader.viewer.editor.free.utils.t1.b(ea.a.p("fHAubjdlBGEHbEAgDnU_ZCEsEnMyYTF0FWEJdBp2J3R5", "5jsNmHCo"));
        }
    }

    static {
        ea.a.p("eEUSXydZMkUtU3FUNkQTRgVVflQZUwtPVw==", "TtNJ5To2");
        J = new a();
        M = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfReaderOpenDefaultDialog(Context context, int i10, String str, ro.a<Boolean> aVar) {
        super(context, (Object) null);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "lbvYTVJm"));
        ea.a.p("VXIkbQ==", "Vk6u9WSH");
        this.f27449y = i10;
        this.f27450z = str;
        this.A = aVar;
        this.B = kotlin.a.a(new cg.a<View>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog$btOk$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final View invoke() {
                PdfReaderOpenDefaultDialog pdfReaderOpenDefaultDialog = PdfReaderOpenDefaultDialog.this;
                PdfReaderOpenDefaultDialog.a aVar2 = PdfReaderOpenDefaultDialog.J;
                return pdfReaderOpenDefaultDialog.x().findViewById(R.id.btPdfDefaultOk);
            }
        });
        this.C = kotlin.a.a(new cg.a<View>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog$btLater$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final View invoke() {
                PdfReaderOpenDefaultDialog pdfReaderOpenDefaultDialog = PdfReaderOpenDefaultDialog.this;
                PdfReaderOpenDefaultDialog.a aVar2 = PdfReaderOpenDefaultDialog.J;
                return pdfReaderOpenDefaultDialog.x().findViewById(R.id.btPdfDefaultLater);
            }
        });
        this.D = kotlin.a.a(new cg.a<TextView>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog$tvTitle$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final TextView invoke() {
                PdfReaderOpenDefaultDialog pdfReaderOpenDefaultDialog = PdfReaderOpenDefaultDialog.this;
                PdfReaderOpenDefaultDialog.a aVar2 = PdfReaderOpenDefaultDialog.J;
                return (TextView) pdfReaderOpenDefaultDialog.x().findViewById(R.id.tvPdfDefaultTitle);
            }
        });
        kotlin.a.a(new cg.a<TextView>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog$tvDesc$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final TextView invoke() {
                PdfReaderOpenDefaultDialog pdfReaderOpenDefaultDialog = PdfReaderOpenDefaultDialog.this;
                PdfReaderOpenDefaultDialog.a aVar2 = PdfReaderOpenDefaultDialog.J;
                return (TextView) pdfReaderOpenDefaultDialog.x().findViewById(R.id.tvPdfDefaultDesc);
            }
        });
        this.F = kotlin.a.a(new cg.a<ViewGroup>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog$contentRoot$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final ViewGroup invoke() {
                PdfReaderOpenDefaultDialog pdfReaderOpenDefaultDialog = PdfReaderOpenDefaultDialog.this;
                PdfReaderOpenDefaultDialog.a aVar2 = PdfReaderOpenDefaultDialog.J;
                return (ViewGroup) pdfReaderOpenDefaultDialog.x().findViewById(R.id.llContentRoot);
            }
        });
        this.G = kotlin.a.a(new cg.a<ImageView>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog$ivDefault$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final ImageView invoke() {
                PdfReaderOpenDefaultDialog pdfReaderOpenDefaultDialog = PdfReaderOpenDefaultDialog.this;
                PdfReaderOpenDefaultDialog.a aVar2 = PdfReaderOpenDefaultDialog.J;
                return (ImageView) pdfReaderOpenDefaultDialog.x().findViewById(R.id.ivPdfDefault);
            }
        });
        this.H = kotlin.a.a(new cg.a<View>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog$llTextTitle$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final View invoke() {
                PdfReaderOpenDefaultDialog pdfReaderOpenDefaultDialog = PdfReaderOpenDefaultDialog.this;
                PdfReaderOpenDefaultDialog.a aVar2 = PdfReaderOpenDefaultDialog.J;
                return pdfReaderOpenDefaultDialog.x().findViewById(R.id.llPdfDefaultTitle);
            }
        });
        this.I = 1;
    }

    public final void H() {
        if (getContext().getResources().getConfiguration().orientation != this.I && this.f23541s) {
            this.I = getContext().getResources().getConfiguration().orientation;
            int min = Math.min(getContext().getResources().getDisplayMetrics().widthPixels, getContext().getResources().getDisplayMetrics().heightPixels);
            tf.c cVar = this.F;
            Object value = cVar.getValue();
            kotlin.jvm.internal.g.d(value, ea.a.p("D2cudF5jDW4GZVp0O285dHooHC5oKQ==", "aN7Cdsqr"));
            ViewGroup.LayoutParams layoutParams = ((ViewGroup) value).getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = min;
                Object value2 = cVar.getValue();
                kotlin.jvm.internal.g.d(value2, ea.a.p("D2cudF5jDW4GZVp0O285dHooHC5oKQ==", "aN7Cdsqr"));
                ((ViewGroup) value2).setLayoutParams(layoutParams);
            }
            if (getContext().getResources().getConfiguration().orientation == 1) {
                ViewGroup.LayoutParams layoutParams2 = I().getLayoutParams();
                if (layoutParams2 != null && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.setMarginStart(getContext().getResources().getDimensionPixelSize(R.dimen.dp_52));
                    marginLayoutParams.setMarginEnd(getContext().getResources().getDimensionPixelSize(R.dimen.dp_52));
                    marginLayoutParams.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.dp_40);
                    I().setLayoutParams(layoutParams2);
                }
                ViewGroup.LayoutParams layoutParams3 = J().getLayoutParams();
                if (layoutParams3 != null && (layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.dp_24);
                    J().setLayoutParams(layoutParams3);
                    return;
                }
                return;
            }
            ViewGroup.LayoutParams layoutParams4 = I().getLayoutParams();
            if (layoutParams4 != null && (layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams2.setMarginStart(getContext().getResources().getDimensionPixelSize(R.dimen.dp_88));
                marginLayoutParams2.setMarginEnd(getContext().getResources().getDimensionPixelSize(R.dimen.dp_88));
                marginLayoutParams2.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.dp_32);
                I().setLayoutParams(layoutParams4);
            }
            ViewGroup.LayoutParams layoutParams5 = J().getLayoutParams();
            if (layoutParams5 != null && (layoutParams5 instanceof ViewGroup.MarginLayoutParams)) {
                ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.dp_20);
                J().setLayoutParams(layoutParams5);
            }
        }
    }

    public final ImageView I() {
        Object value = this.G.getValue();
        kotlin.jvm.internal.g.d(value, ea.a.p("c2dUdFRpQUQ_Zit1GXRWKBsuQCk=", "up3CT3jA"));
        return (ImageView) value;
    }

    public final View J() {
        Object value = this.H.getValue();
        kotlin.jvm.internal.g.d(value, ea.a.p("D2cudF5sDlQXeEBUAHQ6ZXooHC5oKQ==", "f2iuUVSM"));
        return (View) value;
    }

    @Override // oo.g, android.app.Dialog
    public final void show() {
        super.show();
        J.getClass();
        K = true;
        pdf.pdfreader.viewer.editor.free.utils.d1 b10 = pdf.pdfreader.viewer.editor.free.utils.d1.b(getContext());
        StringBuilder sb2 = new StringBuilder("KEY_TYPE_SET_DEFAULT_SHOW_");
        int i10 = this.f27449y;
        sb2.append(i10);
        b10.c(sb2.toString(), true);
        tn.a.d(getContext(), ea.a.p("VHUiZGU=", "7yhem0dM"), ea.a.p("V2UtYQZsFl8BaFt3", "EeSZXdc7"), androidx.activity.f.o(new StringBuilder(), this.f27450z, "_", a.g(i10)), false);
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_app_default_open_ways_old;
    }

    @Override // oo.g
    public final void z() {
        String p10;
        Object value = this.B.getValue();
        kotlin.jvm.internal.g.d(value, ea.a.p("D2cudF5iFk8ZPhwuRy4p", "XZY4NW4S"));
        ((View) value).setOnClickListener(new d9.f(this, 24));
        Object value2 = this.C.getValue();
        kotlin.jvm.internal.g.d(value2, ea.a.p("c2dUdFRiQ0w7dC9ySyhGLhsp", "6WOZvhhO"));
        ((View) value2).setOnClickListener(new qb.j0(this, 21));
        switch (this.f27449y) {
            case 1:
                p10 = ea.a.p("H0RG", "w2vyiKKf");
                break;
            case 2:
                p10 = ea.a.p("d09D", "3EprQESa");
                break;
            case 3:
                p10 = ea.a.p("C09yWA==", "ww3g6vbW");
                break;
            case 4:
                p10 = ea.a.p("F0xT", "8NA6WvcZ");
                break;
            case 5:
                p10 = ea.a.p("a0wYWA==", "L61n50nx");
                break;
            case 6:
                p10 = ea.a.p("H1BU", "G4MRlx4K");
                break;
            case 7:
                p10 = ea.a.p("OlAtWA==", "E2jy4q6N");
                break;
            default:
                p10 = ea.a.p("H0RG", "J41KYQrw");
                break;
        }
        String string = getContext().getString(R.string.arg_res_0x7f13046e, p10);
        kotlin.jvm.internal.g.d(string, ea.a.p("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFps4CSdG9kUmZSdSd0LHQLdB5lGCAdeSZlF3RAKQ==", "Q4073aNS"));
        SpannableString spannableString = new SpannableString(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(androidx.core.content.a.getColor(getContext(), R.color.colorAccent));
        int V = kotlin.text.k.V(string, p10, 0, false, 6);
        spannableString.setSpan(foregroundColorSpan, V, p10.length() + V, 17);
        Object value3 = this.D.getValue();
        kotlin.jvm.internal.g.d(value3, ea.a.p("D2cudF50FFQbdFhlVyh4Lmop", "0A9kIK7X"));
        ((TextView) value3).setText(spannableString);
        int min = (int) (Math.min(pdf.pdfreader.viewer.editor.free.utils.t0.p0(getContext()), getContext().getResources().getDisplayMetrics().heightPixels) * 0.72f);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.dp_270);
        if (min > dimensionPixelSize) {
            min = dimensionPixelSize;
        }
        ViewGroup.LayoutParams layoutParams = I().getLayoutParams();
        layoutParams.width = min;
        layoutParams.height = (min * 2) / 3;
        I().setLayoutParams(layoutParams);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.i1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                String p11 = ea.a.p("O2hYc10w", "6zsYztcE");
                PdfReaderOpenDefaultDialog pdfReaderOpenDefaultDialog = PdfReaderOpenDefaultDialog.this;
                kotlin.jvm.internal.g.e(pdfReaderOpenDefaultDialog, p11);
                ro.a<Boolean> aVar = pdfReaderOpenDefaultDialog.A;
                if (aVar != null) {
                    aVar.o(Boolean.valueOf(pdfReaderOpenDefaultDialog.E));
                }
                boolean z10 = pdfReaderOpenDefaultDialog.E;
                PdfReaderOpenDefaultDialog.a aVar2 = PdfReaderOpenDefaultDialog.J;
                int i10 = pdfReaderOpenDefaultDialog.f27449y;
                String str = pdfReaderOpenDefaultDialog.f27450z;
                if (z10) {
                    Context context = pdfReaderOpenDefaultDialog.getContext();
                    String p12 = ea.a.p("VHUiZGU=", "thyW2i5e");
                    String p13 = ea.a.p("V2UtYQZsFl8da2tjBWk1aw==", "wSiVLlgn");
                    aVar2.getClass();
                    tn.a.d(context, p12, p13, androidx.activity.f.m(str, "_", PdfReaderOpenDefaultDialog.a.g(i10)), false);
                    return;
                }
                Context context2 = pdfReaderOpenDefaultDialog.getContext();
                String p14 = ea.a.p("JnUPZGU=", "q6AfgtUW");
                String p15 = ea.a.p("V2UtYQZsFl8eYUBlG181bC1jaw==", "a2WH7aEr");
                aVar2.getClass();
                tn.a.d(context2, p14, p15, androidx.activity.f.m(str, "_", PdfReaderOpenDefaultDialog.a.g(i10)), false);
            }
        });
        s().K = false;
        H();
    }
}
