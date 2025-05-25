package lib.zj.office.fc.hslf.model;

import java.awt.font.TextAttribute;
import java.text.AttributedString;
import lib.zj.office.fc.hslf.usermodel.RichTextRun;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;

/* loaded from: classes3.dex */
public final class TextPainter {
    protected static final char DEFAULT_BULLET_CHAR = 9632;
    protected TextShape _shape;
    protected POILogger logger = POILogFactory.getLogger(TextPainter.class);

    /* loaded from: classes3.dex */
    public static class TextElement {
        public int _align;
        public AttributedString _bullet;
        public int _bulletOffset;
        public AttributedString _text;
        public int _textOffset;
        public float advance;
        public float ascent;
        public float descent;
        public int textEndIndex;
        public int textStartIndex;
    }

    public TextPainter(TextShape textShape) {
        this._shape = textShape;
    }

    public AttributedString getAttributedString(TextRun textRun) {
        Integer num;
        AttributedString attributedString = new AttributedString(textRun.getText().replace('\t', ' ').replace((char) 160, ' '));
        RichTextRun[] richTextRuns = textRun.getRichTextRuns();
        for (int i10 = 0; i10 < richTextRuns.length; i10++) {
            int startIndex = richTextRuns[i10].getStartIndex();
            int endIndex = richTextRuns[i10].getEndIndex();
            if (startIndex == endIndex) {
                this.logger.log(POILogger.INFO, "Skipping RichTextRun with zero length");
            } else {
                attributedString.addAttribute(TextAttribute.FAMILY, richTextRuns[i10].getFontName(), startIndex, endIndex);
                attributedString.addAttribute(TextAttribute.SIZE, new Float(richTextRuns[i10].getFontSize()), startIndex, endIndex);
                attributedString.addAttribute(TextAttribute.FOREGROUND, richTextRuns[i10].getFontColor(), startIndex, endIndex);
                if (richTextRuns[i10].isBold()) {
                    attributedString.addAttribute(TextAttribute.WEIGHT, TextAttribute.WEIGHT_BOLD, startIndex, endIndex);
                }
                if (richTextRuns[i10].isItalic()) {
                    attributedString.addAttribute(TextAttribute.POSTURE, TextAttribute.POSTURE_OBLIQUE, startIndex, endIndex);
                }
                if (richTextRuns[i10].isUnderlined()) {
                    attributedString.addAttribute(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON, startIndex, endIndex);
                    attributedString.addAttribute(TextAttribute.INPUT_METHOD_UNDERLINE, TextAttribute.UNDERLINE_LOW_TWO_PIXEL, startIndex, endIndex);
                }
                if (richTextRuns[i10].isStrikethrough()) {
                    attributedString.addAttribute(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON, startIndex, endIndex);
                }
                int superscript = richTextRuns[i10].getSuperscript();
                if (superscript != 0) {
                    TextAttribute textAttribute = TextAttribute.SUPERSCRIPT;
                    if (superscript > 0) {
                        num = TextAttribute.SUPERSCRIPT_SUPER;
                    } else {
                        num = TextAttribute.SUPERSCRIPT_SUB;
                    }
                    attributedString.addAttribute(textAttribute, num, startIndex, endIndex);
                }
            }
        }
        return attributedString;
    }
}
