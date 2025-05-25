package com.tom_roush.pdfbox.filter;

import androidx.appcompat.view.menu.d;
import b.a;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hssf.record.BookBoolRecord;
import lib.zj.office.fc.hssf.record.DBCellRecord;
import lib.zj.office.fc.hssf.record.pivottable.StreamIDRecord;

/* loaded from: classes2.dex */
final class CCITTFaxDecoderStream extends FilterInputStream {
    static final Node EOL;
    static final Node FILL;
    static final int VALUE_EOL = -2000;
    static final int VALUE_FILL = -1000;
    static final int VALUE_HMODE = -4000;
    static final int VALUE_PASSMODE = -3000;
    static final Tree blackRunTree;
    static final Tree codeTree;
    static final Tree eolOnlyTree;
    static final Tree whiteRunTree;
    int buffer;
    int bufferPos;
    private int[] changesCurrentRow;
    private int changesCurrentRowCount;
    private int[] changesReferenceRow;
    private int changesReferenceRowCount;
    private final int columns;
    private int decodedLength;
    private int decodedPos;
    private final byte[] decodedRow;
    private final int fillOrder;
    private int lastChangingElement;
    private final boolean optionByteAligned;
    private final boolean optionG32D;
    private final boolean optionG3Fill;
    private final boolean optionUncompressed;
    private final int type;
    static final short[][] BLACK_CODES = {new short[]{2, 3}, new short[]{2, 3}, new short[]{2, 3}, new short[]{3}, new short[]{4, 5}, new short[]{4, 5, 7}, new short[]{4, 7}, new short[]{24}, new short[]{23, 24, 55, 8, 15}, new short[]{23, 24, 40, 55, 103, 104, 108, 8, 12, 13}, new short[]{18, 19, 20, 21, 22, 23, 28, 29, 30, 31, 36, 39, 40, 43, 44, 51, 52, 53, 55, 56, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 200, 201, 202, 203, 204, 205, 210, 211, 212, StreamIDRecord.sid, 214, DBCellRecord.sid, BookBoolRecord.sid, 219}, new short[]{74, 75, 76, 77, 82, 83, 84, 85, 90, 91, 100, 101, 108, 109, 114, 115, 116, 117, 118, EscherProperties.PROTECTION__LOCKROTATION}};
    static final short[][] BLACK_RUN_LENGTHS = {new short[]{3, 2}, new short[]{1, 4}, new short[]{6, 5}, new short[]{7}, new short[]{9, 8}, new short[]{10, 11, 12}, new short[]{13, 14}, new short[]{15}, new short[]{16, 17, 0, 18, 64}, new short[]{24, 25, 23, 22, 19, 20, 21, 1792, 1856, 1920}, new short[]{1984, 2048, 2112, 2176, 2240, 2304, 2368, 2432, 2496, 2560, 52, 55, 56, 59, 60, EscherProperties.GEOMETRY__LEFT, EscherProperties.FILL__FILLTYPE, EscherProperties.LINESTYLE__COLOR, 53, 54, 50, 51, 44, 45, 46, 47, 57, 58, 61, 256, 48, 49, 62, 63, 30, 31, 32, 33, 40, 41, 128, EscherProperties.GEOTEXT__UNICODE, 26, 27, 28, 29, 34, 35, 36, 37, 38, 39, 42, 43}, new short[]{EscherProperties.THREED__SPECULARAMOUNT, EscherProperties.THREEDSTYLE__YROTATIONANGLE, 768, EscherProperties.CALLOUT__CALLOUTTYPE, 1280, 1344, 1408, 1472, 1536, 1600, 1664, 1728, 512, EscherProperties.PERSPECTIVE__TYPE, EscherProperties.GROUPSHAPE__SHAPENAME, 960, 1024, 1088, 1152, 1216}};
    public static final short[][] WHITE_CODES = {new short[]{7, 8, 11, 12, 14, 15}, new short[]{18, 19, 20, 27, 7, 8}, new short[]{23, 24, 42, 43, 3, 52, 53, 7, 8}, new short[]{19, 23, 24, 36, 39, 40, 43, 3, 55, 4, 8, 12}, new short[]{18, 19, 20, 21, 22, 23, 26, 27, 2, 36, 37, 40, 41, 42, 43, 44, 45, 3, 50, 51, 52, 53, 54, 55, 4, 74, 75, 5, 82, 83, 84, 85, 88, 89, 90, 91, 100, 101, 103, 104, 10, 11}, new short[]{152, 153, 154, 155, 204, 205, 210, 211, 212, StreamIDRecord.sid, 214, DBCellRecord.sid, 216, 217, BookBoolRecord.sid, 219}, new short[0], new short[]{8, 12, 13}, new short[]{18, 19, 20, 21, 22, 23, 28, 29, 30, 31}};
    public static final short[][] WHITE_RUN_LENGTHS = {new short[]{2, 3, 4, 5, 6, 7}, new short[]{128, 8, 9, 64, 10, 11}, new short[]{EscherProperties.GEOTEXT__UNICODE, 1664, 16, 17, 13, 14, 15, 1, 12}, new short[]{26, 21, 28, 27, 18, 24, 25, 22, 256, 23, 20, 19}, new short[]{33, 34, 35, 36, 37, 38, 31, 32, 29, 53, 54, 39, 40, 41, 42, 43, 44, 30, 61, 62, 63, 0, EscherProperties.GEOMETRY__LEFT, EscherProperties.FILL__FILLTYPE, 45, 59, 60, 46, 49, 50, 51, 52, 55, 56, 57, 58, EscherProperties.LINESTYLE__COLOR, 512, EscherProperties.THREED__SPECULARAMOUNT, EscherProperties.PERSPECTIVE__TYPE, 47, 48}, new short[]{1472, 1536, 1600, 1728, EscherProperties.THREEDSTYLE__YROTATIONANGLE, 768, EscherProperties.CALLOUT__CALLOUTTYPE, EscherProperties.GROUPSHAPE__SHAPENAME, 960, 1024, 1088, 1152, 1216, 1280, 1344, 1408}, new short[0], new short[]{1792, 1856, 1920}, new short[]{1984, 2048, 2112, 2176, 2240, 2304, 2368, 2432, 2496, 2560}};

