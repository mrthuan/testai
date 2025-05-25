package lib.zj.office.fc.hslf.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.hslf.record.ExHyperlink;
import lib.zj.office.fc.hslf.record.ExObjList;
import lib.zj.office.fc.hslf.record.InteractiveInfo;
import lib.zj.office.fc.hslf.record.InteractiveInfoAtom;
import lib.zj.office.fc.hslf.record.Record;
import lib.zj.office.fc.hslf.record.TxInteractiveInfoAtom;

/* loaded from: classes3.dex */
public final class Hyperlink {
    public static final byte LINK_FIRSTSLIDE = 2;
    public static final byte LINK_LASTSLIDE = 3;
    public static final byte LINK_NEXTSLIDE = 0;
    public static final byte LINK_NULL = -1;
    public static final byte LINK_PREVIOUSSLIDE = 1;
    public static final byte LINK_URL = 8;
    private String address;
    private int endIndex;

    /* renamed from: id  reason: collision with root package name */
    private int f20663id = -1;
    private int startIndex;
    private String title;
    private int type;

    public static Hyperlink[] find(TextRun textRun) {
        ArrayList arrayList = new ArrayList();
        ExObjList exObjList = textRun.getSheet().getSlideShow().getDocumentRecord().getExObjList();
        if (exObjList == null) {
            return null;
        }
        Record[] recordArr = textRun._records;
        if (recordArr != null) {
            find(recordArr, exObjList, arrayList);
        }
        if (arrayList.size() > 0) {
            Hyperlink[] hyperlinkArr = new Hyperlink[arrayList.size()];
            arrayList.toArray(hyperlinkArr);
            return hyperlinkArr;
        }
        return null;
    }

    public String getAddress() {
        return this.address;
    }

    public int getEndIndex() {
        return this.endIndex;
    }

    public int getId() {
        return this.f20663id;
    }

    public int getStartIndex() {
        return this.startIndex;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setId(int i10) {
        this.f20663id = i10;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i10) {
        this.type = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        this.title = "";
                        this.address = "";
                        return;
                    }
                    this.title = "LAST";
                    this.address = "1,-1,LAST";
                    return;
                }
                this.title = "FIRST";
                this.address = "1,-1,FIRST";
                return;
            }
            this.title = "PREV";
            this.address = "1,-1,PREV";
            return;
        }
        this.title = "NEXT";
        this.address = "1,-1,NEXT";
    }

    public static Hyperlink find(Shape shape) {
        ArrayList arrayList = new ArrayList();
        ExObjList exObjList = shape.getSheet().getSlideShow().getDocumentRecord().getExObjList();
        if (exObjList == null) {
            return null;
        }
        Iterator<EscherRecord> childIterator = shape.getSpContainer().getChildIterator();
        while (childIterator.hasNext()) {
            EscherRecord next = childIterator.next();
            if (next.getRecordId() == -4079) {
                byte[] serialize = next.serialize();
                Record[] findChildRecords = Record.findChildRecords(serialize, 8, serialize.length - 8);
                if (findChildRecords != null) {
                    find(findChildRecords, exObjList, arrayList);
                }
            }
        }
        if (arrayList.size() == 1) {
            return (Hyperlink) arrayList.get(0);
        }
        return null;
    }

    private static void find(Record[] recordArr, ExObjList exObjList, List list) {
        int i10 = 0;
        while (i10 < recordArr.length) {
            Record record = recordArr[i10];
            if (record instanceof InteractiveInfo) {
                InteractiveInfoAtom interactiveInfoAtom = ((InteractiveInfo) record).getInteractiveInfoAtom();
                ExHyperlink exHyperlink = exObjList.get(interactiveInfoAtom.getHyperlinkID());
                if (exHyperlink != null) {
                    Hyperlink hyperlink = new Hyperlink();
                    hyperlink.title = exHyperlink.getLinkTitle();
                    hyperlink.address = exHyperlink.getLinkURL();
                    hyperlink.type = interactiveInfoAtom.getAction();
                    i10++;
                    if (i10 < recordArr.length) {
                        Record record2 = recordArr[i10];
                        if (record2 instanceof TxInteractiveInfoAtom) {
                            TxInteractiveInfoAtom txInteractiveInfoAtom = (TxInteractiveInfoAtom) record2;
                            hyperlink.startIndex = txInteractiveInfoAtom.getStartIndex();
                            hyperlink.endIndex = txInteractiveInfoAtom.getEndIndex();
                        }
                    }
                    list.add(hyperlink);
                }
            }
            i10++;
        }
    }
}
