package lib.zj.office.fc.hslf.usermodel;

import lib.zj.office.fc.hslf.model.MasterSheet;
import lib.zj.office.fc.hslf.model.Sheet;
import lib.zj.office.fc.hslf.model.TextRun;
import lib.zj.office.fc.hslf.model.textproperties.BitMaskTextProp;
import lib.zj.office.fc.hslf.model.textproperties.CharFlagsTextProp;
import lib.zj.office.fc.hslf.model.textproperties.ParagraphFlagsTextProp;
import lib.zj.office.fc.hslf.model.textproperties.TextProp;
import lib.zj.office.fc.hslf.model.textproperties.TextPropCollection;
import lib.zj.office.fc.hslf.record.ColorSchemeAtom;
import lib.zj.office.fc.ss.util.CellUtil;
import lib.zj.office.java.awt.Color;

/* loaded from: classes3.dex */
public final class RichTextRun {
    private String _fontname;
    private TextPropCollection characterStyle;
    private int length;
    private TextPropCollection paragraphStyle;
    private TextRun parentRun;
    private boolean sharingCharacterStyle;
    private boolean sharingParagraphStyle;
    private SlideShow slideShow;
    private int startPos;

    public RichTextRun(TextRun textRun, int i10, int i11) {
        this(textRun, i10, i11, null, null, false, false);
    }

    private TextProp fetchOrAddTextProp(TextPropCollection textPropCollection, String str) {
        TextProp findByName = textPropCollection.findByName(str);
        if (findByName == null) {
            return textPropCollection.addWithName(str);
        }
        return findByName;
    }

    private int getCharTextPropVal(String str) {
        TextProp textProp;
        TextPropCollection textPropCollection = this.characterStyle;
        if (textPropCollection != null) {
            textProp = textPropCollection.findByName(str);
        } else {
            textProp = null;
        }
        if (textProp == null) {
            Sheet sheet = this.parentRun.getSheet();
            int runType = this.parentRun.getRunType();
            MasterSheet masterSheet = sheet.getMasterSheet();
            if (masterSheet != null) {
                textProp = masterSheet.getStyleAttribute(runType, getIndentLevel(), str, true);
            }
        }
        if (textProp == null && str.equalsIgnoreCase("font.color")) {
            return Color.BLACK.getRGB();
        }
        if (textProp == null) {
            return -1;
        }
        return textProp.getValue();
    }

    private boolean getFlag(boolean z10, int i10) {
        TextPropCollection textPropCollection;
        String str;
        BitMaskTextProp bitMaskTextProp;
        Sheet sheet;
        if (z10) {
            textPropCollection = this.characterStyle;
            str = CharFlagsTextProp.NAME;
        } else {
            textPropCollection = this.paragraphStyle;
            str = ParagraphFlagsTextProp.NAME;
        }
        if (textPropCollection != null) {
            bitMaskTextProp = (BitMaskTextProp) textPropCollection.findByName(str);
        } else {
            bitMaskTextProp = null;
        }
        if (bitMaskTextProp == null && (sheet = this.parentRun.getSheet()) != null) {
            int runType = this.parentRun.getRunType();
            MasterSheet masterSheet = sheet.getMasterSheet();
            if (masterSheet != null) {
                bitMaskTextProp = (BitMaskTextProp) masterSheet.getStyleAttribute(runType, getIndentLevel(), str, z10);
            }
        }
        if (bitMaskTextProp == null) {
            return false;
        }
        return bitMaskTextProp.getSubValue(i10);
    }

    private int getParaTextPropVal(String str) {
        TextProp textProp;
        TextPropCollection textPropCollection = this.paragraphStyle;
        if (textPropCollection != null) {
            textProp = textPropCollection.findByName(str);
        } else {
            textProp = null;
        }
        if (textProp == null) {
            Sheet sheet = this.parentRun.getSheet();
            int runType = this.parentRun.getRunType();
            MasterSheet masterSheet = sheet.getMasterSheet();
            if (masterSheet != null) {
                textProp = masterSheet.getStyleAttribute(runType, getIndentLevel(), str, false);
            }
        }
        if (textProp == null) {
            return -1;
        }
        return textProp.getValue();
    }

    private boolean isCharFlagsTextPropVal(int i10) {
        return getFlag(true, i10);
    }

    private void setCharFlagsTextPropVal(int i10, boolean z10) {
        if (getFlag(true, i10) != z10) {
            setFlag(true, i10, z10);
        }
    }

    public TextPropCollection _getRawCharacterStyle() {
        return this.characterStyle;
    }

    public TextPropCollection _getRawParagraphStyle() {
        return this.paragraphStyle;
    }

    public boolean _isCharacterStyleShared() {
        return this.sharingCharacterStyle;
    }

    public boolean _isParagraphStyleShared() {
        return this.sharingParagraphStyle;
    }

    public void dispose() {
        TextPropCollection textPropCollection = this.paragraphStyle;
        if (textPropCollection != null) {
            textPropCollection.dispose();
        }
        TextPropCollection textPropCollection2 = this.characterStyle;
        if (textPropCollection2 != null) {
            textPropCollection2.dispose();
        }
    }