    /* loaded from: classes2.dex */
    public static final class Node {
        boolean canBeFill;
        boolean isLeaf;
        Node left;
        Node right;
        int value;

        public /* synthetic */ Node(int i10) {
            this();
        }

        public void set(boolean z10, Node node) {
            if (!z10) {
                this.left = node;
            } else {
                this.right = node;
            }
        }

        public String toString() {
            return "[leaf=" + this.isLeaf + ", value=" + this.value + ", canBeFill=" + this.canBeFill + "]";
        }

        public Node walk(boolean z10) {
            if (z10) {
                return this.right;
            }
            return this.left;
        }

        private Node() {
            this.canBeFill = false;
            this.isLeaf = false;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Tree {
        final Node root;

        public /* synthetic */ Tree(int i10) {
            this();
        }

        public void fill(int i10, int i11, int i12) {
            Node node = this.root;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i10 - 1;
                boolean z10 = ((i11 >> (i14 - i13)) & 1) == 1;
                Node walk = node.walk(z10);
                if (walk == null) {
                    walk = new Node(0);
                    if (i13 == i14) {
                        walk.value = i12;
                        walk.isLeaf = true;
                    }
                    if (i11 == 0) {
                        walk.canBeFill = true;
                    }
                    node.set(z10, walk);
                } else if (walk.isLeaf) {
                    throw new IOException("node is leaf, no other following");
                }
                node = walk;
            }
        }

        private Tree() {
            this.root = new Node(0);
        }

        public void fill(int i10, int i11, Node node) {
            Node node2 = this.root;
            int i12 = 0;
            while (i12 < i10) {
                int i13 = i10 - 1;
                boolean z10 = ((i11 >> (i13 - i12)) & 1) == 1;
                Node walk = node2.walk(z10);
                if (walk == null) {
                    Node node3 = i12 == i13 ? node : new Node(0);
                    if (i11 == 0) {
                        node3.canBeFill = true;
                    }
                    node2.set(z10, node3);
                    node2 = node3;
                } else if (walk.isLeaf) {
                    throw new IOException("node is leaf, no other following");
                } else {
                    node2 = walk;
                }
                i12++;
            }
        }
    }

