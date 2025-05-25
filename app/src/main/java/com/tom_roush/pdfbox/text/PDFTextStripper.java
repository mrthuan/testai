package com.tom_roush.pdfbox.text;

import com.google.android.gms.common.api.Api;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDPageTree;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem;
import com.tom_roush.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.StringWriter;
import java.io.Writer;
import java.text.Bidi;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class PDFTextStripper extends LegacyPDFStreamEngine {
    private static final float END_OF_LAST_TEXT_X_RESET_VALUE = -1.0f;
    private static final float EXPECTED_START_OF_NEXT_WORD_X_RESET_VALUE = -3.4028235E38f;
    private static final float LAST_WORD_SPACING_RESET_VALUE = -1.0f;
    private static final String[] LIST_ITEM_EXPRESSIONS;
    private static final float MAX_HEIGHT_FOR_LINE_RESET_VALUE = -1.0f;
    private static final float MAX_Y_FOR_LINE_RESET_VALUE = -3.4028235E38f;
    private static final float MIN_Y_TOP_FOR_LINE_RESET_VALUE = Float.MAX_VALUE;
    private static Map<Character, Character> MIRRORING_CHAR_MAP = null;
    private static float defaultDropThreshold = 2.5f;
    private static float defaultIndentThreshold = 2.0f;
    private static final boolean useCustomQuickSort;
    protected final String LINE_SEPARATOR;
    private boolean addMoreFormatting;
    private String articleEnd;
    private String articleStart;
    private float averageCharTolerance;
    private List<PDRectangle> beadRectangles;
    private Map<String, TreeMap<Float, TreeSet<Float>>> characterListMapping;
    protected ArrayList<List<TextPosition>> charactersByArticle;
    private int currentPageNo;
    protected PDDocument document;
    private float dropThreshold;
    private PDOutlineItem endBookmark;
    private int endBookmarkPageNumber;
    private int endPage;
    private boolean inParagraph;
    private float indentThreshold;
    private String lineSeparator;
    private List<Pattern> listOfPatterns;
    protected Writer output;
    private String pageEnd;
    private String pageStart;
    private String paragraphEnd;
    private String paragraphStart;
    private boolean shouldSeparateByBeads;
    private boolean sortByPosition;
    private float spacingTolerance;
    private PDOutlineItem startBookmark;
    private int startBookmarkPageNumber;
    private int startPage;
    private boolean suppressDuplicateOverlappingText;
    private String wordSeparator;

    /* loaded from: classes2.dex */
    public static final class PositionWrapper {
        private TextPosition position;
        private boolean isLineStart = false;
        private boolean isParagraphStart = false;
        private boolean isPageBreak = false;
        private boolean isHangingIndent = false;
        private boolean isArticleStart = false;

        public PositionWrapper(TextPosition textPosition) {
            this.position = textPosition;
        }

        public TextPosition getTextPosition() {
            return this.position;
        }

        public boolean isArticleStart() {
            return this.isArticleStart;
        }

        public boolean isHangingIndent() {
            return this.isHangingIndent;
        }

        public boolean isLineStart() {
            return this.isLineStart;
        }

        public boolean isPageBreak() {
            return this.isPageBreak;
        }

        public boolean isParagraphStart() {
            return this.isParagraphStart;
        }

        public void setArticleStart() {
            this.isArticleStart = true;
        }

        public void setHangingIndent() {
            this.isHangingIndent = true;
        }

        public void setLineStart() {
            this.isLineStart = true;
        }

        public void setPageBreak() {
            this.isPageBreak = true;
        }

        public void setParagraphStart() {
            this.isParagraphStart = true;
        }
    }

    /* loaded from: classes2.dex */
    public static final class WordWithTextPositions {
        String text;
        List<TextPosition> textPositions;

        public WordWithTextPositions(String str, List<TextPosition> list) {
            this.text = str;
            this.textPositions = list;
        }

        public String getText() {
            return this.text;
        }

        public List<TextPosition> getTextPositions() {
            return this.textPositions;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[Catch: NumberFormatException | SecurityException -> 0x007d, TRY_LEAVE, TryCatch #8 {NumberFormatException | SecurityException -> 0x007d, blocks: (B:17:0x0052, B:19:0x006d), top: B:61:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9 A[Catch: all -> 0x00c9, IOException -> 0x00cb, TryCatch #7 {IOException -> 0x00cb, blocks: (B:27:0x00a3, B:29:0x00a9, B:31:0x00c2, B:30:0x00b4), top: B:55:0x00a3, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4 A[Catch: all -> 0x00c9, IOException -> 0x00cb, TryCatch #7 {IOException -> 0x00cb, blocks: (B:27:0x00a3, B:29:0x00a9, B:31:0x00c2, B:30:0x00b4), top: B:55:0x00a3, outer: #4 }] */
    static {
        /*
            r0 = 0
            java.lang.String r1 = "PDFTextStripper"
            java.lang.String r1 = r1.toLowerCase()     // Catch: java.lang.SecurityException -> L32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.SecurityException -> L32
            r2.<init>()     // Catch: java.lang.SecurityException -> L32
            r2.append(r1)     // Catch: java.lang.SecurityException -> L32
            java.lang.String r3 = ".indent"
            r2.append(r3)     // Catch: java.lang.SecurityException -> L32
            java.lang.String r2 = r2.toString()     // Catch: java.lang.SecurityException -> L32
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: java.lang.SecurityException -> L32
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.SecurityException -> L33
            r3.<init>()     // Catch: java.lang.SecurityException -> L33
            r3.append(r1)     // Catch: java.lang.SecurityException -> L33
            java.lang.String r1 = ".drop"
            r3.append(r1)     // Catch: java.lang.SecurityException -> L33
            java.lang.String r1 = r3.toString()     // Catch: java.lang.SecurityException -> L33
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.SecurityException -> L33
            goto L34
        L32:
            r2 = r0
        L33:
            r1 = r0
        L34:
            if (r2 == 0) goto L42
            int r3 = r2.length()
            if (r3 <= 0) goto L42
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.NumberFormatException -> L42
            com.tom_roush.pdfbox.text.PDFTextStripper.defaultIndentThreshold = r2     // Catch: java.lang.NumberFormatException -> L42
        L42:
            if (r1 == 0) goto L50
            int r2 = r1.length()
            if (r2 <= 0) goto L50
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L50
            com.tom_roush.pdfbox.text.PDFTextStripper.defaultDropThreshold = r1     // Catch: java.lang.NumberFormatException -> L50
        L50:
            r1 = 1
            r2 = 0
            java.lang.String r3 = "java.specification.version"
            java.lang.String r3 = java.lang.System.getProperty(r3)     // Catch: java.lang.Throwable -> L7d
            java.util.StringTokenizer r4 = new java.util.StringTokenizer     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = "."
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = r4.nextToken()     // Catch: java.lang.Throwable -> L7d
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L7d
            boolean r5 = r4.hasMoreTokens()     // Catch: java.lang.Throwable -> L7d
            if (r5 == 0) goto L76
            java.lang.String r4 = r4.nextToken()     // Catch: java.lang.Throwable -> L7d
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L7d
            goto L77
        L76:
            r4 = r2
        L77:
            if (r3 != r1) goto L7d
            r3 = 6
            if (r4 > r3) goto L7d
            r2 = r1
        L7d:
            r1 = r1 ^ r2
            com.tom_roush.pdfbox.text.PDFTextStripper.useCustomQuickSort = r1
            java.lang.String r2 = "\\."
            java.lang.String r3 = "\\d+\\."
            java.lang.String r4 = "\\[\\d+\\]"
            java.lang.String r5 = "\\d+\\)"
            java.lang.String r6 = "[A-Z]\\."
            java.lang.String r7 = "[a-z]\\."
            java.lang.String r8 = "[A-Z]\\)"
            java.lang.String r9 = "[a-z]\\)"
            java.lang.String r10 = "[IVXL]+\\."
            java.lang.String r11 = "[ivxl]+\\."
            java.lang.String[] r1 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            com.tom_roush.pdfbox.text.PDFTextStripper.LIST_ITEM_EXPRESSIONS = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.tom_roush.pdfbox.text.PDFTextStripper.MIRRORING_CHAR_MAP = r1
            java.lang.String r1 = "com/tom_roush/pdfbox/resources/text/BidiMirroring.txt"
            boolean r2 = com.tom_roush.pdfbox.android.PDFBoxResourceLoader.isReady()     // Catch: java.lang.Throwable -> Lc9 java.io.IOException -> Lcb
            if (r2 == 0) goto Lb4
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> Lc9 java.io.IOException -> Lcb
            java.io.InputStream r1 = com.tom_roush.pdfbox.android.PDFBoxResourceLoader.getStream(r1)     // Catch: java.lang.Throwable -> Lc9 java.io.IOException -> Lcb
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Lc9 java.io.IOException -> Lcb
            r0 = r2
            goto Lc2
        Lb4:
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> Lc9 java.io.IOException -> Lcb
            java.lang.Class<com.tom_roush.pdfbox.text.PDFTextStripper> r2 = com.tom_roush.pdfbox.text.PDFTextStripper.class
            java.lang.String r3 = "/com/tom_roush/pdfbox/resources/text/BidiMirroring.txt"
            java.io.InputStream r2 = r2.getResourceAsStream(r3)     // Catch: java.lang.Throwable -> Lc9 java.io.IOException -> Lcb
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc9 java.io.IOException -> Lcb
            r0 = r1
        Lc2:
            parseBidiFile(r0)     // Catch: java.lang.Throwable -> Lc9 java.io.IOException -> Lcb
        Lc5:
            r0.close()     // Catch: java.io.IOException -> Ld0
            goto Ld0
        Lc9:
            r1 = move-exception
            goto Ld1
        Lcb:
            r1 = move-exception
            r1.getMessage()     // Catch: java.lang.Throwable -> Lc9
            goto Lc5
        Ld0:
            return
        Ld1:
            r0.close()     // Catch: java.io.IOException -> Ld4
        Ld4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.text.PDFTextStripper.<clinit>():void");
    }

    public PDFTextStripper() {
        String property = System.getProperty("line.separator");
        this.LINE_SEPARATOR = property;
        this.lineSeparator = property;
        this.wordSeparator = " ";
        this.paragraphStart = "";
        this.paragraphEnd = "";
        this.pageStart = "";
        this.pageEnd = property;
        this.articleStart = "";
        this.articleEnd = "";
        this.currentPageNo = 0;
        this.startPage = 1;
        this.endPage = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.startBookmark = null;
        this.startBookmarkPageNumber = -1;
        this.endBookmarkPageNumber = -1;
        this.endBookmark = null;
        this.suppressDuplicateOverlappingText = true;
        this.shouldSeparateByBeads = true;
        this.sortByPosition = false;
        this.addMoreFormatting = false;
        this.indentThreshold = defaultIndentThreshold;
        this.dropThreshold = defaultDropThreshold;
        this.spacingTolerance = 0.5f;
        this.averageCharTolerance = 0.3f;
        this.beadRectangles = null;
        this.charactersByArticle = new ArrayList<>();
        this.characterListMapping = new HashMap();
        this.listOfPatterns = null;
    }

    private WordWithTextPositions createWord(String str, List<TextPosition> list) {
        return new WordWithTextPositions(normalizeWord(str), list);
    }

    private void fillBeadRectangles(PDPage pDPage) {
        this.beadRectangles = new ArrayList();
        for (PDThreadBead pDThreadBead : pDPage.getThreadBeads()) {
            if (pDThreadBead != null && pDThreadBead.getRectangle() != null) {
                PDRectangle rectangle = pDThreadBead.getRectangle();
                PDRectangle mediaBox = pDPage.getMediaBox();
                float upperRightY = mediaBox.getUpperRightY() - rectangle.getLowerLeftY();
                rectangle.setLowerLeftY(mediaBox.getUpperRightY() - rectangle.getUpperRightY());
                rectangle.setUpperRightY(upperRightY);
                PDRectangle cropBox = pDPage.getCropBox();
                if (cropBox.getLowerLeftX() != 0.0f || cropBox.getLowerLeftY() != 0.0f) {
                    rectangle.setLowerLeftX(rectangle.getLowerLeftX() - cropBox.getLowerLeftX());
                    rectangle.setLowerLeftY(rectangle.getLowerLeftY() - cropBox.getLowerLeftY());
                    rectangle.setUpperRightX(rectangle.getUpperRightX() - cropBox.getLowerLeftX());
                    rectangle.setUpperRightY(rectangle.getUpperRightY() - cropBox.getLowerLeftY());
                }
                this.beadRectangles.add(rectangle);
            } else {
                this.beadRectangles.add(null);
            }
        }
    }

    private String handleDirection(String str) {
        Bidi bidi = new Bidi(str, -2);
        if (!bidi.isMixed() && bidi.getBaseLevel() == 0) {
            return str;
        }
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i10 = 0; i10 < runCount; i10++) {
            bArr[i10] = (byte) bidi.getRunLevel(i10);
            numArr[i10] = Integer.valueOf(i10);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < runCount; i11++) {
            int intValue = numArr[i11].intValue();
            int runStart = bidi.getRunStart(intValue);
            int runLimit = bidi.getRunLimit(intValue);
            if ((bArr[intValue] & 1) != 0) {
                while (true) {
                    runLimit--;
                    if (runLimit >= runStart) {
                        char charAt = str.charAt(runLimit);
                        if (Character.isMirrored(str.codePointAt(runLimit))) {
                            if (MIRRORING_CHAR_MAP.containsKey(Character.valueOf(charAt))) {
                                sb2.append(MIRRORING_CHAR_MAP.get(Character.valueOf(charAt)));
                            } else {
                                sb2.append(charAt);
                            }
                        } else {
                            sb2.append(charAt);
                        }
                    }
                }
            } else {
                sb2.append((CharSequence) str, runStart, runLimit);
            }
        }
        return sb2.toString();
    }

    private PositionWrapper handleLineSeparation(PositionWrapper positionWrapper, PositionWrapper positionWrapper2, PositionWrapper positionWrapper3, float f10) {
        positionWrapper.setLineStart();
        isParagraphSeparation(positionWrapper, positionWrapper2, positionWrapper3, f10);
        if (positionWrapper.isParagraphStart()) {
            if (positionWrapper2.isArticleStart()) {
                if (positionWrapper2.isLineStart()) {
                    writeLineSeparator();
                }
                writeParagraphStart();
            } else {
                writeLineSeparator();
                writeParagraphSeparator();
            }
        } else {
            writeLineSeparator();
        }
        return positionWrapper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
        if (r8.isParagraphStart() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
        if (r7 == matchListItemPattern(r6)) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void isParagraphSeparation(com.tom_roush.pdfbox.text.PDFTextStripper.PositionWrapper r6, com.tom_roush.pdfbox.text.PDFTextStripper.PositionWrapper r7, com.tom_roush.pdfbox.text.PDFTextStripper.PositionWrapper r8, float r9) {
        /*
            r5 = this;
            r0 = 1
            if (r8 != 0) goto L5
            goto L9f
        L5:
            com.tom_roush.pdfbox.text.TextPosition r1 = r6.getTextPosition()
            float r1 = r1.getYDirAdj()
            com.tom_roush.pdfbox.text.TextPosition r7 = r7.getTextPosition()
            float r7 = r7.getYDirAdj()
            float r1 = r1 - r7
            float r7 = java.lang.Math.abs(r1)
            float r1 = r5.getDropThreshold()
            float r9 = r5.multiplyFloat(r1, r9)
            com.tom_roush.pdfbox.text.TextPosition r1 = r6.getTextPosition()
            float r1 = r1.getXDirAdj()
            com.tom_roush.pdfbox.text.TextPosition r2 = r8.getTextPosition()
            float r2 = r2.getXDirAdj()
            float r1 = r1 - r2
            float r2 = r5.getIndentThreshold()
            com.tom_roush.pdfbox.text.TextPosition r3 = r6.getTextPosition()
            float r3 = r3.getWidthOfSpace()
            float r2 = r5.multiplyFloat(r2, r3)
            com.tom_roush.pdfbox.text.TextPosition r3 = r6.getTextPosition()
            float r3 = r3.getWidth()
            r4 = 1048576000(0x3e800000, float:0.25)
            float r3 = r5.multiplyFloat(r4, r3)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L56
            goto L9f
        L56:
            int r7 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r7 <= 0) goto L65
            boolean r7 = r8.isParagraphStart()
            if (r7 != 0) goto L61
            goto L9f
        L61:
            r6.setHangingIndent()
            goto L9e
        L65:
            com.tom_roush.pdfbox.text.TextPosition r7 = r6.getTextPosition()
            float r7 = r7.getWidthOfSpace()
            float r7 = -r7
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 >= 0) goto L79
            boolean r7 = r8.isParagraphStart()
            if (r7 != 0) goto L9e
            goto L9f
        L79:
            float r7 = java.lang.Math.abs(r1)
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 >= 0) goto L9e
            boolean r7 = r8.isHangingIndent()
            if (r7 == 0) goto L8b
            r6.setHangingIndent()
            goto L9e
        L8b:
            boolean r7 = r8.isParagraphStart()
            if (r7 == 0) goto L9e
            java.util.regex.Pattern r7 = r5.matchListItemPattern(r8)
            if (r7 == 0) goto L9e
            java.util.regex.Pattern r8 = r5.matchListItemPattern(r6)
            if (r7 != r8) goto L9e
            goto L9f
        L9e:
            r0 = 0
        L9f:
            if (r0 == 0) goto La4
            r6.setParagraphStart()
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.text.PDFTextStripper.isParagraphSeparation(com.tom_roush.pdfbox.text.PDFTextStripper$PositionWrapper, com.tom_roush.pdfbox.text.PDFTextStripper$PositionWrapper, com.tom_roush.pdfbox.text.PDFTextStripper$PositionWrapper, float):void");
    }

    private Pattern matchListItemPattern(PositionWrapper positionWrapper) {
        return matchPattern(positionWrapper.getTextPosition().getUnicode(), getListItemPatterns());
    }

    public static Pattern matchPattern(String str, List<Pattern> list) {
        for (Pattern pattern : list) {
            if (pattern.matcher(str).matches()) {
                return pattern;
            }
        }
        return null;
    }

    private float multiplyFloat(float f10, float f11) {
        return Math.round((f10 * f11) * 1000.0f) / 1000.0f;
    }

    private List<WordWithTextPositions> normalize(List<LineItem> list) {
        LinkedList linkedList = new LinkedList();
        StringBuilder sb2 = new StringBuilder();
        List<TextPosition> arrayList = new ArrayList<>();
        for (LineItem lineItem : list) {
            sb2 = normalizeAdd(linkedList, sb2, arrayList, lineItem);
        }
        if (sb2.length() > 0) {
            linkedList.add(createWord(sb2.toString(), arrayList));
        }
        return linkedList;
    }

    private StringBuilder normalizeAdd(List<WordWithTextPositions> list, StringBuilder sb2, List<TextPosition> list2, LineItem lineItem) {
        if (lineItem.isWordSeparator()) {
            list.add(createWord(sb2.toString(), new ArrayList(list2)));
            StringBuilder sb3 = new StringBuilder();
            list2.clear();
            return sb3;
        }
        TextPosition textPosition = lineItem.getTextPosition();
        sb2.append(textPosition.getUnicode());
        list2.add(textPosition);
        return sb2;
    }

    private String normalizeWord(String str) {
        int length = str.length();
        StringBuilder sb2 = null;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if ((64256 <= charAt && charAt <= 65023) || (65136 <= charAt && charAt <= 65279)) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length * 2);
                }
                sb2.append((CharSequence) str, i11, i10);
                if (charAt == 65010 && i10 > 0) {
                    int i12 = i10 - 1;
                    if (str.charAt(i12) == 1575 || str.charAt(i12) == 65165) {
                        sb2.append("لله");
                        i11 = i10 + 1;
                    }
                }
                sb2.append(Normalizer.normalize(str.substring(i10, i10 + 1), Normalizer.Form.NFKC).trim());
                i11 = i10 + 1;
            }
            i10++;
        }
        if (sb2 == null) {
            return handleDirection(str);
        }
        sb2.append((CharSequence) str, i11, i10);
        return handleDirection(sb2.toString());
    }

    private boolean overlap(float f10, float f11, float f12, float f13) {
        if (!within(f10, f12, 0.1f) && ((f12 > f10 || f12 < f10 - f11) && (f10 > f12 || f10 < f12 - f13))) {
            return false;
        }
        return true;
    }

    private static void parseBidiFile(InputStream inputStream) {
        LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(inputStream));
        while (true) {
            String readLine = lineNumberReader.readLine();
            if (readLine == null) {
                return;
            }
            int indexOf = readLine.indexOf(35);
            if (indexOf != -1) {
                readLine = readLine.substring(0, indexOf);
            }
            if (readLine.length() >= 2) {
                StringTokenizer stringTokenizer = new StringTokenizer(readLine, ";");
                int countTokens = stringTokenizer.countTokens();
                Character[] chArr = new Character[countTokens];
                for (int i10 = 0; i10 < countTokens; i10++) {
                    chArr[i10] = Character.valueOf((char) Integer.parseInt(stringTokenizer.nextToken().trim(), 16));
                }
                if (countTokens == 2) {
                    MIRRORING_CHAR_MAP.put(chArr[0], chArr[1]);
                }
            }
        }
    }

    private void resetEngine() {
        this.currentPageNo = 0;
        this.document = null;
        ArrayList<List<TextPosition>> arrayList = this.charactersByArticle;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.characterListMapping.clear();
    }

    private boolean within(float f10, float f11, float f12) {
        if (f11 < f10 + f12 && f11 > f10 - f12) {
            return true;
        }
        return false;
    }

    private void writeLine(List<WordWithTextPositions> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            WordWithTextPositions wordWithTextPositions = list.get(i10);
            writeString(wordWithTextPositions.getText(), wordWithTextPositions.getTextPositions());
            if (i10 < size - 1) {
                writeWordSeparator();
            }
        }
    }

    public void endArticle() {
        this.output.write(getArticleEnd());
    }

    public boolean getAddMoreFormatting() {
        return this.addMoreFormatting;
    }

    public String getArticleEnd() {
        return this.articleEnd;
    }

    public String getArticleStart() {
        return this.articleStart;
    }

    public float getAverageCharTolerance() {
        return this.averageCharTolerance;
    }

    public List<List<TextPosition>> getCharactersByArticle() {
        return this.charactersByArticle;
    }

    public int getCurrentPageNo() {
        return this.currentPageNo;
    }

    public float getDropThreshold() {
        return this.dropThreshold;
    }

    public PDOutlineItem getEndBookmark() {
        return this.endBookmark;
    }

    public int getEndPage() {
        return this.endPage;
    }

    public float getIndentThreshold() {
        return this.indentThreshold;
    }

    public String getLineSeparator() {
        return this.lineSeparator;
    }

    public List<Pattern> getListItemPatterns() {
        if (this.listOfPatterns == null) {
            this.listOfPatterns = new ArrayList();
            for (String str : LIST_ITEM_EXPRESSIONS) {
                this.listOfPatterns.add(Pattern.compile(str));
            }
        }
        return this.listOfPatterns;
    }

    public Writer getOutput() {
        return this.output;
    }

    public String getPageEnd() {
        return this.pageEnd;
    }

    public String getPageStart() {
        return this.pageStart;
    }

    public String getParagraphEnd() {
        return this.paragraphEnd;
    }

    public String getParagraphStart() {
        return this.paragraphStart;
    }

    public boolean getSeparateByBeads() {
        return this.shouldSeparateByBeads;
    }

    public boolean getSortByPosition() {
        return this.sortByPosition;
    }

    public float getSpacingTolerance() {
        return this.spacingTolerance;
    }

    public PDOutlineItem getStartBookmark() {
        return this.startBookmark;
    }

    public int getStartPage() {
        return this.startPage;
    }

    public boolean getSuppressDuplicateOverlappingText() {
        return this.suppressDuplicateOverlappingText;
    }

    public String getText(PDDocument pDDocument) {
        StringWriter stringWriter = new StringWriter();
        writeText(pDDocument, stringWriter);
        return stringWriter.toString();
    }

    public String getWordSeparator() {
        return this.wordSeparator;
    }

    @Override // com.tom_roush.pdfbox.text.LegacyPDFStreamEngine, com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void processPage(PDPage pDPage) {
        int i10 = this.currentPageNo;
        if (i10 >= this.startPage && i10 <= this.endPage) {
            int i11 = this.startBookmarkPageNumber;
            if (i11 == -1 || i10 >= i11) {
                int i12 = this.endBookmarkPageNumber;
                if (i12 == -1 || i10 <= i12) {
                    startPage(pDPage);
                    int i13 = 1;
                    if (this.shouldSeparateByBeads) {
                        fillBeadRectangles(pDPage);
                        i13 = 1 + (this.beadRectangles.size() * 2);
                    }
                    int size = this.charactersByArticle.size();
                    this.charactersByArticle.ensureCapacity(i13);
                    int max = Math.max(i13, size);
                    for (int i14 = 0; i14 < max; i14++) {
                        if (i14 < size) {
                            this.charactersByArticle.get(i14).clear();
                        } else if (i13 < size) {
                            this.charactersByArticle.remove(i14);
                        } else {
                            this.charactersByArticle.add(new ArrayList());
                        }
                    }
                    this.characterListMapping.clear();
                    super.processPage(pDPage);
                    writePage();
                    endPage(pDPage);
                }
            }
        }
    }

    public void processPages(PDPageTree pDPageTree) {
        PDPage findDestinationPage;
        PDOutlineItem pDOutlineItem;
        PDOutlineItem pDOutlineItem2 = this.startBookmark;
        PDPage pDPage = null;
        if (pDOutlineItem2 == null) {
            findDestinationPage = null;
        } else {
            findDestinationPage = pDOutlineItem2.findDestinationPage(this.document);
        }
        if (findDestinationPage != null) {
            this.startBookmarkPageNumber = pDPageTree.indexOf(findDestinationPage) + 1;
        } else {
            this.startBookmarkPageNumber = -1;
        }
        PDOutlineItem pDOutlineItem3 = this.endBookmark;
        if (pDOutlineItem3 != null) {
            pDPage = pDOutlineItem3.findDestinationPage(this.document);
        }
        if (pDPage != null) {
            this.endBookmarkPageNumber = pDPageTree.indexOf(pDPage) + 1;
        } else {
            this.endBookmarkPageNumber = -1;
        }
        if (this.startBookmarkPageNumber == -1 && (pDOutlineItem = this.startBookmark) != null && this.endBookmarkPageNumber == -1 && this.endBookmark != null && pDOutlineItem.getCOSObject() == this.endBookmark.getCOSObject()) {
            this.startBookmarkPageNumber = 0;
            this.endBookmarkPageNumber = 0;
        }
        Iterator<PDPage> it = pDPageTree.iterator();
        while (it.hasNext()) {
            PDPage next = it.next();
            this.currentPageNo++;
            if (next.hasContents()) {
                processPage(next);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @Override // com.tom_roush.pdfbox.text.LegacyPDFStreamEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void processTextPosition(com.tom_roush.pdfbox.text.TextPosition r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.text.PDFTextStripper.processTextPosition(com.tom_roush.pdfbox.text.TextPosition):void");
    }

    public void setAddMoreFormatting(boolean z10) {
        this.addMoreFormatting = z10;
    }

    public void setArticleEnd(String str) {
        this.articleEnd = str;
    }

    public void setArticleStart(String str) {
        this.articleStart = str;
    }

    public void setAverageCharTolerance(float f10) {
        this.averageCharTolerance = f10;
    }

    public void setDropThreshold(float f10) {
        this.dropThreshold = f10;
    }

    public void setEndBookmark(PDOutlineItem pDOutlineItem) {
        this.endBookmark = pDOutlineItem;
    }

    public void setEndPage(int i10) {
        this.endPage = i10;
    }

    public void setIndentThreshold(float f10) {
        this.indentThreshold = f10;
    }

    public void setLineSeparator(String str) {
        this.lineSeparator = str;
    }

    public void setListItemPatterns(List<Pattern> list) {
        this.listOfPatterns = list;
    }

    public void setPageEnd(String str) {
        this.pageEnd = str;
    }

    public void setPageStart(String str) {
        this.pageStart = str;
    }

    public void setParagraphEnd(String str) {
        this.paragraphEnd = str;
    }

    public void setParagraphStart(String str) {
        this.paragraphStart = str;
    }

    public void setShouldSeparateByBeads(boolean z10) {
        this.shouldSeparateByBeads = z10;
    }

    public void setSortByPosition(boolean z10) {
        this.sortByPosition = z10;
    }

    public void setSpacingTolerance(float f10) {
        this.spacingTolerance = f10;
    }

    public void setStartBookmark(PDOutlineItem pDOutlineItem) {
        this.startBookmark = pDOutlineItem;
    }

    public void setStartPage(int i10) {
        this.startPage = i10;
    }

    public void setSuppressDuplicateOverlappingText(boolean z10) {
        this.suppressDuplicateOverlappingText = z10;
    }

    public void setWordSeparator(String str) {
        this.wordSeparator = str;
    }

    public void startArticle() {
        startArticle(true);
    }

    public void writeCharacters(TextPosition textPosition) {
        this.output.write(textPosition.getUnicode());
    }

    public void writeLineSeparator() {
        this.output.write(getLineSeparator());
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void writePage() {
        /*
            Method dump skipped, instructions count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.text.PDFTextStripper.writePage():void");
    }

    public void writePageEnd() {
        this.output.write(getPageEnd());
    }

    public void writePageStart() {
        this.output.write(getPageStart());
    }

    public void writeParagraphEnd() {
        if (!this.inParagraph) {
            writeParagraphStart();
        }
        this.output.write(getParagraphEnd());
        this.inParagraph = false;
    }

    public void writeParagraphSeparator() {
        writeParagraphEnd();
        writeParagraphStart();
    }

    public void writeParagraphStart() {
        if (this.inParagraph) {
            writeParagraphEnd();
            this.inParagraph = false;
        }
        this.output.write(getParagraphStart());
        this.inParagraph = true;
    }

    public void writeString(String str, List<TextPosition> list) {
        writeString(str);
    }

    public void writeText(PDDocument pDDocument, Writer writer) {
        resetEngine();
        this.document = pDDocument;
        this.output = writer;
        if (getAddMoreFormatting()) {
            String str = this.lineSeparator;
            this.paragraphEnd = str;
            this.pageStart = str;
            this.articleStart = str;
            this.articleEnd = str;
        }
        startDocument(this.document);
        processPages(this.document.getPages());
        endDocument(this.document);
    }

    public void writeWordSeparator() {
        this.output.write(getWordSeparator());
    }

    /* loaded from: classes2.dex */
    public static final class LineItem {
        public static LineItem WORD_SEPARATOR = new LineItem();
        private final TextPosition textPosition;

        private LineItem() {
            this.textPosition = null;
        }

        public static LineItem getWordSeparator() {
            return WORD_SEPARATOR;
        }

        public TextPosition getTextPosition() {
            return this.textPosition;
        }

        public boolean isWordSeparator() {
            if (this.textPosition == null) {
                return true;
            }
            return false;
        }

        public LineItem(TextPosition textPosition) {
            this.textPosition = textPosition;
        }
    }

    public void startArticle(boolean z10) {
        this.output.write(getArticleStart());
    }

    public void writeString(String str) {
        this.output.write(str);
    }

    public void endDocument(PDDocument pDDocument) {
    }

    public void endPage(PDPage pDPage) {
    }

    public void startDocument(PDDocument pDDocument) {
    }

    public void startPage(PDPage pDPage) {
    }
}
