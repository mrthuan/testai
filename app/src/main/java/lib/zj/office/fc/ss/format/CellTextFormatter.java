package lib.zj.office.fc.ss.format;

import java.util.regex.Matcher;
import lib.zj.office.fc.ss.format.CellFormatPart;

/* loaded from: classes3.dex */
public class CellTextFormatter extends CellFormatter {
    static final CellFormatter SIMPLE_TEXT = new CellTextFormatter("@");
    private final String desc;
    private final int[] textPos;

    public CellTextFormatter(String str) {
        super(str);
        final int[] iArr = new int[1];
        String stringBuffer = CellFormatPart.parseFormat(str, CellFormatType.TEXT, new CellFormatPart.PartHandler() { // from class: lib.zj.office.fc.ss.format.CellTextFormatter.1
            @Override // lib.zj.office.fc.ss.format.CellFormatPart.PartHandler
            public String handlePart(Matcher matcher, String str2, CellFormatType cellFormatType, StringBuffer stringBuffer2) {
                if (str2.equals("@")) {
                    int[] iArr2 = iArr;
                    iArr2[0] = iArr2[0] + 1;
                    return "\u0000";
                }
                return null;
            }
        }).toString();
        this.desc = stringBuffer;
        int i10 = 0;
        this.textPos = new int[iArr[0]];
        int length = stringBuffer.length() - 1;
        while (true) {
            int[] iArr2 = this.textPos;
            if (i10 < iArr2.length) {
                iArr2[i10] = this.desc.lastIndexOf("\u0000", length);
                length = this.textPos[i10] - 1;
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // lib.zj.office.fc.ss.format.CellFormatter
    public void formatValue(StringBuffer stringBuffer, Object obj) {
        int length = stringBuffer.length();
        String obj2 = obj.toString();
        stringBuffer.append(this.desc);
        int i10 = 0;
        while (true) {
            int[] iArr = this.textPos;
            if (i10 < iArr.length) {
                int i11 = iArr[i10] + length;
                stringBuffer.replace(i11, i11 + 1, obj2);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // lib.zj.office.fc.ss.format.CellFormatter
    public void simpleValue(StringBuffer stringBuffer, Object obj) {
        SIMPLE_TEXT.formatValue(stringBuffer, obj);
    }
}
