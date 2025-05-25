package lib.zj.office.fc.hslf.model;

import androidx.activity.r;
import java.util.LinkedList;
import lib.zj.office.fc.hslf.model.textproperties.AutoNumberTextProp;
import lib.zj.office.fc.hslf.model.textproperties.TextPropCollection;
import lib.zj.office.fc.hslf.record.ExtendedParagraphAtom;
import lib.zj.office.fc.hslf.record.Record;
import lib.zj.office.fc.hslf.record.RecordContainer;
import lib.zj.office.fc.hslf.record.StyleTextPropAtom;
import lib.zj.office.fc.hslf.record.TextBytesAtom;
import lib.zj.office.fc.hslf.record.TextCharsAtom;
import lib.zj.office.fc.hslf.record.TextHeaderAtom;
import lib.zj.office.fc.hslf.record.TextRulerAtom;
import lib.zj.office.fc.hslf.record.TextSpecInfoAtom;
import lib.zj.office.fc.hslf.usermodel.RichTextRun;
import lib.zj.office.fc.hslf.usermodel.SlideShow;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class TextRun {
    protected TextBytesAtom _byteAtom;
    protected TextCharsAtom _charAtom;
    protected ExtendedParagraphAtom _extendedParagraphAtom;
    protected TextHeaderAtom _headerAtom;
    protected boolean _isUnicode;
    protected Record[] _records;
    protected RichTextRun[] _rtRuns;
    protected TextRulerAtom _ruler;
    private Sheet _sheet;
    protected StyleTextPropAtom _styleAtom;
    private int shapeId;
    private SlideShow slideShow;
    private int slwtIndex;

    public TextRun(TextHeaderAtom textHeaderAtom, TextCharsAtom textCharsAtom, StyleTextPropAtom styleTextPropAtom) {
        this(textHeaderAtom, null, textCharsAtom, styleTextPropAtom);
    }

    private void storeText(String str) {
        int i10 = 0;
        if (str.endsWith("\r")) {
            str = r.e(str, 1, 0);
        }
        if (this._isUnicode) {
            this._charAtom.setText(str);
        } else if (!StringUtil.hasMultibyte(str)) {
            byte[] bArr = new byte[str.length()];
            StringUtil.putCompressedUnicode(str, bArr, 0);
            this._byteAtom.setText(bArr);
        } else {
            TextCharsAtom textCharsAtom = new TextCharsAtom();
            this._charAtom = textCharsAtom;
            textCharsAtom.setText(str);
            Record[] childRecords = this._headerAtom.getParentRecord().getChildRecords();
            int i11 = 0;
            while (true) {
                if (i11 >= childRecords.length) {
                    break;
                } else if (childRecords[i11].equals(this._byteAtom)) {
                    childRecords[i11] = this._charAtom;
                    break;
                } else {
                    i11++;
                }
            }
            this._byteAtom = null;
            this._isUnicode = true;
        }
        if (this._records == null) {
            return;
        }
        while (true) {
            Record[] recordArr = this._records;
            if (i10 < recordArr.length) {
                Record record = recordArr[i10];
                if (record instanceof TextSpecInfoAtom) {
                    TextSpecInfoAtom textSpecInfoAtom = (TextSpecInfoAtom) record;
                    if (str.length() + 1 != textSpecInfoAtom.getCharactersCovered()) {
                        textSpecInfoAtom.reset(str.length() + 1);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public RichTextRun appendText(String str) {
        ensureStyleAtomPresent();
        int length = getRawText().length();
        storeText(getRawText() + str);
        int paragraphTextLengthCovered = this._styleAtom.getParagraphTextLengthCovered() - length;
        int characterTextLengthCovered = this._styleAtom.getCharacterTextLengthCovered() - length;
        if (paragraphTextLengthCovered > 0) {
            TextPropCollection last = this._styleAtom.getParagraphStyles().getLast();
            last.updateTextSize(last.getCharactersCovered() - paragraphTextLengthCovered);
        }
        if (characterTextLengthCovered > 0) {
            TextPropCollection last2 = this._styleAtom.getCharacterStyles().getLast();
            last2.updateTextSize(last2.getCharactersCovered() - characterTextLengthCovered);
        }
        RichTextRun richTextRun = new RichTextRun(this, length, str.length(), this._styleAtom.addParagraphTextPropCollection(str.length() + paragraphTextLengthCovered), this._styleAtom.addCharacterTextPropCollection(str.length() + characterTextLengthCovered), false, false);
        RichTextRun[] richTextRunArr = this._rtRuns;
        int length2 = richTextRunArr.length + 1;
        RichTextRun[] richTextRunArr2 = new RichTextRun[length2];
        System.arraycopy(richTextRunArr, 0, richTextRunArr2, 0, richTextRunArr.length);
        richTextRunArr2[length2 - 1] = richTextRun;
        this._rtRuns = richTextRunArr2;
        return richTextRun;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
        if (r3 < r4) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void buildRichTextRuns(java.util.LinkedList r22, java.util.LinkedList r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.hslf.model.TextRun.buildRichTextRuns(java.util.LinkedList, java.util.LinkedList, java.lang.String):void");
    }

    public void changeTextInRichTextRun(RichTextRun richTextRun, String str) {
        int i10 = -1;
        int i11 = 0;
        while (true) {
            RichTextRun[] richTextRunArr = this._rtRuns;
            if (i11 >= richTextRunArr.length) {
                break;
            }
            if (richTextRun.equals(richTextRunArr[i11])) {
                i10 = i11;
            }
            i11++;
        }
        if (i10 != -1) {
            ensureStyleAtomPresent();
            TextPropCollection _getRawParagraphStyle = richTextRun._getRawParagraphStyle();
            TextPropCollection _getRawCharacterStyle = richTextRun._getRawCharacterStyle();
            int length = str.length();
            if (i10 == this._rtRuns.length - 1) {
                length++;
            }
            if (richTextRun._isParagraphStyleShared()) {
                _getRawParagraphStyle.updateTextSize(str.length() + (_getRawParagraphStyle.getCharactersCovered() - richTextRun.getLength()));
            } else {
                _getRawParagraphStyle.updateTextSize(length);
            }
            if (richTextRun._isCharacterStyleShared()) {
                _getRawCharacterStyle.updateTextSize(str.length() + (_getRawCharacterStyle.getCharactersCovered() - richTextRun.getLength()));
            } else {
                _getRawCharacterStyle.updateTextSize(length);
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (int i12 = 0; i12 < this._rtRuns.length; i12++) {
                int length2 = stringBuffer.length();
                if (i12 != i10) {
                    stringBuffer.append(this._rtRuns[i12].getRawText());
                } else {
                    stringBuffer.append(str);
                }
                if (i12 > i10) {
                    this._rtRuns[i12].updateStartPosition(length2);
                }
            }
            storeText(stringBuffer.toString());
            return;
        }
        throw new IllegalArgumentException("Supplied RichTextRun wasn't from this TextRun");
    }

    public TextRulerAtom createTextRuler() {
        TextRulerAtom textRuler = getTextRuler();
        this._ruler = textRuler;
        if (textRuler == null) {
            this._ruler = TextRulerAtom.getParagraphInstance();
            this._headerAtom.getParentRecord().appendChildRecord(this._ruler);
        }
        return this._ruler;
    }

    public void dispose() {
        TextHeaderAtom textHeaderAtom = this._headerAtom;
        if (textHeaderAtom != null) {
            textHeaderAtom.dispose();
        }
        TextBytesAtom textBytesAtom = this._byteAtom;
        if (textBytesAtom != null) {
            textBytesAtom.dispose();
        }
        TextCharsAtom textCharsAtom = this._charAtom;
        if (textCharsAtom != null) {
            textCharsAtom.dispose();
        }
        StyleTextPropAtom styleTextPropAtom = this._styleAtom;
        if (styleTextPropAtom != null) {
            styleTextPropAtom.dispose();
        }
        TextRulerAtom textRulerAtom = this._ruler;
        if (textRulerAtom != null) {
            textRulerAtom.dispose();
        }
        ExtendedParagraphAtom extendedParagraphAtom = this._extendedParagraphAtom;
        if (extendedParagraphAtom != null) {
            extendedParagraphAtom.dispose();
        }
        RichTextRun[] richTextRunArr = this._rtRuns;
        if (richTextRunArr != null) {
            for (RichTextRun richTextRun : richTextRunArr) {
                richTextRun.dispose();
            }
        }
    }

    public void ensureStyleAtomPresent() {
        if (this._styleAtom != null) {
            return;
        }
        this._styleAtom = new StyleTextPropAtom(getRawText().length() + 1);
        RecordContainer parentRecord = this._headerAtom.getParentRecord();
        Record record = this._byteAtom;
        if (record == null) {
            record = this._charAtom;
        }
        parentRecord.addChildAfter(this._styleAtom, record);
        RichTextRun[] richTextRunArr = this._rtRuns;
        if (richTextRunArr.length == 1) {
            richTextRunArr[0].supplyTextProps(this._styleAtom.getParagraphStyles().get(0), this._styleAtom.getCharacterStyles().get(0), false, false);
            return;
        }
        throw new IllegalStateException("Needed to add StyleTextPropAtom when had many rich text runs");
    }

    public int getAutoNumberIndex(int i10) {
        StyleTextPropAtom styleTextPropAtom;
        if (this._records != null) {
            int i11 = 0;
            while (true) {
                Record[] recordArr = this._records;
                if (i11 < recordArr.length) {
                    Record record = recordArr[i11];
                    if ((record instanceof StyleTextPropAtom) && (styleTextPropAtom = (StyleTextPropAtom) record) != null) {
                        return styleTextPropAtom.getAutoNumberIndex(i10);
                    }
                    i11++;
                } else {
                    return -1;
                }
            }
        } else {
            return -1;
        }
    }

    public ExtendedParagraphAtom getExtendedParagraphAtom() {
        return this._extendedParagraphAtom;
    }

    public Hyperlink[] getHyperlinks() {
        return Hyperlink.find(this);
    }

    public int getIndex() {
        return this.slwtIndex;
    }

    public int getNumberingStart(int i10) {
        int autoNumberIndex;
        LinkedList<AutoNumberTextProp> extendedParagraphPropList;
        AutoNumberTextProp autoNumberTextProp;
        if (this._extendedParagraphAtom != null && (autoNumberIndex = getAutoNumberIndex(i10)) >= 0 && (extendedParagraphPropList = this._extendedParagraphAtom.getExtendedParagraphPropList()) != null && extendedParagraphPropList.size() > 0 && autoNumberIndex < extendedParagraphPropList.size() && (autoNumberTextProp = extendedParagraphPropList.get(autoNumberIndex)) != null) {
            return autoNumberTextProp.getStart();
        }
        return 0;
    }

    public int getNumberingType(int i10) {
        int autoNumberIndex;
        LinkedList<AutoNumberTextProp> extendedParagraphPropList;
        AutoNumberTextProp autoNumberTextProp;
        if (this._extendedParagraphAtom != null && (autoNumberIndex = getAutoNumberIndex(i10)) >= 0 && (extendedParagraphPropList = this._extendedParagraphAtom.getExtendedParagraphPropList()) != null && extendedParagraphPropList.size() > 0 && autoNumberIndex < extendedParagraphPropList.size() && (autoNumberTextProp = extendedParagraphPropList.get(autoNumberIndex)) != null) {
            return autoNumberTextProp.getNumberingType();
        }
        return -1;
    }

    public String getRawText() {
        if (this._isUnicode) {
            return this._charAtom.getText();
        }
        return this._byteAtom.getText();
    }

    public Record[] getRecords() {
        return this._records;
    }

    public RichTextRun getRichTextRunAt(int i10) {
        int i11 = 0;
        while (true) {
            RichTextRun[] richTextRunArr = this._rtRuns;
            if (i11 < richTextRunArr.length) {
                int startIndex = richTextRunArr[i11].getStartIndex();
                int endIndex = this._rtRuns[i11].getEndIndex();
                if (i10 >= startIndex && i10 < endIndex) {
                    return this._rtRuns[i11];
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public RichTextRun[] getRichTextRuns() {
        return this._rtRuns;
    }

    public int getRunType() {
        return this._headerAtom.getTextType();
    }

    public int getShapeId() {
        return this.shapeId;
    }

    public Sheet getSheet() {
        return this._sheet;
    }

    public String getText() {
        return getRawText().replace('\r', '\n').replace((char) 11, (char) 11);
    }

    public TextRulerAtom getTextRuler() {
        if (this._ruler == null && this._records != null) {
            int i10 = 0;
            while (true) {
                Record[] recordArr = this._records;
                if (i10 >= recordArr.length) {
                    break;
                }
                Record record = recordArr[i10];
                if (record instanceof TextRulerAtom) {
                    this._ruler = (TextRulerAtom) record;
                    break;
                }
                i10++;
            }
        }
        return this._ruler;
    }

    public String normalize(String str) {
        return str.replaceAll("\\r?\\n", "\r");
    }

    public void setExtendedParagraphAtom(ExtendedParagraphAtom extendedParagraphAtom) {
        this._extendedParagraphAtom = extendedParagraphAtom;
    }

    public void setIndex(int i10) {
        this.slwtIndex = i10;
    }

    public void setRawText(String str) {
        storeText(str);
        RichTextRun richTextRun = this._rtRuns[0];
        int i10 = 0;
        while (true) {
            RichTextRun[] richTextRunArr = this._rtRuns;
            if (i10 >= richTextRunArr.length) {
                break;
            }
            richTextRunArr[i10] = null;
            i10++;
        }
        this._rtRuns = r3;
        RichTextRun[] richTextRunArr2 = {richTextRun};
        StyleTextPropAtom styleTextPropAtom = this._styleAtom;
        if (styleTextPropAtom != null) {
            LinkedList<TextPropCollection> paragraphStyles = styleTextPropAtom.getParagraphStyles();
            while (paragraphStyles.size() > 1) {
                paragraphStyles.removeLast();
            }
            LinkedList<TextPropCollection> characterStyles = this._styleAtom.getCharacterStyles();
            while (characterStyles.size() > 1) {
                characterStyles.removeLast();
            }
            this._rtRuns[0].setText(str);
            return;
        }
        richTextRunArr2[0] = new RichTextRun(this, 0, str.length());
    }

    public void setRunType(int i10) {
        this._headerAtom.setTextType(i10);
    }

    public void setShapeId(int i10) {
        this.shapeId = i10;
    }

    public void setSheet(Sheet sheet) {
        this._sheet = sheet;
    }

    public void setText(String str) {
        setRawText(normalize(str));
    }

    public void supplySlideShow(SlideShow slideShow) {
        this.slideShow = slideShow;
        if (this._rtRuns != null) {
            int i10 = 0;
            while (true) {
                RichTextRun[] richTextRunArr = this._rtRuns;
                if (i10 < richTextRunArr.length) {
                    richTextRunArr[i10].supplySlideShow(this.slideShow);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public TextRun(TextHeaderAtom textHeaderAtom, TextBytesAtom textBytesAtom, StyleTextPropAtom styleTextPropAtom) {
        this(textHeaderAtom, textBytesAtom, null, styleTextPropAtom);
    }

    private TextRun(TextHeaderAtom textHeaderAtom, TextBytesAtom textBytesAtom, TextCharsAtom textCharsAtom, StyleTextPropAtom styleTextPropAtom) {
        this.shapeId = -1;
        this._headerAtom = textHeaderAtom;
        this._styleAtom = styleTextPropAtom;
        if (textBytesAtom != null) {
            this._byteAtom = textBytesAtom;
            this._isUnicode = false;
        } else {
            this._charAtom = textCharsAtom;
            this._isUnicode = true;
        }
        String text = getText();
        LinkedList<TextPropCollection> linkedList = new LinkedList<>();
        LinkedList<TextPropCollection> linkedList2 = new LinkedList<>();
        StyleTextPropAtom styleTextPropAtom2 = this._styleAtom;
        if (styleTextPropAtom2 != null) {
            styleTextPropAtom2.setParentTextSize(text.length());
            linkedList = this._styleAtom.getParagraphStyles();
            linkedList2 = this._styleAtom.getCharacterStyles();
        }
        buildRichTextRuns(linkedList, linkedList2, text);
    }
}
