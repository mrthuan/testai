package lib.zj.office.fc.hslf;

import a0.a;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import lib.zj.office.fc.fs.filesystem.CFBFileSystem;
import lib.zj.office.fc.fs.filesystem.Property;
import lib.zj.office.fc.hslf.exceptions.CorruptPowerPointFileException;
import lib.zj.office.fc.hslf.exceptions.EncryptedPowerPointFileException;
import lib.zj.office.fc.hslf.record.CurrentUserAtom;
import lib.zj.office.fc.hslf.record.ExOleObjStg;
import lib.zj.office.fc.hslf.record.PersistPtrHolder;
import lib.zj.office.fc.hslf.record.PersistRecord;
import lib.zj.office.fc.hslf.record.Record;
import lib.zj.office.fc.hslf.record.UserEditAtom;
import lib.zj.office.fc.hslf.usermodel.ObjectData;
import lib.zj.office.fc.hslf.usermodel.PictureData;
import lib.zj.office.system.f;

/* loaded from: classes3.dex */
public final class HSLFSlideShow {
    protected static final int CHECKSUM_SIZE = 16;
    private Property _docProp;
    private byte[] _docstream;
    private ObjectData[] _objects;
    private List<PictureData> _pictures;
    private Record[] _records;
    private CFBFileSystem cfbFS;
    private f control;
    private CurrentUserAtom currentUser;
    private int index = 0;

    public HSLFSlideShow(f fVar, String str) {
        this.control = fVar;
        this.cfbFS = new CFBFileSystem(new FileInputStream(str), fVar);
        readCurrentUserStream();
        readPowerPointStream();
        if (!(this.cfbFS.getPropertyRawData("EncryptedSummary") != null)) {
            buildRecords();
            readOtherStreams();
            return;
        }
        throw new EncryptedPowerPointFileException("Cannot process encrypted office files!");
    }

    private void buildRecords() {
        this._records = read((int) this.currentUser.getCurrentEditOffset());
    }

