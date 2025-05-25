package lib.zj.office.fc.util;

/* loaded from: classes3.dex */
public class NumberFormatUtil {
    private static final String TAG = "NumberFormatUtil";

    public static int toInt(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str, 10);
        } catch (NumberFormatException unused) {
            if (str.indexOf(".") > 0) {
                return Integer.parseInt(str.substring(0, str.indexOf(".")), 10);
            }
            return 0;
        }
    }

    public static int toInt(String str, int i10) {
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str, i10);
        } catch (NumberFormatException unused) {
            if (str.indexOf(".") > 0) {
                return Integer.parseInt(str.substring(0, str.indexOf(".")), i10);
            }
            return 0;
        }
    }
}
