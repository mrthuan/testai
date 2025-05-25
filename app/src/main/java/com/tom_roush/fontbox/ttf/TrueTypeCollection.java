package com.tom_roush.fontbox.ttf;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class TrueTypeCollection implements Closeable {
    private final long[] fontOffsets;
    private final int numFonts;
    private final TTFDataStream stream;

    /* loaded from: classes2.dex */
    public interface TrueTypeFontProcessor {
        void process(TrueTypeFont trueTypeFont);
    }

    public TrueTypeCollection(File file) {
        this(new RAFDataStream(file, "r"));
    }

    private TrueTypeFont getFontAtIndex(int i10) {
        TTFParser tTFParser;
        this.stream.seek(this.fontOffsets[i10]);
        if (this.stream.readTag().equals("OTTO")) {
            tTFParser = new OTFParser(false, true);
        } else {
            tTFParser = new TTFParser(false, true);
        }
        this.stream.seek(this.fontOffsets[i10]);
        return tTFParser.parse(new TTCDataStream(this.stream));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.stream.close();
    }

    public TrueTypeFont getFontByName(String str) {
        for (int i10 = 0; i10 < this.numFonts; i10++) {
            TrueTypeFont fontAtIndex = getFontAtIndex(i10);
            if (fontAtIndex.getName().equals(str)) {
                return fontAtIndex;
            }
        }
        return null;
    }

    public void processAllFonts(TrueTypeFontProcessor trueTypeFontProcessor) {
        for (int i10 = 0; i10 < this.numFonts; i10++) {
            trueTypeFontProcessor.process(getFontAtIndex(i10));
        }
    }

    public TrueTypeCollection(InputStream inputStream) {
        this(new MemoryTTFDataStream(inputStream));
    }

    public TrueTypeCollection(TTFDataStream tTFDataStream) {
        this.stream = tTFDataStream;
        if (tTFDataStream.readTag().equals("ttcf")) {
            float read32Fixed = tTFDataStream.read32Fixed();
            int readUnsignedInt = (int) tTFDataStream.readUnsignedInt();
            this.numFonts = readUnsignedInt;
            this.fontOffsets = new long[readUnsignedInt];
            for (int i10 = 0; i10 < this.numFonts; i10++) {
                this.fontOffsets[i10] = tTFDataStream.readUnsignedInt();
            }
            if (read32Fixed >= 2.0f) {
                tTFDataStream.readUnsignedShort();
                tTFDataStream.readUnsignedShort();
                tTFDataStream.readUnsignedShort();
                return;
            }
            return;
        }
        throw new IOException("Missing TTC header");
    }
}
