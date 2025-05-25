package lib.zj.office.fc.codec;

/* loaded from: classes3.dex */
public abstract class BaseNCodec implements BinaryEncoder, BinaryDecoder {
    private static final int DEFAULT_BUFFER_RESIZE_FACTOR = 2;
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    protected static final int MASK_8BITS = 255;
    public static final int MIME_CHUNK_SIZE = 76;
    protected static final byte PAD_DEFAULT = 61;
    public static final int PEM_CHUNK_SIZE = 64;
    protected final byte PAD = 61;
    protected byte[] buffer;
    private final int chunkSeparatorLength;
    protected int currentLinePos;
    private final int encodedBlockSize;
    protected boolean eof;
    protected final int lineLength;
    protected int modulus;
    protected int pos;
    private int readPos;
    private final int unencodedBlockSize;

    public BaseNCodec(int i10, int i11, int i12, int i13) {
        int i14;
        this.unencodedBlockSize = i10;
        this.encodedBlockSize = i11;
        if (i12 > 0 && i13 > 0) {
            i14 = (i12 / i11) * i11;
        } else {
            i14 = 0;
        }
        this.lineLength = i14;
        this.chunkSeparatorLength = i13;
    }

    public static boolean isWhiteSpace(byte b10) {
        if (b10 != 9 && b10 != 10 && b10 != 13 && b10 != 32) {
            return false;
        }
        return true;
    }

    private void reset() {
        this.buffer = null;
        this.pos = 0;
        this.readPos = 0;
        this.currentLinePos = 0;
        this.modulus = 0;
        this.eof = false;
    }

    private void resizeBuffer() {
        byte[] bArr = this.buffer;
        if (bArr == null) {
            this.buffer = new byte[getDefaultBufferSize()];
            this.pos = 0;
            this.readPos = 0;
            return;
        }
        byte[] bArr2 = new byte[bArr.length * 2];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.buffer = bArr2;
    }

    public int available() {
        if (this.buffer != null) {
            return this.pos - this.readPos;
        }
        return 0;
    }

    public boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b10 : bArr) {
            if (61 == b10 || isInAlphabet(b10)) {
                return true;
            }
        }
        return false;
    }

    @Override // lib.zj.office.fc.codec.Decoder
    public Object decode(Object obj) {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    public abstract void decode(byte[] bArr, int i10, int i11);

    @Override // lib.zj.office.fc.codec.Encoder
    public Object encode(Object obj) {
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new EncoderException("Parameter supplied to Base-N encode is not a byte[]");
    }

    public abstract void encode(byte[] bArr, int i10, int i11);

    public String encodeAsString(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public String encodeToString(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public void ensureBufferSize(int i10) {
        byte[] bArr = this.buffer;
        if (bArr == null || bArr.length < this.pos + i10) {
            resizeBuffer();
        }
    }

    public int getDefaultBufferSize() {
        return 8192;
    }

    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.unencodedBlockSize;
        long j10 = (((length + i10) - 1) / i10) * this.encodedBlockSize;
        int i11 = this.lineLength;
        if (i11 > 0) {
            return j10 + ((((i11 + j10) - 1) / i11) * this.chunkSeparatorLength);
        }
        return j10;
    }

    public boolean hasData() {
        if (this.buffer != null) {
            return true;
        }
        return false;
    }

    public abstract boolean isInAlphabet(byte b10);

    public boolean isInAlphabet(byte[] bArr, boolean z10) {
        byte b10;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (!isInAlphabet(bArr[i10]) && (!z10 || ((b10 = bArr[i10]) != 61 && !isWhiteSpace(b10)))) {
                return false;
            }
        }
        return true;
    }

    public int readResults(byte[] bArr, int i10, int i11) {
        if (this.buffer != null) {
            int min = Math.min(available(), i11);
            System.arraycopy(this.buffer, this.readPos, bArr, i10, min);
            int i12 = this.readPos + min;
            this.readPos = i12;
            if (i12 >= this.pos) {
                this.buffer = null;
            }
            return min;
        } else if (this.eof) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override // lib.zj.office.fc.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        reset();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        encode(bArr, 0, bArr.length);
        encode(bArr, 0, -1);
        int i10 = this.pos - this.readPos;
        byte[] bArr2 = new byte[i10];
        readResults(bArr2, 0, i10);
        return bArr2;
    }

    public boolean isInAlphabet(String str) {
        return isInAlphabet(StringUtils.getBytesUtf8(str), true);
    }

    public byte[] decode(String str) {
        return decode(StringUtils.getBytesUtf8(str));
    }

    @Override // lib.zj.office.fc.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        reset();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        decode(bArr, 0, bArr.length);
        decode(bArr, 0, -1);
        int i10 = this.pos;
        byte[] bArr2 = new byte[i10];
        readResults(bArr2, 0, i10);
        return bArr2;
    }
}
