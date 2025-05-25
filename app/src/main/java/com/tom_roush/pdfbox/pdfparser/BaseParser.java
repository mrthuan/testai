package com.tom_roush.pdfbox.pdfparser;

import android.support.v4.media.session.h;
import b.a;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSBoolean;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNull;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSObjectKey;
import com.tom_roush.pdfbox.util.Charsets;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.Objects;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes2.dex */
public abstract class BaseParser {
    protected static final int A = 97;
    protected static final byte ASCII_CR = 13;
    protected static final byte ASCII_LF = 10;
    private static final byte ASCII_NINE = 57;
    private static final byte ASCII_SPACE = 32;
    private static final byte ASCII_ZERO = 48;
    protected static final int B = 98;
    protected static final int D = 100;
    public static final String DEF = "def";
    protected static final int E = 101;
    protected static final String ENDOBJ_STRING = "endobj";
    protected static final String ENDSTREAM_STRING = "endstream";
    private static final String FALSE = "false";
    private static final long GENERATION_NUMBER_THRESHOLD = 65535;
    protected static final int J = 106;
    protected static final int M = 109;
    static final int MAX_LENGTH_LONG = Long.toString(Long.MAX_VALUE).length();
    protected static final int N = 110;
    private static final String NULL = "null";
    protected static final int O = 111;
    private static final long OBJECT_NUMBER_THRESHOLD = 10000000000L;
    protected static final int R = 114;
    protected static final int S = 115;
    protected static final String STREAM_STRING = "stream";
    protected static final int T = 116;
    private static final String TRUE = "true";
    protected COSDocument document;
    final SequentialSource seqSource;
    private final CharsetDecoder utf8Decoder = Charsets.UTF_8.newDecoder();

    public BaseParser(SequentialSource sequentialSource) {
        this.seqSource = sequentialSource;
    }

    private int checkForEndOfString(int i10) {
        byte b10;
        byte[] bArr = new byte[3];
        int read = this.seqSource.read(bArr);
        if (read == 3 && bArr[0] == 13 && (((b10 = bArr[1]) == 10 && bArr[2] == 47) || bArr[2] == 62 || b10 == 47 || b10 == 62)) {
            i10 = 0;
        }
        if (read > 0) {
            this.seqSource.unread(bArr, 0, read);
        }
        return i10;
    }

    private COSBase getObjectFromPool(COSObjectKey cOSObjectKey) {
        COSDocument cOSDocument = this.document;
        if (cOSDocument != null) {
            return cOSDocument.getObjectFromPool(cOSObjectKey);
        }
        StringBuilder sb2 = new StringBuilder("object reference ");
        sb2.append(cOSObjectKey);
        sb2.append(" at offset ");
        throw new IOException(h.e(sb2, this.seqSource.getPosition(), " in content stream"));
    }

    private boolean isCR(int i10) {
        if (13 == i10) {
            return true;
        }
        return false;
    }

    public static boolean isDigit(int i10) {
        return i10 >= 48 && i10 <= 57;
    }

    private static boolean isHexDigit(char c) {
        if (!isDigit(c) && ((c < 'a' || c > 'f') && (c < 'A' || c > 'F'))) {
            return false;
        }
        return true;
    }

    private boolean isLF(int i10) {
        if (10 == i10) {
            return true;
        }
        return false;
    }

    private boolean isValidUTF8(byte[] bArr) {
        try {
            this.utf8Decoder.decode(ByteBuffer.wrap(bArr));
            return true;
        } catch (CharacterCodingException unused) {
            return false;
        }
    }

    private boolean parseCOSDictionaryNameValuePair(COSDictionary cOSDictionary) {
        COSName parseCOSName = parseCOSName();
        COSBase parseCOSDictionaryValue = parseCOSDictionaryValue();
        skipSpaces();
        if (parseCOSDictionaryValue == null) {
            this.seqSource.getPosition();
            return false;
        }
        if ((parseCOSDictionaryValue instanceof COSInteger) && !((COSInteger) parseCOSDictionaryValue).isValid()) {
            this.seqSource.getPosition();
        } else {
            parseCOSDictionaryValue.setDirect(true);
            cOSDictionary.setItem(parseCOSName, parseCOSDictionaryValue);
        }
        return true;
    }

