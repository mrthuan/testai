package com.tom_roush.pdfbox.pdmodel.interactive.annotation.layout;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class PlainText {
    private static final float FONTSCALE = 1000.0f;
    private final List<Paragraph> paragraphs;

    /* loaded from: classes2.dex */
    public static class Line {
        private float lineWidth;
        private final List<Word> words = new ArrayList();

        public void addWord(Word word) {
            this.words.add(word);
        }

        public float calculateWidth(PDFont pDFont, float f10) {
            float f11 = f10 / PlainText.FONTSCALE;
            float f12 = 0.0f;
            int i10 = 0;
            for (Word word : this.words) {
                float floatValue = ((Float) word.getAttributes().getIterator().getAttribute(TextAttribute.WIDTH)).floatValue() + f12;
                String text = word.getText();
                if (i10 == this.words.size() - 1 && Character.isWhitespace(text.charAt(text.length() - 1))) {
                    floatValue -= pDFont.getStringWidth(text.substring(text.length() - 1)) * f11;
                }
                f12 = floatValue;
                i10++;
            }
            return f12;
        }

        public float getInterWordSpacing(float f10) {
            return (f10 - this.lineWidth) / (this.words.size() - 1);
        }

        public float getWidth() {
            return this.lineWidth;
        }

        public List<Word> getWords() {
            return this.words;
        }

        public void setWidth(float f10) {
            this.lineWidth = f10;
        }
    }

    /* loaded from: classes2.dex */
    public static class Paragraph {
        private final String textContent;

        public Paragraph(String str) {
            this.textContent = str;
        }

        public List<Line> getLines(PDFont pDFont, float f10, float f11) {
            BreakIterator lineInstance = BreakIterator.getLineInstance();
            lineInstance.setText(this.textContent);
            float f12 = f10 / PlainText.FONTSCALE;
            int first = lineInstance.first();
            int next = lineInstance.next();
            ArrayList arrayList = new ArrayList();
            Line line = new Line();
            float f13 = 0.0f;
            while (true) {
                int i10 = next;
                int i11 = first;
                first = i10;
                if (first != -1) {
                    String substring = this.textContent.substring(i11, first);
                    float stringWidth = pDFont.getStringWidth(substring) * f12;
                    f13 += stringWidth;
                    if (f13 >= f11 && Character.isWhitespace(substring.charAt(substring.length() - 1))) {
                        f13 -= pDFont.getStringWidth(substring.substring(substring.length() - 1)) * f12;
                    }
                    if (f13 >= f11) {
                        line.setWidth(line.calculateWidth(pDFont, f10));
                        arrayList.add(line);
                        line = new Line();
                        f13 = pDFont.getStringWidth(substring) * f12;
                    }
                    AttributedString attributedString = new AttributedString(substring);
                    attributedString.addAttribute(TextAttribute.WIDTH, Float.valueOf(stringWidth));
                    Word word = new Word(substring);
                    word.setAttributes(attributedString);
                    line.addWord(word);
                    next = lineInstance.next();
                } else {
                    line.setWidth(line.calculateWidth(pDFont, f10));
                    arrayList.add(line);
                    return arrayList;
                }
            }
        }

        public String getText() {
            return this.textContent;
        }
    }

    /* loaded from: classes2.dex */
    public static class TextAttribute extends AttributedCharacterIterator.Attribute {
        public static final AttributedCharacterIterator.Attribute WIDTH = new TextAttribute(InMobiNetworkValues.WIDTH);
        private static final long serialVersionUID = -3138885145941283005L;

        public TextAttribute(String str) {
            super(str);
        }
    }

    /* loaded from: classes2.dex */
    public static class Word {
        private AttributedString attributedString;
        private final String textContent;

        public Word(String str) {
            this.textContent = str;
        }

        public AttributedString getAttributes() {
            return this.attributedString;
        }

        public String getText() {
            return this.textContent;
        }

        public void setAttributes(AttributedString attributedString) {
            this.attributedString = attributedString;
        }
    }

    public PlainText(String str) {
        String[] split = str.replace('\t', ' ').split("\\r\\n|\\n|\\r|\\u2028|\\u2029");
        this.paragraphs = new ArrayList(split.length);
        for (String str2 : split) {
            if (str2.length() == 0) {
                str2 = " ";
            }
            this.paragraphs.add(new Paragraph(str2));
        }
    }

    public List<Paragraph> getParagraphs() {
        return this.paragraphs;
    }

    public PlainText(List<String> list) {
        this.paragraphs = new ArrayList(list.size());
        for (String str : list) {
            this.paragraphs.add(new Paragraph(str));
        }
    }
}
