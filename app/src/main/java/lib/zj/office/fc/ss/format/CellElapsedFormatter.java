package lib.zj.office.fc.ss.format;

import a6.h;
import androidx.activity.r;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lib.zj.office.fc.ss.format.CellFormatPart;

/* loaded from: classes3.dex */
public class CellElapsedFormatter extends CellFormatter {
    private static final double HOUR__FACTOR = 0.041666666666666664d;
    private static final double MIN__FACTOR = 6.944444444444444E-4d;
    private static final Pattern PERCENTS = Pattern.compile("%");
    private static final double SEC__FACTOR = 1.1574074074074073E-5d;
    private final String printfFmt;
    private final List<TimeSpec> specs;
    private TimeSpec topmost;

    /* loaded from: classes3.dex */
    public class ElapsedPartHandler implements CellFormatPart.PartHandler {
        public /* synthetic */ ElapsedPartHandler(CellElapsedFormatter cellElapsedFormatter, int i10) {
            this();
        }

        @Override // lib.zj.office.fc.ss.format.CellFormatPart.PartHandler
        public String handlePart(Matcher matcher, String str, CellFormatType cellFormatType, StringBuffer stringBuffer) {
            int length = stringBuffer.length();
            char charAt = str.charAt(0);
            if (charAt != '\n') {
                if (charAt != '\"') {
                    if (charAt != '*') {
                        if (charAt != '0') {
                            if (charAt != '_') {
                                if (charAt != 'h' && charAt != 'm' && charAt != 's') {
                                    if (charAt != '[') {
                                        if (charAt == '\\') {
                                            str = str.substring(1);
                                        }
                                    } else if (str.length() >= 3) {
                                        if (CellElapsedFormatter.this.topmost == null) {
                                            String lowerCase = str.toLowerCase();
                                            int length2 = lowerCase.length() - 2;
                                            CellElapsedFormatter cellElapsedFormatter = CellElapsedFormatter.this;
                                            cellElapsedFormatter.topmost = cellElapsedFormatter.assignSpec(lowerCase.charAt(1), length, length2);
                                            return lowerCase.substring(1, length2 + 1);
                                        }
                                        throw new IllegalArgumentException("Duplicate '[' times in format");
                                    }
                                }
                            } else {
                                return null;
                            }
                        }
                        String lowerCase2 = str.toLowerCase();
                        CellElapsedFormatter.this.assignSpec(lowerCase2.charAt(0), length, lowerCase2.length());
                        return lowerCase2;
                    } else if (str.length() > 1) {
                        str = CellFormatPart.expandChar(str);
                    }
                } else {
                    str = r.e(str, 1, 1);
                }
                return CellElapsedFormatter.PERCENTS.matcher(str).replaceAll("%%");
            }
            return "%n";
        }

        private ElapsedPartHandler() {
        }
    }

    /* loaded from: classes3.dex */
    public static class TimeSpec {
        final double factor;
        final int len;
        double modBy = 0.0d;
        final int pos;
        final char type;

        public TimeSpec(char c, int i10, int i11, double d10) {
            this.type = c;
            this.pos = i10;
            this.len = i11;
            this.factor = d10;
        }

        public long valueFor(double d10) {
            double d11;
            double d12 = this.modBy;
            if (d12 == 0.0d) {
                d11 = d10 / this.factor;
            } else {
                d11 = (d10 / this.factor) % d12;
            }
            if (this.type == '0') {
                return Math.round(d11);
            }
            return (long) d11;
        }
    }

    public CellElapsedFormatter(String str) {
        super(str);
        ArrayList arrayList = new ArrayList();
        this.specs = arrayList;
        StringBuffer parseFormat = CellFormatPart.parseFormat(str, CellFormatType.ELAPSED, new ElapsedPartHandler(this, 0));
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            TimeSpec timeSpec = (TimeSpec) listIterator.previous();
            int i10 = timeSpec.pos;
            parseFormat.replace(i10, timeSpec.len + i10, h.g(new StringBuilder("%0"), timeSpec.len, "d"));
            char c = timeSpec.type;
            if (c != this.topmost.type) {
                timeSpec.modBy = modFor(c, timeSpec.len);
            }
        }
        this.printfFmt = parseFormat.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TimeSpec assignSpec(char c, int i10, int i11) {
        TimeSpec timeSpec = new TimeSpec(c, i10, i11, factorFor(c, i11));
        this.specs.add(timeSpec);
        return timeSpec;
    }

    private static double factorFor(char c, int i10) {
        if (c != '0') {
            if (c != 'h') {
                if (c != 'm') {
                    if (c == 's') {
                        return SEC__FACTOR;
                    }
                    throw new IllegalArgumentException("Uknown elapsed time spec: " + c);
                }
                return MIN__FACTOR;
            }
            return HOUR__FACTOR;
        }
        return SEC__FACTOR / Math.pow(10.0d, i10);
    }

    private static double modFor(char c, int i10) {
        if (c != '0') {
            if (c != 'h') {
                if (c == 'm' || c == 's') {
                    return 60.0d;
                }
                throw new IllegalArgumentException("Uknown elapsed time spec: " + c);
            }
            return 24.0d;
        }
        return Math.pow(10.0d, i10);
    }

    @Override // lib.zj.office.fc.ss.format.CellFormatter
    public void formatValue(StringBuffer stringBuffer, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        if (doubleValue < 0.0d) {
            stringBuffer.append('-');
            doubleValue = -doubleValue;
        }
        Long[] lArr = new Long[this.specs.size()];
        for (int i10 = 0; i10 < this.specs.size(); i10++) {
            lArr[i10] = Long.valueOf(this.specs.get(i10).valueFor(doubleValue));
        }
        new Formatter(stringBuffer).format(this.printfFmt, lArr);
    }

    @Override // lib.zj.office.fc.ss.format.CellFormatter
    public void simpleValue(StringBuffer stringBuffer, Object obj) {
        formatValue(stringBuffer, obj);
    }
}
