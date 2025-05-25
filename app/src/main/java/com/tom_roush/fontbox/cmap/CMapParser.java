package com.tom_roush.fontbox.cmap;

import a0.a;
import com.tom_roush.fontbox.util.Charsets;
import com.tom_roush.pdfbox.android.PDFBoxResourceLoader;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes2.dex */
public class CMapParser {
    private static final String MARK_END_OF_ARRAY = "]";
    private static final String MARK_END_OF_DICTIONARY = ">>";
    private boolean strictMode;
    private final byte[] tokenParserByteBuffer;

    /* loaded from: classes2.dex */
    public static final class LiteralName {
        private String name;

        public /* synthetic */ LiteralName(String str, int i10) {
            this(str);
        }

        private LiteralName(String str) {
            this.name = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Operator {

        /* renamed from: op  reason: collision with root package name */
        private String f15982op;

        public /* synthetic */ Operator(String str, int i10) {
            this(str);
        }

        private Operator(String str) {
            this.f15982op = str;
        }
    }

    public CMapParser() {
        this.tokenParserByteBuffer = new byte[512];
        this.strictMode = false;
    }

    private void addMappingFrombfrange(CMap cMap, byte[] bArr, List<byte[]> list) {
        for (byte[] bArr2 : list) {
            cMap.addCharMapping(bArr, createStringFromBytes(bArr2));
            increment(bArr, bArr.length - 1, false);
        }
    }

    private int createIntFromBytes(byte[] bArr) {
        int i10 = bArr[0] & 255;
        if (bArr.length == 2) {
            return (i10 << 8) + (bArr[1] & 255);
        }
        return i10;
    }

    private String createStringFromBytes(byte[] bArr) {
        Charset charset;
        if (bArr.length == 1) {
            charset = Charsets.ISO_8859_1;
        } else {
            charset = Charsets.UTF_16BE;
        }
        return new String(bArr, charset);
    }

    private boolean increment(byte[] bArr, int i10, boolean z10) {
        if (i10 > 0 && (bArr[i10] & 255) == 255) {
            if (z10) {
                return false;
            }
            bArr[i10] = 0;
            increment(bArr, i10 - 1, z10);
        } else {
            bArr[i10] = (byte) (bArr[i10] + 1);
        }
        return true;
    }

    private boolean isDelimiter(int i10) {
        if (i10 != 37 && i10 != 47 && i10 != 60 && i10 != 62 && i10 != 91 && i10 != 93 && i10 != 123 && i10 != 125 && i10 != 40 && i10 != 41) {
            return false;
        }
        return true;
    }

    private boolean isWhitespaceOrEOF(int i10) {
        if (i10 != -1 && i10 != 32 && i10 != 13 && i10 != 10) {
            return false;
        }
        return true;
    }

    private void parseBeginbfchar(Number number, PushbackInputStream pushbackInputStream, CMap cMap) {
        for (int i10 = 0; i10 < number.intValue(); i10++) {
            Object parseNextToken = parseNextToken(pushbackInputStream);
            if (parseNextToken instanceof Operator) {
                Operator operator = (Operator) parseNextToken;
                if (!operator.f15982op.equals("endbfchar")) {
                    throw new IOException("Error : ~bfchar contains an unexpected operator : " + operator.f15982op);
                }
                return;
            }
            byte[] bArr = (byte[]) parseNextToken;
            Object parseNextToken2 = parseNextToken(pushbackInputStream);
            if (parseNextToken2 instanceof byte[]) {
                cMap.addCharMapping(bArr, createStringFromBytes((byte[]) parseNextToken2));
            } else if (parseNextToken2 instanceof LiteralName) {
                cMap.addCharMapping(bArr, ((LiteralName) parseNextToken2).name);
            } else {
                throw new IOException("Error parsing CMap beginbfchar, expected{COSString or COSName} and not " + parseNextToken2);
            }
        }
    }

    private void parseBeginbfrange(Number number, PushbackInputStream pushbackInputStream, CMap cMap) {
        Operator operator;
        for (int i10 = 0; i10 < number.intValue(); i10++) {
            Object parseNextToken = parseNextToken(pushbackInputStream);
            if (parseNextToken instanceof Operator) {
                if (!((Operator) parseNextToken).f15982op.equals("endbfrange")) {
                    throw new IOException("Error : ~bfrange contains an unexpected operator : " + operator.f15982op);
                }
                return;
            }
            byte[] bArr = (byte[]) parseNextToken;
            byte[] bArr2 = (byte[]) parseNextToken(pushbackInputStream);
            int i11 = CMap.toInt(bArr, bArr.length);
            int i12 = CMap.toInt(bArr2, bArr2.length);
            if (i12 >= i11) {
                Object parseNextToken2 = parseNextToken(pushbackInputStream);
                if (parseNextToken2 instanceof List) {
                    List<byte[]> list = (List) parseNextToken2;
                    if (!list.isEmpty() && list.size() >= i12 - i11) {
                        addMappingFrombfrange(cMap, bArr, list);
                    }
                } else if (parseNextToken2 instanceof byte[]) {
                    byte[] bArr3 = (byte[]) parseNextToken2;
                    if (bArr3.length > 0) {
                        if (bArr3.length == 2 && i11 == 0 && i12 == 65535 && bArr3[0] == 0 && bArr3[1] == 0) {
                            for (int i13 = 0; i13 < 256; i13++) {
                                byte b10 = (byte) i13;
                                bArr[0] = b10;
                                bArr[1] = 0;
                                bArr3[0] = b10;
                                bArr3[1] = 0;
                                addMappingFrombfrange(cMap, bArr, 256, bArr3);
                            }
                        } else {
                            addMappingFrombfrange(cMap, bArr, (i12 - i11) + 1, bArr3);
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    private void parseBegincidchar(Number number, PushbackInputStream pushbackInputStream, CMap cMap) {
        for (int i10 = 0; i10 < number.intValue(); i10++) {
            Object parseNextToken = parseNextToken(pushbackInputStream);
            if (parseNextToken instanceof Operator) {
                Operator operator = (Operator) parseNextToken;
                if (!operator.f15982op.equals("endcidchar")) {
                    throw new IOException("Error : ~cidchar contains an unexpected operator : " + operator.f15982op);
                }
                return;
            }
            cMap.addCIDMapping(((Integer) parseNextToken(pushbackInputStream)).intValue(), createIntFromBytes((byte[]) parseNextToken));
        }
    }

    private void parseBegincidrange(int i10, PushbackInputStream pushbackInputStream, CMap cMap) {
        Operator operator;
        for (int i11 = 0; i11 < i10; i11++) {
            Object parseNextToken = parseNextToken(pushbackInputStream);
            if (parseNextToken instanceof Operator) {
                if (!((Operator) parseNextToken).f15982op.equals("endcidrange")) {
                    throw new IOException("Error : ~cidrange contains an unexpected operator : " + operator.f15982op);
                }
                return;
            }
            byte[] bArr = (byte[]) parseNextToken;
            int createIntFromBytes = createIntFromBytes(bArr);
            byte[] bArr2 = (byte[]) parseNextToken(pushbackInputStream);
            int createIntFromBytes2 = createIntFromBytes(bArr2);
            int intValue = ((Integer) parseNextToken(pushbackInputStream)).intValue();
            if (bArr.length <= 2 && bArr2.length <= 2) {
                if (createIntFromBytes2 == createIntFromBytes) {
                    cMap.addCIDMapping(intValue, createIntFromBytes);
                } else {
                    cMap.addCIDRange((char) createIntFromBytes, (char) createIntFromBytes2, intValue);
                }
            } else {
                int i12 = (createIntFromBytes2 + intValue) - createIntFromBytes;
                while (intValue <= i12) {
                    cMap.addCIDMapping(intValue, createIntFromBytes(bArr));
                    increment(bArr, bArr.length - 1, false);
                    intValue++;
                }
            }
        }
    }

    private void parseBegincodespacerange(Number number, PushbackInputStream pushbackInputStream, CMap cMap) {
        for (int i10 = 0; i10 < number.intValue(); i10++) {
            Object parseNextToken = parseNextToken(pushbackInputStream);
            if (parseNextToken instanceof Operator) {
                Operator operator = (Operator) parseNextToken;
                if (!operator.f15982op.equals("endcodespacerange")) {
                    throw new IOException("Error : ~codespacerange contains an unexpected operator : " + operator.f15982op);
                }
                return;
            }
            try {
                cMap.addCodespaceRange(new CodespaceRange((byte[]) parseNextToken, (byte[]) parseNextToken(pushbackInputStream)));
            } catch (IllegalArgumentException e10) {
                throw new IOException(e10);
            }
        }
    }

    private void parseLiteralName(LiteralName literalName, PushbackInputStream pushbackInputStream, CMap cMap) {
        if ("WMode".equals(literalName.name)) {
            Object parseNextToken = parseNextToken(pushbackInputStream);
            if (parseNextToken instanceof Integer) {
                cMap.setWMode(((Integer) parseNextToken).intValue());
            }
        } else if ("CMapName".equals(literalName.name)) {
            Object parseNextToken2 = parseNextToken(pushbackInputStream);
            if (parseNextToken2 instanceof LiteralName) {
                cMap.setName(((LiteralName) parseNextToken2).name);
            }
        } else if ("CMapVersion".equals(literalName.name)) {
            Object parseNextToken3 = parseNextToken(pushbackInputStream);
            if (parseNextToken3 instanceof Number) {
                cMap.setVersion(parseNextToken3.toString());
            } else if (parseNextToken3 instanceof String) {
                cMap.setVersion((String) parseNextToken3);
            }
        } else if ("CMapType".equals(literalName.name)) {
            Object parseNextToken4 = parseNextToken(pushbackInputStream);
            if (parseNextToken4 instanceof Integer) {
                cMap.setType(((Integer) parseNextToken4).intValue());
            }
        } else if ("Registry".equals(literalName.name)) {
            Object parseNextToken5 = parseNextToken(pushbackInputStream);
            if (parseNextToken5 instanceof String) {
                cMap.setRegistry((String) parseNextToken5);
            }
        } else if ("Ordering".equals(literalName.name)) {
            Object parseNextToken6 = parseNextToken(pushbackInputStream);
            if (parseNextToken6 instanceof String) {
                cMap.setOrdering((String) parseNextToken6);
            }
        } else if ("Supplement".equals(literalName.name)) {
            Object parseNextToken7 = parseNextToken(pushbackInputStream);
            if (parseNextToken7 instanceof Integer) {
                cMap.setSupplement(((Integer) parseNextToken7).intValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object parseNextToken(java.io.PushbackInputStream r11) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.fontbox.cmap.CMapParser.parseNextToken(java.io.PushbackInputStream):java.lang.Object");
    }

    private void parseUsecmap(LiteralName literalName, CMap cMap) {
        cMap.useCmap(parse(getExternalCMap(literalName.name)));
    }

    private void readUntilEndOfLine(InputStream inputStream, StringBuilder sb2) {
        int read = inputStream.read();
        while (read != -1 && read != 13 && read != 10) {
            sb2.append((char) read);
            read = inputStream.read();
        }
    }

    public InputStream getExternalCMap(String str) {
        if (PDFBoxResourceLoader.isReady()) {
            return new BufferedInputStream(PDFBoxResourceLoader.getStream("com/tom_roush/fontbox/resources/cmap/" + str));
        }
        Class<?> cls = getClass();
        InputStream resourceAsStream = cls.getResourceAsStream("/com/tom_roush/fontbox/resources/cmap/" + str);
        if (resourceAsStream != null) {
            return new BufferedInputStream(resourceAsStream);
        }
        throw new IOException(a.h("Error: Could not find referenced cmap stream ", str));
    }

    public CMap parse(File file) {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                CMap parse = parse(fileInputStream2);
                fileInputStream2.close();
                return parse;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public CMap parsePredefined(String str) {
        InputStream inputStream;
        try {
            inputStream = getExternalCMap(str);
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            this.strictMode = false;
            CMap parse = parse(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return parse;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public CMapParser(boolean z10) {
        this.tokenParserByteBuffer = new byte[512];
        this.strictMode = z10;
    }

    private void addMappingFrombfrange(CMap cMap, byte[] bArr, int i10, byte[] bArr2) {
        for (int i11 = 0; i11 < i10; i11++) {
            cMap.addCharMapping(bArr, createStringFromBytes(bArr2));
            if (!increment(bArr2, bArr2.length - 1, this.strictMode)) {
                return;
            }
            increment(bArr, bArr.length - 1, false);
        }
    }

    public CMap parse(InputStream inputStream) {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream);
        CMap cMap = new CMap();
        Integer num = null;
        while (true) {
            Object parseNextToken = parseNextToken(pushbackInputStream);
            if (parseNextToken == null) {
                break;
            }
            if (parseNextToken instanceof Operator) {
                Operator operator = (Operator) parseNextToken;
                if (operator.f15982op.equals("endcmap")) {
                    break;
                } else if (num != null) {
                    if (operator.f15982op.equals("usecmap") && (num instanceof LiteralName)) {
                        parseUsecmap((LiteralName) num, cMap);
                    } else if (num instanceof Number) {
                        if (!operator.f15982op.equals("begincodespacerange")) {
                            if (!operator.f15982op.equals("beginbfchar")) {
                                if (!operator.f15982op.equals("beginbfrange")) {
                                    if (!operator.f15982op.equals("begincidchar")) {
                                        if (operator.f15982op.equals("begincidrange") && (num instanceof Integer)) {
                                            parseBegincidrange(num.intValue(), pushbackInputStream, cMap);
                                        }
                                    } else {
                                        parseBegincidchar(num, pushbackInputStream, cMap);
                                    }
                                } else {
                                    parseBeginbfrange(num, pushbackInputStream, cMap);
                                }
                            } else {
                                parseBeginbfchar(num, pushbackInputStream, cMap);
                            }
                        } else {
                            parseBegincodespacerange(num, pushbackInputStream, cMap);
                        }
                    }
                }
            } else if (parseNextToken instanceof LiteralName) {
                parseLiteralName((LiteralName) parseNextToken, pushbackInputStream, cMap);
            }
            num = parseNextToken;
        }
        return cMap;
    }
}