    static {
        Node node = new Node(0);
        EOL = node;
        node.isLeaf = true;
        node.value = VALUE_EOL;
        Node node2 = new Node(0);
        FILL = node2;
        node2.value = VALUE_FILL;
        node2.left = node2;
        node2.right = node;
        Tree tree = new Tree(0);
        eolOnlyTree = tree;
        try {
            tree.fill(12, 0, node2);
            tree.fill(12, 1, node);
            blackRunTree = new Tree(0);
            for (int i10 = 0; i10 < BLACK_CODES.length; i10++) {
                try {
                    int i11 = 0;
                    while (true) {
                        short[] sArr = BLACK_CODES[i10];
                        if (i11 < sArr.length) {
                            blackRunTree.fill(i10 + 2, sArr[i11], BLACK_RUN_LENGTHS[i10][i11]);
                            i11++;
                        }
                    }
                } catch (IOException e10) {
                    throw new AssertionError(e10);
                }
            }
            Tree tree2 = blackRunTree;
            tree2.fill(12, 0, FILL);
            tree2.fill(12, 1, EOL);
            whiteRunTree = new Tree(0);
            for (int i12 = 0; i12 < WHITE_CODES.length; i12++) {
                try {
                    int i13 = 0;
                    while (true) {
                        short[] sArr2 = WHITE_CODES[i12];
                        if (i13 < sArr2.length) {
                            whiteRunTree.fill(i12 + 4, sArr2[i13], WHITE_RUN_LENGTHS[i12][i13]);
                            i13++;
                        }
                    }
                } catch (IOException e11) {
                    throw new AssertionError(e11);
                }
            }
            Tree tree3 = whiteRunTree;
            tree3.fill(12, 0, FILL);
            tree3.fill(12, 1, EOL);
            Tree tree4 = new Tree(0);
            codeTree = tree4;
            try {
                tree4.fill(4, 1, VALUE_PASSMODE);
                tree4.fill(3, 1, VALUE_HMODE);
                tree4.fill(1, 1, 0);
                tree4.fill(3, 3, 1);
                tree4.fill(6, 3, 2);
                tree4.fill(7, 3, 3);
                tree4.fill(3, 2, -1);
                tree4.fill(6, 2, -2);
                tree4.fill(7, 2, -3);
            } catch (IOException e12) {
                throw new AssertionError(e12);
            }
        } catch (IOException e13) {
            throw new AssertionError(e13);
        }
    }

    public CCITTFaxDecoderStream(InputStream inputStream, int i10, int i11, int i12, long j10, boolean z10) {
        super(inputStream);
        this.lastChangingElement = 0;
        this.buffer = -1;
        this.bufferPos = -1;
        this.columns = i10;
        this.type = i11;
        this.fillOrder = i12;
        this.decodedRow = new byte[(i10 + 7) / 8];
        int i13 = i10 + 2;
        this.changesReferenceRow = new int[i13];
        this.changesCurrentRow = new int[i13];
        if (i11 == 2) {
            this.optionByteAligned = z10;
            this.optionG32D = false;
            this.optionG3Fill = false;
            this.optionUncompressed = false;
        } else if (i11 == 3) {
            this.optionByteAligned = z10;
            this.optionG32D = (1 & j10) != 0;
            this.optionG3Fill = (4 & j10) != 0;
            this.optionUncompressed = (j10 & 2) != 0;
        } else if (i11 == 4) {
            this.optionByteAligned = z10;
            this.optionG32D = false;
            this.optionG3Fill = false;
            this.optionUncompressed = (j10 & 2) != 0;
        } else {
            throw new IllegalArgumentException(a.c("Illegal parameter: ", i11));
        }
    }

    private void decode1D() {
        int decodeRun;
        int i10 = 0;
        this.changesCurrentRowCount = 0;
        boolean z10 = true;
        do {
            if (z10) {
                decodeRun = decodeRun(whiteRunTree);
            } else {
                decodeRun = decodeRun(blackRunTree);
            }
            i10 += decodeRun;
            int[] iArr = this.changesCurrentRow;
            int i11 = this.changesCurrentRowCount;
            this.changesCurrentRowCount = i11 + 1;
            iArr[i11] = i10;
            z10 = !z10;
        } while (i10 < this.columns);
    }