    private COSBase parseCOSDictionaryValue() {
        this.seqSource.getPosition();
        COSBase parseDirObject = parseDirObject();
        skipSpaces();
        if ((parseDirObject instanceof COSNumber) && isDigit()) {
            this.seqSource.getPosition();
            COSBase parseDirObject2 = parseDirObject();
            skipSpaces();
            readExpectedChar('R');
            if (!(parseDirObject instanceof COSInteger)) {
                Objects.toString(parseDirObject);
                return COSNull.NULL;
            } else if (!(parseDirObject2 instanceof COSInteger)) {
                Objects.toString(parseDirObject);
                return COSNull.NULL;
            } else {
                return getObjectFromPool(new COSObjectKey(((COSInteger) parseDirObject).longValue(), ((COSInteger) parseDirObject2).intValue()));
            }
        }
        return parseDirObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        return com.tom_roush.pdfbox.cos.COSString.parseHex(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.tom_roush.pdfbox.cos.COSString parseCOSHexString() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L5:
            com.tom_roush.pdfbox.pdfparser.SequentialSource r1 = r5.seqSource
            int r1 = r1.read()
            char r2 = (char) r1
            boolean r3 = isHexDigit(r2)
            if (r3 == 0) goto L16
            r0.append(r2)
            goto L5
        L16:
            r2 = 62
            if (r1 != r2) goto L1b
            goto L55
        L1b:
            java.lang.String r3 = "Missing closing bracket for hex string. Reached EOS."
            if (r1 < 0) goto L64
            r4 = 32
            if (r1 == r4) goto L5
            r4 = 10
            if (r1 == r4) goto L5
            r4 = 9
            if (r1 == r4) goto L5
            r4 = 13
            if (r1 == r4) goto L5
            r4 = 8
            if (r1 == r4) goto L5
            r4 = 12
            if (r1 != r4) goto L38
            goto L5
        L38:
            int r1 = r0.length()
            int r1 = r1 % 2
            if (r1 == 0) goto L49
            int r1 = r0.length()
            int r1 = r1 + (-1)
            r0.deleteCharAt(r1)
        L49:
            com.tom_roush.pdfbox.pdfparser.SequentialSource r1 = r5.seqSource
            int r1 = r1.read()
            if (r1 == r2) goto L53
            if (r1 >= 0) goto L49
        L53:
            if (r1 < 0) goto L5e
        L55:
            java.lang.String r0 = r0.toString()
            com.tom_roush.pdfbox.cos.COSString r0 = com.tom_roush.pdfbox.cos.COSString.parseHex(r0)
            return r0
        L5e:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r3)
            throw r0
        L64:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.BaseParser.parseCOSHexString():com.tom_roush.pdfbox.cos.COSString");
    }

