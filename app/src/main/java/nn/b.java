package nn;

import android.content.Context;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.GroupAiFilterType;

/* compiled from: FilterImageHelper.kt */
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: FilterImageHelper.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22607a;

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
                iArr[GroupAiFilterType.SUPER_DOCS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GroupAiFilterType.CUSTOM2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GroupAiFilterType.SUPER_IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GroupAiFilterType.BLEND_ALPHA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GroupAiFilterType.CONTRAST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GroupAiFilterType.CUSTOM_BW1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[GroupAiFilterType.CUSTOM_BW2.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[GroupAiFilterType.GRAYSCALE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[GroupAiFilterType.REVERSE_COLOR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f22607a = iArr;
        }
    }

    public static String a(Context context, GroupAiFilterType groupAiFilterType) {
        int i10;
        g.e(context, "context");
        String string = context.getResources().getString(R.string.arg_res_0x7f130164);
        g.d(string, ea.a.p("KW8tdAZ4OS46ZRVvQXI0ZUsuNWU9U0JyloDXUn9zNnIjbiQuBWkhdC1yOW9GaTBpVmE-KQ==", "HRJCcM2r"));
        if (groupAiFilterType == null) {
            i10 = -1;
        } else {
            i10 = a.f22607a[groupAiFilterType.ordinal()];
        }
        switch (i10) {
            case 1:
                String string2 = context.getResources().getString(R.string.arg_res_0x7f13007f);
                g.d(string2, ea.a.p("UG8ldBZ4Fi4AZUdvHHI1ZTcuVWUyUzdyKG5fKAQuAXRBaSVnXWEXdB0p", "A8Vr40Q3"));
                return string2;
            case 2:
                String string3 = context.getResources().getString(R.string.arg_res_0x7f130164);
                g.d(string3, ea.a.p("L28tdFJ4MC46ZRVvQXI0ZUsuNWU9U0JyloDXUn9zNnIlbiQuUWkodC1yOW9GaTBpVmE-KQ==", "UELC7D6V"));
                return string3;
            case 3:
                String string4 = context.getResources().getString(R.string.arg_res_0x7f130105);
                g.d(string4, ea.a.p("LG9fdBx4Qy4oZTlvAHILZUYuCWUxUxFyD24CKDEuMXQ9aV9nV2RYYykp", "6ygCfecB"));
                return string4;
            case 4:
                String string5 = context.getResources().getString(R.string.arg_res_0x7f130165);
                g.d(string5, ea.a.p("BG84dC94Di46ZRVvQXI0ZUsuNWU9U0JyHW4WKAMuMXQVaThnZGYTbDxlFF9HdSdlSik=", "osgVJzgq"));
                return string5;
            case 5:
                String string6 = context.getResources().getString(R.string.arg_res_0x7f130198);
                g.d(string6, ea.a.p("LG9fdBx4Qy4oZTlvAHILZUYuCWUxUxFyA241KBcuBnQ9aV9nV2laYT1lKQ==", "2WWZjREu"));
                return string6;
            case 6:
                String string7 = context.getResources().getString(R.string.arg_res_0x7f130161);
                g.d(string7, ea.a.p("LG9fdBx4Qy4oZTlvAHILZUYuCWUxUxFyqIDiUmRzE3ImblYuH2lbdD9yFWUbaAluVmVcKQ==", "ysrOJDJg"));
                return string7;
            case 7:
                String string8 = context.getResources().getString(R.string.arg_res_0x7f130160);
                g.d(string8, ea.a.p("UG8ldBZ4Fi4AZUdvHHI1ZTcuVWUyUzdy0oDNKDguJXRBaSVnXWYLbAZlRl8Mbj5hKmNXKQ==", "0kjVzACV"));
                return string8;
            case 8:
                String string9 = context.getResources().getString(R.string.arg_res_0x7f13015e);
                g.d(string9, ea.a.p("BG8UdAJ4TC46ZRVvQXI0ZUsuNWU9U0JyHW4WKAMuMXQVaRRnSWZRbDxlFF9Wdyk=", "fZgzg8Rq"));
                return string9;
            case 9:
                String string10 = context.getResources().getString(R.string.arg_res_0x7f13015f);
                g.d(string10, ea.a.p("N29XdA14DC46ZRVvQXI0ZUsuNWU9U0JyHW4WKAMuMXQmaVdnRmYRbDxlFF9Wd2Up", "8mT9hxOB"));
                return string10;
            case 10:
                String string11 = context.getResources().getString(R.string.arg_res_0x7f130162);
                g.d(string11, ea.a.p("UG8ldBZ4Fi4AZUdvHHI1ZTcuVWUyUzdyXG4NKB4uBnRBaSVnXWYLbAZlRl8OcjN5KQ==", "5jLuoKzI"));
                return string11;
            case 11:
                String string12 = context.getResources().getString(R.string.arg_res_0x7f130163);
                g.d(string12, ea.a.p("BW8rdC14Ay46ZRVvQXI0ZUsuNWU9U0JyloDXZ3lSbHMScixuLy4RaSR0A3JraTl2XXImKQ==", "qkfEHwWA"));
                return string12;
            default:
                return string;
        }
    }
}