    private void decode2D() {
        int i10;
        int i11;
        Tree tree;
        Tree tree2;
        this.changesReferenceRowCount = this.changesCurrentRowCount;
        int[] iArr = this.changesCurrentRow;
        this.changesCurrentRow = this.changesReferenceRow;
        this.changesReferenceRow = iArr;
        int i12 = 0;
        this.changesCurrentRowCount = 0;
        boolean z10 = true;
        while (i12 < this.columns) {
            Node node = codeTree.root;
            while (true) {
                node = node.walk(readBit());
                if (node != null) {
                    if (node.isLeaf) {
                        int i13 = node.value;
                        if (i13 != VALUE_HMODE) {
                            if (i13 != VALUE_PASSMODE) {
                                int nextChangingElement = getNextChangingElement(i12, z10);
                                if (nextChangingElement < this.changesReferenceRowCount && nextChangingElement != -1) {
                                    i10 = this.changesReferenceRow[nextChangingElement];
                                    i11 = node.value;
                                } else {
                                    i10 = this.columns;
                                    i11 = node.value;
                                }
                                i12 = i10 + i11;
                                int[] iArr2 = this.changesCurrentRow;
                                int i14 = this.changesCurrentRowCount;
                                iArr2[i14] = i12;
                                this.changesCurrentRowCount = i14 + 1;
                                z10 = !z10;
                            } else {
                                int nextChangingElement2 = getNextChangingElement(i12, z10) + 1;
                                if (nextChangingElement2 >= this.changesReferenceRowCount) {
                                    i12 = this.columns;
                                } else {
                                    i12 = this.changesReferenceRow[nextChangingElement2];
                                }
                            }
                        } else {
                            if (z10) {
                                tree = whiteRunTree;
                            } else {
                                tree = blackRunTree;
                            }
                            int decodeRun = i12 + decodeRun(tree);
                            int[] iArr3 = this.changesCurrentRow;
                            int i15 = this.changesCurrentRowCount;
                            this.changesCurrentRowCount = i15 + 1;
                            iArr3[i15] = decodeRun;
                            if (z10) {
                                tree2 = blackRunTree;
                            } else {
                                tree2 = whiteRunTree;
                            }
                            i12 = decodeRun + decodeRun(tree2);
                            int[] iArr4 = this.changesCurrentRow;
                            int i16 = this.changesCurrentRowCount;
                            this.changesCurrentRowCount = i16 + 1;
                            iArr4[i16] = i12;
                        }
                    }
                }
            }
        }
    }

    private void decodeRow() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.type;
        if (i15 != 2) {
            if (i15 != 3) {
                if (i15 == 4) {
                    decodeRowType6();
                } else {
                    throw new IllegalArgumentException("Illegal parameter: " + this.type);
                }
            } else {
                decodeRowType4();
            }
        } else {
            decodeRowType2();
        }
        this.lastChangingElement = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z10 = true;
        while (true) {
            int i18 = this.changesCurrentRowCount;
            if (i16 > i18) {
                break;
            }
            int i19 = this.columns;
            if (i16 != i18) {
                i10 = this.changesCurrentRow[i16];
            } else {
                i10 = i19;
            }
            if (i10 <= i19) {
                i19 = i10;
            }
            int i20 = i17 / 8;
            while (true) {
                i11 = i17 % 8;
                if (i11 == 0 || i19 - i17 <= 0) {
                    break;
                }
                byte[] bArr = this.decodedRow;
                byte b10 = bArr[i20];
                if (z10) {
                    i14 = 0;
                } else {
                    i14 = 1 << (7 - i11);
                }
                bArr[i20] = (byte) (i14 | b10);
                i17++;
            }
            if (i11 == 0) {
                i20 = i17 / 8;
                if (z10) {
                    i13 = 0;
                } else {
                    i13 = FunctionEval.FunctionID.EXTERNAL_FUNC;
                }
                byte b11 = (byte) i13;
                while (i19 - i17 > 7) {
                    this.decodedRow[i20] = b11;
                    i17 += 8;
                    i20++;
                }
            }
            while (i19 - i17 > 0) {
                int i21 = i17 % 8;
                if (i21 == 0) {
                    this.decodedRow[i20] = 0;
                }
                byte[] bArr2 = this.decodedRow;
                byte b12 = bArr2[i20];
                if (z10) {
                    i12 = 0;
                } else {
                    i12 = 1 << (7 - i21);
                }
                bArr2[i20] = (byte) (i12 | b12);
                i17++;
            }
            z10 = !z10;
            i16++;
        }
        if (i17 == this.columns) {
            this.decodedLength = (i17 + 7) / 8;
            return;
        }
        StringBuilder e10 = d.e("Sum of run-lengths does not equal scan line width: ", i17, " > ");
        e10.append(this.columns);
        throw new IOException(e10.toString());
    }

