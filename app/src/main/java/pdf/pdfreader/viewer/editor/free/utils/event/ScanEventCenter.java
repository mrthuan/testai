package pdf.pdfreader.viewer.editor.free.utils.event;

import android.content.Context;
import androidx.activity.f;
import java.util.HashSet;
import kotlin.NoWhenBranchMatchedException;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.GroupAiFilterType;
import tf.c;

/* compiled from: ScanEventCenter.kt */
/* loaded from: classes3.dex */
public final class ScanEventCenter {

    /* renamed from: a  reason: collision with root package name */
    public static final c f28674a = kotlin.a.a(new cg.a<Context>() { // from class: pdf.pdfreader.viewer.editor.free.utils.event.ScanEventCenter$applicationContext$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Context invoke() {
            return ReaderPdfApplication.m();
        }
    });

    /* renamed from: b  reason: collision with root package name */
    public static final HashSet<String> f28675b = new HashSet<>();

    /* compiled from: ScanEventCenter.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28676a;

        static {
            int[] iArr = new int[GroupAiFilterType.values().length];
            try {
                iArr[GroupAiFilterType.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupAiFilterType.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupAiFilterType.CUSTOM1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GroupAiFilterType.CUSTOM2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GroupAiFilterType.CUSTOM_BW1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GroupAiFilterType.CUSTOM_BW2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GroupAiFilterType.CONTRAST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GroupAiFilterType.REVERSE_COLOR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[GroupAiFilterType.GRAYSCALE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[GroupAiFilterType.BLEND_ALPHA.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[GroupAiFilterType.SUPER_DOCS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[GroupAiFilterType.SUPER_IMAGE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f28676a = iArr;
        }
    }

    public static Context a() {
        return (Context) f28674a.getValue();
    }

    public static String b(GroupAiFilterType groupAiFilterType) {
        switch (a.f28676a[groupAiFilterType.ordinal()]) {
            case 1:
                return ea.a.p("O3UQbw==", "6UZdXT67");
            case 2:
                return ea.a.p("XHIiZxpuA2w=", "e8arZ0a8");
            case 3:
                return ea.a.p("K29j", "jmuI26tN");
            case 4:
                return ea.a.p("PHVBZXI=", "NG4LTJIl");
            case 5:
                return ea.a.p("LXcx", "oxKfWixC");
            case 6:
                return ea.a.p("LXcy", "uIscA3AZ");
            case 7:
                return ea.a.p("Km5ZYRdjUjE=", "WryR2zpm");
            case 8:
                return ea.a.p("Jm5HZQt0", "6ngU4j1I");
            case 9:
                return ea.a.p("VHIqeQ==", "Fq5O1Mqu");
            case 10:
                return ea.a.p("Vm4jYR1jBzI=", "Lv5NCl21");
            case 11:
                return ea.a.p("K29j", "3CimwkYh");
            case 12:
                return ea.a.p("Wm0qZ2U=", "p30HyV42");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static void c(String str, boolean z10) {
        String str2;
        String str3;
        Context a10 = a();
        String p10 = ea.a.p("UHIkcA==", "7hLm775g");
        String p11 = ea.a.p("LHJecCZhQnQ1XylsHGNr", "NmsVR8eL");
        if (z10) {
            str2 = "UnU_bw==";
            str3 = "EAiH5C1V";
        } else {
            str2 = "ImFfdRhs";
            str3 = "O1I2GUFl";
        }
        tn.a.d(a10, p10, p11, f.m(str, "_", ea.a.p(str2, str3)), false);
    }

    public static void d(String str) {
        tn.a.d(a(), ea.a.p("LHJecA==", "NPnzdbcF"), ea.a.p("LHJecCZsUmYuXylsHGNr", "1Ip4WyLI"), str, false);
    }

    public static void e(String str) {
        HashSet<String> hashSet = f28675b;
        if (hashSet.contains(ea.a.p("FXIkcB1wL2ctXwVsXWNr", "FUvKBNqg"))) {
            return;
        }
        hashSet.add(ea.a.p("UHIkcCxwA2cXX1dsAGNr", "xra4GRTd"));
        tn.a.d(a(), ea.a.p("UHIkcA==", "EZ67Mxp0"), ea.a.p("UHIkcCxwA2cXX1dsAGNr", "qpEESb16"), str, false);
    }

    public static void f(String str) {
        tn.a.d(a(), ea.a.p("UHIkcA==", "PlDRCRSN"), ea.a.p("OnI3cCVyH2cgdDljWGk0aw==", "MsYXzvq3"), str, false);
    }

    public static void g(String str) {
        tn.a.d(a(), ea.a.p("LHJecA==", "16Zk63M8"), ea.a.p("UHIkcCxzCm93", "iho5Zeee"), str, false);
    }
}
