package com.tom_roush.pdfbox.pdfparser;

import com.tom_roush.pdfbox.contentstream.PDContentStream;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.io.RandomAccessBuffer;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class PDFStreamParser extends BaseParser {
    private static final int MAX_BIN_CHAR_TEST_LENGTH = 10;
    private final byte[] binCharTestArr;
    private final List<Object> streamObjects;

    @Deprecated
    public PDFStreamParser(PDStream pDStream) {
        super(new InputStreamSource(pDStream.createInputStream()));
        this.streamObjects = new ArrayList(100);
        this.binCharTestArr = new byte[10];
    }

    private boolean hasNextSpaceOrReturn() {
        return isSpaceOrReturn(this.seqSource.peek());
    }

    private boolean hasNoFollowingBinData(SequentialSource sequentialSource) {
        int i10 = 10;
        int read = sequentialSource.read(this.binCharTestArr, 0, 10);
        boolean z10 = true;
        if (read > 0) {
            int i11 = -1;
            int i12 = -1;
            for (int i13 = 0; i13 < read; i13++) {
                byte b10 = this.binCharTestArr[i13];
                if ((b10 != 0 && b10 < 9) || (b10 > 10 && b10 < 32 && b10 != 13)) {
                    z10 = false;
                    break;
                }
                if (i11 == -1 && b10 != 0 && b10 != 9 && b10 != 32 && b10 != 10 && b10 != 13) {
                    i11 = i13;
                } else if (i11 != -1 && i12 == -1 && (b10 == 0 || b10 == 9 || b10 == 32 || b10 == 10 || b10 == 13)) {
                    i12 = i13;
                }
            }
            if (i12 != -1 && i11 != -1) {
                String str = new String(this.binCharTestArr, i11, i12 - i11);
                if (!OperatorName.RESTORE.equals(str) && !OperatorName.END_MARKED_CONTENT.equals(str) && !"S".equals(str)) {
                    z10 = false;
                }
            }
            if (read == 10) {
                if (i11 == -1 || i12 != -1) {
                    i10 = i12;
                }
                if (i10 != -1 && i11 != -1 && i10 - i11 > 3) {
                    z10 = false;
                }
            }
            sequentialSource.unread(this.binCharTestArr, 0, read);
        }
        if (!z10) {
            sequentialSource.getPosition();
        }
        return z10;
    }

    private boolean isSpaceOrReturn(int i10) {
        if (i10 != 10 && i10 != 13 && i10 != 32) {
            return false;
        }
        return true;
    }

    public List<Object> getTokens() {
        return this.streamObjects;
    }

    public void parse() {
        while (true) {
            Object parseNextToken = parseNextToken();
            if (parseNextToken != null) {
                this.streamObjects.add(parseNextToken);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01ec  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x01cb -> B:107:0x01cd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object parseNextToken() {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdfparser.PDFStreamParser.parseNextToken():java.lang.Object");
    }

    public String readOperator() {
        skipSpaces();
        StringBuilder sb2 = new StringBuilder(4);
        int peek = this.seqSource.peek();
        while (peek != -1 && !isWhitespace(peek) && !isClosing(peek) && peek != 91 && peek != 60 && peek != 40 && peek != 47 && (peek < 48 || peek > 57)) {
            char read = (char) this.seqSource.read();
            int peek2 = this.seqSource.peek();
            sb2.append(read);
            if (read == 'd' && (peek2 == 48 || peek2 == 49)) {
                sb2.append((char) this.seqSource.read());
                peek = this.seqSource.peek();
            } else {
                peek = peek2;
            }
        }
        return sb2.toString();
    }

    @Deprecated
    public PDFStreamParser(COSStream cOSStream) {
        super(new InputStreamSource(cOSStream.createInputStream()));
        this.streamObjects = new ArrayList(100);
        this.binCharTestArr = new byte[10];
    }

    public PDFStreamParser(PDContentStream pDContentStream) {
        super(new InputStreamSource(pDContentStream.getContents()));
        this.streamObjects = new ArrayList(100);
        this.binCharTestArr = new byte[10];
    }

    public PDFStreamParser(byte[] bArr) {
        super(new RandomAccessSource(new RandomAccessBuffer(bArr)));
        this.streamObjects = new ArrayList(100);
        this.binCharTestArr = new byte[10];
    }
}
