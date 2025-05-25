package pdf.pdfreader.viewer.editor.free.feature.app_widget.utils;

import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import androidx.activity.s;
import ea.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.f;
import kotlin.jvm.internal.g;
import kotlin.text.k;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import m0.e;
import o9.d;
import tf.c;

/* compiled from: ShortcutPermissionExt.kt */
/* loaded from: classes3.dex */
public final class ShortcutPermissionExtKt {

    /* renamed from: a  reason: collision with root package name */
    public static final c f24844a = kotlin.a.a(new cg.a<Boolean>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.utils.ShortcutPermissionExtKt$isVivoVariants$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Boolean invoke() {
            String[] strArr = {a.p("QGkPbw==", "f46yFl9w"), a.p("WnEkbw==", "zYS4gaCP")};
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= 2) {
                    break;
                }
                String str = strArr[i10];
                String str2 = Build.BRAND;
                g.d(str2, a.p("IFJ4TkQ=", "xLb9ELrN"));
                if (k.O(str, str2, true)) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            return Boolean.valueOf(z10);
        }
    });

    /* renamed from: b  reason: collision with root package name */
    public static final c f24845b = kotlin.a.a(new cg.a<Boolean>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.utils.ShortcutPermissionExtKt$isXiaomiDevice$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Boolean invoke() {
            String[] strArr = {a.p("DmlWbyZp", "FDv7KqAK"), a.p("QWUvbWk=", "47UrTa8M"), a.p("Q28obw==", "FXU5vb53"), a.p("LWxQYxJzX2Eoaw==", "kODMVnhs")};
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= 4) {
                    break;
                }
                String str = strArr[i10];
                String str2 = Build.BRAND;
                g.d(str2, a.p("MVIbTkQ=", "3zsZkluH"));
                if (k.O(str, str2, true)) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            return Boolean.valueOf(z10);
        }
    });
    public static final c c = kotlin.a.a(new cg.a<Boolean>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.utils.ShortcutPermissionExtKt$isOppoDevice$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Boolean invoke() {
            String[] strArr = {a.p("XHA7bw==", "h38SSUUW"), a.p("BWUTbCBl", "PgwrMrI7")};
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= 2) {
                    break;
                }
                String str = strArr[i10];
                String str2 = Build.BRAND;
                g.d(str2, a.p("DVJwTkQ=", "1TVCOxop"));
                if (k.O(str, str2, true)) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            return Boolean.valueOf(z10);
        }
    });

    /* compiled from: ShortcutPermissionExt.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24846a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f24847b;

        static {
            int[] iArr = new int[ShortcutPermissionState.values().length];
            try {
                iArr[ShortcutPermissionState.ALLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShortcutPermissionState.DENY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShortcutPermissionState.ASK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[MiuiOpResult.values().length];
            try {
                iArr2[MiuiOpResult.ALLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MiuiOpResult.DENY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MiuiOpResult.ASK.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f24846a = iArr2;
            int[] iArr3 = new int[VivoShortcutPermission.values().length];
            try {
                iArr3[VivoShortcutPermission.ALLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[VivoShortcutPermission.DENY.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[VivoShortcutPermission.ASK.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f24847b = iArr3;
        }
    }

    public static final MiuiOpResult a(Context context) {
        Object m13constructorimpl;
        boolean z10;
        MiuiOpCode opCode = MiuiOpCode.OP_INSTALL_SHORTCUT;
        g.e(context, "<this>");
        g.e(opCode, "opCode");
        try {
            Object systemService = context.getSystemService(ea.a.p("UnAKbyRz", "zV3zTHAg"));
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            String p10 = ea.a.p("LGhUYxJPR041VCJyGnc=", "BWkIQmCc");
            Class<?> cls2 = Integer.TYPE;
            Object invoke = cls.getDeclaredMethod(p10, cls2, cls2, String.class).invoke(systemService, Integer.valueOf(opCode.getValue()), Integer.valueOf(context.getApplicationInfo().uid), context.getPackageName());
            g.c(invoke, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuFm5gbkVsICBHeTtlU2sNdB5pWi4gbnQ=", "yM0LnrCN"));
            m13constructorimpl = Result.m13constructorimpl(Integer.valueOf(((Integer) invoke).intValue()));
        } catch (Throwable th2) {
            m13constructorimpl = Result.m13constructorimpl(s.v(th2));
        }
        MiuiOpResult miuiOpResult = null;
        if (Result.m18isFailureimpl(m13constructorimpl)) {
            m13constructorimpl = null;
        }
        Integer num = (Integer) m13constructorimpl;
        ea.a.p("E3AUTxRz", "rpRdd1yq");
        MiuiOpResult.Companion.getClass();
        MiuiOpResult[] values = MiuiOpResult.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            MiuiOpResult miuiOpResult2 = values[i10];
            int value = miuiOpResult2.getValue();
            if (num != null && value == num.intValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                miuiOpResult = miuiOpResult2;
                break;
            }
            i10++;
        }
        if (miuiOpResult == null) {
            return MiuiOpResult.DENY;
        }
        return miuiOpResult;
    }

    public static final ShortcutPermissionState b(Context context) {
        VivoShortcutPermission m13constructorimpl;
        VivoShortcutPermission vivoShortcutPermission;
        String str;
        VivoShortcutPermission vivoShortcutPermission2;
        String string;
        ComponentName component;
        g.e(context, "<this>");
        if (((Boolean) f24845b.getValue()).booleanValue()) {
            int i10 = a.f24846a[a(context).ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return ShortcutPermissionState.DENY;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return ShortcutPermissionState.DENY;
            }
            return ShortcutPermissionState.ALLOW;
        } else if (((Boolean) f24844a.getValue()).booleanValue()) {
            if (Build.VERSION.SDK_INT >= 30) {
                vivoShortcutPermission = VivoShortcutPermission.ALLOW;
            } else {
                try {
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                    VivoShortcutPermission vivoShortcutPermission3 = null;
                    if (launchIntentForPackage != null && (component = launchIntentForPackage.getComponent()) != null) {
                        component.toString();
                        str = component.getPackageName() + PackagingURIHelper.FORWARD_SLASH_STRING + component.getClassName();
                    } else {
                        str = null;
                    }
                    Cursor query = context.getContentResolver().query(Uri.parse(ea.a.p("BW8NdFJuODpnLwVvWS41YlMuPmE8blVoEXJDLiJlNnQPbgRzGGYtdidyD3RRcw==", "rCfc7LIO")), new String[]{ea.a.p("QGgkcgdjF3QiZUZtAHMlaStu", "hJtjrzB5")}, ea.a.p("Jm5FZRd0Fz1nID8=", "B2Q6zETg"), new String[]{str}, null);
                    if (query != null) {
                        if (query.moveToFirst()) {
                            int columnIndex = query.getColumnIndex(ea.a.p("QGgkcgdjF3QiZUZtAHMlaStu", "dr0o5I1u"));
                            if (query.isNull(columnIndex)) {
                                string = null;
                            } else {
                                string = query.getString(columnIndex);
                            }
                            if (string != null) {
                                VivoShortcutPermission.Companion.getClass();
                                VivoShortcutPermission[] values = VivoShortcutPermission.values();
                                int length = values.length;
                                for (int i11 = 0; i11 < length; i11++) {
                                    vivoShortcutPermission2 = values[i11];
                                    if (f.w(string, vivoShortcutPermission2.getValues())) {
                                        break;
                                    }
                                }
                            }
                        }
                        vivoShortcutPermission2 = null;
                        d.l(query, null);
                        vivoShortcutPermission3 = vivoShortcutPermission2;
                    }
                    m13constructorimpl = Result.m13constructorimpl(vivoShortcutPermission3);
                } catch (Throwable th2) {
                    m13constructorimpl = Result.m13constructorimpl(s.v(th2));
                }
                Result.m16exceptionOrNullimpl(m13constructorimpl);
                VivoShortcutPermission vivoShortcutPermission4 = VivoShortcutPermission.ALLOW;
                if (Result.m18isFailureimpl(m13constructorimpl)) {
                    m13constructorimpl = vivoShortcutPermission4;
                }
                vivoShortcutPermission = (VivoShortcutPermission) m13constructorimpl;
                if (vivoShortcutPermission == null) {
                    vivoShortcutPermission = VivoShortcutPermission.DENY;
                }
            }
            int i12 = a.f24847b[vivoShortcutPermission.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        return ShortcutPermissionState.ASK;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return ShortcutPermissionState.DENY;
            }
            return ShortcutPermissionState.ALLOW;
        } else if (e.b(context)) {
            return ShortcutPermissionState.ALLOW;
        } else {
            return ShortcutPermissionState.DENY;
        }
    }

    public static final ShortcutPermissionState c(Context context) {
        g.e(context, "<this>");
        if (((Boolean) f24845b.getValue()).booleanValue()) {
            int i10 = a.f24846a[a(context).ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return ShortcutPermissionState.DENY;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return ShortcutPermissionState.DENY;
            }
            return ShortcutPermissionState.ALLOW;
        }
        return ShortcutPermissionState.ALLOW;
    }
}
