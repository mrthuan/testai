package lib.zj.office.ss.util.format;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes3.dex */
public class FractionalFormat extends Format {
    private short mode;
    private int units;
    private short ONE_DIGIT = 1;
    private short TWO_DIGIT = 2;
    private short THREE_DIGIT = 3;
    private short UNITS = 4;

    public FractionalFormat(String str) {
        this.units = 1;
        this.mode = (short) -1;
        if ("# ?/?".equals(str)) {
            this.mode = this.ONE_DIGIT;
        } else if ("# ??/??".equals(str)) {
            this.mode = this.TWO_DIGIT;
        } else if ("# ???/???".equals(str)) {
            this.mode = this.THREE_DIGIT;
        } else if ("# ?/2".equals(str)) {
            this.mode = this.UNITS;
            this.units = 2;
        } else if ("# ?/4".equals(str)) {
            this.mode = this.UNITS;
            this.units = 4;
        } else if ("# ?/8".equals(str)) {
            this.mode = this.UNITS;
            this.units = 8;
        } else if ("# ??/16".equals(str)) {
            this.mode = this.UNITS;
            this.units = 16;
        } else if ("# ?/10".equals(str)) {
            this.mode = this.UNITS;
            this.units = 10;
        } else if ("# ??/100".equals(str)) {
            this.mode = this.UNITS;
            this.units = 100;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
        r8 = r20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(double r24, int r26) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.ss.util.format.FractionalFormat.a(double, int):java.lang.String");
    }

    @Override // java.text.Format
    public Object clone() {
        return null;
    }

    public final String format(double d10) {
        short s4 = this.mode;
        if (s4 == this.ONE_DIGIT) {
            return a(d10, 9);
        }
        if (s4 == this.TWO_DIGIT) {
            return a(d10, 99);
        }
        if (s4 == this.THREE_DIGIT) {
            return a(d10, 999);
        }
        if (s4 == this.UNITS) {
            int i10 = this.units;
            long j10 = (long) d10;
            long round = Math.round((d10 - j10) * i10);
            String concat = j10 != 0 ? "".concat(String.valueOf(j10)) : "";
            if (round != 0) {
                return concat.concat(" " + round + PackagingURIHelper.FORWARD_SLASH_STRING + i10);
            }
            return concat;
        }
        throw new RuntimeException("Unexpected Case");
    }

    @Override // java.text.Format
    public Object parseObject(String str) {
        return null;
    }

    @Override // java.text.Format
    public Object parseObject(String str, ParsePosition parsePosition) {
        return null;
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (obj instanceof Number) {
            stringBuffer.append(format(((Number) obj).doubleValue()));
            return stringBuffer;
        }
        throw new IllegalArgumentException("Can only handle Numbers");
    }
}
