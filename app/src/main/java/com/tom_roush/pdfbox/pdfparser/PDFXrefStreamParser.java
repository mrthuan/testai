package com.tom_roush.pdfbox.pdfparser;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObjectKey;
import com.tom_roush.pdfbox.cos.COSStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class PDFXrefStreamParser extends BaseParser {
    private ObjectNumbers objectNumbers;

    /* renamed from: w  reason: collision with root package name */
    private final int[] f15987w;
    private final XrefTrailerResolver xrefTrailerResolver;

    /* loaded from: classes2.dex */
    public static class ObjectNumbers implements Iterator<Long> {
        private long currentEnd;
        private long currentNumber;
        private int currentRange;
        private final long[] end;
        private long maxValue;
        private final long[] start;

        public /* synthetic */ ObjectNumbers(COSArray cOSArray, int i10) {
            this(cOSArray);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.currentNumber < this.maxValue) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private ObjectNumbers(COSArray cOSArray) {
            this.currentRange = 0;
            this.currentEnd = 0L;
            this.currentNumber = 0L;
            this.maxValue = 0L;
            long[] jArr = new long[cOSArray.size() / 2];
            this.start = jArr;
            this.end = new long[jArr.length];
            Iterator<COSBase> it = cOSArray.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                COSBase next = it.next();
                if (next instanceof COSInteger) {
                    long longValue = ((COSInteger) next).longValue();
                    if (!it.hasNext()) {
                        break;
                    }
                    COSBase next2 = it.next();
                    if (next2 instanceof COSInteger) {
                        long longValue2 = ((COSInteger) next2).longValue();
                        this.start[i10] = longValue;
                        this.end[i10] = longValue + longValue2;
                        i10++;
                    } else {
                        throw new IOException("Xref stream must have integer in /Index array");
                    }
                } else {
                    throw new IOException("Xref stream must have integer in /Index array");
                }
            }
            this.currentNumber = this.start[0];
            long[] jArr2 = this.end;
            this.currentEnd = jArr2[0];
            this.maxValue = jArr2[i10 - 1];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Long next() {
            long j10 = this.currentNumber;
            if (j10 < this.maxValue) {
                if (j10 < this.currentEnd) {
                    this.currentNumber = 1 + j10;
                    return Long.valueOf(j10);
                }
                long[] jArr = this.start;
                int i10 = this.currentRange + 1;
                this.currentRange = i10;
                long j11 = jArr[i10];
                this.currentEnd = this.end[i10];
                this.currentNumber = 1 + j11;
                return Long.valueOf(j11);
            }
            throw new NoSuchElementException();
        }
    }

    public PDFXrefStreamParser(COSStream cOSStream, COSDocument cOSDocument, XrefTrailerResolver xrefTrailerResolver) {
        super(new InputStreamSource(cOSStream.createInputStream()));
        this.f15987w = new int[3];
        this.objectNumbers = null;
        this.document = cOSDocument;
        this.xrefTrailerResolver = xrefTrailerResolver;
        try {
            initParserValues(cOSStream);
        } catch (IOException unused) {
            close();
        }
    }

    private void close() {
        SequentialSource sequentialSource = this.seqSource;
        if (sequentialSource != null) {
            sequentialSource.close();
        }
        this.document = null;
    }

    private void initParserValues(COSStream cOSStream) {
        COSArray cOSArray = cOSStream.getCOSArray(COSName.W);
        if (cOSArray != null) {
            if (cOSArray.size() == 3) {
                for (int i10 = 0; i10 < 3; i10++) {
                    this.f15987w[i10] = cOSArray.getInt(i10, 0);
                }
                int[] iArr = this.f15987w;
                if (iArr[0] >= 0 && iArr[1] >= 0 && iArr[2] >= 0) {
                    COSArray cOSArray2 = cOSStream.getCOSArray(COSName.INDEX);
                    if (cOSArray2 == null) {
                        cOSArray2 = new COSArray();
                        cOSArray2.add((COSBase) COSInteger.ZERO);
                        cOSArray2.add((COSBase) COSInteger.get(cOSStream.getInt(COSName.SIZE, 0)));
                    }
                    if (cOSArray2.size() % 2 != 1) {
                        this.objectNumbers = new ObjectNumbers(cOSArray2, 0);
                        return;
                    }
                    throw new IOException("Wrong number of values for /Index array in XRef: " + Arrays.toString(this.f15987w));
                }
                throw new IOException("Incorrect /W array in XRef: " + Arrays.toString(this.f15987w));
            }
            throw new IOException("Wrong number of values for /W array in XRef: " + Arrays.toString(this.f15987w));
        }
        throw new IOException("/W array is missing in Xref stream");
    }

    private long parseValue(byte[] bArr, int i10, int i11) {
        long j10 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j10 += (bArr[i12 + i10] & 255) << (((i11 - i12) - 1) * 8);
        }
        return j10;
    }

    public void parse() {
        int parseValue;
        int i10;
        int[] iArr = this.f15987w;
        byte[] bArr = new byte[iArr[0] + iArr[1] + iArr[2]];
        while (!this.seqSource.isEOF() && this.objectNumbers.hasNext()) {
            this.seqSource.read(bArr);
            long longValue = this.objectNumbers.next().longValue();
            int i11 = this.f15987w[0];
            if (i11 == 0) {
                parseValue = 1;
            } else {
                parseValue = (int) parseValue(bArr, 0, i11);
            }
            if (parseValue != 0) {
                int[] iArr2 = this.f15987w;
                long parseValue2 = parseValue(bArr, iArr2[0], iArr2[1]);
                if (parseValue == 1) {
                    int[] iArr3 = this.f15987w;
                    i10 = (int) parseValue(bArr, iArr3[0] + iArr3[1], iArr3[2]);
                } else {
                    i10 = 0;
                }
                COSObjectKey cOSObjectKey = new COSObjectKey(longValue, i10);
                if (parseValue == 1) {
                    this.xrefTrailerResolver.setXRef(cOSObjectKey, parseValue2);
                } else {
                    this.xrefTrailerResolver.setXRef(cOSObjectKey, -parseValue2);
                }
            }
        }
        close();
    }
}