    public int getAlignment() {
        return getParaTextPropVal(CellUtil.ALIGNMENT);
    }

    public char getBulletChar() {
        return (char) getParaTextPropVal("bullet.char");
    }

    public Color getBulletColor() {
        int paraTextPropVal = getParaTextPropVal("bullet.color");
        if (paraTextPropVal == -1) {
            return getFontColor();
        }
        int i10 = paraTextPropVal >> 24;
        if (paraTextPropVal % 16777216 == 0) {
            ColorSchemeAtom colorScheme = this.parentRun.getSheet().getColorScheme();
            if (i10 >= 0 && i10 <= 7) {
                paraTextPropVal = colorScheme.getColor(i10);
            }
        }
        Color color = new Color(paraTextPropVal, true);
        return new Color(color.getBlue(), color.getGreen(), color.getRed());
    }

    public int getBulletFont() {
        return getParaTextPropVal("bullet.font");
    }

    public int getBulletOffset() {
        return (int) ((getParaTextPropVal("bullet.offset") * 72.0f) / 576.0f);
    }

    public int getBulletSize() {
        return getParaTextPropVal("bullet.size");
    }

    public int getEndIndex() {
        return this.startPos + this.length;
    }

    public Color getFontColor() {
        int charTextPropVal = getCharTextPropVal("font.color");
        int i10 = charTextPropVal >> 24;
        if (charTextPropVal % 16777216 == 0) {
            ColorSchemeAtom colorScheme = this.parentRun.getSheet().getColorScheme();
            if (i10 >= 0 && i10 <= 7) {
                charTextPropVal = colorScheme.getColor(i10);
            }
        }
        Color color = new Color(charTextPropVal, true);
        return new Color(color.getBlue(), color.getGreen(), color.getRed());
    }

    public int getFontIndex() {
        return getCharTextPropVal("font.index");
    }

    public String getFontName() {
        if (this.slideShow == null) {
            return this._fontname;
        }
        int charTextPropVal = getCharTextPropVal("font.index");
        if (charTextPropVal == -1) {
            return null;
        }
        return this.slideShow.getFontCollection().getFontWithId(charTextPropVal);
    }

    public int getFontSize() {
        return getCharTextPropVal("font.size");
    }

    public int getIndentLevel() {
        TextPropCollection textPropCollection = this.paragraphStyle;
        if (textPropCollection == null) {
            return 0;
        }
        return textPropCollection.getReservedField();
    }

    public int getLength() {
        return this.length;
    }

    public int getLineSpacing() {
        int paraTextPropVal = getParaTextPropVal("linespacing");
        if (paraTextPropVal == -1) {
            return 0;
        }
        return paraTextPropVal;
    }

    public String getRawText() {
        String rawText = this.parentRun.getRawText();
        int i10 = this.startPos;
        return rawText.substring(i10, this.length + i10);
    }

    public int getSpaceAfter() {
        int paraTextPropVal = getParaTextPropVal("spaceafter");
        if (paraTextPropVal == -1) {
            return 0;
        }
        return paraTextPropVal;
    }

    public int getSpaceBefore() {
        int paraTextPropVal = getParaTextPropVal("spacebefore");
        if (paraTextPropVal == -1) {
            return 0;
        }
        return paraTextPropVal;
    }

    public int getStartIndex() {
        return this.startPos;
    }

    public int getSuperscript() {
        int charTextPropVal = getCharTextPropVal("superscript");
        if (charTextPropVal == -1) {
            return 0;
        }
        return charTextPropVal;
    }

    public String getText() {
        String text = this.parentRun.getText();
        return text.substring(this.startPos, Math.min(text.length(), this.startPos + this.length));
    }

    public int getTextOffset() {
        return (int) ((getParaTextPropVal("text.offset") * 72.0f) / 576.0f);
    }

    public boolean isBold() {
        return isCharFlagsTextPropVal(0);
    }

    public boolean isBullet() {
        return getFlag(false, 0);
    }

    public boolean isBulletHard() {
        return getFlag(false, 0);
    }

    public boolean isEmbossed() {
        return isCharFlagsTextPropVal(9);
    }

    public boolean isItalic() {
        return isCharFlagsTextPropVal(1);
    }

    public boolean isShadowed() {
        return isCharFlagsTextPropVal(4);
    }

    public boolean isStrikethrough() {
        return isCharFlagsTextPropVal(8);
    }

    public boolean isUnderlined() {
        return isCharFlagsTextPropVal(2);
    }

    public void setAlignment(int i10) {
        setParaTextPropVal(CellUtil.ALIGNMENT, i10);
    }

    public void setBold(boolean z10) {
        setCharFlagsTextPropVal(0, z10);
    }

    public void setBullet(boolean z10) {
        setFlag(false, 0, z10);
    }

    public void setBulletChar(char c) {
        setParaTextPropVal("bullet.char", c);
    }

    public void setBulletColor(Color color) {
        setParaTextPropVal("bullet.color", new Color(color.getBlue(), color.getGreen(), color.getRed(), 254).getRGB());
    }

