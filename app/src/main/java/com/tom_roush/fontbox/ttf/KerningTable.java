package com.tom_roush.fontbox.ttf;

/* loaded from: classes2.dex */
public class KerningTable extends TTFTable {
    public static final String TAG = "kern";
    private KerningSubtable[] subtables;

    public KerningTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
    }

    public KerningSubtable getHorizontalKerningSubtable() {
        return getHorizontalKerningSubtable(false);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    public void read(TrueTypeFont trueTypeFont, TTFDataStream tTFDataStream) {
        int i10;
        int readUnsignedShort = tTFDataStream.readUnsignedShort();
        if (readUnsignedShort != 0) {
            readUnsignedShort = (readUnsignedShort << 16) | tTFDataStream.readUnsignedShort();
        }
        if (readUnsignedShort == 0) {
            i10 = tTFDataStream.readUnsignedShort();
        } else if (readUnsignedShort == 1) {
            i10 = (int) tTFDataStream.readUnsignedInt();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            this.subtables = new KerningSubtable[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                KerningSubtable kerningSubtable = new KerningSubtable();
                kerningSubtable.read(tTFDataStream, readUnsignedShort);
                this.subtables[i11] = kerningSubtable;
            }
        }
        this.initialized = true;
    }

    public KerningSubtable getHorizontalKerningSubtable(boolean z10) {
        KerningSubtable[] kerningSubtableArr = this.subtables;
        if (kerningSubtableArr != null) {
            for (KerningSubtable kerningSubtable : kerningSubtableArr) {
                if (kerningSubtable.isHorizontalKerning(z10)) {
                    return kerningSubtable;
                }
            }
            return null;
        }
        return null;
    }
}
