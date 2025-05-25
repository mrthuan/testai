package com.tom_roush.pdfbox.text;

import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.util.Matrix;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: classes2.dex */
public final class TextPosition {
    private static final Map<Integer, String> DIACRITICS = createDiacritics();
    private final int[] charCodes;
    private float direction = -1.0f;
    private final float endX;
    private final float endY;
    private final PDFont font;
    private final float fontSize;
    private final int fontSizePt;
    private final float maxHeight;
    private final float pageHeight;
    private final float pageWidth;
    private final int rotation;
    private final Matrix textMatrix;
    private String unicode;
    private final float widthOfSpace;
    private float[] widths;

    /* renamed from: x  reason: collision with root package name */
    private final float f15995x;

    /* renamed from: y  reason: collision with root package name */
    private final float f15996y;

    public TextPosition(int i10, float f10, float f11, Matrix matrix, float f12, float f13, float f14, float f15, float f16, String str, int[] iArr, PDFont pDFont, float f17, int i11) {
        this.textMatrix = matrix;
        this.endX = f12;
        this.endY = f13;
        this.rotation = i10;
        this.maxHeight = f14;
        this.pageHeight = f11;
        this.pageWidth = f10;
        this.widths = new float[]{f15};
        this.widthOfSpace = f16;
        this.unicode = str;
        this.charCodes = iArr;
        this.font = pDFont;
        this.fontSize = f17;
        this.fontSizePt = i11;
        this.f15995x = getXRot(i10);
        if (i10 != 0 && i10 != 180) {
            this.f15996y = f10 - getYLowerLeftRot(i10);
        } else {
            this.f15996y = f11 - getYLowerLeftRot(i10);
        }
    }

    private String combineDiacritic(String str) {
        int codePointAt = str.codePointAt(0);
        Map<Integer, String> map = DIACRITICS;
        if (map.containsKey(Integer.valueOf(codePointAt))) {
            return map.get(Integer.valueOf(codePointAt));
        }
        return Normalizer.normalize(str, Normalizer.Form.NFKC).trim();
    }

    private static Map<Integer, String> createDiacritics() {
        HashMap hashMap = new HashMap(31);
        hashMap.put(96, "̀");
        hashMap.put(715, "̀");
        hashMap.put(39, "́");
        hashMap.put(697, "́");
        hashMap.put(714, "́");
        hashMap.put(94, "̂");
        hashMap.put(710, "̂");
        hashMap.put(126, "̃");
        hashMap.put(713, "̄");
        hashMap.put(Integer.valueOf((int) ShapeTypes.MATH_PLUS), "̊");
        hashMap.put(698, "̋");
        hashMap.put(711, "̌");
        hashMap.put(712, "̍");
        hashMap.put(34, "̎");
        hashMap.put(699, "̒");
        hashMap.put(Integer.valueOf((int) OS2WindowsMetricsTable.WEIGHT_CLASS_BOLD), "̓");
        hashMap.put(1158, "̓");
        hashMap.put(1370, "̓");
        hashMap.put(701, "̔");
        hashMap.put(1157, "̔");
        hashMap.put(1369, "̔");
        hashMap.put(724, "̝");
        hashMap.put(725, "̞");
        hashMap.put(726, "̟");
        hashMap.put(727, "̠");
        hashMap.put(690, "̡");
        hashMap.put(716, "̩");
        hashMap.put(695, "̫");
        hashMap.put(717, "̱");
        hashMap.put(95, "̲");
        hashMap.put(8270, "͙");
        return hashMap;
    }

    private float getWidthRot(float f10) {
        if (f10 != 90.0f && f10 != 270.0f) {
            return Math.abs(this.endX - this.textMatrix.getTranslateX());
        }
        return Math.abs(this.endY - this.textMatrix.getTranslateY());
    }

    private float getXRot(float f10) {
        if (f10 == 0.0f) {
            return this.textMatrix.getTranslateX();
        }
        if (f10 == 90.0f) {
            return this.textMatrix.getTranslateY();
        }
        if (f10 == 180.0f) {
            return this.pageWidth - this.textMatrix.getTranslateX();
        }
        if (f10 != 270.0f) {
            return 0.0f;
        }
        return this.pageHeight - this.textMatrix.getTranslateY();
    }

    private float getYLowerLeftRot(float f10) {
        if (f10 == 0.0f) {
            return this.textMatrix.getTranslateY();
        }
        if (f10 == 90.0f) {
            return this.pageWidth - this.textMatrix.getTranslateX();
        }
        if (f10 == 180.0f) {
            return this.pageHeight - this.textMatrix.getTranslateY();
        }
        if (f10 != 270.0f) {
            return 0.0f;
        }
        return this.textMatrix.getTranslateX();
    }

