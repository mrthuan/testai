package lib.zj.office.fc.hssf.record.cont;

import lib.zj.office.fc.util.DelayableLittleEndianOutput;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class ContinuableRecordOutput implements LittleEndianOutput {
    private static final LittleEndianOutput NOPOutput = new DelayableLittleEndianOutput() { // from class: lib.zj.office.fc.hssf.record.cont.ContinuableRecordOutput.1
        @Override // lib.zj.office.fc.util.LittleEndianOutput
        public void write(byte[] bArr) {
        }

        @Override // lib.zj.office.fc.util.LittleEndianOutput
        public void write(byte[] bArr, int i10, int i11) {
        }

        @Override // lib.zj.office.fc.util.DelayableLittleEndianOutput
        public LittleEndianOutput createDelayedOutput(int i10) {
            return this;
        }

        @Override // lib.zj.office.fc.util.LittleEndianOutput
        public void writeByte(int i10) {
        }

        @Override // lib.zj.office.fc.util.LittleEndianOutput
        public void writeDouble(double d10) {
        }

        @Override // lib.zj.office.fc.util.LittleEndianOutput
        public void writeInt(int i10) {
        }

        @Override // lib.zj.office.fc.util.LittleEndianOutput
        public void writeLong(long j10) {
        }

        @Override // lib.zj.office.fc.util.LittleEndianOutput
        public void writeShort(int i10) {
        }
    };
    private final LittleEndianOutput _out;
    private int _totalPreviousRecordsSize = 0;
    private UnknownLengthRecordOutput _ulrOutput;

    public ContinuableRecordOutput(LittleEndianOutput littleEndianOutput, int i10) {
        this._ulrOutput = new UnknownLengthRecordOutput(littleEndianOutput, i10);
        this._out = littleEndianOutput;
    }

    public static ContinuableRecordOutput createForCountingOnly() {
        return new ContinuableRecordOutput(NOPOutput, -777);
    }

    private void writeCharacterData(String str, boolean z10) {
        int length = str.length();
        int i10 = 0;
        if (z10) {
            while (true) {
                int min = Math.min(length - i10, this._ulrOutput.getAvailableSpace() / 2);
                while (min > 0) {
                    this._ulrOutput.writeShort(str.charAt(i10));
                    min--;
                    i10++;
                }
                if (i10 < length) {
                    writeContinue();
                    writeByte(1);
                } else {
                    return;
                }
            }
        } else {
            int i11 = 0;
            while (true) {
                int min2 = Math.min(length - i11, this._ulrOutput.getAvailableSpace() / 1);
                while (min2 > 0) {
                    this._ulrOutput.writeByte(str.charAt(i11));
                    min2--;
                    i11++;
                }
                if (i11 >= length) {
                    return;
                }
                writeContinue();
                writeByte(0);
            }
        }
    }

    public int getAvailableSpace() {
        return this._ulrOutput.getAvailableSpace();
    }

    public int getTotalSize() {
        return this._totalPreviousRecordsSize + this._ulrOutput.getTotalSize();
    }

    public void terminate() {
        this._ulrOutput.terminate();
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void write(byte[] bArr) {
        writeContinueIfRequired(bArr.length);
        this._ulrOutput.write(bArr);
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void writeByte(int i10) {
        writeContinueIfRequired(1);
        this._ulrOutput.writeByte(i10);
    }

    public void writeContinue() {
        this._ulrOutput.terminate();
        this._totalPreviousRecordsSize += this._ulrOutput.getTotalSize();
        this._ulrOutput = new UnknownLengthRecordOutput(this._out, 60);
    }

    public void writeContinueIfRequired(int i10) {
        if (this._ulrOutput.getAvailableSpace() < i10) {
            writeContinue();
        }
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void writeDouble(double d10) {
        writeContinueIfRequired(8);
        this._ulrOutput.writeDouble(d10);
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void writeInt(int i10) {
        writeContinueIfRequired(4);
        this._ulrOutput.writeInt(i10);
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void writeLong(long j10) {
        writeContinueIfRequired(8);
        this._ulrOutput.writeLong(j10);
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void writeShort(int i10) {
        writeContinueIfRequired(2);
        this._ulrOutput.writeShort(i10);
    }

    public void writeString(String str, int i10, int i11) {
        int i12;
        int i13;
        boolean hasMultibyte = StringUtil.hasMultibyte(str);
        if (hasMultibyte) {
            i13 = 1;
            i12 = 5;
        } else {
            i12 = 4;
            i13 = 0;
        }
        if (i10 > 0) {
            i13 |= 8;
            i12 += 2;
        }
        if (i11 > 0) {
            i13 |= 4;
            i12 += 4;
        }
        writeContinueIfRequired(i12);
        writeShort(str.length());
        writeByte(i13);
        if (i10 > 0) {
            writeShort(i10);
        }
        if (i11 > 0) {
            writeInt(i11);
        }
        writeCharacterData(str, hasMultibyte);
    }

    public void writeStringData(String str) {
        int i10;
        int i11;
        boolean hasMultibyte = StringUtil.hasMultibyte(str);
        if (hasMultibyte) {
            i11 = 1;
            i10 = 3;
        } else {
            i10 = 2;
            i11 = 0;
        }
        writeContinueIfRequired(i10);
        writeByte(i11);
        writeCharacterData(str, hasMultibyte);
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void write(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (true) {
            int min = Math.min(i11 - i12, this._ulrOutput.getAvailableSpace() / 1);
            while (min > 0) {
                this._ulrOutput.writeByte(bArr[i12 + i10]);
                min--;
                i12++;
            }
            if (i12 >= i11) {
                return;
            }
            writeContinue();
        }
    }
}