    public void setBulletFont(int i10) {
        setParaTextPropVal("bullet.font", i10);
        setFlag(false, 1, true);
    }

    public void setBulletOffset(int i10) {
        setParaTextPropVal("bullet.offset", (int) ((i10 * 576) / 72.0f));
    }

    public void setBulletSize(int i10) {
        setParaTextPropVal("bullet.size", i10);
    }

    public void setCharTextPropVal(String str, int i10) {
        if (this.characterStyle == null) {
            this.parentRun.ensureStyleAtomPresent();
        }
        fetchOrAddTextProp(this.characterStyle, str).setValue(i10);
    }

    public void setEmbossed(boolean z10) {
        setCharFlagsTextPropVal(9, z10);
    }

    public void setFlag(boolean z10, int i10, boolean z11) {
        TextPropCollection textPropCollection;
        String str;
        TextPropCollection textPropCollection2;
        if (z10) {
            textPropCollection = this.characterStyle;
            str = CharFlagsTextProp.NAME;
        } else {
            textPropCollection = this.paragraphStyle;
            str = ParagraphFlagsTextProp.NAME;
        }
        if (textPropCollection == null) {
            this.parentRun.ensureStyleAtomPresent();
            if (z10) {
                textPropCollection2 = this.characterStyle;
            } else {
                textPropCollection2 = this.paragraphStyle;
            }
            textPropCollection = textPropCollection2;
        }
        ((BitMaskTextProp) fetchOrAddTextProp(textPropCollection, str)).setSubValue(z11, i10);
    }

    public void setFontColor(int i10) {
        setCharTextPropVal("font.color", i10);
    }

    public void setFontIndex(int i10) {
        setCharTextPropVal("font.index", i10);
    }

    public void setFontName(String str) {
        SlideShow slideShow = this.slideShow;
        if (slideShow == null) {
            this._fontname = str;
        } else {
            setCharTextPropVal("font.index", slideShow.getFontCollection().addFont(str));
        }
    }

    public void setFontSize(int i10) {
        setCharTextPropVal("font.size", i10);
    }

    public void setIndentLevel(int i10) {
        TextPropCollection textPropCollection = this.paragraphStyle;
        if (textPropCollection != null) {
            textPropCollection.setReservedField((short) i10);
        }
    }

    public void setItalic(boolean z10) {
        setCharFlagsTextPropVal(1, z10);
    }

    public void setLineSpacing(int i10) {
        setParaTextPropVal("linespacing", i10);
    }

    public void setParaTextPropVal(String str, int i10) {
        if (this.paragraphStyle == null) {
            this.parentRun.ensureStyleAtomPresent();
        }
        fetchOrAddTextProp(this.paragraphStyle, str).setValue(i10);
    }

    public void setRawText(String str) {
        this.length = str.length();
        this.parentRun.changeTextInRichTextRun(this, str);
    }

    public void setShadowed(boolean z10) {
        setCharFlagsTextPropVal(4, z10);
    }

    public void setSpaceAfter(int i10) {
        setParaTextPropVal("spaceafter", i10);
    }

    public void setSpaceBefore(int i10) {
        setParaTextPropVal("spacebefore", i10);
    }

    public void setStrikethrough(boolean z10) {
        setCharFlagsTextPropVal(8, z10);
    }

    public void setSuperscript(int i10) {
        setCharTextPropVal("superscript", i10);
    }

    public void setText(String str) {
        setRawText(this.parentRun.normalize(str));
    }

    public void setTextOffset(int i10) {
        setParaTextPropVal("text.offset", (int) ((i10 * 576) / 72.0f));
    }

    public void setUnderlined(boolean z10) {
        setCharFlagsTextPropVal(2, z10);
    }

    public void supplySlideShow(SlideShow slideShow) {
        this.slideShow = slideShow;
        String str = this._fontname;
        if (str != null) {
            setFontName(str);
            this._fontname = null;
        }
    }

    public void supplyTextProps(TextPropCollection textPropCollection, TextPropCollection textPropCollection2, boolean z10, boolean z11) {
        if (this.paragraphStyle == null && this.characterStyle == null) {
            this.paragraphStyle = textPropCollection;
            this.characterStyle = textPropCollection2;
            this.sharingParagraphStyle = z10;
            this.sharingCharacterStyle = z11;
            return;
        }
        throw new IllegalStateException("Can't call supplyTextProps if run already has some");
    }

    public void updateStartPosition(int i10) {
        this.startPos = i10;
    }

    public RichTextRun(TextRun textRun, int i10, int i11, TextPropCollection textPropCollection, TextPropCollection textPropCollection2, boolean z10, boolean z11) {
        this.parentRun = textRun;
        this.startPos = i10;
        this.length = i11;
        this.paragraphStyle = textPropCollection;
        this.characterStyle = textPropCollection2;
        this.sharingParagraphStyle = z10;
        this.sharingCharacterStyle = z11;
    }

    public void setFontColor(Color color) {
        setFontColor(new Color(color.getBlue(), color.getGreen(), color.getRed(), 254).getRGB());
    }
}
