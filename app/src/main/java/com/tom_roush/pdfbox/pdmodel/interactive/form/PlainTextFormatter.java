package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.pdmodel.PDPageContentStream;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PlainText;
import java.util.List;

/* loaded from: classes2.dex */
class PlainTextFormatter {
    private static final int FONTSCALE = 1000;
    private final AppearanceStyle appearanceStyle;
    private final PDPageContentStream contents;
    private float horizontalOffset;
    private final TextAlign textAlignment;
    private final PlainText textContent;
    private float verticalOffset;
    private final float width;
    private final boolean wrapLines;

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.form.PlainTextFormatter$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tom_roush$pdfbox$pdmodel$interactive$form$PlainTextFormatter$TextAlign;

        static {
            int[] iArr = new int[TextAlign.values().length];
            $SwitchMap$com$tom_roush$pdfbox$pdmodel$interactive$form$PlainTextFormatter$TextAlign = iArr;
            try {
                iArr[TextAlign.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tom_roush$pdfbox$pdmodel$interactive$form$PlainTextFormatter$TextAlign[TextAlign.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tom_roush$pdfbox$pdmodel$interactive$form$PlainTextFormatter$TextAlign[TextAlign.JUSTIFY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class Builder {
        private AppearanceStyle appearanceStyle;
        private PDPageContentStream contents;
        private PlainText textContent;
        private boolean wrapLines = false;
        private float width = 0.0f;
        private TextAlign textAlignment = TextAlign.LEFT;
        private float horizontalOffset = 0.0f;
        private float verticalOffset = 0.0f;

        public Builder(PDPageContentStream pDPageContentStream) {
            this.contents = pDPageContentStream;
        }

        public PlainTextFormatter build() {
            return new PlainTextFormatter(this, 0);
        }

        public Builder initialOffset(float f10, float f11) {
            this.horizontalOffset = f10;
            this.verticalOffset = f11;
            return this;
        }

        public Builder style(AppearanceStyle appearanceStyle) {
            this.appearanceStyle = appearanceStyle;
            return this;
        }

        public Builder text(PlainText plainText) {
            this.textContent = plainText;
            return this;
        }

        public Builder textAlign(int i10) {
            this.textAlignment = TextAlign.valueOf(i10);
            return this;
        }

        public Builder width(float f10) {
            this.width = f10;
            return this;
        }

        public Builder wrapLines(boolean z10) {
            this.wrapLines = z10;
            return this;
        }

        public Builder textAlign(TextAlign textAlign) {
            this.textAlignment = textAlign;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public enum TextAlign {
        LEFT(0),
        CENTER(1),
        RIGHT(2),
        JUSTIFY(4);
        
        private final int alignment;

        TextAlign(int i10) {
            this.alignment = i10;
        }

        public int getTextAlign() {
            return this.alignment;
        }

        public static TextAlign valueOf(int i10) {
            TextAlign[] values;
            for (TextAlign textAlign : values()) {
                if (textAlign.getTextAlign() == i10) {
                    return textAlign;
                }
            }
            return LEFT;
        }
    }

    public /* synthetic */ PlainTextFormatter(Builder builder, int i10) {
        this(builder);
    }

    private void processLines(List<PlainText.Line> list, boolean z10) {
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (PlainText.Line line : list) {
            int i10 = AnonymousClass1.$SwitchMap$com$tom_roush$pdfbox$pdmodel$interactive$form$PlainTextFormatter$TextAlign[this.textAlignment.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        f11 = 0.0f;
                    } else if (list.indexOf(line) != list.size() - 1) {
                        f12 = line.getInterWordSpacing(this.width);
                    }
                } else {
                    f11 = this.width - line.getWidth();
                }
            } else {
                f11 = (this.width - line.getWidth()) / 2.0f;
            }
            float f13 = (-f10) + f11 + this.horizontalOffset;
            if (list.indexOf(line) == 0 && z10) {
                this.contents.newLineAtOffset(f13, this.verticalOffset);
            } else {
                this.verticalOffset -= this.appearanceStyle.getLeading();
                this.contents.newLineAtOffset(f13, -this.appearanceStyle.getLeading());
            }
            f10 += f13;
            List<PlainText.Word> words = line.getWords();
            for (PlainText.Word word : words) {
                this.contents.showText(word.getText());
                float floatValue = ((Float) word.getAttributes().getIterator().getAttribute(PlainText.TextAttribute.WIDTH)).floatValue();
                if (words.indexOf(word) != words.size() - 1) {
                    this.contents.newLineAtOffset(floatValue + f12, 0.0f);
                    f10 = f10 + floatValue + f12;
                }
            }
        }
        this.horizontalOffset -= f10;
    }

    public void format() {
        PlainText plainText = this.textContent;
        if (plainText != null && !plainText.getParagraphs().isEmpty()) {
            boolean z10 = true;
            for (PlainText.Paragraph paragraph : this.textContent.getParagraphs()) {
                if (this.wrapLines) {
                    processLines(paragraph.getLines(this.appearanceStyle.getFont(), this.appearanceStyle.getFontSize(), this.width), z10);
                    z10 = false;
                } else {
                    float stringWidth = (this.appearanceStyle.getFont().getStringWidth(paragraph.getText()) * this.appearanceStyle.getFontSize()) / 1000.0f;
                    float f10 = 0.0f;
                    if (stringWidth < this.width) {
                        int i10 = AnonymousClass1.$SwitchMap$com$tom_roush$pdfbox$pdmodel$interactive$form$PlainTextFormatter$TextAlign[this.textAlignment.ordinal()];
                        if (i10 != 1) {
                            if (i10 == 2) {
                                f10 = this.width - stringWidth;
                            }
                        } else {
                            f10 = (this.width - stringWidth) / 2.0f;
                        }
                    }
                    this.contents.newLineAtOffset(this.horizontalOffset + f10, this.verticalOffset);
                    this.contents.showText(paragraph.getText());
                }
            }
        }
    }

    private PlainTextFormatter(Builder builder) {
        this.appearanceStyle = builder.appearanceStyle;
        this.wrapLines = builder.wrapLines;
        this.width = builder.width;
        this.contents = builder.contents;
        this.textContent = builder.textContent;
        this.textAlignment = builder.textAlignment;
        this.horizontalOffset = builder.horizontalOffset;
        this.verticalOffset = builder.verticalOffset;
    }
}
