package lib.zj.office.fc.hssf.usermodel;

import a0.a;
import a6.h;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;

/* loaded from: classes3.dex */
public class FontDetails {
    private String _fontName;
    private int _height;
    private final Map<Character, Integer> charWidths = new HashMap();

    public FontDetails(String str, int i10) {
        this._fontName = str;
        this._height = i10;
    }

    public static String buildFontCharactersProperty(String str) {
        return h.d("font.", str, ".characters");
    }

    public static String buildFontHeightProperty(String str) {
        return h.d("font.", str, ".height");
    }

    public static String buildFontWidthsProperty(String str) {
        return h.d("font.", str, ".widths");
    }

    public static FontDetails create(String str, Properties properties) {
        String property = properties.getProperty(buildFontHeightProperty(str));
        String property2 = properties.getProperty(buildFontWidthsProperty(str));
        String property3 = properties.getProperty(buildFontCharactersProperty(str));
        if (property != null && property2 != null && property3 != null) {
            FontDetails fontDetails = new FontDetails(str, Integer.parseInt(property));
            String[] split = split(property3, ",", -1);
            String[] split2 = split(property2, ",", -1);
            if (split.length == split2.length) {
                for (int i10 = 0; i10 < split2.length; i10++) {
                    if (split[i10].length() != 0) {
                        fontDetails.addChar(split[i10].charAt(0), Integer.parseInt(split2[i10]));
                    }
                }
                return fontDetails;
            }
            throw new RuntimeException(a.h("Number of characters does not number of widths for font ", str));
        }
        throw new IllegalArgumentException(h.d("The supplied FontMetrics doesn't know about the font '", str, "', so we can't use it. Please add it to your font metrics file (see StaticFontMetrics.getFontDetails"));
    }

    private static String[] split(String str, String str2, int i10) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
        int countTokens = stringTokenizer.countTokens();
        if (i10 != -1 && countTokens > i10) {
            countTokens = i10;
        }
        String[] strArr = new String[countTokens];
        int i11 = 0;
        while (true) {
            if (!stringTokenizer.hasMoreTokens()) {
                break;
            } else if (i10 != -1 && i11 == countTokens - 1) {
                StringBuffer stringBuffer = new StringBuffer(((countTokens - i11) * str.length()) / countTokens);
                while (stringTokenizer.hasMoreTokens()) {
                    stringBuffer.append(stringTokenizer.nextToken());
                    if (stringTokenizer.hasMoreTokens()) {
                        stringBuffer.append(str2);
                    }
                }
                strArr[i11] = stringBuffer.toString().trim();
            } else {
                strArr[i11] = stringTokenizer.nextToken().trim();
                i11++;
            }
        }
        return strArr;
    }

    public void addChar(char c, int i10) {
        this.charWidths.put(Character.valueOf(c), Integer.valueOf(i10));
    }

    public void addChars(char[] cArr, int[] iArr) {
        for (int i10 = 0; i10 < cArr.length; i10++) {
            this.charWidths.put(Character.valueOf(cArr[i10]), Integer.valueOf(iArr[i10]));
        }
    }

    public int getCharWidth(char c) {
        Integer num = this.charWidths.get(Character.valueOf(c));
        if (num == null && c != 'W') {
            return getCharWidth('W');
        }
        return num.intValue();
    }

    public String getFontName() {
        return this._fontName;
    }

    public int getHeight() {
        return this._height;
    }

    public int getStringWidth(String str) {
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            i10 += getCharWidth(str.charAt(i11));
        }
        return i10;
    }
}
