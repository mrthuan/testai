package com.tom_roush.fontbox.ttf;

import b.a;
import com.tom_roush.pdfbox.android.PDFBoxResourceLoader;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: classes2.dex */
public final class OpenTypeScript {
    public static final String INHERITED = "Inherited";
    public static final String TAG_DEFAULT = "DFLT";
    private static final Map<String, String[]> UNICODE_SCRIPT_TO_OPENTYPE_TAG_MAP;
    public static final String UNKNOWN = "Unknown";
    private static String[] unicodeRangeScripts;
    private static int[] unicodeRangeStarts;

    static {
        BufferedInputStream bufferedInputStream;
        Object[][] objArr = {new Object[]{"Adlam", new String[]{"adlm"}}, new Object[]{"Ahom", new String[]{"ahom"}}, new Object[]{"Anatolian_Hieroglyphs", new String[]{"hluw"}}, new Object[]{"Arabic", new String[]{"arab"}}, new Object[]{"Armenian", new String[]{"armn"}}, new Object[]{"Avestan", new String[]{"avst"}}, new Object[]{"Balinese", new String[]{"bali"}}, new Object[]{"Bamum", new String[]{"bamu"}}, new Object[]{"Bassa_Vah", new String[]{"bass"}}, new Object[]{"Batak", new String[]{"batk"}}, new Object[]{"Bengali", new String[]{"bng2", "beng"}}, new Object[]{"Bhaiksuki", new String[]{"bhks"}}, new Object[]{"Bopomofo", new String[]{"bopo"}}, new Object[]{"Brahmi", new String[]{"brah"}}, new Object[]{"Braille", new String[]{"brai"}}, new Object[]{"Buginese", new String[]{"bugi"}}, new Object[]{"Buhid", new String[]{"buhd"}}, new Object[]{"Canadian_Aboriginal", new String[]{"cans"}}, new Object[]{"Carian", new String[]{"cari"}}, new Object[]{"Caucasian_Albanian", new String[]{"aghb"}}, new Object[]{"Chakma", new String[]{"cakm"}}, new Object[]{"Cham", new String[]{"cham"}}, new Object[]{"Cherokee", new String[]{"cher"}}, new Object[]{"Common", new String[]{TAG_DEFAULT}}, new Object[]{"Coptic", new String[]{"copt"}}, new Object[]{"Cuneiform", new String[]{"xsux"}}, new Object[]{"Cypriot", new String[]{"cprt"}}, new Object[]{"Cyrillic", new String[]{"cyrl"}}, new Object[]{"Deseret", new String[]{"dsrt"}}, new Object[]{"Devanagari", new String[]{"dev2", "deva"}}, new Object[]{"Duployan", new String[]{"dupl"}}, new Object[]{"Egyptian_Hieroglyphs", new String[]{"egyp"}}, new Object[]{"Elbasan", new String[]{"elba"}}, new Object[]{"Ethiopic", new String[]{"ethi"}}, new Object[]{"Georgian", new String[]{"geor"}}, new Object[]{"Glagolitic", new String[]{"glag"}}, new Object[]{"Gothic", new String[]{"goth"}}, new Object[]{"Grantha", new String[]{"gran"}}, new Object[]{"Greek", new String[]{"grek"}}, new Object[]{"Gujarati", new String[]{"gjr2", "gujr"}}, new Object[]{"Gurmukhi", new String[]{"gur2", "guru"}}, new Object[]{"Han", new String[]{"hani"}}, new Object[]{"Hangul", new String[]{"hang"}}, new Object[]{"Hanunoo", new String[]{"hano"}}, new Object[]{"Hatran", new String[]{"hatr"}}, new Object[]{"Hebrew", new String[]{"hebr"}}, new Object[]{"Hiragana", new String[]{"kana"}}, new Object[]{"Imperial_Aramaic", new String[]{"armi"}}, new Object[]{INHERITED, new String[]{INHERITED}}, new Object[]{"Inscriptional_Pahlavi", new String[]{"phli"}}, new Object[]{"Inscriptional_Parthian", new String[]{"prti"}}, new Object[]{"Javanese", new String[]{"java"}}, new Object[]{"Kaithi", new String[]{"kthi"}}, new Object[]{"Kannada", new String[]{"knd2", "knda"}}, new Object[]{"Katakana", new String[]{"kana"}}, new Object[]{"Kayah_Li", new String[]{"kali"}}, new Object[]{"Kharoshthi", new String[]{"khar"}}, new Object[]{"Khmer", new String[]{"khmr"}}, new Object[]{"Khojki", new String[]{"khoj"}}, new Object[]{"Khudawadi", new String[]{"sind"}}, new Object[]{"Lao", new String[]{"lao "}}, new Object[]{"Latin", new String[]{"latn"}}, new Object[]{"Lepcha", new String[]{"lepc"}}, new Object[]{"Limbu", new String[]{"limb"}}, new Object[]{"Linear_A", new String[]{"lina"}}, new Object[]{"Linear_B", new String[]{"linb"}}, new Object[]{"Lisu", new String[]{"lisu"}}, new Object[]{"Lycian", new String[]{"lyci"}}, new Object[]{"Lydian", new String[]{"lydi"}}, new Object[]{"Mahajani", new String[]{"mahj"}}, new Object[]{"Malayalam", new String[]{"mlm2", "mlym"}}, new Object[]{"Mandaic", new String[]{"mand"}}, new Object[]{"Manichaean", new String[]{"mani"}}, new Object[]{"Marchen", new String[]{"marc"}}, new Object[]{"Meetei_Mayek", new String[]{"mtei"}}, new Object[]{"Mende_Kikakui", new String[]{"mend"}}, new Object[]{"Meroitic_Cursive", new String[]{"merc"}}, new Object[]{"Meroitic_Hieroglyphs", new String[]{"mero"}}, new Object[]{"Miao", new String[]{"plrd"}}, new Object[]{"Modi", new String[]{"modi"}}, new Object[]{"Mongolian", new String[]{"mong"}}, new Object[]{"Mro", new String[]{"mroo"}}, new Object[]{"Multani", new String[]{"mult"}}, new Object[]{"Myanmar", new String[]{"mym2", "mymr"}}, new Object[]{"Nabataean", new String[]{"nbat"}}, new Object[]{"Newa", new String[]{"newa"}}, new Object[]{"New_Tai_Lue", new String[]{"talu"}}, new Object[]{"Nko", new String[]{"nko "}}, new Object[]{"Ogham", new String[]{"ogam"}}, new Object[]{"Ol_Chiki", new String[]{"olck"}}, new Object[]{"Old_Italic", new String[]{"ital"}}, new Object[]{"Old_Hungarian", new String[]{"hung"}}, new Object[]{"Old_North_Arabian", new String[]{"narb"}}, new Object[]{"Old_Permic", new String[]{"perm"}}, new Object[]{"Old_Persian", new String[]{"xpeo"}}, new Object[]{"Old_South_Arabian", new String[]{"sarb"}}, new Object[]{"Old_Turkic", new String[]{"orkh"}}, new Object[]{"Oriya", new String[]{"ory2", "orya"}}, new Object[]{"Osage", new String[]{"osge"}}, new Object[]{"Osmanya", new String[]{"osma"}}, new Object[]{"Pahawh_Hmong", new String[]{"hmng"}}, new Object[]{"Palmyrene", new String[]{"palm"}}, new Object[]{"Pau_Cin_Hau", new String[]{"pauc"}}, new Object[]{"Phags_Pa", new String[]{"phag"}}, new Object[]{"Phoenician", new String[]{"phnx"}}, new Object[]{"Psalter_Pahlavi", new String[]{"phlp"}}, new Object[]{"Rejang", new String[]{"rjng"}}, new Object[]{"Runic", new String[]{"runr"}}, new Object[]{"Samaritan", new String[]{"samr"}}, new Object[]{"Saurashtra", new String[]{"saur"}}, new Object[]{"Sharada", new String[]{"shrd"}}, new Object[]{"Shavian", new String[]{"shaw"}}, new Object[]{"Siddham", new String[]{"sidd"}}, new Object[]{"SignWriting", new String[]{"sgnw"}}, new Object[]{"Sinhala", new String[]{"sinh"}}, new Object[]{"Sora_Sompeng", new String[]{"sora"}}, new Object[]{"Sundanese", new String[]{"sund"}}, new Object[]{"Syloti_Nagri", new String[]{"sylo"}}, new Object[]{"Syriac", new String[]{"syrc"}}, new Object[]{"Tagalog", new String[]{"tglg"}}, new Object[]{"Tagbanwa", new String[]{"tagb"}}, new Object[]{"Tai_Le", new String[]{"tale"}}, new Object[]{"Tai_Tham", new String[]{"lana"}}, new Object[]{"Tai_Viet", new String[]{"tavt"}}, new Object[]{"Takri", new String[]{"takr"}}, new Object[]{"Tamil", new String[]{"tml2", "taml"}}, new Object[]{"Tangut", new String[]{"tang"}}, new Object[]{"Telugu", new String[]{"tel2", "telu"}}, new Object[]{"Thaana", new String[]{"thaa"}}, new Object[]{"Thai", new String[]{"thai"}}, new Object[]{"Tibetan", new String[]{"tibt"}}, new Object[]{"Tifinagh", new String[]{"tfng"}}, new Object[]{"Tirhuta", new String[]{"tirh"}}, new Object[]{"Ugaritic", new String[]{"ugar"}}, new Object[]{UNKNOWN, new String[]{TAG_DEFAULT}}, new Object[]{"Vai", new String[]{"vai "}}, new Object[]{"Warang_Citi", new String[]{"wara"}}, new Object[]{"Yi", new String[]{"yi  "}}};
        UNICODE_SCRIPT_TO_OPENTYPE_TAG_MAP = new HashMap((int) ShapeTypes.FLOW_CHART_MULTIDOCUMENT);
        for (int i10 = 0; i10 < 138; i10++) {
            Object[] objArr2 = objArr[i10];
            UNICODE_SCRIPT_TO_OPENTYPE_TAG_MAP.put((String) objArr2[0], (String[]) objArr2[1]);
        }
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                if (PDFBoxResourceLoader.isReady()) {
                    bufferedInputStream = new BufferedInputStream(PDFBoxResourceLoader.getStream("/com/tom_roush/fontbox/resources/unicode/Scripts.txt"));
                } else {
                    bufferedInputStream = new BufferedInputStream(OpenTypeScript.class.getResourceAsStream("/com/tom_roush/fontbox/resources/unicode/Scripts.txt"));
                }
                bufferedInputStream2 = bufferedInputStream;
                parseScriptsFile(bufferedInputStream2);
            } catch (IOException e10) {
                e10.getMessage();
                if (bufferedInputStream2 == null) {
                    return;
                }
            }
            try {
                bufferedInputStream2.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th2) {
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (IOException unused2) {
                }
            }
            throw th2;
        }
    }

    private OpenTypeScript() {
    }

    private static void ensureValidCodePoint(int i10) {
        if (i10 >= 0 && i10 <= 1114111) {
            return;
        }
        throw new IllegalArgumentException(a.c("Invalid codepoint: ", i10));
    }

    public static String[] getScriptTags(int i10) {
        ensureValidCodePoint(i10);
        return UNICODE_SCRIPT_TO_OPENTYPE_TAG_MAP.get(getUnicodeScript(i10));
    }

    private static String getUnicodeScript(int i10) {
        ensureValidCodePoint(i10);
        if (Character.getType(i10) == 0) {
            return UNKNOWN;
        }
        int binarySearch = Arrays.binarySearch(unicodeRangeStarts, i10);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return unicodeRangeScripts[binarySearch];
    }

    private static void parseScriptsFile(InputStream inputStream) {
        TreeMap treeMap = new TreeMap(new Comparator<int[]>() { // from class: com.tom_roush.fontbox.ttf.OpenTypeScript.1
            @Override // java.util.Comparator
            public int compare(int[] iArr, int[] iArr2) {
                int i10 = iArr[0];
                int i11 = iArr2[0];
                if (i10 < i11) {
                    return -1;
                }
                return i10 == i11 ? 0 : 1;
            }
        });
        LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(inputStream));
        int[] iArr = {SlideAtom.USES_MASTER_SLIDE_ID, SlideAtom.USES_MASTER_SLIDE_ID};
        String str = null;
        while (true) {
            String readLine = lineNumberReader.readLine();
            if (readLine == null) {
                break;
            }
            int indexOf = readLine.indexOf(35);
            if (indexOf != -1) {
                readLine = readLine.substring(0, indexOf);
            }
            if (readLine.length() >= 2) {
                StringTokenizer stringTokenizer = new StringTokenizer(readLine, ";");
                if (stringTokenizer.countTokens() >= 2) {
                    String trim = stringTokenizer.nextToken().trim();
                    String trim2 = stringTokenizer.nextToken().trim();
                    int[] iArr2 = new int[2];
                    int indexOf2 = trim.indexOf("..");
                    if (indexOf2 == -1) {
                        int parseInt = Integer.parseInt(trim, 16);
                        iArr2[1] = parseInt;
                        iArr2[0] = parseInt;
                    } else {
                        iArr2[0] = Integer.parseInt(trim.substring(0, indexOf2), 16);
                        iArr2[1] = Integer.parseInt(trim.substring(indexOf2 + 2), 16);
                    }
                    if (iArr2[0] == iArr[1] + 1 && trim2.equals(str)) {
                        iArr[1] = iArr2[1];
                    } else {
                        treeMap.put(iArr2, trim2);
                        str = trim2;
                        iArr = iArr2;
                    }
                }
            }
        }
        lineNumberReader.close();
        unicodeRangeStarts = new int[treeMap.size()];
        unicodeRangeScripts = new String[treeMap.size()];
        int i10 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            unicodeRangeStarts[i10] = ((int[]) entry.getKey())[0];
            unicodeRangeScripts[i10] = (String) entry.getValue();
            i10++;
        }
    }
}