    private void insertDiacritic(int i10, TextPosition textPosition) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.unicode, 0, i10);
        float[] fArr = this.widths;
        float[] fArr2 = new float[fArr.length + 1];
        System.arraycopy(fArr, 0, fArr2, 0, i10);
        sb2.append(this.unicode.charAt(i10));
        fArr2[i10] = this.widths[i10];
        sb2.append(combineDiacritic(textPosition.getUnicode()));
        int i11 = i10 + 1;
        fArr2[i11] = 0.0f;
        sb2.append(this.unicode.substring(i11));
        float[] fArr3 = this.widths;
        System.arraycopy(fArr3, i11, fArr2, i10 + 2, (fArr3.length - i10) - 1);
        this.unicode = sb2.toString();
        this.widths = fArr2;
    }

    public boolean contains(TextPosition textPosition) {
        double xDirAdj = getXDirAdj();
        double widthDirAdj = getWidthDirAdj();
        double d10 = xDirAdj + widthDirAdj;
        double xDirAdj2 = textPosition.getXDirAdj();
        double widthDirAdj2 = textPosition.getWidthDirAdj() + xDirAdj2;
        if (widthDirAdj2 > xDirAdj && xDirAdj2 < d10) {
            double yDirAdj = getYDirAdj();
            double yDirAdj2 = textPosition.getYDirAdj();
            if (textPosition.getHeightDir() + yDirAdj2 >= yDirAdj && yDirAdj2 <= yDirAdj + getHeightDir()) {
                if (xDirAdj2 > xDirAdj && widthDirAdj2 > d10) {
                    if ((d10 - xDirAdj2) / widthDirAdj > 0.15d) {
                        return true;
                    }
                    return false;
                } else if (xDirAdj2 >= xDirAdj || widthDirAdj2 >= d10 || (widthDirAdj2 - xDirAdj) / widthDirAdj > 0.15d) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextPosition)) {
            return false;
        }
        TextPosition textPosition = (TextPosition) obj;
        if (Float.compare(textPosition.endX, this.endX) != 0 || Float.compare(textPosition.endY, this.endY) != 0 || Float.compare(textPosition.maxHeight, this.maxHeight) != 0 || this.rotation != textPosition.rotation || Float.compare(textPosition.f15995x, this.f15995x) != 0 || Float.compare(textPosition.f15996y, this.f15996y) != 0 || Float.compare(textPosition.pageHeight, this.pageHeight) != 0 || Float.compare(textPosition.pageWidth, this.pageWidth) != 0 || Float.compare(textPosition.widthOfSpace, this.widthOfSpace) != 0 || Float.compare(textPosition.fontSize, this.fontSize) != 0 || this.fontSizePt != textPosition.fontSizePt) {
            return false;
        }
        Matrix matrix = this.textMatrix;
        if (matrix == null ? textPosition.textMatrix != null : !matrix.equals(textPosition.textMatrix)) {
            return false;
        }
        if (!Arrays.equals(this.charCodes, textPosition.charCodes)) {
            return false;
        }
        PDFont pDFont = this.font;
        PDFont pDFont2 = textPosition.font;
        if (pDFont != null) {
            return pDFont.equals(pDFont2);
        }
        if (pDFont2 == null) {
            return true;
        }
        return false;
    }

    public int[] getCharacterCodes() {
        return this.charCodes;
    }

    public float getDir() {
        if (this.direction < 0.0f) {
            float scaleY = this.textMatrix.getScaleY();
            float shearY = this.textMatrix.getShearY();
            float shearX = this.textMatrix.getShearX();
            float scaleX = this.textMatrix.getScaleX();
            if (scaleY > 0.0f && Math.abs(shearY) < scaleX && Math.abs(shearX) < scaleY && scaleX > 0.0f) {
                this.direction = 0.0f;
            } else if (scaleY < 0.0f && Math.abs(shearY) < Math.abs(scaleX) && Math.abs(shearX) < Math.abs(scaleY) && scaleX < 0.0f) {
                this.direction = 180.0f;
            } else if (Math.abs(scaleY) < Math.abs(shearX) && shearY > 0.0f && shearX < 0.0f && Math.abs(scaleX) < shearY) {
                this.direction = 90.0f;
            } else if (Math.abs(scaleY) < shearX && shearY < 0.0f && shearX > 0.0f && Math.abs(scaleX) < Math.abs(shearY)) {
                this.direction = 270.0f;
            } else {
                this.direction = 0.0f;
            }
        }
        return this.direction;
    }

    public float getEndX() {
        return this.endX;
    }

    public float getEndY() {
        return this.endY;
    }

    public PDFont getFont() {
        return this.font;
    }

    public float getFontSize() {
        return this.fontSize;
    }

    public float getFontSizeInPt() {
        return this.fontSizePt;
    }

    public float getHeight() {
        return this.maxHeight;
    }

    public float getHeightDir() {
        return this.maxHeight;
    }

    public float[] getIndividualWidths() {
        return this.widths;
    }

    public float getPageHeight() {
        return this.pageHeight;
    }

    public float getPageWidth() {
        return this.pageWidth;
    }

    public int getRotation() {
        return this.rotation;
    }

    public Matrix getTextMatrix() {
        return this.textMatrix;
    }

    public String getUnicode() {
        return this.unicode;
    }

    public float getWidth() {
        return getWidthRot(this.rotation);
    }

    public float getWidthDirAdj() {
        return getWidthRot(getDir());
    }

    public float getWidthOfSpace() {
        return this.widthOfSpace;
    }

    public float getX() {
        return this.f15995x;
    }

    public float getXDirAdj() {
        return getXRot(getDir());
    }

    public float getXScale() {
        return this.textMatrix.getScalingFactorX();
    }

    public float getY() {
        return this.f15996y;
    }

    public float getYDirAdj() {
        float f10;
        float yLowerLeftRot;
        float dir = getDir();
        if (dir != 0.0f && dir != 180.0f) {
            f10 = this.pageWidth;
            yLowerLeftRot = getYLowerLeftRot(dir);
        } else {
            f10 = this.pageHeight;
            yLowerLeftRot = getYLowerLeftRot(dir);
        }
        return f10 - yLowerLeftRot;
    }

    public float getYScale() {
        return this.textMatrix.getScalingFactorY();
    }

    public int hashCode() {
        int i10;
        Matrix matrix = this.textMatrix;
        int i11 = 0;
        if (matrix != null) {
            i10 = matrix.hashCode();
        } else {
            i10 = 0;
        }
        int floatToIntBits = Float.floatToIntBits(this.endX);
        int floatToIntBits2 = Float.floatToIntBits(this.endY);
        int floatToIntBits3 = Float.floatToIntBits(this.maxHeight);
        int floatToIntBits4 = Float.floatToIntBits(this.f15995x);
        int floatToIntBits5 = Float.floatToIntBits(this.f15996y);
        int floatToIntBits6 = Float.floatToIntBits(this.pageHeight);
        int floatToIntBits7 = Float.floatToIntBits(this.pageWidth);
        int hashCode = (Arrays.hashCode(this.charCodes) + ((Float.floatToIntBits(this.widthOfSpace) + ((floatToIntBits7 + ((floatToIntBits6 + ((floatToIntBits5 + ((floatToIntBits4 + ((((floatToIntBits3 + ((floatToIntBits2 + ((floatToIntBits + (i10 * 31)) * 31)) * 31)) * 31) + this.rotation) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        PDFont pDFont = this.font;
        if (pDFont != null) {
            i11 = pDFont.hashCode();
        }
        return ((Float.floatToIntBits(this.fontSize) + ((hashCode + i11) * 31)) * 31) + this.fontSizePt;
    }

    public boolean isDiacritic() {
        String unicode = getUnicode();
        if (unicode.length() != 1 || "ー".equals(unicode)) {
            return false;
        }
        int type = Character.getType(unicode.charAt(0));
        if (type != 6 && type != 27 && type != 4) {
            return false;
        }
        return true;
    }

    public void mergeDiacritic(TextPosition textPosition) {
        if (textPosition.getUnicode().length() > 1) {
            return;
        }
        float xDirAdj = textPosition.getXDirAdj();
        float f10 = textPosition.widths[0] + xDirAdj;
        float xDirAdj2 = getXDirAdj();
        int length = this.unicode.length();
        float f11 = xDirAdj2;
        boolean z10 = false;
        for (int i10 = 0; i10 < length && !z10; i10++) {
            float[] fArr = this.widths;
            if (i10 >= fArr.length) {
                textPosition.getUnicode();
                return;
            }
            float f12 = fArr[i10];
            float f13 = f11 + f12;
            int i11 = (xDirAdj > f11 ? 1 : (xDirAdj == f11 ? 0 : -1));
            if (i11 < 0 && f10 <= f13) {
                if (i10 == 0) {
                    insertDiacritic(i10, textPosition);
                } else {
                    int i12 = i10 - 1;
                    if ((f10 - f11) / f12 >= (f11 - xDirAdj) / fArr[i12]) {
                        insertDiacritic(i10, textPosition);
                    } else {
                        insertDiacritic(i12, textPosition);
                    }
                }
            } else if (i11 < 0) {
                insertDiacritic(i10, textPosition);
            } else if (f10 <= f13) {
                insertDiacritic(i10, textPosition);
            } else if (i10 == length - 1) {
                insertDiacritic(i10, textPosition);
            } else {
                f11 += this.widths[i10];
            }
            z10 = true;
            f11 += this.widths[i10];
        }
    }

    public String toString() {
        return getUnicode();
    }
}
