package com.tom_roush.pdfbox.pdmodel.font.encoding;

import a0.a;
import com.tom_roush.pdfbox.android.PDFBoxResourceLoader;
import com.tom_roush.pdfbox.io.IOUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lib.zj.office.fc.codec.CharEncoding;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes2.dex */
public final class GlyphList {
    private static final GlyphList DEFAULT = load("glyphlist.txt", 4281);
    private static final GlyphList ZAPF_DINGBATS = load("zapfdingbats.txt", 201);
    private final Map<String, String> nameToUnicode;
    private final Map<String, String> uniNameToUnicodeCache = new ConcurrentHashMap();
    private final Map<String, String> unicodeToName;

    static {
        try {
            if (System.getProperty("glyphlist_ext") != null) {
                throw new UnsupportedOperationException("glyphlist_ext is no longer supported, use GlyphList.DEFAULT.addGlyphs(Properties) instead");
            }
        } catch (SecurityException unused) {
        }
    }

    public GlyphList(InputStream inputStream, int i10) {
        this.nameToUnicode = new HashMap(i10);
        this.unicodeToName = new HashMap(i10);
        loadList(inputStream);
    }

    public static GlyphList getAdobeGlyphList() {
        return DEFAULT;
    }

    public static GlyphList getZapfDingbats() {
        return ZAPF_DINGBATS;
    }

    private static GlyphList load(String str, int i10) {
        InputStream resourceAsStream;
        String h10 = a.h("com/tom_roush/pdfbox/resources/glyphlist/", str);
        try {
            try {
                if (PDFBoxResourceLoader.isReady()) {
                    resourceAsStream = PDFBoxResourceLoader.getStream(h10);
                } else {
                    resourceAsStream = GlyphList.class.getResourceAsStream(PackagingURIHelper.FORWARD_SLASH_STRING + h10);
                }
                InputStream inputStream = resourceAsStream;
                if (inputStream != null) {
                    GlyphList glyphList = new GlyphList(inputStream, i10);
                    IOUtils.closeQuietly(inputStream);
                    return glyphList;
                }
                throw new IOException("GlyphList '" + h10 + "' not found");
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th2) {
            IOUtils.closeQuietly(null);
            throw th2;
        }
    }

    private void loadList(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, CharEncoding.ISO_8859_1));
        while (bufferedReader.ready()) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null && !readLine.startsWith("#")) {
                    String[] split = readLine.split(";");
                    if (split.length >= 2) {
                        boolean z10 = false;
                        String str = split[0];
                        String[] split2 = split[1].split(" ");
                        if (this.nameToUnicode.containsKey(str)) {
                            String str2 = split[1];
                            this.nameToUnicode.get(str);
                        }
                        int length = split2.length;
                        int[] iArr = new int[length];
                        int length2 = split2.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length2) {
                            iArr[i11] = Integer.parseInt(split2[i10], 16);
                            i10++;
                            i11++;
                        }
                        String str3 = new String(iArr, 0, length);
                        this.nameToUnicode.put(str, str3);
                        if (WinAnsiEncoding.INSTANCE.contains(str) || MacRomanEncoding.INSTANCE.contains(str) || MacExpertEncoding.INSTANCE.contains(str) || SymbolEncoding.INSTANCE.contains(str) || ZapfDingbatsEncoding.INSTANCE.contains(str)) {
                            z10 = true;
                        }
                        if (!this.unicodeToName.containsKey(str3) || z10) {
                            this.unicodeToName.put(str3, str);
                        }
                    } else {
                        throw new IOException("Invalid glyph list entry: " + readLine);
                    }
                }
            } finally {
                bufferedReader.close();
            }
        }
    }

    public String codePointToName(int i10) {
        String str = this.unicodeToName.get(new String(new int[]{i10}, 0, 1));
        if (str == null) {
            return ".notdef";
        }
        return str;
    }

    public String sequenceToName(String str) {
        String str2 = this.unicodeToName.get(str);
        if (str2 == null) {
            return ".notdef";
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
        r8.uniNameToUnicodeCache.put(r9, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toUnicode(java.lang.String r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L4
            r9 = 0
            return r9
        L4:
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.nameToUnicode
            java.lang.Object r0 = r0.get(r9)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lf
            return r0
        Lf:
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.uniNameToUnicodeCache
            java.lang.Object r0 = r0.get(r9)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L95
            r1 = 46
            int r2 = r9.indexOf(r1)
            if (r2 <= 0) goto L2f
            r0 = 0
            int r1 = r9.indexOf(r1)
            java.lang.String r0 = r9.substring(r0, r1)
            java.lang.String r0 = r8.toUnicode(r0)
            goto L8e
        L2f:
            java.lang.String r1 = "uni"
            boolean r1 = r9.startsWith(r1)
            r2 = 57344(0xe000, float:8.0356E-41)
            r3 = 55295(0xd7ff, float:7.7485E-41)
            r4 = 16
            if (r1 == 0) goto L6c
            int r1 = r9.length()
            r5 = 7
            if (r1 != r5) goto L6c
            int r1 = r9.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 3
        L50:
            int r7 = r6 + 4
            if (r7 > r1) goto L67
            java.lang.String r6 = r9.substring(r6, r7)     // Catch: java.lang.NumberFormatException -> L8e
            int r6 = java.lang.Integer.parseInt(r6, r4)     // Catch: java.lang.NumberFormatException -> L8e
            if (r6 <= r3) goto L61
            if (r6 >= r2) goto L61
            goto L65
        L61:
            char r6 = (char) r6     // Catch: java.lang.NumberFormatException -> L8e
            r5.append(r6)     // Catch: java.lang.NumberFormatException -> L8e
        L65:
            r6 = r7
            goto L50
        L67:
            java.lang.String r0 = r5.toString()     // Catch: java.lang.NumberFormatException -> L8e
            goto L8e
        L6c:
            java.lang.String r1 = "u"
            boolean r1 = r9.startsWith(r1)
            if (r1 == 0) goto L8e
            int r1 = r9.length()
            r5 = 5
            if (r1 != r5) goto L8e
            r1 = 1
            java.lang.String r1 = r9.substring(r1)     // Catch: java.lang.NumberFormatException -> L8e
            int r1 = java.lang.Integer.parseInt(r1, r4)     // Catch: java.lang.NumberFormatException -> L8e
            if (r1 <= r3) goto L89
            if (r1 >= r2) goto L89
            goto L8e
        L89:
            char r1 = (char) r1     // Catch: java.lang.NumberFormatException -> L8e
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L8e
        L8e:
            if (r0 == 0) goto L95
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.uniNameToUnicodeCache
            r1.put(r9, r0)
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.font.encoding.GlyphList.toUnicode(java.lang.String):java.lang.String");
    }

    public GlyphList(GlyphList glyphList, InputStream inputStream) {
        this.nameToUnicode = new HashMap(glyphList.nameToUnicode);
        this.unicodeToName = new HashMap(glyphList.unicodeToName);
        loadList(inputStream);
    }
}
