package com.tom_roush.pdfbox.pdmodel.encryption;

import a0.a;
import a0.d;
import java.nio.CharBuffer;
import java.text.Normalizer;

/* loaded from: classes2.dex */
class SaslPrep {
    private SaslPrep() {
    }

    private static boolean asciiControl(char c) {
        if ((c >= 0 && c <= 31) || c == 127) {
            return true;
        }
        return false;
    }

    private static boolean changeDisplayProperties(int i10) {
        if (i10 != 832 && i10 != 833 && i10 != 8206 && i10 != 8207 && i10 != 8234 && i10 != 8235 && i10 != 8236 && i10 != 8237 && i10 != 8238 && i10 != 8298 && i10 != 8299 && i10 != 8300 && i10 != 8301 && i10 != 8302 && i10 != 8303) {
            return false;
        }
        return true;
    }

    private static boolean inappropriateForCanonical(int i10) {
        if (12272 <= i10 && i10 <= 12283) {
            return true;
        }
        return false;
    }

    private static boolean inappropriateForPlainText(int i10) {
        if (i10 != 65529 && i10 != 65530 && i10 != 65531 && i10 != 65532 && i10 != 65533) {
            return false;
        }
        return true;
    }

    private static boolean mappedToNothing(char c) {
        if (c != 173 && c != 847 && c != 6150 && c != 6155 && c != 6156 && c != 6157 && c != 8203 && c != 8204 && c != 8205 && c != 8288 && ((65024 > c || c > 65039) && c != 65279)) {
            return false;
        }
        return true;
    }

    private static boolean nonAsciiControl(int i10) {
        if ((128 > i10 || i10 > 159) && i10 != 1757 && i10 != 1807 && i10 != 6158 && i10 != 8204 && i10 != 8205 && i10 != 8232 && i10 != 8233 && i10 != 8288 && i10 != 8289 && i10 != 8290 && i10 != 8291 && ((8298 > i10 || i10 > 8303) && i10 != 65279 && ((65529 > i10 || i10 > 65532) && (119155 > i10 || i10 > 119162)))) {
            return false;
        }
        return true;
    }

    private static boolean nonAsciiSpace(char c) {
        if (c != 160 && c != 5760 && ((8192 > c || c > 8203) && c != 8239 && c != 8287 && c != 12288)) {
            return false;
        }
        return true;
    }

    private static boolean nonCharacterCodePoint(int i10) {
        if ((64976 <= i10 && i10 <= 65007) || ((65534 <= i10 && i10 <= 65535) || ((131070 <= i10 && i10 <= 131071) || ((196606 <= i10 && i10 <= 196607) || ((262142 <= i10 && i10 <= 262143) || ((327678 <= i10 && i10 <= 327679) || ((393214 <= i10 && i10 <= 393215) || ((458750 <= i10 && i10 <= 458751) || ((524286 <= i10 && i10 <= 524287) || ((589822 <= i10 && i10 <= 589823) || ((655358 <= i10 && i10 <= 655359) || ((720894 <= i10 && i10 <= 720895) || ((786430 <= i10 && i10 <= 786431) || ((851966 <= i10 && i10 <= 851967) || ((917502 <= i10 && i10 <= 917503) || ((983038 <= i10 && i10 <= 983039) || ((1048574 <= i10 && i10 <= 1048575) || (1114110 <= i10 && i10 <= 1114111)))))))))))))))))) {
            return true;
        }
        return false;
    }

    private static boolean privateUse(int i10) {
        if ((57344 <= i10 && i10 <= 63743) || ((983040 <= i10 && i10 <= 1048573) || (1048576 <= i10 && i10 <= 1114109))) {
            return true;
        }
        return false;
    }

    public static boolean prohibited(int i10) {
        char c = (char) i10;
        if (!nonAsciiSpace(c) && !asciiControl(c) && !nonAsciiControl(i10) && !privateUse(i10) && !nonCharacterCodePoint(i10) && !surrogateCodePoint(i10) && !inappropriateForPlainText(i10) && !inappropriateForCanonical(i10) && !changeDisplayProperties(i10) && !tagging(i10)) {
            return false;
        }
        return true;
    }

    private static String saslPrep(String str, boolean z10) {
        boolean z11;
        boolean z12;
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (nonAsciiSpace(str.charAt(i10))) {
                charArray[i10] = ' ';
            }
        }
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char c = charArray[i12];
            if (!mappedToNothing(c)) {
                charArray[i11] = c;
                i11++;
            }
        }
        String normalize = Normalizer.normalize(CharBuffer.wrap(charArray, 0, i11), Normalizer.Form.NFKC);
        int i13 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (i13 < normalize.length()) {
            int codePointAt = normalize.codePointAt(i13);
            if (!prohibited(codePointAt)) {
                byte directionality = Character.getDirectionality(codePointAt);
                boolean z16 = true;
                if (directionality != 1 && directionality != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                z13 |= z11;
                if (directionality == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z14 |= z12;
                z15 |= (i13 == 0 && z11) ? false : false;
                if (!z10 && !Character.isDefined(codePointAt)) {
                    throw new IllegalArgumentException(a.g("Character at position ", i13, " is unassigned"));
                }
                i13 += Character.charCount(codePointAt);
                if (z15 && i13 >= normalize.length() && !z11) {
                    throw new IllegalArgumentException("First character is RandALCat, but last character is not");
                }
            } else {
                throw new IllegalArgumentException(d.b("Prohibited character ", codePointAt, " at position ", i13));
            }
        }
        if (z13 && z14) {
            throw new IllegalArgumentException("Contains both RandALCat characters and LCat characters");
        }
        return normalize;
    }

    public static String saslPrepQuery(String str) {
        return saslPrep(str, true);
    }

    public static String saslPrepStored(String str) {
        return saslPrep(str, false);
    }

    private static boolean surrogateCodePoint(int i10) {
        if (55296 <= i10 && i10 <= 57343) {
            return true;
        }
        return false;
    }

    private static boolean tagging(int i10) {
        if (i10 != 917505 && (917536 > i10 || i10 > 917631)) {
            return false;
        }
        return true;
    }
}
