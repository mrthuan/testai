package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class Slide extends SheetContainer {
    private static long _type = 1006;
    private ColorSchemeAtom _colorScheme;
    private byte[] _header;
    private HeadersFootersContainer headersFootersContainer;
    private PPDrawing ppDrawing;
    private SlideProgTagsContainer propTagsContainer;
    private SlideAtom slideAtom;
    private SlideShowSlideInfoAtom ssSlideInfoAtom;

    public Slide(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        int i12 = 0;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._children = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
        while (true) {
            Record[] recordArr = this._children;
            if (i12 >= recordArr.length) {
                return;
            }
            Record record = recordArr[i12];
            if (record instanceof SlideAtom) {
                this.slideAtom = (SlideAtom) record;
            } else if (record instanceof PPDrawing) {
                this.ppDrawing = (PPDrawing) record;
            } else if (record instanceof SlideShowSlideInfoAtom) {
                this.ssSlideInfoAtom = (SlideShowSlideInfoAtom) record;
            } else if (record instanceof SlideProgTagsContainer) {
                this.propTagsContainer = (SlideProgTagsContainer) record;
            } else if (record instanceof HeadersFootersContainer) {
                this.headersFootersContainer = (HeadersFootersContainer) record;
            }
            if (this.ppDrawing != null && (record instanceof ColorSchemeAtom)) {
                this._colorScheme = (ColorSchemeAtom) record;
            }
            i12++;
        }
    }

    @Override // lib.zj.office.fc.hslf.record.RecordContainer, lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        super.dispose();
        SlideAtom slideAtom = this.slideAtom;
        if (slideAtom != null) {
            slideAtom.dispose();
        }
        PPDrawing pPDrawing = this.ppDrawing;
        if (pPDrawing != null) {
            pPDrawing.dispose();
        }
        ColorSchemeAtom colorSchemeAtom = this._colorScheme;
        if (colorSchemeAtom != null) {
            colorSchemeAtom.dispose();
        }
        SlideShowSlideInfoAtom slideShowSlideInfoAtom = this.ssSlideInfoAtom;
        if (slideShowSlideInfoAtom != null) {
            slideShowSlideInfoAtom.dispose();
        }
        SlideProgTagsContainer slideProgTagsContainer = this.propTagsContainer;
        if (slideProgTagsContainer != null) {
            slideProgTagsContainer.dispose();
        }
    }

    @Override // lib.zj.office.fc.hslf.record.SheetContainer
    public ColorSchemeAtom getColorScheme() {
        return this._colorScheme;
    }

    public HeadersFootersContainer getHeadersFootersContainer() {
        return this.headersFootersContainer;
    }

    @Override // lib.zj.office.fc.hslf.record.SheetContainer
    public PPDrawing getPPDrawing() {
        return this.ppDrawing;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public SlideAtom getSlideAtom() {
        return this.slideAtom;
    }

    public SlideProgTagsContainer getSlideProgTagsContainer() {
        return this.propTagsContainer;
    }

    public SlideShowSlideInfoAtom getSlideShowSlideInfoAtom() {
        return this.ssSlideInfoAtom;
    }

    public Slide() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        LittleEndian.putUShort(bArr, 0, 15);
        LittleEndian.putUShort(this._header, 2, (int) _type);
        LittleEndian.putInt(this._header, 4, 0);
        this.slideAtom = new SlideAtom();
        this.ppDrawing = new PPDrawing();
        this._children = new Record[]{this.slideAtom, this.ppDrawing, new ColorSchemeAtom()};
    }
}
