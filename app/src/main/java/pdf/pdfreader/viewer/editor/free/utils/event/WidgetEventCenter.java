package pdf.pdfreader.viewer.editor.free.utils.event;

import android.content.Context;
import android.text.TextUtils;
import kotlin.NoWhenBranchMatchedException;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.ShortcutType;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.WidgetFromType;
import tf.c;

/* compiled from: WidgetEventCenter.kt */
/* loaded from: classes3.dex */
public final class WidgetEventCenter {

    /* renamed from: a  reason: collision with root package name */
    public static final c f28682a = kotlin.a.a(new cg.a<Context>() { // from class: pdf.pdfreader.viewer.editor.free.utils.event.WidgetEventCenter$applicationContext$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Context invoke() {
            return ReaderPdfApplication.m();
        }
    });

    /* renamed from: b  reason: collision with root package name */
    public static final String f28683b = ea.a.p("RGlk", "4w5mywQx");
    public static final String c = ea.a.p("KWldZQ==", "kDjNQnXx");

    /* renamed from: d  reason: collision with root package name */
    public static final String f28684d = ea.a.p("Q287dXA=", "zU2XWCF5");

    /* renamed from: e  reason: collision with root package name */
    public static final String f28685e = ea.a.p("QGV0", "VaOztqIL");

    /* compiled from: WidgetEventCenter.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28686a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f28687b;

        static {
            int[] iArr = new int[ShortcutType.values().length];
            try {
                iArr[ShortcutType.WIDGET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShortcutType.ICON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28686a = iArr;
            int[] iArr2 = new int[WidgetFromType.values().length];
            try {
                iArr2[WidgetFromType.Guide.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[WidgetFromType.Setting.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f28687b = iArr2;
        }
    }

    public static String a(ShortcutType shortcutType) {
        int i10;
        if (shortcutType != null && (i10 = a.f28686a[shortcutType.ordinal()]) != 1) {
            if (i10 == 2) {
                return c;
            }
            throw new NoWhenBranchMatchedException();
        }
        return f28683b;
    }

    public static String b(WidgetFromType widgetFromType) {
        String str = f28685e;
        if (widgetFromType != null) {
            int i10 = a.f28687b[widgetFromType.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return str;
                }
                throw new NoWhenBranchMatchedException();
            }
            return f28684d;
        }
        return str;
    }

    public static void c(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        c cVar = f28682a;
        if (isEmpty) {
            tn.a.b((Context) cVar.getValue(), ea.a.p("RGkvZxZ0cw==", "uXHO533O"), str);
        } else {
            tn.a.d((Context) cVar.getValue(), ea.a.p("RGkvZxZ0cw==", "Siph70Ub"), str, str2, false);
        }
    }
}
