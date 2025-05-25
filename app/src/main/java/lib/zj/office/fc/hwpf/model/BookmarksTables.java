package lib.zj.office.fc.hwpf.model;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.model.io.HWPFOutputStream;
import lib.zj.office.fc.hwpf.model.types.BKFAbstractType;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public class BookmarksTables {
    private PlexOfCps descriptorsFirst = new PlexOfCps(4);
    private PlexOfCps descriptorsLim = new PlexOfCps(0);
    private String[] names = new String[0];

    public BookmarksTables(byte[] bArr, FileInformationBlock fileInformationBlock) {
        read(bArr, fileInformationBlock);
    }

    private void read(byte[] bArr, FileInformationBlock fileInformationBlock) {
        int fcSttbfbkmk = fileInformationBlock.getFcSttbfbkmk();
        int lcbSttbfbkmk = fileInformationBlock.getLcbSttbfbkmk();
        if (fcSttbfbkmk != 0 && lcbSttbfbkmk != 0) {
            this.names = SttbfUtils.read(bArr, fcSttbfbkmk);
        }
        int fcPlcfbkf = fileInformationBlock.getFcPlcfbkf();
        int lcbPlcfbkf = fileInformationBlock.getLcbPlcfbkf();
        if (fcPlcfbkf != 0 && lcbPlcfbkf != 0) {
            this.descriptorsFirst = new PlexOfCps(bArr, fcPlcfbkf, lcbPlcfbkf, BKFAbstractType.getSize());
        }
        int fcPlcfbkl = fileInformationBlock.getFcPlcfbkl();
        int lcbPlcfbkl = fileInformationBlock.getLcbPlcfbkl();
        if (fcPlcfbkl != 0 && lcbPlcfbkl != 0) {
            this.descriptorsLim = new PlexOfCps(bArr, fcPlcfbkl, lcbPlcfbkl, 0);
        }
    }

    public int getBookmarksCount() {
        return this.descriptorsFirst.length();
    }

    public GenericPropertyNode getDescriptorFirst(int i10) {
        return this.descriptorsFirst.getProperty(i10);
    }

    public int getDescriptorFirstIndex(GenericPropertyNode genericPropertyNode) {
        return Arrays.asList(this.descriptorsFirst.toPropertiesArray()).indexOf(genericPropertyNode);
    }

    public GenericPropertyNode getDescriptorLim(int i10) {
        return this.descriptorsLim.getProperty(i10);
    }

    public int getDescriptorsFirstCount() {
        return this.descriptorsFirst.length();
    }

    public int getDescriptorsLimCount() {
        return this.descriptorsLim.length();
    }

    public String getName(int i10) {
        return this.names[i10];
    }

    public int getNamesCount() {
        return this.names.length;
    }

    public void setName(int i10, String str) {
        String[] strArr = this.names;
        if (i10 < strArr.length) {
            String[] strArr2 = new String[i10 + 1];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            this.names = strArr2;
        }
        this.names[i10] = str;
    }

    public void writePlcfBkmkf(FileInformationBlock fileInformationBlock, HWPFOutputStream hWPFOutputStream) {
        PlexOfCps plexOfCps = this.descriptorsFirst;
        if (plexOfCps != null && plexOfCps.length() != 0) {
            int offset = hWPFOutputStream.getOffset();
            hWPFOutputStream.write(this.descriptorsFirst.toByteArray());
            int offset2 = hWPFOutputStream.getOffset();
            fileInformationBlock.setFcPlcfbkf(offset);
            fileInformationBlock.setLcbPlcfbkf(offset2 - offset);
            return;
        }
        fileInformationBlock.setFcPlcfbkf(0);
        fileInformationBlock.setLcbPlcfbkf(0);
    }

    public void writePlcfBkmkl(FileInformationBlock fileInformationBlock, HWPFOutputStream hWPFOutputStream) {
        PlexOfCps plexOfCps = this.descriptorsLim;
        if (plexOfCps != null && plexOfCps.length() != 0) {
            int offset = hWPFOutputStream.getOffset();
            hWPFOutputStream.write(this.descriptorsLim.toByteArray());
            int offset2 = hWPFOutputStream.getOffset();
            fileInformationBlock.setFcPlcfbkl(offset);
            fileInformationBlock.setLcbPlcfbkl(offset2 - offset);
            return;
        }
        fileInformationBlock.setFcPlcfbkl(0);
        fileInformationBlock.setLcbPlcfbkl(0);
    }

    public void writeSttbfBkmk(FileInformationBlock fileInformationBlock, HWPFOutputStream hWPFOutputStream) {
        String[] strArr = this.names;
        if (strArr != null && strArr.length != 0) {
            int offset = hWPFOutputStream.getOffset();
            SttbfUtils.write(hWPFOutputStream, this.names);
            int offset2 = hWPFOutputStream.getOffset();
            fileInformationBlock.setFcSttbfbkmk(offset);
            fileInformationBlock.setLcbSttbfbkmk(offset2 - offset);
            return;
        }
        fileInformationBlock.setFcSttbfbkmk(0);
        fileInformationBlock.setLcbSttbfbkmk(0);
    }
}
