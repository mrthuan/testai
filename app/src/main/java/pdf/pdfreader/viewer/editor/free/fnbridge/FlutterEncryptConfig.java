package pdf.pdfreader.viewer.editor.free.fnbridge;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.extension.c;
import pdf.pdfreader.viewer.editor.free.utils.q0;

/* compiled from: FlutterEncryptConfig.kt */
/* loaded from: classes3.dex */
public final class FlutterEncryptConfig {
    public static boolean c;

    /* renamed from: f  reason: collision with root package name */
    public static Boolean f25882f;

    /* renamed from: g  reason: collision with root package name */
    public static Boolean f25883g;

    /* renamed from: a  reason: collision with root package name */
    public static final FlutterEncryptConfig f25878a = new FlutterEncryptConfig();

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f25879b = ge.a.I(ea.a.p("P2UiZCRyEXAkYRVodWMjaU5pJnk1TFduE3UQZzRDKm8CcyZBInQrdiF0eQ==", "thmCABo9"), ea.a.p("QHAnYQBoPWkcdFFyGnQ_dC1hXl8tZTp8GmEmZyRhBGVsYyNvHHMHXxlleQ==", "vHQc5Lhw"));

    /* renamed from: d  reason: collision with root package name */
    public static boolean f25880d = true;

    /* renamed from: e  reason: collision with root package name */
    public static final FlutterEncryptConfig$callback$1 f25881e = new FlutterEncryptConfig$callback$1();

    public static final Activity a(FlutterEncryptConfig flutterEncryptConfig, Context context) {
        flutterEncryptConfig.getClass();
        Activity l10 = c.l(context);
        if (l10 == null) {
            return com.lib.flutter.encrypt.a.f15743a;
        }
        return l10;
    }

    public static boolean b() {
        Boolean bool = f25883g;
        if (bool != null) {
            return bool.booleanValue();
        }
        f25878a.getClass();
        Context m10 = ReaderPdfApplication.m();
        g.d(m10, ea.a.p("KGVFSRdzQ2E0Yy8oKQ==", "2YPIZkXU"));
        boolean m11 = c1.m(m10);
        f25883g = Boolean.valueOf(m11);
        return m11;
    }

    public static boolean c() {
        Boolean bool = f25882f;
        if (bool != null) {
            return bool.booleanValue();
        }
        f25878a.getClass();
        boolean f10 = q0.f(ReaderPdfApplication.m(), "key_app_show_lang_choose", false);
        f25882f = Boolean.valueOf(f10);
        return f10;
    }
}
