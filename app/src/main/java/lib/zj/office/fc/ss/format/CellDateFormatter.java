package lib.zj.office.fc.ss.format;

import java.text.AttributedCharacterIterator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.regex.Matcher;
import lib.zj.office.fc.ss.format.CellFormatPart;

/* loaded from: classes3.dex */
public class CellDateFormatter extends CellFormatter {
    private static final Date EXCEL_EPOCH_DATE;
    private static final long EXCEL_EPOCH_TIME;
    private static final CellFormatter SIMPLE_DATE = new CellDateFormatter("mm/d/y");
    private boolean amPmUpper;
    private final DateFormat dateFmt;
    private String sFmt;
    private boolean showAmPm;
    private boolean showM;

    /* loaded from: classes3.dex */
    public class DatePartHandler implements CellFormatPart.PartHandler {
        private int hLen;
        private int hStart;
        private int mLen;
        private int mStart;

        public /* synthetic */ DatePartHandler(CellDateFormatter cellDateFormatter, int i10) {
            this();
        }

        public void finish(StringBuffer stringBuffer) {
            if (this.hStart >= 0 && !CellDateFormatter.this.showAmPm) {
                for (int i10 = 0; i10 < this.hLen; i10++) {
                    stringBuffer.setCharAt(this.hStart + i10, 'H');
                }
            }
        }

        @Override // lib.zj.office.fc.ss.format.CellFormatPart.PartHandler
        public String handlePart(Matcher matcher, String str, CellFormatType cellFormatType, StringBuffer stringBuffer) {
            int length;
            boolean z10;
            int length2 = stringBuffer.length();
            boolean z11 = false;
            switch (str.charAt(0)) {
                case '0':
                    this.mStart = -1;
                    CellDateFormatter.this.sFmt = "%0" + (length + 2) + "." + str.length() + "f";
                    return str.replace('0', 'S');
                case 'A':
                case 'P':
                case 'a':
                case 'p':
                    if (str.length() > 1) {
                        this.mStart = -1;
                        CellDateFormatter.this.showAmPm = true;
                        CellDateFormatter cellDateFormatter = CellDateFormatter.this;
                        if (Character.toLowerCase(str.charAt(1)) == 'm') {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        cellDateFormatter.showM = z10;
                        CellDateFormatter cellDateFormatter2 = CellDateFormatter.this;
                        cellDateFormatter2.amPmUpper = (cellDateFormatter2.showM || Character.isUpperCase(str.charAt(0))) ? true : true;
                        return "a";
                    }
                    return null;
                case 'D':
                case 'd':
                    this.mStart = -1;
                    if (str.length() <= 2) {
                        return str.toLowerCase();
                    }
                    return str.toLowerCase().replace('d', 'E');
                case 'H':
                case 'h':
                    this.mStart = -1;
                    this.hStart = length2;
                    this.hLen = str.length();
                    return str.toLowerCase();
                case 'M':
                case 'm':
                    this.mStart = length2;
                    this.mLen = str.length();
                    return str.toUpperCase();
                case 'S':
                case 's':
                    if (this.mStart >= 0) {
                        for (int i10 = 0; i10 < this.mLen; i10++) {
                            stringBuffer.setCharAt(this.mStart + i10, 'm');
                        }
                        this.mStart = -1;
                    }
                    return str.toLowerCase();
                case 'Y':
                case 'y':
                    this.mStart = -1;
                    if (str.length() == 3) {
                        str = "yyyy";
                    }
                    return str.toLowerCase();
                default:
                    return null;
            }
        }

        private DatePartHandler() {
            this.mStart = -1;
            this.hStart = -1;
        }
    }

    static {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1904, 0, 1, 0, 0, 0);
        EXCEL_EPOCH_DATE = calendar.getTime();
        EXCEL_EPOCH_TIME = calendar.getTimeInMillis();
    }

    public CellDateFormatter(String str) {
        super(str);
        DatePartHandler datePartHandler = new DatePartHandler(this, 0);
        StringBuffer parseFormat = CellFormatPart.parseFormat(str, CellFormatType.DATE, datePartHandler);
        datePartHandler.finish(parseFormat);
        this.dateFmt = new SimpleDateFormat(parseFormat.toString());
    }

    @Override // lib.zj.office.fc.ss.format.CellFormatter
    public void formatValue(StringBuffer stringBuffer, Object obj) {
        if (obj == null) {
            obj = Double.valueOf(0.0d);
        }
        if (obj instanceof Number) {
            double doubleValue = ((Number) obj).doubleValue();
            if (doubleValue == 0.0d) {
                obj = EXCEL_EPOCH_DATE;
            } else {
                obj = new Date((long) (EXCEL_EPOCH_TIME + doubleValue));
            }
        }
        AttributedCharacterIterator formatToCharacterIterator = this.dateFmt.formatToCharacterIterator(obj);
        formatToCharacterIterator.first();
        boolean z10 = false;
        boolean z11 = false;
        for (char first = formatToCharacterIterator.first(); first != 65535; first = formatToCharacterIterator.next()) {
            if (formatToCharacterIterator.getAttribute(DateFormat.Field.MILLISECOND) != null) {
                if (!z10) {
                    int length = stringBuffer.length();
                    new Formatter(stringBuffer).format(CellFormatter.LOCALE, this.sFmt, Double.valueOf((((Date) obj).getTime() % 1000) / 1000.0d));
                    stringBuffer.delete(length, length + 2);
                    z10 = true;
                }
            } else if (formatToCharacterIterator.getAttribute(DateFormat.Field.AM_PM) != null) {
                if (!z11) {
                    if (this.showAmPm) {
                        if (this.amPmUpper) {
                            stringBuffer.append(Character.toUpperCase(first));
                            if (this.showM) {
                                stringBuffer.append('M');
                            }
                        } else {
                            stringBuffer.append(Character.toLowerCase(first));
                            if (this.showM) {
                                stringBuffer.append('m');
                            }
                        }
                    }
                    z11 = true;
                }
            } else {
                stringBuffer.append(first);
            }
        }
    }

    @Override // lib.zj.office.fc.ss.format.CellFormatter
    public void simpleValue(StringBuffer stringBuffer, Object obj) {
        SIMPLE_DATE.formatValue(stringBuffer, obj);
    }
}
