package lib.zj.office.fc.ss.format;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Locale;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class CellFormatter {
    public static final Locale LOCALE = Locale.US;
    static final Logger logger = Logger.getLogger(CellFormatter.class.getName());
    protected final String format;

    public CellFormatter(String str) {
        this.format = str;
    }

    public static String quote(String str) {
        return OperatorName.SHOW_TEXT_LINE_AND_SPACE + str + '\"';
    }

    public String format(Object obj) {
        StringBuffer stringBuffer = new StringBuffer();
        formatValue(stringBuffer, obj);
        return stringBuffer.toString();
    }

    public abstract void formatValue(StringBuffer stringBuffer, Object obj);

    public String simpleFormat(Object obj) {
        StringBuffer stringBuffer = new StringBuffer();
        simpleValue(stringBuffer, obj);
        return stringBuffer.toString();
    }

    public abstract void simpleValue(StringBuffer stringBuffer, Object obj);
}