    private void decodeRowType2() {
        if (this.optionByteAligned) {
            resetBuffer();
        }
        decode1D();
    }

    private void decodeRowType4() {
        if (this.optionByteAligned) {
            resetBuffer();
        }
        loop0: while (true) {
            Node node = eolOnlyTree.root;
            while (true) {
                node = node.walk(readBit());
                if (node != null) {
                    if (node.isLeaf) {
                        break loop0;
                    }
                } else {
                    break;
                }
            }
        }
        if (this.optionG32D && !readBit()) {
            decode2D();
        } else {
            decode1D();
        }
    }

    private void decodeRowType6() {
        if (this.optionByteAligned) {
            resetBuffer();
        }
        decode2D();
    }

    private int decodeRun(Tree tree) {
        Node node = tree.root;
        int i10 = 0;
        while (true) {
            node = node.walk(readBit());
            if (node != null) {
                if (node.isLeaf) {
                    int i11 = node.value;
                    i10 += i11;
                    if (i11 >= 64) {
                        node = tree.root;
                    } else if (i11 >= 0) {
                        return i10;
                    } else {
                        return this.columns;
                    }
                }
            } else {
                throw new IOException("Unknown code in Huffman RLE stream");
            }
        }
    }

    private void fetch() {
        if (this.decodedPos >= this.decodedLength) {
            this.decodedLength = 0;
            try {
                decodeRow();
            } catch (EOFException e10) {
                if (this.decodedLength == 0) {
                    this.decodedLength = -1;
                } else {
                    throw e10;
                }
            }
            this.decodedPos = 0;
        }
    }

    private int getNextChangingElement(int i10, boolean z10) {
        int i11 = (this.lastChangingElement & (-2)) + (!z10 ? 1 : 0);
        if (i11 > 2) {
            i11 -= 2;
        }
        if (i10 == 0) {
            return i11;
        }
        while (i11 < this.changesReferenceRowCount) {
            if (i10 < this.changesReferenceRow[i11]) {
                this.lastChangingElement = i11;
                return i11;
            }
            i11 += 2;
        }
        return -1;
    }

    private boolean readBit() {
        int i10 = this.bufferPos;
        boolean z10 = false;
        if (i10 < 0 || i10 > 7) {
            int read = ((FilterInputStream) this).in.read();
            this.buffer = read;
            if (read != -1) {
                this.bufferPos = 0;
            } else {
                throw new EOFException("Unexpected end of Huffman RLE stream");
            }
        }
        if (this.fillOrder != 1 ? ((this.buffer >> this.bufferPos) & 1) == 1 : ((this.buffer >> (7 - this.bufferPos)) & 1) == 1) {
            z10 = true;
        }
        int i11 = this.bufferPos + 1;
        this.bufferPos = i11;
        if (i11 > 7) {
            this.bufferPos = -1;
        }
        return z10;
    }

    private void resetBuffer() {
        this.bufferPos = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i10 = this.decodedLength;
        if (i10 < 0) {
            return 0;
        }
        if (this.decodedPos >= i10) {
            fetch();
            if (this.decodedLength < 0) {
                return 0;
            }
        }
        byte[] bArr = this.decodedRow;
        int i11 = this.decodedPos;
        this.decodedPos = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        int i10 = this.decodedLength;
        if (i10 < 0) {
            return -1L;
        }
        if (this.decodedPos >= i10) {
            fetch();
            if (this.decodedLength < 0) {
                return -1L;
            }
        }
        int min = (int) Math.min(this.decodedLength - this.decodedPos, j10);
        this.decodedPos += min;
        return min;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int i12 = this.decodedLength;
        if (i12 < 0) {
            Arrays.fill(bArr, i10, i10 + i11, (byte) 0);
            return i11;
        }
        if (this.decodedPos >= i12) {
            fetch();
            if (this.decodedLength < 0) {
                Arrays.fill(bArr, i10, i10 + i11, (byte) 0);
                return i11;
            }
        }
        int min = Math.min(this.decodedLength - this.decodedPos, i11);
        System.arraycopy(this.decodedRow, this.decodedPos, bArr, i10, min);
        this.decodedPos += min;
        return min;
    }

    public CCITTFaxDecoderStream(InputStream inputStream, int i10, int i11, int i12, long j10) {
        this(inputStream, i10, i11, i12, j10, i11 == 2);
    }
}