    private Record[] read(int i10) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        while (i10 != 0) {
            UserEditAtom userEditAtom = (UserEditAtom) Record.buildRecordAtOffset(this._docProp.getRecordData(i10), 0, i10);
            arrayList.add(Integer.valueOf(i10));
            int persistPointersOffset = userEditAtom.getPersistPointersOffset();
            arrayList.add(Integer.valueOf(persistPointersOffset));
            Hashtable<Integer, Integer> slideLocationsLookup = ((PersistPtrHolder) Record.buildRecordAtOffset(this._docProp.getRecordData(persistPointersOffset), 0, persistPointersOffset)).getSlideLocationsLookup();
            for (Integer num : slideLocationsLookup.keySet()) {
                Integer num2 = slideLocationsLookup.get(num);
                arrayList.add(num2);
                hashMap.put(num2, num);
            }
            i10 = userEditAtom.getLastUserEditAtomOffset();
        }
        Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[arrayList.size()]);
        Arrays.sort(numArr);
        Record[] recordArr = new Record[arrayList.size()];
        for (int i11 = 0; i11 < numArr.length; i11++) {
            Integer num3 = numArr[i11];
            Record buildRecordAtOffset = Record.buildRecordAtOffset(this._docProp.getRecordData(num3.intValue()), 0, num3.intValue());
            recordArr[i11] = buildRecordAtOffset;
            if (buildRecordAtOffset instanceof PersistRecord) {
                ((PersistRecord) buildRecordAtOffset).setPersistId(((Integer) hashMap.get(num3)).intValue());
            }
        }
        return recordArr;
    }

    private void readCurrentUserStream() {
        try {
            this.currentUser = new CurrentUserAtom(this.cfbFS);
        } catch (IOException unused) {
            this.currentUser = new CurrentUserAtom();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:19|20|(4:31|32|(2:34|(3:35|36|(1:43)(2:38|(2:41|42)(1:40))))(0)|(1:48))|50|51|52|53|54|(7:59|(2:61|(1:63)(2:66|(1:68)))(1:69)|64|65|32|(0)(0)|(0))|70|64|65|32|(0)(0)|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0121, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0122, code lost:
        r17.control.o().c().a(false, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161 A[Catch: IllegalArgumentException -> 0x0168, TRY_LEAVE, TryCatch #1 {IllegalArgumentException -> 0x0168, blocks: (B:53:0x0137, B:56:0x013c, B:58:0x0144, B:61:0x015c, B:63:0x0161, B:32:0x008f, B:52:0x0130, B:51:0x0122, B:33:0x00c4, B:35:0x00d2, B:38:0x00d9, B:40:0x00df, B:42:0x00ee, B:48:0x011d, B:43:0x00f4, B:45:0x00fe, B:46:0x0104, B:47:0x010c), top: B:74:0x013c, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void readPictures() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.hslf.HSLFSlideShow.readPictures():void");
    }

    private void readPowerPointStream() {
        this._docstream = this.cfbFS.getPropertyRawData("PowerPoint Document");
        this._docProp = this.cfbFS.getProperty("PowerPoint Document");
    }

    public int addPicture(PictureData pictureData) {
        int i10;
        if (this._pictures == null) {
            try {
                readPictures();
            } catch (IOException e10) {
                throw new CorruptPowerPointFileException(e10.getMessage());
            }
        }
        if (this._pictures.size() > 0) {
            PictureData pictureData2 = (PictureData) a.f(this._pictures, -1);
            i10 = pictureData2.getOffset() + pictureData2.getRawData().length + 8;
        } else {
            i10 = 0;
        }
        pictureData.setOffset(i10);
        this._pictures.add(pictureData);
        return i10;
    }

    public synchronized int appendRootLevelRecord(Record record) {
        int i10;
        Record[] recordArr = this._records;
        Record[] recordArr2 = new Record[recordArr.length + 1];
        i10 = -1;
        boolean z10 = false;
        for (int length = recordArr.length - 1; length >= 0; length--) {
            if (z10) {
                recordArr2[length] = this._records[length];
            } else {
                Record[] recordArr3 = this._records;
                recordArr2[length + 1] = recordArr3[length];
                if (recordArr3[length] instanceof PersistPtrHolder) {
                    recordArr2[length] = record;
                    i10 = length;
                    z10 = true;
                }
            }
        }
        this._records = recordArr2;
        return i10;
    }

    public void dispose() {
        CurrentUserAtom currentUserAtom = this.currentUser;
        if (currentUserAtom != null) {
            currentUserAtom.dispose();
        }
        Record[] recordArr = this._records;
        if (recordArr != null) {
            for (Record record : recordArr) {
                record.dispose();
            }
        }
        List<PictureData> list = this._pictures;
        if (list != null) {
            for (PictureData pictureData : list) {
                pictureData.dispose();
            }
            this._pictures.clear();
        }
        ObjectData[] objectDataArr = this._objects;
        if (objectDataArr != null) {
            for (ObjectData objectData : objectDataArr) {
                objectData.dispose();
            }
        }
        CFBFileSystem cFBFileSystem = this.cfbFS;
        if (cFBFileSystem != null) {
            cFBFileSystem.dispose();
        }
    }

    public CurrentUserAtom getCurrentUserAtom() {
        return this.currentUser;
    }

    public ObjectData[] getEmbeddedObjects() {
        if (this._objects == null) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                Record[] recordArr = this._records;
                if (i10 >= recordArr.length) {
                    break;
                }
                Record record = recordArr[i10];
                if (record instanceof ExOleObjStg) {
                    arrayList.add(new ObjectData((ExOleObjStg) record));
                }
                i10++;
            }
            this._objects = (ObjectData[]) arrayList.toArray(new ObjectData[arrayList.size()]);
        }
        return this._objects;
    }

    public PictureData[] getPictures() {
        if (this._pictures == null) {
            try {
                readPictures();
            } catch (IOException e10) {
                throw new CorruptPowerPointFileException(e10.getMessage());
            } catch (OutOfMemoryError e11) {
                e11.toString();
                this.control.o().c().a(true, e11);
                this.control.r(23, Boolean.TRUE);
                this.control = null;
            }
        }
        List<PictureData> list = this._pictures;
        if (list == null) {
            return null;
        }
        return (PictureData[]) list.toArray(new PictureData[list.size()]);
    }

    public Record[] getRecords() {
        return this._records;
    }

    public byte[] getUnderlyingBytes() {
        return this._docstream;
    }

    private void readOtherStreams() {
    }
}