    private COSNumber parseCOSNumber() {
        StringBuilder sb2 = new StringBuilder();
        int read = this.seqSource.read();
        while (true) {
            char c = (char) read;
            if (!Character.isDigit(c) && c != '-' && c != '+' && c != '.' && c != 'E' && c != 'e') {
                break;
            }
            sb2.append(c);
            read = this.seqSource.read();
        }
        if (read != -1) {
            this.seqSource.unread(read);
        }
        return COSNumber.get(sb2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0092, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean readUntilEndOfCOSDictionary() {
        /*
            r6 = this;
            com.tom_roush.pdfbox.pdfparser.SequentialSource r0 = r6.seqSource
            int r0 = r0.read()
        L6:
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L90
            r4 = 47
            if (r0 == r4) goto L90
            r4 = 62
            if (r0 == r4) goto L90
            r1 = 101(0x65, float:1.42E-43)
            if (r0 != r1) goto L88
            com.tom_roush.pdfbox.pdfparser.SequentialSource r0 = r6.seqSource
            int r0 = r0.read()
            r4 = 110(0x6e, float:1.54E-43)
            if (r0 != r4) goto L88
            com.tom_roush.pdfbox.pdfparser.SequentialSource r0 = r6.seqSource
            int r0 = r0.read()
            r4 = 100
            if (r0 != r4) goto L88
            com.tom_roush.pdfbox.pdfparser.SequentialSource r0 = r6.seqSource
            int r0 = r0.read()
            r4 = 115(0x73, float:1.61E-43)
            if (r0 != r4) goto L67
            com.tom_roush.pdfbox.pdfparser.SequentialSource r4 = r6.seqSource
            int r4 = r4.read()
            r5 = 116(0x74, float:1.63E-43)
            if (r4 != r5) goto L67
            com.tom_roush.pdfbox.pdfparser.SequentialSource r4 = r6.seqSource
            int r4 = r4.read()
            r5 = 114(0x72, float:1.6E-43)
            if (r4 != r5) goto L67
            com.tom_roush.pdfbox.pdfparser.SequentialSource r4 = r6.seqSource
            int r4 = r4.read()
            if (r4 != r1) goto L67
            com.tom_roush.pdfbox.pdfparser.SequentialSource r1 = r6.seqSource
            int r1 = r1.read()
            r4 = 97
            if (r1 != r4) goto L67
            com.tom_roush.pdfbox.pdfparser.SequentialSource r1 = r6.seqSource
            int r1 = r1.read()
            r4 = 109(0x6d, float:1.53E-43)
            if (r1 != r4) goto L67
            r1 = r3
            goto L68
        L67:
            r1 = r2
        L68:
            if (r1 != 0) goto L83
            r4 = 111(0x6f, float:1.56E-43)
            if (r0 != r4) goto L83
            com.tom_roush.pdfbox.pdfparser.SequentialSource r0 = r6.seqSource
            int r0 = r0.read()
            r4 = 98
            if (r0 != r4) goto L83
            com.tom_roush.pdfbox.pdfparser.SequentialSource r0 = r6.seqSource
            int r0 = r0.read()
            r4 = 106(0x6a, float:1.49E-43)
            if (r0 != r4) goto L83
            r2 = r3
        L83:
            if (r1 != 0) goto L87
            if (r2 == 0) goto L88
        L87:
            return r3
        L88:
            com.tom_roush.pdfbox.pdfparser.SequentialSource r0 = r6.seqSource
            int r0 = r0.read()
            goto L6
        L90:
            if (r0 != r1) goto L93
            return r3
        L93:
            com.tom_roush.pdfbox.pdfparser.SequentialSource r1 = r6.seqSource
            r1.unread(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.BaseParser.readUntilEndOfCOSDictionary():boolean");
    }

    public boolean isClosing(int i10) {
        return i10 == 93;
    }

    public boolean isEOL() {
        return isEOL(this.seqSource.peek());
    }

    public boolean isEndOfName(int i10) {
        if (i10 != 32 && i10 != 13 && i10 != 10 && i10 != 9 && i10 != 62 && i10 != 60 && i10 != 91 && i10 != 47 && i10 != 93 && i10 != 41 && i10 != 40 && i10 != 0 && i10 != 12 && i10 != 37) {
            return false;
        }
        return true;
    }

    public boolean isSpace(int i10) {
        return 32 == i10;
    }

    public boolean isWhitespace(int i10) {
        return i10 == 0 || i10 == 9 || i10 == 12 || i10 == 10 || i10 == 13 || i10 == 32;
    }

    public COSBoolean parseBoolean() {
        char peek = (char) this.seqSource.peek();
        if (peek == 't') {
            String str = new String(this.seqSource.readFully(4), Charsets.ISO_8859_1);
            if (str.equals(TRUE)) {
                return COSBoolean.TRUE;
            }
            StringBuilder g10 = a.g("Error parsing boolean: expected='true' actual='", str, "' at offset ");
            g10.append(this.seqSource.getPosition());
            throw new IOException(g10.toString());
        } else if (peek == 'f') {
            String str2 = new String(this.seqSource.readFully(5), Charsets.ISO_8859_1);
            if (str2.equals(FALSE)) {
                return COSBoolean.FALSE;
            }
            StringBuilder g11 = a.g("Error parsing boolean: expected='true' actual='", str2, "' at offset ");
            g11.append(this.seqSource.getPosition());
            throw new IOException(g11.toString());
        } else {
            throw new IOException("Error parsing boolean expected='t or f' actual='" + peek + "' at offset " + this.seqSource.getPosition());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
        r7.seqSource.read();
        skipSpaces();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c3, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.tom_roush.pdfbox.cos.COSArray parseCOSArray() {
        /*
            r7 = this;
            com.tom_roush.pdfbox.pdfparser.SequentialSource r0 = r7.seqSource
            r0.getPosition()
            r0 = 91
            r7.readExpectedChar(r0)
            com.tom_roush.pdfbox.cos.COSArray r1 = new com.tom_roush.pdfbox.cos.COSArray
            r1.<init>()
            r7.skipSpaces()
        L12:
            com.tom_roush.pdfbox.pdfparser.SequentialSource r2 = r7.seqSource
            int r2 = r2.peek()
            if (r2 <= 0) goto Lbb
            char r2 = (char) r2
            r3 = 93
            if (r2 == r3) goto Lbb
            com.tom_roush.pdfbox.cos.COSBase r2 = r7.parseDirObject()
            boolean r3 = r2 instanceof com.tom_roush.pdfbox.cos.COSObject
            if (r3 == 0) goto L7b
            int r2 = r1.size()
            r3 = 0
            if (r2 <= 0) goto L7a
            int r2 = r1.size()
            int r2 = r2 + (-1)
            com.tom_roush.pdfbox.cos.COSBase r2 = r1.get(r2)
            boolean r2 = r2 instanceof com.tom_roush.pdfbox.cos.COSInteger
            if (r2 == 0) goto L7a
            int r2 = r1.size()
            int r2 = r2 + (-1)
            com.tom_roush.pdfbox.cos.COSBase r2 = r1.remove(r2)
            com.tom_roush.pdfbox.cos.COSInteger r2 = (com.tom_roush.pdfbox.cos.COSInteger) r2
            int r4 = r1.size()
            if (r4 <= 0) goto L7a
            int r4 = r1.size()
            int r4 = r4 + (-1)
            com.tom_roush.pdfbox.cos.COSBase r4 = r1.get(r4)
            boolean r4 = r4 instanceof com.tom_roush.pdfbox.cos.COSInteger
            if (r4 == 0) goto L7a
            int r3 = r1.size()
            int r3 = r3 + (-1)
            com.tom_roush.pdfbox.cos.COSBase r3 = r1.remove(r3)
            com.tom_roush.pdfbox.cos.COSInteger r3 = (com.tom_roush.pdfbox.cos.COSInteger) r3
            com.tom_roush.pdfbox.cos.COSObjectKey r4 = new com.tom_roush.pdfbox.cos.COSObjectKey
            long r5 = r3.longValue()
            int r2 = r2.intValue()
            r4.<init>(r5, r2)
            com.tom_roush.pdfbox.cos.COSBase r2 = r7.getObjectFromPool(r4)
            goto L7b
        L7a:
            r2 = r3
        L7b:
            if (r2 == 0) goto L81
            r1.add(r2)
            goto Lb5
        L81:
            com.tom_roush.pdfbox.pdfparser.SequentialSource r2 = r7.seqSource
            r2.getPosition()
            java.lang.String r2 = r7.readString()
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L99
            com.tom_roush.pdfbox.pdfparser.SequentialSource r3 = r7.seqSource
            int r3 = r3.peek()
            if (r3 != r0) goto L99
            return r1
        L99:
            com.tom_roush.pdfbox.pdfparser.SequentialSource r3 = r7.seqSource
            java.nio.charset.Charset r4 = com.tom_roush.pdfbox.util.Charsets.ISO_8859_1
            byte[] r4 = r2.getBytes(r4)
            r3.unread(r4)
            java.lang.String r3 = "endobj"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto Lba
            java.lang.String r3 = "endstream"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lb5
            goto Lba
        Lb5:
            r7.skipSpaces()
            goto L12
        Lba:
            return r1
        Lbb:
            com.tom_roush.pdfbox.pdfparser.SequentialSource r0 = r7.seqSource
            r0.read()
            r7.skipSpaces()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.BaseParser.parseCOSArray():com.tom_roush.pdfbox.cos.COSArray");
    }

    public COSDictionary parseCOSDictionary() {
        readExpectedChar('<');
        readExpectedChar('<');
        skipSpaces();
        COSDictionary cOSDictionary = new COSDictionary();
        boolean z10 = false;
        while (!z10) {
            skipSpaces();
            char peek = (char) this.seqSource.peek();
            if (peek == '>') {
                z10 = true;
            } else if (peek == '/') {
                if (!parseCOSDictionaryNameValuePair(cOSDictionary)) {
                    return cOSDictionary;
                }
            } else {
                this.seqSource.getPosition();
                if (readUntilEndOfCOSDictionary()) {
                    return cOSDictionary;
                }
            }
        }
        readExpectedChar('>');
        readExpectedChar('>');
        return cOSDictionary;
    }

    public COSName parseCOSName() {
        String str;
        char c;
        readExpectedChar(PackagingURIHelper.FORWARD_SLASH_CHAR);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int read = this.seqSource.read();
        while (read != -1) {
            if (read == 35) {
                int read2 = this.seqSource.read();
                int read3 = this.seqSource.read();
                if (isHexDigit((char) read2)) {
                    char c10 = (char) read3;
                    if (isHexDigit(c10)) {
                        String str2 = Character.toString(c) + c10;
                        try {
                            byteArrayOutputStream.write(Integer.parseInt(str2, 16));
                            read = this.seqSource.read();
                        } catch (NumberFormatException e10) {
                            throw new IOException(a6.h.d("Error: expected hex digit, actual='", str2, OperatorName.SHOW_TEXT_LINE), e10);
                        }
                    }
                }
                if (read3 != -1 && read2 != -1) {
                    this.seqSource.unread(read3);
                    byteArrayOutputStream.write(read);
                    read = read2;
                } else {
                    read = -1;
                    break;
                }
            } else if (isEndOfName(read)) {
                break;
            } else {
                byteArrayOutputStream.write(read);
                read = this.seqSource.read();
            }
        }
        if (read != -1) {
            this.seqSource.unread(read);
        }
        if (isValidUTF8(byteArrayOutputStream.toByteArray())) {
            str = new String(byteArrayOutputStream.toByteArray(), Charsets.UTF_8);
        } else {
            str = new String(byteArrayOutputStream.toByteArray(), Charsets.WINDOWS_1252);
        }
        return COSName.getPDFName(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.tom_roush.pdfbox.cos.COSString parseCOSString() {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.BaseParser.parseCOSString():com.tom_roush.pdfbox.cos.COSString");
    }

    public COSBase parseDirObject() {
        skipSpaces();
        char peek = (char) this.seqSource.peek();
        if (peek != '(') {
            if (peek != '/') {
                if (peek != '<') {
                    if (peek != 'R') {
                        if (peek != '[') {
                            if (peek != 'f') {
                                if (peek != 'n') {
                                    if (peek != 't') {
                                        if (peek == 65535) {
                                            return null;
                                        }
                                        if (!Character.isDigit(peek) && peek != '-' && peek != '+' && peek != '.') {
                                            long position = this.seqSource.getPosition();
                                            String readString = readString();
                                            if (!readString.isEmpty()) {
                                                if (!ENDOBJ_STRING.equals(readString) && !ENDSTREAM_STRING.equals(readString)) {
                                                    this.seqSource.getPosition();
                                                } else {
                                                    this.seqSource.unread(readString.getBytes(Charsets.ISO_8859_1));
                                                }
                                                return null;
                                            }
                                            int peek2 = this.seqSource.peek();
                                            throw new IOException("Unknown dir object c='" + peek + "' cInt=" + ((int) peek) + " peek='" + ((char) peek2) + "' peekInt=" + peek2 + " at offset " + this.seqSource.getPosition() + " (start offset: " + position + ")");
                                        }
                                        return parseCOSNumber();
                                    }
                                    String str = new String(this.seqSource.readFully(4), Charsets.ISO_8859_1);
                                    if (str.equals(TRUE)) {
                                        return COSBoolean.TRUE;
                                    }
                                    StringBuilder g10 = a.g("expected true actual='", str, "' ");
                                    g10.append(this.seqSource);
                                    g10.append("' at offset ");
                                    g10.append(this.seqSource.getPosition());
                                    throw new IOException(g10.toString());
                                }
                                readExpectedString(NULL);
                                return COSNull.NULL;
                            }
                            String str2 = new String(this.seqSource.readFully(5), Charsets.ISO_8859_1);
                            if (str2.equals(FALSE)) {
                                return COSBoolean.FALSE;
                            }
                            StringBuilder g11 = a.g("expected false actual='", str2, "' ");
                            g11.append(this.seqSource);
                            g11.append("' at offset ");
                            g11.append(this.seqSource.getPosition());
                            throw new IOException(g11.toString());
                        }
                        return parseCOSArray();
                    }
                    this.seqSource.read();
                    return new COSObject(null);
                }
                int read = this.seqSource.read();
                char peek3 = (char) this.seqSource.peek();
                this.seqSource.unread(read);
                if (peek3 == '<') {
                    return parseCOSDictionary();
                }
                return parseCOSString();
            }
            return parseCOSName();
        }
        return parseCOSString();
    }

    public void readExpectedChar(char c) {
        char read = (char) this.seqSource.read();
        if (read == c) {
            return;
        }
        throw new IOException("expected='" + c + "' actual='" + read + "' at offset " + this.seqSource.getPosition());
    }

    public void readExpectedString(String str) {
        readExpectedString(str.toCharArray(), false);
    }

    public int readGenerationNumber() {
        int readInt = readInt();
        if (readInt >= 0 && readInt <= GENERATION_NUMBER_THRESHOLD) {
            return readInt;
        }
        throw new IOException(a0.a.g("Generation Number '", readInt, "' has more than 5 digits"));
    }

    public int readInt() {
        skipSpaces();
        StringBuilder readStringNumber = readStringNumber();
        try {
            return Integer.parseInt(readStringNumber.toString());
        } catch (NumberFormatException e10) {
            this.seqSource.unread(readStringNumber.toString().getBytes(Charsets.ISO_8859_1));
            throw new IOException("Error: Expected an integer type at offset " + this.seqSource.getPosition() + ", instead got '" + ((Object) readStringNumber) + OperatorName.SHOW_TEXT_LINE, e10);
        }
    }

    public String readLine() {
        int read;
        if (!this.seqSource.isEOF()) {
            StringBuilder sb2 = new StringBuilder(11);
            while (true) {
                read = this.seqSource.read();
                if (read == -1 || isEOL(read)) {
                    break;
                }
                sb2.append((char) read);
            }
            if (isCR(read) && isLF(this.seqSource.peek())) {
                this.seqSource.read();
            }
            return sb2.toString();
        }
        throw new IOException("Error: End-of-File, expected line");
    }

    public long readLong() {
        skipSpaces();
        StringBuilder readStringNumber = readStringNumber();
        try {
            return Long.parseLong(readStringNumber.toString());
        } catch (NumberFormatException e10) {
            this.seqSource.unread(readStringNumber.toString().getBytes(Charsets.ISO_8859_1));
            throw new IOException("Error: Expected a long type at offset " + this.seqSource.getPosition() + ", instead got '" + ((Object) readStringNumber) + OperatorName.SHOW_TEXT_LINE, e10);
        }
    }

    public long readObjectNumber() {
        long readLong = readLong();
        if (readLong >= 0 && readLong < OBJECT_NUMBER_THRESHOLD) {
            return readLong;
        }
        throw new IOException("Object Number '" + readLong + "' has more than 10 digits or is negative");
    }

    public String readString() {
        skipSpaces();
        StringBuilder sb2 = new StringBuilder();
        int read = this.seqSource.read();
        while (true) {
            char c = (char) read;
            if (isEndOfName(c) || read == -1) {
                break;
            }
            sb2.append(c);
            read = this.seqSource.read();
        }
        if (read != -1) {
            this.seqSource.unread(read);
        }
        return sb2.toString();
    }

    public final StringBuilder readStringNumber() {
        StringBuilder sb2 = new StringBuilder();
        do {
            int read = this.seqSource.read();
            if (read >= 48 && read <= 57) {
                sb2.append((char) read);
            } else {
                if (read != -1) {
                    this.seqSource.unread(read);
                }
                return sb2;
            }
        } while (sb2.length() <= MAX_LENGTH_LONG);
        throw new IOException("Number '" + ((Object) sb2) + "' is getting too long, stop reading at offset " + this.seqSource.getPosition());
    }

    public void skipSpaces() {
        int read = this.seqSource.read();
        while (true) {
            if (!isWhitespace(read) && read != 37) {
                break;
            } else if (read == 37) {
                read = this.seqSource.read();
                while (!isEOL(read) && read != -1) {
                    read = this.seqSource.read();
                }
            } else {
                read = this.seqSource.read();
            }
        }
        if (read != -1) {
            this.seqSource.unread(read);
        }
    }

    public void skipWhiteSpaces() {
        int read = this.seqSource.read();
        while (32 == read) {
            read = this.seqSource.read();
        }
        if (13 == read) {
            int read2 = this.seqSource.read();
            if (10 != read2) {
                this.seqSource.unread(read2);
            }
        } else if (10 != read) {
            this.seqSource.unread(read);
        }
    }

    public boolean isClosing() {
        return isClosing(this.seqSource.peek());
    }

    public boolean isDigit() {
        return isDigit(this.seqSource.peek());
    }

    public boolean isEOL(int i10) {
        return isLF(i10) || isCR(i10);
    }

    public boolean isSpace() {
        return isSpace(this.seqSource.peek());
    }

    public boolean isWhitespace() {
        return isWhitespace(this.seqSource.peek());
    }

    public final void readExpectedString(char[] cArr, boolean z10) {
        skipSpaces();
        for (char c : cArr) {
            if (this.seqSource.read() != c) {
                throw new IOException("Expected string '" + new String(cArr) + "' but missed at character '" + c + "' at offset " + this.seqSource.getPosition());
            }
        }
        skipSpaces();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
        r4.seqSource.unread(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String readString(int r5) {
        /*
            r4 = this;
            r4.skipSpaces()
            com.tom_roush.pdfbox.pdfparser.SequentialSource r0 = r4.seqSource
            int r0 = r0.read()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
        Le:
            boolean r2 = r4.isWhitespace(r0)
            r3 = -1
            if (r2 != 0) goto L3e
            boolean r2 = r4.isClosing(r0)
            if (r2 != 0) goto L3e
            if (r0 == r3) goto L3e
            int r2 = r1.length()
            if (r2 >= r5) goto L3e
            r2 = 91
            if (r0 == r2) goto L3e
            r2 = 60
            if (r0 == r2) goto L3e
            r2 = 40
            if (r0 == r2) goto L3e
            r2 = 47
            if (r0 == r2) goto L3e
            char r0 = (char) r0
            r1.append(r0)
            com.tom_roush.pdfbox.pdfparser.SequentialSource r0 = r4.seqSource
            int r0 = r0.read()
            goto Le
        L3e:
            if (r0 == r3) goto L45
            com.tom_roush.pdfbox.pdfparser.SequentialSource r5 = r4.seqSource
            r5.unread(r0)
        L45:
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.BaseParser.readString(int):java.lang.String");
    }
}
